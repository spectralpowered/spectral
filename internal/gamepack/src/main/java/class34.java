import java.awt.Component;

public class class34 implements class445 {
   static int field334;
   static final class34 field329 = new class34(1);
   static final class34 field331 = new class34(3);
   static final class34 field332 = new class34(4);
   static final class34 field333 = new class34(2);
   static final class34 field335 = new class34(0);
   final int field330;

   class34(int var1) {
      this.field330 = var1;
   }

   public int method2118() {
      return this.field330;
   }

   static void method168(Component var0) {
      var0.removeMouseListener(class182.field1951);
      var0.removeMouseMotionListener(class182.field1951);
      var0.removeFocusListener(class182.field1951);
      class182.field1950 = 0;
   }

   public static class210 method169(int var0, int var1) {
      class210 var3 = class274.method1301(var0);
      if (var1 == -1) {
         return var3;
      } else {
         return null != var3 && null != var3.field2353 && var1 < var3.field2353.length ? var3.field2353[var1] : null;
      }
   }

   static int method172(int var0) {
      return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
   }

   static void method170(int var0, class308 var1, boolean var2) {
      class430 var4 = client.method289().method1847(var0);
      int var5 = class89.field982.field408;
      int var6 = class381.field3325 + (class89.field982.field297 >> 7);
      int var7 = class345.field3166 + (class89.field982.field233 >> 7);
      class308 var8 = new class308(var5, var6, var7);
      client.method289().method1869(var4, var8, var1, var2);
   }
}
