import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfInfo(
   name = "nx"
)
public class class325 implements Iterator {
   @ObfInfo(
      owner = "nx",
      name = "hq",
      desc = "I"
   )
   static int field2575;
   @ObfInfo(
      owner = "nx",
      name = "h",
      desc = "Lnm;"
   )
   class335 field2572;
   @ObfInfo(
      owner = "nx",
      name = "e",
      desc = "I"
   )
   int field2573 = 0;
   @ObfInfo(
      owner = "nx",
      name = "v",
      desc = "I"
   )
   int field2574;

   @ObfInfo(
      owner = "nx",
      name = "<init>",
      desc = "(Lnm;)V"
   )
   class325(class335 var1) {
      this.field2574 = this.field2572.field2687;
      this.field2572 = var1;
   }

   @ObfInfo(
      owner = "nx",
      name = "hasNext",
      desc = "()Z"
   )
   public boolean hasNext() {
      return this.field2573 < this.field2572.field2685;
   }

   @ObfInfo(
      owner = "nx",
      name = "next",
      desc = "()Ljava/lang/Object;"
   )
   public Object next() {
      if (this.field2572.field2687 != this.field2574) {
         throw new ConcurrentModificationException();
      } else if (this.field2573 < this.field2572.field2685) {
         Object var1 = this.field2572.field2688[this.field2573].field3668;
         ++this.field2573;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   @ObfInfo(
      owner = "nx",
      name = "remove",
      desc = "()V"
   )
   public void remove() {
      throw new UnsupportedOperationException();
   }

   @ObfInfo(
      owner = "nx",
      name = "l",
      desc = "(ILbm;ZI)I"
   )
   static int method1660(int var0, class461 var1, boolean var2) {
      class120 var4;
      if (var0 != 1927 && var0 != 2927) {
         int var9;
         if (var0 == 1928) {
            var4 = var2 ? class108.field822 : class37.field183;
            var9 = class386.field3248[--class161.field1227];
            if (var9 >= 1 && var9 <= 10) {
               class122 var10 = new class122(var9, var4.field985, var4.field895, var4.field898);
               class386.field3255.add(var10);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 2928) {
            class161.field1227 -= 3;
            int var8 = class386.field3248[class161.field1227];
            var9 = class386.field3248[1 + class161.field1227];
            int var6 = class386.field3248[class161.field1227 + 2];
            if (var6 >= 1 && var6 <= 10) {
               class122 var7 = new class122(var6, var8, var9, class67.method299(var8).field898);
               class386.field3255.add(var7);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else {
            return 2;
         }
      } else if (class386.field3259 >= 10) {
         throw new RuntimeException();
      } else {
         if (var0 >= 2000) {
            var4 = class67.method299(class386.field3248[--class161.field1227]);
         } else {
            var4 = var2 ? class108.field822 : class37.field183;
         }

         if (var4.field1016 == null) {
            return 0;
         } else {
            class488 var5 = new class488();
            var5.field4067 = var4;
            var5.field4069 = var4.field1016;
            var5.field4074 = 1 + class386.field3259;
            client.field295.method642(var5);
            return 1;
         }
      }
   }
}
