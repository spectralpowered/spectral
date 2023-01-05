import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class class117 implements KeyListener, FocusListener {
   boolean[] field1419 = new boolean[112];
   class271[] field1416 = new class271[3];
   Collection field1417 = new ArrayList(100);
   Collection field1418 = new ArrayList(100);
   volatile int field1420 = 0;

   void method603(class271 var1, int var2) {
      this.field1416[var2] = var1;
   }

   int method604() {
      return this.field1420;
   }

   void method605(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   synchronized void method602(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.field1417.add(new class352(4, 0));
      }
   }

   void method607() {
      ++this.field1420;
      this.method606();
      Iterator var2 = this.field1418.iterator();

      while(var2.hasNext()) {
         class352 var3 = (class352)var2.next();

         for(int var4 = 0; var4 < this.field1416.length && !var3.method1685(this.field1416[var4]); ++var4) {
            ;
         }
      }

      this.field1418.clear();
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      int var2;
      label23: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = class377.field3310.length;
            if (var2 < var4) {
               var2 = class72.method404(var2);
               boolean var5 = (var2 & 128) != 0;
               if (var5) {
                  var2 = -1;
               }
               break label23;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.field1419[var2] = true;
         this.field1417.add(new class352(1, var2));
         this.field1420 = 0;
      }

      var1.consume();
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      int var2;
      label16: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = class377.field3310.length;
            if (var2 < var4) {
               var2 = class72.method404(var2) & -129;
               break label16;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.field1419[var2] = false;
         this.field1417.add(new class352(2, var2));
      }

      var1.consume();
   }

   public final synchronized void keyTyped(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (var2 != 0 && var2 != '\uffff') {
         boolean var3;
         if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
            label47: {
               if (var2 != 0) {
                  char[] var4 = class307.field2898;

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     char var6 = var4[var5];
                     if (var6 == var2) {
                        var3 = true;
                        break label47;
                     }
                  }
               }

               var3 = false;
            }
         } else {
            var3 = true;
         }

         if (var3) {
            this.field1417.add(new class352(3, var2));
         }
      }

      var1.consume();
   }

   synchronized void method606() {
      Collection var2 = this.field1418;
      this.field1418 = this.field1417;
      this.field1417 = var2;
   }

   public final synchronized void focusGained(FocusEvent var1) {
      this.field1417.add(new class352(4, 1));
   }

   public final synchronized void focusLost(FocusEvent var1) {
      for(int var2 = 0; var2 < 112; ++var2) {
         if (this.field1419[var2]) {
            this.field1419[var2] = false;
            this.field1417.add(new class352(2, var2));
         }
      }

      this.field1417.add(new class352(4, 0));
   }

   static void method610() {
      Iterator var1 = class58.field815.iterator();

      while(var1.hasNext()) {
         class154 var2 = (class154)var1.next();
         var2.method813();
      }

   }

   static final void method608(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class391[] var10) {
      int var13;
      for(int var12 = 0; var12 < 8; ++var12) {
         for(var13 = 0; var13 < 8; ++var13) {
            if (var2 + var12 > 0 && var2 + var12 < 103 && var3 + var13 > 0 && var3 + var13 < 103) {
               var10[var1].field3445[var2 + var12][var3 + var13] &= -16777217;
            }
         }
      }

      class134 var25 = new class134(var0);

      for(var13 = 0; var13 < 4; ++var13) {
         for(int var14 = 0; var14 < 64; ++var14) {
            for(int var15 = 0; var15 < 64; ++var15) {
               if (var13 == var4 && var14 >= var5 && var14 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
                  int var18 = var14 & 7;
                  int var19 = var15 & 7;
                  int var20 = var7 & 3;
                  int var17;
                  if (var20 == 0) {
                     var17 = var18;
                  } else if (var20 == 1) {
                     var17 = var19;
                  } else if (var20 == 2) {
                     var17 = 7 - var18;
                  } else {
                     var17 = 7 - var19;
                  }

                  int var21 = var2 + var17;
                  int var22 = var3 + class304.method1434(var14 & 7, var15 & 7, var7);
                  int var23 = (var14 & 7) + var8 + var2;
                  int var24 = (var15 & 7) + var9 + var3;
                  class58.method335(var25, var1, var21, var22, var23, var24, var7);
               } else {
                  class58.method335(var25, 0, -1, -1, 0, 0, 0);
               }
            }
         }
      }

   }

   static int method609(int var0, class472 var1, boolean var2) {
      if (var0 == 6754) {
         int var6 = class150.field1580[--class188.field1989];
         class272 var7 = class190.method984(var6, (byte)115);
         class150.field1581[++class150.field1582 - 1] = null != var7 ? var7.field2710 : "";
         return 1;
      } else if (var0 == 6764) {
         class188.field1989 -= 2;
         class272 var4 = class190.method984(class188.field1989, (byte)29);
         int var5 = class150.field1580[1 + class188.field1989];
         class150.field1580[++class188.field1989 - 1] = var4.method1284(var5);
         class150.field1580[++class188.field1989 - 1] = var4.method1291(var5);
         return 1;
      } else {
         return 2;
      }
   }

   static final boolean method611(class210 var0) {
      if (null == var0.field2343) {
         return false;
      } else {
         for(int var2 = 0; var2 < var0.field2343.length; ++var2) {
            int var3 = class378.method1803(var0, var2);
            int var4 = var0.field2344[var2];
            if (2 == var0.field2343[var2]) {
               if (var3 >= var4) {
                  return false;
               }
            } else if (var0.field2343[var2] == 3) {
               if (var3 <= var4) {
                  return false;
               }
            } else if (4 == var0.field2343[var2]) {
               if (var4 == var3) {
                  return false;
               }
            } else if (var3 != var4) {
               return false;
            }
         }

         return true;
      }
   }
}
