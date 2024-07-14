package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class arma_menu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.arma_menu");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.arma_menu.class).invoke(this, new Object[] {null});
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
public b4a.example.arma_menu_create _createarma = null;
public b4a.example.arma_menu_read _readarma = null;
public b4a.example.arma_menu_update _updatearma = null;
public b4a.example.arma_menu_delete _deletearma = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 21;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"Menu_Arma\")";
_root.LoadLayout("Menu_Arma",ba);
 //BA.debugLineNum = 23;BA.debugLine="imgCreate.Bitmap = LoadBitmap(File.DirAssets,\"swo";
_imgcreate.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"swords.png").getObject()));
 //BA.debugLineNum = 24;BA.debugLine="imgRead.Bitmap = LoadBitmap(File.DirAssets,\"book.";
_imgread.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"book.png").getObject()));
 //BA.debugLineNum = 25;BA.debugLine="imgUpdate.Bitmap = LoadBitmap(File.DirAssets,\"edi";
_imgupdate.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"edit.png").getObject()));
 //BA.debugLineNum = 26;BA.debugLine="imgDelete.Bitmap = LoadBitmap(File.DirAssets,\"del";
_imgdelete.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"delete.png").getObject()));
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 8;BA.debugLine="Private createArma As Arma_Menu_Create";
_createarma = new b4a.example.arma_menu_create();
 //BA.debugLineNum = 9;BA.debugLine="Private readArma As Arma_Menu_Read";
_readarma = new b4a.example.arma_menu_read();
 //BA.debugLineNum = 10;BA.debugLine="Private updateArma As Arma_Menu_Update";
_updatearma = new b4a.example.arma_menu_update();
 //BA.debugLineNum = 11;BA.debugLine="Private deleteArma As Arma_Menu_Delete";
_deletearma = new b4a.example.arma_menu_delete();
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
 //BA.debugLineNum = 31;BA.debugLine="Private Sub pnlCreate_Click";
 //BA.debugLineNum = 32;BA.debugLine="Log(\"CREATE ARMA\")";
__c.LogImpl("715007745","CREATE ARMA",0);
 //BA.debugLineNum = 34;BA.debugLine="If createArma.IsInitialized = False Then";
if (_createarma.IsInitialized /*boolean*/ ()==__c.False) { 
 //BA.debugLineNum = 35;BA.debugLine="createArma.Initialize";
_createarma._initialize /*Object*/ (ba);
 //BA.debugLineNum = 36;BA.debugLine="B4XPages.AddPageAndCreate(\"Arma_Menu_Create\", cr";
_b4xpages._addpageandcreate /*String*/ (ba,"Arma_Menu_Create",(Object)(_createarma));
 };
 //BA.debugLineNum = 38;BA.debugLine="B4XPages.ShowPage(\"Arma_Menu_Create\")";
_b4xpages._showpage /*String*/ (ba,"Arma_Menu_Create");
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _pnldelete_click() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Private Sub pnlDelete_Click";
 //BA.debugLineNum = 65;BA.debugLine="Log(\"DELETE ARMA\")";
__c.LogImpl("715204353","DELETE ARMA",0);
 //BA.debugLineNum = 67;BA.debugLine="If deleteArma.IsInitialized = False Then";
if (_deletearma.IsInitialized /*boolean*/ ()==__c.False) { 
 //BA.debugLineNum = 68;BA.debugLine="deleteArma.Initialize";
_deletearma._initialize /*Object*/ (ba);
 //BA.debugLineNum = 69;BA.debugLine="B4XPages.AddPageAndCreate(\"Arma_Menu_Delete\", de";
_b4xpages._addpageandcreate /*String*/ (ba,"Arma_Menu_Delete",(Object)(_deletearma));
 };
 //BA.debugLineNum = 71;BA.debugLine="B4XPages.ShowPage(\"Arma_Menu_Delete\")";
_b4xpages._showpage /*String*/ (ba,"Arma_Menu_Delete");
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public String  _pnlread_click() throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Private Sub pnlRead_Click";
 //BA.debugLineNum = 42;BA.debugLine="Log(\"READ ARMA\")";
__c.LogImpl("715073281","READ ARMA",0);
 //BA.debugLineNum = 43;BA.debugLine="If readArma.IsInitialized = True Then";
if (_readarma.IsInitialized /*boolean*/ ()==__c.True) { 
 //BA.debugLineNum = 44;BA.debugLine="readArma.ActulizarPagina";
_readarma._actulizarpagina /*String*/ ();
 };
 //BA.debugLineNum = 47;BA.debugLine="If readArma.IsInitialized = False Then";
if (_readarma.IsInitialized /*boolean*/ ()==__c.False) { 
 //BA.debugLineNum = 48;BA.debugLine="readArma.Initialize";
_readarma._initialize /*Object*/ (ba);
 //BA.debugLineNum = 49;BA.debugLine="B4XPages.AddPageAndCreate(\"Arma_Menu_Read\", read";
_b4xpages._addpageandcreate /*String*/ (ba,"Arma_Menu_Read",(Object)(_readarma));
 };
 //BA.debugLineNum = 51;BA.debugLine="B4XPages.ShowPage(\"Arma_Menu_Read\")";
_b4xpages._showpage /*String*/ (ba,"Arma_Menu_Read");
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _pnlupdate_click() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Private Sub pnlUpdate_Click";
 //BA.debugLineNum = 55;BA.debugLine="Log(\"UPDATE ARMA\")";
__c.LogImpl("715138817","UPDATE ARMA",0);
 //BA.debugLineNum = 57;BA.debugLine="If updateArma.IsInitialized = False Then";
if (_updatearma.IsInitialized /*boolean*/ ()==__c.False) { 
 //BA.debugLineNum = 58;BA.debugLine="updateArma.Initialize";
_updatearma._initialize /*Object*/ (ba);
 //BA.debugLineNum = 59;BA.debugLine="B4XPages.AddPageAndCreate(\"Arma_Menu_Update\", up";
_b4xpages._addpageandcreate /*String*/ (ba,"Arma_Menu_Update",(Object)(_updatearma));
 };
 //BA.debugLineNum = 61;BA.debugLine="B4XPages.ShowPage(\"Arma_Menu_Update\")";
_b4xpages._showpage /*String*/ (ba,"Arma_Menu_Update");
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
