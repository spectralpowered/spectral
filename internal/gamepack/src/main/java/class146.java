import java.util.HashMap;

public class class146 {
   class164 field1560;
   class164 field1561;
   HashMap field1559;

   public class146(class164 var1, class164 var2) {
      this.field1561 = var1;
      this.field1560 = var2;
      this.field1559 = new HashMap();
   }

   public HashMap method781(class39[] var1) {
      HashMap var3 = new HashMap();
      class39[] var4 = var1;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class39 var6 = var4[var5];
         if (this.field1559.containsKey(var6)) {
            var3.put(var6, this.field1559.get(var6));
         } else {
            class164 var8 = this.field1561;
            class164 var9 = this.field1560;
            String var10 = var6.field370;
            int var11 = var8.method883(var10);
            int var12 = var8.method886(var11, "");
            class394 var7 = class238.method1211(var8, var9, var11, var12);
            if (var7 != null) {
               this.field1559.put(var6, var7);
               var3.put(var6, var7);
            }
         }
      }

      return var3;
   }
}
