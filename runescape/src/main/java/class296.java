import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class class296 {
	static Calendar field3601;
	static final String[] field3603;
	static final String[][] field3602;

	static {
		field3602 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil", "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
		field3603 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		Calendar.getInstance();
		field3601 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	class296() throws Throwable {
		throw new Error();
	}

	public static String method2763(long var0) {
		field3601.setTime(new Date(var0));
		int var2 = field3601.get(7);
		int var3 = field3601.get(5);
		int var4 = field3601.get(2);
		int var5 = field3601.get(1);
		int var6 = field3601.get(11);
		int var7 = field3601.get(12);
		int var8 = field3601.get(13);
		return field3603[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field3602[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
	}
}
