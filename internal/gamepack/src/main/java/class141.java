@ObfInfo(
   name = "mq"
)
public class class141 {
   @ObfInfo(
      owner = "mq",
      name = "e",
      desc = "Lpl;"
   )
   class139 field1140;
   @ObfInfo(
      owner = "mq",
      name = "h",
      desc = "Lpl;"
   )
   public class139 field1141 = new class139();

   @ObfInfo(
      owner = "mq",
      name = "<init>",
      desc = "()V"
   )
   public class141() {
      this.field1141.field1132 = this.field1141;
      this.field1141.field1133 = this.field1141;
   }

   @ObfInfo(
      owner = "mq",
      name = "h",
      desc = "()V"
   )
   public void method649() {
      while(true) {
         class139 var1 = this.field1141.field1132;
         if (var1 == this.field1141) {
            this.field1140 = null;
            return;
         }

         var1.method637();
      }
   }

   @ObfInfo(
      owner = "mq",
      name = "e",
      desc = "(Lpl;)V"
   )
   public void method642(class139 var1) {
      if (var1.field1133 != null) {
         var1.method637();
      }

      var1.field1133 = this.field1141.field1133;
      var1.field1132 = this.field1141;
      var1.field1133.field1132 = var1;
      var1.field1132.field1133 = var1;
   }

   @ObfInfo(
      owner = "mq",
      name = "v",
      desc = "(Lpl;)V"
   )
   public void method643(class139 var1) {
      if (var1.field1133 != null) {
         var1.method637();
      }

      var1.field1133 = this.field1141;
      var1.field1132 = this.field1141.field1132;
      var1.field1133.field1132 = var1;
      var1.field1132.field1133 = var1;
   }

   @ObfInfo(
      owner = "mq",
      name = "m",
      desc = "()Lpl;"
   )
   public class139 method645() {
      class139 var1 = this.field1141.field1132;
      if (var1 == this.field1141) {
         return null;
      } else {
         var1.method637();
         return var1;
      }
   }

   @ObfInfo(
      owner = "mq",
      name = "q",
      desc = "()Lpl;"
   )
   public class139 method651() {
      class139 var1 = this.field1141.field1133;
      if (var1 == this.field1141) {
         return null;
      } else {
         var1.method637();
         return var1;
      }
   }

   @ObfInfo(
      owner = "mq",
      name = "f",
      desc = "()Lpl;"
   )
   public class139 method646() {
      class139 var1 = this.field1141.field1132;
      if (var1 == this.field1141) {
         this.field1140 = null;
         return null;
      } else {
         this.field1140 = var1.field1132;
         return var1;
      }
   }

   @ObfInfo(
      owner = "mq",
      name = "r",
      desc = "()Lpl;"
   )
   public class139 method647() {
      class139 var1 = this.field1141.field1133;
      if (var1 == this.field1141) {
         this.field1140 = null;
         return null;
      } else {
         this.field1140 = var1.field1133;
         return var1;
      }
   }

   @ObfInfo(
      owner = "mq",
      name = "u",
      desc = "()Lpl;"
   )
   public class139 method648() {
      class139 var1 = this.field1140;
      if (var1 == this.field1141) {
         this.field1140 = null;
         return null;
      } else {
         this.field1140 = var1.field1132;
         return var1;
      }
   }

   @ObfInfo(
      owner = "mq",
      name = "b",
      desc = "()Lpl;"
   )
   public class139 method650() {
      class139 var1 = this.field1140;
      if (var1 == this.field1141) {
         this.field1140 = null;
         return null;
      } else {
         this.field1140 = var1.field1133;
         return var1;
      }
   }

   @ObfInfo(
      owner = "mq",
      name = "x",
      desc = "(Lpl;Lpl;)V"
   )
   public static void method644(class139 var0, class139 var1) {
      if (var0.field1133 != null) {
         var0.method637();
      }

      var0.field1133 = var1.field1133;
      var0.field1132 = var1;
      var0.field1133.field1132 = var0;
      var0.field1132.field1133 = var0;
   }
}
