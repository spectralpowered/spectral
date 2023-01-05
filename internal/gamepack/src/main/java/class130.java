@ObfInfo(
   name = "dt"
)
public class class130 {
   @ObfInfo(
      owner = "dt",
      name = "b",
      desc = "Z"
   )
   boolean field1090 = true;
   @ObfInfo(
      owner = "dt",
      name = "r",
      desc = "Z"
   )
   boolean field1091 = true;
   @ObfInfo(
      owner = "dt",
      name = "f",
      desc = "Loj;"
   )
   class44 field1087 = new class44();
   @ObfInfo(
      owner = "dt",
      name = "j",
      desc = "Loj;"
   )
   class44 field1088 = new class44();
   @ObfInfo(
      owner = "dt",
      name = "u",
      desc = "Loj;"
   )
   class44 field1093 = new class44();
   @ObfInfo(
      owner = "dt",
      name = "m",
      desc = "[Loj;"
   )
   class44[] field1081;
   @ObfInfo(
      owner = "dt",
      name = "q",
      desc = "[Loj;"
   )
   class44[] field1086;
   @ObfInfo(
      owner = "dt",
      name = "v",
      desc = "[[F"
   )
   float[][] field1083;
   @ObfInfo(
      owner = "dt",
      name = "g",
      desc = "[[F"
   )
   float[][] field1089;
   @ObfInfo(
      owner = "dt",
      name = "i",
      desc = "[[F"
   )
   float[][] field1092;
   @ObfInfo(
      owner = "dt",
      name = "o",
      desc = "[[F"
   )
   float[][] field1094;
   @ObfInfo(
      owner = "dt",
      name = "x",
      desc = "[Loj;"
   )
   final class44[] field1084;
   @ObfInfo(
      owner = "dt",
      name = "e",
      desc = "Ldt;"
   )
   public class130 field1082;
   @ObfInfo(
      owner = "dt",
      name = "h",
      desc = "I"
   )
   public final int field1085;

   @ObfInfo(
      owner = "dt",
      name = "<init>",
      desc = "(ILqy;Z)V"
   )
   public class130(int var1, class127 var2, boolean var3) {
      this.field1085 = var2.method550();
      this.field1084 = new class44[var1];
      this.field1081 = new class44[this.field1084.length];
      this.field1086 = new class44[this.field1084.length];
      this.field1083 = new float[this.field1084.length][3];

      for(int var4 = 0; var4 < this.field1084.length; ++var4) {
         this.field1084[var4] = new class44(var2, var3);
         this.field1083[var4][0] = var2.method552();
         this.field1083[var4][1] = var2.method552();
         this.field1083[var4][2] = var2.method552();
      }

      this.method615();
   }

   @ObfInfo(
      owner = "dt",
      name = "h",
      desc = "(B)V"
   )
   void method615() {
      this.field1089 = new float[this.field1084.length][3];
      this.field1092 = new float[this.field1084.length][3];
      this.field1094 = new float[this.field1084.length][3];
      class44 var2 = class282.method1391();

      for(int var3 = 0; var3 < this.field1084.length; ++var3) {
         class44 var4 = this.method625(var3);
         var2.method209(var4);
         var2.method215();
         this.field1089[var3] = var2.method206();
         this.field1092[var3][0] = var4.field541[12];
         this.field1092[var3][1] = var4.field541[13];
         this.field1092[var3][2] = var4.field541[14];
         this.field1094[var3] = var4.method216();
      }

      var2.method217();
   }

   @ObfInfo(
      owner = "dt",
      name = "e",
      desc = "(II)Loj;"
   )
   class44 method625(int var1) {
      return this.field1084[var1];
   }

   @ObfInfo(
      owner = "dt",
      name = "v",
      desc = "(IB)Loj;"
   )
   class44 method616(int var1) {
      if (null == this.field1081[var1]) {
         this.field1081[var1] = new class44(this.method625(var1));
         if (null != this.field1082) {
            this.field1081[var1].method212(this.field1082.method616(var1));
         } else {
            this.field1081[var1].method212(class44.field542);
         }
      }

      return this.field1081[var1];
   }

   @ObfInfo(
      owner = "dt",
      name = "x",
      desc = "(IS)Loj;"
   )
   class44 method624(int var1) {
      if (null == this.field1086[var1]) {
         this.field1086[var1] = new class44(this.method616(var1));
         this.field1086[var1].method215();
      }

      return this.field1086[var1];
   }

   @ObfInfo(
      owner = "dt",
      name = "m",
      desc = "(Loj;I)V"
   )
   void method619(class44 var1) {
      this.field1087.method209(var1);
      this.field1091 = true;
      this.field1090 = true;
   }

   @ObfInfo(
      owner = "dt",
      name = "q",
      desc = "(I)Loj;"
   )
   class44 method618() {
      return this.field1087;
   }

   @ObfInfo(
      owner = "dt",
      name = "f",
      desc = "(I)Loj;"
   )
   class44 method623() {
      if (this.field1091) {
         this.field1093.method209(this.method618());
         if (null != this.field1082) {
            this.field1093.method212(this.field1082.method623());
         }

         this.field1091 = false;
      }

      return this.field1093;
   }

   @ObfInfo(
      owner = "dt",
      name = "r",
      desc = "(II)Loj;"
   )
   public class44 method617(int var1) {
      if (this.field1090) {
         this.field1088.method209(this.method624(var1));
         this.field1088.method212(this.method623());
         this.field1090 = false;
      }

      return this.field1088;
   }

   @ObfInfo(
      owner = "dt",
      name = "u",
      desc = "(IB)[F"
   )
   float[] method620(int var1) {
      return this.field1089[var1];
   }

   @ObfInfo(
      owner = "dt",
      name = "b",
      desc = "(II)[F"
   )
   float[] method621(int var1) {
      return this.field1092[var1];
   }

   @ObfInfo(
      owner = "dt",
      name = "j",
      desc = "(IS)[F"
   )
   float[] method622(int var1) {
      return this.field1094[var1];
   }
}
