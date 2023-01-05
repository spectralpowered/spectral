import java.util.Iterator;
import java.util.LinkedList;

public class class46 {
   static class20 field561;
   static class220 field560;
   static class38 field549;
   boolean field556 = false;
   class464 field551 = null;
   int field548 = Integer.MAX_VALUE;
   int field550 = -1;
   int field552 = Integer.MAX_VALUE;
   int field553 = 0;
   int field554 = -1;
   int field555 = 0;
   int field559 = -1;
   String field547;
   String field558;
   LinkedList field557;

   public void method221(class127 var1, int var2) {
      this.field559 = var2;
      this.field547 = var1.method555();
      this.field558 = var1.method555();
      this.field551 = new class464(var1.method595());
      this.field554 = var1.method595();
      var1.method547();
      this.field556 = var1.method547() == 1;
      this.field550 = var1.method547();
      int var4 = var1.method547();
      this.field557 = new LinkedList();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field557.add(this.method222(var1));
      }

      this.method224();
   }

   class360 method222(class127 var1) {
      int var3 = var1.method547();
      class212[] var4 = new class212[]{class212.field1840, class212.field1835, class212.field1837, class212.field1836};
      class212 var5 = (class212)class2.method10(var4, var3);
      Object var6 = null;
      switch(var5.field1838) {
      case 0:
         var6 = new class303();
         break;
      case 1:
         var6 = new class388();
         break;
      case 2:
         var6 = new class285();
         break;
      case 3:
         var6 = new class349();
         break;
      default:
         throw new IllegalStateException("");
      }

      ((class360)var6).method1795(var1);
      return (class360)var6;
   }

   public boolean method240(int var1, int var2, int var3) {
      Iterator var5 = this.field557.iterator();

      class360 var6;
      do {
         if (!var5.hasNext()) {
            return false;
         }

         var6 = (class360)var5.next();
      } while(!var6.method1793(var1, var2, var3));

      return true;
   }

   public boolean method226(int var1, int var2) {
      int var4 = var1 / 64;
      int var5 = var2 / 64;
      if (var4 >= this.field552 && var4 <= this.field553) {
         if (var5 >= this.field548 && var5 <= this.field555) {
            Iterator var6 = this.field557.iterator();

            class360 var7;
            do {
               if (!var6.hasNext()) {
                  return false;
               }

               var7 = (class360)var6.next();
            } while(!var7.method1792(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int[] method237(int var1, int var2, int var3) {
      Iterator var5 = this.field557.iterator();

      class360 var6;
      do {
         if (!var5.hasNext()) {
            return null;
         }

         var6 = (class360)var5.next();
      } while(!var6.method1793(var1, var2, var3));

      return var6.method1794(var1, var2, var3);
   }

   public class464 method223(int var1, int var2) {
      Iterator var4 = this.field557.iterator();

      class360 var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (class360)var4.next();
      } while(!var5.method1792(var1, var2));

      return var5.method1796(var1, var2);
   }

   void method224() {
      Iterator var2 = this.field557.iterator();

      while(var2.hasNext()) {
         class360 var3 = (class360)var2.next();
         var3.method1797(this);
      }

   }

   public int method225() {
      return this.field559;
   }

   public boolean method238() {
      return this.field556;
   }

   public String method227() {
      return this.field547;
   }

   public String method239() {
      return this.field558;
   }

   int method234() {
      return this.field554;
   }

   public int method229() {
      return this.field550;
   }

   public int method236() {
      return this.field552;
   }

   public int method230() {
      return this.field553;
   }

   public int method231() {
      return this.field548;
   }

   public int method232() {
      return this.field555;
   }

   public int method233() {
      return this.field551.field3852;
   }

   public int method242() {
      return this.field551.field3851;
   }

   public int method235() {
      return this.field551.field3853;
   }

   public class464 method228() {
      return new class464(this.field551);
   }

   static int method241(int var0, class461 var1, boolean var2) {
      class120 var4 = var2 ? class108.field822 : class37.field183;
      if (var0 == 1800) {
         class386.field3248[++class161.field1227 - 1] = class486.method2379(class203.method892(var4));
         return 1;
      } else if (var0 != 1801) {
         if (var0 == 1802) {
            if (var4.field894 == null) {
               class386.field3249[++class386.field3250 - 1] = "";
            } else {
               class386.field3249[++class386.field3250 - 1] = var4.field894;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = class386.field3248[--class161.field1227];
         --var5;
         if (null != var4.field978 && var5 < var4.field978.length && var4.field978[var5] != null) {
            class386.field3249[++class386.field3250 - 1] = var4.field978[var5];
         } else {
            class386.field3249[++class386.field3250 - 1] = "";
         }

         return 1;
      }
   }
}
