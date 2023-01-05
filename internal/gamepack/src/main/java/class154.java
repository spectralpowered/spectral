public class class154 extends class108 {
   class174 field1613;
   class253 field1609;
   class253 field1610;
   int field1611;
   int field1612;
   int field1617;
   String field1614;
   String field1615;
   String field1616;

   class154(int var1, String var2, String var3, String var4) {
      this.field1609 = class253.field2635;
      this.field1610 = class253.field2635;
      this.method812(var1, var2, var3, var4);
   }

   void method812(int var1, String var2, String var3, String var4) {
      int var6 = ++class58.field814 - 1;
      this.field1612 = var6;
      this.field1617 = client.field435;
      this.field1611 = var1;
      this.field1614 = var2;
      this.method811();
      this.field1615 = var3;
      this.field1616 = var4;
      this.method813();
      this.method808();
   }

   void method813() {
      this.field1609 = class253.field2635;
   }

   final boolean method806() {
      if (this.field1609 == class253.field2635) {
         this.method807();
      }

      return this.field1609 == class253.field2636;
   }

   void method807() {
      this.field1609 = class321.field3026.field975.method190(this.field1613) ? class253.field2636 : class253.field2637;
   }

   void method808() {
      this.field1610 = class253.field2635;
   }

   final boolean method809() {
      if (this.field1610 == class253.field2635) {
         this.method810();
      }

      return this.field1610 == class253.field2636;
   }

   void method810() {
      this.field1610 = class321.field3026.field976.method190(this.field1613) ? class253.field2636 : class253.field2637;
   }

   final void method811() {
      if (null != this.field1614) {
         this.field1613 = new class174(class247.method1224(this.field1614), class170.field1860);
      } else {
         this.field1613 = null;
      }

   }

   public static final synchronized long method814() {
      long var1 = System.currentTimeMillis();
      if (var1 < class373.field3297) {
         class247.field2611 += class373.field3297 - var1;
      }

      class373.field3297 = var1;
      return class247.field2611 + var1;
   }

   static int method816() {
      return client.field657 ? 2 : 1;
   }

   static int method815(int var0, class472 var1, boolean var2) {
      if (var0 == 6809) {
         int var4 = class150.field1580[--class188.field1989];
         class173 var5 = class212.method1110(var4);
         class150.field1581[++class150.field1582 - 1] = var5 != null ? var5.field1873 : "";
         return 1;
      } else {
         return 2;
      }
   }
}
