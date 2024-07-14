B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
' Clase ServicioUsuario
Sub Class_Globals
	Private API_URL As String
End Sub

Public Sub Initialize(Url As String)
	API_URL = Url
End Sub

Public Sub BuscarUsuario(username As String) As ResumableSub
	Dim job As HttpJob
	job.Initialize("BuscarUsuario", Me)
	job.Download(API_URL & "?search=" & username)
	Wait For (job) JobDone(job As HttpJob)
	If job.Success Then
		Dim parser As JSONParser
		parser.Initialize(job.GetString)
		Dim users As List = parser.NextArray
		If users.Size > 0 Then
			Dim userMap As Map = users.Get(0)
			Dim usuarioClass As Usuario
			usuarioClass.Initialize
			usuarioClass.user = userMap.Get("user")
			usuarioClass.password = userMap.Get("password")
			usuarioClass.id = userMap.Get("id")
			job.Release
			Return usuarioClass
		End If
	End If
	job.Release
	Return Null
End Sub

Public Sub VerificarCredenciales(username As String, password As String) As ResumableSub
	Dim rs As ResumableSub = BuscarUsuario(username)
	Wait For (rs) Complete (usuarioClass As Usuario)
	If usuarioClass <> Null And usuarioClass.password = password Then
		Return True
	Else
		Return False
	End If
End Sub
