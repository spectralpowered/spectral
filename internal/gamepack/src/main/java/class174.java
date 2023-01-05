public class class174 implements Comparable {
   String field1914;
   String field1915;

   public class174(String var1) {
      this.field1915 = var1;
      class468 var4 = class468.field3897;
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

            while(var6 > var5 && class302.method1426(var1.charAt(var6 - 1))) {
               --var6;
            }

            int var12 = var6 - var5;
            if (var12 >= 1) {
               byte var9;
               if (var4 == null) {
                  var9 = 12;
               } else {
                  switch(var4.field3899) {
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
                     if (class204.method1052(var10)) {
                        char var11 = class37.method207(var10);
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

      this.field1914 = var3;
   }

   public class174(String var1, class468 var2) {
      this.field1915 = var1;
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

            while(var6 > var5 && class302.method1426(var1.charAt(var6 - 1))) {
               --var6;
            }

            int var12 = var6 - var5;
            if (var12 >= 1) {
               byte var9;
               if (null == var2) {
                  var9 = 12;
               } else {
                  switch(var2.field3899) {
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
                     if (class204.method1052(var10)) {
                        char var11 = class37.method207(var10);
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

      this.field1914 = var4;
   }

   public String method928() {
      return this.field1915;
   }

   public String method929() {
      return this.field1914;
   }

   public boolean method930() {
      return this.field1914 != null;
   }

   public boolean equals(Object var1) {
      if (var1 instanceof class174) {
         class174 var2 = (class174)var1;
         if (null == this.field1914) {
            return null == var2.field1914;
         } else if (var2.field1914 == null) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.field1914.equals(var2.field1914);
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      return null == this.field1914 ? 0 : this.field1914.hashCode();
   }

   public String toString() {
      return this.method928();
   }

   public int method931(class174 var1) {
      if (this.field1914 == null) {
         return null == var1.field1914 ? 0 : 1;
      } else {
         return null == var1.field1914 ? -1 : this.field1914.compareTo(var1.field1914);
      }
   }

   public int compareTo(Object var1) {
      return this.method931((class174)var1);
   }
}
