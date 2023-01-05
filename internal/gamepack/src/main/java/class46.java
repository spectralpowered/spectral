import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class46 extends AbstractQueue {
   class246[] field386;
   int field383;
   int field385;
   Map field382;
   final Comparator field384;

   public class46(int var1) {
      this(var1, (Comparator)null);
   }

   public class46(int var1, Comparator var2) {
      this.field385 = 0;
      this.field386 = new class246[var1];
      this.field382 = new HashMap();
      this.field384 = var2;
   }

   void method235() {
      int var2 = 1 + (this.field386.length << 1);
      this.field386 = (class246[])((class246[])Arrays.copyOf(this.field386, var2));
   }

   public int size() {
      return this.field383;
   }

   public boolean offer(Object var1) {
      if (this.field382.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         ++this.field385;
         int var2 = this.field383;
         if (var2 >= this.field386.length) {
            this.method235();
         }

         ++this.field383;
         if (var2 == 0) {
            this.field386[0] = new class246(var1, 0);
            this.field382.put(var1, this.field386[0]);
         } else {
            this.field386[var2] = new class246(var1, var2);
            this.field382.put(var1, this.field386[var2]);
            this.method233(var2);
         }

         return true;
      }
   }

   public Object peek() {
      return this.field383 == 0 ? null : this.field386[0].field2609;
   }

   public Object poll() {
      if (0 == this.field383) {
         return null;
      } else {
         ++this.field385;
         Object var1 = this.field386[0].field2609;
         this.field382.remove(var1);
         --this.field383;
         if (this.field383 == 0) {
            this.field386[this.field383] = null;
         } else {
            this.field386[0] = this.field386[this.field383];
            this.field386[0].field2610 = 0;
            this.field386[this.field383] = null;
            this.method234(0);
         }

         return var1;
      }
   }

   public boolean remove(Object var1) {
      class246 var2 = (class246)this.field382.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         ++this.field385;
         --this.field383;
         if (this.field383 == var2.field2610) {
            this.field386[this.field383] = null;
            return true;
         } else {
            class246 var3 = this.field386[this.field383];
            this.field386[this.field383] = null;
            this.field386[var2.field2610] = var3;
            this.field386[var2.field2610].field2610 = var2.field2610;
            this.method234(var2.field2610);
            if (var3 == this.field386[var2.field2610]) {
               this.method233(var2.field2610);
            }

            return true;
         }
      }
   }

   void method233(int var1) {
      class246 var3;
      int var4;
      for(var3 = this.field386[var1]; var1 > 0; var1 = var4) {
         var4 = var1 - 1 >>> 1;
         class246 var5 = this.field386[var4];
         if (this.field384 != null) {
            if (this.field384.compare(var3.field2609, var5.field2609) >= 0) {
               break;
            }
         } else if (((Comparable)var3.field2609).compareTo(var5.field2609) >= 0) {
            break;
         }

         this.field386[var1] = var5;
         this.field386[var1].field2610 = var1;
      }

      this.field386[var1] = var3;
      this.field386[var1].field2610 = var1;
   }

   void method234(int var1) {
      class246 var3 = this.field386[var1];

      int var9;
      for(int var4 = this.field383 >>> 1; var1 < var4; var1 = var9) {
         int var5 = 1 + (var1 << 1);
         class246 var6 = this.field386[var5];
         int var7 = 2 + (var1 << 1);
         class246 var8 = this.field386[var7];
         if (this.field384 != null) {
            if (var7 < this.field383 && this.field384.compare(var6.field2609, var8.field2609) > 0) {
               var9 = var7;
            } else {
               var9 = var5;
            }
         } else if (var7 < this.field383 && ((Comparable)var6.field2609).compareTo(var8.field2609) > 0) {
            var9 = var7;
         } else {
            var9 = var5;
         }

         if (null != this.field384) {
            if (this.field384.compare(var3.field2609, this.field386[var9].field2609) <= 0) {
               break;
            }
         } else if (((Comparable)var3.field2609).compareTo(this.field386[var9].field2609) <= 0) {
            break;
         }

         this.field386[var1] = this.field386[var9];
         this.field386[var1].field2610 = var1;
      }

      this.field386[var1] = var3;
      this.field386[var1].field2610 = var1;
   }

   public boolean contains(Object var1) {
      return this.field382.containsKey(var1);
   }

   public Object[] toArray() {
      Object[] var1 = super.toArray();
      if (null != this.field384) {
         Arrays.sort(var1, this.field384);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public Iterator iterator() {
      return new class345(this);
   }
}
