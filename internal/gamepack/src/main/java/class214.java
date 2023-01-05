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

@ObfInfo(
   name = "an"
)
public abstract class class214 extends Applet implements Runnable, FocusListener, WindowListener {
   @ObfInfo(
      owner = "an",
      name = "j",
      desc = "I"
   )
   protected static int field1849 = 0;
   @ObfInfo(
      owner = "an",
      name = "vo",
      desc = "Lms;"
   )
   public static class426 field1874;
   @ObfInfo(
      owner = "an",
      name = "q",
      desc = "Z"
   )
   static boolean field1846 = false;
   @ObfInfo(
      owner = "an",
      name = "e",
      desc = "Lan;"
   )
   static class214 field1845 = null;
   @ObfInfo(
      owner = "an",
      name = "aj",
      desc = "Las;"
   )
   static class433 field1861 = new class433();
   @ObfInfo(
      owner = "an",
      name = "v",
      desc = "I"
   )
   static int field1844 = 0;
   @ObfInfo(
      owner = "an",
      name = "u",
      desc = "I"
   )
   static int field1847 = 20;
   @ObfInfo(
      owner = "an",
      name = "b",
      desc = "I"
   )
   static int field1848 = 1;
   @ObfInfo(
      owner = "an",
      name = "an",
      desc = "I"
   )
   static int field1863 = 500;
   @ObfInfo(
      owner = "an",
      name = "m",
      desc = "J"
   )
   static long field1853 = 0L;
   @ObfInfo(
      owner = "an",
      name = "ap",
      desc = "J"
   )
   static long field1871 = -1L;
   @ObfInfo(
      owner = "an",
      name = "aa",
      desc = "J"
   )
   static long field1873 = -1L;
   @ObfInfo(
      owner = "an",
      name = "k",
      desc = "[J"
   )
   static long[] field1855 = new long[32];
   @ObfInfo(
      owner = "an",
      name = "o",
      desc = "[J"
   )
   static long[] field1857 = new long[32];
   @ObfInfo(
      owner = "an",
      name = "ah",
      desc = "Z"
   )
   static volatile boolean field1870 = true;
   @ObfInfo(
      owner = "an",
      name = "ab",
      desc = "Z"
   )
   boolean field1864 = false;
   @ObfInfo(
      owner = "an",
      name = "f",
      desc = "Z"
   )
   boolean field1872 = false;
   @ObfInfo(
      owner = "an",
      name = "af",
      desc = "Ld;"
   )
   class390 field1867;
   @ObfInfo(
      owner = "an",
      name = "as",
      desc = "I"
   )
   int field1843;
   @ObfInfo(
      owner = "an",
      name = "t",
      desc = "I"
   )
   int field1854 = 0;
   @ObfInfo(
      owner = "an",
      name = "z",
      desc = "I"
   )
   int field1856;
   @ObfInfo(
      owner = "an",
      name = "ad",
      desc = "I"
   )
   int field1858;
   @ObfInfo(
      owner = "an",
      name = "ao",
      desc = "I"
   )
   int field1859;
   @ObfInfo(
      owner = "an",
      name = "c",
      desc = "I"
   )
   int field1875 = 0;
   @ObfInfo(
      owner = "an",
      name = "ar",
      desc = "Ljava/awt/Canvas;"
   )
   Canvas field1868;
   @ObfInfo(
      owner = "an",
      name = "au",
      desc = "Ljava/awt/Frame;"
   )
   Frame field1860;
   @ObfInfo(
      owner = "an",
      name = "ai",
      desc = "Ljava/awt/datatransfer/Clipboard;"
   )
   Clipboard field1850;
   @ObfInfo(
      owner = "an",
      name = "ax",
      desc = "Ljava/awt/EventQueue;"
   )
   final EventQueue field1869;
   @ObfInfo(
      owner = "an",
      name = "l",
      desc = "I"
   )
   protected int field1851;
   @ObfInfo(
      owner = "an",
      name = "s",
      desc = "I"
   )
   protected int field1852;
   @ObfInfo(
      owner = "an",
      name = "at",
      desc = "Z"
   )
   volatile boolean field1862 = true;
   @ObfInfo(
      owner = "an",
      name = "al",
      desc = "Z"
   )
   volatile boolean field1865 = false;
   @ObfInfo(
      owner = "an",
      name = "ag",
      desc = "J"
   )
   volatile long field1866 = 0L;

