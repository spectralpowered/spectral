public final class class151 {
   public static byte[][][] field1173;
   static boolean field1180;
   boolean field1177 = true;
   int field1172;
   int field1174;
   int field1175;
   int field1176;
   int field1178;
   int field1179;

   class151(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.field1179 = var1;
      this.field1178 = var2;
      this.field1174 = var3;
      this.field1175 = var4;
      this.field1176 = var5;
      this.field1172 = var6;
      this.field1177 = var7;
   }

   public static class352 method702(int var0) {
      class352[] var2 = new class352[]{class352.field2895, class352.field2897, class352.field2894};
      class352[] var3 = var2;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class352 var5 = var3[var4];
         if (var5.field2896 == var0) {
            return var5;
         }
      }

      return null;
   }

   static int method701(int var0, class461 var1, boolean var2) {
      if (var0 == 3800) {
         if (null != class91.field770) {
            class386.field3248[++class161.field1227 - 1] = 1;
            class223.field1922 = class91.field770;
         } else {
            class386.field3248[++class161.field1227 - 1] = 0;
         }

         return 1;
      } else {
         int var4;
         if (var0 == 3801) {
            var4 = class386.field3248[--class161.field1227];
            if (client.field466[var4] != null) {
               class386.field3248[++class161.field1227 - 1] = 1;
               class223.field1922 = client.field466[var4];
            } else {
               class386.field3248[++class161.field1227 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3802) {
            class386.field3249[++class386.field3250 - 1] = class223.field1922.field3548;
            return 1;
         } else if (var0 == 3803) {
            class386.field3248[++class161.field1227 - 1] = class223.field1922.field3550 ? 1 : 0;
            return 1;
         } else if (var0 == 3804) {
            class386.field3248[++class161.field1227 - 1] = class223.field1922.field3551;
            return 1;
         } else if (var0 == 3805) {
            class386.field3248[++class161.field1227 - 1] = class223.field1922.field3552;
            return 1;
         } else if (var0 == 3806) {
            class386.field3248[++class161.field1227 - 1] = class223.field1922.field3555;
            return 1;
         } else if (var0 == 3807) {
            class386.field3248[++class161.field1227 - 1] = class223.field1922.field3553;
            return 1;
         } else if (var0 == 3809) {
            class386.field3248[++class161.field1227 - 1] = class223.field1922.field3554;
            return 1;
         } else if (var0 == 3810) {
            var4 = class386.field3248[--class161.field1227];
            class386.field3249[++class386.field3250 - 1] = class223.field1922.field3558[var4];
            return 1;
         } else if (var0 == 3811) {
            var4 = class386.field3248[--class161.field1227];
            class386.field3248[++class161.field1227 - 1] = class223.field1922.field3564[var4];
            return 1;
         } else if (var0 == 3812) {
            class386.field3248[++class161.field1227 - 1] = class223.field1922.field3562;
            return 1;
         } else if (var0 == 3813) {
            var4 = class386.field3248[--class161.field1227];
            class386.field3249[++class386.field3250 - 1] = class223.field1922.field3563[var4];
            return 1;
         } else {
            int var6;
            int var7;
            if (var0 == 3814) {
               class161.field1227 -= 3;
               var4 = class386.field3248[class161.field1227];
               var7 = class386.field3248[class161.field1227 + 1];
               var6 = class386.field3248[2 + class161.field1227];
               class386.field3248[++class161.field1227 - 1] = class223.field1922.method2102(var4, var7, var6, (byte)43);
               return 1;
            } else if (var0 == 3815) {
               class386.field3248[++class161.field1227 - 1] = class223.field1922.field3560;
               return 1;
            } else if (var0 == 3816) {
               class386.field3248[++class161.field1227 - 1] = class223.field1922.field3561;
               return 1;
            } else if (var0 == 3817) {
               class386.field3248[++class161.field1227 - 1] = class223.field1922.method2099(class386.field3249[--class386.field3250]);
               return 1;
            } else if (var0 == 3818) {
               class386.field3248[class161.field1227 - 1] = class223.field1922.method2117()[class386.field3248[class161.field1227 - 1]];
               return 1;
            } else if (var0 == 3819) {
               class161.field1227 -= 2;
               var4 = class386.field3248[class161.field1227];
               var7 = class386.field3248[class161.field1227 + 1];
               class38.method163(var7, var4);
               return 1;
            } else if (var0 == 3820) {
               var4 = class386.field3248[--class161.field1227];
               class386.field3248[++class161.field1227 - 1] = class223.field1922.field3543[var4];
               return 1;
            } else {
               if (var0 == 3821) {
                  class161.field1227 -= 3;
                  var4 = class386.field3248[class161.field1227];
                  boolean var5 = 1 == class386.field3248[1 + class161.field1227];
                  var6 = class386.field3248[2 + class161.field1227];
                  class149.method699(var6, var4, var5);
               }

               if (var0 == 3822) {
                  var4 = class386.field3248[--class161.field1227];
                  class386.field3248[++class161.field1227 - 1] = class223.field1922.field3547[var4] ? 1 : 0;
                  return 1;
               } else if (var0 == 3850) {
                  if (null != class198.field1746) {
                     class386.field3248[++class161.field1227 - 1] = 1;
                     class198.field1744 = class198.field1746;
                  } else {
                     class386.field3248[++class161.field1227 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3851) {
                  var4 = class386.field3248[--class161.field1227];
                  if (client.field345[var4] != null) {
                     class386.field3248[++class161.field1227 - 1] = 1;
                     class198.field1744 = client.field345[var4];
                     class319.field2552 = var4;
                  } else {
                     class386.field3248[++class161.field1227 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3852) {
                  class386.field3249[++class386.field3250 - 1] = class198.field1744.field592;
                  return 1;
               } else if (var0 == 3853) {
                  class386.field3248[++class161.field1227 - 1] = class198.field1744.field595;
                  return 1;
               } else if (var0 == 3854) {
                  class386.field3248[++class161.field1227 - 1] = class198.field1744.field593;
                  return 1;
               } else if (var0 == 3855) {
                  class386.field3248[++class161.field1227 - 1] = class198.field1744.method270();
                  return 1;
               } else if (var0 == 3856) {
                  var4 = class386.field3248[--class161.field1227];
                  class386.field3249[++class386.field3250 - 1] = ((class49)class198.field1744.field597.get(var4)).field567.method1101();
                  return 1;
               } else if (var0 == 3857) {
                  var4 = class386.field3248[--class161.field1227];
                  class386.field3248[++class161.field1227 - 1] = ((class49)class198.field1744.field597.get(var4)).field569;
                  return 1;
               } else if (var0 == 3858) {
                  var4 = class386.field3248[--class161.field1227];
                  class386.field3248[++class161.field1227 - 1] = ((class49)class198.field1744.field597.get(var4)).field568;
                  return 1;
               } else if (var0 == 3859) {
                  var4 = class386.field3248[--class161.field1227];
                  class241.method1047(class319.field2552, var4);
                  return 1;
               } else if (var0 == 3860) {
                  class386.field3248[++class161.field1227 - 1] = class198.field1744.method271(class386.field3249[--class386.field3250]);
                  return 1;
               } else if (var0 == 3861) {
                  class386.field3248[class161.field1227 - 1] = class198.field1744.method268()[class386.field3248[class161.field1227 - 1]];
                  return 1;
               } else if (var0 == 3890) {
                  class386.field3248[++class161.field1227 - 1] = null != class397.field3352 ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }
}
