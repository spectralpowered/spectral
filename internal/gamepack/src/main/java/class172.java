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

@ObfInfo(
   name = "at"
)
public final class class172 extends class54 {
   @ObfInfo(
      owner = "at",
      name = "h",
      desc = "Ljava/awt/Component;"
   )
   Component field1279;
   @ObfInfo(
      owner = "at",
      name = "e",
      desc = "Ljava/awt/Image;"
   )
   Image field1278;

   @ObfInfo(
      owner = "at",
      name = "<init>",
      desc = "(IILjava/awt/Component;)V"
   )
   class172(int var1, int var2, Component var3) {
      super.field579 = var1;
      super.field580 = var2;
      super.field578 = new int[1 + var2 * var1];
      DataBufferInt var4 = new DataBufferInt(super.field578, super.field578.length);
      DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(super.field579, super.field580), var4, (Point)null);
      this.field1278 = new BufferedImage(var5, var6, false, new Hashtable());
      this.method796(var3);
      this.method264();
   }

   @ObfInfo(
      owner = "at",
      name = "h",
      desc = "(Ljava/awt/Component;I)V"
   )
   final void method796(Component var1) {
      this.field1279 = var1;
   }

   @ObfInfo(
      owner = "at",
      name = "e",
      desc = "(IIB)V"
   )
   public final void method263(int var1, int var2) {
      this.method797(this.field1279.getGraphics(), var1, var2);
   }

   @ObfInfo(
      owner = "at",
      name = "v",
      desc = "(IIIIB)V"
   )
   public final void method262(int var1, int var2, int var3, int var4) {
      this.method795(this.field1279.getGraphics(), var1, var2, var3, var4);
   }

   @ObfInfo(
      owner = "at",
      name = "x",
      desc = "(Ljava/awt/Graphics;IIB)V"
   )
   final void method797(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.field1278, var2, var3, this.field1279);
      } catch (Exception var6) {
         this.field1279.repaint();
      }

   }

   @ObfInfo(
      owner = "at",
      name = "m",
      desc = "(Ljava/awt/Graphics;IIIIS)V"
   )
   final void method795(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var7 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.field1278, 0, 0, this.field1279);
         var1.setClip(var7);
      } catch (Exception var8) {
         this.field1279.repaint();
      }

   }
}
