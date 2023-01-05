public class class152 extends class195 {
   class257 field1185;
   class90 field1181;
   class90 field1182;
   int field1183;
   int field1184;
   int field1189;
   String field1186;
   String field1187;
   String field1188;

   class152(int var1, String var2, String var3, String var4) {
      this.field1181 = class90.field766;
      this.field1182 = class90.field766;
      this.method709(var1, var2, var3, var4);
   }

   void method709(int var1, String var2, String var3, String var4) {
      int var6 = ++class100.field794 - 1;
      this.field1184 = var6;
      this.field1189 = client.field231;
      this.field1183 = var1;
      this.field1186 = var2;
      this.method708();
      this.field1187 = var3;
      this.field1188 = var4;
      this.method710();
      this.method705();
   }

   void method710() {
      this.field1181 = class90.field766;
   }

   final boolean method703() {
      if (this.field1181 == class90.field766) {
         this.method704();
      }

      return this.field1181 == class90.field767;
   }

   void method704() {
      this.field1181 = class240.field2021.field38.method1469(this.field1185) ? class90.field767 : class90.field768;
   }

   void method705() {
      this.field1182 = class90.field766;
   }

   final boolean method706() {
      if (this.field1182 == class90.field766) {
         this.method707();
      }

      return this.field1182 == class90.field767;
   }

   void method707() {
      this.field1182 = class240.field2021.field39.method1469(this.field1185) ? class90.field767 : class90.field768;
   }

   final void method708() {
      if (null != this.field1186) {
         this.field1185 = new class257(class196.method871(this.field1186), class63.field619);
      } else {
         this.field1185 = null;
      }

   }

   public static final synchronized long method711() {
      long var1 = System.currentTimeMillis();
      if (var1 < class148.field1165) {
         class196.field1738 += class148.field1165 - var1;
      }

      class148.field1165 = var1;
      return class196.field1738 + var1;
   }

   static int method713() {
      return client.field453 ? 2 : 1;
   }

   static int method712(int var0, class461 var1, boolean var2) {
      if (var0 == 6809) {
         int var4 = class386.field3248[--class161.field1227];
         class87 var5 = class85.method356(var4);
         class386.field3249[++class386.field3250 - 1] = var5 != null ? var5.field715 : "";
         return 1;
      } else {
         return 2;
      }
   }
}
