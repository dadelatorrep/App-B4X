package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class arma_menu_read extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.arma_menu_read");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.arma_menu_read.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.tipoarmaservice _tipoarmaapi = null;
public b4a.example.armaservice _armaapi = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listread = null;
public anywheresoftware.b4a.objects.collections.List _listtipoarma = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _actulizarpagina() throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Public Sub ActulizarPagina";
 //BA.debugLineNum = 74;BA.debugLine="CargarArmas";
_cargararmas();
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public void  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
ResumableSub_B4XPage_Created rsub = new ResumableSub_B4XPage_Created(this,_root1);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Created extends BA.ResumableSub {
public ResumableSub_B4XPage_Created(b4a.example.arma_menu_read parent,anywheresoftware.b4a.objects.B4XViewWrapper _root1) {
this.parent = parent;
this._root1 = _root1;
}
b4a.example.arma_menu_read parent;
anywheresoftware.b4a.objects.B4XViewWrapper _root1;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
anywheresoftware.b4a.objects.collections.List _list = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 17;BA.debugLine="Root = Root1";
parent._root = _root1;
 //BA.debugLineNum = 18;BA.debugLine="Root.LoadLayout(\"Menu_Arma_Read\")";
parent._root.LoadLayout("Menu_Arma_Read",ba);
 //BA.debugLineNum = 19;BA.debugLine="armaAPI.Initialize(\"https://6633cce1f7d50bbd9b4ab";
parent._armaapi._initialize /*String*/ (ba,"https://6633cce1f7d50bbd9b4ab447.mockapi.io");
 //BA.debugLineNum = 20;BA.debugLine="tipoArmaAPI.Initialize(\"https://6633cce1f7d50bbd9";
parent._tipoarmaapi._initialize /*String*/ (ba,"https://6633cce1f7d50bbd9b4ab447.mockapi.io");
 //BA.debugLineNum = 21;BA.debugLine="listTipoArma.Initialize";
parent._listtipoarma.Initialize();
 //BA.debugLineNum = 22;BA.debugLine="Dim rs As ResumableSub = CargarTiposArma";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent._cargartiposarma();
 //BA.debugLineNum = 23;BA.debugLine="Wait For (rs) Complete (list As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_list = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 24;BA.debugLine="listTipoArma.AddAll(list)";
parent._listtipoarma.AddAll(_list);
 //BA.debugLineNum = 25;BA.debugLine="CargarArmas";
parent._cargararmas();
 //BA.debugLineNum = 26;BA.debugLine="ConfigurarListView";
parent._configurarlistview();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(anywheresoftware.b4a.objects.collections.List _list) throws Exception{
}
public void  _cargararmas() throws Exception{
ResumableSub_CargarArmas rsub = new ResumableSub_CargarArmas(this);
rsub.resume(ba, null);
}
public static class ResumableSub_CargarArmas extends BA.ResumableSub {
public ResumableSub_CargarArmas(b4a.example.arma_menu_read parent) {
this.parent = parent;
}
b4a.example.arma_menu_read parent;
String _nombretipoarma = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
anywheresoftware.b4a.objects.collections.List _armas = null;
anywheresoftware.b4a.objects.collections.Map _armamap = null;
b4a.example.arma _armafila = null;
String _itemtext = "";
anywheresoftware.b4a.BA.IterableList group7;
int index7;
int groupLen7;

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
 //BA.debugLineNum = 33;BA.debugLine="Try";
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
 //BA.debugLineNum = 34;BA.debugLine="Dim nombreTipoArma As String";
_nombretipoarma = "";
 //BA.debugLineNum = 35;BA.debugLine="Dim rs As ResumableSub = armaAPI.GetArmasAsyn";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent._armaapi._getarmasasync /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ();
 //BA.debugLineNum = 36;BA.debugLine="Wait For (rs) Complete (armas As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 17;
return;
case 17:
//C
this.state = 4;
_armas = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 37;BA.debugLine="If armas <> Null Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_armas!= null) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 38;BA.debugLine="listRead.Clear";
parent._listread.Clear();
 //BA.debugLineNum = 39;BA.debugLine="For Each armaMap As Map In armas";
if (true) break;

case 7:
//for
this.state = 10;
_armamap = new anywheresoftware.b4a.objects.collections.Map();
group7 = _armas;
index7 = 0;
groupLen7 = group7.getSize();
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if (index7 < groupLen7) {
this.state = 9;
_armamap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group7.Get(index7)));}
if (true) break;

case 19:
//C
this.state = 18;
index7++;
if (true) break;

case 9:
//C
this.state = 19;
 //BA.debugLineNum = 40;BA.debugLine="Dim armaFila As Arma";
