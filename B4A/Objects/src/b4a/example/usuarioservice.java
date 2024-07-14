package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class usuarioservice extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.usuarioservice");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.usuarioservice.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _buscarusuario(String _username) throws Exception{
ResumableSub_BuscarUsuario rsub = new ResumableSub_BuscarUsuario(this,_username);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BuscarUsuario extends BA.ResumableSub {
public ResumableSub_BuscarUsuario(b4a.example.usuarioservice parent,String _username) {
this.parent = parent;
this._username = _username;
}
b4a.example.usuarioservice parent;
String _username;
b4a.example.httpjob _job = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _users = null;
anywheresoftware.b4a.objects.collections.Map _usermap = null;
b4a.example.usuario _usuarioclass = null;

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
 //BA.debugLineNum = 11;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 12;BA.debugLine="job.Initialize(\"BuscarUsuario\", Me)";
_job._initialize /*String*/ (ba,"BuscarUsuario",parent);
 //BA.debugLineNum = 13;BA.debugLine="job.Download(API_URL & \"?search=\" & username)";
_job._download /*String*/ (parent._api_url+"?search="+_username);
 //BA.debugLineNum = 14;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 15;BA.debugLine="If job.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 16;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 17;BA.debugLine="parser.Initialize(job.GetString)";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 18;BA.debugLine="Dim users As List = parser.NextArray";
_users = new anywheresoftware.b4a.objects.collections.List();
_users = _parser.NextArray();
 //BA.debugLineNum = 19;BA.debugLine="If users.Size > 0 Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_users.getSize()>0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 20;BA.debugLine="Dim userMap As Map = users.Get(0)";
_usermap = new anywheresoftware.b4a.objects.collections.Map();
_usermap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_users.Get((int) (0))));
 //BA.debugLineNum = 21;BA.debugLine="Dim usuarioClass As Usuario";
_usuarioclass = new b4a.example.usuario();
 //BA.debugLineNum = 22;BA.debugLine="usuarioClass.Initialize";
_usuarioclass._initialize /*String*/ (ba);
 //BA.debugLineNum = 23;BA.debugLine="usuarioClass.user = userMap.Get(\"user\")";
_usuarioclass._user /*String*/  = BA.ObjectToString(_usermap.Get((Object)("user")));
 //BA.debugLineNum = 24;BA.debugLine="usuarioClass.password = userMap.Get(\"password\")";
_usuarioclass._password /*String*/  = BA.ObjectToString(_usermap.Get((Object)("password")));
 //BA.debugLineNum = 25;BA.debugLine="usuarioClass.id = userMap.Get(\"id\")";
_usuarioclass._id /*String*/  = BA.ObjectToString(_usermap.Get((Object)("id")));
 //BA.debugLineNum = 26;BA.debugLine="job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 27;BA.debugLine="Return usuarioClass";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_usuarioclass));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 30;BA.debugLine="job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 31;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(b4a.example.httpjob _job) throws Exception{
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private API_URL As String";
_api_url = "";
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _url) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize(Url As String)";
 //BA.debugLineNum = 7;BA.debugLine="API_URL = Url";
_api_url = _url;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _verificarcredenciales(String _username,String _password) throws Exception{
ResumableSub_VerificarCredenciales rsub = new ResumableSub_VerificarCredenciales(this,_username,_password);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_VerificarCredenciales extends BA.ResumableSub {
public ResumableSub_VerificarCredenciales(b4a.example.usuarioservice parent,String _username,String _password) {
this.parent = parent;
this._username = _username;
this._password = _password;
}
b4a.example.usuarioservice parent;
String _username;
String _password;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
b4a.example.usuario _usuarioclass = null;

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
 //BA.debugLineNum = 35;BA.debugLine="Dim rs As ResumableSub = BuscarUsuario(username)";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent._buscarusuario(_username);
 //BA.debugLineNum = 36;BA.debugLine="Wait For (rs) Complete (usuarioClass As Usuario)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_usuarioclass = (b4a.example.usuario) result[0];
;
 //BA.debugLineNum = 37;BA.debugLine="If usuarioClass <> Null And usuarioClass.password";
if (true) break;

case 1:
//if
this.state = 6;
if (_usuarioclass!= null && (_usuarioclass._password /*String*/ ).equals(_password)) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 38;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 40;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(b4a.example.usuario _usuarioclass) throws Exception{
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
