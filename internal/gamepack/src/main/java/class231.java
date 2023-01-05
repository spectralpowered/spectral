import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class231 {
   public static Comparator field2513;
   public static Comparator field2515;
   public static Comparator field2516;
   public static Comparator field2517 = new class100();
   public final List field2514;

   static {
      new class198();
      field2513 = new class462();
      field2515 = new class67();
      field2516 = new class104();
   }

   public class231(class134 var1, boolean var2) {
      int var3 = var1.method671();
      boolean var4 = var1.method669() == 1;
      byte var5;
      if (var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.method671();
      this.field2514 = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.field2514.add(new class87(var1, var5, var3));
      }

   }

   public void method1161(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.field2514, var1);
      } else {
         Collections.sort(this.field2514, Collections.reverseOrder(var1));
      }

   }

   static final void method1160(class183 var0) {
      var0.field1972 = false;
      if (var0.field1970 != null) {
         var0.field1970.field2179 = 0;
      }

      for(class183 var2 = var0.method955(); null != var2; var2 = var0.method958()) {
         method1160(var2);
      }

   }

   static int method1162(int var0) {
      return (int)((Math.log((double)var0) / class150.field1590 - 7.0D) * 256.0D);
   }
}
