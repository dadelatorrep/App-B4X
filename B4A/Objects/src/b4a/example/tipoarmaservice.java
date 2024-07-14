package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class tipoarmaservice extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.tipoarmaservice");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.tipoarmaservice.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _api_url = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _buscartipoarmaporidasync(String _id) throws Exception{
ResumableSub_BuscarTipoArmaPorIdAsync rsub = new ResumableSub_BuscarTipoArmaPorIdAsync(this,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BuscarTipoArmaPorIdAsync extends BA.ResumableSub {
public ResumableSub_BuscarTipoArmaPorIdAsync(b4a.example.tipoarmaservice parent,String _id) {
this.parent = parent;
this._id = _id;
}
b4a.example.tipoarmaservice parent;
String _id;
b4a.example.httpjob _job = null;
String _url = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _tipoarmaclass = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 75;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 76;BA.debugLine="Dim url As String = API_URL & \"/Tipo_Arma/\" & id";
_url = parent._api_url+"/Tipo_Arma/"+_id;
 //BA.debugLineNum = 77;BA.debugLine="job.Initialize(\"BuscarTipoArmaPorId\", Me)";
_job._initialize /*String*/ (ba,"BuscarTipoArmaPorId",parent);
 //BA.debugLineNum = 78;BA.debugLine="job.Download(url)";
_job._download /*String*/ (_url);
 //BA.debugLineNum = 79;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 80;BA.debugLine="If job.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 81;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 82;BA.debugLine="parser.Initialize(job.GetString)";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 83;BA.debugLine="Dim tipoArmaClass As Map = parser.NextObject";
_tipoarmaclass = new anywheresoftware.b4a.objects.collections.Map();
_tipoarmaclass = _parser.NextObject();
 //BA.debugLineNum = 84;BA.debugLine="Return tipoArmaClass";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_tipoarmaclass));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 86;BA.debugLine="Log(\"Error: \" & job.ErrorMessage)";
parent.__c.LogImpl("714024716","Error: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 87;BA.debugLine="job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 88;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(b4a.example.httpjob _job) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _buscartiposarmapornombreasync(String _nombre) throws Exception{
ResumableSub_BuscarTiposArmaPorNombreAsync rsub = new ResumableSub_BuscarTiposArmaPorNombreAsync(this,_nombre);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BuscarTiposArmaPorNombreAsync extends BA.ResumableSub {
public ResumableSub_BuscarTiposArmaPorNombreAsync(b4a.example.tipoarmaservice parent,String _nombre) {
this.parent = parent;
this._nombre = _nombre;
}
b4a.example.tipoarmaservice parent;
String _nombre;
b4a.example.httpjob _job = null;
String _url = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _tiposarma = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 56;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 57;BA.debugLine="Dim url As String = API_URL & \"/Tipo_Arma?nombre=";
_url = parent._api_url+"/Tipo_Arma?nombre="+_nombre;
 //BA.debugLineNum = 58;BA.debugLine="job.Initialize(\"BuscarTiposArmaPorNombre\", Me)";
_job._initialize /*String*/ (ba,"BuscarTiposArmaPorNombre",parent);
 //BA.debugLineNum = 59;BA.debugLine="job.Download(url)";
_job._download /*String*/ (_url);
 //BA.debugLineNum = 60;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 61;BA.debugLine="If job.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 62;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 63;BA.debugLine="parser.Initialize(job.GetString)";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 64;BA.debugLine="Dim tiposArma As List = parser.NextArray";
_tiposarma = new anywheresoftware.b4a.objects.collections.List();
_tiposarma = _parser.NextArray();
 //BA.debugLineNum = 65;BA.debugLine="Return tiposArma";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_tiposarma));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 67;BA.debugLine="Log(\"Error: \" & job.ErrorMessage)";
parent.__c.LogImpl("713959180","Error: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 68;BA.debugLine="job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 69;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private API_URL As String";
_api_url = "";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _eliminartipoarmaasync(String _id) throws Exception{
ResumableSub_EliminarTipoArmaAsync rsub = new ResumableSub_EliminarTipoArmaAsync(this,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EliminarTipoArmaAsync extends BA.ResumableSub {
public ResumableSub_EliminarTipoArmaAsync(b4a.example.tipoarmaservice parent,String _id) {
this.parent = parent;
this._id = _id;
}
b4a.example.tipoarmaservice parent;
String _id;
b4a.example.httpjob _job = null;
String _url = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 94;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 95;BA.debugLine="Dim url As String = API_URL & \"/Tipo_Arma/\" & id";
_url = parent._api_url+"/Tipo_Arma/"+_id;
 //BA.debugLineNum = 96;BA.debugLine="job.Initialize(\"EliminarTipoArma\", Me)";
_job._initialize /*String*/ (ba,"EliminarTipoArma",parent);
 //BA.debugLineNum = 97;BA.debugLine="job.Delete(url)";
_job._delete /*String*/ (_url);
 //BA.debugLineNum = 98;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 99;BA.debugLine="If job.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 100;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 102;BA.debugLine="Log(\"Error: \" & job.ErrorMessage)";
parent.__c.LogImpl("714090249","Error: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 103;BA.debugLine="job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 104;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _gettiposarmaasync() throws Exception{
ResumableSub_GetTiposArmaAsync rsub = new ResumableSub_GetTiposArmaAsync(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetTiposArmaAsync extends BA.ResumableSub {
public ResumableSub_GetTiposArmaAsync(b4a.example.tipoarmaservice parent) {
this.parent = parent;
}
b4a.example.tipoarmaservice parent;
b4a.example.httpjob _job = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _tiposarma = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 110;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 111;BA.debugLine="job.Initialize(\"GetTiposArma\", Me)";
_job._initialize /*String*/ (ba,"GetTiposArma",parent);
 //BA.debugLineNum = 112;BA.debugLine="job.Download(API_URL & \"/Tipo_Arma\")";
_job._download /*String*/ (parent._api_url+"/Tipo_Arma");
 //BA.debugLineNum = 113;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 114;BA.debugLine="If job.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 115;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 116;BA.debugLine="parser.Initialize(job.GetString)";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 117;BA.debugLine="Dim tiposArma As List = parser.NextArray";
_tiposarma = new anywheresoftware.b4a.objects.collections.List();
_tiposarma = _parser.NextArray();
 //BA.debugLineNum = 118;BA.debugLine="Return tiposArma";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_tiposarma));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 120;BA.debugLine="Log(\"Error: \" & job.ErrorMessage)";
parent.__c.LogImpl("714155787","Error: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 121;BA.debugLine="job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 122;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _apiurl) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize(apiUrl As String)";
 //BA.debugLineNum = 8;BA.debugLine="API_URL = apiUrl";
_api_url = _apiurl;
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _posttipoarmaasync(anywheresoftware.b4a.objects.collections.Map _content) throws Exception{
ResumableSub_PostTipoArmaAsync rsub = new ResumableSub_PostTipoArmaAsync(this,_content);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PostTipoArmaAsync extends BA.ResumableSub {
public ResumableSub_PostTipoArmaAsync(b4a.example.tipoarmaservice parent,anywheresoftware.b4a.objects.collections.Map _content) {
this.parent = parent;
this._content = _content;
}
b4a.example.tipoarmaservice parent;
anywheresoftware.b4a.objects.collections.Map _content;
b4a.example.httpjob _job = null;
String _json = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 13;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 14;BA.debugLine="Dim json As String";
_json = "";
 //BA.debugLineNum = 15;BA.debugLine="Dim jsonGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 16;BA.debugLine="job.Initialize(\"PostTipoArma\", Me)";
_job._initialize /*String*/ (ba,"PostTipoArma",parent);
 //BA.debugLineNum = 17;BA.debugLine="jsonGenerator.Initialize(content)";
_jsongenerator.Initialize(_content);
 //BA.debugLineNum = 18;BA.debugLine="json = jsonGenerator.ToPrettyString(2)";
_json = _jsongenerator.ToPrettyString((int) (2));
 //BA.debugLineNum = 19;BA.debugLine="job.PostString(API_URL & \"/Tipo_Arma\", json)";
_job._poststring /*String*/ (parent._api_url+"/Tipo_Arma",_json);
 //BA.debugLineNum = 20;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 21;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 22;BA.debugLine="If job.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 23;BA.debugLine="Log(job.GetString)";
parent.__c.LogImpl("713828107",_job._getstring /*String*/ (),0);
 //BA.debugLineNum = 24;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 26;BA.debugLine="Log(\"Error: \" & job.ErrorMessage)";
parent.__c.LogImpl("713828110","Error: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 27;BA.debugLine="job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 28;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _puttipoarmaasync(String _id,anywheresoftware.b4a.objects.collections.Map _content) throws Exception{
ResumableSub_PutTipoArmaAsync rsub = new ResumableSub_PutTipoArmaAsync(this,_id,_content);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PutTipoArmaAsync extends BA.ResumableSub {
public ResumableSub_PutTipoArmaAsync(b4a.example.tipoarmaservice parent,String _id,anywheresoftware.b4a.objects.collections.Map _content) {
this.parent = parent;
this._id = _id;
this._content = _content;
}
b4a.example.tipoarmaservice parent;
String _id;
anywheresoftware.b4a.objects.collections.Map _content;
b4a.example.httpjob _job = null;
String _url = "";
String _json = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 34;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 35;BA.debugLine="Dim url As String = API_URL & \"/Tipo_Arma/\" & id";
_url = parent._api_url+"/Tipo_Arma/"+_id;
 //BA.debugLineNum = 36;BA.debugLine="Dim json As String";
_json = "";
 //BA.debugLineNum = 37;BA.debugLine="Dim jsonGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 38;BA.debugLine="job.Initialize(\"PutTipoArma\", Me)";
_job._initialize /*String*/ (ba,"PutTipoArma",parent);
 //BA.debugLineNum = 39;BA.debugLine="jsonGenerator.Initialize(content)";
_jsongenerator.Initialize(_content);
 //BA.debugLineNum = 40;BA.debugLine="json = jsonGenerator.ToPrettyString(2)";
_json = _jsongenerator.ToPrettyString((int) (2));
 //BA.debugLineNum = 41;BA.debugLine="job.PutString(url, json)";
_job._putstring /*String*/ (_url,_json);
 //BA.debugLineNum = 42;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 43;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 44;BA.debugLine="If job.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 45;BA.debugLine="Log(job.GetString)";
parent.__c.LogImpl("713893644",_job._getstring /*String*/ (),0);
 //BA.debugLineNum = 46;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 48;BA.debugLine="Log(\"Error: \" & job.ErrorMessage)";
parent.__c.LogImpl("713893647","Error: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 49;BA.debugLine="job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 50;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
