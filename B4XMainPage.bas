B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private Login As B4XView
	Private txtUsername As EditText
	Private txtPassword As EditText
	Private btnLogin As Button
	Private usuarioAPI As UsuarioService
	Private menuGeneral As Menu_General
	Private imgLogin As ImageView
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
	usuarioAPI.Initialize("https://6637fc174253a866a24c8af3.mockapi.io/Usuario")
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	imgLogin.Bitmap = LoadBitmap(File.DirAssets,"login.png")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub LimpiarCampos
	txtUsername.Text = ""
	txtPassword.Text = ""
End Sub

Private Sub btnLogin_Click
	Try
		If txtUsername.Text = "" Or txtPassword.Text = "" Then	
			xui.MsgboxAsync("Las credenciales estan vacias", "Error")
		Else
			Dim username As String = txtUsername.Text
			Dim password As String = txtPassword.Text

			If menuGeneral.IsInitialized = False Then
				menuGeneral.Initialize
				B4XPages.AddPageAndCreate("Menu_General", menuGeneral)
			End If
            
			' Verificar las credenciales usando UsuarioService
			Dim rs As ResumableSub = usuarioAPI.VerificarCredenciales(username, password)
			Wait For (rs) Complete (credencialesValidas As Boolean)
            
			If credencialesValidas Then
				xui.MsgboxAsync("Inicio de sesión exitoso", "Éxito")
				' Navegar a la siguiente página
				B4XPages.ShowPage("Menu_General")
			Else
				xui.MsgboxAsync("Error en las credenciales", "Error")
				LimpiarCampos
			End If
			
		End If
	Catch
		Log(LastException)
		xui.MsgboxAsync("Se produjo un error al iniciar sesión", "Error")
	End Try
End Sub

