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
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("Menu_TipoArma_Delete")
	tipoArmaAPI.Initialize("https://6633cce1f7d50bbd9b4ab447.mockapi.io")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub btnDelete_Click	
	If txtId.Text = "" Then
		xui.MsgboxAsync("Alguno de los campos esta vacio", "Error")
	Else
		Try
			Dim id As Int
			id = txtId.Text
			Dim m As Map
			m.Initialize
			m.Put("Id", id)
			Log("Id:" & id)
			Dim rs As ResumableSub = tipoArmaAPI.EliminarTipoArmaAsync(id)
			Wait For (rs) Complete (Success As String)
			If Success Then
				xui.MsgboxAsync("Tipo de arma eliminada exitosamente", "Éxito")
			Else
				xui.MsgboxAsync("Error al eliminar el tipo de arma", "Error")
			End If
		Catch
			Log(LastException)
			xui.MsgboxAsync("Se produjo un error al eliminar el tipo de arma", "Error")
		End Try
	End If
End Sub