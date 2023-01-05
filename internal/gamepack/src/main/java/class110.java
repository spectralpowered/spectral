import java.util.concurrent.ScheduledExecutorService;
import org.bouncycastle.crypto.tls.TlsAuthentication;

class class110 implements TlsAuthentication {
   public static int[] field1380;
   static ScheduledExecutorService field1381;
   // $FF: synthetic field
   final class444 this$2;

   class110(class444 var1) {
      this.this$2 = var1;
   }

   static final void method577(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      class474 var11 = null;

      for(class474 var12 = (class474)client.field654.method1934(); var12 != null; var12 = (class474)client.field654.method1936()) {
         if (var0 == var12.field3934 && var12.field3930 == var1 && var12.field3941 == var2 && var3 == var12.field3940) {
            var11 = var12;
            break;
         }
      }

      if (var11 == null) {
         var11 = new class474();
         var11.field3934 = var0;
         var11.field3940 = var3;
         var11.field3930 = var1;
         var11.field3941 = var2;
         class265.method1264(var11);
         client.field654.method1930(var11);
      }

      var11.field3937 = var4;
      var11.field3939 = var5;
      var11.field3938 = var6;
      var11.field3932 = var8;
      var11.field3942 = var9;
      var11.method2297(var7);
   }
}
