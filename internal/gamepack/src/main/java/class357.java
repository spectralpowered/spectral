public class class357 {
   static class134 field3202;
   // $FF: synthetic field
   final class452 this$0;
   public float[] field3198;
   public int field3199;
   public int field3200;
   public int field3201;
   public String field3197;

   class357(class452 var1) {
      this.this$0 = var1;
      this.field3198 = new float[4];
      this.field3200 = 1;
      this.field3201 = 1;
      this.field3199 = 0;
   }

   static void method1709(int var0) {
      if (var0 == -1 && !client.field681) {
         class91.method501();
      } else if (var0 != -1 && var0 != client.field680 && class111.field1385.method1325() != 0 && !client.field681) {
         class230 var2 = class417.field3564;
         int var3 = class111.field1385.method1325();
         class126.field1458 = 1;
         class371.field3293 = var2;
         class329.field3069 = var0;
         class126.field1461 = 0;
         class219.field2420 = var3;
         class342.field3145 = false;
         class126.field1460 = 2;
      }

      client.field680 = var0;
   }

   static void method1708(class210[] var0, class210 var1, boolean var2) {
      int var4 = var1.field2237 != 0 ? var1.field2237 : var1.field2230;
      int var5 = var1.field2238 != 0 ? var1.field2238 : var1.field2289;
      class233.method1165(var0, var1.field2307, var4, var5, var2);
      if (var1.field2353 != null) {
         class233.method1165(var1.field2353, var1.field2307, var4, var5, var2);
      }

      class240 var6 = (class240)client.field598.method545((long)var1.field2307);
      if (null != var6) {
         class461.method2264(var6.field2580, var4, var5, var2);
      }

      if (1337 == var1.field2315) {
         ;
      }

   }

   static final void method1707() {
      for(int var1 = 0; var1 < class25.field180; ++var1) {
         class47 var2 = client.field551[class25.field179[var1]];
         var2.method245();
      }

   }
}
