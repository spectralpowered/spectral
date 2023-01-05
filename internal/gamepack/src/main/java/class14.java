public abstract class class14 extends class115 implements class4 {
   static int field127;
   static String[] field128;

   protected class14(class340 var1, class22 var2, int var3) {
      super(var1, var2, var3);
   }

   protected abstract class419 method89(int var1);

   public int method88() {
      return super.field1410;
   }

   public Object method13(int var1) {
      class419 var3 = this.method89(var1);
      return var3 != null && var3.method2013() ? var3.method2014() : null;
   }

   public class426 method90(class134 var1) {
      int var3 = var1.method671();
      class419 var4 = this.method89(var3);
      class426 var5 = new class426(var3);
      Class var6 = var4.field3565.field1935;
      if (var6 == Integer.class) {
         var5.field3582 = var1.method717();
      } else if (var6 == Long.class) {
         var5.field3582 = var1.method720();
      } else if (var6 == String.class) {
         var5.field3582 = var1.method678();
      } else {
         if (!class284.class.isAssignableFrom(var6)) {
            throw new IllegalStateException();
         }

         try {
            class284 var7 = (class284)var6.newInstance();
            var7.method1355(var1);
            var5.field3582 = var7;
         } catch (InstantiationException var8) {
            ;
         } catch (IllegalAccessException var9) {
            ;
         }
      }

      return var5;
   }
}
