import java.util.Comparator;
import java.util.Map.Entry;

class class304 implements Comparator {
   public static class164 field2893;
   // $FF: synthetic field
   final class201 this$0;

   class304(class201 var1) {
      this.this$0 = var1;
   }

   int method1432(Entry var1, Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }

   public int compare(Object var1, Object var2) {
      return this.method1432((Entry)var1, (Entry)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static int method1434(int var0, int var1, int var2) {
      var2 &= 3;
      if (var2 == 0) {
         return var1;
      } else if (var2 == 1) {
         return 7 - var0;
      } else {
         return var2 == 2 ? 7 - var1 : var0;
      }
   }

   public static int method1437(int var0) {
      return var0 != 0 && var0 != 1 ? -1 : 0;
   }

   static int method1435(int var0, int var1) {
      class233 var3 = (class233)class233.field2522.method545((long)var0);
      if (null == var3) {
         return -1;
      } else {
         return var1 >= 0 && var1 < var3.field2520.length ? var3.field2520[var1] : -1;
      }
   }

   static final void method1436(class210 var0, int var1, byte[] var2, byte[] var3) {
      if (null == var0.field2295) {
         if (null == var2) {
            return;
         }

         var0.field2295 = new byte[11][];
         var0.field2296 = new byte[11][];
         var0.field2303 = new int[11];
         var0.field2298 = new int[11];
      }

      var0.field2295[var1] = var2;
      if (var2 != null) {
         var0.field2294 = true;
      } else {
         var0.field2294 = false;

         for(int var5 = 0; var5 < var0.field2295.length; ++var5) {
            if (var0.field2295[var5] != null) {
               var0.field2294 = true;
               break;
            }
         }
      }

      var0.field2296[var1] = var3;
   }

   static void method1433(class230 var0, String var1) {
      class97 var3 = new class97(var0, var1);
      client.field719.add(var3);
      client.field721 += var3.field1343;
   }

   static final void method1431(class210 var0, int var1, int var2) {
      if (client.field610 == null && !client.field572) {
         if (var0 != null && class61.method340(var0) != null) {
            client.field610 = var0;
            client.field611 = class61.method340(var0);
            client.field612 = var1;
            client.field613 = var2;
            class188.field1982 = 0;
            client.field621 = false;
            int var4 = client.field573 - 1;
            if (var4 != -1) {
               class13.method84(var4);
            }

         }
      }
   }

   static final void method1438(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      class111.field1385.method1327(var0);
   }
}
