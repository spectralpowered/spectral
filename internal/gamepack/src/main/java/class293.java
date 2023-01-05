@ObfInfo(
   name = "dq"
)
public class class293 {
   @ObfInfo(
      owner = "dq",
      name = "a",
      desc = "[Ljava/lang/String;"
   )
   public static String[] field2384;
   @ObfInfo(
      owner = "dq",
      name = "f",
      desc = "Ldq;"
   )
   class293 field2382;
   @ObfInfo(
      owner = "dq",
      name = "v",
      desc = "F"
   )
   float field2377 = Float.MAX_VALUE;
   @ObfInfo(
      owner = "dq",
      name = "e",
      desc = "F"
   )
   float field2378;
   @ObfInfo(
      owner = "dq",
      name = "q",
      desc = "F"
   )
   float field2379 = Float.MAX_VALUE;
   @ObfInfo(
      owner = "dq",
      name = "x",
      desc = "F"
   )
   float field2380 = Float.MAX_VALUE;
   @ObfInfo(
      owner = "dq",
      name = "m",
      desc = "F"
   )
   float field2381 = Float.MAX_VALUE;
   @ObfInfo(
      owner = "dq",
      name = "h",
      desc = "I"
   )
   int field2383;

   @ObfInfo(
      owner = "dq",
      name = "h",
      desc = "(Lqy;II)V"
   )
   void method1435(class127 var1, int var2) {
      this.field2383 = var1.method550();
      this.field2378 = var1.method552();
      this.field2377 = var1.method552();
      this.field2380 = var1.method552();
      this.field2381 = var1.method552();
      this.field2379 = var1.method552();
   }

   @ObfInfo(
      owner = "dq",
      name = "ia",
      desc = "(I)Z"
   )
   static boolean method1436() {
      return 0 != (client.field449 & 2);
   }
}
