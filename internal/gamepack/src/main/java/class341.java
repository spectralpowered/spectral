import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class class341 implements class445 {
   static final class341 field3139 = new class341(0, (byte)2);
   static final class341 field3140 = new class341(3, (byte)1);
   static final class341 field3141 = new class341(2, (byte)0);
   static final class341 field3144 = new class341(1, (byte)3);
   final byte field3143;
   final int field3142;

   class341(int var1, byte var2) {
      this.field3142 = var1;
      this.field3143 = var2;
   }

   public int method2118() {
      return this.field3143;
   }

   public static void method1635(class164 var0, class164 var1) {
      class192.field1994 = var0;
      class192.field2005 = var1;
   }

   public static void method1638() {
      try {
         File var1 = new File(class131.field1474, "random.dat");
         int var3;
         if (var1.exists()) {
            class143.field1548 = new class443(new class476(var1, "rw", 25L), 24, 0);
         } else {
            label34:
            for(int var2 = 0; var2 < class137.field1497.length; ++var2) {
               for(var3 = 0; var3 < class109.field1379.length; ++var3) {
                  File var4 = new File(class109.field1379[var3] + class137.field1497[var2] + File.separatorChar + "random.dat");
                  if (var4.exists()) {
                     class143.field1548 = new class443(new class476(var4, "rw", 25L), 24, 0);
                     break label34;
                  }
               }
            }
         }

         if (null == class143.field1548) {
            RandomAccessFile var6 = new RandomAccessFile(var1, "rw");
            var3 = var6.read();
            var6.seek(0L);
            var6.write(var3);
            var6.seek(0L);
            var6.close();
            class143.field1548 = new class443(new class476(var1, "rw", 25L), 24, 0);
         }
      } catch (IOException var5) {
         ;
      }

   }

   static final int method1636(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & 'ﾀ');
      }
   }

   static void method1634() {
      client.field573 = 0;
      client.field572 = false;
   }

   static final void method1637() {
      class81 var1 = class189.method982(class165.field1768, client.field483.field3459);
      client.field483.method1920(var1);
      class150.field1588 = true;

      for(class240 var2 = (class240)client.field598.method543(); var2 != null; var2 = (class240)client.field598.method544()) {
         if (0 == var2.field2578 || 3 == var2.field2578) {
            class328.method1590(var2, true, (byte)87);
         }
      }

      if (client.field603 != null) {
         class214.method1117(client.field603);
         client.field603 = null;
      }

      class150.field1588 = false;
   }
}
