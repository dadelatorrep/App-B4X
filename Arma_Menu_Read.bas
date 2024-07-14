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
	Private armaAPI As ArmaService
	Private listRead As ListView
	Private listTipoArma As List
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("Menu_Arma_Read")
	armaAPI.Initialize("https://6633cce1f7d50bbd9b4ab447.mockapi.io")
	tipoArmaAPI.Initialize("https://6633cce1f7d50bbd9b4ab447.mockapi.io")
	listTipoArma.Initialize
	Dim rs As ResumableSub = CargarTiposArma
	Wait For (rs) Complete (list As List)
	listTipoArma.AddAll(list)
	CargarArmas
	ConfigurarListView
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.


Private Sub CargarArmas
	Try
		Dim nombreTipoArma As String
	    Dim rs As ResumableSub = armaAPI.GetArmasAsync
	    Wait For (rs) Complete (armas As List)
	    If armas <> Null Then
	        listRead.Clear
	        For Each armaMap As Map In armas
	            Dim armaFila As Arma
	            armaFila.Initialize
	            armaFila.nombre = armaMap.Get("nombre")
	            armaFila.descripcion = armaMap.Get("descripcion")
	            armaFila.rareza = armaMap.Get("rareza")
	            armaFila.atk = armaMap.Get("atk")
	            armaFila.crit_Dmg = armaMap.Get("crit_Dmg")
	            armaFila.cantidad = armaMap.Get("cantidad")
	            armaFila.id = armaMap.Get("id")
	            armaFila.Tipo_ArmaId = armaMap.Get("Tipo_ArmaId")
				nombreTipoArma = NombreTipoArmaById(armaFila.Tipo_ArmaId)
	            Dim itemText As String
	            itemText = $"Tipo: ${nombreTipoArma}, Cantidad: ${armaFila.cantidad}"$
	            listRead.AddTwoLines2(armaFila.nombre, itemText, armaFila)
	        Next
	    Else
	        xui.MsgboxAsync("Error al obtener la lista de armas", "Error")
		End If
	Catch
		Log(LastException)
		xui.MsgboxAsync("Error try al obtener la lista de armas ", "Error")
	End Try
End Sub

' Configurar el tamaño de la fila del ListView
Private Sub ConfigurarListView
	listRead.TwoLinesLayout.ItemHeight = 100dip
	listRead.TwoLinesLayout.Label.TextSize = 20
	listRead.TwoLinesLayout.Label.TextColor = Colors.White
	listRead.TwoLinesLayout.SecondLabel.TextSize = 16
	listRead.TwoLinesLayout.SecondLabel.TextColor = Colors.Gray
End Sub

Public Sub ActulizarPagina
	CargarArmas
End Sub

Private Sub CargarTiposArma As ResumableSub
	Log("Metodo cargar Tipos de Arma")
	Dim list As List
	list.Initialize
	Dim nombreTipoArma As String
	Dim rs As ResumableSub = tipoArmaAPI.GetTiposArmaAsync
	Wait For (rs) Complete (tiposArma As List)
	
	If tiposArma <> Null Then
		For Each tipoArmaMap As Map In tiposArma
			nombreTipoArma = ""
			Dim tipoArmaFila As TipoArma
			tipoArmaFila.Initialize
			tipoArmaFila.nombre = tipoArmaMap.Get("Nombre")
			tipoArmaFila.id = tipoArmaMap.Get("Id")
			nombreTipoArma = tipoArmaFila.nombre
			list.Add(nombreTipoArma)
		Next
		Log("Tamaño de la Lista: " & listTipoArma.Size)
		Return list
	Else
		xui.MsgboxAsync("Error al obtener la lista de armas", "Error")
		Return Null
	End If

End Sub

Public Sub NombreTipoArmaById(idTipoArma As Int) As String
	Return listTipoArma.Get(idTipoArma - 1)
End Sub