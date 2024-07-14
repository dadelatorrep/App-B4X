B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private armaAPI As ArmaService
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("Menu_Arma_Create")
	armaAPI.Initialize("https://6633cce1f7d50bbd9b4ab447.mockapi.io")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.