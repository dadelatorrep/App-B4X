package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class arma_menu_create extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.arma_menu_create");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.arma_menu_create.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.armaservice _armaapi = null;
public b4a.example.tipoarmaservice _tipoarmaapi = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnombre = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdescripcion = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spnrareza = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtatk = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtcantidad = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spntipoarma = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtcritdmg = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 22;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 24;BA.debugLine="Root.LoadLayout(\"Menu_Arma_Create\")";
_root.LoadLayout("Menu_Arma_Create",ba);
 //BA.debugLineNum = 25;BA.debugLine="armaAPI.Initialize(\"https://6633cce1f7d50bbd9b4ab";
_armaapi._initialize /*String*/ (ba,"https://6633cce1f7d50bbd9b4ab447.mockapi.io");
 //BA.debugLineNum = 26;BA.debugLine="tipoArmaAPI.Initialize(\"https://6633cce1f7d50bbd9";
_tipoarmaapi._initialize /*String*/ (ba,"https://6633cce1f7d50bbd9b4ab447.mockapi.io");
 //BA.debugLineNum = 28;BA.debugLine="spnRareza.AddAll(Array As String(\"1\",\"2\",\"3\",\"4\",";
_spnrareza.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"1","2","3","4","5"}));
 //BA.debugLineNum = 29;BA.debugLine="CargarTiposArma";
_cargartiposarma();
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public void  _btncreate_click() throws Exception{
ResumableSub_btnCreate_Click rsub = new ResumableSub_btnCreate_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnCreate_Click extends BA.ResumableSub {
public ResumableSub_btnCreate_Click(b4a.example.arma_menu_create parent) {
this.parent = parent;
}
b4a.example.arma_menu_create parent;
String _nombre = "";
String _descripcion = "";
int _rareza = 0;
int _atk = 0;
int _critdmg = 0;
int _cantidad = 0;
int _tipoarmaid = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _success = false;

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
 //BA.debugLineNum = 57;BA.debugLine="If txtNombre.Text = \"\" Or txtDescripcion.Text = \"";
if (true) break;

case 1:
//if
this.state = 18;
if ((parent._txtnombre.getText()).equals("") || (parent._txtdescripcion.getText()).equals("") || (parent._txtatk.getText()).equals("") || (parent._txtcritdmg.getText()).equals("") || (parent._txtcantidad.getText()).equals("") || parent._spnrareza.getSelectedIndex()==-1 || parent._spntipoarma.getSelectedIndex()==-1) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
 //BA.debugLineNum = 58;BA.debugLine="xui.MsgboxAsync(\"Alguno de los campos esta vacio";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Alguno de los campos esta vacio"),BA.ObjectToCharSequence("Error"));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 60;BA.debugLine="Try";
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
 //BA.debugLineNum = 61;BA.debugLine="Dim nombre, descripcion As String";
_nombre = "";
_descripcion = "";
 //BA.debugLineNum = 62;BA.debugLine="Dim rareza, atk, critDmg, cantidad, tipoArmaId";
_rareza = 0;
_atk = 0;
_critdmg = 0;
_cantidad = 0;
_tipoarmaid = 0;
 //BA.debugLineNum = 63;BA.debugLine="nombre = txtNombre.Text";
_nombre = parent._txtnombre.getText();
 //BA.debugLineNum = 64;BA.debugLine="descripcion = txtDescripcion.Text";
_descripcion = parent._txtdescripcion.getText();
 //BA.debugLineNum = 65;BA.debugLine="rareza = spnRareza.SelectedIndex + 1";
_rareza = (int) (parent._spnrareza.getSelectedIndex()+1);
 //BA.debugLineNum = 66;BA.debugLine="atk = txtAtk.Text";
_atk = (int)(Double.parseDouble(parent._txtatk.getText()));
 //BA.debugLineNum = 67;BA.debugLine="critDmg = txtCritDmg.Text";
_critdmg = (int)(Double.parseDouble(parent._txtcritdmg.getText()));
 //BA.debugLineNum = 68;BA.debugLine="cantidad = txtCantidad.Text";
_cantidad = (int)(Double.parseDouble(parent._txtcantidad.getText()));
 //BA.debugLineNum = 69;BA.debugLine="tipoArmaId = spnTipoArma.SelectedIndex + 1";
_tipoarmaid = (int) (parent._spntipoarma.getSelectedIndex()+1);
 //BA.debugLineNum = 71;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 72;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 73;BA.debugLine="m.Put(\"nombre\", nombre)";
_m.Put((Object)("nombre"),(Object)(_nombre));
 //BA.debugLineNum = 74;BA.debugLine="m.Put(\"descripcion\", descripcion)";
_m.Put((Object)("descripcion"),(Object)(_descripcion));
 //BA.debugLineNum = 75;BA.debugLine="m.Put(\"rareza\", rareza)";
_m.Put((Object)("rareza"),(Object)(_rareza));
 //BA.debugLineNum = 76;BA.debugLine="m.Put(\"atk\", atk)";
_m.Put((Object)("atk"),(Object)(_atk));
 //BA.debugLineNum = 77;BA.debugLine="m.Put(\"crit_Dmg\", critDmg)";
_m.Put((Object)("crit_Dmg"),(Object)(_critdmg));
 //BA.debugLineNum = 78;BA.debugLine="m.Put(\"cantidad\", cantidad)";
_m.Put((Object)("cantidad"),(Object)(_cantidad));
 //BA.debugLineNum = 79;BA.debugLine="m.Put(\"Tipo_ArmaId\", tipoArmaId)";
_m.Put((Object)("Tipo_ArmaId"),(Object)(_tipoarmaid));
 //BA.debugLineNum = 82;BA.debugLine="Dim rs As ResumableSub = armaAPI.PostArmaAsync(";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent._armaapi._postarmaasync /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_m);
 //BA.debugLineNum = 83;BA.debugLine="Wait For (rs) Complete (Success As Boolean)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 19;
return;
case 19:
//C
this.state = 9;
_success = (Boolean) result[0];
;
 //BA.debugLineNum = 84;BA.debugLine="If Success = True Then";
if (true) break;

case 9:
//if
this.state = 14;
if (_success==parent.__c.True) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 //BA.debugLineNum = 85;BA.debugLine="xui.MsgboxAsync(\"Arma creada exitosamente\", \"É";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Arma creada exitosamente"),BA.ObjectToCharSequence("Éxito"));
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 87;BA.debugLine="xui.MsgboxAsync(\"Error al crear el arma\", \"Err";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error al crear el arma"),BA.ObjectToCharSequence("Error"));
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
 //BA.debugLineNum = 91;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("716842788",BA.ObjectToString(parent.__c.LastException(ba)),0);
 //BA.debugLineNum = 92;BA.debugLine="xui.MsgboxAsync(\"Se produjo un error al crear e";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Se produjo un error al crear el arma"),BA.ObjectToCharSequence("Error"));
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
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
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
public void  _complete(boolean _success) throws Exception{
}
public void  _cargartiposarma() throws Exception{
ResumableSub_CargarTiposArma rsub = new ResumableSub_CargarTiposArma(this);
rsub.resume(ba, null);
}
public static class ResumableSub_CargarTiposArma extends BA.ResumableSub {
public ResumableSub_CargarTiposArma(b4a.example.arma_menu_create parent) {
this.parent = parent;
}
b4a.example.arma_menu_create parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
anywheresoftware.b4a.objects.collections.List _tiposarma = null;
String _nombretipoarma = "";
anywheresoftware.b4a.objects.collections.Map _tipoarmamap = null;
b4a.example.tipoarma _tipoarmafila = null;
anywheresoftware.b4a.BA.IterableList group5;
int index5;
int groupLen5;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 36;BA.debugLine="Dim rs As ResumableSub = tipoArmaAPI.GetTiposArma";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent._tipoarmaapi._gettiposarmaasync /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ();
 //BA.debugLineNum = 37;BA.debugLine="Wait For (rs) Complete (tiposArma As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_tiposarma = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 38;BA.debugLine="If tiposArma <> Null Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_tiposarma!= null) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 39;BA.debugLine="Dim nombreTipoArma As String";
_nombretipoarma = "";
 //BA.debugLineNum = 40;BA.debugLine="For Each tipoArmaMap As Map In tiposArma";
if (true) break;

case 4:
//for
this.state = 7;
_tipoarmamap = new anywheresoftware.b4a.objects.collections.Map();
group5 = _tiposarma;
index5 = 0;
groupLen5 = group5.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index5 < groupLen5) {
this.state = 6;
_tipoarmamap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group5.Get(index5)));}
if (true) break;

