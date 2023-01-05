import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class class401 extends class206 {
   Component field3515;
   Image field3514;

   class401(int var1, int var2, Component var3) {
      super.field2193 = var1;
      super.field2194 = var2;
      super.field2192 = new int[1 + var2 * var1];
      DataBufferInt var4 = new DataBufferInt(super.field2192, super.field2192.length);
      DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(super.field2193, super.field2194), var4, (Point)null);
      this.field3514 = new BufferedImage(var5, var6, false, new Hashtable());
      this.method1960(var3);
      this.method1057();
   }

   final void method1960(Component var1) {
      this.field3515 = var1;
   }

   public final void method1056(int var1, int var2) {
      this.method1961(this.field3515.getGraphics(), var1, var2);
   }

   public final void method1055(int var1, int var2, int var3, int var4) {
      this.method1959(this.field3515.getGraphics(), var1, var2, var3, var4);
   }

   final void method1961(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.field3514, var2, var3, this.field3515);
      } catch (Exception var6) {
         this.field3515.repaint();
      }

   }

   final void method1959(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var7 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.field3514, 0, 0, this.field3515);
         var1.setClip(var7);
      } catch (Exception var8) {
         this.field3515.repaint();
      }

   }
}
