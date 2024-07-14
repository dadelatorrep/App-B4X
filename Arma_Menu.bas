B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private imgCreate As ImageView
	Private imgRead As ImageView
	Private imgUpdate As ImageView
	Private imgDelete As ImageView
	Private createArma As Arma_Menu_Create
	Private readArma As Arma_Menu_Read
	Private updateArma As Arma_Menu_Update
	Private deleteArma As Arma_Menu_Delete
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("Menu_Arma")
	imgCreate.Bitmap = LoadBitmap(File.DirAssets,"swords.png")
	imgRead.Bitmap = LoadBitmap(File.DirAssets,"book.png")
	imgUpdate.Bitmap = LoadBitmap(File.DirAssets,"edit.png")
	imgDelete.Bitmap = LoadBitmap(File.DirAssets,"delete.png")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub pnlCreate_Click
	Log("CREATE ARMA")
	' Navegar a la página Menu_Tipo_Arma
	If createArma.IsInitialized = False Then
		createArma.Initialize
		B4XPages.AddPageAndCreate("Arma_Menu_Create", createArma)
	End If
	B4XPages.ShowPage("Arma_Menu_Create")
End Sub

Private Sub pnlRead_Click
	Log("READ ARMA")
	If readArma.IsInitialized = True Then
		readArma.ActulizarPagina
	End If
	' Navegar a la página Menu_Tipo_Arma
	If readArma.IsInitialized = False Then
		readArma.Initialize
		B4XPages.AddPageAndCreate("Arma_Menu_Read", readArma)
	End If
	B4XPages.ShowPage("Arma_Menu_Read")
End Sub

Private Sub pnlUpdate_Click
	Log("UPDATE ARMA")
	' Navegar a la página Menu_Tipo_Arma
	If updateArma.IsInitialized = False Then
		updateArma.Initialize
		B4XPages.AddPageAndCreate("Arma_Menu_Update", updateArma)
	End If
	B4XPages.ShowPage("Arma_Menu_Update")
End Sub

Private Sub pnlDelete_Click
	Log("DELETE ARMA")
	' Navegar a la página Arma_Eliminar
	If deleteArma.IsInitialized = False Then
		deleteArma.Initialize
		B4XPages.AddPageAndCreate("Arma_Menu_Delete", deleteArma)
	End If
	B4XPages.ShowPage("Arma_Menu_Delete")
End Sub