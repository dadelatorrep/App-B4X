package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class tipoarma_menu_read extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.tipoarma_menu_read");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.tipoarma_menu_read.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.tipoarmaservice _tipoarmaapi = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listread = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _actulizarpagina() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Public Sub ActulizarPagina";
 //BA.debugLineNum = 54;BA.debugLine="CargarArmas";
_cargararmas();
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 15;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 16;BA.debugLine="Root.LoadLayout(\"Menu_TipoArma_Read\")";
_root.LoadLayout("Menu_TipoArma_Read",ba);
 //BA.debugLineNum = 17;BA.debugLine="tipoArmaAPI.Initialize(\"https://6633cce1f7d50bbd9";
_tipoarmaapi._initialize /*String*/ (ba,"https://6633cce1f7d50bbd9b4ab447.mockapi.io");
 //BA.debugLineNum = 18;BA.debugLine="CargarArmas";
_cargararmas();
 //BA.debugLineNum = 19;BA.debugLine="ConfigurarListView";
_configurarlistview();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public void  _cargararmas() throws Exception{
ResumableSub_CargarArmas rsub = new ResumableSub_CargarArmas(this);
rsub.resume(ba, null);
}
public static class ResumableSub_CargarArmas extends BA.ResumableSub {
public ResumableSub_CargarArmas(b4a.example.tipoarma_menu_read parent) {
this.parent = parent;
}
b4a.example.tipoarma_menu_read parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
anywheresoftware.b4a.objects.collections.List _tiposarma = null;
anywheresoftware.b4a.objects.collections.Map _tipoarmamap = null;
b4a.example.tipoarma _tipoarmafila = null;
anywheresoftware.b4a.BA.IterableList group6;
int index6;
int groupLen6;

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
 //BA.debugLineNum = 25;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 16;
this.catchState = 15;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 15;
 //BA.debugLineNum = 26;BA.debugLine="Dim rs As ResumableSub = tipoArmaAPI.GetTiposArm";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent._tipoarmaapi._gettiposarmaasync /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ();
 //BA.debugLineNum = 27;BA.debugLine="Wait For (rs) Complete (tiposArma As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 17;
return;
case 17:
//C
this.state = 4;
_tiposarma = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 28;BA.debugLine="If tiposArma <> Null Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_tiposarma!= null) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 29;BA.debugLine="listRead.Clear";
parent._listread.Clear();
 //BA.debugLineNum = 30;BA.debugLine="For Each tipoArmaMap As Map In tiposArma";
if (true) break;

case 7:
//for
this.state = 10;
_tipoarmamap = new anywheresoftware.b4a.objects.collections.Map();
group6 = _tiposarma;
index6 = 0;
groupLen6 = group6.getSize();
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if (index6 < groupLen6) {
this.state = 9;
_tipoarmamap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group6.Get(index6)));}
if (true) break;

case 19:
//C
this.state = 18;
index6++;
if (true) break;

case 9:
//C
this.state = 19;
 //BA.debugLineNum = 31;BA.debugLine="Dim tipoArmaFila As TipoArma";
_tipoarmafila = new b4a.example.tipoarma();
 //BA.debugLineNum = 32;BA.debugLine="tipoArmaFila.Initialize";
_tipoarmafila._initialize /*String*/ (ba);
 //BA.debugLineNum = 33;BA.debugLine="tipoArmaFila.id = tipoArmaMap.Get(\"Id\")";
_tipoarmafila._id /*String*/  = BA.ObjectToString(_tipoarmamap.Get((Object)("Id")));
 //BA.debugLineNum = 34;BA.debugLine="tipoArmaFila.nombre = tipoArmaMap.Get(\"Nombre\"";
_tipoarmafila._nombre /*String*/  = BA.ObjectToString(_tipoarmamap.Get((Object)("Nombre")));
 //BA.debugLineNum = 35;BA.debugLine="listRead.AddSingleLine2(tipoArmaFila.Nombre, t";
parent._listread.AddSingleLine2(BA.ObjectToCharSequence(_tipoarmafila._nombre /*String*/ ),(Object)(_tipoarmafila));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
;
 if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 38;BA.debugLine="xui.MsgboxAsync(\"Error al obtener la lista de t";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error al obtener la lista de tipos de arma"),BA.ObjectToCharSequence("Error"));
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
 //BA.debugLineNum = 41;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("717629201",BA.ObjectToString(parent.__c.LastException(ba)),0);
 //BA.debugLineNum = 42;BA.debugLine="xui.MsgboxAsync(\"Error try al obtener la lista d";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error try al obtener la lista de tipos de arma "),BA.ObjectToCharSequence("Error"));
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
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
public void  _complete(anywheresoftware.b4a.objects.collections.List _tiposarma) throws Exception{
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private tipoArmaAPI As TipoArmaService";
_tipoarmaapi = new b4a.example.tipoarmaservice();
 //BA.debugLineNum = 5;BA.debugLine="Private listRead As ListView";
_listread = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public String  _configurarlistview() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Private Sub ConfigurarListView";
 //BA.debugLineNum = 48;BA.debugLine="listRead.SingleLineLayout.ItemHeight = 100dip";
_listread.getSingleLineLayout().setItemHeight(__c.DipToCurrent((int) (100)));
 //BA.debugLineNum = 49;BA.debugLine="listRead.SingleLineLayout.Label.TextSize = 20";
_listread.getSingleLineLayout().Label.setTextSize((float) (20));
 //BA.debugLineNum = 50;BA.debugLine="listRead.SingleLineLayout.Label.TextColor = Color";
_listread.getSingleLineLayout().Label.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 10;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
