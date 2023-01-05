import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class class345 implements Iterator {
   static int field3166;
   class46 field3163;
   int field3164 = 0;
   int field3165;

   class345(class46 var1) {
      this.field3165 = this.field3163.field385;
      this.field3163 = var1;
   }

   public boolean hasNext() {
      return this.field3164 < this.field3163.field383;
   }

   public Object next() {
      if (this.field3163.field385 != this.field3165) {
         throw new ConcurrentModificationException();
      } else if (this.field3164 < this.field3163.field383) {
         Object var1 = this.field3163.field386[this.field3164].field2609;
         ++this.field3164;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

   static int method1659(int var0, class472 var1, boolean var2) {
      class210 var4;
      if (var0 != 1927 && var0 != 2927) {
         int var9;
         if (var0 == 1928) {
            var4 = var2 ? class142.field1544 : class425.field3580;
            var9 = class150.field1580[--class188.field1989];
            if (var9 >= 1 && var9 <= 10) {
               class356 var10 = new class356(var9, var4.field2307, var4.field2217, var4.field2220);
               class150.field1587.add(var10);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 2928) {
            class188.field1989 -= 3;
            int var8 = class150.field1580[class188.field1989];
            var9 = class150.field1580[1 + class188.field1989];
            int var6 = class150.field1580[class188.field1989 + 2];
            if (var6 >= 1 && var6 <= 10) {
               class356 var7 = new class356(var6, var8, var9, class274.method1301(var8).field2220);
               class150.field1587.add(var7);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else {
            return 2;
         }
      } else if (class150.field1591 >= 10) {
         throw new RuntimeException();
      } else {
         if (var0 >= 2000) {
            var4 = class274.method1301(class150.field1580[--class188.field1989]);
         } else {
            var4 = var2 ? class142.field1544 : class425.field3580;
         }

         if (var4.field2338 == null) {
            return 0;
         } else {
            class169 var5 = new class169();
            var5.field1848 = var4;
            var5.field1850 = var4.field2338;
            var5.field1855 = 1 + class150.field1591;
            client.field499.method1930(var5);
            return 1;
         }
      }
   }
}
