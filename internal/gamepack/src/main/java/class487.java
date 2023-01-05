@ObfInfo(
   name = "ah"
)
public class class487 {
   @ObfInfo(
      owner = "ah",
      name = "u",
      desc = "I"
   )
   int field4054;
   @ObfInfo(
      owner = "ah",
      name = "m",
      desc = "I"
   )
   int field4057;
   @ObfInfo(
      owner = "ah",
      name = "q",
      desc = "I"
   )
   int field4058;
   @ObfInfo(
      owner = "ah",
      name = "j",
      desc = "I"
   )
   int field4059;
   @ObfInfo(
      owner = "ah",
      name = "r",
      desc = "I"
   )
   int field4060;
   @ObfInfo(
      owner = "ah",
      name = "g",
      desc = "I"
   )
   int field4061;
   @ObfInfo(
      owner = "ah",
      name = "b",
      desc = "I"
   )
   int field4062;
   @ObfInfo(
      owner = "ah",
      name = "h",
      desc = "I"
   )
   int field4063 = 2;
   @ObfInfo(
      owner = "ah",
      name = "f",
      desc = "I"
   )
   int field4064;
   @ObfInfo(
      owner = "ah",
      name = "e",
      desc = "[I"
   )
   int[] field4055 = new int[2];
   @ObfInfo(
      owner = "ah",
      name = "v",
      desc = "[I"
   )
   int[] field4056 = new int[2];

   @ObfInfo(
      owner = "ah",
      name = "<init>",
      desc = "()V"
   )
   class487() {
      this.field4055[0] = 0;
      this.field4055[1] = 65535;
      this.field4056[0] = 0;
      this.field4056[1] = 65535;
   }

   @ObfInfo(
      owner = "ah",
      name = "h",
      desc = "(Lqy;)V"
   )
   final void method2393(class127 var1) {
      this.field4064 = var1.method547();
      this.field4057 = var1.method595();
      this.field4058 = var1.method595();
      this.method2391(var1);
   }

   @ObfInfo(
      owner = "ah",
      name = "e",
      desc = "(Lqy;)V"
   )
   final void method2391(class127 var1) {
      this.field4063 = var1.method547();
      this.field4055 = new int[this.field4063];
      this.field4056 = new int[this.field4063];

      for(int var2 = 0; var2 < this.field4063; ++var2) {
         this.field4055[var2] = var1.method549();
         this.field4056[var2] = var1.method549();
      }

   }

   @ObfInfo(
      owner = "ah",
      name = "v",
      desc = "()V"
   )
   final void method2392() {
      this.field4060 = 0;
      this.field4054 = 0;
      this.field4062 = 0;
      this.field4059 = 0;
      this.field4061 = 0;
   }

   @ObfInfo(
      owner = "ah",
      name = "x",
      desc = "(I)I"
   )
   final int method2390(int var1) {
      if (this.field4061 >= this.field4060) {
         this.field4059 = this.field4056[this.field4054++] << 15;
         if (this.field4054 >= this.field4063) {
            this.field4054 = this.field4063 - 1;
         }

         this.field4060 = (int)((double)this.field4055[this.field4054] / 65536.0D * (double)var1);
         if (this.field4060 > this.field4061) {
            this.field4062 = ((this.field4056[this.field4054] << 15) - this.field4059) / (this.field4060 - this.field4061);
         }
      }

      this.field4059 += this.field4062;
      ++this.field4061;
      return this.field4059 - this.field4062 >> 15;
   }
}
