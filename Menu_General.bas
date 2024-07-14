B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private menu_Arma As Arma_Menu
	Private menu_TipoArma As TipoArma_Menu
	Private imgTipo_Arma As ImageView
	Private imgArma As ImageView
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("Menu_General")
	imgTipo_Arma.Bitmap = LoadBitmap(File.DirAssets,"blacksmith.png")
	imgArma.Bitmap = LoadBitmap(File.DirAssets,"swords_shield.png")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Tipo_Arma_Click
	Log("Tipo_Arma_Menu")
	' Navegar a la página Arma_Menu
	If menu_TipoArma.IsInitialized = False Then
		menu_TipoArma.Initialize
		B4XPages.AddPageAndCreate("Menu_TipoArma", menu_TipoArma)
	End If
	B4XPages.ShowPage("Menu_TipoArma")
End Sub

Private Sub Arma_Click
	Log("Arma_Menu")

	' Navegar a la página Menu_Tipo_Arma
	If menu_Arma.IsInitialized = False Then
		menu_Arma.Initialize
		B4XPages.AddPageAndCreate("Menu_Arma", menu_Arma)
	End If
	B4XPages.ShowPage("Menu_Arma")
End Sub