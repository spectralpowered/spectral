import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class452 {
   class432 field3713;
   float[] field3709 = new float[4];
   int field3710 = -1;
   String field3708 = null;
   String field3711;
   ArrayList field3712 = new ArrayList();
   ArrayList field3714 = new ArrayList();
   ArrayList field3715 = new ArrayList();
   Map field3716 = new HashMap();
   Map field3717 = new HashMap();

   public boolean method2130(String var1, class163 var2) {
      if (null != var1 && !var1.isEmpty()) {
         if (var2 == null) {
            return false;
         } else {
            this.method2142();

            try {
               this.field3711 = var1;
               this.field3713 = var2.method861(new URL(this.field3711));
               this.field3710 = 0;
               return true;
            } catch (MalformedURLException var5) {
               this.method2142();
               this.field3710 = 100;
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public void method2131(class163 var1) {
      switch(this.field3710) {
      case 0:
         this.method2138(var1);
         break;
      case 1:
         this.method2139();
         break;
      default:
         return;
      }

   }

   public int method2132() {
      return this.field3710;
   }

   public int method2133(String var1) {
      return this.field3716.containsKey(var1) ? ((Integer)this.field3716.get(var1)).intValue() : -1;
   }

   public String method2134(String var1) {
      return (String)((String)(this.field3717.containsKey(var1) ? this.field3717.get(var1) : null));
   }

   public ArrayList method2141() {
      return this.field3715;
   }

   public ArrayList method2135() {
      return this.field3712;
   }

   public String method2136() {
      return this.field3708;
   }

   public ArrayList method2137() {
      return this.field3714;
   }

   void method2142() {
      this.field3713 = null;
      this.field3708 = null;
      this.field3709[0] = 0.0F;
      this.field3709[1] = 0.0F;
      this.field3709[2] = 1.0F;
      this.field3709[3] = 1.0F;
      this.field3714.clear();
      this.field3715.clear();
      this.field3712.clear();
      this.field3716.clear();
      this.field3717.clear();
   }

   void method2138(class163 var1) {
      if (this.field3713 != null && this.field3713.method2081()) {
         byte[] var3 = this.field3713.method2079();
         if (null == var3) {
            this.method2142();
            this.field3710 = 100;
         } else {
            JSONObject var4;
            try {
               class477 var5 = new class477(var3);
               var4 = var5.method2308();
               var4 = var4.getJSONObject("message");
            } catch (Exception var10) {
               this.method2142();
               this.field3710 = 102;
               return;
            }

            try {
               this.method2140(var4.getJSONArray("images"), var1);
            } catch (Exception var9) {
               this.field3715.clear();
            }

            try {
               this.method2144(var4.getJSONArray("labels"));
            } catch (Exception var8) {
               this.field3712.clear();
            }

            try {
               this.method2145(var4.getJSONObject("behaviour"));
            } catch (Exception var7) {
               this.field3708 = null;
               this.field3709[0] = 0.0F;
               this.field3709[1] = 0.0F;
               this.field3709[2] = 1.0F;
               this.field3709[3] = 1.0F;
               this.field3714.clear();
            }

            try {
               this.method2143(var4.getJSONObject("meta"));
            } catch (Exception var6) {
               this.field3716.clear();
               this.field3717.clear();
            }

            this.field3710 = this.field3715.size() > 0 ? 1 : 2;
            this.field3713 = null;
         }
      }
   }

   void method2139() {
      Iterator var2 = this.field3715.iterator();

      class147 var3;
      do {
         if (!var2.hasNext()) {
            var2 = this.field3715.iterator();

            while(var2.hasNext()) {
               var3 = (class147)var2.next();
               if (null != var3.field1562) {
                  byte[] var4 = var3.field1562.method2079();
                  if (var4 != null && var4.length > 0) {
                     this.field3710 = 2;
                     return;
                  }
               }
            }

            this.method2142();
            this.field3710 = 101;
            return;
         }

         var3 = (class147)var2.next();
      } while(var3.field1562 == null || var3.field1562.method2081());

   }

   void method2140(JSONArray var1, class163 var2) throws JSONException {
      if (var1 != null) {
         for(int var4 = 0; var4 < var1.length(); ++var4) {
            try {
               JSONObject var5 = var1.getJSONObject(var4);
               class147 var6 = new class147(this);
               var6.field1562 = var2.method861(new URL(var5.getString("src")));
               var6.field1563 = class52.method294(var5, "placement");
               this.field3715.add(var6);
            } catch (MalformedURLException var7) {
               ;
            }
         }

      }
   }

   void method2144(JSONArray var1) throws JSONException {
      if (null != var1) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            JSONObject var4 = var1.getJSONObject(var3);
            class357 var5 = new class357(this);
            var5.field3197 = var4.getString("text");
            String var8 = var4.getString("align_x");
            byte var7;
            if (var8.equals("centre")) {
               var7 = 1;
            } else if (!var8.equals("bottom") && !var8.equals("right")) {
               var7 = 0;
            } else {
               var7 = 2;
            }

            var5.field3200 = var7;
            var5.field3201 = class493.method2390(var4.getString("align_y"));
            var5.field3199 = var4.getInt("font");
            var5.field3198 = class52.method294(var4, "placement");
            this.field3712.add(var5);
         }

      }
   }

   void method2145(JSONObject var1) throws JSONException {
      if (null != var1) {
         this.field3709 = class52.method294(var1, "clickbounds");
         this.field3708 = var1.getString("endpoint");
         String[] var3 = JSONObject.getNames(var1);

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            if (!var3[var4].equals("clickbounds") && !var3[var4].equals("endpoint")) {
               try {
                  int var5 = var1.getInt(var3[var4]);
                  this.field3714.add(new class286(this, var3[var4], var5));
               } catch (Exception var8) {
                  try {
                     String var6 = var1.getString(var3[var4]);
                     if (var6.equals("true")) {
                        this.field3714.add(new class286(this, var3[var4], 1));
                     } else if (var6.equals("false")) {
                        this.field3714.add(new class286(this, var3[var4], 0));
                     } else {
                        this.field3714.add(new class417(this, var3[var4], var6));
                     }
                  } catch (Exception var7) {
                     ;
                  }
               }
            }
         }

      }
   }

   void method2143(JSONObject var1) throws JSONException {
      String[] var3 = JSONObject.getNames(var1);

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         try {
            int var5 = var1.getInt(var3[var4]);
            this.field3716.put(var3[var4], var5);
         } catch (Exception var8) {
            try {
               String var6 = var1.getString(var3[var4]);
               if (var6.equals("true")) {
                  this.field3716.put(var3[var4], Integer.valueOf(1));
               } else if (var6.equals("false")) {
                  this.field3716.put(var3[var4], Integer.valueOf(0));
               } else {
                  this.field3717.put(var3[var4], var6);
               }
            } catch (Exception var7) {
               ;
            }
         }
      }

   }

   static class188[] method2149() {
      return new class188[]{class188.field1983, class188.field1984, class188.field1985, class188.field1986, class188.field1990, class188.field1992};
   }

   public static int method2147(int var0) {
      return (var0 & class469.field3906) - 1;
   }

   public static int method2146(int var0) {
      return class135.field1490[var0 & 16383];
   }

   static final int method2148() {
      if (class111.field1385.method1317()) {
         return class195.field2036;
      } else {
         int var1 = 3;
         if (class389.field3438 < 310) {
            int var2;
            int var3;
            if (1 == client.field510) {
               var2 = class377.field3308 >> 7;
               var3 = class18.field140 >> 7;
            } else {
               var2 = class89.field982.field297 >> 7;
               var3 = class89.field982.field233 >> 7;
            }

            int var4 = class342.field3148 >> 7;
            int var5 = class112.field1394 >> 7;
            if (var4 < 0 || var5 < 0 || var4 >= 104 || var5 >= 104) {
               return class195.field2036;
            }

            if (var2 < 0 || var3 < 0 || var2 >= 104 || var3 >= 104) {
               return class195.field2036;
            }

            if (0 != (class74.field866[class195.field2036][var4][var5] & 4)) {
               var1 = class195.field2036;
            }

            int var6;
            if (var2 > var4) {
               var6 = var2 - var4;
            } else {
               var6 = var4 - var2;
            }

            int var7;
            if (var3 > var5) {
               var7 = var3 - var5;
            } else {
               var7 = var5 - var3;
            }

            int var8;
            int var9;
            if (var6 > var7) {
               var8 = var7 * 65536 / var6;
               var9 = 32768;

               while(var2 != var4) {
                  if (var4 < var2) {
                     ++var4;
                  } else if (var4 > var2) {
                     --var4;
                  }

                  if (0 != (class74.field866[class195.field2036][var4][var5] & 4)) {
                     var1 = class195.field2036;
                  }

                  var9 += var8;
                  if (var9 >= 65536) {
                     var9 -= 65536;
                     if (var5 < var3) {
                        ++var5;
                     } else if (var5 > var3) {
                        --var5;
                     }

                     if ((class74.field866[class195.field2036][var4][var5] & 4) != 0) {
                        var1 = class195.field2036;
                     }
                  }
               }
            } else if (var7 > 0) {
               var8 = var6 * 65536 / var7;
               var9 = 32768;

               while(var5 != var3) {
                  if (var5 < var3) {
                     ++var5;
                  } else if (var5 > var3) {
                     --var5;
                  }

                  if (0 != (class74.field866[class195.field2036][var4][var5] & 4)) {
                     var1 = class195.field2036;
                  }

                  var9 += var8;
                  if (var9 >= 65536) {
                     var9 -= 65536;
                     if (var4 < var2) {
                        ++var4;
                     } else if (var4 > var2) {
                        --var4;
                     }

                     if (0 != (class74.field866[class195.field2036][var4][var5] & 4)) {
                        var1 = class195.field2036;
                     }
                  }
               }
            }
         }

         if (class89.field982.field297 >= 0 && class89.field982.field233 >= 0 && class89.field982.field297 < 13312 && class89.field982.field233 < 13312) {
            if ((class74.field866[class195.field2036][class89.field982.field297 >> 7][class89.field982.field233 >> 7] & 4) != 0) {
               var1 = class195.field2036;
            }

            return var1;
         } else {
            return class195.field2036;
         }
      }
   }
}
