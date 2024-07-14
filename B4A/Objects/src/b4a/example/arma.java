package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class arma extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.arma");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.arma.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _nombre = "";
public String _descripcion = "";
public int _rareza = 0;
public int _atk = 0;
public double _crit_dmg = 0;
public int _cantidad = 0;
public String _id = "";
public String _tipo_armaid = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public nombre As String";
_nombre = "";
 //BA.debugLineNum = 3;BA.debugLine="Public descripcion As String";
_descripcion = "";
 //BA.debugLineNum = 4;BA.debugLine="Public rareza As Int";
_rareza = 0;
 //BA.debugLineNum = 5;BA.debugLine="Public atk As Int";
_atk = 0;
 //BA.debugLineNum = 6;BA.debugLine="Public crit_Dmg As Double";
_crit_dmg = 0;
 //BA.debugLineNum = 7;BA.debugLine="Public cantidad As Int";
_cantidad = 0;
 //BA.debugLineNum = 8;BA.debugLine="Public id  As String";
_id = "";
 //BA.debugLineNum = 9;BA.debugLine="Public Tipo_ArmaId As String";
_tipo_armaid = "";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _tomap() throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 18;BA.debugLine="Public Sub ToMap As Map";
 //BA.debugLineNum = 19;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 20;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 21;BA.debugLine="m.Put(\"nombre\", nombre)";
_m.Put((Object)("nombre"),(Object)(_nombre));
 //BA.debugLineNum = 22;BA.debugLine="m.Put(\"descripcion\", descripcion)";
_m.Put((Object)("descripcion"),(Object)(_descripcion));
 //BA.debugLineNum = 23;BA.debugLine="m.Put(\"rareza\", rareza)";
_m.Put((Object)("rareza"),(Object)(_rareza));
 //BA.debugLineNum = 24;BA.debugLine="m.Put(\"atk\", atk)";
_m.Put((Object)("atk"),(Object)(_atk));
 //BA.debugLineNum = 25;BA.debugLine="m.Put(\"crit_Dmg\", crit_Dmg)";
_m.Put((Object)("crit_Dmg"),(Object)(_crit_dmg));
 //BA.debugLineNum = 26;BA.debugLine="m.Put(\"cantidad\", cantidad)";
_m.Put((Object)("cantidad"),(Object)(_cantidad));
 //BA.debugLineNum = 27;BA.debugLine="m.Put(\"Tipo_ArmaId\", Tipo_ArmaId)";
_m.Put((Object)("Tipo_ArmaId"),(Object)(_tipo_armaid));
 //BA.debugLineNum = 28;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
