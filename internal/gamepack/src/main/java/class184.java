import java.awt.Image;
import java.math.BigInteger;
import java.security.SecureRandom;

public class class184 {
   static Image field1685;
   static final BigInteger field1683 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   static final BigInteger field1684 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

   static SecureRandom method837() {
      SecureRandom var1 = new SecureRandom();
      var1.nextInt();
      return var1;
   }

   public static void method836(class120 var0) {
      if (null != var0 && client.field521 == var0.field1039) {
         client.field444[var0.field1038] = true;
      }

   }

   static final void method835(int var0) {
      if (class268.method1275(var0)) {
         class120[] var2 = class329.field2600[var0];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            class120 var4 = var2[var3];
            if (null != var4) {
               var4.field1029 = 0;
               var4.field1030 = 0;
            }
         }

      }
   }
}
