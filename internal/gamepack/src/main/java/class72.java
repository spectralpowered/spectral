@ObfInfo(
   name = "kp"
)
public class class72 {
   @ObfInfo(
      owner = "kp",
      name = "f",
      desc = "Lra;"
   )
   static class344 field651;
   @ObfInfo(
      owner = "kp",
      name = "r",
      desc = "I"
   )
   static int field652;

   @ObfInfo(
      owner = "kp",
      name = "h",
      desc = "(CI)B"
   )
   public static byte method315(char var0) {
      byte var2;
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 == 8364) {
            var2 = -128;
         } else if (var0 == 8218) {
            var2 = -126;
         } else if (var0 == 402) {
            var2 = -125;
         } else if (var0 == 8222) {
            var2 = -124;
         } else if (var0 == 8230) {
            var2 = -123;
         } else if (var0 == 8224) {
            var2 = -122;
         } else if (var0 == 8225) {
            var2 = -121;
         } else if (var0 == 710) {
            var2 = -120;
         } else if (var0 == 8240) {
            var2 = -119;
         } else if (var0 == 352) {
            var2 = -118;
         } else if (var0 == 8249) {
            var2 = -117;
         } else if (var0 == 338) {
            var2 = -116;
         } else if (var0 == 381) {
            var2 = -114;
         } else if (var0 == 8216) {
            var2 = -111;
         } else if (var0 == 8217) {
            var2 = -110;
         } else if (var0 == 8220) {
            var2 = -109;
         } else if (var0 == 8221) {
            var2 = -108;
         } else if (var0 == 8226) {
            var2 = -107;
         } else if (var0 == 8211) {
            var2 = -106;
         } else if (var0 == 8212) {
            var2 = -105;
         } else if (var0 == 732) {
            var2 = -104;
         } else if (var0 == 8482) {
            var2 = -103;
         } else if (var0 == 353) {
            var2 = -102;
         } else if (var0 == 8250) {
            var2 = -101;
         } else if (var0 == 339) {
            var2 = -100;
         } else if (var0 == 382) {
            var2 = -98;
         } else if (var0 == 376) {
            var2 = -97;
         } else {
            var2 = 63;
         }
      } else {
         var2 = (byte)var0;
      }

      return var2;
   }

   @ObfInfo(
      owner = "kp",
      name = "ln",
      desc = "(II)V"
   )
   static final void method314(int var0) {
      var0 = Math.min(Math.max(var0, 0), 255);
      if (var0 != class50.field574.method2210()) {
         if (class50.field574.method2210() == 0 && client.field476 != -1) {
            class74.method323(class317.field2494, client.field476, 0, var0, false);
            client.field477 = false;
         } else if (var0 == 0) {
            class403.method1988();
            client.field477 = false;
         } else {
            class128.method610(var0);
         }

         class50.field574.method2204(var0);
      }

   }
}
