B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private tipoArmaAPI As TipoArmaService
	Private txtId As EditText
	Private txtNombre As EditText
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("Menu_TipoArma_Update")
	tipoArmaAPI.Initialize("https://6633cce1f7d50bbd9b4ab447.mockapi.io")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub btnUpdate_Click
	
	If txtNombre.Text = "" Or txtId.Text = "" Then
		xui.MsgboxAsync("Alguno de los campos esta vacio", "Error")
	Else
		Try
			Dim id As Int
			Dim nombre As String
			id = txtId.Text
			nombre = txtNombre.Text
			Dim m As Map
			m.Initialize
			m.Put("Nombre", nombre)
			m.Put("Id", id)
			Log("Nombre:" & nombre)
			Log("Id:" & id)
			Dim rs As ResumableSub = tipoArmaAPI.PutTipoArmaAsync(id, m)
			Wait For (rs) Complete (Success As String)
			If Success Then
				xui.MsgboxAsync("Tipo de arma actulizada exitosamente", "Éxito")
			Else
				xui.MsgboxAsync("Error al actualizar el tipo de arma", "Error")
			End If
		Catch
			Log(LastException)
			xui.MsgboxAsync("Se produjo un error al actualizar el tipo de arma", "Error")
		End Try
	End If
End Sub