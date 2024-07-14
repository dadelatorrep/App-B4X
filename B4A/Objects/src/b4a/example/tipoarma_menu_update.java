package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class tipoarma_menu_update extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.tipoarma_menu_update");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.tipoarma_menu_update.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.tipoarmaservice _tipoarmaapi = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnombre = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 16;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 17;BA.debugLine="Root.LoadLayout(\"Menu_TipoArma_Update\")";
_root.LoadLayout("Menu_TipoArma_Update",ba);
 //BA.debugLineNum = 18;BA.debugLine="tipoArmaAPI.Initialize(\"https://6633cce1f7d50bbd9";
_tipoarmaapi._initialize /*String*/ (ba,"https://6633cce1f7d50bbd9b4ab447.mockapi.io");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public void  _btnupdate_click() throws Exception{
ResumableSub_btnUpdate_Click rsub = new ResumableSub_btnUpdate_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnUpdate_Click extends BA.ResumableSub {
public ResumableSub_btnUpdate_Click(b4a.example.tipoarma_menu_update parent) {
this.parent = parent;
}
b4a.example.tipoarma_menu_update parent;
int _id = 0;
String _nombre = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
String _success = "";

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
 //BA.debugLineNum = 25;BA.debugLine="If txtNombre.Text = \"\" Or txtId.Text = \"\" Then";
if (true) break;

case 1:
//if
this.state = 18;
if ((parent._txtnombre.getText()).equals("") || (parent._txtid.getText()).equals("")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
 //BA.debugLineNum = 26;BA.debugLine="xui.MsgboxAsync(\"Alguno de los campos esta vacio";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Alguno de los campos esta vacio"),BA.ObjectToCharSequence("Error"));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 28;BA.debugLine="Try";
if (true) break;

case 6:
//try
this.state = 17;
this.catchState = 16;
this.state = 8;
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 16;
 //BA.debugLineNum = 29;BA.debugLine="Dim id As Int";
_id = 0;
 //BA.debugLineNum = 30;BA.debugLine="Dim nombre As String";
_nombre = "";
 //BA.debugLineNum = 31;BA.debugLine="id = txtId.Text";
_id = (int)(Double.parseDouble(parent._txtid.getText()));
 //BA.debugLineNum = 32;BA.debugLine="nombre = txtNombre.Text";
_nombre = parent._txtnombre.getText();
 //BA.debugLineNum = 33;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 34;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 35;BA.debugLine="m.Put(\"Nombre\", nombre)";
_m.Put((Object)("Nombre"),(Object)(_nombre));
 //BA.debugLineNum = 36;BA.debugLine="m.Put(\"Id\", id)";
_m.Put((Object)("Id"),(Object)(_id));
 //BA.debugLineNum = 37;BA.debugLine="Log(\"Nombre:\" & nombre)";
parent.__c.LogImpl("717956878","Nombre:"+_nombre,0);
 //BA.debugLineNum = 38;BA.debugLine="Log(\"Id:\" & id)";
parent.__c.LogImpl("717956879","Id:"+BA.NumberToString(_id),0);
 //BA.debugLineNum = 39;BA.debugLine="Dim rs As ResumableSub = tipoArmaAPI.PutTipoArm";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent._tipoarmaapi._puttipoarmaasync /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (BA.NumberToString(_id),_m);
 //BA.debugLineNum = 40;BA.debugLine="Wait For (rs) Complete (Success As String)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 19;
return;
case 19:
//C
this.state = 9;
_success = (String) result[0];
;
 //BA.debugLineNum = 41;BA.debugLine="If Success Then";
if (true) break;

case 9:
//if
this.state = 14;
if (BA.ObjectToBoolean(_success)) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 //BA.debugLineNum = 42;BA.debugLine="xui.MsgboxAsync(\"Tipo de arma actulizada exito";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Tipo de arma actulizada exitosamente"),BA.ObjectToCharSequence("Éxito"));
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 44;BA.debugLine="xui.MsgboxAsync(\"Error al actualizar el tipo d";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error al actualizar el tipo de arma"),BA.ObjectToCharSequence("Error"));
 if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 0;
 //BA.debugLineNum = 47;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("717956888",BA.ObjectToString(parent.__c.LastException(ba)),0);
 //BA.debugLineNum = 48;BA.debugLine="xui.MsgboxAsync(\"Se produjo un error al actuali";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Se produjo un error al actualizar el tipo de arma"),BA.ObjectToCharSequence("Error"));
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
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
public void  _complete(String _success) throws Exception{
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private tipoArmaAPI As TipoArmaService";
_tipoarmaapi = new b4a.example.tipoarmaservice();
 //BA.debugLineNum = 5;BA.debugLine="Private txtId As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private txtNombre As EditText";
_txtnombre = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
