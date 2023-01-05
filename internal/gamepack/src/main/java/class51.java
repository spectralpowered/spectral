import java.io.File;
import java.util.Hashtable;

public class class51 {
   static boolean field751 = false;
   static File field752;
   static Hashtable field753 = new Hashtable(16);
   static long field754;

   static int method291(int var0, class472 var1, boolean var2) {
      int var4;
      if (var0 == 3500) {
         var4 = class150.field1580[--class188.field1989];
         class150.field1580[++class188.field1989 - 1] = client.field664.method2272(var4) ? 1 : 0;
         return 1;
      } else if (var0 == 3501) {
         var4 = class150.field1580[--class188.field1989];
         class150.field1580[++class188.field1989 - 1] = client.field664.method2277(var4) ? 1 : 0;
         return 1;
      } else if (var0 == 3502) {
         var4 = class150.field1580[--class188.field1989];
         class150.field1580[++class188.field1989 - 1] = client.field664.method2271(var4) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   static final void method292(double var0) {
      class234.method1166(var0);
      ((class118)class234.field2528).method614(var0);
      class458.field3761.method162();
      class111.field1385.method1343(var0);
   }
}
