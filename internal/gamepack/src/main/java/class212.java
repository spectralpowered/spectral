import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfInfo(
   name = "im"
)
public class class212 implements class78 {
   @ObfInfo(
      owner = "im",
      name = "v",
      desc = "Lim;"
   )
   static final class212 field1835 = new class212(0, (byte)2);
   @ObfInfo(
      owner = "im",
      name = "e",
      desc = "Lim;"
   )
   static final class212 field1836 = new class212(3, (byte)1);
   @ObfInfo(
      owner = "im",
      name = "h",
      desc = "Lim;"
   )
   static final class212 field1837 = new class212(2, (byte)0);
   @ObfInfo(
      owner = "im",
      name = "x",
      desc = "Lim;"
   )
   static final class212 field1840 = new class212(1, (byte)3);
   @ObfInfo(
      owner = "im",
      name = "q",
      desc = "B"
   )
   final byte field1839;
   @ObfInfo(
      owner = "im",
      name = "m",
      desc = "I"
   )
   final int field1838;

   @ObfInfo(
      owner = "im",
      name = "<init>",
      desc = "(IB)V"
   )
   class212(int var1, byte var2) {
      this.field1838 = var1;
      this.field1839 = var2;
   }

   @ObfInfo(
      owner = "im",
      name = "e",
      desc = "(B)I"
   )
   public int method330() {
      return this.field1839;
   }

   @ObfInfo(
      owner = "im",
      name = "h",
      desc = "(Lly;Lly;I)V"
   )
   public static void method916(class274 var0, class274 var1) {
      class327.field2580 = var0;
      class327.field2591 = var1;
   }

   @ObfInfo(
      owner = "im",
      name = "m",
      desc = "(I)V"
   )
   public static void method919() {
      try {
         File var1 = new File(class134.field1109, "random.dat");
         int var3;
         if (var1.exists()) {
            class25.field115 = new class435(new class455(var1, "rw", 25L), 24, 0);
         } else {
            label34:
            for(int var2 = 0; var2 < class306.field2457.length; ++var2) {
               for(var3 = 0; var3 < class293.field2384.length; ++var3) {
                  File var4 = new File(class293.field2384[var3] + class306.field2457[var2] + File.separatorChar + "random.dat");
                  if (var4.exists()) {
                     class25.field115 = new class435(new class455(var4, "rw", 25L), 24, 0);
                     break label34;
                  }
               }
            }
         }

         if (null == class25.field115) {
            RandomAccessFile var6 = new RandomAccessFile(var1, "rw");
            var3 = var6.read();
            var6.seek(0L);
            var6.write(var3);
            var6.seek(0L);
            var6.close();
            class25.field115 = new class435(new class455(var1, "rw", 25L), 24, 0);
         }
      } catch (IOException var5) {
         ;
      }

   }

   @ObfInfo(
      owner = "im",
      name = "l",
      desc = "(III)I"
   )
   static final int method917(int var0, int var1) {
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

   @ObfInfo(
      owner = "im",
      name = "ji",
      desc = "(I)V"
   )
   static void method915() {
      client.field369 = 0;
      client.field368 = false;
   }

   @ObfInfo(
      owner = "im",
      name = "lx",
      desc = "(I)V"
   )
   static final void method918() {
      class299 var1 = class480.method2370(class356.field2982, client.field279.field4042);
      client.field279.method2389(var1);
      class386.field3256 = true;

      for(class415 var2 = (class415)client.field394.method789(); var2 != null; var2 = (class415)client.field394.method790()) {
         if (0 == var2.field3424 || 3 == var2.field3424) {
            class374.method1848(var2, true, (byte)87);
         }
      }

      if (client.field399 != null) {
         class184.method836(client.field399);
         client.field399 = null;
      }

      class386.field3256 = false;
   }
}
