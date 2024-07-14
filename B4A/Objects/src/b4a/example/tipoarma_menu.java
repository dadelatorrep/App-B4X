package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class tipoarma_menu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.tipoarma_menu");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.tipoarma_menu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgcreate = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgread = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgupdate = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgdelete = null;
public b4a.example.tipoarma_menu_create _tipoarmacreate = null;
public b4a.example.tipoarma_menu_read _tipoarmaread = null;
public b4a.example.tipoarma_menu_update _tipoarmaupdate = null;
public b4a.example.tipoarma_menu_delete _tipoarmadelete = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 21;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 23;BA.debugLine="Root.LoadLayout(\"Menu_TipoArma\")";
_root.LoadLayout("Menu_TipoArma",ba);
 //BA.debugLineNum = 24;BA.debugLine="imgCreate.Bitmap = LoadBitmap(File.DirAssets,\"swo";
_imgcreate.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"swords.png").getObject()));
 //BA.debugLineNum = 25;BA.debugLine="imgRead.Bitmap = LoadBitmap(File.DirAssets,\"book.";
_imgread.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"book.png").getObject()));
 //BA.debugLineNum = 26;BA.debugLine="imgUpdate.Bitmap = LoadBitmap(File.DirAssets,\"edi";
_imgupdate.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"edit.png").getObject()));
 //BA.debugLineNum = 27;BA.debugLine="imgDelete.Bitmap = LoadBitmap(File.DirAssets,\"del";
_imgdelete.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"delete.png").getObject()));
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private imgCreate As ImageView";
_imgcreate = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private imgRead As ImageView";
_imgread = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private imgUpdate As ImageView";
_imgupdate = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private imgDelete As ImageView";
_imgdelete = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private tipoArmaCreate As TipoArma_Menu_Create";
_tipoarmacreate = new b4a.example.tipoarma_menu_create();
 //BA.debugLineNum = 9;BA.debugLine="Private tipoArmaRead As TipoArma_Menu_Read";
_tipoarmaread = new b4a.example.tipoarma_menu_read();
 //BA.debugLineNum = 10;BA.debugLine="Private tipoArmaUpdate As TipoArma_Menu_Update";
_tipoarmaupdate = new b4a.example.tipoarma_menu_update();
 //BA.debugLineNum = 11;BA.debugLine="Private tipoArmaDelete As TipoArma_Menu_Delete";
_tipoarmadelete = new b4a.example.tipoarma_menu_delete();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public String  _pnlcreate_click() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Private Sub pnlCreate_Click";
 //BA.debugLineNum = 33;BA.debugLine="Log(\"CREATE TIPOARMA\")";
__c.LogImpl("715466497","CREATE TIPOARMA",0);
 //BA.debugLineNum = 35;BA.debugLine="If tipoArmaCreate.IsInitialized = False Then";
if (_tipoarmacreate.IsInitialized /*boolean*/ ()==__c.False) { 
 //BA.debugLineNum = 36;BA.debugLine="tipoArmaCreate.Initialize";
_tipoarmacreate._initialize /*Object*/ (ba);
 //BA.debugLineNum = 37;BA.debugLine="B4XPages.AddPageAndCreate(\"Menu_TipoArma_Create\"";
_b4xpages._addpageandcreate /*String*/ (ba,"Menu_TipoArma_Create",(Object)(_tipoarmacreate));
 };
 //BA.debugLineNum = 39;BA.debugLine="B4XPages.ShowPage(\"Menu_TipoArma_Create\")";
_b4xpages._showpage /*String*/ (ba,"Menu_TipoArma_Create");
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _pnldelete_click() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Private Sub pnlDelete_Click";
 //BA.debugLineNum = 67;BA.debugLine="Log(\"DELETE TIPOARMA\")";
__c.LogImpl("715269889","DELETE TIPOARMA",0);
 //BA.debugLineNum = 69;BA.debugLine="If tipoArmaDelete.IsInitialized = False Then";
if (_tipoarmadelete.IsInitialized /*boolean*/ ()==__c.False) { 
 //BA.debugLineNum = 70;BA.debugLine="tipoArmaDelete.Initialize";
_tipoarmadelete._initialize /*Object*/ (ba);
 //BA.debugLineNum = 71;BA.debugLine="B4XPages.AddPageAndCreate(\"Menu_TipoArma_Delete\"";
_b4xpages._addpageandcreate /*String*/ (ba,"Menu_TipoArma_Delete",(Object)(_tipoarmadelete));
 };
 //BA.debugLineNum = 73;BA.debugLine="B4XPages.ShowPage(\"Menu_TipoArma_Delete\")";
_b4xpages._showpage /*String*/ (ba,"Menu_TipoArma_Delete");
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _pnlread_click() throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Private Sub pnlRead_Click";
 //BA.debugLineNum = 43;BA.debugLine="Log(\"READ TIPOARMA\")";
__c.LogImpl("715400961","READ TIPOARMA",0);
 //BA.debugLineNum = 45;BA.debugLine="If tipoArmaRead.IsInitialized = False Then";
if (_tipoarmaread.IsInitialized /*boolean*/ ()==__c.False) { 
 //BA.debugLineNum = 46;BA.debugLine="tipoArmaRead.Initialize";
_tipoarmaread._initialize /*Object*/ (ba);
 //BA.debugLineNum = 47;BA.debugLine="B4XPages.AddPageAndCreate(\"Menu_TipoArma_Read\",";
_b4xpages._addpageandcreate /*String*/ (ba,"Menu_TipoArma_Read",(Object)(_tipoarmaread));
 };
 //BA.debugLineNum = 50;BA.debugLine="If tipoArmaRead.IsInitialized = True Then";
if (_tipoarmaread.IsInitialized /*boolean*/ ()==__c.True) { 
 //BA.debugLineNum = 51;BA.debugLine="tipoArmaRead.ActulizarPagina";
_tipoarmaread._actulizarpagina /*String*/ ();
 };
 //BA.debugLineNum = 53;BA.debugLine="B4XPages.ShowPage(\"Menu_TipoArma_Read\")";
_b4xpages._showpage /*String*/ (ba,"Menu_TipoArma_Read");
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _pnlupdate_click() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Private Sub pnlUpdate_Click";
 //BA.debugLineNum = 57;BA.debugLine="Log(\"UPDATE TIPOARMA\")";
__c.LogImpl("715335425","UPDATE TIPOARMA",0);
 //BA.debugLineNum = 59;BA.debugLine="If tipoArmaUpdate.IsInitialized = False Then";
if (_tipoarmaupdate.IsInitialized /*boolean*/ ()==__c.False) { 
 //BA.debugLineNum = 60;BA.debugLine="tipoArmaUpdate.Initialize";
_tipoarmaupdate._initialize /*Object*/ (ba);
 //BA.debugLineNum = 61;BA.debugLine="B4XPages.AddPageAndCreate(\"Menu_TipoArma_Update\"";
_b4xpages._addpageandcreate /*String*/ (ba,"Menu_TipoArma_Update",(Object)(_tipoarmaupdate));
 };
 //BA.debugLineNum = 63;BA.debugLine="B4XPages.ShowPage(\"Menu_TipoArma_Update\")";
_b4xpages._showpage /*String*/ (ba,"Menu_TipoArma_Update");
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
