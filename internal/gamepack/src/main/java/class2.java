import java.io.File;
import java.io.RandomAccessFile;

public class class2 {
   public static final class2 field10 = new class2(1, 2, 0);
   public static final class2 field8 = new class2(0, 1, 2);
   public static final class2 field9 = new class2(2, 0, 4);
   static long field7;
   final int field11;
   final int field12;
   final int field13;

   class2(int var1, int var2, int var3) {
      this.field12 = var1;
      this.field11 = var2;
      this.field13 = var3;
   }

   boolean method8(float var1) {
      return var1 >= (float)this.field13;
   }

   static class2[] method5() {
      return new class2[]{field8, field10, field9};
   }

   public static boolean method9(char var0) {
      return var0 >= '0' && var0 <= '9';
   }

   public static boolean method7(File var0, boolean var1) {
      try {
         RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
         int var4 = var3.read();
         var3.seek(0L);
         var3.write(var4);
         var3.seek(0L);
         var3.close();
         if (var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var5) {
         return false;
      }
   }

   static int method6(int var0, class472 var1, boolean var2) {
      if (var0 == 7463) {
         boolean var4 = class150.field1580[--class188.field1989] == 1;
         class395.method1922(var4);
         return 1;
      } else {
         return 2;
      }
   }

   static void method10(int var0, int var1) {
      class167.method898(class474.field3931, var0, var1);
      class474.field3931 = null;
   }
}
