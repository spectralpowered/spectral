@class455
public final class class425 {
   static class210 field3580;

   static class319 method2038() {
      class319 var1 = new class319();
      var1.field3017 = class104.field1353;
      var1.field3018 = class207.field2196;
      var1.field3015 = class207.field2198[0];
      var1.field3016 = class318.field3011[0];
      var1.field3014 = class110.field1380[0];
      var1.field3013 = class111.field1387[0];
      int var2 = var1.field3013 * var1.field3014;
      byte[] var3 = class344.field3162[0];
      var1.field3019 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var1.field3019[var4] = class482.field3990[var3[var4] & 255];
      }

      class207.field2198 = null;
      class318.field3011 = null;
      class110.field1380 = null;
      class111.field1387 = null;
      class482.field3990 = null;
      class344.field3162 = (byte[][])null;
      return var1;
   }
}
