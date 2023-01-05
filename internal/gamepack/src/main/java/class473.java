import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class class473 {
   final class404 field3924;
   final class46 field3925;
   final class46 field3927;
   final int field3928;
   final Comparator field3929;
   final Map field3923;
   final long field3926;

   public class473(int var1, class404 var2) {
      this(-1L, var1, var2);
   }

   class473(long var1, int var3, class404 var4) {
      this.field3929 = new class195(this);
      this.field3926 = var1;
      this.field3928 = var3;
      this.field3924 = var4;
      if (this.field3928 == -1) {
         this.field3923 = new HashMap(64);
         this.field3927 = new class46(64, this.field3929);
         this.field3925 = null;
      } else {
         if (null == this.field3924) {
            throw new IllegalArgumentException("");
         }

         this.field3923 = new HashMap(this.field3928);
         this.field3927 = new class46(this.field3928, this.field3929);
         this.field3925 = new class46(this.field3928);
      }

   }

   boolean method2291() {
      return -1 != this.field3928;
   }

   public Object method2294(Object var1) {
      synchronized(this) {
         if (this.field3926 != -1L) {
            this.method2296();
         }

         class433 var4 = (class433)this.field3923.get(var1);
         if (null == var4) {
            return null;
         } else {
            this.method2293(var4, false);
            return var4.field3611;
         }
      }
   }

   public Object method2292(Object var1, Object var2) {
      synchronized(this) {
         if (this.field3926 != -1L) {
            this.method2296();
         }

         class433 var5 = (class433)this.field3923.get(var1);
         if (var5 != null) {
            Object var9 = var5.field3611;
            var5.field3611 = var2;
            this.method2293(var5, false);
            return var9;
         } else {
            class433 var6;
            if (this.method2291() && this.field3923.size() == this.field3928) {
               var6 = (class433)this.field3925.remove();
               this.field3923.remove(var6.field3610);
               this.field3927.remove(var6);
            }

            var6 = new class433(var2, var1);
            this.field3923.put(var1, var6);
            this.method2293(var6, true);
            return null;
         }
      }
   }

   void method2293(class433 var1, boolean var2) {
      if (!var2) {
         this.field3927.remove(var1);
         if (this.method2291() && !this.field3925.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.field3609 = System.currentTimeMillis();
      if (this.method2291()) {
         switch(this.field3924.field3528) {
         case 0:
            var1.field3612 = var1.field3609;
            break;
         case 1:
            ++var1.field3612;
         }

         this.field3925.add(var1);
      }

      this.field3927.add(var1);
   }

   void method2296() {
      if (this.field3926 == -1L) {
         throw new IllegalStateException("");
      } else {
         long var2 = System.currentTimeMillis() - this.field3926;

         while(!this.field3927.isEmpty()) {
            class433 var4 = (class433)this.field3927.peek();
            if (var4.field3609 >= var2) {
               return;
            }

            this.field3923.remove(var4.field3610);
            this.field3927.remove(var4);
            if (this.method2291()) {
               this.field3925.remove(var4);
            }
         }

      }
   }

   public void method2295() {
      synchronized(this) {
         this.field3923.clear();
         this.field3927.clear();
         if (this.method2291()) {
            this.field3925.clear();
         }

      }
   }

   public static void method2289(int var0) {
      class126.field1458 = 1;
      class371.field3293 = null;
      class329.field3069 = -1;
      class126.field1461 = -1;
      class219.field2420 = 0;
      class342.field3145 = false;
      class126.field1460 = var0;
   }

   static void method2290() {
      class74.field860 = (short[][][])null;
      class151.field1592 = (short[][][])null;
      class74.field865 = (byte[][][])null;
      class307.field2897 = (byte[][][])null;
      class15.field132 = (int[][][])null;
      class431.field3603 = (byte[][][])null;
      class74.field862 = (int[][])null;
      class74.field863 = null;
      class157.field1637 = null;
      class74.field870 = null;
      class53.field799 = null;
      class387.field3423 = null;
   }
}
