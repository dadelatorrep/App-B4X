B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
' Clase ArmaService
Sub Class_Globals
	Private API_URL As String
End Sub

Public Sub Initialize(apiUrl As String)
	API_URL = apiUrl
End Sub

' Método para enviar una nueva arma a la API
Public Sub PostArmaAsync(content As Map) As ResumableSub
	Dim job As HttpJob
	Dim json As String
	Dim jsonGenerator As JSONGenerator
	job.Initialize("PostArma", Me)
	jsonGenerator.Initialize(content)
	json = jsonGenerator.ToPrettyString(2)
	job.PostString(API_URL & "/Arma", json)
	job.GetRequest.SetContentType("application/json")
	Wait For (job) JobDone(job As HttpJob)
	If job.Success Then
		Log(job.GetString)
		Return True
	Else
		Log("Error: " & job.ErrorMessage)
		job.Release
		Return False
	End If
End Sub

' Método para actualizar una arma existente en la API
Public Sub PutArmaAsync(id As String, content As Map) As ResumableSub
	Dim job As HttpJob
	Dim url As String = API_URL & "/Arma/" & id
	Dim json As String
	Dim jsonGenerator As JSONGenerator
	job.Initialize("PutArma", Me)
	jsonGenerator.Initialize(content)
	json = jsonGenerator.ToPrettyString(2)
	job.PutString(url, json)
	job.GetRequest.SetContentType("application/json")
	Wait For (job) JobDone(job As HttpJob)
	If job.Success Then
		Log(job.GetString)
		Return True
	Else
		Log("Error: " & job.ErrorMessage)
		job.Release
		Return False
	End If
End Sub

' Método para buscar armas por nombre
Public Sub BuscarArmasPorNombreAsync(nombre As String) As ResumableSub
	Dim job As HttpJob
	Dim url As String = API_URL & "/Arma?nombre=" & nombre
	job.Initialize("BuscarArmasPorNombre", Me)
	job.Download(url)
	Wait For (job) JobDone(job As HttpJob)
	If job.Success Then
		Dim parser As JSONParser
		parser.Initialize(job.GetString)
		Dim armas As List = parser.NextArray
		Return armas
	Else
		Log("Error: " & job.ErrorMessage)
		job.Release
		Return Null
	End If
End Sub

' Método para buscar una arma por su ID
Public Sub BuscarArmaPorIdAsync(id As String) As ResumableSub
	Dim job As HttpJob
	Dim url As String = API_URL & "/Arma/" & id
	job.Initialize("BuscarArmaPorId", Me)
	job.Download(url)
	Wait For (job) JobDone(job As HttpJob)
	If job.Success Then
		Dim parser As JSONParser
		parser.Initialize(job.GetString)
		Dim armaClass As Map = parser.NextObject
		Return armaClass
	Else
		Log("Error: " & job.ErrorMessage)
		job.Release
		Return Null
	End If
End Sub

' Método para eliminar una arma existente en la API
Public Sub EliminarArmaAsync(tipoArmaId As String, armaId As String) As ResumableSub
	Dim job As HttpJob
	Dim url As String = API_URL & "/Tipo_Arma/" & tipoArmaId & "/Arma/" & armaId
	job.Initialize("EliminarArma", Me)
	job.Delete(url)
	Wait For (job) JobDone(job As HttpJob)
	If job.Success Then
		Return True
	Else
		Log("Error: " & job.ErrorMessage)
		job.Release
		Return False
	End If
End Sub

' Método para obtener todas las armas de la API
Public Sub GetArmasAsync() As ResumableSub
	Dim job As HttpJob
	job.Initialize("GetArmas", Me)
	job.Download(API_URL & "/Arma")
	Wait For (job) JobDone(job As HttpJob)
	If job.Success Then
		Dim parser As JSONParser
		parser.Initialize(job.GetString)
		Dim armas As List = parser.NextArray
		Return armas
	Else
		Log("Error: " & job.ErrorMessage)
		job.Release
		Return Null
	End If
End Sub

