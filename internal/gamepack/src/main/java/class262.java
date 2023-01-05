import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class class262 {
   boolean field2121 = true;
   boolean field2124 = false;
   boolean field2125 = false;
   class321 field2117 = new class321();
   class321 field2122 = new class321();
   class366 field2136;
   class366 field2137;
   int field2116 = 0;
   int field2118 = Integer.MAX_VALUE;
   int field2119 = 0;
   int field2120 = Integer.MAX_VALUE;
   int field2123 = 0;
   int field2126 = 0;
   int field2127 = 0;
   int field2128 = 0;
   int field2129 = Integer.MAX_VALUE;
   int field2130 = 0;
   int field2131 = 0;
   int field2132 = 0;
   int field2133 = 0;
   int field2134 = 0;
   int field2135 = 0;

   class262() {
      this.field2122.method1646(1);
      this.field2117.method1646(1);
   }

   void method1117() {
      this.field2135 = (this.field2135 + 1) % 60;
      if (this.field2132 > 0) {
         --this.field2132;
      }

   }

   public boolean method1118(boolean var1) {
      var1 = var1 && this.field2121;
      boolean var3 = var1 != this.field2124;
      this.field2124 = var1;
      if (!this.field2124) {
         this.method1139(this.field2123, this.field2123);
      }

      return var3;
   }

   public void method1119(boolean var1) {
      this.field2121 = var1;
      this.field2124 = var1 && this.field2124;
   }

   boolean method1120(String var1) {
      String var3 = this.field2122.method1640();
      if (!var3.equals(var1)) {
         var1 = this.method1172(var1);
         this.field2122.method1627(var1);
         this.method1126(this.field2119, this.field2116);
         this.method1152();
         this.method1176();
         return true;
      } else {
         return false;
      }
   }

   boolean method1194(String var1) {
      this.field2117.method1627(var1);
      return true;
   }

   boolean method1121(class420 var1) {
      boolean var3 = !this.field2125;
      this.field2122.method1644(var1);
      this.field2117.method1644(var1);
      this.field2125 = true;
      var3 |= this.method1126(this.field2119, this.field2116);
      var3 |= this.method1139(this.field2130, this.field2123);
      if (this.method1152()) {
         this.method1176();
         var3 = true;
      }

      return var3;
   }

   public boolean method1122(int var1, int var2) {
      boolean var4 = var1 != this.field2134 || this.field2133 != var2;
      this.field2134 = var1;
      this.field2133 = var2;
      var4 |= this.method1126(this.field2119, this.field2116);
      return var4;
   }

   public boolean method1123(int var1) {
      if (var1 < 0) {
         var1 = Integer.MAX_VALUE;
      }

      boolean var3 = var1 == this.field2122.method1634();
      this.field2122.method1621(var1, true);
      this.field2117.method1621(var1, true);
      if (this.method1152()) {
         this.method1176();
         var3 = true;
      }

      return var3;
   }

   public boolean method1124(int var1) {
      if (var1 < 0) {
         this.field2129 = Integer.MAX_VALUE;
      } else {
         this.field2129 = var1;
      }

      if (this.method1152()) {
         this.method1176();
         return true;
      } else {
         return false;
      }
   }

   public boolean method1125(int var1, byte var2) {
      this.field2120 = var1;
      if (this.method1152()) {
         if (var2 == -1) {
            throw new IllegalStateException();
         } else {
            this.method1176();
            return true;
         }
      } else {
         return false;
      }
   }

   public boolean method1126(int var1, int var2) {
      if (!this.method1189()) {
         this.field2119 = var1;
         this.field2116 = var2;
         return false;
      } else {
         int var4 = this.field2119;
         int var5 = this.field2116;
         int var6 = Math.max(0, this.field2122.method1632() - this.field2134 + 2);
         int var7 = Math.max(0, this.field2122.method1649() - this.field2133 + 1);
         this.field2119 = Math.max(0, Math.min(var6, var1));
         this.field2116 = Math.max(0, Math.min(var7, var2));
         return this.field2119 != var4 || this.field2116 != var5;
      }
   }

   public boolean method1127(int var1, int var2) {
      return true;
   }

   public void method1128(int var1) {
      this.field2122.method1645(var1);
   }

   public void method1129(int var1) {
      this.field2126 = var1;
   }

   public void method1180(int var1) {
      this.field2122.method1646(var1);
   }

   public void method1167(int var1) {
      this.field2122.method1622(var1);
   }

   public boolean method1186(int var1) {
      this.field2128 = var1;
      String var3 = this.field2122.method1640();
      int var4 = var3.length();
      var3 = this.method1172(var3);
      if (var3.length() != var4) {
         this.field2122.method1627(var3);
         this.method1126(this.field2119, this.field2116);
         this.method1152();
         this.method1176();
         return true;
      } else {
         return false;
      }
   }

   public void method1131() {
      this.field2125 = false;
   }

   public boolean method1132(int var1) {
      if (this.method1158(var1)) {
         this.method1137();
         class77 var3 = this.field2122.method1624((char)var1, this.field2123, this.field2118, this.field2129);
         this.method1139(var3.method328(), var3.method328());
         this.method1152();
         this.method1176();
      }

      return true;
   }

   public void method1133() {
      if (!this.method1137() && this.field2123 > 0) {
         int var2 = this.field2122.method1629(this.field2123 - 1);
         this.method1176();
         this.method1139(var2, var2);
      }

   }

   public void method1134() {
      if (!this.method1137() && this.field2123 < this.field2122.method1620()) {
         int var2 = this.field2122.method1629(this.field2123);
         this.method1176();
         this.method1139(var2, var2);
      }

   }

   public void method1135() {
      if (!this.method1137() && this.field2123 > 0) {
         class296 var2 = this.method1173(this.field2123 - 1);
         int var3 = this.field2122.method1623(((Integer)var2.field2392).intValue(), this.field2123);
         this.method1176();
         this.method1139(var3, var3);
      }

   }

   public void method1136() {
      if (!this.method1137() && this.field2123 < this.field2122.method1620()) {
         class296 var2 = this.method1173(this.field2123);
         int var3 = this.field2122.method1623(this.field2123, ((Integer)var2.field2391).intValue());
         this.method1176();
         this.method1139(var3, var3);
      }

   }

   boolean method1137() {
      if (!this.method1171()) {
         return false;
      } else {
         int var2 = this.field2122.method1623(this.field2130, this.field2123);
         this.method1176();
         this.method1139(var2, var2);
         return true;
      }
   }

   public void method1193() {
      this.method1139(0, this.field2122.method1620());
   }

   public boolean method1139(int var1, int var2) {
      if (!this.method1189()) {
         this.field2130 = var1;
         this.field2123 = var2;
         return false;
      } else {
         if (var1 > this.field2122.method1620()) {
            var1 = this.field2122.method1620();
         }

         if (var2 > this.field2122.method1620()) {
            var2 = this.field2122.method1620();
         }

         boolean var4 = this.field2130 != var1 || this.field2123 != var2;
         this.field2130 = var1;
         if (var2 != this.field2123) {
            this.field2123 = var2;
            this.field2135 = 0;
            this.method1175();
         }

         if (var4 && this.field2137 != null) {
            this.field2137.method1811();
         }

         return var4;
      }
   }

   public void method1195(boolean var1) {
      class296 var3 = this.method1185(this.field2123);
      this.method1192(((Integer)var3.field2392).intValue(), var1);
   }

   public void method1140(boolean var1) {
      class296 var3 = this.method1185(this.field2123);
      this.method1192(((Integer)var3.field2391).intValue(), var1);
   }

   public void method1141(boolean var1) {
      this.method1192(0, var1);
   }

   public void method1142(boolean var1) {
      this.method1192(this.field2122.method1620(), var1);
   }

   public void method1143(boolean var1) {
      if (this.method1171() && !var1) {
         this.method1192(Math.min(this.field2130, this.field2123), var1);
      } else if (this.field2123 > 0) {
         this.method1192(this.field2123 - 1, var1);
      }

   }

   public void method1144(boolean var1) {
      if (this.method1171() && !var1) {
         this.method1192(Math.max(this.field2130, this.field2123), var1);
      } else if (this.field2123 < this.field2122.method1620()) {
         this.method1192(this.field2123 + 1, var1);
      }

   }

   public void method1145(boolean var1) {
      if (this.field2123 > 0) {
         class296 var3 = this.method1173(this.field2123 - 1);
         this.method1192(((Integer)var3.field2392).intValue(), var1);
      }

   }

   public void method1138(boolean var1) {
      if (this.field2123 < this.field2122.method1620()) {
         class296 var3 = this.method1173(1 + this.field2123);
         this.method1192(((Integer)var3.field2391).intValue(), var1);
      }

   }

   public void method1182(boolean var1) {
      if (this.field2123 > 0) {
         this.method1192(this.field2122.method1631(this.field2123, -1), var1);
      }

   }

   public void method1162(boolean var1) {
      if (this.field2123 < this.field2122.method1620()) {
         this.method1192(this.field2122.method1631(this.field2123, 1), var1);
      }

   }

   public void method1147(boolean var1) {
      if (this.field2123 > 0) {
         int var3 = this.method1174();
         this.method1192(this.field2122.method1631(this.field2123, -var3), var1);
      }

   }

   public void method1148(boolean var1) {
      if (this.field2123 < this.field2122.method1620()) {
         int var3 = this.method1174();
         this.method1192(this.field2122.method1631(this.field2123, var3), var1);
      }

   }

   public void method1149(boolean var1) {
      class239 var3 = this.field2122.method1641(0, this.field2123);
      class296 var4 = var3.method1037();
      this.method1192(this.field2122.method1630(((Integer)var4.field2392).intValue(), this.field2116), var1);
   }

   public void method1150(boolean var1) {
      class239 var3 = this.field2122.method1641(0, this.field2123);
      class296 var4 = var3.method1037();
      this.method1192(this.field2122.method1630(((Integer)var4.field2392).intValue(), this.field2133 + this.field2116), var1);
   }

   public void method1151(int var1, int var2, boolean var3, boolean var4) {
      boolean var6 = false;
      int var9;
      if (!this.field2125) {
         var9 = 0;
      } else {
         var1 += this.field2119;
         var2 += this.field2116;
         var9 = this.field2122.method1630(var1, var2);
      }

      class296 var7;
      if (var3 && var4) {
         this.field2127 = 1;
         var7 = this.method1173(var9);
         class296 var8 = this.method1173(this.field2131);
         this.method1188(var8, var7);
      } else if (var3) {
         this.field2127 = 1;
         var7 = this.method1173(var9);
         this.method1139(((Integer)var7.field2392).intValue(), ((Integer)var7.field2391).intValue());
         this.field2131 = ((Integer)var7.field2392).intValue();
      } else if (var4) {
         this.method1139(this.field2131, var9);
      } else {
         if (this.field2132 > 0 && var9 == this.field2131) {
            if (this.field2130 == this.field2123) {
               this.field2127 = 1;
               var7 = this.method1173(var9);
               this.method1139(((Integer)var7.field2392).intValue(), ((Integer)var7.field2391).intValue());
            } else {
               this.field2127 = 2;
               var7 = this.method1185(var9);
               this.method1139(((Integer)var7.field2392).intValue(), ((Integer)var7.field2391).intValue());
            }
         } else {
            this.field2127 = 0;
            this.method1139(var9, var9);
            this.field2131 = var9;
         }

         this.field2132 = 25;
      }

   }

   public void method1190(int var1, int var2) {
      if (this.field2125 && this.method1177()) {
         var1 += this.field2119;
         var2 += this.field2116;
         int var4 = this.field2122.method1630(var1, var2);
         class296 var5;
         class296 var6;
         switch(this.field2127) {
         case 0:
            this.method1139(this.field2130, var4);
            break;
         case 1:
            var5 = this.method1173(this.field2131);
            var6 = this.method1173(var4);
            this.method1188(var5, var6);
            break;
         case 2:
            var5 = this.method1185(this.field2131);
            var6 = this.method1185(var4);
            this.method1188(var5, var6);
         }
      }

   }

   public void method1184(Clipboard var1) {
      class239 var3 = this.field2122.method1641(this.field2130, this.field2123);
      if (!var3.method1035()) {
         String var4 = var3.method1041();
         if (!var4.isEmpty()) {
            var1.setContents(new StringSelection(var4), (ClipboardOwner)null);
         }
      }

   }

   public void method1153(Clipboard var1) {
      if (this.method1171()) {
         this.method1184(var1);
         this.method1137();
      }

   }

   public void method1154(Clipboard var1) {
      Transferable var3 = var1.getContents((Object)null);
      if (null != var3 && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         try {
            String var4 = this.method1172((String)var3.getTransferData(DataFlavor.stringFlavor));
            this.method1137();
            class77 var5 = this.field2122.method1625(var4, this.field2123, this.field2118, this.field2129);
            this.method1139(var5.method328(), var5.method328());
            this.method1152();
            this.method1176();
         } catch (Exception var6) {
            System.out.println("Error pasting clipboard to InputField.");
         }
      }

   }

   public void method1155() {
      this.field2116 = Math.max(0, this.field2116 - this.field2122.method1647());
   }

   public void method1178() {
      int var2 = Math.max(0, this.field2122.method1649() - this.field2133);
      this.field2116 = Math.min(var2, this.field2116 + this.field2122.method1647());
   }

   public void method1156(class366 var1) {
      this.field2136 = var1;
   }

   public void method1157(class366 var1) {
      this.field2137 = var1;
   }

   public class321 method1179() {
      return this.field2122;
   }

   public class321 method1130() {
      return this.field2117;
   }

   public class239 method1159() {
      return this.field2122.method1641(this.field2130, this.field2123);
   }

   public boolean method1177() {
      return this.field2124;
   }

   public boolean method1116() {
      return this.field2121;
   }

   public boolean method1160() {
      return this.method1177() && this.field2135 % 60 < 30;
   }

   public int method1161() {
      return this.field2123;
   }

   public int method1146() {
      return this.field2130;
   }

   public boolean method1189() {
      return this.field2125;
   }

   public int method1163() {
      return this.field2119;
   }

   public int method1164() {
      return this.field2116;
   }

   public int method1165() {
      return this.field2122.method1634();
   }

   public int method1166() {
      return this.field2129;
   }

   public int method1191() {
      return this.field2120;
   }

   public int method1168() {
      return this.field2126;
   }

   public int method1187() {
      return this.field2122.method1635();
   }

   public int method1169() {
      return this.field2128;
   }

   public int method1181() {
      return this.field2122.method1643();
   }

   public boolean method1170() {
      return this.field2129 > 1;
   }

   boolean method1171() {
      return this.field2123 != this.field2130;
   }

   String method1172(String var1) {
      StringBuilder var3 = new StringBuilder(var1.length());

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         char var5 = var1.charAt(var4);
         if (this.method1158(var5)) {
            var3.append(var5);
         }
      }

      return var3.toString();
   }

   void method1188(class296 var1, class296 var2) {
      if (((Integer)var2.field2392).intValue() < ((Integer)var1.field2392).intValue()) {
         this.method1139(((Integer)var1.field2391).intValue(), ((Integer)var2.field2392).intValue());
      } else {
         this.method1139(((Integer)var1.field2392).intValue(), ((Integer)var2.field2391).intValue());
      }

   }

   class296 method1173(int var1) {
      int var3 = this.field2122.method1620();
      int var4 = 0;
      int var5 = var3;

      int var6;
      for(var6 = var1; var6 > 0; --var6) {
         if (this.method1183(this.field2122.method1617(var6 - 1).field544)) {
            var4 = var6;
            break;
         }
      }

      for(var6 = var1; var6 < var3; ++var6) {
         if (this.method1183(this.field2122.method1617(var6).field544)) {
            var5 = var6;
            break;
         }
      }

      return new class296(var4, var5);
   }

   class296 method1185(int var1) {
      int var3 = this.field2122.method1620();
      int var4 = 0;
      int var5 = var3;

      int var6;
      for(var6 = var1; var6 > 0; --var6) {
         if (this.field2122.method1617(var6 - 1).field544 == '\n') {
            var4 = var6;
            break;
         }
      }

      for(var6 = var1; var6 < var3; ++var6) {
         if (this.field2122.method1617(var6).field544 == '\n') {
            var5 = var6;
            break;
         }
      }

      return new class296(var4, var5);
   }

   boolean method1152() {
      if (!this.method1189()) {
         return false;
      } else {
         boolean var2 = false;
         if (this.field2122.method1620() > this.field2120) {
            this.field2122.method1623(this.field2120, this.field2122.method1620());
            var2 = true;
         }

         int var3;
         if (this.field2122.method1648() > this.field2129) {
            var3 = this.field2122.method1631(0, this.field2129) - 1;
            this.field2122.method1623(var3, this.field2122.method1620());
            var2 = true;
         }

         if (var2) {
            var3 = this.field2123;
            int var4 = this.field2130;
            int var5 = this.field2122.method1620();
            if (this.field2123 > var5) {
               var3 = var5;
            }

            if (this.field2130 > var5) {
               var4 = var5;
            }

            this.method1139(var4, var3);
         }

         return var2;
      }
   }

   void method1192(int var1, boolean var2) {
      if (var2) {
         this.method1139(this.field2130, var1);
      } else {
         this.method1139(var1, var1);
      }

   }

   int method1174() {
      return this.field2133 / this.field2122.method1647();
   }

   void method1175() {
      class239 var2 = this.field2122.method1641(0, this.field2123);
      class296 var3 = var2.method1037();
      int var4 = this.field2122.method1647();
      int var5 = ((Integer)var3.field2392).intValue() - 10;
      int var6 = var5 + 20;
      int var7 = ((Integer)var3.field2391).intValue() - 3;
      int var8 = var7 + 6 + var4;
      int var9 = this.field2119;
      int var10 = var9 + this.field2134;
      int var11 = this.field2116;
      int var12 = this.field2133 + var11;
      int var13 = this.field2119;
      int var14 = this.field2116;
      if (var5 < var9) {
         var13 = var5;
      } else if (var6 > var10) {
         var13 = var6 - this.field2134;
      }

      if (var7 < var11) {
         var14 = var7;
      } else if (var8 > var12) {
         var14 = var8 - this.field2133;
      }

      this.method1126(var13, var14);
   }

   boolean method1183(int var1) {
      return var1 == 32 || var1 == 10 || var1 == 9;
   }

   void method1176() {
      if (this.field2136 != null) {
         this.field2136.method1811();
      }

   }

   boolean method1158(int var1) {
      switch(this.field2128) {
      case 1:
         return class87.method374((char)var1);
      case 2:
         return class105.method418((char)var1);
      case 3:
         return class221.method980((char)var1);
      case 4:
         char var3 = (char)var1;
         if (class221.method980(var3)) {
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
