import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class335 extends AbstractQueue {
   class444[] field2688;
   int field2685;
   int field2687;
   Map field2684;
   final Comparator field2686;

   public class335(int var1) {
      this(var1, (Comparator)null);
   }

   public class335(int var1, Comparator var2) {
      this.field2687 = 0;
      this.field2688 = new class444[var1];
      this.field2684 = new HashMap();
      this.field2686 = var2;
   }

   void method1684() {
      int var2 = 1 + (this.field2688.length << 1);
      this.field2688 = (class444[])((class444[])Arrays.copyOf(this.field2688, var2));
   }

   public int size() {
      return this.field2685;
   }

   public boolean offer(Object var1) {
      if (this.field2684.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         ++this.field2687;
         int var2 = this.field2685;
         if (var2 >= this.field2688.length) {
            this.method1684();
         }

         ++this.field2685;
         if (var2 == 0) {
            this.field2688[0] = new class444(var1, 0);
            this.field2684.put(var1, this.field2688[0]);
         } else {
            this.field2688[var2] = new class444(var1, var2);
            this.field2684.put(var1, this.field2688[var2]);
            this.method1682(var2);
         }

         return true;
      }
   }

   public Object peek() {
      return this.field2685 == 0 ? null : this.field2688[0].field3668;
   }

   public Object poll() {
      if (0 == this.field2685) {
         return null;
      } else {
         ++this.field2687;
         Object var1 = this.field2688[0].field3668;
         this.field2684.remove(var1);
         --this.field2685;
         if (this.field2685 == 0) {
            this.field2688[this.field2685] = null;
         } else {
            this.field2688[0] = this.field2688[this.field2685];
            this.field2688[0].field3669 = 0;
            this.field2688[this.field2685] = null;
            this.method1683(0);
         }

         return var1;
      }
   }

   public boolean remove(Object var1) {
      class444 var2 = (class444)this.field2684.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         ++this.field2687;
         --this.field2685;
         if (this.field2685 == var2.field3669) {
            this.field2688[this.field2685] = null;
            return true;
         } else {
            class444 var3 = this.field2688[this.field2685];
            this.field2688[this.field2685] = null;
            this.field2688[var2.field3669] = var3;
            this.field2688[var2.field3669].field3669 = var2.field3669;
            this.method1683(var2.field3669);
            if (var3 == this.field2688[var2.field3669]) {
               this.method1682(var2.field3669);
            }

            return true;
         }
      }
   }

   void method1682(int var1) {
      class444 var3;
      int var4;
      for(var3 = this.field2688[var1]; var1 > 0; var1 = var4) {
         var4 = var1 - 1 >>> 1;
         class444 var5 = this.field2688[var4];
         if (this.field2686 != null) {
            if (this.field2686.compare(var3.field3668, var5.field3668) >= 0) {
               break;
            }
         } else if (((Comparable)var3.field3668).compareTo(var5.field3668) >= 0) {
            break;
         }

         this.field2688[var1] = var5;
         this.field2688[var1].field3669 = var1;
      }

      this.field2688[var1] = var3;
      this.field2688[var1].field3669 = var1;
   }

   void method1683(int var1) {
      class444 var3 = this.field2688[var1];

      int var9;
      for(int var4 = this.field2685 >>> 1; var1 < var4; var1 = var9) {
         int var5 = 1 + (var1 << 1);
         class444 var6 = this.field2688[var5];
         int var7 = 2 + (var1 << 1);
         class444 var8 = this.field2688[var7];
         if (this.field2686 != null) {
            if (var7 < this.field2685 && this.field2686.compare(var6.field3668, var8.field3668) > 0) {
               var9 = var7;
            } else {
               var9 = var5;
            }
         } else if (var7 < this.field2685 && ((Comparable)var6.field3668).compareTo(var8.field3668) > 0) {
            var9 = var7;
         } else {
            var9 = var5;
         }

         if (null != this.field2686) {
            if (this.field2686.compare(var3.field3668, this.field2688[var9].field3668) <= 0) {
               break;
            }
         } else if (((Comparable)var3.field3668).compareTo(this.field2688[var9].field3668) <= 0) {
            break;
         }

         this.field2688[var1] = this.field2688[var9];
         this.field2688[var1].field3669 = var1;
      }

      this.field2688[var1] = var3;
      this.field2688[var1].field3669 = var1;
   }

   public boolean contains(Object var1) {
      return this.field2684.containsKey(var1);
   }

   public Object[] toArray() {
      Object[] var1 = super.toArray();
      if (null != this.field2686) {
         Arrays.sort(var1, this.field2686);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public Iterator iterator() {
      return new class325(this);
   }
}
