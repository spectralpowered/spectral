import javax.imageio.ImageIO;

public class class373 {
   static int field3296;
   static int field3298;
   static long field3297;

   static {
      ImageIO.setUseCache(false);
   }

   static final void method1784() {
      class155.method818(class59.field817, class405.field3533, class11.field60);
      class408.method1993(class272.field2752, class281.field2781);
      if (class59.field817 == class342.field3148 && class318.field3010 == class405.field3533 && class11.field60 == class112.field1394 && class389.field3438 == class272.field2752 && class281.field2781 == class177.field1929) {
         client.field689 = false;
         client.field688 = false;
         class329.field3067 = 0;
         class299.field2882 = 0;
         class297.field2857 = 0;
         class14.field127 = 0;
         class298.field2875 = 0;
         class448.field3689 = 0;
         field3298 = 0;
         class89.field980 = 0;
         class352.field3185 = 0;
         class472.field3922 = 0;
      }

   }

   static final void method1785() {
      for(class260 var1 = (class260)client.field566.method1934(); var1 != null; var1 = (class260)client.field566.method1936()) {
         if (class195.field2036 == var1.field2673 && client.field435 <= var1.field2657) {
            if (client.field435 >= var1.field2661) {
               if (var1.field2660 > 0) {
                  class53 var2 = client.field669[var1.field2660 - 1];
                  if (var2 != null && var2.field297 >= 0 && var2.field297 < 13312 && var2.field233 >= 0 && var2.field233 < 13312) {
                     var1.method1252(var2.field297, var2.field233, class192.method991(var2.field297, var2.field233, var1.field2673) - var1.field2651, client.field435);
                  }
               }

               if (var1.field2660 < 0) {
                  int var3 = -var1.field2660 - 1;
                  class47 var4;
                  if (client.field552 == var3) {
                     var4 = class89.field982;
                  } else {
                     var4 = client.field551[var3];
                  }

                  if (var4 != null && var4.field297 >= 0 && var4.field297 < 13312 && var4.field233 >= 0 && var4.field233 < 13312) {
                     var1.method1252(var4.field297, var4.field233, class192.method991(var4.field297, var4.field233, var1.field2673) - var1.field2651, client.field435);
                  }
               }

               var1.method1253(client.field480);
               class13.field126.method74(class195.field2036, (int)var1.field2662, (int)var1.field2663, (int)var1.field2658, 60, var1, var1.field2670, -1L, false);
            }
         } else {
            var1.method567();
         }
      }

   }

   static void method1786(int var0) {
      if (var0 != -1) {
         if (class25.method126(var0)) {
            class210[] var2 = class71.field853[var0];

            for(int var3 = 0; var3 < var2.length; ++var3) {
               class210 var4 = var2[var3];
               if (var4.field2349 != null) {
                  class169 var5 = new class169();
                  var5.field1848 = var4;
                  var5.field1850 = var4.field2349;
                  class360.method1723(var5, 5000000, 0);
               }
            }

         }
      }
   }
}
