package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class menu_general extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.menu_general");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.menu_general.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.arma_menu _menu_arma = null;
public b4a.example.tipoarma_menu _menu_tipoarma = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgtipo_arma = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgarma = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _arma_click() throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Private Sub Arma_Click";
 //BA.debugLineNum = 36;BA.debugLine="Log(\"Arma_Menu\")";
__c.LogImpl("714548993","Arma_Menu",0);
 //BA.debugLineNum = 39;BA.debugLine="If menu_Arma.IsInitialized = False Then";
if (_menu_arma.IsInitialized /*boolean*/ ()==__c.False) { 
 //BA.debugLineNum = 40;BA.debugLine="menu_Arma.Initialize";
_menu_arma._initialize /*Object*/ (ba);
 //BA.debugLineNum = 41;BA.debugLine="B4XPages.AddPageAndCreate(\"Menu_Arma\", menu_Arma";
_b4xpages._addpageandcreate /*String*/ (ba,"Menu_Arma",(Object)(_menu_arma));
 };
 //BA.debugLineNum = 43;BA.debugLine="B4XPages.ShowPage(\"Menu_Arma\")";
_b4xpages._showpage /*String*/ (ba,"Menu_Arma");
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 17;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 18;BA.debugLine="Root.LoadLayout(\"Menu_General\")";
_root.LoadLayout("Menu_General",ba);
 //BA.debugLineNum = 19;BA.debugLine="imgTipo_Arma.Bitmap = LoadBitmap(File.DirAssets,\"";
_imgtipo_arma.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"blacksmith.png").getObject()));
 //BA.debugLineNum = 20;BA.debugLine="imgArma.Bitmap = LoadBitmap(File.DirAssets,\"sword";
_imgarma.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"swords_shield.png").getObject()));
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private menu_Arma As Arma_Menu";
_menu_arma = new b4a.example.arma_menu();
 //BA.debugLineNum = 5;BA.debugLine="Private menu_TipoArma As TipoArma_Menu";
_menu_tipoarma = new b4a.example.tipoarma_menu();
 //BA.debugLineNum = 6;BA.debugLine="Private imgTipo_Arma As ImageView";
_imgtipo_arma = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private imgArma As ImageView";
_imgarma = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
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
public String  _tipo_arma_click() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Private Sub Tipo_Arma_Click";
 //BA.debugLineNum = 26;BA.debugLine="Log(\"Tipo_Arma_Menu\")";
__c.LogImpl("714483457","Tipo_Arma_Menu",0);
 //BA.debugLineNum = 28;BA.debugLine="If menu_TipoArma.IsInitialized = False Then";
if (_menu_tipoarma.IsInitialized /*boolean*/ ()==__c.False) { 
 //BA.debugLineNum = 29;BA.debugLine="menu_TipoArma.Initialize";
_menu_tipoarma._initialize /*Object*/ (ba);
 //BA.debugLineNum = 30;BA.debugLine="B4XPages.AddPageAndCreate(\"Menu_TipoArma\", menu_";
_b4xpages._addpageandcreate /*String*/ (ba,"Menu_TipoArma",(Object)(_menu_tipoarma));
 };
 //BA.debugLineNum = 32;BA.debugLine="B4XPages.ShowPage(\"Menu_TipoArma\")";
_b4xpages._showpage /*String*/ (ba,"Menu_TipoArma");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