_armafila = new b4a.example.arma();
 //BA.debugLineNum = 41;BA.debugLine="armaFila.Initialize";
_armafila._initialize /*String*/ (ba);
 //BA.debugLineNum = 42;BA.debugLine="armaFila.nombre = armaMap.Get(\"nombre";
_armafila._nombre /*String*/  = BA.ObjectToString(_armamap.Get((Object)("nombre")));
 //BA.debugLineNum = 43;BA.debugLine="armaFila.descripcion = armaMap.Get(\"d";
_armafila._descripcion /*String*/  = BA.ObjectToString(_armamap.Get((Object)("descripcion")));
 //BA.debugLineNum = 44;BA.debugLine="armaFila.rareza = armaMap.Get(\"rareza";
_armafila._rareza /*int*/  = (int)(BA.ObjectToNumber(_armamap.Get((Object)("rareza"))));
 //BA.debugLineNum = 45;BA.debugLine="armaFila.atk = armaMap.Get(\"atk\")";
_armafila._atk /*int*/  = (int)(BA.ObjectToNumber(_armamap.Get((Object)("atk"))));
 //BA.debugLineNum = 46;BA.debugLine="armaFila.crit_Dmg = armaMap.Get(\"crit";
_armafila._crit_dmg /*double*/  = (double)(BA.ObjectToNumber(_armamap.Get((Object)("crit_Dmg"))));
 //BA.debugLineNum = 47;BA.debugLine="armaFila.cantidad = armaMap.Get(\"cant";
_armafila._cantidad /*int*/  = (int)(BA.ObjectToNumber(_armamap.Get((Object)("cantidad"))));
 //BA.debugLineNum = 48;BA.debugLine="armaFila.id = armaMap.Get(\"id\")";
_armafila._id /*String*/  = BA.ObjectToString(_armamap.Get((Object)("id")));
 //BA.debugLineNum = 49;BA.debugLine="armaFila.Tipo_ArmaId = armaMap.Get(\"T";
_armafila._tipo_armaid /*String*/  = BA.ObjectToString(_armamap.Get((Object)("Tipo_ArmaId")));
 //BA.debugLineNum = 50;BA.debugLine="nombreTipoArma = NombreTipoArmaById(armaFila.T";
_nombretipoarma = parent._nombretipoarmabyid((int)(Double.parseDouble(_armafila._tipo_armaid /*String*/ )));
 //BA.debugLineNum = 51;BA.debugLine="Dim itemText As String";
_itemtext = "";
 //BA.debugLineNum = 52;BA.debugLine="itemText = $\"Tipo: ${nombreTipoArma},";
_itemtext = ("Tipo: "+parent.__c.SmartStringFormatter("",(Object)(_nombretipoarma))+", Cantidad: "+parent.__c.SmartStringFormatter("",(Object)(_armafila._cantidad /*int*/ ))+"");
 //BA.debugLineNum = 53;BA.debugLine="listRead.AddTwoLines2(armaFila.nombre";
parent._listread.AddTwoLines2(BA.ObjectToCharSequence(_armafila._nombre /*String*/ ),BA.ObjectToCharSequence(_itemtext),(Object)(_armafila));
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
 //BA.debugLineNum = 56;BA.debugLine="xui.MsgboxAsync(\"Error al obtener la list";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error al obtener la lista de armas"),BA.ObjectToCharSequence("Error"));
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
 //BA.debugLineNum = 59;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("715728667",BA.ObjectToString(parent.__c.LastException(ba)),0);
 //BA.debugLineNum = 60;BA.debugLine="xui.MsgboxAsync(\"Error try al obtener la lista d";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error try al obtener la lista de armas "),BA.ObjectToCharSequence("Error"));
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
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
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargartiposarma() throws Exception{
ResumableSub_CargarTiposArma rsub = new ResumableSub_CargarTiposArma(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargarTiposArma extends BA.ResumableSub {
public ResumableSub_CargarTiposArma(b4a.example.arma_menu_read parent) {
this.parent = parent;
}
b4a.example.arma_menu_read parent;
anywheresoftware.b4a.objects.collections.List _list = null;
String _nombretipoarma = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
anywheresoftware.b4a.objects.collections.List _tiposarma = null;
anywheresoftware.b4a.objects.collections.Map _tipoarmamap = null;
b4a.example.tipoarma _tipoarmafila = null;
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;

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
 //BA.debugLineNum = 78;BA.debugLine="Log(\"Metodo cargar Tipos de Arma\")";
parent.__c.LogImpl("721692417","Metodo cargar Tipos de Arma",0);
 //BA.debugLineNum = 79;BA.debugLine="Dim list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 80;BA.debugLine="list.Initialize";
_list.Initialize();
 //BA.debugLineNum = 81;BA.debugLine="Dim nombreTipoArma As String";
_nombretipoarma = "";
 //BA.debugLineNum = 82;BA.debugLine="Dim rs As ResumableSub = tipoArmaAPI.GetTiposArma";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent._tipoarmaapi._gettiposarmaasync /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ();
 //BA.debugLineNum = 83;BA.debugLine="Wait For (rs) Complete (tiposArma As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_tiposarma = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 85;BA.debugLine="If tiposArma <> Null Then";
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
 //BA.debugLineNum = 86;BA.debugLine="For Each tipoArmaMap As Map In tiposArma";
if (true) break;

case 4:
//for
this.state = 7;
_tipoarmamap = new anywheresoftware.b4a.objects.collections.Map();
group8 = _tiposarma;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index8 < groupLen8) {
this.state = 6;
_tipoarmamap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group8.Get(index8)));}
if (true) break;

