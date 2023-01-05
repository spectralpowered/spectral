import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class213 extends class195 {
   class185[] field1841;
   List field1842;

   public class213(class274 var1, int var2, int var3) {
      byte[] var4 = var1.method1365(var2, var3 + 1);
      this.method920(new class127(var4));
   }

   public class213(class274 var1, int var2) {
      byte[] var3 = var1.method1365(var2, 0);
      this.method920(new class127(var3));
   }

   void method920(class127 var1) {
      int var3 = var1.method561();
      this.field1841 = new class185[var3];
      this.field1842 = new ArrayList(var3);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field1841[var4] = (class185)class2.method10(class185.method841(), var1.method547());
         int var5 = var1.method561();
         HashMap var6 = new HashMap(var5);

         while(var5-- > 0) {
            Object var7 = this.field1841[var4].method840(var1);
            int var8 = var1.method561();
            ArrayList var9 = new ArrayList();

            while(var8-- > 0) {
               int var10 = var1.method561();
               var9.add(var10);
            }

            var6.put(var7, var9);
         }

         this.field1842.add(var4, var6);
      }

   }

   public List method921(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var4 = (Map)this.field1842.get(var2);
      return (List)var4.get(var1);
   }
}
