import java.util.Calendar;
import java.util.TimeZone;

@ObfInfo(
   name = "kj"
)
public class class482 {
   @ObfInfo(
      owner = "kj",
      name = "v",
      desc = "Ljava/util/Calendar;"
   )
   static Calendar field4019;
   @ObfInfo(
      owner = "kj",
      name = "e",
      desc = "[Ljava/lang/String;"
   )
   static final String[] field4021 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
   @ObfInfo(
      owner = "kj",
      name = "h",
      desc = "[[Ljava/lang/String;"
   )
   static final String[][] field4020 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};

   static {
      Calendar.getInstance();
      field4019 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   }
}
