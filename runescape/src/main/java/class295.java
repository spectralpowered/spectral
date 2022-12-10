import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class class295 {
	boolean field3576;
	boolean field3580;
	boolean field3583;
	class304 field3598;
	class304 field3599;
	class385 field3570;
	class385 field3578;
	int field3569;
	int field3571;
	int field3572;
	int field3573;
	int field3579;
	int field3584;
	int field3585;
	int field3586;
	int field3587;
	int field3588;
	int field3589;
	int field3590;
	int field3593;
	int field3594;
	int field3595;

	class295() {
		this.field3578 = new class385();
		this.field3570 = new class385();
		this.field3580 = false;
		this.field3576 = true;
		this.field3595 = 0;
		this.field3583 = false;
		this.field3584 = 0;
		this.field3585 = 0;
		this.field3586 = 0;
		this.field3579 = 0;
		this.field3588 = 0;
		this.field3589 = 0;
		this.field3590 = 0;
		this.field3587 = Integer.MAX_VALUE;
		this.field3571 = Integer.MAX_VALUE;
		this.field3573 = Integer.MAX_VALUE;
		this.field3594 = 0;
		this.field3593 = 0;
		this.field3572 = 0;
		this.field3569 = 0;
		this.field3578.method7203(1);
		this.field3570.method7203(1);
	}

	void method5679() {
		this.field3595 = (this.field3595 + 1) % 60;
		if (this.field3590 > 0) {
			--this.field3590;
		}

	}

	public boolean method5680(boolean var1) {
		var1 = var1 && this.field3576;
		boolean var3 = var1 != this.field3580;
		this.field3580 = var1;
		if (!this.field3580) {
			this.method5704(this.field3579, this.field3579);
		}

		return var3;
	}

	public void method5681(boolean var1) {
		this.field3576 = var1;
		this.field3580 = var1 && this.field3580;
	}

	boolean method5682(String var1) {
		String var3 = this.field3578.method7171();
		if (!var3.equals(var1)) {
			var1 = this.method5748(var1);
			this.field3578.method7131(var1);
			this.method5689(this.field3572, this.field3569);
			this.method5720();
			this.method5757();
			return true;
		} else {
			return false;
		}
	}

	boolean method5924(String var1) {
		this.field3570.method7131(var1);
		return true;
	}

	boolean method5684(class369 var1) {
		boolean var3 = !this.field3583;
		this.field3578.method7188(var1);
		this.field3570.method7188(var1);
		this.field3583 = true;
		var3 |= this.method5689(this.field3572, this.field3569);
		var3 |= this.method5704(this.field3588, this.field3579);
		if (this.method5720()) {
			this.method5757();
			var3 = true;
		}

		return var3;
	}

	public boolean method5685(int var1, int var2) {
		boolean var4 = var1 != this.field3594 || this.field3593 != var2;
		this.field3594 = var1;
		this.field3593 = var2;
		var4 |= this.method5689(this.field3572, this.field3569);
		return var4;
	}

	public boolean method5686(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var3 = var1 == this.field3578.method7142();
		this.field3578.method7122(var1, true);
		this.field3570.method7122(var1, true);
		if (this.method5720()) {
			this.method5757();
			var3 = true;
		}

		return var3;
	}

	public boolean method5687(int var1) {
		if (var1 < 0) {
			this.field3587 = Integer.MAX_VALUE;
		} else {
			this.field3587 = var1;
		}

		if (this.method5720()) {
			this.method5757();
			return true;
		} else {
			return false;
		}
	}

	public boolean method5688(int var1) {
		this.field3573 = var1;
		if (this.method5720()) {
			this.method5757();
			return true;
		} else {
			return false;
		}
	}

	public boolean method5689(int var1, int var2) {
		if (!this.method5862()) {
			this.field3572 = var1;
			this.field3569 = var2;
			return false;
		} else {
			int var4 = this.field3572;
			int var5 = this.field3569;
			int var6 = Math.max(0, this.field3578.method7137() - this.field3594 + 2);
			int var7 = Math.max(0, this.field3578.method7220() - this.field3593 + 1);
			this.field3572 = Math.max(0, Math.min(var6, var1));
			this.field3569 = Math.max(0, Math.min(var7, var2));
			return this.field3572 != var4 || this.field3569 != var5;
		}
	}

	public boolean method5690(int var1, int var2) {
		return true;
	}

	public void method5691(int var1) {
		this.field3578.method7197(var1);
	}

	public void method5692(int var1) {
		this.field3584 = var1;
	}

	public void method5815(int var1) {
		this.field3578.method7203(var1);
	}

	public void method5741(int var1) {
		this.field3578.method7123(var1);
	}

	public boolean method5844(int var1) {
		this.field3586 = var1;
		String var3 = this.field3578.method7171();
		int var4 = var3.length();
		var3 = this.method5748(var3);
		if (var3.length() != var4) {
			this.field3578.method7131(var3);
			this.method5689(this.field3572, this.field3569);
			this.method5720();
			this.method5757();
			return true;
		} else {
			return false;
		}
	}

	public void method5696() {
		this.field3583 = false;
	}

	public boolean method5697(int var1) {
		if (this.method5729(var1)) {
			this.method5702();
			class389 var3 = this.field3578.method7128((char)var1, this.field3579, this.field3571, this.field3587);
			this.method5704(var3.method7239(), var3.method7239());
			this.method5720();
			this.method5757();
		}

		return true;
	}

	public void method5698() {
		if (!this.method5702() && this.field3579 > 0) {
			int var2 = this.field3578.method7133(this.field3579 - 1);
			this.method5757();
			this.method5704(var2, var2);
		}

	}

	public void method5699() {
		if (!this.method5702() && this.field3579 < this.field3578.method7121()) {
			int var2 = this.field3578.method7133(this.field3579);
			this.method5757();
			this.method5704(var2, var2);
		}

	}

	public void method5700() {
		if (!this.method5702() && this.field3579 > 0) {
			class423 var2 = this.method5750(this.field3579 - 1);
			int var3 = this.field3578.method7126((Integer)var2.field4726, this.field3579);
			this.method5757();
			this.method5704(var3, var3);
		}

	}

	public void method5701() {
		if (!this.method5702() && this.field3579 < this.field3578.method7121()) {
			class423 var2 = this.method5750(this.field3579);
			int var3 = this.field3578.method7126(this.field3579, (Integer)var2.field4724);
			this.method5757();
			this.method5704(var3, var3);
		}

	}

	boolean method5702() {
		if (!this.method5747()) {
			return false;
		} else {
			int var2 = this.field3578.method7126(this.field3588, this.field3579);
			this.method5757();
			this.method5704(var2, var2);
			return true;
		}
	}

	public void method5916() {
		this.method5704(0, this.field3578.method7121());
	}

	public boolean method5704(int var1, int var2) {
		if (!this.method5862()) {
			this.field3588 = var1;
			this.field3579 = var2;
			return false;
		} else {
			if (var1 > this.field3578.method7121()) {
				var1 = this.field3578.method7121();
			}

			if (var2 > this.field3578.method7121()) {
				var2 = this.field3578.method7121();
			}

			boolean var4 = this.field3588 != var1 || this.field3579 != var2;
			this.field3588 = var1;
			if (var2 != this.field3579) {
				this.field3579 = var2;
				this.field3595 = 0;
				this.method5755();
			}

			if (var4 && this.field3599 != null) {
				this.field3599.method6088();
			}

			return var4;
		}
	}

	public void method5943(boolean var1) {
		class423 var3 = this.method5837(this.field3579);
		this.method5912((Integer)var3.field4726, var1);
	}

	public void method5706(boolean var1) {
		class423 var3 = this.method5837(this.field3579);
		this.method5912((Integer)var3.field4724, var1);
	}

	public void method5707(boolean var1) {
		this.method5912(0, var1);
	}

	public void method5708(boolean var1) {
		this.method5912(this.field3578.method7121(), var1);
	}

	public void method5709(boolean var1) {
		if (this.method5747() && !var1) {
			this.method5912(Math.min(this.field3588, this.field3579), var1);
		} else if (this.field3579 > 0) {
			this.method5912(this.field3579 - 1, var1);
		}

	}

	public void method5710(boolean var1) {
		if (this.method5747() && !var1) {
			this.method5912(Math.max(this.field3588, this.field3579), var1);
		} else if (this.field3579 < this.field3578.method7121()) {
			this.method5912(this.field3579 + 1, var1);
		}

	}

	public void method5711(boolean var1) {
		if (this.field3579 > 0) {
			class423 var3 = this.method5750(this.field3579 - 1);
			this.method5912((Integer)var3.field4726, var1);
		}

	}

	public void method5703(boolean var1) {
		if (this.field3579 < this.field3578.method7121()) {
			class423 var3 = this.method5750(1 + this.field3579);
			this.method5912((Integer)var3.field4724, var1);
		}

	}

	public void method5828(boolean var1) {
		if (this.field3579 > 0) {
			this.method5912(this.field3578.method7136(this.field3579, -1), var1);
		}

	}

	public void method5735(boolean var1) {
		if (this.field3579 < this.field3578.method7121()) {
			this.method5912(this.field3578.method7136(this.field3579, 1), var1);
		}

	}

	public void method5715(boolean var1) {
		if (this.field3579 > 0) {
			int var3 = this.method5754();
			this.method5912(this.field3578.method7136(this.field3579, -var3), var1);
		}

	}

	public void method5716(boolean var1) {
		if (this.field3579 < this.field3578.method7121()) {
			int var3 = this.method5754();
			this.method5912(this.field3578.method7136(this.field3579, var3), var1);
		}

	}

	public void method5717(boolean var1) {
		class365 var3 = this.field3578.method7172(0, this.field3579);
		class423 var4 = var3.method6789();
		this.method5912(this.field3578.method7135((Integer)var4.field4726, this.field3569), var1);
	}

	public void method5718(boolean var1) {
		class365 var3 = this.field3578.method7172(0, this.field3579);
		class423 var4 = var3.method6789();
		this.method5912(this.field3578.method7135((Integer)var4.field4726, this.field3593 + this.field3569), var1);
	}

	public void method5719(int var1, int var2, boolean var3, boolean var4) {
		boolean var6 = false;
		int var9;
		if (!this.field3583) {
			var9 = 0;
		} else {
			var1 += this.field3572;
			var2 += this.field3569;
			var9 = this.field3578.method7135(var1, var2);
		}

		class423 var7;
		if (var3 && var4) {
			this.field3585 = 1;
			var7 = this.method5750(var9);
			class423 var8 = this.method5750(this.field3589);
			this.method5858(var8, var7);
		} else if (var3) {
			this.field3585 = 1;
			var7 = this.method5750(var9);
			this.method5704((Integer)var7.field4726, (Integer)var7.field4724);
			this.field3589 = (Integer)var7.field4726;
		} else if (var4) {
			this.method5704(this.field3589, var9);
		} else {
			if (this.field3590 > 0 && var9 == this.field3589) {
				if (this.field3588 == this.field3579) {
					this.field3585 = 1;
					var7 = this.method5750(var9);
					this.method5704((Integer)var7.field4726, (Integer)var7.field4724);
				} else {
					this.field3585 = 2;
					var7 = this.method5837(var9);
					this.method5704((Integer)var7.field4726, (Integer)var7.field4724);
				}
			} else {
				this.field3585 = 0;
				this.method5704(var9, var9);
				this.field3589 = var9;
			}

			this.field3590 = 25;
		}

	}

	public void method5902(int var1, int var2) {
		if (this.field3583 && this.method5763()) {
			var1 += this.field3572;
			var2 += this.field3569;
			int var4 = this.field3578.method7135(var1, var2);
			class423 var5;
			class423 var6;
			switch(this.field3585) {
			case 0:
				this.method5704(this.field3588, var4);
				break;
			case 1:
				var5 = this.method5750(this.field3589);
				var6 = this.method5750(var4);
				this.method5858(var5, var6);
				break;
			case 2:
				var5 = this.method5837(this.field3589);
				var6 = this.method5837(var4);
				this.method5858(var5, var6);
			}
		}

	}

	public void method5834(Clipboard var1) {
		class365 var3 = this.field3578.method7172(this.field3588, this.field3579);
		if (!var3.method6785()) {
			String var4 = var3.method6806();
			if (!var4.isEmpty()) {
				var1.setContents(new StringSelection(var4), (ClipboardOwner)null);
			}
		}

	}

	public void method5722(Clipboard var1) {
		if (this.method5747()) {
			this.method5834(var1);
			this.method5702();
		}

	}

	public void method5723(Clipboard var1) {
		Transferable var3 = var1.getContents((Object)null);
		if (null != var3 && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var4 = this.method5748((String)var3.getTransferData(DataFlavor.stringFlavor));
				this.method5702();
				class389 var5 = this.field3578.method7129(var4, this.field3579, this.field3571, this.field3587);
				this.method5704(var5.method7239(), var5.method7239());
				this.method5720();
				this.method5757();
			} catch (Exception var6) {
				System.out.println("Error pasting clipboard to InputField.");
			}
		}

	}

	public void method5724() {
		this.field3569 = Math.max(0, this.field3569 - this.field3578.method7211());
	}

	public void method5801() {
		int var2 = Math.max(0, this.field3578.method7220() - this.field3593);
		this.field3569 = Math.min(var2, this.field3569 + this.field3578.method7211());
	}

	public void method5726(class304 var1) {
		this.field3598 = var1;
	}

	public void method5727(class304 var1) {
		this.field3599 = var1;
	}

	public class385 method5804() {
		return this.field3578;
	}

	public class385 method5693() {
		return this.field3570;
	}

	public class365 method5730() {
		return this.field3578.method7172(this.field3588, this.field3579);
	}

	public boolean method5763() {
		return this.field3580;
	}

	public boolean method5678() {
		return this.field3576;
	}

	public boolean method5733() {
		return this.method5763() && this.field3595 % 60 < 30;
	}

	public int method5734() {
		return this.field3579;
	}

	public int method5713() {
		return this.field3588;
	}

	public boolean method5862() {
		return this.field3583;
	}

	public int method5737() {
		return this.field3572;
	}

	public int method5738() {
		return this.field3569;
	}

	public int method5739() {
		return this.field3578.method7142();
	}

	public int method5740() {
		return this.field3587;
	}

	public int method5911() {
		return this.field3573;
	}

	public int method5742() {
		return this.field3584;
	}

	public int method5854() {
		return this.field3578.method7143();
	}

	public int method5744() {
		return this.field3586;
	}

	public int method5824() {
		return this.field3578.method7184();
	}

	public boolean method5746() {
		return this.field3587 > 1;
	}

	boolean method5747() {
		return this.field3579 != this.field3588;
	}

	String method5748(String var1) {
		StringBuilder var3 = new StringBuilder(var1.length());

		for (int var4 = 0; var4 < var1.length(); ++var4) {
			char var5 = var1.charAt(var4);
			if (this.method5729(var5)) {
				var3.append(var5);
			}
		}

		return var3.toString();
	}

	void method5858(class423 var1, class423 var2) {
		if ((Integer)var2.field4726 < (Integer)var1.field4726) {
			this.method5704((Integer)var1.field4724, (Integer)var2.field4726);
		} else {
			this.method5704((Integer)var1.field4726, (Integer)var2.field4724);
		}

	}

	class423 method5750(int var1) {
		int var3 = this.field3578.method7121();
		int var4 = 0;
		int var5 = var3;

		int var6;
		for (var6 = var1; var6 > 0; --var6) {
			if (this.method5829(this.field3578.method7118(var6 - 1).field4464)) {
				var4 = var6;
				break;
			}
		}

		for (var6 = var1; var6 < var3; ++var6) {
			if (this.method5829(this.field3578.method7118(var6).field4464)) {
				var5 = var6;
				break;
			}
		}

		return new class423(var4, var5);
	}

	class423 method5837(int var1) {
		int var3 = this.field3578.method7121();
		int var4 = 0;
		int var5 = var3;

		int var6;
		for (var6 = var1; var6 > 0; --var6) {
			if (this.field3578.method7118(var6 - 1).field4464 == '\n') {
				var4 = var6;
				break;
			}
		}

		for (var6 = var1; var6 < var3; ++var6) {
			if (this.field3578.method7118(var6).field4464 == '\n') {
				var5 = var6;
				break;
			}
		}

		return new class423(var4, var5);
	}

	boolean method5720() {
		if (!this.method5862()) {
			return false;
		} else {
			boolean var2 = false;
			if (this.field3578.method7121() > this.field3573) {
				this.field3578.method7126(this.field3573, this.field3578.method7121());
				var2 = true;
			}

			int var3;
			if (this.field3578.method7213() > this.field3587) {
				var3 = this.field3578.method7136(0, this.field3587) - 1;
				this.field3578.method7126(var3, this.field3578.method7121());
				var2 = true;
			}

			if (var2) {
				var3 = this.field3579;
				int var4 = this.field3588;
				int var5 = this.field3578.method7121();
				if (this.field3579 > var5) {
					var3 = var5;
				}

				if (this.field3588 > var5) {
					var4 = var5;
				}

				this.method5704(var4, var3);
			}

			return var2;
		}
	}

	void method5912(int var1, boolean var2) {
		if (var2) {
			this.method5704(this.field3588, var1);
		} else {
			this.method5704(var1, var1);
		}

	}

	int method5754() {
		return this.field3593 / this.field3578.method7211();
	}

	void method5755() {
		class365 var2 = this.field3578.method7172(0, this.field3579);
		class423 var3 = var2.method6789();
		int var4 = this.field3578.method7211();
		int var5 = (Integer)var3.field4726 - 10;
		int var6 = var5 + 20;
		int var7 = (Integer)var3.field4724 - 3;
		int var8 = var7 + 6 + var4;
		int var9 = this.field3572;
		int var10 = var9 + this.field3594;
		int var11 = this.field3569;
		int var12 = this.field3593 + var11;
		int var13 = this.field3572;
		int var14 = this.field3569;
		if (var5 < var9) {
			var13 = var5;
		} else if (var6 > var10) {
			var13 = var6 - this.field3594;
		}

		if (var7 < var11) {
			var14 = var7;
		} else if (var8 > var12) {
			var14 = var8 - this.field3593;
		}

		this.method5689(var13, var14);
	}

	boolean method5829(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	void method5757() {
		if (this.field3598 != null) {
			this.field3598.method6088();
		}

	}

	boolean method5729(int var1) {
		switch(this.field3586) {
		case 1:
			return class196.method3876((char)var1);
		case 2:
			return class215.method4366((char)var1);
		case 3:
			return class251.method4969((char)var1);
		case 4:
			char var3 = (char)var1;
			if (class251.method4969(var3)) {
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
