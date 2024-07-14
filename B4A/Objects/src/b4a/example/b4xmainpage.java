package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _login = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtusername = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpassword = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogin = null;
public b4a.example.usuarioservice _usuarioapi = null;
public b4a.example.menu_general _menugeneral = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imglogin = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 27;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 28;BA.debugLine="Root.LoadLayout(\"MainPage\")";
_root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 29;BA.debugLine="imgLogin.Bitmap = LoadBitmap(File.DirAssets,\"logi";
_imglogin.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"login.png").getObject()));
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public void  _btnlogin_click() throws Exception{
ResumableSub_btnLogin_Click rsub = new ResumableSub_btnLogin_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnLogin_Click extends BA.ResumableSub {
public ResumableSub_btnLogin_Click(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
String _username = "";
String _password = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _credencialesvalidas = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 40;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 22;
this.catchState = 21;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 21;
 //BA.debugLineNum = 41;BA.debugLine="If txtUsername.Text = \"\" Or txtPassword.Text = \"";
if (true) break;

case 4:
//if
this.state = 19;
if ((parent._txtusername.getText()).equals("") || (parent._txtpassword.getText()).equals("")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 19;
 //BA.debugLineNum = 42;BA.debugLine="xui.MsgboxAsync(\"Las credenciales estan vacias\"";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Las credenciales estan vacias"),BA.ObjectToCharSequence("Error"));
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 44;BA.debugLine="Dim username As String = txtUsername.Text";
_username = parent._txtusername.getText();
 //BA.debugLineNum = 45;BA.debugLine="Dim password As String = txtPassword.Text";
_password = parent._txtpassword.getText();
 //BA.debugLineNum = 47;BA.debugLine="If menuGeneral.IsInitialized = False Then";
if (true) break;

case 9:
//if
this.state = 12;
if (parent._menugeneral.IsInitialized /*boolean*/ ()==parent.__c.False) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 48;BA.debugLine="menuGeneral.Initialize";
parent._menugeneral._initialize /*Object*/ (ba);
 //BA.debugLineNum = 49;BA.debugLine="B4XPages.AddPageAndCreate(\"Menu_General\", menu";
parent._b4xpages._addpageandcreate /*String*/ (ba,"Menu_General",(Object)(parent._menugeneral));
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 53;BA.debugLine="Dim rs As ResumableSub = usuarioAPI.VerificarCr";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent._usuarioapi._verificarcredenciales /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_username,_password);
 //BA.debugLineNum = 54;BA.debugLine="Wait For (rs) Complete (credencialesValidas As";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 23;
return;
case 23:
//C
this.state = 13;
_credencialesvalidas = (Boolean) result[0];
;
 //BA.debugLineNum = 56;BA.debugLine="If credencialesValidas Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_credencialesvalidas) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 //BA.debugLineNum = 57;BA.debugLine="xui.MsgboxAsync(\"Inicio de sesión exitoso\", \"É";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Inicio de sesión exitoso"),BA.ObjectToCharSequence("Éxito"));
 //BA.debugLineNum = 59;BA.debugLine="B4XPages.ShowPage(\"Menu_General\")";
parent._b4xpages._showpage /*String*/ (ba,"Menu_General");
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 61;BA.debugLine="xui.MsgboxAsync(\"Error en las credenciales\", \"";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error en las credenciales"),BA.ObjectToCharSequence("Error"));
 //BA.debugLineNum = 62;BA.debugLine="LimpiarCampos";
parent._limpiarcampos();
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
 //BA.debugLineNum = 67;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("7851996",BA.ObjectToString(parent.__c.LastException(ba)),0);
 //BA.debugLineNum = 68;BA.debugLine="xui.MsgboxAsync(\"Se produjo un error al iniciar";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Se produjo un error al iniciar sesión"),BA.ObjectToCharSequence("Error"));
 if (true) break;
if (true) break;

case 22:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _complete(boolean _credencialesvalidas) throws Exception{
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private Login As B4XView";
_login = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private txtUsername As EditText";
_txtusername = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private txtPassword As EditText";
_txtpassword = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private btnLogin As Button";
_btnlogin = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private usuarioAPI As UsuarioService";
_usuarioapi = new b4a.example.usuarioservice();
 //BA.debugLineNum = 16;BA.debugLine="Private menuGeneral As Menu_General";
_menugeneral = new b4a.example.menu_general();
 //BA.debugLineNum = 17;BA.debugLine="Private imgLogin As ImageView";
_imglogin = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 22;BA.debugLine="usuarioAPI.Initialize(\"https://6637fc174253a866a2";
_usuarioapi._initialize /*String*/ (ba,"https://6637fc174253a866a24c8af3.mockapi.io/Usuario");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _limpiarcampos() throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Private Sub LimpiarCampos";
 //BA.debugLineNum = 35;BA.debugLine="txtUsername.Text = \"\"";
_txtusername.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 36;BA.debugLine="txtPassword.Text = \"\"";
_txtpassword.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
