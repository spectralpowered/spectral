import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class466 extends class108 {
   class180[] field3873;
   List field3874;

   public class466(class164 var1, int var2, int var3) {
      byte[] var4 = var1.method892(var2, var3 + 1);
      this.method2283(new class134(var4));
   }

   public class466(class164 var1, int var2) {
      byte[] var3 = var1.method892(var2, 0);
      this.method2283(new class134(var3));
   }

   void method2283(class134 var1) {
      int var3 = var1.method683();
      this.field3873 = new class180[var3];
      this.field3874 = new ArrayList(var3);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field3873[var4] = (class180)class296.method1399(class180.method943(), var1.method669());
         int var5 = var1.method683();
         HashMap var6 = new HashMap(var5);

         while(var5-- > 0) {
            Object var7 = this.field3873[var4].method941(var1);
            int var8 = var1.method683();
            ArrayList var9 = new ArrayList();

            while(var8-- > 0) {
               int var10 = var1.method683();
               var9.add(var10);
            }

            var6.put(var7, var9);
         }

         this.field3874.add(var4, var6);
      }

   }

   public List method2284(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var4 = (Map)this.field3874.get(var2);
      return (List)var4.get(var1);
   }
}