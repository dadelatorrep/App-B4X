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
	Private listRead As ListView
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("Menu_TipoArma_Read")
	tipoArmaAPI.Initialize("https://6633cce1f7d50bbd9b4ab447.mockapi.io")
	CargarArmas
	ConfigurarListView
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub CargarArmas
	Try
		Dim rs As ResumableSub = tipoArmaAPI.GetTiposArmaAsync
		Wait For (rs) Complete (tiposArma As List)
		If tiposArma <> Null Then
			listRead.Clear
			For Each tipoArmaMap As Map In tiposArma
				Dim tipoArmaFila As TipoArma
				tipoArmaFila.Initialize
				tipoArmaFila.id = tipoArmaMap.Get("Id")
				tipoArmaFila.nombre = tipoArmaMap.Get("Nombre")			
				listRead.AddSingleLine2(tipoArmaFila.Nombre, tipoArmaFila)
			Next
		Else
			xui.MsgboxAsync("Error al obtener la lista de tipos de arma", "Error")
			End If
	Catch
		Log(LastException)
		xui.MsgboxAsync("Error try al obtener la lista de tipos de arma ", "Error")
	End Try
End Sub

' Configurar el tamaño de la fila del ListView
Private Sub ConfigurarListView
	listRead.SingleLineLayout.ItemHeight = 100dip
	listRead.SingleLineLayout.Label.TextSize = 20
	listRead.SingleLineLayout.Label.TextColor = Colors.White
End Sub

Public Sub ActulizarPagina
	CargarArmas
End Sub