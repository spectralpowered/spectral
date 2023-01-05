import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class class112 extends class106 {
   static int field1389;
   static int field1394;
   boolean field1388 = true;
   boolean field1396;
   int[] field1390;
   long field1391;
   public byte field1393;
   public byte field1395;
   public String field1392 = null;
   public List field1397;

   static {
      new BitSet(65536);
   }

   public class112(class134 var1) {
      this.method589(var1);
   }

   public int[] method585() {
      if (this.field1390 == null) {
         String[] var2 = new String[this.field1397.size()];
         this.field1390 = new int[this.field1397.size()];

         for(int var3 = 0; var3 < this.field1397.size(); this.field1390[var3] = var3++) {
            var2[var3] = ((class278)this.field1397.get(var3)).field2757.method929();
         }

         class233.method1164(var2, this.field1390);
      }

      return this.field1390;
   }

   void method590(class278 var1) {
      this.field1397.add(var1);
      this.field1390 = null;
   }

   void method586(int var1) {
      this.field1397.remove(var1);
      this.field1390 = null;
   }

   public int method587() {
      return this.field1397.size();
   }

   public int method588(String var1) {
      if (!this.field1388) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var3 = 0; var3 < this.field1397.size(); ++var3) {
            if (((class278)this.field1397.get(var3)).field2757.method928().equalsIgnoreCase(var1)) {
               return var3;
            }
         }

         return -1;
      }
   }

   void method589(class134 var1) {
      int var3 = var1.method669();
      if (0 != (var3 & 1)) {
         this.field1396 = true;
      }

      if (0 != (var3 & 2)) {
         this.field1388 = true;
      }

      int var4 = 2;
      if (0 != (var3 & 4)) {
         var4 = var1.method669();
      }

      super.field1361 = var1.method720();
      this.field1391 = var1.method720();
      this.field1392 = var1.method677();
      var1.method675();
      this.field1395 = var1.method670();
      this.field1393 = var1.method670();
      int var5 = var1.method671();
      if (var5 > 0) {
         this.field1397 = new ArrayList(var5);

         for(int var6 = 0; var6 < var5; ++var6) {
            class278 var7 = new class278();
            if (this.field1396) {
               var1.method720();
            }

            if (this.field1388) {
               var7.field2757 = new class174(var1.method677());
            }

            var7.field2759 = var1.method670();
            var7.field2758 = var1.method671();
            if (var4 >= 3) {
               var1.method675();
            }

            this.field1397.add(var6, var7);
         }
      }

   }
}