case 13:
//C
this.state = 12;
index5++;
if (true) break;

case 6:
//C
this.state = 13;
 //BA.debugLineNum = 41;BA.debugLine="nombreTipoArma = \"\"";
_nombretipoarma = "";
 //BA.debugLineNum = 42;BA.debugLine="Dim tipoArmaFila As TipoArma";
_tipoarmafila = new b4a.example.tipoarma();
 //BA.debugLineNum = 43;BA.debugLine="tipoArmaFila.Initialize";
_tipoarmafila._initialize /*String*/ (ba);
 //BA.debugLineNum = 44;BA.debugLine="tipoArmaFila.nombre = tipoArmaMap.Get(\"Nombre\")";
_tipoarmafila._nombre /*String*/  = BA.ObjectToString(_tipoarmamap.Get((Object)("Nombre")));
 //BA.debugLineNum = 45;BA.debugLine="tipoArmaFila.id = tipoArmaMap.Get(\"Id\")";
_tipoarmafila._id /*String*/  = BA.ObjectToString(_tipoarmamap.Get((Object)("Id")));
 //BA.debugLineNum = 46;BA.debugLine="nombreTipoArma = tipoArmaFila.nombre";
_nombretipoarma = _tipoarmafila._nombre /*String*/ ;
 //BA.debugLineNum = 47;BA.debugLine="spnTipoArma.Add(nombreTipoArma)";
parent._spntipoarma.Add(_nombretipoarma);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 51;BA.debugLine="xui.MsgboxAsync(\"Error al obtener la lista de ar";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error al obtener la lista de armas"),BA.ObjectToCharSequence("Error"));
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private armaAPI As ArmaService";
_armaapi = new b4a.example.armaservice();
 //BA.debugLineNum = 5;BA.debugLine="Private tipoArmaAPI As TipoArmaService";
_tipoarmaapi = new b4a.example.tipoarmaservice();
 //BA.debugLineNum = 6;BA.debugLine="Private txtNombre As EditText";
_txtnombre = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private txtDescripcion As EditText";
_txtdescripcion = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private spnRareza As Spinner";
_spnrareza = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private txtAtk As EditText";
_txtatk = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private txtCantidad As EditText";
_txtcantidad = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private spnTipoArma As Spinner";
_spntipoarma = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private txtCritDmg As EditText";
_txtcritdmg = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
