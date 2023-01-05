@ObfInfo(
   name = "or"
)
public abstract class class4 extends class439 implements class51 {
   @ObfInfo(
      owner = "or",
      name = "tv",
      desc = "I"
   )
   static int field25;
   @ObfInfo(
      owner = "or",
      name = "m",
      desc = "[Ljava/lang/String;"
   )
   static String[] field26;

   @ObfInfo(
      owner = "or",
      name = "<init>",
      desc = "(Llw;Lmb;I)V"
   )
   protected class4(class493 var1, class476 var2, int var3) {
      super(var1, var2, var3);
   }

   @ObfInfo(
      owner = "or",
      name = "h",
      desc = "(II)Lpv;"
   )
   protected abstract class379 method22(int var1);

   @ObfInfo(
      owner = "or",
      name = "e",
      desc = "(B)I"
   )
   public int method20() {
      return super.field3646;
   }

   @ObfInfo(
      owner = "or",
      name = "v",
      desc = "(II)Ljava/lang/Object;"
   )
   public Object method259(int var1) {
      class379 var3 = this.method22(var1);
      return var3 != null && var3.method1866() ? var3.method1867() : null;
   }

   @ObfInfo(
      owner = "or",
      name = "x",
      desc = "(Lqy;I)Lrz;"
   )
   public class331 method23(class127 var1) {
      int var3 = var1.method549();
      class379 var4 = this.method22(var3);
      class331 var5 = new class331(var3);
      Class var6 = var4.field3192.field1691;
      if (var6 == Integer.class) {
         var5.field2602 = var1.method595();
      } else if (var6 == Long.class) {
         var5.field2602 = var1.method598();
      } else if (var6 == String.class) {
         var5.field2602 = var1.method556();
      } else {
         if (!class153.class.isAssignableFrom(var6)) {
            throw new IllegalStateException();
         }

         try {
            class153 var7 = (class153)var6.newInstance();
            var7.method714(var1);
            var5.field2602 = var7;
         } catch (InstantiationException var8) {
            ;
         } catch (IllegalAccessException var9) {
            ;
         }
      }

      return var5;
   }
}
