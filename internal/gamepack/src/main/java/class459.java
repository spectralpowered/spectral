import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class class459 {
   boolean field3816 = true;
   boolean field3819 = false;
   boolean field3820 = false;
   class202 field3812 = new class202();
   class202 field3817 = new class202();
   class290 field3831;
   class290 field3832;
   int field3811 = 0;
   int field3813 = Integer.MAX_VALUE;
   int field3814 = 0;
   int field3815 = Integer.MAX_VALUE;
   int field3818 = 0;
   int field3821 = 0;
   int field3822 = 0;
   int field3823 = 0;
   int field3824 = Integer.MAX_VALUE;
   int field3825 = 0;
   int field3826 = 0;
   int field3827 = 0;
   int field3828 = 0;
   int field3829 = 0;
   int field3830 = 0;

   class459() {
      this.field3817.method1046(1);
      this.field3812.method1046(1);
   }

   void method2185() {
      this.field3830 = (this.field3830 + 1) % 60;
      if (this.field3827 > 0) {
         --this.field3827;
      }

   }

   public boolean method2186(boolean var1) {
      var1 = var1 && this.field3816;
      boolean var3 = var1 != this.field3819;
      this.field3819 = var1;
      if (!this.field3819) {
         this.method2207(this.field3818, this.field3818);
      }

      return var3;
   }

   public void method2187(boolean var1) {
      this.field3816 = var1;
      this.field3819 = var1 && this.field3819;
   }

   boolean method2188(String var1) {
      String var3 = this.field3817.method1040();
      if (!var3.equals(var1)) {
         var1 = this.method2240(var1);
         this.field3817.method1027(var1);
         this.method2194(this.field3814, this.field3811);
         this.method2220();
         this.method2244();
         return true;
      } else {
         return false;
      }
   }

   boolean method2262(String var1) {
      this.field3812.method1027(var1);
      return true;
   }

   boolean method2189(class93 var1) {
      boolean var3 = !this.field3820;
      this.field3817.method1044(var1);
      this.field3812.method1044(var1);
      this.field3820 = true;
      var3 |= this.method2194(this.field3814, this.field3811);
      var3 |= this.method2207(this.field3825, this.field3818);
      if (this.method2220()) {
         this.method2244();
         var3 = true;
      }

      return var3;
   }

   public boolean method2190(int var1, int var2) {
      boolean var4 = var1 != this.field3829 || this.field3828 != var2;
      this.field3829 = var1;
      this.field3828 = var2;
      var4 |= this.method2194(this.field3814, this.field3811);
      return var4;
   }

   public boolean method2191(int var1) {
      if (var1 < 0) {
         var1 = Integer.MAX_VALUE;
      }

      boolean var3 = var1 == this.field3817.method1034();
      this.field3817.method1021(var1, true);
      this.field3812.method1021(var1, true);
      if (this.method2220()) {
         this.method2244();
         var3 = true;
      }

      return var3;
   }

   public boolean method2192(int var1) {
      if (var1 < 0) {
         this.field3824 = Integer.MAX_VALUE;
      } else {
         this.field3824 = var1;
      }

      if (this.method2220()) {
         this.method2244();
         return true;
      } else {
         return false;
      }
   }

   public boolean method2193(int var1, byte var2) {
      this.field3815 = var1;
      if (this.method2220()) {
         if (var2 == -1) {
            throw new IllegalStateException();
         } else {
            this.method2244();
            return true;
         }
      } else {
         return false;
      }
   }

   public boolean method2194(int var1, int var2) {
      if (!this.method2257()) {
         this.field3814 = var1;
         this.field3811 = var2;
         return false;
      } else {
         int var4 = this.field3814;
         int var5 = this.field3811;
         int var6 = Math.max(0, this.field3817.method1032() - this.field3829 + 2);
         int var7 = Math.max(0, this.field3817.method1049() - this.field3828 + 1);
         this.field3814 = Math.max(0, Math.min(var6, var1));
         this.field3811 = Math.max(0, Math.min(var7, var2));
         return this.field3814 != var4 || this.field3811 != var5;
      }
   }

   public boolean method2195(int var1, int var2) {
      return true;
   }

   public void method2196(int var1) {
      this.field3817.method1045(var1);
   }

   public void method2197(int var1) {
      this.field3821 = var1;
   }

   public void method2248(int var1) {
      this.field3817.method1046(var1);
   }

   public void method2235(int var1) {
      this.field3817.method1022(var1);
   }

   public boolean method2254(int var1) {
      this.field3823 = var1;
      String var3 = this.field3817.method1040();
      int var4 = var3.length();
      var3 = this.method2240(var3);
      if (var3.length() != var4) {
         this.field3817.method1027(var3);
         this.method2194(this.field3814, this.field3811);
         this.method2220();
         this.method2244();
         return true;
      } else {
         return false;
      }
   }

   public void method2199() {
      this.field3820 = false;
   }

   public boolean method2200(int var1) {
      if (this.method2226(var1)) {
         this.method2205();
         class114 var3 = this.field3817.method1024((char)var1, this.field3818, this.field3813, this.field3824);
         this.method2207(var3.method595(), var3.method595());
         this.method2220();
         this.method2244();
      }

      return true;
   }

   public void method2201() {
      if (!this.method2205() && this.field3818 > 0) {
         int var2 = this.field3817.method1029(this.field3818 - 1);
         this.method2244();
         this.method2207(var2, var2);
      }

   }

   public void method2202() {
      if (!this.method2205() && this.field3818 < this.field3817.method1020()) {
         int var2 = this.field3817.method1029(this.field3818);
         this.method2244();
         this.method2207(var2, var2);
      }

   }

   public void method2203() {
      if (!this.method2205() && this.field3818 > 0) {
         class28 var2 = this.method2241(this.field3818 - 1);
         int var3 = this.field3817.method1023(((Integer)var2.field225).intValue(), this.field3818);
         this.method2244();
         this.method2207(var3, var3);
      }

   }

   public void method2204() {
      if (!this.method2205() && this.field3818 < this.field3817.method1020()) {
         class28 var2 = this.method2241(this.field3818);
         int var3 = this.field3817.method1023(this.field3818, ((Integer)var2.field224).intValue());
         this.method2244();
         this.method2207(var3, var3);
      }

   }

   boolean method2205() {
      if (!this.method2239()) {
         return false;
      } else {
         int var2 = this.field3817.method1023(this.field3825, this.field3818);
         this.method2244();
         this.method2207(var2, var2);
         return true;
      }
   }

   public void method2261() {
      this.method2207(0, this.field3817.method1020());
   }

   public boolean method2207(int var1, int var2) {
      if (!this.method2257()) {
         this.field3825 = var1;
         this.field3818 = var2;
         return false;
      } else {
         if (var1 > this.field3817.method1020()) {
            var1 = this.field3817.method1020();
         }

         if (var2 > this.field3817.method1020()) {
            var2 = this.field3817.method1020();
         }

         boolean var4 = this.field3825 != var1 || this.field3818 != var2;
         this.field3825 = var1;
         if (var2 != this.field3818) {
            this.field3818 = var2;
            this.field3830 = 0;
            this.method2243();
         }

         if (var4 && this.field3832 != null) {
            this.field3832.method1367();
         }

         return var4;
      }
   }

   public void method2263(boolean var1) {
      class28 var3 = this.method2253(this.field3818);
      this.method2260(((Integer)var3.field225).intValue(), var1);
   }

   public void method2208(boolean var1) {
      class28 var3 = this.method2253(this.field3818);
      this.method2260(((Integer)var3.field224).intValue(), var1);
   }

   public void method2209(boolean var1) {
      this.method2260(0, var1);
   }

   public void method2210(boolean var1) {
      this.method2260(this.field3817.method1020(), var1);
   }

   public void method2211(boolean var1) {
      if (this.method2239() && !var1) {
         this.method2260(Math.min(this.field3825, this.field3818), var1);
      } else if (this.field3818 > 0) {
         this.method2260(this.field3818 - 1, var1);
      }

   }

   public void method2212(boolean var1) {
      if (this.method2239() && !var1) {
         this.method2260(Math.max(this.field3825, this.field3818), var1);
      } else if (this.field3818 < this.field3817.method1020()) {
         this.method2260(this.field3818 + 1, var1);
      }

   }

   public void method2213(boolean var1) {
      if (this.field3818 > 0) {
         class28 var3 = this.method2241(this.field3818 - 1);
         this.method2260(((Integer)var3.field225).intValue(), var1);
      }

   }

   public void method2206(boolean var1) {
      if (this.field3818 < this.field3817.method1020()) {
         class28 var3 = this.method2241(1 + this.field3818);
         this.method2260(((Integer)var3.field224).intValue(), var1);
      }

   }

   public void method2250(boolean var1) {
      if (this.field3818 > 0) {
         this.method2260(this.field3817.method1031(this.field3818, -1), var1);
      }

   }

   public void method2230(boolean var1) {
      if (this.field3818 < this.field3817.method1020()) {
         this.method2260(this.field3817.method1031(this.field3818, 1), var1);
      }

   }

   public void method2215(boolean var1) {
      if (this.field3818 > 0) {
         int var3 = this.method2242();
         this.method2260(this.field3817.method1031(this.field3818, -var3), var1);
      }

   }

   public void method2216(boolean var1) {
      if (this.field3818 < this.field3817.method1020()) {
         int var3 = this.method2242();
         this.method2260(this.field3817.method1031(this.field3818, var3), var1);
      }

   }

   public void method2217(boolean var1) {
      class424 var3 = this.field3817.method1041(0, this.field3818);
      class28 var4 = var3.method2033();
      this.method2260(this.field3817.method1030(((Integer)var4.field225).intValue(), this.field3811), var1);
   }

   public void method2218(boolean var1) {
      class424 var3 = this.field3817.method1041(0, this.field3818);
      class28 var4 = var3.method2033();
      this.method2260(this.field3817.method1030(((Integer)var4.field225).intValue(), this.field3828 + this.field3811), var1);
   }

   public void method2219(int var1, int var2, boolean var3, boolean var4) {
      boolean var6 = false;
      int var9;
      if (!this.field3820) {
         var9 = 0;
      } else {
         var1 += this.field3814;
         var2 += this.field3811;
         var9 = this.field3817.method1030(var1, var2);
      }

      class28 var7;
      if (var3 && var4) {
         this.field3822 = 1;
         var7 = this.method2241(var9);
         class28 var8 = this.method2241(this.field3826);
         this.method2256(var8, var7);
      } else if (var3) {
         this.field3822 = 1;
         var7 = this.method2241(var9);
         this.method2207(((Integer)var7.field225).intValue(), ((Integer)var7.field224).intValue());
         this.field3826 = ((Integer)var7.field225).intValue();
      } else if (var4) {
         this.method2207(this.field3826, var9);
      } else {
         if (this.field3827 > 0 && var9 == this.field3826) {
            if (this.field3825 == this.field3818) {
               this.field3822 = 1;
               var7 = this.method2241(var9);
               this.method2207(((Integer)var7.field225).intValue(), ((Integer)var7.field224).intValue());
            } else {
               this.field3822 = 2;
               var7 = this.method2253(var9);
               this.method2207(((Integer)var7.field225).intValue(), ((Integer)var7.field224).intValue());
            }
         } else {
            this.field3822 = 0;
            this.method2207(var9, var9);
            this.field3826 = var9;
         }

         this.field3827 = 25;
      }

   }

   public void method2258(int var1, int var2) {
      if (this.field3820 && this.method2245()) {
         var1 += this.field3814;
         var2 += this.field3811;
         int var4 = this.field3817.method1030(var1, var2);
         class28 var5;
         class28 var6;
         switch(this.field3822) {
         case 0:
            this.method2207(this.field3825, var4);
            break;
         case 1:
            var5 = this.method2241(this.field3826);
            var6 = this.method2241(var4);
            this.method2256(var5, var6);
            break;
         case 2:
            var5 = this.method2253(this.field3826);
            var6 = this.method2253(var4);
            this.method2256(var5, var6);
         }
      }

   }

   public void method2252(Clipboard var1) {
      class424 var3 = this.field3817.method1041(this.field3825, this.field3818);
      if (!var3.method2031()) {
         String var4 = var3.method2037();
         if (!var4.isEmpty()) {
            var1.setContents(new StringSelection(var4), (ClipboardOwner)null);
         }
      }

   }

   public void method2221(Clipboard var1) {
      if (this.method2239()) {
         this.method2252(var1);
         this.method2205();
      }

   }

   public void method2222(Clipboard var1) {
      Transferable var3 = var1.getContents((Object)null);
      if (null != var3 && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         try {
            String var4 = this.method2240((String)var3.getTransferData(DataFlavor.stringFlavor));
            this.method2205();
            class114 var5 = this.field3817.method1025(var4, this.field3818, this.field3813, this.field3824);
            this.method2207(var5.method595(), var5.method595());
            this.method2220();
            this.method2244();
         } catch (Exception var6) {
            System.out.println("Error pasting clipboard to InputField.");
         }
      }

   }

   public void method2223() {
      this.field3811 = Math.max(0, this.field3811 - this.field3817.method1047());
   }

   public void method2246() {
      int var2 = Math.max(0, this.field3817.method1049() - this.field3828);
      this.field3811 = Math.min(var2, this.field3811 + this.field3817.method1047());
   }

   public void method2224(class290 var1) {
      this.field3831 = var1;
   }

   public void method2225(class290 var1) {
      this.field3832 = var1;
   }

   public class202 method2247() {
      return this.field3817;
   }

   public class202 method2198() {
      return this.field3812;
   }

   public class424 method2227() {
      return this.field3817.method1041(this.field3825, this.field3818);
   }

   public boolean method2245() {
      return this.field3819;
   }

   public boolean method2184() {
      return this.field3816;
   }

   public boolean method2228() {
      return this.method2245() && this.field3830 % 60 < 30;
   }

   public int method2229() {
      return this.field3818;
   }

   public int method2214() {
      return this.field3825;
   }

   public boolean method2257() {
      return this.field3820;
   }

   public int method2231() {
      return this.field3814;
   }

   public int method2232() {
      return this.field3811;
   }

   public int method2233() {
      return this.field3817.method1034();
   }

   public int method2234() {
      return this.field3824;
   }

   public int method2259() {
      return this.field3815;
   }

   public int method2236() {
      return this.field3821;
   }

   public int method2255() {
      return this.field3817.method1035();
   }

   public int method2237() {
      return this.field3823;
   }

   public int method2249() {
      return this.field3817.method1043();
   }

   public boolean method2238() {
      return this.field3824 > 1;
   }

   boolean method2239() {
      return this.field3818 != this.field3825;
   }

   String method2240(String var1) {
      StringBuilder var3 = new StringBuilder(var1.length());

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         char var5 = var1.charAt(var4);
         if (this.method2226(var5)) {
            var3.append(var5);
         }
      }

      return var3.toString();
   }

   void method2256(class28 var1, class28 var2) {
      if (((Integer)var2.field225).intValue() < ((Integer)var1.field225).intValue()) {
         this.method2207(((Integer)var1.field224).intValue(), ((Integer)var2.field225).intValue());
      } else {
         this.method2207(((Integer)var1.field225).intValue(), ((Integer)var2.field224).intValue());
      }

   }

   class28 method2241(int var1) {
      int var3 = this.field3817.method1020();
      int var4 = 0;
      int var5 = var3;

      int var6;
      for(var6 = var1; var6 > 0; --var6) {
         if (this.method2251(this.field3817.method1017(var6 - 1).field2982)) {
            var4 = var6;
            break;
         }
      }

      for(var6 = var1; var6 < var3; ++var6) {
         if (this.method2251(this.field3817.method1017(var6).field2982)) {
            var5 = var6;
            break;
         }
      }

      return new class28(var4, var5);
   }

   class28 method2253(int var1) {
      int var3 = this.field3817.method1020();
      int var4 = 0;
      int var5 = var3;

      int var6;
      for(var6 = var1; var6 > 0; --var6) {
         if (this.field3817.method1017(var6 - 1).field2982 == '\n') {
            var4 = var6;
            break;
         }
      }

      for(var6 = var1; var6 < var3; ++var6) {
         if (this.field3817.method1017(var6).field2982 == '\n') {
            var5 = var6;
            break;
         }
      }

      return new class28(var4, var5);
   }

   boolean method2220() {
      if (!this.method2257()) {
         return false;
      } else {
         boolean var2 = false;
         if (this.field3817.method1020() > this.field3815) {
            this.field3817.method1023(this.field3815, this.field3817.method1020());
            var2 = true;
         }

         int var3;
         if (this.field3817.method1048() > this.field3824) {
            var3 = this.field3817.method1031(0, this.field3824) - 1;
            this.field3817.method1023(var3, this.field3817.method1020());
            var2 = true;
         }

         if (var2) {
            var3 = this.field3818;
            int var4 = this.field3825;
            int var5 = this.field3817.method1020();
            if (this.field3818 > var5) {
               var3 = var5;
            }

            if (this.field3825 > var5) {
               var4 = var5;
            }

            this.method2207(var4, var3);
         }

         return var2;
      }
   }

   void method2260(int var1, boolean var2) {
      if (var2) {
         this.method2207(this.field3825, var1);
      } else {
         this.method2207(var1, var1);
      }

   }

   int method2242() {
      return this.field3828 / this.field3817.method1047();
   }

   void method2243() {
      class424 var2 = this.field3817.method1041(0, this.field3818);
      class28 var3 = var2.method2033();
      int var4 = this.field3817.method1047();
      int var5 = ((Integer)var3.field225).intValue() - 10;
      int var6 = var5 + 20;
      int var7 = ((Integer)var3.field224).intValue() - 3;
      int var8 = var7 + 6 + var4;
      int var9 = this.field3814;
      int var10 = var9 + this.field3829;
      int var11 = this.field3811;
      int var12 = this.field3828 + var11;
      int var13 = this.field3814;
      int var14 = this.field3811;
      if (var5 < var9) {
         var13 = var5;
      } else if (var6 > var10) {
         var13 = var6 - this.field3829;
      }

      if (var7 < var11) {
         var14 = var7;
      } else if (var8 > var12) {
         var14 = var8 - this.field3828;
      }

      this.method2194(var13, var14);
   }

   boolean method2251(int var1) {
      return var1 == 32 || var1 == 10 || var1 == 9;
   }

   void method2244() {
      if (this.field3831 != null) {
         this.field3831.method1367();
      }

   }

   boolean method2226(int var1) {
      switch(this.field3823) {
      case 1:
         return class173.method927((char)var1);
      case 2:
         return class245.method1222((char)var1);
      case 3:
         return class2.method9((char)var1);
      case 4:
         char var3 = (char)var1;
         if (class2.method9(var3)) {
            return true;
         } else {
            if (var3 != 'k' && var3 != 'K' && var3 != 'm' && var3 != 'M' && var3 != 'b' && var3 != 'B') {
               return false;
            }

            return true;
         }
      default:
         return true;
      }
   }
}
