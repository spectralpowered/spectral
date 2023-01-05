import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

public abstract class class141 extends Applet implements Runnable, FocusListener, WindowListener {
   protected static int field1517 = 0;
   public static class92 field1542;
   static boolean field1514 = false;
   static class117 field1529 = new class117();
   static class141 field1513 = null;
   static int field1512 = 0;
   static int field1515 = 20;
   static int field1516 = 1;
   static int field1531 = 500;
   static long field1521 = 0L;
   static long field1539 = -1L;
   static long field1541 = -1L;
   static long[] field1523 = new long[32];
   static long[] field1525 = new long[32];
   static volatile boolean field1538 = true;
   boolean field1532 = false;
   boolean field1540 = false;
   class478 field1535;
   int field1511;
   int field1522 = 0;
   int field1524;
   int field1526;
   int field1527;
   int field1543 = 0;
   Canvas field1536;
   Frame field1528;
   Clipboard field1518;
   final EventQueue field1537;
   protected int field1519;
   protected int field1520;
   volatile boolean field1530 = true;
   volatile boolean field1533 = false;
   volatile long field1534 = 0L;

   protected class141() {
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
         ;
      }

      this.field1537 = var1;
      class412 var2 = new class412();
      class449.field3692 = var2;
   }

   protected abstract void method756();

   protected abstract void method757(boolean var1);

   protected abstract void method761();

   protected abstract void method765();

   protected abstract void method766();

   protected abstract void method770();

   public abstract void init();

   protected final void method737(int var1, int var2) {
      if (this.field1526 != var1 || var2 != this.field1527) {
         this.method753();
      }

      this.field1526 = var1;
      this.field1527 = var2;
   }

   final void method738(Object var1) {
      if (null != this.field1537) {
         for(int var3 = 0; var3 < 50 && this.field1537.peekEvent() != null; ++var3) {
            class324.method1571(1L);
         }

         if (null != var1) {
            this.field1537.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   protected class338 method739() {
      if (this.field1535 == null) {
         this.field1535 = new class478();
         this.field1535.method2310(this.field1536);
      }

      return this.field1535;
   }

   protected void method740() {
      this.field1518 = this.getToolkit().getSystemClipboard();
   }

   protected void method741(String var1) {
      this.field1518.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   public Clipboard method742() {
      return this.field1518;
   }

   protected final void method743() {
      if (class20.field149.toLowerCase().indexOf("microsoft") != -1) {
         class377.field3310[186] = 57;
         class377.field3310[187] = 27;
         class377.field3310[188] = 71;
         class377.field3310[189] = 26;
         class377.field3310[190] = 72;
         class377.field3310[191] = 73;
         class377.field3310[192] = 58;
         class377.field3310[219] = 42;
         class377.field3310[220] = 74;
         class377.field3310[221] = 43;
         class377.field3310[222] = 59;
         class377.field3310[223] = 28;
      } else {
         class377.field3310[44] = 71;
         class377.field3310[45] = 26;
         class377.field3310[46] = 72;
         class377.field3310[47] = 73;
         class377.field3310[59] = 57;
         class377.field3310[61] = 27;
         class377.field3310[91] = 42;
         class377.field3310[92] = 74;
         class377.field3310[93] = 43;
         class377.field3310[192] = 28;
         class377.field3310[222] = 58;
         class377.field3310[520] = 59;
      }

      field1529.method605(this.field1536);
   }

   protected final void method744() {
      field1529.method607();
   }

   protected void method745(class271 var1, int var2) {
      field1529.method603(var1, var2);
   }

   protected final void method762() {
      Canvas var2 = this.field1536;
      var2.addMouseListener(class182.field1951);
      var2.addMouseMotionListener(class182.field1951);
      var2.addFocusListener(class182.field1951);
   }

   final void method767() {
      Container var2 = this.method768();
      if (var2 != null) {
         class349 var3 = this.method771();
         this.field1520 = Math.max(var3.field3178, this.field1524);
         this.field1519 = Math.max(var3.field3175, this.field1511);
         if (this.field1520 <= 0) {
            this.field1520 = 1;
         }

         if (this.field1519 <= 0) {
            this.field1519 = 1;
         }

         class391.field3440 = Math.min(this.field1520, this.field1526);
         class22.field161 = Math.min(this.field1519, this.field1527);
         this.field1522 = (this.field1520 - class391.field3440) / 2;
         this.field1543 = 0;
         this.field1536.setSize(class391.field3440, class22.field161);
         class204.field2184 = new class401(class391.field3440, class22.field161, this.field1536);
         if (this.field1528 == var2) {
            Insets var4 = this.field1528.getInsets();
            this.field1536.setLocation(var4.left + this.field1522, this.field1543 + var4.top);
         } else {
            this.field1536.setLocation(this.field1522, this.field1543);
         }

         this.field1530 = true;
         this.method765();
      }
   }

   void method746() {
      int var2 = this.field1522;
      int var3 = this.field1543;
      int var4 = this.field1520 - class391.field3440 - var2;
      int var5 = this.field1519 - class22.field161 - var3;
      if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
         try {
            Container var6 = this.method768();
            int var7 = 0;
            int var8 = 0;
            if (var6 == this.field1528) {
               Insets var9 = this.field1528.getInsets();
               var7 = var9.left;
               var8 = var9.top;
            }

            Graphics var11 = var6.getGraphics();
            var11.setColor(Color.black);
            if (var2 > 0) {
               var11.fillRect(var7, var8, var2, this.field1519);
            }

            if (var3 > 0) {
               var11.fillRect(var7, var8, this.field1520, var3);
            }

            if (var4 > 0) {
               var11.fillRect(this.field1520 + var7 - var4, var8, var4, this.field1519);
            }

            if (var5 > 0) {
               var11.fillRect(var7, this.field1519 + var8 - var5, this.field1520, var5);
            }
         } catch (Exception var10) {
            ;
         }
      }

   }

   final void method747() {
      field1529.method602(this.field1536);
      class34.method168(this.field1536);
      if (null != this.field1535) {
         this.field1535.method2311(this.field1536);
      }

      this.method749();
      field1529.method605(this.field1536);
      Canvas var2 = this.field1536;
      var2.addMouseListener(class182.field1951);
      var2.addMouseMotionListener(class182.field1951);
      var2.addFocusListener(class182.field1951);
      if (null != this.field1535) {
         this.field1535.method2310(this.field1536);
      }

      this.method753();
   }

   protected final void method748(int var1, int var2, int var3, int var4) {
      try {
         if (field1513 != null) {
            ++field1512;
            if (field1512 >= 3) {
               this.method774("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         field1513 = this;
         class391.field3440 = var1;
         class22.field161 = var2;
         class139.field1503 = var3;
         class139.field1502 = var4;
         class477.field3970 = this;
         if (class358.field3203 == null) {
            class358.field3203 = new class20();
         }

         class358.field3203.method110(this, 1);
      } catch (Exception var7) {
         class23.method122((String)null, var7);
         this.method774("crash");
      }

   }

   final synchronized void method749() {
      Container var2 = this.method768();
      if (this.field1536 != null) {
         this.field1536.removeFocusListener(this);
         var2.remove(this.field1536);
      }

      class391.field3440 = Math.max(var2.getWidth(), this.field1524);
      class22.field161 = Math.max(var2.getHeight(), this.field1511);
      Insets var3;
      if (null != this.field1528) {
         var3 = this.field1528.getInsets();
         class391.field3440 -= var3.right + var3.left;
         class22.field161 -= var3.bottom + var3.top;
      }

      this.field1536 = new class431(this);
      var2.setBackground(Color.BLACK);
      var2.setLayout((LayoutManager)null);
      var2.add(this.field1536);
      this.field1536.setSize(class391.field3440, class22.field161);
      this.field1536.setVisible(true);
      this.field1536.setBackground(Color.BLACK);
      if (this.field1528 == var2) {
         var3 = this.field1528.getInsets();
         this.field1536.setLocation(this.field1522 + var3.left, var3.top + this.field1543);
      } else {
         this.field1536.setLocation(this.field1522, this.field1543);
      }

      this.field1536.addFocusListener(this);
      this.field1536.requestFocus();
      this.field1530 = true;
      if (null != class204.field2184 && class204.field2184.field2193 == class391.field3440 && class22.field161 == class204.field2184.field2194) {
         ((class401)class204.field2184).method1960(this.field1536);
         class204.field2184.method1056(0, 0);
      } else {
         class204.field2184 = new class401(class391.field3440, class22.field161, this.field1536);
      }

      this.field1533 = false;
      this.field1534 = class154.method814();
   }

   protected final boolean method750() {
      String var2 = this.getDocumentBase().getHost().toLowerCase();
      if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
         if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
            if (var2.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                  var2 = var2.substring(0, var2.length() - 1);
               }

               if (var2.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.method774("invalidhost");
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public void run() {
      try {
         if (class20.field149 != null) {
            String var1 = class20.field149.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = class20.field147;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method774("wrongjava");
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && class2.method9(var2.charAt(var3)); ++var3) {
                     ;
                  }

                  String var4 = var2.substring(6, var3);
                  if (class427.method2039(var4) && class244.method1221(var4) < 10) {
                     this.method774("wrongjava");
                     return;
                  }
               }

               field1516 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.method749();
         this.method766();

         Object var7;
         try {
            var7 = new class3();
         } catch (Throwable var5) {
            var7 = new class333();
         }

         class432.field3608 = (class172)var7;

         while(0L == field1521 || class154.method814() < field1521) {
            class300.field2884 = class432.field3608.method911(field1515, field1516);

            for(int var8 = 0; var8 < class300.field2884; ++var8) {
               this.method769();
            }

            this.method751();
            this.method738(this.field1536);
         }
      } catch (Exception var6) {
         class23.method122((String)null, var6);
         this.method774("crash");
      }

      this.method754();
   }

   void method769() {
      long var2 = class154.method814();
      long var4 = field1523[class123.field1452];
      field1523[class123.field1452] = var2;
      class123.field1452 = 1 + class123.field1452 & 31;
      if (0L != var4 && var2 > var4) {
         ;
      }

      synchronized(this) {
         class421.field3573 = field1538;
      }

      this.method756();
   }

   void method751() {
      Container var2 = this.method768();
      long var3 = class154.method814();
      long var5 = field1525[class206.field2195];
      field1525[class206.field2195] = var3;
      class206.field2195 = class206.field2195 + 1 & 31;
      if (0L != var5 && var3 > var5) {
         int var7 = (int)(var3 - var5);
         field1517 = ((var7 >> 1) + 32000) / var7;
      }

      if (++field1531 - 1 > 50) {
         field1531 -= 50;
         this.field1530 = true;
         this.field1536.setSize(class391.field3440, class22.field161);
         this.field1536.setVisible(true);
         if (var2 == this.field1528) {
            Insets var8 = this.field1528.getInsets();
            this.field1536.setLocation(var8.left + this.field1522, this.field1543 + var8.top);
         } else {
            this.field1536.setLocation(this.field1522, this.field1543);
         }
      }

      if (this.field1533) {
         this.method747();
      }

      this.method752();
      this.method757(this.field1530);
      if (this.field1530) {
         this.method746();
      }

      this.field1530 = false;
   }

   final void method752() {
      class349 var2 = this.method771();
      if (this.field1520 != var2.field3178 || this.field1519 != var2.field3175 || this.field1532) {
         this.method767();
         this.field1532 = false;
      }

   }

   final void method753() {
      this.field1532 = true;
   }

   final synchronized void method754() {
      if (!field1514) {
         field1514 = true;

         try {
            this.field1536.removeFocusListener(this);
         } catch (Exception var6) {
            ;
         }

         try {
            this.method770();
         } catch (Exception var5) {
            ;
         }

         if (this.field1528 != null) {
            try {
               System.exit(0);
            } catch (Throwable var4) {
               ;
            }
         }

         if (class358.field3203 != null) {
            try {
               class358.field3203.method108();
            } catch (Exception var3) {
               ;
            }
         }

         this.method761();
      }
   }

   public final void start() {
      if (this == field1513 && !field1514) {
         field1521 = 0L;
      }
   }

   public final void stop() {
      if (this == field1513 && !field1514) {
         field1521 = class154.method814() + 4000L;
      }
   }

   public final void destroy() {
      if (this == field1513 && !field1514) {
         field1521 = class154.method814();
         class324.method1571(5000L);
         this.method754();
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final synchronized void paint(Graphics var1) {
      if (field1513 == this && !field1514) {
         this.field1530 = true;
         if (class154.method814() - this.field1534 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (null == var2 || var2.width >= class391.field3440 && var2.height >= class22.field161) {
               this.field1533 = true;
            }
         }

      }
   }

   public final void focusGained(FocusEvent var1) {
      field1538 = true;
      this.field1530 = true;
   }

   public final void focusLost(FocusEvent var1) {
      field1538 = false;
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }

   protected final void method758(int var1, String var2, boolean var3) {
      try {
         Graphics var5 = this.field1536.getGraphics();
         if (class449.field3691 == null) {
            class449.field3691 = new Font("Helvetica", 1, 13);
            class58.field816 = this.field1536.getFontMetrics(class449.field3691);
         }

         if (var3) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, class391.field3440, class22.field161);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if (class214.field2401 == null) {
               class214.field2401 = this.field1536.createImage(304, 34);
            }

            Graphics var7 = class214.field2401.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 33);
            var7.fillRect(2, 2, var1 * 3, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 301, 31);
            var7.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
            var7.setFont(class449.field3691);
            var7.setColor(Color.white);
            var7.drawString(var2, (304 - class58.field816.stringWidth(var2)) / 2, 22);
            var5.drawImage(class214.field2401, class391.field3440 / 2 - 152, class22.field161 / 2 - 18, (ImageObserver)null);
         } catch (Exception var10) {
            int var8 = class391.field3440 / 2 - 152;
            int var9 = class22.field161 / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 303, 33);
            var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
            var5.setColor(Color.black);
            var5.drawRect(var8 + 1, var9 + 1, 301, 31);
            var5.fillRect(var8 + 2 + var1 * 3, var9 + 2, 300 - var1 * 3, 30);
            var5.setFont(class449.field3691);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (304 - class58.field816.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.field1536.repaint();
      }

   }

   protected final void method759() {
      class214.field2401 = null;
      class449.field3691 = null;
      class58.field816 = null;
   }

   protected void method774(String var1) {
      if (!this.field1540) {
         this.field1540 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var4) {
            ;
         }

      }
   }

   Container method768() {
      return (Container)(null != this.field1528 ? this.field1528 : this);
   }

   class349 method771() {
      Container var2 = this.method768();
      int var3 = Math.max(var2.getWidth(), this.field1524);
      int var4 = Math.max(var2.getHeight(), this.field1511);
      if (null != this.field1528) {
         Insets var5 = this.field1528.getInsets();
         var3 -= var5.right + var5.left;
         var4 -= var5.bottom + var5.top;
      }

      return new class349(var3, var4);
   }

   protected final boolean method760() {
      return null != this.field1528;
   }

   public static long method764(int var0, int var1, int var2, boolean var3, int var4) {
      long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if (var3) {
         var6 |= 65536L;
      }

      return var6;
   }

   static void method772() {
      class81 var1 = class189.method982(class165.field1726, client.field483.field3459);
      var1.field933.method666(class154.method816());
      var1.field933.method655(class391.field3440);
      var1.field933.method655(class22.field161);
      client.field483.method1920(var1);
   }

   static final void method773() {
      class39.method216(false);
      client.field518 = 0;
      boolean var1 = true;

      int var2;
      for(var2 = 0; var2 < class243.field2596.length; ++var2) {
         if (-1 != client.field699[var2] && null == class243.field2596[var2]) {
            class243.field2596[var2] = class42.field375.method892(client.field699[var2], 0);
            if (class243.field2596[var2] == null) {
               var1 = false;
               ++client.field518;
            }
         }

         if (-1 != class270.field2704[var2] && null == class315.field2995[var2]) {
            class315.field2995[var2] = class42.field375.method869(class270.field2704[var2], 0, class297.field2858[var2]);
            if (null == class315.field2995[var2]) {
               var1 = false;
               ++client.field518;
            }
         }
      }

      if (!var1) {
         client.field575 = 1;
      } else {
         client.field703 = 0;
         var1 = true;

         int var4;
         int var5;
         for(var2 = 0; var2 < class243.field2596.length; ++var2) {
            byte[] var3 = class315.field2995[var2];
            if (var3 != null) {
               var4 = (class63.field833[var2] >> 8) * 64 - class381.field3325;
               var5 = 64 * (class63.field833[var2] & 255) - class345.field3166;
               if (client.field494) {
                  var4 = 10;
                  var5 = 10;
               }

               var1 &= class74.method409(var3, var4, var5);
            }
         }

         if (!var1) {
            client.field575 = 2;
         } else {
            if (0 != client.field575) {
               class414.method2003(class96.field1150 + class389.field3433 + class389.field3430 + 100 + "%" + class389.field3434, true);
            }

            client.method281();
            class13.field126.method31();

            for(var2 = 0; var2 < 4; ++var2) {
               client.field493[var2].method1886();
            }

            int var16;
            for(var2 = 0; var2 < 4; ++var2) {
               for(var16 = 0; var16 < 104; ++var16) {
                  for(var4 = 0; var4 < 104; ++var4) {
                     class74.field866[var2][var16][var4] = 0;
                  }
               }
            }

            client.method281();
            class87.method471();
            var2 = class243.field2596.length;
            class163.method864();
            class39.method216(true);
            int var18;
            if (!client.field494) {
               byte[] var6;
               for(var16 = 0; var16 < var2; ++var16) {
                  var4 = 64 * (class63.field833[var16] >> 8) - class381.field3325;
                  var5 = (class63.field833[var16] & 255) * 64 - class345.field3166;
                  var6 = class243.field2596[var16];
                  if (var6 != null) {
                     client.method281();
                     class18.method103(var6, var4, var5, class222.field2433 * 8 - 48, class11.field59 * 8 - 48, client.field493);
                  }
               }

               for(var16 = 0; var16 < var2; ++var16) {
                  var4 = 64 * (class63.field833[var16] >> 8) - class381.field3325;
                  var5 = 64 * (class63.field833[var16] & 255) - class345.field3166;
                  var6 = class243.field2596[var16];
                  if (null == var6 && class11.field59 < 800) {
                     client.method281();
                     class71.method396(var4, var5, 64, 64);
                  }
               }

               class39.method216(true);

               for(var16 = 0; var16 < var2; ++var16) {
                  byte[] var17 = class315.field2995[var16];
                  if (var17 != null) {
                     var5 = 64 * (class63.field833[var16] >> 8) - class381.field3325;
                     var18 = (class63.field833[var16] & 255) * 64 - class345.field3166;
                     client.method281();
                     class105.method563(var17, var5, var18, class13.field126, client.field493);
                  }
               }
            }

            int var7;
            int var8;
            int var9;
            if (client.field494) {
               int var10;
               int var11;
               int var12;
               for(var16 = 0; var16 < 4; ++var16) {
                  client.method281();

                  for(var4 = 0; var4 < 13; ++var4) {
                     for(var5 = 0; var5 < 13; ++var5) {
                        boolean var19 = false;
                        var7 = client.field495[var16][var4][var5];
                        if (var7 != -1) {
                           var8 = var7 >> 24 & 3;
                           var9 = var7 >> 1 & 3;
                           var10 = var7 >> 14 & 1023;
                           var11 = var7 >> 3 & 2047;
                           var12 = (var10 / 8 << 8) + var11 / 8;

                           for(int var13 = 0; var13 < class63.field833.length; ++var13) {
                              if (var12 == class63.field833[var13] && class243.field2596[var13] != null) {
                                 int var14 = 8 * (var10 - var4);
                                 int var15 = 8 * (var11 - var5);
                                 class117.method608(class243.field2596[var13], var16, var4 * 8, var5 * 8, var8, 8 * (var10 & 7), (var11 & 7) * 8, var9, var14, var15, client.field493);
                                 var19 = true;
                                 break;
                              }
                           }
                        }

                        if (!var19) {
                           class69.method390(var16, var4 * 8, var5 * 8);
                        }
                     }
                  }
               }

               for(var16 = 0; var16 < 13; ++var16) {
                  for(var4 = 0; var4 < 13; ++var4) {
                     var5 = client.field495[0][var16][var4];
                     if (var5 == -1) {
                        class71.method396(var16 * 8, var4 * 8, 8, 8);
                     }
                  }
               }

               class39.method216(true);

               for(var16 = 0; var16 < 4; ++var16) {
                  client.method281();

                  for(var4 = 0; var4 < 13; ++var4) {
                     for(var5 = 0; var5 < 13; ++var5) {
                        var18 = client.field495[var16][var4][var5];
                        if (var18 != -1) {
                           var7 = var18 >> 24 & 3;
                           var8 = var18 >> 1 & 3;
                           var9 = var18 >> 14 & 1023;
                           var10 = var18 >> 3 & 2047;
                           var11 = (var9 / 8 << 8) + var10 / 8;

                           for(var12 = 0; var12 < class63.field833.length; ++var12) {
                              if (var11 == class63.field833[var12] && null != class315.field2995[var12]) {
                                 class74.method408(class315.field2995[var12], var16, var4 * 8, var5 * 8, var7, 8 * (var9 & 7), (var10 & 7) * 8, var8, class13.field126, client.field493);
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            class39.method216(true);
            client.method281();
            class406.method1987(class13.field126, client.field493);
            class39.method216(true);
            var16 = class74.field859;
            if (var16 > class195.field2036) {
               var16 = class195.field2036;
            }

            if (var16 < class195.field2036 - 1) {
               var16 = class195.field2036 - 1;
            }

            if (client.field478) {
               class13.field126.method73(class74.field859);
            } else {
               class13.field126.method73(0);
            }

            for(var4 = 0; var4 < 104; ++var4) {
               for(var5 = 0; var5 < 104; ++var5) {
                  class307.method1443(var4, var5);
               }
            }

            client.method281();
            class156.method819();
            class173.field1894.method162();
            class81 var20;
            if (class140.field1508.method760()) {
               var20 = class189.method982(class165.field1799, client.field483.field3459);
               var20.field933.method656(1057001181);
               client.field483.method1920(var20);
            }

            if (!client.field494) {
               var4 = (class222.field2433 - 6) / 8;
               var5 = (6 + class222.field2433) / 8;
               var18 = (class11.field59 - 6) / 8;
               var7 = (6 + class11.field59) / 8;

               for(var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
                  for(var9 = var18 - 1; var9 <= var7 + 1; ++var9) {
                     if (var8 < var4 || var8 > var5 || var9 < var18 || var9 > var7) {
                        class42.field375.method894("m" + var8 + "_" + var9);
                        class42.field375.method894("l" + var8 + "_" + var9);
                     }
                  }
               }
            }

            class72.method402(30);
            client.method281();
            class473.method2290();
            var20 = class189.method982(class165.field1776, client.field483.field3459);
            client.field483.method1920(var20);
            class377.method1798();
         }
      }
   }

   static final void method755(int var0, int var1, int var2, int var3, class319 var4, class400 var5) {
      int var7 = var2 * var2 + var3 * var3;
      if (var7 > 4225 && var7 < 90000) {
         int var8 = client.field505 & 2047;
         int var9 = class234.field2526[var8];
         int var10 = class234.field2544[var8];
         int var11 = var9 * var3 + var10 * var2 >> 16;
         int var12 = var10 * var3 - var9 * var2 >> 16;
         double var13 = Math.atan2((double)var11, (double)var12);
         int var15 = var5.field3511 / 2 - 25;
         int var16 = (int)(Math.sin(var13) * (double)var15);
         int var17 = (int)(Math.cos(var13) * (double)var15);
         byte var18 = 20;
         class105.field1358.method1554(var5.field3511 / 2 + var0 - var18 / 2 + var16, var5.field3512 / 2 + var1 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
      } else {
         class247.method1227(var0, var1, var2, var3, var4, var5);
      }

   }

   static final void method763() {
      client.field634 = client.field622;
      class312.field2974 = true;
   }
}
