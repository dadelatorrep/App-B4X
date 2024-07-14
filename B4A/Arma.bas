B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Public nombre As String
	Public descripcion As String
	Public rareza As Int
	Public atk As Int
	Public crit_Dmg As Double
	Public cantidad As Int
	Public id  As String
	Public Tipo_ArmaId As String
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

Public Sub ToMap As Map
	Dim m As Map
	m.Initialize
	m.Put("nombre", nombre)
	m.Put("descripcion", descripcion)
	m.Put("rareza", rareza)
	m.Put("atk", atk)
	m.Put("crit_Dmg", crit_Dmg)
	m.Put("cantidad", cantidad)
	m.Put("Tipo_ArmaId", Tipo_ArmaId)
	Return m
End Sub