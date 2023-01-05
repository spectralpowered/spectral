@ObfInfo(
   name = "pk"
)
public class class367 extends class139 {
   @ObfInfo(
      owner = "pk",
      name = "at",
      desc = "Z"
   )
   boolean field3114;
   @ObfInfo(
      owner = "pk",
      name = "az",
      desc = "Z"
   )
   boolean field3120;
   @ObfInfo(
      owner = "pk",
      name = "ar",
      desc = "I"
   )
   int field3103;
   @ObfInfo(
      owner = "pk",
      name = "ae",
      desc = "I"
   )
   int field3104;
   @ObfInfo(
      owner = "pk",
      name = "ay",
      desc = "I"
   )
   int field3105;
   @ObfInfo(
      owner = "pk",
      name = "ab",
      desc = "I"
   )
   int field3107;
   @ObfInfo(
      owner = "pk",
      name = "al",
      desc = "I"
   )
   int field3108;
   @ObfInfo(
      owner = "pk",
      name = "ag",
      desc = "I"
   )
   int field3109;
   @ObfInfo(
      owner = "pk",
      name = "ak",
      desc = "I"
   )
   int field3111;
   @ObfInfo(
      owner = "pk",
      name = "af",
      desc = "I"
   )
   int field3112;
   @ObfInfo(
      owner = "pk",
      name = "ax",
      desc = "I"
   )
   int field3113;
   @ObfInfo(
      owner = "pk",
      name = "bh",
      desc = "I"
   )
   int field3115;
   @ObfInfo(
      owner = "pk",
      name = "an",
      desc = "I"
   )
   int field3116;
   @ObfInfo(
      owner = "pk",
      name = "aa",
      desc = "I"
   )
   int field3117;
   @ObfInfo(
      owner = "pk",
      name = "ac",
      desc = "I"
   )
   int field3121;
   @ObfInfo(
      owner = "pk",
      name = "by",
      desc = "I"
   )
   int field3124;
   @ObfInfo(
      owner = "pk",
      name = "ah",
      desc = "I"
   )
   int field3125;
   @ObfInfo(
      owner = "pk",
      name = "bo",
      desc = "[I"
   )
   int[] field3123 = new int[3];
   @ObfInfo(
      owner = "pk",
      name = "ap",
      desc = "Ljava/lang/String;"
   )
   String field3101;
   @ObfInfo(
      owner = "pk",
      name = "aq",
      desc = "Ljava/lang/String;"
   )
   String field3102;
   @ObfInfo(
      owner = "pk",
      name = "be",
      desc = "Ljava/lang/String;"
   )
   String field3106;
   @ObfInfo(
      owner = "pk",
      name = "bw",
      desc = "Ljava/lang/String;"
   )
   String field3110;
   @ObfInfo(
      owner = "pk",
      name = "aw",
      desc = "Ljava/lang/String;"
   )
   String field3118;
   @ObfInfo(
      owner = "pk",
      name = "bf",
      desc = "Ljava/lang/String;"
   )
   String field3119;
   @ObfInfo(
      owner = "pk",
      name = "aj",
      desc = "Ljava/lang/String;"
   )
   String field3122;
   @ObfInfo(
      owner = "pk",
      name = "bp",
      desc = "Ljava/lang/String;"
   )
   String field3126;

   @ObfInfo(
      owner = "pk",
      name = "<init>",
      desc = "(IZIIIIIZIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;[IILjava/lang/String;Ljava/lang/String;)V"
   )
   class367(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
      this.field3103 = var1;
      this.field3114 = var2;
      this.field3105 = var3;
      this.field3116 = var4;
      this.field3107 = var5;
      this.field3108 = var6;
      this.field3109 = var7;
      this.field3120 = var8;
      this.field3111 = var9;
      this.field3112 = var10;
      this.field3113 = var11;
      this.field3125 = var12;
      this.field3118 = var13;
      this.field3122 = var14;
      this.field3102 = var15;
      this.field3101 = var16;
      this.field3117 = var17;
      this.field3104 = var18;
      this.field3121 = var19;
      this.field3115 = var20;
      this.field3106 = var21;
      this.field3119 = var22;
      this.field3123 = var23;
      this.field3124 = var24;
      this.field3110 = var25;
      this.field3126 = var26;
   }

   @ObfInfo(
      owner = "pk",
      name = "h",
      desc = "(Lqy;B)V"
   )
   public void method1812(class127 var1) {
      var1.method544(9);
      var1.method544(this.field3103);
      var1.method544(this.field3114 ? 1 : 0);
      var1.method533(this.field3105);
      var1.method544(this.field3116);
      var1.method544(this.field3107);
      var1.method544(this.field3108);
      var1.method544(this.field3109);
      var1.method544(this.field3120 ? 1 : 0);
      var1.method533(this.field3111);
      var1.method544(this.field3112);
      var1.method602(this.field3113);
      var1.method533(this.field3125);
      var1.method604(this.field3118);
      var1.method604(this.field3122);
      var1.method604(this.field3102);
      var1.method604(this.field3101);
      var1.method544(this.field3104);
      var1.method533(this.field3117);
      var1.method604(this.field3106);
      var1.method604(this.field3119);
      var1.method544(this.field3121);
      var1.method544(this.field3115);

      for(int var3 = 0; var3 < this.field3123.length; ++var3) {
         var1.method534(this.field3123[var3]);
      }

      var1.method534(this.field3124);
      var1.method604(this.field3110);
      var1.method604(this.field3126);
   }

   @ObfInfo(
      owner = "pk",
      name = "e",
      desc = "(I)I"
   )
   public int method1813() {
      byte var2 = 39;
      int var3 = var2 + class149.method697(this.field3118);
      var3 += class149.method697(this.field3122);
      var3 += class149.method697(this.field3102);
      var3 += class149.method697(this.field3101);
      var3 += class149.method697(this.field3106);
      var3 += class149.method697(this.field3119);
      var3 += class149.method697(this.field3110);
      var3 += class149.method697(this.field3126);
      return var3;
   }
}
