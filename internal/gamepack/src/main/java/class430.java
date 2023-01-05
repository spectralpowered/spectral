import java.util.Iterator;
import java.util.LinkedList;

public class class430 {
   static class230 field3589;
   static class368 field3600;
   static class416 field3601;
   boolean field3596 = false;
   class308 field3591 = null;
   int field3588 = Integer.MAX_VALUE;
   int field3590 = -1;
   int field3592 = Integer.MAX_VALUE;
   int field3593 = 0;
   int field3594 = -1;
   int field3595 = 0;
   int field3599 = -1;
   String field3587;
   String field3598;
   LinkedList field3597;

   public void method2057(class134 var1, int var2) {
      this.field3599 = var2;
      this.field3587 = var1.method677();
      this.field3598 = var1.method677();
      this.field3591 = new class308(var1.method717());
      this.field3594 = var1.method717();
      var1.method669();
      this.field3596 = var1.method669() == 1;
      this.field3590 = var1.method669();
      int var4 = var1.method669();
      this.field3597 = new LinkedList();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field3597.add(this.method2058(var1));
      }

      this.method2060();
   }

   class256 method2058(class134 var1) {
      int var3 = var1.method669();
      class341[] var4 = new class341[]{class341.field3144, class341.field3139, class341.field3141, class341.field3140};
      class341 var5 = (class341)class296.method1399(var4, var3);
      Object var6 = null;
      switch(var5.field3142) {
      case 0:
         var6 = new class35();
         break;
      case 1:
         var6 = new class315();
         break;
      case 2:
         var6 = new class261();
         break;
      case 3:
         var6 = new class62();
         break;
      default:
         throw new IllegalStateException("");
      }

      ((class256)var6).method1242(var1);
      return (class256)var6;
   }

   public boolean method2076(int var1, int var2, int var3) {
      Iterator var5 = this.field3597.iterator();

      class256 var6;
      do {
         if (!var5.hasNext()) {
            return false;
         }

         var6 = (class256)var5.next();
      } while(!var6.method1240(var1, var2, var3));

      return true;
   }

   public boolean method2062(int var1, int var2) {
      int var4 = var1 / 64;
      int var5 = var2 / 64;
      if (var4 >= this.field3592 && var4 <= this.field3593) {
         if (var5 >= this.field3588 && var5 <= this.field3595) {
            Iterator var6 = this.field3597.iterator();

            class256 var7;
            do {
               if (!var6.hasNext()) {
                  return false;
               }

               var7 = (class256)var6.next();
            } while(!var7.method1239(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int[] method2073(int var1, int var2, int var3) {
      Iterator var5 = this.field3597.iterator();

      class256 var6;
      do {
         if (!var5.hasNext()) {
            return null;
         }

         var6 = (class256)var5.next();
      } while(!var6.method1240(var1, var2, var3));

      return var6.method1241(var1, var2, var3);
   }

   public class308 method2059(int var1, int var2) {
      Iterator var4 = this.field3597.iterator();

      class256 var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (class256)var4.next();
      } while(!var5.method1239(var1, var2));

      return var5.method1243(var1, var2);
   }

   void method2060() {
      Iterator var2 = this.field3597.iterator();

      while(var2.hasNext()) {
         class256 var3 = (class256)var2.next();
         var3.method1244(this);
      }

   }

   public int method2061() {
      return this.field3599;
   }

   public boolean method2074() {
      return this.field3596;
   }

   public String method2063() {
      return this.field3587;
   }

   public String method2075() {
      return this.field3598;
   }

   int method2070() {
      return this.field3594;
   }

   public int method2065() {
      return this.field3590;
   }

   public int method2072() {
      return this.field3592;
   }

   public int method2066() {
      return this.field3593;
   }

   public int method2067() {
      return this.field3588;
   }

   public int method2068() {
      return this.field3595;
   }

   public int method2069() {
      return this.field3591.field2904;
   }

   public int method2078() {
      return this.field3591.field2903;
   }

   public int method2071() {
      return this.field3591.field2905;
   }

   public class308 method2064() {
      return new class308(this.field3591);
   }

   static int method2077(int var0, class472 var1, boolean var2) {
      class210 var4 = var2 ? class142.field1544 : class425.field3580;
      if (var0 == 1800) {
         class150.field1580[++class188.field1989 - 1] = class393.method1910(class172.method913(var4));
         return 1;
      } else if (var0 != 1801) {
         if (var0 == 1802) {
            if (var4.field2216 == null) {
               class150.field1581[++class150.field1582 - 1] = "";
            } else {
               class150.field1581[++class150.field1582 - 1] = var4.field2216;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = class150.field1580[--class188.field1989];
         --var5;
         if (null != var4.field2300 && var5 < var4.field2300.length && var4.field2300[var5] != null) {
            class150.field1581[++class150.field1582 - 1] = var4.field2300[var5];
         } else {
            class150.field1581[++class150.field1582 - 1] = "";
         }

         return 1;
      }
   }
}
