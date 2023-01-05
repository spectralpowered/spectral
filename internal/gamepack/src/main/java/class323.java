@ObfInfo(
   name = "al"
)
public class class323 {
   @ObfInfo(
      owner = "al",
      name = "h",
      desc = "Lmv;"
   )
   public static class395 field2565 = new class395();

   @ObfInfo(
      owner = "al",
      name = "r",
      desc = "(I)Z"
   )
   public static boolean method1652() {
      try {
         if (2 == class40.field201) {
            if (class40.field205 == null) {
               class40.field205 = class86.method359(class253.field2089, class342.field2747, class40.field204);
               if (class40.field205 == null) {
                  return false;
               }
            }

            if (null == class201.field1752) {
               class201.field1752 = new class73(class40.field206, class40.field200);
            }

            if (class230.field1943.method2402(class40.field205, class40.field202, class201.field1752, 22050)) {
               class230.field1943.method2403();
               class230.field1943.method2427(class489.field4078);
               class230.field1943.method2429(class40.field205, class463.field3847);
               class40.field201 = 0;
               class40.field205 = null;
               class201.field1752 = null;
               class253.field2089 = null;
               return true;
            }
         }
      } catch (Exception var2) {
         var2.printStackTrace();
         class230.field1943.method2405();
         class40.field201 = 0;
         class40.field205 = null;
         class201.field1752 = null;
         class253.field2089 = null;
      }

      return false;
   }

   @ObfInfo(
      owner = "al",
      name = "ka",
      desc = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V"
   )
   static final void method1653(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (!client.field368) {
         if (client.field369 < 500) {
            client.field375[client.field369] = var0;
            client.field256[client.field369] = var1;
            client.field463[client.field369] = var2;
            client.field333[client.field369] = var3;
            client.field370[client.field369] = var4;
            client.field363[client.field369] = var5;
            client.field374[client.field369] = var6;
            client.field377[client.field369] = var7;
            ++client.field369;
         }

      }
   }

   @ObfInfo(
      owner = "al",
      name = "ny",
      desc = "(IS)V"
   )
   static void method1654(int var0) {
      if (var0 != client.field220) {
         client.field220 = var0;
      }
   }
}
