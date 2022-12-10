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

public final class class46 extends class481 {
	Component field340;
	Image field339;

	class46(int var1, int var2, Component var3) {
		super.field5019 = var1;
		super.field5020 = var2;
		super.field5018 = new int[1 + var2 * var1];
		DataBufferInt var4 = new DataBufferInt(super.field5018, super.field5018.length);
		DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(super.field5019, super.field5020), var4, (Point)null);
		this.field339 = new BufferedImage(var5, var6, false, new Hashtable());
		this.method901(var3);
		this.method8765();
	}

	final void method901(Component var1) {
		this.field340 = var1;
	}

	public final void method8762(int var1, int var2) {
		this.method904(this.field340.getGraphics(), var1, var2);
	}

	public final void method8760(int var1, int var2, int var3, int var4) {
		this.method900(this.field340.getGraphics(), var1, var2, var3, var4);
	}

	final void method904(Graphics var1, int var2, int var3) {
		try {
			var1.drawImage(this.field339, var2, var3, this.field340);
		} catch (Exception var6) {
			this.field340.repaint();
		}

	}

	final void method900(Graphics var1, int var2, int var3, int var4, int var5) {
		try {
			Shape var7 = var1.getClip();
			var1.clipRect(var2, var3, var4, var5);
			var1.drawImage(this.field339, 0, 0, this.field340);
			var1.setClip(var7);
		} catch (Exception var8) {
			this.field340.repaint();
		}

	}
}
