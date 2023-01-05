import java.util.HashMap;

public class class427 {
   static {
      new HashMap();
   }

   public static boolean method2039(CharSequence var0) {
      return class142.method775(var0, 10, true);
   }

   public static void method2041(class164 var0, class164 var1, boolean var2, class394 var3) {
      class458.field3757 = var0;
      class61.field819 = var1;
      class172.field1862 = var2;
      class458.field3796 = class458.field3757.method887(10);
      class115.field1411 = var3;
   }

   static Object method2040(class180 var0) {
      if (null == var0) {
         throw new IllegalStateException("popValueOfType() failure - null baseVarType");
      } else {
         switch(var0.field1933) {
         case 0:
            return class150.field1580[--class188.field1989];
         case 1:
            return class150.field1581[--class150.field1582];
         default:
            throw new IllegalStateException("popValueOfType() failure - unsupported type");
         }
      }
   }
}
