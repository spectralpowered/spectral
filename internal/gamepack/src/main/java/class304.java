import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class304 {
   class368[] field2441;
   int field2439 = 0;
   Comparator field2438 = null;
   HashMap field2440;
   HashMap field2443;
   final int field2442;

   class304(int var1) {
      this.field2442 = var1;
      this.field2441 = this.method1485(var1);
      this.field2443 = new HashMap(var1 / 8);
      this.field2440 = new HashMap(var1 / 8);
   }

   abstract class368 method1482();

   abstract class368[] method1485(int var1);

   public void method1466() {
      this.field2439 = 0;
      Arrays.fill(this.field2441, (Object)null);
      this.field2443.clear();
      this.field2440.clear();
   }

   public int method1467() {
      return this.field2439;
   }

   public boolean method1468() {
      return this.field2442 == this.field2439;
   }

   public boolean method1469(class257 var1) {
      if (!var1.method1103()) {
         return false;
      } else {
         return this.field2443.containsKey(var1) ? true : this.field2440.containsKey(var1);
      }
   }

   public class368 method1484(class257 var1) {
      class368 var3 = this.method1483(var1);
      return var3 != null ? var3 : this.method1471(var1);
   }

   class368 method1483(class257 var1) {
      return !var1.method1103() ? null : (class368)this.field2443.get(var1);
   }

   class368 method1471(class257 var1) {
      return !var1.method1103() ? null : (class368)this.field2440.get(var1);
   }

   public final boolean method1488(class257 var1) {
      class368 var3 = this.method1483(var1);
      if (null == var3) {
         return false;
      } else {
         this.method1472(var3);
         return true;
      }
   }

   final void method1472(class368 var1) {
      int var3 = this.method1477(var1);
      if (var3 != -1) {
         this.method1481(var3);
         this.method1478(var1);
      }
   }

   class368 method1473(class257 var1) {
      return this.method1474(var1, (class257)null);
   }

   class368 method1474(class257 var1, class257 var2) {
      if (this.method1483(var1) != null) {
         throw new IllegalStateException();
      } else {
         class368 var4 = this.method1482();
         var4.method1815(var1, var2);
         this.method1479(var4);
         this.method1480(var4);
         return var4;
      }
   }

   public final class368 method1475(int var1) {
      if (var1 >= 0 && var1 < this.field2439) {
         return this.field2441[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   public final void method1487() {
      if (this.field2438 == null) {
         Arrays.sort(this.field2441, 0, this.field2439);
      } else {
         Arrays.sort(this.field2441, 0, this.field2439, this.field2438);
      }

   }

   final void method1476(class368 var1, class257 var2, class257 var3) {
      this.method1478(var1);
      var1.method1815(var2, var3);
      this.method1480(var1);
   }

   final int method1477(class368 var1) {
      for(int var3 = 0; var3 < this.field2439; ++var3) {
         if (this.field2441[var3] == var1) {
            return var3;
         }
      }

      return -1;
   }

   final void method1478(class368 var1) {
      if (this.field2443.remove(var1.field3127) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.field3128 != null) {
            this.field2440.remove(var1.field3128);
         }

      }
   }

   final void method1479(class368 var1) {
      this.field2441[++this.field2439 - 1] = var1;
   }

   final void method1480(class368 var1) {
      this.field2443.put(var1.field3127, var1);
      if (null != var1.field3128) {
         class368 var3 = (class368)this.field2440.put(var1.field3128, var1);
         if (var3 != null && var3 != var1) {
            var3.field3128 = null;
         }
      }

   }

   final void method1481(int var1) {
      --this.field2439;
      if (var1 < this.field2439) {
         System.arraycopy(this.field2441, var1 + 1, this.field2441, var1, this.field2439 - var1);
      }

   }

   public final void method1470() {
      this.field2438 = null;
   }

   public final void method1489(Comparator var1) {
      if (null == this.field2438) {
         this.field2438 = var1;
      } else if (this.field2438 instanceof class392) {
         ((class392)this.field2438).method1917(var1);
      }

   }

   public static char method1486(char var0) {
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
