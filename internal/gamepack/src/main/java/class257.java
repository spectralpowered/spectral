@ObfInfo(
   name = "rp"
)
public class class257 implements Comparable {
   @ObfInfo(
      owner = "rp",
      name = "e",
      desc = "Ljava/lang/String;"
   )
   String field2102;
   @ObfInfo(
      owner = "rp",
      name = "h",
      desc = "Ljava/lang/String;"
   )
   String field2103;

   @ObfInfo(
      owner = "rp",
      name = "<init>",
      desc = "(Ljava/lang/String;)V"
   )
   public class257(String var1) {
      this.field2103 = var1;
      class194 var4 = class194.field1726;
      String var3;
      if (null == var1) {
         var3 = null;
      } else {
         label80: {
            int var5 = 0;

            int var6;
            for(var6 = var1.length(); var5 < var6; ++var5) {
               char var8 = var1.charAt(var5);
               boolean var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
               if (!var7) {
                  break;
               }
            }

            while(var6 > var5 && class290.method1427(var1.charAt(var6 - 1))) {
               --var6;
            }

            int var12 = var6 - var5;
            if (var12 >= 1) {
               byte var9;
               if (var4 == null) {
                  var9 = 12;
               } else {
                  switch(var4.field1728) {
                  case 1:
                     var9 = 20;
                     break;
                  default:
                     var9 = 12;
                  }
               }

               if (var12 <= var9) {
                  StringBuilder var13 = new StringBuilder(var12);

                  for(int var14 = var5; var14 < var6; ++var14) {
                     char var10 = var1.charAt(var14);
                     if (class39.method167(var10)) {
                        char var11 = class304.method1486(var10);
                        if (var11 != 0) {
                           var13.append(var11);
                        }
                     }
                  }

                  if (var13.length() == 0) {
                     var3 = null;
                  } else {
                     var3 = var13.toString();
                  }
                  break label80;
               }
            }

            var3 = null;
         }
      }

      this.field2102 = var3;
   }

   @ObfInfo(
      owner = "rp",
      name = "<init>",
      desc = "(Ljava/lang/String;Lqi;)V"
   )
   public class257(String var1, class194 var2) {
      this.field2103 = var1;
      String var4;
      if (var1 == null) {
         var4 = null;
      } else {
         label79: {
            int var5 = 0;

            int var6;
            for(var6 = var1.length(); var5 < var6; ++var5) {
               char var8 = var1.charAt(var5);
               boolean var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
               if (!var7) {
                  break;
               }
            }

            while(var6 > var5 && class290.method1427(var1.charAt(var6 - 1))) {
               --var6;
            }

            int var12 = var6 - var5;
            if (var12 >= 1) {
               byte var9;
               if (null == var2) {
                  var9 = 12;
               } else {
                  switch(var2.field1728) {
                  case 1:
                     var9 = 20;
                     break;
                  default:
                     var9 = 12;
                  }
               }

               if (var12 <= var9) {
                  StringBuilder var13 = new StringBuilder(var12);

                  for(int var14 = var5; var14 < var6; ++var14) {
                     char var10 = var1.charAt(var14);
                     if (class39.method167(var10)) {
                        char var11 = class304.method1486(var10);
                        if (var11 != 0) {
                           var13.append(var11);
                        }
                     }
                  }

                  if (var13.length() == 0) {
                     var4 = null;
                  } else {
                     var4 = var13.toString();
                  }
                  break label79;
               }
            }

            var4 = null;
         }
      }

      this.field2102 = var4;
   }

   @ObfInfo(
      owner = "rp",
      name = "h",
      desc = "(I)Ljava/lang/String;"
   )
   public String method1101() {
      return this.field2103;
   }

   @ObfInfo(
      owner = "rp",
      name = "e",
      desc = "(B)Ljava/lang/String;"
   )
   public String method1102() {
      return this.field2102;
   }

   @ObfInfo(
      owner = "rp",
      name = "v",
      desc = "(B)Z"
   )
   public boolean method1103() {
      return this.field2102 != null;
   }

   @ObfInfo(
      owner = "rp",
      name = "equals",
      desc = "(Ljava/lang/Object;)Z"
   )
   public boolean equals(Object var1) {
      if (var1 instanceof class257) {
         class257 var2 = (class257)var1;
         if (null == this.field2102) {
            return null == var2.field2102;
         } else if (var2.field2102 == null) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.field2102.equals(var2.field2102);
         }
      } else {
         return false;
      }
   }

   @ObfInfo(
      owner = "rp",
      name = "hashCode",
      desc = "()I"
   )
   public int hashCode() {
      return null == this.field2102 ? 0 : this.field2102.hashCode();
   }

   @ObfInfo(
      owner = "rp",
      name = "toString",
      desc = "()Ljava/lang/String;"
   )
   public String toString() {
      return this.method1101();
   }

   @ObfInfo(
      owner = "rp",
      name = "x",
      desc = "(Lrp;B)I"
   )
   public int method1104(class257 var1) {
      if (this.field2102 == null) {
         return null == var1.field2102 ? 0 : 1;
      } else {
         return null == var1.field2102 ? -1 : this.field2102.compareTo(var1.field2102);
      }
   }

   @ObfInfo(
      owner = "rp",
      name = "compareTo",
      desc = "(Ljava/lang/Object;)I"
   )
   public int compareTo(Object var1) {
      return this.method1104((class257)var1);
   }
}
