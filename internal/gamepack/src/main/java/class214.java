import java.awt.Image;
import java.math.BigInteger;
import java.security.SecureRandom;

public class class214 {
   static Image field2401;
   static final BigInteger field2399 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   static final BigInteger field2400 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

   static SecureRandom method1118() {
      SecureRandom var1 = new SecureRandom();
      var1.nextInt();
      return var1;
   }

   public static void method1117(class210 var0) {
      if (null != var0 && client.field725 == var0.field2361) {
         client.field648[var0.field2360] = true;
      }

   }

   static final void method1116(int var0) {
      if (class25.method126(var0)) {
         class210[] var2 = class71.field853[var0];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            class210 var4 = var2[var3];
            if (null != var4) {
               var4.field2351 = 0;
               var4.field2352 = 0;
            }
         }

      }
   }
}
