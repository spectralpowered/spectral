import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class37 {
   class209[] field356;
   int field354 = 0;
   Comparator field353 = null;
   HashMap field355;
   HashMap field358;
   final int field357;

   class37(int var1) {
      this.field357 = var1;
      this.field356 = this.method206(var1);
      this.field358 = new HashMap(var1 / 8);
      this.field355 = new HashMap(var1 / 8);
   }

   abstract class209 method203();

   abstract class209[] method206(int var1);

   public void method187() {
      this.field354 = 0;
      Arrays.fill(this.field356, (Object)null);
      this.field358.clear();
      this.field355.clear();
   }

   public int method188() {
      return this.field354;
   }

   public boolean method189() {
      return this.field357 == this.field354;
   }

   public boolean method190(class174 var1) {
      if (!var1.method930()) {
         return false;
      } else {
         return this.field358.containsKey(var1) ? true : this.field355.containsKey(var1);
      }
   }

   public class209 method205(class174 var1) {
      class209 var3 = this.method204(var1);
      return var3 != null ? var3 : this.method192(var1);
   }

   class209 method204(class174 var1) {
      return !var1.method930() ? null : (class209)this.field358.get(var1);
   }

   class209 method192(class174 var1) {
      return !var1.method930() ? null : (class209)this.field355.get(var1);
   }

   public final boolean method209(class174 var1) {
      class209 var3 = this.method204(var1);
      if (null == var3) {
         return false;
      } else {
         this.method193(var3);
         return true;
      }
   }

   final void method193(class209 var1) {
      int var3 = this.method198(var1);
      if (var3 != -1) {
         this.method202(var3);
         this.method199(var1);
      }
   }

   class209 method194(class174 var1) {
      return this.method195(var1, (class174)null);
   }

   class209 method195(class174 var1, class174 var2) {
      if (this.method204(var1) != null) {
         throw new IllegalStateException();
      } else {
         class209 var4 = this.method203();
         var4.method1061(var1, var2);
         this.method200(var4);
         this.method201(var4);
         return var4;
      }
   }

   public final class209 method196(int var1) {
      if (var1 >= 0 && var1 < this.field354) {
         return this.field356[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   public final void method208() {
      if (this.field353 == null) {
         Arrays.sort(this.field356, 0, this.field354);
      } else {
         Arrays.sort(this.field356, 0, this.field354, this.field353);
      }

   }

   final void method197(class209 var1, class174 var2, class174 var3) {
      this.method199(var1);
      var1.method1061(var2, var3);
      this.method201(var1);
   }

   final int method198(class209 var1) {
      for(int var3 = 0; var3 < this.field354; ++var3) {
         if (this.field356[var3] == var1) {
            return var3;
         }
      }

      return -1;
   }

   final void method199(class209 var1) {
      if (this.field358.remove(var1.field2200) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.field2201 != null) {
            this.field355.remove(var1.field2201);
         }

      }
   }

   final void method200(class209 var1) {
      this.field356[++this.field354 - 1] = var1;
   }

   final void method201(class209 var1) {
      this.field358.put(var1.field2200, var1);
      if (null != var1.field2201) {
         class209 var3 = (class209)this.field355.put(var1.field2201, var1);
         if (var3 != null && var3 != var1) {
            var3.field2201 = null;
         }
      }

   }

   final void method202(int var1) {
      --this.field354;
      if (var1 < this.field354) {
         System.arraycopy(this.field356, var1 + 1, this.field356, var1, this.field354 - var1);
      }

   }

   public final void method191() {
      this.field353 = null;
   }

   public final void method210(Comparator var1) {
      if (null == this.field353) {
         this.field353 = var1;
      } else if (this.field353 instanceof class305) {
         ((class305)this.field353).method1439(var1);
      }

   }

   public static char method207(char var0) {
      switch(var0) {
      case ' ':
      case '-':
      case '_':
      case ' ':
         return '_';
      case '#':
      case '[':
      case ']':
         return var0;
      case 'À':
      case 'Á':
      case 'Â':
      case 'Ã':
      case 'Ä':
      case 'à':
      case 'á':
      case 'â':
      case 'ã':
      case 'ä':
         return 'a';
      case 'Ç':
      case 'ç':
         return 'c';
      case 'È':
      case 'É':
      case 'Ê':
      case 'Ë':
      case 'è':
      case 'é':
      case 'ê':
      case 'ë':
         return 'e';
      case 'Í':
      case 'Î':
      case 'Ï':
      case 'í':
      case 'î':
      case 'ï':
         return 'i';
      case 'Ñ':
      case 'ñ':
         return 'n';
      case 'Ò':
      case 'Ó':
      case 'Ô':
      case 'Õ':
      case 'Ö':
      case 'ò':
      case 'ó':
      case 'ô':
      case 'õ':
      case 'ö':
         return 'o';
      case 'Ù':
      case 'Ú':
      case 'Û':
      case 'Ü':
      case 'ù':
      case 'ú':
      case 'û':
      case 'ü':
         return 'u';
      case 'ß':
         return 'b';
      case 'ÿ':
      case 'Ÿ':
         return 'y';
      default:
         return Character.toLowerCase(var0);
      }
   }
}
