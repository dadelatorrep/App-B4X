package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class armaservice extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.armaservice");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.armaservice.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _buscararmaporidasync(String _id) throws Exception{
ResumableSub_BuscarArmaPorIdAsync rsub = new ResumableSub_BuscarArmaPorIdAsync(this,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BuscarArmaPorIdAsync extends BA.ResumableSub {
public ResumableSub_BuscarArmaPorIdAsync(b4a.example.armaservice parent,String _id) {
this.parent = parent;
this._id = _id;
}
b4a.example.armaservice parent;
String _id;
b4a.example.httpjob _job = null;
String _url = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _armaclass = null;

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
 //BA.debugLineNum = 74;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 75;BA.debugLine="Dim url As String = API_URL & \"/Arma/\" & id";
_url = parent._api_url+"/Arma/"+_id;
 //BA.debugLineNum = 76;BA.debugLine="job.Initialize(\"BuscarArmaPorId\", Me)";
_job._initialize /*String*/ (ba,"BuscarArmaPorId",parent);
 //BA.debugLineNum = 77;BA.debugLine="job.Download(url)";
_job._download /*String*/ (_url);
 //BA.debugLineNum = 78;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 79;BA.debugLine="If job.Success Then";
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
 //BA.debugLineNum = 80;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 81;BA.debugLine="parser.Initialize(job.GetString)";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 82;BA.debugLine="Dim armaClass As Map = parser.NextObject";
_armaclass = new anywheresoftware.b4a.objects.collections.Map();
_armaclass = _parser.NextObject();
 //BA.debugLineNum = 83;BA.debugLine="Return armaClass";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_armaclass));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 85;BA.debugLine="Log(\"Error: \" & job.ErrorMessage)";
parent.__c.LogImpl("713303820","Error: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 86;BA.debugLine="job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 87;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(b4a.example.httpjob _job) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _buscararmaspornombreasync(String _nombre) throws Exception{
ResumableSub_BuscarArmasPorNombreAsync rsub = new ResumableSub_BuscarArmasPorNombreAsync(this,_nombre);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BuscarArmasPorNombreAsync extends BA.ResumableSub {
public ResumableSub_BuscarArmasPorNombreAsync(b4a.example.armaservice parent,String _nombre) {
this.parent = parent;
this._nombre = _nombre;
}
b4a.example.armaservice parent;
String _nombre;
b4a.example.httpjob _job = null;
String _url = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _armas = null;

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
 //BA.debugLineNum = 55;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 56;BA.debugLine="Dim url As String = API_URL & \"/Arma?nombre=\" & n";
_url = parent._api_url+"/Arma?nombre="+_nombre;
 //BA.debugLineNum = 57;BA.debugLine="job.Initialize(\"BuscarArmasPorNombre\", Me)";
_job._initialize /*String*/ (ba,"BuscarArmasPorNombre",parent);
 //BA.debugLineNum = 58;BA.debugLine="job.Download(url)";
_job._download /*String*/ (_url);
 //BA.debugLineNum = 59;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 60;BA.debugLine="If job.Success Then";
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
 //BA.debugLineNum = 61;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 62;BA.debugLine="parser.Initialize(job.GetString)";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 63;BA.debugLine="Dim armas As List = parser.NextArray";
_armas = new anywheresoftware.b4a.objects.collections.List();
_armas = _parser.NextArray();
 //BA.debugLineNum = 64;BA.debugLine="Return armas";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_armas));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 66;BA.debugLine="Log(\"Error: \" & job.ErrorMessage)";
parent.__c.LogImpl("713238284","Error: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 67;BA.debugLine="job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 68;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private API_URL As String";
_api_url = "";
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _eliminararmaasync(String _tipoarmaid,String _armaid) throws Exception{
ResumableSub_EliminarArmaAsync rsub = new ResumableSub_EliminarArmaAsync(this,_tipoarmaid,_armaid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EliminarArmaAsync extends BA.ResumableSub {
public ResumableSub_EliminarArmaAsync(b4a.example.armaservice parent,String _tipoarmaid,String _armaid) {
this.parent = parent;
this._tipoarmaid = _tipoarmaid;
this._armaid = _armaid;
}
b4a.example.armaservice parent;
String _tipoarmaid;
String _armaid;
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
 //BA.debugLineNum = 93;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 94;BA.debugLine="Dim url As String = API_URL & \"/Tipo_Arma/\" & tip";
_url = parent._api_url+"/Tipo_Arma/"+_tipoarmaid+"/Arma/"+_armaid;
 //BA.debugLineNum = 95;BA.debugLine="job.Initialize(\"EliminarArma\", Me)";
_job._initialize /*String*/ (ba,"EliminarArma",parent);
 //BA.debugLineNum = 96;BA.debugLine="job.Delete(url)";
_job._delete /*String*/ (_url);
 //BA.debugLineNum = 97;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 98;BA.debugLine="If job.Success Then";
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
 //BA.debugLineNum = 99;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 101;BA.debugLine="Log(\"Error: \" & job.ErrorMessage)";
parent.__c.LogImpl("713369353","Error: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 102;BA.debugLine="job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 103;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getarmasasync() throws Exception{
ResumableSub_GetArmasAsync rsub = new ResumableSub_GetArmasAsync(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetArmasAsync extends BA.ResumableSub {
public ResumableSub_GetArmasAsync(b4a.example.armaservice parent) {
this.parent = parent;
}
b4a.example.armaservice parent;
b4a.example.httpjob _job = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _armas = null;

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
 //BA.debugLineNum = 109;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 110;BA.debugLine="job.Initialize(\"GetArmas\", Me)";
_job._initialize /*String*/ (ba,"GetArmas",parent);
 //BA.debugLineNum = 111;BA.debugLine="job.Download(API_URL & \"/Arma\")";
_job._download /*String*/ (parent._api_url+"/Arma");
 //BA.debugLineNum = 112;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 113;BA.debugLine="If job.Success Then";
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
 //BA.debugLineNum = 114;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 115;BA.debugLine="parser.Initialize(job.GetString)";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 116;BA.debugLine="Dim armas As List = parser.NextArray";
_armas = new anywheresoftware.b4a.objects.collections.List();
_armas = _parser.NextArray();
 //BA.debugLineNum = 117;BA.debugLine="Return armas";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_armas));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 119;BA.debugLine="Log(\"Error: \" & job.ErrorMessage)";
parent.__c.LogImpl("713434891","Error: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 120;BA.debugLine="job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 121;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _apiurl) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize(apiUrl As String)";
 //BA.debugLineNum = 7;BA.debugLine="API_URL = apiUrl";
_api_url = _apiurl;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _postarmaasync(anywheresoftware.b4a.objects.collections.Map _content) throws Exception{
ResumableSub_PostArmaAsync rsub = new ResumableSub_PostArmaAsync(this,_content);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PostArmaAsync extends BA.ResumableSub {
public ResumableSub_PostArmaAsync(b4a.example.armaservice parent,anywheresoftware.b4a.objects.collections.Map _content) {
this.parent = parent;
this._content = _content;
}
b4a.example.armaservice parent;
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
 //BA.debugLineNum = 12;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 13;BA.debugLine="Dim json As String";
_json = "";
 //BA.debugLineNum = 14;BA.debugLine="Dim jsonGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 15;BA.debugLine="job.Initialize(\"PostArma\", Me)";
_job._initialize /*String*/ (ba,"PostArma",parent);
 //BA.debugLineNum = 16;BA.debugLine="jsonGenerator.Initialize(content)";
_jsongenerator.Initialize(_content);
 //BA.debugLineNum = 17;BA.debugLine="json = jsonGenerator.ToPrettyString(2)";
_json = _jsongenerator.ToPrettyString((int) (2));
 //BA.debugLineNum = 18;BA.debugLine="job.PostString(API_URL & \"/Arma\", json)";
_job._poststring /*String*/ (parent._api_url+"/Arma",_json);
 //BA.debugLineNum = 19;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 20;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 21;BA.debugLine="If job.Success Then";
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
 //BA.debugLineNum = 22;BA.debugLine="Log(job.GetString)";
parent.__c.LogImpl("713107211",_job._getstring /*String*/ (),0);
 //BA.debugLineNum = 23;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 25;BA.debugLine="Log(\"Error: \" & job.ErrorMessage)";
parent.__c.LogImpl("713107214","Error: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 26;BA.debugLine="job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 27;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _putarmaasync(String _id,anywheresoftware.b4a.objects.collections.Map _content) throws Exception{
ResumableSub_PutArmaAsync rsub = new ResumableSub_PutArmaAsync(this,_id,_content);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PutArmaAsync extends BA.ResumableSub {
public ResumableSub_PutArmaAsync(b4a.example.armaservice parent,String _id,anywheresoftware.b4a.objects.collections.Map _content) {
this.parent = parent;
this._id = _id;
this._content = _content;
}
b4a.example.armaservice parent;
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
 //BA.debugLineNum = 33;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 34;BA.debugLine="Dim url As String = API_URL & \"/Arma/\" & id";
_url = parent._api_url+"/Arma/"+_id;
 //BA.debugLineNum = 35;BA.debugLine="Dim json As String";
_json = "";
 //BA.debugLineNum = 36;BA.debugLine="Dim jsonGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 37;BA.debugLine="job.Initialize(\"PutArma\", Me)";
_job._initialize /*String*/ (ba,"PutArma",parent);
 //BA.debugLineNum = 38;BA.debugLine="jsonGenerator.Initialize(content)";
_jsongenerator.Initialize(_content);
 //BA.debugLineNum = 39;BA.debugLine="json = jsonGenerator.ToPrettyString(2)";
_json = _jsongenerator.ToPrettyString((int) (2));
 //BA.debugLineNum = 40;BA.debugLine="job.PutString(url, json)";
_job._putstring /*String*/ (_url,_json);
 //BA.debugLineNum = 41;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 42;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 43;BA.debugLine="If job.Success Then";
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
 //BA.debugLineNum = 44;BA.debugLine="Log(job.GetString)";
parent.__c.LogImpl("713172748",_job._getstring /*String*/ (),0);
 //BA.debugLineNum = 45;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 47;BA.debugLine="Log(\"Error: \" & job.ErrorMessage)";
parent.__c.LogImpl("713172751","Error: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 48;BA.debugLine="job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 49;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
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
