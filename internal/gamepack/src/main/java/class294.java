@ObfInfo(
   name = "gs"
)
public class class294 implements class78 {
   @ObfInfo(
      owner = "gs",
      name = "h",
      desc = "Lgs;"
   )
   public static final class294 field2385 = new class294((byte)-1);
   @ObfInfo(
      owner = "gs",
      name = "v",
      desc = "Lgs;"
   )
   public static final class294 field2386 = new class294((byte)1);
   @ObfInfo(
      owner = "gs",
      name = "e",
      desc = "Lgs;"
   )
   public static final class294 field2387 = new class294((byte)0);
   @ObfInfo(
      owner = "gs",
      name = "x",
      desc = "Lgs;"
   )
   public static final class294 field2388 = new class294((byte)2);
   @ObfInfo(
      owner = "gs",
      name = "m",
      desc = "B"
   )
   public byte field2389;

   @ObfInfo(
      owner = "gs",
      name = "<init>",
      desc = "(B)V"
   )
   class294(byte var1) {
      this.field2389 = var1;
   }

   @ObfInfo(
      owner = "gs",
      name = "e",
      desc = "(B)I"
   )
   public int method330() {
      return this.field2389;
   }

   @ObfInfo(
      owner = "gs",
      name = "je",
      desc = "(I)V"
   )
   static final void method1437() {
      for(class138 var1 = (class138)client.field450.method646(); var1 != null; var1 = (class138)client.field450.method648()) {
         if (var1.field1130 == -1) {
            var1.field1120 = 0;
            class443.method2197(var1);
         } else {
            var1.method637();
         }
      }

   }
}
