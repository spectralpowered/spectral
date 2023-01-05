public final class class474 extends class106 {
   static class387 field3931;
   int field3930;
   int field3932 = 0;
   int field3933;
   int field3934;
   int field3935 = 31;
   int field3936;
   int field3937;
   int field3938;
   int field3939;
   int field3940;
   int field3941;
   int field3942 = -1;
   int field3943;

   void method2297(int var1) {
      this.field3935 = var1;
   }

   boolean method2298(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return 0 != (this.field3935 & 1 << var1);
      } else {
         return true;
      }
   }
}
