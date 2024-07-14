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
	Private txtId As EditText
	Private txtNombre As EditText
	Private txtDescripcion As EditText
	Private spnRareza As Spinner
	Private txtAtk As EditText
	Private txtCritDmg As EditText
	Private txtCantidad As EditText
	Private spnTipoArma As Spinner
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("Menu_Arma_Update")
	armaAPI.Initialize("https://6633cce1f7d50bbd9b4ab447.mockapi.io")
	tipoArmaAPI.Initialize("https://6633cce1f7d50bbd9b4ab447.mockapi.io")
	'	Aqui se cargaran las listas
	spnRareza.AddAll(Array As String("1","2","3","4","5"))
	CargarTiposArma
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub CargarTiposArma
	Dim rs As ResumableSub = tipoArmaAPI.GetTiposArmaAsync
	Wait For (rs) Complete (tiposArma As List)
	If tiposArma <> Null Then
		Dim nombreTipoArma As String
		For Each tipoArmaMap As Map In tiposArma
			nombreTipoArma = ""
			Dim tipoArmaFila As TipoArma
			tipoArmaFila.Initialize
			tipoArmaFila.nombre = tipoArmaMap.Get("Nombre")
			tipoArmaFila.id = tipoArmaMap.Get("Id")
			nombreTipoArma = tipoArmaFila.nombre
			spnTipoArma.Add(nombreTipoArma)
		Next
	Else
		
		xui.MsgboxAsync("Error al obtener la lista de armas", "Error")
	End If
End Sub

Private Sub btnUpdate_Click
	If txtId.Text = "" Or txtNombre.Text = "" Or txtDescripcion.Text = "" Or txtAtk.Text = "" Or txtCritDmg.Text = "" Or txtCantidad.Text = "" Or spnRareza.SelectedIndex = -1 Or spnTipoArma.SelectedIndex = -1 Then
		xui.MsgboxAsync("Alguno de los campos esta vacio", "Error")
	Else
		Try
			Dim rs As ResumableSub = armaAPI.BuscarArmaPorIdAsync(txtId.Text)
			Wait For (rs) Complete (idSuccess As Map)
			
			If idSuccess = Null Then
				Log("Id no econtrado")
			Else
				Dim nombre, descripcion As String
				Dim rareza, atk, critDmg, cantidad, tipoArmaId, id As Int
				id = idSuccess.Get("id")
				nombre = txtNombre.Text
				descripcion = txtDescripcion.Text
				rareza = spnRareza.SelectedIndex + 1
				atk = txtAtk.Text
				critDmg = txtCritDmg.Text
				cantidad = txtCantidad.Text
				tipoArmaId = spnTipoArma.SelectedIndex + 1
			
			
			
				Dim m As Map
				m.Initialize
				m.Put("nombre", nombre)
				m.Put("descripcion", descripcion)
				m.Put("rareza", rareza)
				m.Put("atk", atk)
				m.Put("crit_Dmg", critDmg)
				m.Put("cantidad", cantidad)
				m.Put("Tipo_ArmaId", tipoArmaId)
			
				Dim rs As ResumableSub = armaAPI.PutArmaAsync(id,m)
				Wait For (rs) Complete (Success As Boolean)
				If Success Then
					xui.MsgboxAsync("Tipo de arma actulizada exitosamente", "Éxito")
				Else
					xui.MsgboxAsync("Error al actualizar el tipo de arma", "Error")
				End If
								
			End If

			
		Catch
			Log(LastException)
			xui.MsgboxAsync("Se produjo un error al actualizar el tipo de arma", "Error")
		End Try
	End If	
End Sub