   @ObfInfo(
      owner = "an",
      name = "<init>",
      desc = "()V"
   )
   protected class214() {
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
         ;
      }

      this.field1869 = var1;
      class297 var2 = new class297();
      class91.field772 = var2;
   }

   @ObfInfo(
      owner = "an",
      name = "an",
      desc = "(B)V"
   )
   protected abstract void method941();

   @ObfInfo(
      owner = "an",
      name = "ab",
      desc = "(ZI)V"
   )
   protected abstract void method942(boolean var1);

   @ObfInfo(
      owner = "an",
      name = "aw",
      desc = "(I)V"
   )
   protected abstract void method946();

   @ObfInfo(
      owner = "an",
      name = "k",
      desc = "(B)V"
   )
   protected abstract void method950();

   @ObfInfo(
      owner = "an",
      name = "ay",
      desc = "(B)V"
   )
   protected abstract void method951();

   @ObfInfo(
      owner = "an",
      name = "al",
      desc = "(I)V"
   )
   protected abstract void method955();

   @ObfInfo(
      owner = "an",
      name = "init",
      desc = "()V"
   )
   public abstract void init();

   @ObfInfo(
      owner = "an",
      name = "x",
      desc = "(III)V"
   )
   protected final void method922(int var1, int var2) {
      if (this.field1858 != var1 || var2 != this.field1859) {
         this.method938();
      }

      this.field1858 = var1;
      this.field1859 = var2;
   }

   @ObfInfo(
      owner = "an",
      name = "m",
      desc = "(Ljava/lang/Object;I)V"
   )
   final void method923(Object var1) {
      if (null != this.field1869) {
         for(int var3 = 0; var3 < 50 && this.field1869.peekEvent() != null; ++var3) {
            class286.method1421(1L);
         }

         if (null != var1) {
            this.field1869.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   @ObfInfo(
      owner = "an",
      name = "q",
      desc = "(I)Lff;"
   )
   protected class217 method924() {
      if (this.field1867 == null) {
         this.field1867 = new class390();
         this.field1867.method1913(this.field1868);
      }

      return this.field1867;
   }

   @ObfInfo(
      owner = "an",
      name = "f",
      desc = "(B)V"
   )
   protected void method925() {
      this.field1850 = this.getToolkit().getSystemClipboard();
   }

   @ObfInfo(
      owner = "an",
      name = "r",
      desc = "(Ljava/lang/String;S)V"
   )
   protected void method926(String var1) {
      this.field1850.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   @ObfInfo(
      owner = "an",
      name = "u",
      desc = "(B)Ljava/awt/datatransfer/Clipboard;"
   )
   public Clipboard method927() {
      return this.field1850;
   }

   @ObfInfo(
      owner = "an",
      name = "b",
      desc = "(I)V"
   )
   protected final void method928() {
      if (class300.field2408.toLowerCase().indexOf("microsoft") != -1) {
         class74.field660[186] = 57;
         class74.field660[187] = 27;
         class74.field660[188] = 71;
         class74.field660[189] = 26;
         class74.field660[190] = 72;
         class74.field660[191] = 73;
         class74.field660[192] = 58;
         class74.field660[219] = 42;
         class74.field660[220] = 74;
         class74.field660[221] = 43;
         class74.field660[222] = 59;
         class74.field660[223] = 28;
      } else {
         class74.field660[44] = 71;
         class74.field660[45] = 26;
         class74.field660[46] = 72;
         class74.field660[47] = 73;
         class74.field660[59] = 57;
         class74.field660[61] = 27;
         class74.field660[91] = 42;
         class74.field660[92] = 74;
         class74.field660[93] = 43;
         class74.field660[192] = 28;
         class74.field660[222] = 58;
         class74.field660[520] = 59;
      }

      field1861.method2141(this.field1868);
   }

   @ObfInfo(
      owner = "an",
      name = "g",
      desc = "(I)V"
   )
   protected final void method929() {
      field1861.method2143();
   }

   @ObfInfo(
      owner = "an",
      name = "i",
      desc = "(Lav;IB)V"
   )
   protected void method930(class310 var1, int var2) {
      field1861.method2139(var1, var2);
   }

   @ObfInfo(
      owner = "an",
      name = "o",
      desc = "(I)V"
   )
   protected final void method947() {
      Canvas var2 = this.field1868;
      var2.addMouseListener(class466.field3857);
      var2.addMouseMotionListener(class466.field3857);
      var2.addFocusListener(class466.field3857);
   }

   @ObfInfo(
      owner = "an",
      name = "n",
      desc = "(I)V"
   )
   final void method952() {
      Container var2 = this.method953();
      if (var2 != null) {
         class376 var3 = this.method956();
         this.field1852 = Math.max(var3.field3185, this.field1856);
         this.field1851 = Math.max(var3.field3182, this.field1843);
         if (this.field1852 <= 0) {
            this.field1852 = 1;
         }

         if (this.field1851 <= 0) {
            this.field1851 = 1;
         }

         class427.field3529 = Math.min(this.field1852, this.field1858);
         class476.field4003 = Math.min(this.field1851, this.field1859);
         this.field1854 = (this.field1852 - class427.field3529) / 2;
         this.field1875 = 0;
         this.field1868.setSize(class427.field3529, class476.field4003);
         class39.field199 = new class172(class427.field3529, class476.field4003, this.field1868);
         if (this.field1860 == var2) {
            Insets var4 = this.field1860.getInsets();
            this.field1868.setLocation(var4.left + this.field1854, this.field1875 + var4.top);
         } else {
            this.field1868.setLocation(this.field1854, this.field1875);
         }

         this.field1862 = true;
         this.method950();
      }
   }

   @ObfInfo(
      owner = "an",
      name = "a",
      desc = "(I)V"
   )
   void method931() {
      int var2 = this.field1854;
      int var3 = this.field1875;
      int var4 = this.field1852 - class427.field3529 - var2;
      int var5 = this.field1851 - class476.field4003 - var3;
      if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
         try {
            Container var6 = this.method953();
            int var7 = 0;
            int var8 = 0;
            if (var6 == this.field1860) {
               Insets var9 = this.field1860.getInsets();
               var7 = var9.left;
               var8 = var9.top;
            }

            Graphics var11 = var6.getGraphics();
            var11.setColor(Color.black);
            if (var2 > 0) {
               var11.fillRect(var7, var8, var2, this.field1851);
            }

            if (var3 > 0) {
               var11.fillRect(var7, var8, this.field1852, var3);
            }

            if (var4 > 0) {
               var11.fillRect(this.field1852 + var7 - var4, var8, var4, this.field1851);
            }

            if (var5 > 0) {
               var11.fillRect(var7, this.field1851 + var8 - var5, this.field1852, var5);
            }
         } catch (Exception var10) {
            ;
         }
      }

   }

   @ObfInfo(
      owner = "an",
      name = "s",
      desc = "(I)V"
   )
   final void method932() {
      field1861.method2138(this.field1868);
      class483.method2374(this.field1868);
      if (null != this.field1867) {
         this.field1867.method1914(this.field1868);
      }

      this.method934();
      field1861.method2141(this.field1868);
      Canvas var2 = this.field1868;
      var2.addMouseListener(class466.field3857);
      var2.addMouseMotionListener(class466.field3857);
      var2.addFocusListener(class466.field3857);
      if (null != this.field1867) {
         this.field1867.method1913(this.field1868);
      }

      this.method938();
   }

   @ObfInfo(
      owner = "an",
      name = "l",
      desc = "(IIIIB)V"
   )
   protected final void method933(int var1, int var2, int var3, int var4) {
      try {
         if (field1845 != null) {
            ++field1844;
            if (field1844 >= 3) {
               this.method959("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         field1845 = this;
         class427.field3529 = var1;
         class476.field4003 = var2;
         class478.field4013 = var3;
         class478.field4012 = var4;
         class126.field1068 = this;
         if (class21.field104 == null) {
            class21.field104 = new class300();
         }

         class21.field104.method1449(this, 1);
      } catch (Exception var7) {
         class445.method2199((String)null, var7);
         this.method959("crash");
      }

   }

   @ObfInfo(
      owner = "an",
      name = "as",
      desc = "(B)V"
   )
   final synchronized void method934() {
      Container var2 = this.method953();
      if (this.field1868 != null) {
         this.field1868.removeFocusListener(this);
         var2.remove(this.field1868);
      }

      class427.field3529 = Math.max(var2.getWidth(), this.field1856);
      class476.field4003 = Math.max(var2.getHeight(), this.field1843);
      Insets var3;
      if (null != this.field1860) {
         var3 = this.field1860.getInsets();
         class427.field3529 -= var3.right + var3.left;
         class476.field4003 -= var3.bottom + var3.top;
      }

      this.field1868 = new class36(this);
      var2.setBackground(Color.BLACK);
      var2.setLayout((LayoutManager)null);
      var2.add(this.field1868);
      this.field1868.setSize(class427.field3529, class476.field4003);
      this.field1868.setVisible(true);
      this.field1868.setBackground(Color.BLACK);
      if (this.field1860 == var2) {
         var3 = this.field1860.getInsets();
         this.field1868.setLocation(this.field1854 + var3.left, var3.top + this.field1875);
      } else {
         this.field1868.setLocation(this.field1854, this.field1875);
      }

      this.field1868.addFocusListener(this);
      this.field1868.requestFocus();
      this.field1862 = true;
      if (null != class39.field199 && class39.field199.field579 == class427.field3529 && class476.field4003 == class39.field199.field580) {
         ((class172)class39.field199).method796(this.field1868);
         class39.field199.method263(0, 0);
      } else {
         class39.field199 = new class172(class427.field3529, class476.field4003, this.field1868);
      }

      this.field1865 = false;
      this.field1866 = class152.method711();
   }

   @ObfInfo(
      owner = "an",
      name = "ad",
      desc = "(B)Z"
   )
   protected final boolean method935() {
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
                  this.method959("invalidhost");
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

   @ObfInfo(
      owner = "an",
      name = "run",
      desc = "()V"
   )
   public void run() {
      try {
         if (class300.field2408 != null) {
            String var1 = class300.field2408.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = class300.field2406;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method959("wrongjava");
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && class221.method980(var2.charAt(var3)); ++var3) {
                     ;
                  }

                  String var4 = var2.substring(6, var3);
                  if (class154.method715(var4) && class322.method1651(var4) < 10) {
                     this.method959("wrongjava");
                     return;
                  }
               }

               field1848 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.method934();
         this.method951();

         Object var7;
         try {
            var7 = new class107();
         } catch (Throwable var5) {
            var7 = new class143();
         }

         class140.field1139 = (class203)var7;

         while(0L == field1853 || class152.method711() < field1853) {
            class235.field1993 = class140.field1139.method890(field1847, field1848);

            for(int var8 = 0; var8 < class235.field1993; ++var8) {
               this.method954();
            }

            this.method936();
            this.method923(this.field1868);
         }
      } catch (Exception var6) {
         class445.method2199((String)null, var6);
         this.method959("crash");
      }

      this.method939();
   }

   @ObfInfo(
      owner = "an",
      name = "ao",
      desc = "(B)V"
   )
   void method954() {
      long var2 = class152.method711();
      long var4 = field1855[class338.field2704];
      field1855[class338.field2704] = var2;
      class338.field2704 = 1 + class338.field2704 & 31;
      if (0L != var4 && var2 > var4) {
         ;
      }

      synchronized(this) {
         class6.field30 = field1870;
      }

      this.method941();
   }

   @ObfInfo(
      owner = "an",
      name = "am",
      desc = "(I)V"
   )
   void method936() {
      Container var2 = this.method953();
      long var3 = class152.method711();
      long var5 = field1857[class54.field581];
      field1857[class54.field581] = var3;
      class54.field581 = class54.field581 + 1 & 31;
      if (0L != var5 && var3 > var5) {
         int var7 = (int)(var3 - var5);
         field1849 = ((var7 >> 1) + 32000) / var7;
      }

      if (++field1863 - 1 > 50) {
         field1863 -= 50;
         this.field1862 = true;
         this.field1868.setSize(class427.field3529, class476.field4003);
         this.field1868.setVisible(true);
         if (var2 == this.field1860) {
            Insets var8 = this.field1860.getInsets();
            this.field1868.setLocation(var8.left + this.field1854, this.field1875 + var8.top);
         } else {
            this.field1868.setLocation(this.field1854, this.field1875);
         }
      }

      if (this.field1865) {
         this.method932();
      }

      this.method937();
      this.method942(this.field1862);
      if (this.field1862) {
         this.method931();
      }

      this.field1862 = false;
   }

   @ObfInfo(
      owner = "an",
      name = "av",
      desc = "(I)V"
   )
   final void method937() {
      class376 var2 = this.method956();
      if (this.field1852 != var2.field3185 || this.field1851 != var2.field3182 || this.field1864) {
         this.method952();
         this.field1864 = false;
      }

   }

   @ObfInfo(
      owner = "an",
      name = "au",
      desc = "(S)V"
   )
   final void method938() {
      this.field1864 = true;
   }

   @ObfInfo(
      owner = "an",
      name = "ar",
      desc = "(I)V"
   )
   final synchronized void method939() {
      if (!field1846) {
         field1846 = true;

         try {
            this.field1868.removeFocusListener(this);
         } catch (Exception var6) {
            ;
         }

         try {
            this.method955();
         } catch (Exception var5) {
            ;
         }

         if (this.field1860 != null) {
            try {
               System.exit(0);
            } catch (Throwable var4) {
               ;
            }
         }

         if (class21.field104 != null) {
            try {
               class21.field104.method1447();
            } catch (Exception var3) {
               ;
            }
         }

         this.method946();
      }
   }

   @ObfInfo(
      owner = "an",
      name = "start",
      desc = "()V"
   )
   public final void start() {
      if (this == field1845 && !field1846) {
         field1853 = 0L;
      }
   }

   @ObfInfo(
      owner = "an",
      name = "stop",
      desc = "()V"
   )
   public final void stop() {
      if (this == field1845 && !field1846) {
         field1853 = class152.method711() + 4000L;
      }
   }

   @ObfInfo(
      owner = "an",
      name = "destroy",
      desc = "()V"
   )
   public final void destroy() {
      if (this == field1845 && !field1846) {
         field1853 = class152.method711();
         class286.method1421(5000L);
         this.method939();
      }
   }

   @ObfInfo(
      owner = "an",
      name = "update",
      desc = "(Ljava/awt/Graphics;)V"
   )
   public final void update(Graphics var1) {
      this.paint(var1);
   }

   @ObfInfo(
      owner = "an",
      name = "paint",
      desc = "(Ljava/awt/Graphics;)V"
   )
   public final synchronized void paint(Graphics var1) {
      if (field1845 == this && !field1846) {
         this.field1862 = true;
         if (class152.method711() - this.field1866 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (null == var2 || var2.width >= class427.field3529 && var2.height >= class476.field4003) {
               this.field1865 = true;
            }
         }

      }
   }

   @ObfInfo(
      owner = "an",
      name = "focusGained",
      desc = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusGained(FocusEvent var1) {
      field1870 = true;
      this.field1862 = true;
   }

   @ObfInfo(
      owner = "an",
      name = "focusLost",
      desc = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusLost(FocusEvent var1) {
      field1870 = false;
   }

   @ObfInfo(
      owner = "an",
      name = "windowActivated",
      desc = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowActivated(WindowEvent var1) {
   }

   @ObfInfo(
      owner = "an",
      name = "windowClosed",
      desc = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowClosed(WindowEvent var1) {
   }

   @ObfInfo(
      owner = "an",
      name = "windowClosing",
      desc = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   @ObfInfo(
      owner = "an",
      name = "windowDeactivated",
      desc = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowDeactivated(WindowEvent var1) {
   }

   @ObfInfo(
      owner = "an",
      name = "windowDeiconified",
      desc = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowDeiconified(WindowEvent var1) {
   }

   @ObfInfo(
      owner = "an",
      name = "windowIconified",
      desc = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowIconified(WindowEvent var1) {
   }

   @ObfInfo(
      owner = "an",
      name = "windowOpened",
      desc = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowOpened(WindowEvent var1) {
   }

   @ObfInfo(
      owner = "an",
      name = "ag",
      desc = "(ILjava/lang/String;ZI)V"
   )
   protected final void method943(int var1, String var2, boolean var3) {
      try {
         Graphics var5 = this.field1868.getGraphics();
         if (class91.field771 == null) {
            class91.field771 = new Font("Helvetica", 1, 13);
            class100.field796 = this.field1868.getFontMetrics(class91.field771);
         }

         if (var3) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, class427.field3529, class476.field4003);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if (class184.field1685 == null) {
               class184.field1685 = this.field1868.createImage(304, 34);
            }

            Graphics var7 = class184.field1685.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 33);
            var7.fillRect(2, 2, var1 * 3, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 301, 31);
            var7.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
            var7.setFont(class91.field771);
            var7.setColor(Color.white);
            var7.drawString(var2, (304 - class100.field796.stringWidth(var2)) / 2, 22);
            var5.drawImage(class184.field1685, class427.field3529 / 2 - 152, class476.field4003 / 2 - 18, (ImageObserver)null);
         } catch (Exception var10) {
            int var8 = class427.field3529 / 2 - 152;
            int var9 = class476.field4003 / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 303, 33);
            var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
            var5.setColor(Color.black);
            var5.drawRect(var8 + 1, var9 + 1, 301, 31);
            var5.fillRect(var8 + 2 + var1 * 3, var9 + 2, 300 - var1 * 3, 30);
            var5.setFont(class91.field771);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (304 - class100.field796.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.field1868.repaint();
      }

   }

   @ObfInfo(
      owner = "an",
      name = "az",
      desc = "(I)V"
   )
   protected final void method944() {
      class184.field1685 = null;
      class91.field771 = null;
      class100.field796 = null;
   }

   @ObfInfo(
      owner = "an",
      name = "ak",
      desc = "(Ljava/lang/String;I)V"
   )
   protected void method959(String var1) {
      if (!this.field1872) {
         this.field1872 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var4) {
            ;
         }

      }
   }

   @ObfInfo(
      owner = "an",
      name = "af",
      desc = "(I)Ljava/awt/Container;"
   )
   Container method953() {
      return (Container)(null != this.field1860 ? this.field1860 : this);
   }

   @ObfInfo(
      owner = "an",
      name = "ai",
      desc = "(I)Lok;"
   )
   class376 method956() {
      Container var2 = this.method953();
      int var3 = Math.max(var2.getWidth(), this.field1856);
      int var4 = Math.max(var2.getHeight(), this.field1843);
      if (null != this.field1860) {
         Insets var5 = this.field1860.getInsets();
         var3 -= var5.right + var5.left;
         var4 -= var5.bottom + var5.top;
      }

      return new class376(var3, var4);
   }

   @ObfInfo(
      owner = "an",
      name = "ax",
      desc = "(I)Z"
   )
   protected final boolean method945() {
      return null != this.field1860;
   }

   @ObfInfo(
      owner = "an",
      name = "r",
      desc = "(IIIZIB)J"
   )
   public static long method949(int var0, int var1, int var2, boolean var3, int var4) {
      long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if (var3) {
         var6 |= 65536L;
      }

      return var6;
   }

   @ObfInfo(
      owner = "an",
      name = "hj",
      desc = "(I)V"
   )
   static void method957() {
      class299 var1 = class480.method2370(class356.field2940, client.field279.field4042);
      var1.field2403.method544(class152.method713());
      var1.field2403.method533(class427.field3529);
      var1.field2403.method533(class476.field4003);
      client.field279.method2389(var1);
   }

   @ObfInfo(
      owner = "an",
      name = "ig",
      desc = "(B)V"
   )
   static final void method958() {
      class460.method2267(false);
      client.field314 = 0;
      boolean var1 = true;

      int var2;
      for(var2 = 0; var2 < class467.field3882.length; ++var2) {
         if (-1 != client.field495[var2] && null == class467.field3882[var2]) {
            class467.field3882[var2] = class440.field3648.method1365(client.field495[var2], 0);
            if (class467.field3882[var2] == null) {
               var1 = false;
               ++client.field314;
            }
         }

         if (-1 != class191.field1711[var2] && null == class388.field3273[var2]) {
            class388.field3273[var2] = class440.field3648.method1342(class191.field1711[var2], 0, class252.field2084[var2]);
            if (null == class388.field3273[var2]) {
               var1 = false;
               ++client.field314;
            }
         }
      }

      if (!var1) {
         client.field371 = 1;
      } else {
         client.field499 = 0;
         var1 = true;

         int var4;
         int var5;
         for(var2 = 0; var2 < class467.field3882.length; ++var2) {
            byte[] var3 = class388.field3273[var2];
            if (var3 != null) {
               var4 = (class474.field3996[var2] >> 8) * 64 - class312.field2465;
               var5 = 64 * (class474.field3996[var2] & 255) - class325.field2575;
               if (client.field290) {
                  var4 = 10;
                  var5 = 10;
               }

               var1 &= class71.method313(var3, var4, var5);
            }
         }

         if (!var1) {
            client.field371 = 2;
         } else {
            if (0 != client.field371) {
               class492.method2436(class177.field1455 + class442.field3661 + class442.field3658 + 100 + "%" + class442.field3662, true);
            }

            client.method189();
            class408.field3415.method1561();

            for(var2 = 0; var2 < 4; ++var2) {
               client.field289[var2].method2082();
            }

            int var16;
            for(var2 = 0; var2 < 4; ++var2) {
               for(var16 = 0; var16 < 104; ++var16) {
                  for(var4 = 0; var4 < 104; ++var4) {
                     class71.field644[var2][var16][var4] = 0;
                  }
               }
            }

            client.method189();
            class258.method1105();
            var2 = class467.field3882.length;
            class434.method2154();
            class460.method2267(true);
            int var18;
            if (!client.field290) {
               byte[] var6;
               for(var16 = 0; var16 < var2; ++var16) {
                  var4 = 64 * (class474.field3996[var16] >> 8) - class312.field2465;
                  var5 = (class474.field3996[var16] & 255) * 64 - class325.field2575;
                  var6 = class467.field3882[var16];
                  if (var6 != null) {
                     client.method189();
                     class19.method89(var6, var4, var5, class391.field3279 * 8 - 48, class132.field1104 * 8 - 48, client.field289);
                  }
               }

               for(var16 = 0; var16 < var2; ++var16) {
                  var4 = 64 * (class474.field3996[var16] >> 8) - class312.field2465;
                  var5 = 64 * (class474.field3996[var16] & 255) - class325.field2575;
                  var6 = class467.field3882[var16];
                  if (null == var6 && class132.field1104 < 800) {
                     client.method189();
                     class329.method1670(var4, var5, 64, 64);
                  }
               }

               class460.method2267(true);

               for(var16 = 0; var16 < var2; ++var16) {
                  byte[] var17 = class388.field3273[var16];
                  if (var17 != null) {
                     var5 = 64 * (class474.field3996[var16] >> 8) - class312.field2465;
                     var18 = (class474.field3996[var16] & 255) * 64 - class325.field2575;
                     client.method189();
                     class182.method830(var17, var5, var18, class408.field3415, client.field289);
                  }
               }
            }

            int var7;
            int var8;
            int var9;
            if (client.field290) {
               int var10;
               int var11;
               int var12;
               for(var16 = 0; var16 < 4; ++var16) {
                  client.method189();

                  for(var4 = 0; var4 < 13; ++var4) {
                     for(var5 = 0; var5 < 13; ++var5) {
                        boolean var19 = false;
                        var7 = client.field291[var16][var4][var5];
                        if (var7 != -1) {
                           var8 = var7 >> 24 & 3;
                           var9 = var7 >> 1 & 3;
                           var10 = var7 >> 14 & 1023;
                           var11 = var7 >> 3 & 2047;
                           var12 = (var10 / 8 << 8) + var11 / 8;

                           for(int var13 = 0; var13 < class474.field3996.length; ++var13) {
                              if (var12 == class474.field3996[var13] && class467.field3882[var13] != null) {
                                 int var14 = 8 * (var10 - var4);
                                 int var15 = 8 * (var11 - var5);
                                 class433.method2144(class467.field3882[var13], var16, var4 * 8, var5 * 8, var8, 8 * (var10 & 7), (var11 & 7) * 8, var9, var14, var15, client.field289);
                                 var19 = true;
                                 break;
                              }
                           }
                        }

                        if (!var19) {
                           class241.method1046(var16, var4 * 8, var5 * 8);
                        }
                     }
                  }
               }

               for(var16 = 0; var16 < 13; ++var16) {
                  for(var4 = 0; var4 < 13; ++var4) {
                     var5 = client.field291[0][var16][var4];
                     if (var5 == -1) {
                        class329.method1670(var16 * 8, var4 * 8, 8, 8);
                     }
                  }
               }

               class460.method2267(true);

               for(var16 = 0; var16 < 4; ++var16) {
                  client.method189();

                  for(var4 = 0; var4 < 13; ++var4) {
                     for(var5 = 0; var5 < 13; ++var5) {
                        var18 = client.field291[var16][var4][var5];
                        if (var18 != -1) {
                           var7 = var18 >> 24 & 3;
                           var8 = var18 >> 1 & 3;
                           var9 = var18 >> 14 & 1023;
                           var10 = var18 >> 3 & 2047;
                           var11 = (var9 / 8 << 8) + var10 / 8;

                           for(var12 = 0; var12 < class474.field3996.length; ++var12) {
                              if (var11 == class474.field3996[var12] && null != class388.field3273[var12]) {
                                 class71.method312(class388.field3273[var12], var16, var4 * 8, var5 * 8, var7, 8 * (var9 & 7), (var10 & 7) * 8, var8, class408.field3415, client.field289);
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            class460.method2267(true);
            client.method189();
            class166.method779(class408.field3415, client.field289);
            class460.method2267(true);
            var16 = class71.field637;
            if (var16 > class347.field2878) {
               var16 = class347.field2878;
            }

            if (var16 < class347.field2878 - 1) {
               var16 = class347.field2878 - 1;
            }

            if (client.field274) {
               class408.field3415.method1603(class71.field637);
            } else {
               class408.field3415.method1603(0);
            }

            for(var4 = 0; var4 < 104; ++var4) {
               for(var5 = 0; var5 < 104; ++var5) {
                  class471.method2329(var4, var5);
               }
            }

            client.method189();
            class294.method1437();
            class87.field736.method395();
            class299 var20;
            if (class309.field2461.method945()) {
               var20 = class480.method2370(class356.field3013, client.field279.field4042);
               var20.field2403.method534(1057001181);
               client.field279.method2389(var20);
            }

            if (!client.field290) {
               var4 = (class391.field3279 - 6) / 8;
               var5 = (6 + class391.field3279) / 8;
               var18 = (class132.field1104 - 6) / 8;
               var7 = (6 + class132.field1104) / 8;

               for(var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
                  for(var9 = var18 - 1; var9 <= var7 + 1; ++var9) {
                     if (var8 < var4 || var8 > var5 || var9 < var18 || var9 > var7) {
                        class440.field3648.method1367("m" + var8 + "_" + var9);
                        class440.field3648.method1367("l" + var8 + "_" + var9);
                     }
                  }
               }
            }

            class261.method1113(30);
            client.method189();
            class255.method1094();
            var20 = class480.method2370(class356.field2990, client.field279.field4042);
            client.field279.method2389(var20);
            class74.method325();
         }
      }
   }

   @ObfInfo(
      owner = "an",
      name = "mz",
      desc = "(IIIILrx;Lkv;I)V"
   )
   static final void method940(int var0, int var1, int var2, int var3, class266 var4, class226 var5) {
      int var7 = var2 * var2 + var3 * var3;
      if (var7 > 4225 && var7 < 90000) {
         int var8 = client.field301 & 2047;
         int var9 = class341.field2726[var8];
         int var10 = class341.field2744[var8];
         int var11 = var9 * var3 + var10 * var2 >> 16;
         int var12 = var10 * var3 - var9 * var2 >> 16;
         double var13 = Math.atan2((double)var11, (double)var12);
         int var15 = var5.field1926 / 2 - 25;
         int var16 = (int)(Math.sin(var13) * (double)var15);
         int var17 = (int)(Math.cos(var13) * (double)var15);
         byte var18 = 20;
         class182.field1681.method1246(var5.field1926 / 2 + var0 - var18 / 2 + var16, var5.field1927 / 2 + var1 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
      } else {
         class196.method874(var0, var1, var2, var3, var4, var5);
      }

   }

   @ObfInfo(
      owner = "an",
      name = "ml",
      desc = "(I)V"
   )
   static final void method948() {
      client.field430 = client.field418;
      class454.field3773 = true;
   }
}
