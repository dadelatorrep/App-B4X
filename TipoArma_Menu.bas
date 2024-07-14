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
	Private tipoArmaCreate As TipoArma_Menu_Create
	Private tipoArmaRead As TipoArma_Menu_Read
	Private tipoArmaUpdate As TipoArma_Menu_Update
	Private tipoArmaDelete As TipoArma_Menu_Delete
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("Menu_TipoArma")
	imgCreate.Bitmap = LoadBitmap(File.DirAssets,"swords.png")
	imgRead.Bitmap = LoadBitmap(File.DirAssets,"book.png")
	imgUpdate.Bitmap = LoadBitmap(File.DirAssets,"edit.png")
	imgDelete.Bitmap = LoadBitmap(File.DirAssets,"delete.png")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub pnlCreate_Click
	Log("CREATE TIPOARMA")
	' Navegar a la página Menu_Tipo_Arma
	If tipoArmaCreate.IsInitialized = False Then
		tipoArmaCreate.Initialize
		B4XPages.AddPageAndCreate("Menu_TipoArma_Create",  tipoArmaCreate)
	End If
	B4XPages.ShowPage("Menu_TipoArma_Create")
End Sub

Private Sub pnlRead_Click
	Log("READ TIPOARMA")
	' Navegar a la página Tipo_Arma_Read
	If tipoArmaRead.IsInitialized = False Then
		tipoArmaRead.Initialize
		B4XPages.AddPageAndCreate("Menu_TipoArma_Read",  tipoArmaRead)
	End If
	
	If tipoArmaRead.IsInitialized = True Then
		tipoArmaRead.ActulizarPagina
	End If
	B4XPages.ShowPage("Menu_TipoArma_Read")
End Sub

Private Sub pnlUpdate_Click
	Log("UPDATE TIPOARMA")
	' Navegar a la página Tipo_Arma_Update
	If tipoArmaUpdate.IsInitialized = False Then
		tipoArmaUpdate.Initialize
		B4XPages.AddPageAndCreate("Menu_TipoArma_Update",  tipoArmaUpdate)
	End If
	B4XPages.ShowPage("Menu_TipoArma_Update")
End Sub

Private Sub pnlDelete_Click
	Log("DELETE TIPOARMA")
	' Navegar a la página Tipo_Arma_Delete
	If tipoArmaDelete.IsInitialized = False Then
		tipoArmaDelete.Initialize
		B4XPages.AddPageAndCreate("Menu_TipoArma_Delete",  tipoArmaDelete)
	End If
	B4XPages.ShowPage("Menu_TipoArma_Delete")
End Sub