case 13:
//C
this.state = 12;
index8++;
if (true) break;

case 6:
//C
this.state = 13;
 //BA.debugLineNum = 87;BA.debugLine="nombreTipoArma = \"\"";
_nombretipoarma = "";
 //BA.debugLineNum = 88;BA.debugLine="Dim tipoArmaFila As TipoArma";
_tipoarmafila = new b4a.example.tipoarma();
 //BA.debugLineNum = 89;BA.debugLine="tipoArmaFila.Initialize";
_tipoarmafila._initialize /*String*/ (ba);
 //BA.debugLineNum = 90;BA.debugLine="tipoArmaFila.nombre = tipoArmaMap.Get(\"Nombre\")";
_tipoarmafila._nombre /*String*/  = BA.ObjectToString(_tipoarmamap.Get((Object)("Nombre")));
 //BA.debugLineNum = 91;BA.debugLine="tipoArmaFila.id = tipoArmaMap.Get(\"Id\")";
_tipoarmafila._id /*String*/  = BA.ObjectToString(_tipoarmamap.Get((Object)("Id")));
 //BA.debugLineNum = 92;BA.debugLine="nombreTipoArma = tipoArmaFila.nombre";
_nombretipoarma = _tipoarmafila._nombre /*String*/ ;
 //BA.debugLineNum = 93;BA.debugLine="list.Add(nombreTipoArma)";
_list.Add((Object)(_nombretipoarma));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
 //BA.debugLineNum = 95;BA.debugLine="Log(\"Tamaño de la Lista: \" & listTipoArma.Size)";
parent.__c.LogImpl("721692434","Tamaño de la Lista: "+BA.NumberToString(parent._listtipoarma.getSize()),0);
 //BA.debugLineNum = 96;BA.debugLine="Return list";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_list));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 98;BA.debugLine="xui.MsgboxAsync(\"Error al obtener la lista de ar";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error al obtener la lista de armas"),BA.ObjectToCharSequence("Error"));
 //BA.debugLineNum = 99;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 4;BA.debugLine="Private tipoArmaAPI As TipoArmaService";
_tipoarmaapi = new b4a.example.tipoarmaservice();
 //BA.debugLineNum = 5;BA.debugLine="Private armaAPI As ArmaService";
_armaapi = new b4a.example.armaservice();
 //BA.debugLineNum = 6;BA.debugLine="Private listRead As ListView";
_listread = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private listTipoArma As List";
_listtipoarma = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public String  _configurarlistview() throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Private Sub ConfigurarListView";
 //BA.debugLineNum = 66;BA.debugLine="listRead.TwoLinesLayout.ItemHeight = 100dip";
_listread.getTwoLinesLayout().setItemHeight(__c.DipToCurrent((int) (100)));
 //BA.debugLineNum = 67;BA.debugLine="listRead.TwoLinesLayout.Label.TextSize = 20";
_listread.getTwoLinesLayout().Label.setTextSize((float) (20));
 //BA.debugLineNum = 68;BA.debugLine="listRead.TwoLinesLayout.Label.TextColor = Colors.";
_listread.getTwoLinesLayout().Label.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 69;BA.debugLine="listRead.TwoLinesLayout.SecondLabel.TextSize = 16";
_listread.getTwoLinesLayout().SecondLabel.setTextSize((float) (16));
 //BA.debugLineNum = 70;BA.debugLine="listRead.TwoLinesLayout.SecondLabel.TextColor = C";
_listread.getTwoLinesLayout().SecondLabel.setTextColor(__c.Colors.Gray);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public String  _nombretipoarmabyid(int _idtipoarma) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Public Sub NombreTipoArmaById(idTipoArma As Int) A";
 //BA.debugLineNum = 105;BA.debugLine="Return listTipoArma.Get(idTipoArma - 1)";
if (true) return BA.ObjectToString(_listtipoarma.Get((int) (_idtipoarma-1)));
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
