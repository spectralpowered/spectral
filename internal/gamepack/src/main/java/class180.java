import java.util.HashMap;

@ObfInfo(
   name = "pz"
)
public class class180 {
   @ObfInfo(
      owner = "pz",
      name = "e",
      desc = "Lly;"
   )
   class274 field1659;
   @ObfInfo(
      owner = "pz",
      name = "h",
      desc = "Lly;"
   )
   class274 field1660;
   @ObfInfo(
      owner = "pz",
      name = "v",
      desc = "Ljava/util/HashMap;"
   )
   HashMap field1658;

   @ObfInfo(
      owner = "pz",
      name = "<init>",
      desc = "(Lly;Lly;)V"
   )
   public class180(class274 var1, class274 var2) {
      this.field1660 = var1;
      this.field1659 = var2;
      this.field1658 = new HashMap();
   }

   @ObfInfo(
      owner = "pz",
      name = "h",
      desc = "([Lpt;I)Ljava/util/HashMap;"
   )
   public HashMap method818(class460[] var1) {
      HashMap var3 = new HashMap();
      class460[] var4 = var1;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class460 var6 = var4[var5];
         if (this.field1658.containsKey(var6)) {
            var3.put(var6, this.field1658.get(var6));
         } else {
            class274 var8 = this.field1660;
            class274 var9 = this.field1659;
            String var10 = var6.field3813;
            int var11 = var8.method1356(var10);
            int var12 = var8.method1359(var11, "");
            class58 var7 = class337.method1696(var8, var9, var11, var12);
            if (var7 != null) {
               this.field1658.put(var6, var7);
               var3.put(var6, var7);
            }
         }
      }

      return var3;
   }
}
