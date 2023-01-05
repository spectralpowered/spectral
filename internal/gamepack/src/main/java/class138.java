public final class class138 extends class139 {
   static class365 field1119;
   int field1118;
   int field1120 = 0;
   int field1121;
   int field1122;
   int field1123 = 31;
   int field1124;
   int field1125;
   int field1126;
   int field1127;
   int field1128;
   int field1129;
   int field1130 = -1;
   int field1131;

   void method634(int var1) {
      this.field1123 = var1;
   }

   boolean method635(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return 0 != (this.field1123 & 1 << var1);
      } else {
         return true;
      }
   }
}
