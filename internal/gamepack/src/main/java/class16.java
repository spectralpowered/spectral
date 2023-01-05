import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class16 extends class430 {
   HashSet field133;
   HashSet field134;
   List field135;

   void method97(class134 var1, class134 var2, int var3, boolean var4) {
      this.method2057(var1, var3);
      int var6 = var2.method671();
      this.field133 = new HashSet(var6);

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         class226 var8 = new class226();

         try {
            var8.method1143(var2);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.field133.add(var8);
      }

      var7 = var2.method671();
      this.field134 = new HashSet(var7);

      for(int var13 = 0; var13 < var7; ++var13) {
         class259 var9 = new class259();

         try {
            var9.method1249(var2);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.field134.add(var9);
      }

      this.method96(var2, var4);
   }

   void method96(class134 var1, boolean var2) {
      this.field135 = new LinkedList();
      int var4 = var1.method671();

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var1.method682();
         class308 var7 = new class308(var1.method717());
         boolean var8 = var1.method669() == 1;
         if (var2 || !var8) {
            this.field135.add(new class153((class308)null, var7, var6, (class133)null));
         }
      }

   }

   static void method98(class47 var0, boolean var1) {
      if (null != var0 && var0.method156() && !var0.field407) {
         var0.field405 = false;
         if ((client.field478 && class25.field180 > 50 || class25.field180 > 200) && var1 && var0.field270 == var0.field238) {
            var0.field405 = true;
         }

         int var3 = var0.field297 >> 7;
         int var4 = var0.field233 >> 7;
         if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
            long var5 = class141.method764(0, 0, 0, false, var0.field409);
            if (var0.field400 != null && client.field435 >= var0.field412 && client.field435 < var0.field396) {
               var0.field405 = false;
               var0.field395 = class192.method991(var0.field297, var0.field233, class195.field2036);
               var0.field237 = client.field435;
               class13.field126.method40(class195.field2036, var0.field297, var0.field233, var0.field395, 60, var0, var0.field247, var5, var0.field414, var0.field402, var0.field398, var0.field394);
            } else {
               if ((var0.field297 & 127) == 64 && 64 == (var0.field233 & 127)) {
                  if (client.field532[var3][var4] == client.field533) {
                     return;
                  }

                  client.field532[var3][var4] = client.field533;
               }

               var0.field395 = class192.method991(var0.field297, var0.field233, class195.field2036);
               var0.field237 = client.field435;
               class13.field126.method74(class195.field2036, var0.field297, var0.field233, var0.field395, 60, var0, var0.field247, var5, var0.field234);
            }
         }
      }

   }
}
