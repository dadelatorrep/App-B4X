B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
' Clase TipoArmaService
Sub Class_Globals
	Private API_URL As String

End Sub

Public Sub Initialize(apiUrl As String)
	API_URL = apiUrl
End Sub

' Método para enviar un nuevo tipo de arma a la API
Public Sub PostTipoArmaAsync(content As Map) As ResumableSub
	Dim job As HttpJob
	Dim json As String
	Dim jsonGenerator As JSONGenerator
	job.Initialize("PostTipoArma", Me)
	jsonGenerator.Initialize(content)
	json = jsonGenerator.ToPrettyString(2)
	job.PostString(API_URL & "/Tipo_Arma", json)
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

' Método para actualizar un tipo de arma existente en la API
Public Sub PutTipoArmaAsync(id As String, content As Map) As ResumableSub
	Dim job As HttpJob
	Dim url As String = API_URL & "/Tipo_Arma/" & id
	Dim json As String
	Dim jsonGenerator As JSONGenerator
	job.Initialize("PutTipoArma", Me)
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

' Método para buscar tipos de armas por nombre
Public Sub BuscarTiposArmaPorNombreAsync(nombre As String) As ResumableSub
	Dim job As HttpJob
	Dim url As String = API_URL & "/Tipo_Arma?nombre=" & nombre
	job.Initialize("BuscarTiposArmaPorNombre", Me)
	job.Download(url)
	Wait For (job) JobDone(job As HttpJob)
	If job.Success Then
		Dim parser As JSONParser
		parser.Initialize(job.GetString)
		Dim tiposArma As List = parser.NextArray
		Return tiposArma
	Else
		Log("Error: " & job.ErrorMessage)
		job.Release
		Return Null
	End If
End Sub

' Método para buscar un tipo de arma por su ID
Public Sub BuscarTipoArmaPorIdAsync(id As String) As ResumableSub
	Dim job As HttpJob
	Dim url As String = API_URL & "/Tipo_Arma/" & id
	job.Initialize("BuscarTipoArmaPorId", Me)
	job.Download(url)
	Wait For (job) JobDone(job As HttpJob)
	If job.Success Then
		Dim parser As JSONParser
		parser.Initialize(job.GetString)
		Dim tipoArmaClass As Map = parser.NextObject
		Return tipoArmaClass
	Else
		Log("Error: " & job.ErrorMessage)
		job.Release
		Return Null
	End If
End Sub

' Método para eliminar un tipo de arma existente en la API
Public Sub EliminarTipoArmaAsync(id As String) As ResumableSub
	Dim job As HttpJob
	Dim url As String = API_URL & "/Tipo_Arma/" & id
	job.Initialize("EliminarTipoArma", Me)
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

' Método para obtener todos los tipos de armas de la API
Public Sub GetTiposArmaAsync() As ResumableSub
	Dim job As HttpJob
	job.Initialize("GetTiposArma", Me)
	job.Download(API_URL & "/Tipo_Arma")
	Wait For (job) JobDone(job As HttpJob)
	If job.Success Then
		Dim parser As JSONParser
		parser.Initialize(job.GetString)
		Dim tiposArma As List = parser.NextArray
		Return tiposArma
	Else
		Log("Error: " & job.ErrorMessage)
		job.Release
		Return Null
	End If
End Sub



