import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.Future;
import netscape.javascript.JSObject;

public final class client extends class40 implements class378, OAuthApi {
	public static boolean field1691;
	public static class185 field1929;
	public static int field1697;
	public static int field1864;
	public static int field1971;
	public static int field1983;
	public static final class109 field1748;
	static boolean field1699;
	static boolean field1711;
	static boolean field1721;
	static boolean field1727;
	static boolean field1737;
	static boolean field1743;
	static boolean field1750;
	static boolean field1759;
	static boolean field1767;
	static boolean field1780;
	static boolean field1785;
	static boolean field1812;
	static boolean field1815;
	static boolean field1837;
	static boolean field1847;
	static boolean field1849;
	static boolean field1850;
	static boolean field1853;
	static boolean field1856;
	static boolean field1857;
	static boolean field1871;
	static boolean field1883;
	static boolean field1886;
	static boolean field1910;
	static boolean field1922;
	static boolean field1927;
	static boolean field1930;
	static boolean field1946;
	static boolean field1953;
	static boolean field1954;
	static boolean[] field1826;
	static boolean[] field1846;
	static boolean[] field1913;
	static boolean[] field1914;
	static boolean[] field1915;
	static boolean[] field1955;
	static byte[] field1742;
	static class104 field1715;
	static class104 field1936;
	static class146[] field1935;
	static class150 field1722;
	static class170[] field1814;
	static class184 field1754;
	static class205[] field1758;
	static class282 field1906;
	static class282 field1981;
	static class290 field1868;
	static class290 field1875;
	static class290 field1876;
	static class290 field1879;
	static class290 field1951;
	static class301 field1733;
	static class355 field1764;
	static class355 field1821;
	static class355 field1831;
	static class355 field1907;
	static class355 field1908;
	static class355 field1909;
	static class355 field1919;
	static class355[][][] field1829;
	static class364[] field1898;
	static class372 field1694;
	static class373 field1753;
	static class37[] field1757;
	static class420 field1724;
	static class458 field1740;
	static class458 field1863;
	static class472 field1687;
	static class476 field1822;
	static class491[] field1941;
	static class54 field1738;
	static class59 field1978;
	static class85[] field1934;
	static class88[] field1816;
	static int field1688;
	static int field1689;
	static int field1690;
	static int field1693;
	static int field1695;
	static int field1696;
	static int field1698;
	static int field1700;
	static int field1701;
	static int field1702;
	static int field1703;
	static int field1706;
	static int field1707;
	static int field1708;
	static int field1709;
	static int field1710;
	static int field1712;
	static int field1713;
	static int field1714;
	static int field1717;
	static int field1718;
	static int field1719;
	static int field1720;
	static int field1723;
	static int field1726;
	static int field1734;
	static int field1735;
	static int field1744;
	static int field1745;
	static int field1746;
	static int field1749;
	static int field1751;
	static int field1756;
	static int field1763;
	static int field1765;
	static int field1766;
	static int field1768;
	static int field1769;
	static int field1770;
	static int field1771;
	static int field1773;
	static int field1774;
	static int field1775;
	static int field1776;
	static int field1777;
	static int field1778;
	static int field1779;
	static int field1781;
	static int field1782;
	static int field1783;
	static int field1784;
	static int field1786;
	static int field1788;
	static int field1792;
	static int field1795;
	static int field1796;
	static int field1798;
	static int field1800;
	static int field1801;
	static int field1804;
	static int field1806;
	static int field1807;
	static int field1808;
	static int field1809;
	static int field1810;
	static int field1811;
	static int field1813;
	static int field1817;
	static int field1820;
	static int field1828;
	static int field1830;
	static int field1833;
	static int field1838;
	static int field1840;
	static int field1841;
	static int field1842;
	static int field1845;
	static int field1851;
	static int field1852;
	static int field1855;
	static int field1858;
	static int field1859;
	static int field1862;
	static int field1865;
	static int field1866;
	static int field1867;
	static int field1869;
	static int field1870;
	static int field1873;
	static int field1874;
	static int field1877;
	static int field1878;
	static int field1880;
	static int field1881;
	static int field1882;
	static int field1885;
	static int field1887;
	static int field1889;
	static int field1891;
	static int field1892;
	static int field1893;
	static int field1895;
	static int field1896;
	static int field1897;
	static int field1899;
	static int field1901;
	static int field1902;
	static int field1903;
	static int field1905;
	static int field1911;
	static int field1912;
	static int field1918;
	static int field1924;
	static int field1925;
	static int field1928;
	static int field1931;
	static int field1937;
	static int field1938;
	static int field1942;
	static int field1943;
	static int field1944;
	static int field1945;
	static int field1947;
	static int field1950;
	static int field1959;
	static int field1961;
	static int field1968;
	static int field1969;
	static int field1970;
	static int field1972;
	static int field1973;
	static int field1974;
	static int field1975;
	static int field1980;
	static int field1982;
	static int field1986;
	static int field1989;
	static int field1990;
	static int[] field1716;
	static int[] field1747;
	static int[] field1762;
	static int[] field1789;
	static int[] field1790;
	static int[] field1791;
	static int[] field1793;
	static int[] field1794;
	static int[] field1799;
	static int[] field1802;
	static int[] field1803;
	static int[] field1818;
	static int[] field1823;
	static int[] field1827;
	static int[] field1832;
	static int[] field1834;
	static int[] field1835;
	static int[] field1839;
	static int[] field1843;
	static int[] field1884;
	static int[] field1888;
	static int[] field1890;
	static int[] field1894;
	static int[] field1900;
	static int[] field1904;
	static int[] field1916;
	static int[] field1917;
	static int[] field1923;
	static int[] field1932;
	static int[] field1933;
	static int[] field1939;
	static int[] field1940;
	static int[] field1948;
	static int[] field1949;
	static int[] field1956;
	static int[] field1957;
	static int[] field1958;
	static int[] field1964;
	static int[] field1967;
	static int[] field1976;
	static int[] field1977;
	static int[] field1985;
	static int[] field1988;
	static int[][] field1797;
	static int[][][] field1760;
	static String field1860;
	static String field1926;
	static String field1952;
	static String field1979;
	static String[] field1725;
	static String[] field1787;
	static String[] field1825;
	static String[] field1844;
	static ArrayList field1984;
	static HashMap field1752;
	static long field1704;
	static long field1819;
	static long field1861;
	static long field1920;
	static long field1921;
	static long[] field1705;
	static short field1692;
	static short field1732;
	static short field1854;
	static short field1872;
	static short field1960;
	static short field1962;
	static short field1965;
	static short field1966;
	static final class76 field1987;
	static final int[] field1761;
	static final int[] field1824;
	static final String field1736;
	boolean field1772;
	class14 field1728;
	class18 field1755;
	class20 field1729;
	class20 field1836;
	class467 field1739;
	OtlTokenRequester field1730;
	RefreshAccessTokenRequester field1848;
	String field1963;
	Future field1731;
	Future field1805;
	long field1741;

	public client() {
		this.field1772 = false;
		this.field1741 = -1L;
	}

	static {
		field1856 = true;
		field1864 = 1;
		field1777 = 0;
		field1690 = 0;
		field1691 = false;
		field1743 = false;
		field1693 = -1;
		field1784 = -1;
		field1880 = -1;
		field1930 = false;
		field1697 = 210;
		field1698 = 0;
		field1699 = true;
		field1700 = 0;
		field1920 = -1L;
		field1702 = -1;
		field1734 = -1;
		field1704 = -1L;
		field1767 = true;
		field1706 = 0;
		field1707 = 0;
		field1708 = 0;
		field1776 = 0;
		field1710 = 0;
		field1751 = 0;
		field1712 = 0;
		field1713 = 0;
		field1808 = 0;
		field1715 = class104.field1075;
		field1936 = class104.field1075;
		field1717 = 0;
		field1718 = 0;
		field1719 = 0;
		field1720 = 0;
		field1689 = 0;
		field1830 = 0;
		field1723 = 0;
		field1709 = 0;
		field1722 = class150.field1440;
		field1822 = class476.field5005;
		int var1 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		field1736 = class197.method3890(var2);
		field1737 = false;
		field1738 = new class54();
		field1742 = null;
		field1934 = new class85[65536];
		field1744 = 0;
		field1900 = new int[65536];
		field1746 = 0;
		field1747 = new int[250];
		field1748 = new class109();
		field1749 = 0;
		field1750 = false;
		field1694 = new class372();
		field1752 = new HashMap();
		field1783 = 0;
		field1937 = 1;
		field1968 = 0;
		field1756 = 1;
		field1840 = 0;
		field1758 = new class205[4];
		field1759 = false;
		field1760 = new int[4][13][13];
		field1761 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field1745 = 0;
		field1901 = 2301979;
		field1833 = 5063219;
		field1714 = 3353893;
		field1766 = 7759444;
		field1871 = false;
		field1768 = 0;
		field1769 = 128;
		field1770 = 0;
		field1771 = 0;
		field1845 = 0;
		field1773 = 0;
		field1774 = 0;
		field1775 = 0;
		field1931 = 50;
		field1820 = 0;
		field1778 = 0;
		field1779 = 0;
		field1842 = 12;
		field1781 = 6;
		field1971 = 0;
		field1711 = false;
		field1989 = 0;
		field1785 = false;
		field1786 = 0;
		field1943 = 0;
		field1788 = 50;
		field1789 = new int[field1788];
		field1790 = new int[field1788];
		field1791 = new int[field1788];
		field1976 = new int[field1788];
		field1793 = new int[field1788];
		field1794 = new int[field1788];
		field1884 = new int[field1788];
		field1787 = new String[field1788];
		field1797 = new int[104][104];
		field1798 = 0;
		field1905 = -1;
		field1726 = -1;
		field1763 = 0;
		field1696 = 0;
		field1782 = 0;
		field1804 = 0;
		field1721 = true;
		field1806 = 0;
		field1807 = 0;
		field1800 = 0;
		field1809 = 0;
		field1810 = 0;
		field1980 = 0;
		field1812 = false;
		field1813 = 0;
		field1873 = 0;
		field1815 = true;
		field1816 = new class88[2048];
		field1817 = -1;
		field1874 = 0;
		field1819 = -1L;
		field1727 = true;
		field1918 = 0;
		field1961 = 0;
		field1823 = new int[1000];
		field1824 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		field1825 = new String[8];
		field1826 = new boolean[8];
		field1827 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		field1828 = -1;
		field1829 = new class355[4][104][104];
		field1919 = new class355();
		field1831 = new class355();
		field1821 = new class355();
		field1762 = new int[25];
		field1834 = new int[25];
		field1835 = new int[25];
		field1780 = false;
		field1837 = false;
		field1838 = 0;
		field1839 = new int[500];
		field1832 = new int[500];
		field1932 = new int[500];
		field1802 = new int[500];
		field1843 = new int[500];
		field1844 = new String[500];
		field1725 = new String[500];
		field1846 = new boolean[500];
		field1847 = false;
		field1853 = false;
		field1849 = false;
		field1850 = true;
		field1851 = -1;
		field1852 = -1;
		field1735 = 0;
		field1703 = 50;
		field1855 = 0;
		field1952 = null;
		field1857 = false;
		field1858 = -1;
		field1859 = -1;
		field1860 = null;
		field1979 = null;
		field1862 = -1;
		field1863 = new class458(8);
		field1973 = 0;
		field1865 = -1;
		field1866 = 0;
		field1867 = 0;
		field1868 = null;
		field1811 = 0;
		field1870 = 0;
		field1950 = 0;
		field1882 = -1;
		field1910 = false;
		field1951 = null;
		field1875 = null;
		field1876 = null;
		field1877 = 0;
		field1878 = 0;
		field1879 = null;
		field1927 = false;
		field1881 = -1;
		field1795 = -1;
		field1883 = false;
		field1701 = -1;
		field1885 = -1;
		field1886 = false;
		field1887 = 1;
		field1888 = new int[32];
		field1889 = 0;
		field1890 = new int[32];
		field1891 = 0;
		field1818 = new int[32];
		field1893 = 0;
		field1894 = new int[32];
		field1895 = 0;
		field1896 = 0;
		field1897 = 0;
		field1792 = 0;
		field1899 = 0;
		field1695 = 0;
		field1959 = 0;
		field1902 = 0;
		field1903 = 0;
		field1796 = 0;
		field1687 = new class472();
		field1764 = new class355();
		field1907 = new class355();
		field1908 = new class355();
		field1909 = new class355();
		field1740 = new class458(512);
		field1911 = 0;
		field1990 = -2;
		field1913 = new boolean[100];
		field1914 = new boolean[100];
		field1915 = new boolean[100];
		field1916 = new int[100];
		field1917 = new int[100];
		field1904 = new int[100];
		field1716 = new int[100];
		field1944 = 0;
		field1921 = 0L;
		field1922 = true;
		field1923 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		field1924 = 0;
		field1925 = 0;
		field1926 = "";
		field1705 = new long[100];
		field1928 = 0;
		field1929 = new class185();
		field1754 = new class184();
		field1892 = 0;
		field1956 = new int[128];
		field1933 = new int[128];
		field1861 = -1L;
		field1935 = new class146[4];
		field1814 = new class170[4];
		field1801 = -1;
		field1938 = 0;
		field1939 = new int[1000];
		field1940 = new int[1000];
		field1941 = new class491[1000];
		field1942 = 0;
		field1688 = 0;
		field1765 = 0;
		field1945 = -1;
		field1946 = false;
		field1947 = 0;
		field1948 = new int[50];
		field1949 = new int[50];
		field1977 = new int[50];
		field1803 = new int[50];
		field1757 = new class37[50];
		field1953 = false;
		field1954 = false;
		field1955 = new boolean[5];
		field1985 = new int[5];
		field1957 = new int[5];
		field1958 = new int[5];
		field1799 = new int[5];
		field1960 = 256;
		field1732 = 205;
		field1962 = 256;
		field1854 = 320;
		field1872 = 1;
		field1965 = 32767;
		field1966 = 1;
		field1692 = 32767;
		field1841 = 0;
		field1969 = 0;
		field1970 = 0;
		field1869 = 0;
		field1972 = 0;
		field1733 = new class301();
		field1974 = -1;
		field1975 = -1;
		field1724 = new class433();
		field1898 = new class364[8];
		field1978 = new class59();
		field1753 = new class373(8, class383.field4480);
		field1906 = new class282(64);
		field1981 = new class282(64);
		field1982 = -1;
		field1983 = -1;
		field1984 = new ArrayList(10);
		field1912 = 0;
		field1986 = 0;
		field1987 = new class76();
		field1988 = new int[50];
		field1967 = new int[50];
	}

	static class418 method3499() {
		return class166.field1548;
	}

	protected final void method549() {
	}

	public final void init() {
		if (this.method527()) {
			int var8;
			for (int var1 = 0; var1 <= 28; ++var1) {
				String var2 = this.getParameter(Integer.toString(var1));
				if (null != var2) {
					switch(var1) {
					case 3:
						if (var2.equalsIgnoreCase(class79.field724)) {
							field1691 = true;
						} else {
							field1691 = false;
						}
						break;
					case 4:
						if (field1784 == -1) {
							field1784 = Integer.parseInt(var2);
						}
						break;
					case 5:
						field1777 = Integer.parseInt(var2);
						break;
					case 6:
						int var4 = Integer.parseInt(var2);
						class340 var16;
						if (var4 >= 0 && var4 < class340.field4268.length) {
							var16 = class340.field4268[var4];
						} else {
							var16 = null;
						}

						class178.field1654 = var16;
						break;
					case 7:
						class356.field4322 = class1.method5(Integer.parseInt(var2));
						break;
					case 8:
						if (var2.equalsIgnoreCase(class79.field724)) {
						}
						break;
					case 9:
						class149.field1432 = var2;
						break;
					case 10:
						class335[] var3 = new class335[]{class335.field4222, class335.field4219, class335.field4220, class335.field4223, class335.field4221, class335.field4218};
						class268.field3153 = (class335)class78.method1584(var3, Integer.parseInt(var2));
						if (class268.field3153 == class335.field4223) {
							class54.field404 = class451.field4851;
						} else {
							class54.field404 = class451.field4857;
						}
						break;
					case 11:
						class19.field114 = var2;
						break;
					case 12:
						field1864 = Integer.parseInt(var2);
					case 13:
					case 16:
					case 18:
					case 19:
					case 20:
					case 22:
					case 23:
					case 24:
					default:
						break;
					case 14:
						class210.field2443 = Integer.parseInt(var2);
						break;
					case 15:
						field1690 = Integer.parseInt(var2);
						break;
					case 17:
						class2.field15 = var2;
						break;
					case 21:
						field1693 = Integer.parseInt(var2);
						break;
					case 25:
						var8 = var2.indexOf(".");
						if (var8 == -1) {
							field1697 = Integer.parseInt(var2);
						} else {
							field1697 = Integer.parseInt(var2.substring(0, var8));
							Integer.parseInt(var2.substring(var8 + 1));
						}
					}
				}
			}

			class51.method1010();
			class143.field1371 = this.getCodeBase().getHost();
			String var9 = class356.field4322.field4253;
			byte var10 = 0;

			try {
				class141.field1361 = 22;
				class268.field3160 = var10;

				try {
					class489.field5049 = System.getProperty("os.name");
				} catch (Exception var14) {
					class489.field5049 = "Unknown";
				}

				class77.field703 = class489.field5049.toLowerCase();

				try {
					class110.field1118 = System.getProperty("user.home");
					if (class110.field1118 != null) {
						class110.field1118 = class110.field1118 + "/";
					}
				} catch (Exception var13) {
				}

				try {
					if (class77.field703.startsWith("win")) {
						if (null == class110.field1118) {
							class110.field1118 = System.getenv("USERPROFILE");
						}
					} else if (null == class110.field1118) {
						class110.field1118 = System.getenv("HOME");
					}

					if (class110.field1118 != null) {
						class110.field1118 = class110.field1118 + "/";
					}
				} catch (Exception var12) {
				}

				if (null == class110.field1118) {
					class110.field1118 = "~/";
				}

				class121.field1210 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class110.field1118, "/tmp/", ""};
				class92.field885 = new String[]{".jagex_cache_" + class268.field3160, ".file_store_" + class268.field3160};

				label133:
				for (var8 = 0; var8 < 4; ++var8) {
					class267.field3148 = class161.method2728("oldschool", var9, var8);
					if (!class267.field3148.exists()) {
						class267.field3148.mkdirs();
					}

					File[] var11 = class267.field3148.listFiles();
					if (null == var11) {
						break;
					}

					File[] var5 = var11;
					int var6 = 0;

					while (true) {
						if (var6 >= var5.length) {
							break label133;
						}

						File var7 = var5[var6];
						if (!class251.method4967(var7, false)) {
							break;
						}

						++var6;
					}
				}

				class177.method2957(class267.field3148);
				class247.method4894();
				class163.field1510 = new class443(new class459(class292.method5655("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
				class163.field1512 = new class443(new class459(class292.method5655("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
				class163.field1518 = new class443[class141.field1361];

				for (var8 = 0; var8 < class141.field1361; ++var8) {
					class163.field1518[var8] = new class443(new class459(class292.method5655("main_file_cache.idx" + var8), "rw", 1048576L), 6000, 0);
				}
			} catch (Exception var15) {
				class150.method2660((String)null, var15);
			}

			class122.field1212 = this;
			class490.field5052 = field1784;
			if (field1880 == -1) {
				field1880 = 0;
			}

			class140.field1356 = System.getenv("JX_ACCESS_TOKEN");
			class197.field2224 = System.getenv("JX_REFRESH_TOKEN");
			if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
				this.field1772 = true;
			}

			this.method525(765, 503, 210, 1);
		}
	}

	boolean method3014() {
		return null != class140.field1356 && !class140.field1356.trim().isEmpty() && null != class197.field2224 && !class197.field2224.trim().isEmpty();
	}

	boolean method3015() {
		return null != this.field1730;
	}

	void method3413(String var1) throws IOException {
		HashMap var3 = new HashMap();
		var3.put("grant_type", "refresh_token");
		var3.put("scope", "gamesso.token.create");
		var3.put("refresh_token", var1);
		URL var4 = new URL(class19.field114 + "shield/oauth/token" + (new class430(var3)).method7958());
		HashMap var5 = new HashMap();
		var5.put("Authorization", "Basic " + field1736);
		var5.put("Host", (new URL(class19.field114)).getHost());
		var5.put("Accept", class424.field4727.method7922());
		class2 var6 = class2.field17;
		RefreshAccessTokenRequester var7 = this.field1848;
		if (null != var7) {
			this.field1805 = var7.request(var6.method8(), var4, var5, "");
		} else {
			class10 var8 = new class10(var4, var6, this.field1772);
			Iterator var9 = var5.entrySet().iterator();

			while (var9.hasNext()) {
				Entry var10 = (Entry)var9.next();
				var8.method118((String)var10.getKey(), (String)var10.getValue());
			}

			this.field1836 = this.field1728.method178(var8);
		}
	}

	void method3017(String var1) throws MalformedURLException, IOException {
		URL var3 = new URL(class19.field114 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		HashMap var4 = new HashMap();
		var4.put("Authorization", "Bearer " + var1);
		class2 var5 = class2.field7;
		OtlTokenRequester var6 = this.field1730;
		if (null != var6) {
			this.field1731 = var6.request(var5.method8(), var3, var4, "");
		} else {
			class10 var7 = new class10(var3, var5, this.field1772);
			Iterator var8 = var4.entrySet().iterator();

			while (var8.hasNext()) {
				Entry var9 = (Entry)var8.next();
				var7.method118((String)var9.getKey(), (String)var9.getValue());
			}

			this.field1729 = this.field1728.method178(var7);
		}
	}

	protected final void method622() {
		int[] var2 = new int[]{20, 260, 10000};
		int[] var3 = new int[]{1000, 100, 500};
		if (var2 != null && null != var3) {
			class209.field2424 = var2;
			class219.field2656 = new int[var2.length];
			class218.field2643 = new byte[var2.length][][];

			for (int var6 = 0; var6 < class209.field2424.length; ++var6) {
				class218.field2643[var6] = new byte[var3[var6]][];
				class370.field4421.add(var2[var6]);
			}

			Collections.sort(class370.field4421);
		} else {
			class209.field2424 = null;
			class219.field2656 = null;
			class218.field2643 = (byte[][][])null;
			class370.field4421.clear();
			class370.field4421.add(100);
			class370.field4421.add(5000);
			class370.field4421.add(10000);
			class370.field4421.add(30000);
		}

		class170.field1603 = 0 == field1690 ? 43594 : field1864 + 40000;
		class147.field1417 = 0 == field1690 ? 443 : field1864 + 50000;
		class47.field342 = class170.field1603;
		class103.field1067 = class312.field3714;
		class398.field4553 = class312.field3713;
		class198.field2229 = class312.field3719;
		class305.field3662 = class312.field3715;
		class172.field1625 = new class127(this.field1772, 210);
		this.method517();
		this.method557();
		class103.field1065 = this.method513();
		this.method519(field1754, 0);
		this.method519(field1929, 1);
		class254.field2980 = new class399(255, class163.field1510, class163.field1512, 500000);
		class186.field2040 = class331.method6269();
		this.method514();
		String var5 = class225.field2739;
		class44.field318 = this;
		if (null != var5) {
			class44.field319 = var5;
		}

		class82.method1636(class186.field2040.method1796());
		class405.field4602 = new class61(class54.field404);
		this.field1728 = new class14("tokenRequest", 1, 1);
	}

	protected final void method542() {
		++field1700;
		this.method3020();

		while (true) {
			class332 var2;
			synchronized(class318.field3746) {
				var2 = (class332)class318.field3743.method6575();
			}

			if (null == var2) {
				class230.method4665();
				method3406();
				field1929.method3564();
				this.method518();
				synchronized(class28.field152) {
					class28.field157 = class28.field151;
					class28.field158 = class28.field154;
					class28.field153 = class28.field155;
					class28.field160 = class28.field156;
					class28.field165 = class28.field161;
					class28.field166 = class28.field159;
					class28.field162 = class28.field170;
					class28.field148 = class28.field164;
					class28.field161 = 0;
				}

				if (class103.field1065 != null) {
					int var6 = class103.field1065.method2743();
					field1796 = var6;
				}

				if (field1698 == 0) {
					class84.method1651();
					class39.method506();
				} else if (field1698 == 5) {
					class180.method2990(this, class248.field2935);
					class84.method1651();
					class39.method506();
				} else if (10 != field1698 && 11 != field1698) {
					if (field1698 == 20) {
						class180.method2990(this, class248.field2935);
						this.method3023();
					} else if (field1698 == 50) {
						class180.method2990(this, class248.field2935);
						this.method3023();
					} else if (field1698 == 25) {
						class40.method685();
					}
				} else {
					class180.method2990(this, class248.field2935);
				}

				if (30 == field1698) {
					this.method3024();
				} else if (field1698 == 40 || field1698 == 45) {
					this.method3023();
				}

				return;
			}

			var2.field4179.method6210(var2.field4181, (int)var2.field4773, var2.field4180, false);
		}
	}

	protected final void method543(boolean var1) {
		boolean var3 = class38.method492();
		if (var3 && field1946 && class96.field938 != null) {
			class96.field938.method950();
		}

		if ((field1698 == 10 || field1698 == 20 || field1698 == 30) && 0L != field1921 && class74.method1493() > field1921) {
			class82.method1636(class74.method1502());
		}

		int var4;
		if (var1) {
			for (var4 = 0; var4 < 100; ++var4) {
				field1913[var4] = true;
			}
		}

		if (field1698 == 0) {
			this.method544(class73.field637, class73.field638, var1);
		} else if (field1698 == 5) {
			class184.method3561(class140.field1352, class136.field1339, class248.field2935);
		} else if (field1698 != 10 && field1698 != 11) {
			if (field1698 == 20) {
				class184.method3561(class140.field1352, class136.field1339, class248.field2935);
			} else if (field1698 == 50) {
				class184.method3561(class140.field1352, class136.field1339, class248.field2935);
			} else if (25 == field1698) {
				if (1 == field1840) {
					if (field1783 > field1937) {
						field1937 = field1783;
					}

					var4 = (field1937 * 50 - field1783 * 50) / field1937;
					class49.method940(class321.field3886 + class79.field725 + class79.field722 + var4 + "%" + class79.field726, false);
				} else if (field1840 == 2) {
					if (field1968 > field1756) {
						field1756 = field1968;
					}

					var4 = 50 + (field1756 * 50 - field1968 * 50) / field1756;
					class49.method940(class321.field3886 + class79.field725 + class79.field722 + var4 + "%" + class79.field726, false);
				} else {
					class49.method940(class321.field3886, false);
				}
			} else if (30 == field1698) {
				this.method3026();
			} else if (field1698 == 40) {
				class49.method940(class321.field3780 + class79.field725 + class321.field3764, false);
			} else if (45 == field1698) {
				class49.method940(class321.field3896, false);
			}
		} else {
			class184.method3561(class140.field1352, class136.field1339, class248.field2935);
		}

		if (30 == field1698 && 0 == field1944 && !var1 && !field1922) {
			for (var4 = 0; var4 < field1911; ++var4) {
				if (field1914[var4]) {
					class189.field2059.method8760(field1916[var4], field1917[var4], field1904[var4], field1716[var4]);
					field1914[var4] = false;
				}
			}
		} else if (field1698 > 0) {
			class189.field2059.method8762(0, 0);

			for (var4 = 0; var4 < field1911; ++var4) {
				field1914[var4] = false;
			}
		}

	}

	protected final void method654() {
		if (class254.field2979.method2252()) {
			class254.field2979.method2260();
		}

		if (null != class286.field3343) {
			class286.field3343.field941 = false;
		}

		class286.field3343 = null;
		field1748.method2155();
		if (null != class28.field152) {
			synchronized(class28.field152) {
				class28.field152 = null;
			}
		}

		class103.field1065 = null;
		if (null != class96.field938) {
			class96.field938.method951();
		}

		if (null != class123.field1217) {
			class123.field1217.method951();
		}

		class238.method4752();
		class188.method3621();
		if (class172.field1625 != null) {
			class172.field1625.method2229();
			class172.field1625 = null;
		}

		try {
			class163.field1510.method8028();

			for (int var4 = 0; var4 < class141.field1361; ++var4) {
				class163.field1518[var4].method8028();
			}

			class163.field1512.method8028();
			class163.field1515.method8028();
		} catch (Exception var6) {
		}

		this.field1728.method182();
	}

	void method3020() {
		if (1000 != field1698) {
			boolean var2 = class210.method4150();
			if (!var2) {
				this.method3021();
			}

		}
	}

	void method3021() {
		if (class334.field4217 >= 4) {
			this.method686("js5crc");
			class131.method2451(1000);
		} else {
			if (class334.field4203 >= 4) {
				if (field1698 <= 5) {
					this.method686("js5io");
					class131.method2451(1000);
					return;
				}

				field1719 = 3000;
				class334.field4203 = 3;
			}

			if (--field1719 + 1 <= 0) {
				try {
					if (field1718 == 0) {
						class348.field4283 = class245.field2906.method2912(class143.field1371, class47.field342);
						++field1718;
					}

					if (field1718 == 1) {
						if (class348.field4283.field1569 == 2) {
							this.method3022(-1);
							return;
						}

						if (class348.field4283.field1569 == 1) {
							++field1718;
						}
					}

					class467 var4;
					if (2 == field1718) {
						Socket var3 = (Socket)class348.field4283.field1573;
						class410 var2 = new class410(var3, 40000, 5000);
						class250.field2945 = var2;
						var4 = new class467(5);
						var4.method8323(15);
						var4.method8312(210);
						class250.field2945.method7605(var4.field4917, 0, 5);
						++field1718;
						class176.field1643 = class74.method1493();
					}

					if (field1718 == 3) {
						if (class250.field2945.method7606() > 0) {
							int var6 = class250.field2945.method7608();
							if (var6 != 0) {
								this.method3022(var6);
								return;
							}

							++field1718;
						} else if (class74.method1493() - class176.field1643 > 30000L) {
							this.method3022(-2);
							return;
						}
					}

					if (4 == field1718) {
						class411 var14 = class250.field2945;
						boolean var7 = field1698 > 20;
						if (class334.field4215 != null) {
							try {
								class334.field4215.method7609();
							} catch (Exception var12) {
							}

							class334.field4215 = null;
						}

						class334.field4215 = var14;
						if (null != class334.field4215) {
							try {
								var4 = new class467(4);
								var4.method8323(var7 ? 2 : 3);
								var4.method8516(0);
								class334.field4215.method7605(var4.field4917, 0, 4);
							} catch (IOException var11) {
								try {
									class334.field4215.method7609();
								} catch (Exception var10) {
								}

								++class334.field4203;
								class334.field4215 = null;
							}
						}

						class334.field4208.field4915 = 0;
						class198.field2231 = null;
						class356.field4309 = null;
						class334.field4196 = 0;

						while (true) {
							class316 var15 = (class316)class334.field4201.method8172();
							if (var15 == null) {
								while (true) {
									var15 = (class316)class334.field4206.method8172();
									if (var15 == null) {
										if (class334.field4212 != 0) {
											try {
												var4 = new class467(4);
												var4.method8323(4);
												var4.method8323(class334.field4212);
												var4.method8310(0);
												class334.field4215.method7605(var4.field4917, 0, 4);
											} catch (IOException var9) {
												try {
													class334.field4215.method7609();
												} catch (Exception var8) {
												}

												++class334.field4203;
												class334.field4215 = null;
											}
										}

										class334.field4214 = 0;
										class334.field4198 = class74.method1493();
										class348.field4283 = null;
										class250.field2945 = null;
										field1718 = 0;
										field1720 = 0;
										return;
									}

									class334.field4199.method6475(var15);
									class334.field4204.method8170(var15, var15.field4773);
									++class334.field4205;
									--class334.field4213;
								}
							}

							class334.field4207.method8170(var15, var15.field4773);
							++class334.field4200;
							--class334.field4202;
						}
					}
				} catch (IOException var13) {
					this.method3022(-3);
				}

			}
		}
	}

	void method3022(int var1) {
		class348.field4283 = null;
		class250.field2945 = null;
		field1718 = 0;
		if (class47.field342 == class170.field1603) {
			class47.field342 = class147.field1417;
		} else {
			class47.field342 = class170.field1603;
		}

		++field1720;
		if (field1720 >= 2 && (var1 == 7 || var1 == 9)) {
			if (field1698 <= 5) {
				this.method686("js5connect_full");
				class131.method2451(1000);
			} else {
				field1719 = 3000;
			}
		} else if (field1720 >= 2 && var1 == 6) {
			this.method686("js5connect_outofdate");
			class131.method2451(1000);
		} else if (field1720 >= 4) {
			if (field1698 <= 5) {
				this.method686("js5connect");
				class131.method2451(1000);
			} else {
				field1719 = 3000;
			}
		}

	}

	static void method163(class326 var0, String var1) {
		class95 var3 = new class95(var0, var1);
		field1984.add(var3);
		field1986 += var3.field926;
	}

	static int method1224() {
		if (null != field1984 && field1912 < field1984.size()) {
			int var1 = 0;

			for (int var2 = 0; var2 <= field1912; ++var2) {
				var1 += ((class95)field1984.get(var2)).field924;
			}

			return var1 * 10000 / field1986;
		} else {
			return 10000;
		}
	}

	final void method3023() {
		Object var2 = field1748.method2157();
		class466 var3 = field1748.field1106;

		try {
			if (0 == field1689) {
				if (class51.field382 == null && (field1738.method1044() || field1830 > 250)) {
					class51.field382 = field1738.method1045();
					field1738.method1043();
					field1738 = null;
				}

				if (null != class51.field382) {
					if (var2 != null) {
						((class411)var2).method7609();
						var2 = null;
					}

					class20.field116 = null;
					field1750 = false;
					field1830 = 0;
					if (field1822.method8645()) {
						try {
							this.method3413(class197.field2224);
							class38.method500(21);
						} catch (Throwable var26) {
							class150.method2660((String)null, var26);
							class44.method869(65);
							return;
						}
					} else {
						class38.method500(1);
					}
				}
			}

			class16 var29;
			if (21 == field1689) {
				if (this.field1805 != null) {
					if (!this.field1805.isDone()) {
						return;
					}

					if (this.field1805.isCancelled()) {
						class44.method869(65);
						this.field1805 = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse)this.field1805.get();
						if (!var4.isSuccess()) {
							class44.method869(65);
							this.field1805 = null;
							return;
						}

						class140.field1356 = var4.getAccessToken();
						class197.field2224 = var4.getRefreshToken();
						this.field1805 = null;
					} catch (Exception var25) {
						class150.method2660((String)null, var25);
						class44.method869(65);
						this.field1805 = null;
						return;
					}
				} else {
					if (this.field1836 == null) {
						class44.method869(65);
						return;
					}

					if (!this.field1836.method293()) {
						return;
					}

					if (this.field1836.method295()) {
						class150.method2660(this.field1836.method289(), (Throwable)null);
						class44.method869(65);
						this.field1836 = null;
						return;
					}

					var29 = this.field1836.method300();
					if (var29.method193() != 200) {
						class44.method869(65);
						this.field1836 = null;
						return;
					}

					field1830 = 0;
					class422 var5 = new class422(var29.method194());

					try {
						class140.field1356 = var5.method7908().getString("access_token");
						class197.field2224 = var5.method7908().getString("refresh_token");
					} catch (Exception var24) {
						class150.method2660("Error parsing tokens", var24);
						class44.method869(65);
						this.field1836 = null;
						return;
					}
				}

				this.method3017(class140.field1356);
				class38.method500(20);
			}

			if (field1689 == 20) {
				if (this.field1731 != null) {
					if (!this.field1731.isDone()) {
						return;
					}

					if (this.field1731.isCancelled()) {
						class44.method869(65);
						this.field1731 = null;
						return;
					}

					try {
						OtlTokenResponse var30 = (OtlTokenResponse)this.field1731.get();
						if (!var30.isSuccess()) {
							class44.method869(65);
							this.field1731 = null;
							return;
						}

						this.field1963 = var30.getToken();
						this.field1731 = null;
					} catch (Exception var23) {
						class150.method2660((String)null, var23);
						class44.method869(65);
						this.field1731 = null;
						return;
					}
				} else {
					if (null == this.field1729) {
						class44.method869(65);
						return;
					}

					if (!this.field1729.method293()) {
						return;
					}

					if (this.field1729.method295()) {
						class150.method2660(this.field1729.method289(), (Throwable)null);
						class44.method869(65);
						this.field1729 = null;
						return;
					}

					var29 = this.field1729.method300();
					if (var29.method193() != 200) {
						class150.method2660("Response code: " + var29.method193() + "Response body: " + var29.method194(), (Throwable)null);
						class44.method869(65);
						this.field1729 = null;
						return;
					}

					this.field1963 = var29.method194();
					this.field1729 = null;
				}

				field1830 = 0;
				class38.method500(1);
			}

			if (field1689 == 1) {
				if (null == class20.field116) {
					class20.field116 = class245.field2906.method2912(class143.field1371, class47.field342);
				}

				if (class20.field116.field1569 == 2) {
					throw new IOException();
				}

				if (class20.field116.field1569 == 1) {
					Socket var31 = (Socket)class20.field116.field1573;
					class410 var32 = new class410(var31, 40000, 5000);
					var2 = var32;
					field1748.method2154(var32);
					class20.field116 = null;
					class38.method500(2);
				}
			}

			class284 var33;
			if (2 == field1689) {
				field1748.method2151();
				var33 = class127.method2407();
				var33.field3323 = null;
				var33.field3318 = 0;
				var33.field3321 = new class466(5000);
				var33.field3321.method8323(class268.field3151.field3157);
				field1748.method2173(var33);
				field1748.method2164();
				var3.field4915 = 0;
				class38.method500(3);
			}

			int var16;
			if (field1689 == 3) {
				if (class96.field938 != null) {
					class96.field938.method970();
				}

				if (null != class123.field1217) {
					class123.field1217.method970();
				}

				if (((class411)var2).method7616(1)) {
					var16 = ((class411)var2).method7608();
					if (null != class96.field938) {
						class96.field938.method970();
					}

					if (class123.field1217 != null) {
						class123.field1217.method970();
					}

					if (var16 != 0) {
						class44.method869(var16);
						return;
					}

					var3.field4915 = 0;
					class38.method500(4);
				}
			}

			if (field1689 == 4) {
				if (var3.field4915 < 8) {
					var16 = ((class411)var2).method7606();
					if (var16 > 8 - var3.field4915) {
						var16 = 8 - var3.field4915;
					}

					if (var16 > 0) {
						((class411)var2).method7604(var3.field4917, var3.field4915, var16);
						var3.field4915 += var16;
					}
				}

				if (8 == var3.field4915) {
					var3.field4915 = 0;
					class194.field2137 = var3.method8492();
					class38.method500(5);
				}
			}

			if (field1689 == 5) {
				field1748.field1106.field4915 = 0;
				field1748.method2151();
				class466 var34 = new class466(500);
				int[] var35 = new int[]{class51.field382.nextInt(), class51.field382.nextInt(), class51.field382.nextInt(), class51.field382.nextInt()};
				var34.field4915 = 0;
				var34.method8323(1);
				var34.method8312(var35[0]);
				var34.method8312(var35[1]);
				var34.method8312(var35[2]);
				var34.method8312(var35[3]);
				var34.method8314(class194.field2137);
				if (40 == field1698) {
					var34.method8312(class271.field3170[0]);
					var34.method8312(class271.field3170[1]);
					var34.method8312(class271.field3170[2]);
					var34.method8312(class271.field3170[3]);
				} else {
					if (50 == field1698) {
						var34.method8323(class150.field1443.method6487());
						var34.method8312(class39.field247);
					} else {
						var34.method8323(field1722.method6487());
						switch(field1722.field1442) {
						case 0:
							var34.field4915 += 4;
						case 1:
						default:
							break;
						case 2:
							var34.method8312(class186.field2040.method1799(class73.field652));
							break;
						case 3:
						case 4:
							var34.method8516(class133.field1314);
							++var34.field4915;
						}
					}

					if (field1822.method8645()) {
						var34.method8323(class476.field4998.method6487());
						var34.method8316(this.field1963);
					} else {
						var34.method8323(class476.field5005.method6487());
						var34.method8316(class73.field648);
					}
				}

				var34.method8351(class72.field623, class72.field620);
				class271.field3170 = var35;
				class284 var7 = class127.method2407();
				var7.field3323 = null;
				var7.field3318 = 0;
				var7.field3321 = new class466(5000);
				var7.field3321.field4915 = 0;
				if (40 == field1698) {
					var7.field3321.method8323(class268.field3154.field3157);
				} else {
					var7.field3321.method8323(class268.field3152.field3157);
				}

				var7.field3321.method8310(0);
				int var8 = var7.field3321.field4915;
				var7.field3321.method8312(210);
				var7.field3321.method8312(1);
				var7.field3321.method8323(field1784);
				var7.field3321.method8323(field1880);
				byte var9 = 0;
				var7.field3321.method8323(var9);
				var7.field3321.method8319(var34.field4917, 0, var34.field4915);
				int var10 = var7.field3321.field4915;
				var7.field3321.method8316(class73.field652);
				var7.field3321.method8323((field1922 ? 1 : 0) << 1 | (field1743 ? 1 : 0));
				var7.field3321.method8310(class205.field2337);
				var7.field3321.method8310(class340.field4263);
				class466 var11 = var7.field3321;
				int var14;
				if (field1742 != null) {
					var11.method8319(field1742, 0, field1742.length);
				} else {
					byte[] var13 = new byte[24];

					try {
						class163.field1515.method8029(0L);
						class163.field1515.method8013(var13);

						for (var14 = 0; var14 < 24 && 0 == var13[var14]; ++var14) {
						}

						if (var14 >= 24) {
							throw new IOException();
						}
					} catch (Exception var27) {
						for (int var15 = 0; var15 < 24; ++var15) {
							var13[var15] = -1;
						}
					}

					var11.method8319(var13, 0, var13.length);
				}

				var7.field3321.method8316(class149.field1432);
				var7.field3321.method8312(class210.field2443);
				class467 var12 = new class467(class217.field2637.method7947());
				class217.field2637.method7945(var12);
				var7.field3321.method8319(var12.field4917, 0, var12.field4917.length);
				var7.field3321.method8323(field1784);
				var7.field3321.method8312(0);
				var7.field3321.method8312(class190.field2066.field4243);
				var7.field3321.method8376(class72.field619.field4243);
				var7.field3321.method8376(class194.field2138.field4243);
				var7.field3321.method8375(class92.field884.field4243);
				var7.field3321.method8376(class165.field1536.field4243);
				var7.field3321.method8375(class195.field2162.field4243);
				var7.field3321.method8376(0);
				var7.field3321.method8377(class86.field798.field4243);
				var7.field3321.method8375(class174.field1635.field4243);
				var7.field3321.method8312(class363.field4355.field4243);
				var7.field3321.method8376(class177.field1644.field4243);
				var7.field3321.method8312(class209.field2429.field4243);
				var7.field3321.method8377(class306.field3673.field4243);
				var7.field3321.method8312(class2.field21.field4243);
				var7.field3321.method8312(class436.field4788.field4243);
				var7.field3321.method8377(class254.field2968.field4243);
				var7.field3321.method8312(class16.field98.field4243);
				var7.field3321.method8375(class135.field1332.field4243);
				var7.field3321.method8375(class13.field73.field4243);
				var7.field3321.method8312(class235.field2839.field4243);
				var7.field3321.method8377(class83.field760.field4243);
				var7.field3321.method8502(var35, var10, var7.field3321.field4915);
				var7.field3321.method8322(var7.field3321.field4915 - var8);
				field1748.method2173(var7);
				field1748.method2164();
				field1748.field1105 = new class475(var35);
				int[] var42 = new int[4];

				for (var14 = 0; var14 < 4; ++var14) {
					var42[var14] = 50 + var35[var14];
				}

				var3.method8270(var42);
				class38.method500(6);
			}

			int var18;
			if (6 == field1689 && ((class411)var2).method7606() > 0) {
				var16 = ((class411)var2).method7608();
				if (var16 == 61) {
					var18 = ((class411)var2).method7606();
					class142.field1366 = var18 == 1 && ((class411)var2).method7608() == 1;
					class38.method500(5);
				}

				if (var16 == 21 && 20 == field1698) {
					class38.method500(12);
				} else if (var16 == 2) {
					class38.method500(14);
				} else if (var16 == 15 && 40 == field1698) {
					field1748.field1110 = -1;
					class38.method500(19);
				} else if (var16 == 64) {
					class38.method500(10);
				} else if (var16 == 23 && field1723 < 1) {
					++field1723;
					class38.method500(0);
				} else if (var16 == 29) {
					class38.method500(17);
				} else {
					if (var16 != 69) {
						class44.method869(var16);
						return;
					}

					class38.method500(7);
				}
			}

			if (7 == field1689 && ((class411)var2).method7606() >= 2) {
				((class411)var2).method7604(var3.field4917, 0, 2);
				var3.field4915 = 0;
				class123.field1219 = var3.method8328();
				class38.method500(8);
			}

			if (field1689 == 8 && ((class411)var2).method7606() >= class123.field1219) {
				var3.field4915 = 0;
				((class411)var2).method7604(var3.field4917, var3.field4915, class123.field1219);
				class6 var36 = class6.method6192()[var3.method8326()];

				try {
					class24 var37 = class13.method6282(var36);
					this.field1755 = new class18(var3, var37);
					class38.method500(9);
				} catch (Exception var22) {
					class44.method869(22);
					return;
				}
			}

			if (9 == field1689 && this.field1755.method227()) {
				this.field1739 = this.field1755.method226();
				this.field1755.method215();
				this.field1755 = null;
				if (this.field1739 == null) {
					class44.method869(22);
					return;
				}

				field1748.method2151();
				var33 = class127.method2407();
				var33.field3323 = null;
				var33.field3318 = 0;
				var33.field3321 = new class466(5000);
				var33.field3321.method8323(class268.field3155.field3157);
				var33.field3321.method8310(this.field1739.field4915);
				var33.field3321.method8320(this.field1739);
				field1748.method2173(var33);
				field1748.method2164();
				this.field1739 = null;
				class38.method500(6);
			}

			if (field1689 == 10 && ((class411)var2).method7606() > 0) {
				class228.field2757 = ((class411)var2).method7608();
				class38.method500(11);
			}

			if (11 == field1689 && ((class411)var2).method7606() >= class228.field2757) {
				((class411)var2).method7604(var3.field4917, 0, class228.field2757);
				var3.field4915 = 0;
				class38.method500(6);
			}

			if (field1689 == 12 && ((class411)var2).method7606() > 0) {
				field1709 = (((class411)var2).method7608() + 3) * 60;
				class38.method500(13);
			}

			if (13 == field1689) {
				field1830 = 0;
				class73.method2926(class321.field3796, class321.field3797, field1709 / 60 + class321.field3854);
				if (--field1709 <= 0) {
					class38.method500(0);
				}

			} else {
				if (14 == field1689 && ((class411)var2).method7606() >= 1) {
					class424.field4730 = ((class411)var2).method7608();
					class38.method500(15);
				}

				if (field1689 == 15 && ((class411)var2).method7606() >= class424.field4730) {
					boolean var43 = ((class411)var2).method7608() == 1;
					((class411)var2).method7604(var3.field4917, 0, 4);
					var3.field4915 = 0;
					boolean var44 = false;
					if (var43) {
						var18 = var3.method8271() << 24;
						var18 |= var3.method8271() << 16;
						var18 |= var3.method8271() << 8;
						var18 |= var3.method8271();
						class186.field2040.method1797(class73.field652, var18);
					}

					if (field1737) {
						class186.field2040.method1791(class73.field652);
					} else {
						class186.field2040.method1791((String)null);
					}

					class86.method4349();
					field1950 = ((class411)var2).method7608();
					field1910 = ((class411)var2).method7608() == 1;
					field1817 = ((class411)var2).method7608();
					field1817 <<= 8;
					field1817 += ((class411)var2).method7608();
					field1874 = ((class411)var2).method7608();
					((class411)var2).method7604(var3.field4917, 0, 8);
					var3.field4915 = 0;
					this.field1741 = var3.method8492();
					if (class424.field4730 >= 29) {
						((class411)var2).method7604(var3.field4917, 0, 8);
						var3.field4915 = 0;
						field1819 = var3.method8492();
					}

					((class411)var2).method7604(var3.field4917, 0, 1);
					var3.field4915 = 0;
					class266[] var6 = class197.method3891();
					int var19 = var3.method8282();
					if (var19 < 0 || var19 >= var6.length) {
						throw new IOException(var19 + " " + var3.field4915);
					}

					field1748.field1107 = var6[var19];
					field1748.field1110 = field1748.field1107.field3059;
					((class411)var2).method7604(var3.field4917, 0, 2);
					var3.field4915 = 0;
					field1748.field1110 = var3.method8328();

					try {
						class30.method420(class122.field1212, "zap");
					} catch (Throwable var21) {
					}

					class38.method500(16);
				}

				if (field1689 == 16) {
					if (((class411)var2).method7606() >= field1748.field1110) {
						var3.field4915 = 0;
						((class411)var2).method7604(var3.field4917, 0, field1748.field1110);
						field1694.method6969();
						class112.method2184();
						class275.method5313(var3);
						class19.field113 = -1;
						class102.method2077(false, var3);
						field1748.field1107 = null;
					}

				} else {
					if (17 == field1689 && ((class411)var2).method7606() >= 2) {
						var3.field4915 = 0;
						((class411)var2).method7604(var3.field4917, 0, 2);
						var3.field4915 = 0;
						class142.field1369 = var3.method8328();
						class38.method500(18);
					}

					if (18 == field1689 && ((class411)var2).method7606() >= class142.field1369) {
						var3.field4915 = 0;
						((class411)var2).method7604(var3.field4917, 0, class142.field1369);
						var3.field4915 = 0;
						String var38 = var3.method8335();
						String var41 = var3.method8335();
						String var39 = var3.method8335();
						class73.method2926(var38, var41, var39);
						class131.method2451(10);
						if (field1822.method8645()) {
							class73.method113(9);
						}
					}

					if (19 != field1689) {
						++field1830;
						if (field1830 > 2000) {
							if (field1723 < 1) {
								if (class170.field1603 == class47.field342) {
									class47.field342 = class147.field1417;
								} else {
									class47.field342 = class170.field1603;
								}

								++field1723;
								class38.method500(0);
							} else {
								class44.method869(-3);
							}
						}
					} else {
						if (-1 == field1748.field1110) {
							if (((class411)var2).method7606() < 2) {
								return;
							}

							((class411)var2).method7604(var3.field4917, 0, 2);
							var3.field4915 = 0;
							field1748.field1110 = var3.method8328();
						}

						if (((class411)var2).method7606() >= field1748.field1110) {
							((class411)var2).method7604(var3.field4917, 0, field1748.field1110);
							var3.field4915 = 0;
							var16 = field1748.field1110;
							field1694.method6965();
							field1748.method2151();
							field1748.field1106.field4915 = 0;
							field1748.field1107 = null;
							field1748.field1112 = null;
							field1748.field1113 = null;
							field1748.field1114 = null;
							field1748.field1110 = 0;
							field1748.field1101 = 0;
							field1706 = 0;
							method4887();
							field1765 = 0;
							field1942 = 0;

							for (var18 = 0; var18 < 2048; ++var18) {
								field1816[var18] = null;
							}

							class142.field1370 = null;

							for (var18 = 0; var18 < field1934.length; ++var18) {
								class85 var40 = field1934[var18];
								if (null != var40) {
									var40.field981 = -1;
									var40.field982 = false;
								}
							}

							class81.method859();
							class131.method2451(30);

							for (var18 = 0; var18 < 100; ++var18) {
								field1913[var18] = true;
							}

							var33 = class152.method2679(class276.field3202, field1748.field1105);
							var33.field3321.method8323(class74.method1502());
							var33.field3321.method8310(class205.field2337);
							var33.field3321.method8310(class340.field4263);
							field1748.method2173(var33);
							class275.method5313(var3);
							if (var3.field4915 != var16) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var28) {
			if (field1723 < 1) {
				if (class47.field342 == class170.field1603) {
					class47.field342 = class147.field1417;
				} else {
					class47.field342 = class170.field1603;
				}

				++field1723;
				class38.method500(0);
			} else {
				class44.method869(-2);
			}
		}
	}

	static int method3498(int var0, class65 var1, boolean var2) {
		if (var0 == CS2Opcodes.SOUND_SYNTH) {
			class94.field920 -= 3;
			class5.method42(class69.field579[class94.field920], class69.field579[1 + class94.field920], class69.field579[class94.field920 + 2]);
			return 1;
		} else if (var0 == CS2Opcodes.SOUND_SONG) {
			class164.method2767(class69.field579[--class94.field920]);
			return 1;
		} else if (var0 == CS2Opcodes.SOUND_JINGLE) {
			class94.field920 -= 2;
			class1.method4(class69.field579[class94.field920], class69.field579[class94.field920 + 1]);
			return 1;
		} else {
			class94 var4;
			class103 var5;
			int var6;
			int var7;
			String var8;
			if (var0 != CS2Opcodes.SETDEVICEOPTION && var0 != CS2Opcodes.SETGAMEOPTION && var0 != CS2Opcodes.SETCLIENTOPTION && var0 != CS2Opcodes.SETBRIGHTNESS && var0 != CS2Opcodes.SETVOLUMEMUSIC && var0 != CS2Opcodes.SETVOLUMESOUNDS && var0 != CS2Opcodes.SETVOLUMEAREASOUNDS) {
				if (var0 != CS2Opcodes.GETDEVICEOPTION && var0 != CS2Opcodes.GETGAMEOPTION && var0 != CS2Opcodes.GETCLIENTOPTION && var0 != CS2Opcodes.GETBRIGHTNESS && var0 != CS2Opcodes.GETVOLUMEMUSIC && var0 != CS2Opcodes.GETVOLUMESOUNDS && var0 != CS2Opcodes.GETVOLUMEAREASOUNDS) {
					return var0 == CS2Opcodes._3211 ? 1 : 2;
				} else {
					var4 = class94.field917;
					var5 = class103.field1069;
					boolean var9 = false;
					if (var0 == CS2Opcodes.GETDEVICEOPTION) {
						var7 = class69.field579[--class94.field920];
						var4 = (class94)class78.method1584(class94.method2862(), var7);
						if (var4 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var7));
						}
					}

					if (var0 == CS2Opcodes.GETGAMEOPTION) {
						var7 = class69.field579[--class94.field920];
						var5 = (class103)class78.method1584(class103.method5307(), var7);
						if (var5 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var7));
						}
					}

					if (var0 == CS2Opcodes.GETCLIENTOPTION) {
						var7 = class69.field579[--class94.field920];
						var4 = (class94)class78.method1584(class94.method2862(), var7);
						if (var4 == null) {
							var5 = (class103)class78.method1584(class103.method5307(), var7);
							if (var5 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var7));
							}
						}
					} else if (var0 == CS2Opcodes.GETBRIGHTNESS) {
						var4 = class94.field921;
					} else if (var0 == CS2Opcodes.GETVOLUMEMUSIC) {
						var5 = class103.field1060;
					} else if (var0 == CS2Opcodes.GETVOLUMESOUNDS) {
						var5 = class103.field1063;
					} else if (var0 == CS2Opcodes.GETVOLUMEAREASOUNDS) {
						var5 = class103.field1064;
					}

					if (var5 == class103.field1069) {
						switch(var4.field918) {
						case 1:
							var6 = class186.field2040.method1775() ? 1 : 0;
							break;
						case 2:
							var6 = class186.field2040.method1790() ? 1 : 0;
							break;
						case 3:
							var6 = class186.field2040.method1781() ? 1 : 0;
							break;
						case 4:
							var6 = class186.field2040.method1783();
							break;
						case 5:
							var6 = class283.method5368();
							break;
						default:
							var8 = String.format("Unkown device option: %s.", var4.toString());
							throw new RuntimeException(var8);
						}
					} else {
						switch(var5.field1062) {
						case 1:
							var6 = class186.field2040.method1774() ? 1 : 0;
							break;
						case 2:
							var7 = class186.field2040.method1787();
							var6 = Math.round((float)(var7 * 100) / 255.0F);
							break;
						case 3:
							var7 = class186.field2040.method1788();
							var6 = Math.round((float)(var7 * 100) / 127.0F);
							break;
						case 4:
							var7 = class186.field2040.method1868();
							var6 = Math.round((float)(var7 * 100) / 127.0F);
							break;
						default:
							var8 = String.format("Unkown game option: %s.", var5.toString());
							throw new RuntimeException(var8);
						}
					}

					class69.field579[++class94.field920 - 1] = var6;
					return 1;
				}
			} else {
				var4 = class94.field917;
				var5 = class103.field1069;
				var6 = class69.field579[--class94.field920];
				if (var0 == CS2Opcodes.SETDEVICEOPTION) {
					var7 = class69.field579[--class94.field920];
					var4 = (class94)class78.method1584(class94.method2862(), var7);
					if (null == var4) {
						throw new RuntimeException(String.format("Unrecognized device option %d", var7));
					}
				}

				if (var0 == CS2Opcodes.SETGAMEOPTION) {
					var7 = class69.field579[--class94.field920];
					var5 = (class103)class78.method1584(class103.method5307(), var7);
					if (null == var5) {
						throw new RuntimeException(String.format("Unrecognized game option %d", var7));
					}
				}

				if (var0 == CS2Opcodes.SETCLIENTOPTION) {
					var7 = class69.field579[--class94.field920];
					var4 = (class94)class78.method1584(class94.method2862(), var7);
					if (var4 == null) {
						var5 = (class103)class78.method1584(class103.method5307(), var7);
						if (null == var5) {
							throw new RuntimeException(String.format("Unrecognized client option %d", var7));
						}
					}
				} else if (var0 == CS2Opcodes.SETBRIGHTNESS) {
					var4 = class94.field921;
				} else if (var0 == CS2Opcodes.SETVOLUMEMUSIC) {
					var5 = class103.field1060;
				} else if (var0 == CS2Opcodes.SETVOLUMESOUNDS) {
					var5 = class103.field1063;
				} else if (var0 == CS2Opcodes.SETVOLUMEAREASOUNDS) {
					var5 = class103.field1064;
				}

				if (class103.field1069 == var5) {
					switch(var4.field918) {
					case 1:
						class186.field2040.method1823(var6 == 1);
						break;
					case 2:
						class186.field2040.method1810(var6 == 1);
						break;
					case 3:
						class186.field2040.method1832(var6 == 1);
						break;
					case 4:
						if (var6 < 0) {
							var6 = 0;
						}

						class186.field2040.method1782(var6);
						break;
					case 5:
						method181(var6);
						break;
					default:
						var8 = String.format("Unkown device option: %s.", var4.toString());
						throw new RuntimeException(var8);
					}
				} else {
					switch(var5.field1062) {
					case 1:
						class186.field2040.method1848(var6 == 1);
						break;
					case 2:
						var6 = Math.min(Math.max(var6, 0), 100);
						var7 = Math.round((float)(var6 * 255) / 100.0F);
						class302.method6074(var7);
						break;
					case 3:
						var6 = Math.min(Math.max(var6, 0), 100);
						var7 = Math.round((float)(var6 * 127) / 100.0F);
						method213(var7);
						break;
					case 4:
						var6 = Math.min(Math.max(var6, 0), 100);
						var7 = Math.round((float)(var6 * 127) / 100.0F);
						method170(var7);
						break;
					default:
						var8 = String.format("Unkown game option: %s.", var5.toString());
						throw new RuntimeException(var8);
					}
				}

				return 1;
			}
		}
	}

	static final void method1947() {
		field1748.method2155();
		method6602();
		class33.field194.method4152();

		for (int var1 = 0; var1 < 4; ++var1) {
			field1758[var1].method4027();
		}

		field1754.method3552();
		System.gc();
		class300.method6996(2);
		field1945 = -1;
		field1946 = false;
		class70.method2233();
		class131.method2451(10);
	}

	static final void method6050(int var0) {
		method1947();
		switch(var0) {
		case 1:
			class73.method7224();
			break;
		case 2:
			class73.method113(24);
			class73.method2926(class321.field3812, class321.field4000, class321.field4001);
		}

	}

	static long method2670() {
		return field1819;
	}

	static final void method6602() {
		class193.method2668();
		class190.field2063.method5357();
		class166.method1207();
		class196.field2165.method5357();
		class196.field2194.method5357();
		class196.field2167.method5357();
		class196.field2168.method5357();
		class208.method7245();
		class200.field2301.method5357();
		class200.field2255.method5357();
		class200.field2256.method5357();
		class183.field1994.method5357();
		class183.field1995.method5357();
		class183.field2008.method5357();
		class199.method2508();
		class203.field2322.method5357();
		class165.method1208();
		class147.field1422.method8109();
		class51.field380.method8109();
		class195.method3748();
		class179.method4148();
		class283.method5370();
		class133.method2471();
		class169.field1577.method5357();
		class461.field4896.method5357();
		class455.method7921();
		field1906.method5357();
		field1981.method5357();
		class301.method1014();
		class290.method3743();
		((class228)class221.field2672).method4633();
		class65.field529.method5357();
		field1753.method7013();
		class83.field760.method6375();
		class2.field21.method6375();
		class190.field2066.method6375();
		class235.field2839.method6375();
		class13.field73.method6375();
		class174.field1635.method6375();
		class306.field3673.method6375();
		class86.field798.method6375();
		class209.field2429.method6375();
		class135.field1332.method6375();
		class16.field98.method6375();
		class72.field619.method6375();
		class407.field4611.method6375();
	}

	static final void method4692() {
		if (field1749 > 0) {
			method1947();
		} else {
			field1694.method6967();
			class131.method2451(40);
			class14.field82 = field1748.method2157();
			field1748.method2156();
		}
	}

	final void method3024() {
		if (field1706 > 1) {
			--field1706;
		}

		if (field1749 > 0) {
			--field1749;
		}

		if (field1750) {
			field1750 = false;
			method4692();
		} else {
			if (!field1837) {
				method6843();
			}

			int var2;
			for (var2 = 0; var2 < 100 && this.method3483(field1748); ++var2) {
			}

			if (field1698 == 30) {
				while (true) {
					class33 var3 = (class33)class38.field234.method6705();
					boolean var30;
					if (null == var3) {
						var30 = false;
					} else {
						var30 = true;
					}

					int var4;
					class284 var31;
					if (!var30) {
						class284 var15;
						int var16;
						if (field1694.field4429) {
							var15 = class152.method2679(class276.field3288, field1748.field1105);
							var15.field3321.method8323(0);
							var16 = var15.field3321.field4915;
							field1694.method6972(var15.field3321);
							var15.field3321.method8398(var15.field3321.field4915 - var16);
							field1748.method2173(var15);
							field1694.method6970();
						}

						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						int var12;
						synchronized(class286.field3343.field940) {
							if (!field1856) {
								class286.field3343.field946 = 0;
							} else if (class28.field165 != 0 || class286.field3343.field946 >= 40) {
								var31 = null;
								var4 = 0;
								var5 = 0;
								var6 = 0;
								var7 = 0;

								for (var8 = 0; var8 < class286.field3343.field946 && (var31 == null || var31.field3321.field4915 - var4 < 246); ++var8) {
									var5 = var8;
									var9 = class286.field3343.field943[var8];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									var10 = class286.field3343.field942[var8];
									if (var10 < -1) {
										var10 = -1;
									} else if (var10 > 65534) {
										var10 = 65534;
									}

									if (field1702 != var10 || var9 != field1734) {
										if (null == var31) {
											var31 = class152.method2679(class276.field3266, field1748.field1105);
											var31.field3321.method8323(0);
											var4 = var31.field3321.field4915;
											class466 var10000 = var31.field3321;
											var10000.field4915 += 2;
											var6 = 0;
											var7 = 0;
										}

										int var13;
										if (field1704 != -1L) {
											var11 = var10 - field1702;
											var12 = var9 - field1734;
											var13 = (int)((class286.field3343.field944[var8] - field1704) / 20L);
											var6 = (int)((long)var6 + (class286.field3343.field944[var8] - field1704) % 20L);
										} else {
											var11 = var10;
											var12 = var9;
											var13 = Integer.MAX_VALUE;
										}

										field1702 = var10;
										field1734 = var9;
										if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
											var11 += 32;
											var12 += 32;
											var31.field3321.method8310(var12 + (var13 << 12) + (var11 << 6));
										} else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
											var11 += 128;
											var12 += 128;
											var31.field3321.method8323(var13 + 128);
											var31.field3321.method8310((var11 << 8) + var12);
										} else if (var13 < 32) {
											var31.field3321.method8323(var13 + 192);
											if (var10 != -1 && var9 != -1) {
												var31.field3321.method8312(var10 | var9 << 16);
											} else {
												var31.field3321.method8312(Integer.MIN_VALUE);
											}
										} else {
											var31.field3321.method8310((var13 & 8191) + 57344);
											if (var10 != -1 && var9 != -1) {
												var31.field3321.method8312(var10 | var9 << 16);
											} else {
												var31.field3321.method8312(Integer.MIN_VALUE);
											}
										}

										++var7;
										field1704 = class286.field3343.field944[var8];
									}
								}

								if (var31 != null) {
									var31.field3321.method8398(var31.field3321.field4915 - var4);
									var8 = var31.field3321.field4915;
									var31.field3321.field4915 = var4;
									var31.field3321.method8323(var6 / var7);
									var31.field3321.method8323(var6 % var7);
									var31.field3321.field4915 = var8;
									field1748.method2173(var31);
								}

								if (var5 >= class286.field3343.field946) {
									class286.field3343.field946 = 0;
								} else {
									class97 var50 = class286.field3343;
									var50.field946 -= var5;
									System.arraycopy(class286.field3343.field942, var5, class286.field3343.field942, 0, class286.field3343.field946);
									System.arraycopy(class286.field3343.field943, var5, class286.field3343.field943, 0, class286.field3343.field946);
									System.arraycopy(class286.field3343.field944, var5, class286.field3343.field944, 0, class286.field3343.field946);
								}
							}
						}

						class284 var19;
						if (class28.field165 == 1 || !class218.field2651 && class28.field165 == 4 || 2 == class28.field165) {
							long var17 = class28.field148 - field1920;
							if (var17 > 32767L) {
								var17 = 32767L;
							}

							field1920 = class28.field148;
							var4 = class28.field162;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class340.field4263) {
								var4 = class340.field4263;
							}

							var5 = class28.field166;
							if (var5 < 0) {
								var5 = 0;
							} else if (var5 > class205.field2337) {
								var5 = class205.field2337;
							}

							var6 = (int)var17;
							var19 = class152.method2679(class276.field3259, field1748.field1105);
							var19.field3321.method8310((2 == class28.field165 ? 1 : 0) + (var6 << 1));
							var19.field3321.method8310(var5);
							var19.field3321.method8310(var4);
							field1748.method2173(var19);
						}

						if (field1929.field2033 > 0) {
							var15 = class152.method2679(class276.field3193, field1748.field1105);
							var15.field3321.method8310(0);
							var16 = var15.field3321.field4915;
							long var20 = class74.method1493();

							for (var6 = 0; var6 < field1929.field2033; ++var6) {
								long var22 = var20 - field1861;
								if (var22 > 16777215L) {
									var22 = 16777215L;
								}

								field1861 = var20;
								var15.field3321.method8516((int)var22);
								var15.field3321.method8323(field1929.field2030[var6]);
							}

							var15.field3321.method8322(var15.field3321.field4915 - var16);
							field1748.method2173(var15);
						}

						if (field1989 > 0) {
							--field1989;
						}

						if (field1929.method3567(96) || field1929.method3567(97) || field1929.method3567(98) || field1929.method3567(99)) {
							field1785 = true;
						}

						if (field1785 && field1989 <= 0) {
							field1989 = 20;
							field1785 = false;
							var15 = class152.method2679(class276.field3294, field1748.field1105);
							var15.field3321.method8310(field1770);
							var15.field3321.method8310(field1769);
							field1748.method2173(var15);
						}

						if (class466.field4911 && !field1767) {
							field1767 = true;
							var15 = class152.method2679(class276.field3280, field1748.field1105);
							var15.field3321.method8323(1);
							field1748.method2173(var15);
						}

						if (!class466.field4911 && field1767) {
							field1767 = false;
							var15 = class152.method2679(class276.field3280, field1748.field1105);
							var15.field3321.method8323(0);
							field1748.method2173(var15);
						}

						if (class166.field1548 != null) {
							class166.field1548.method7675();
						}

						if (class267.field3143) {
							if (class267.field3147 != null) {
								class267.field3147.method7353();
							}

							method2765();
							class267.field3143 = false;
						}

						class39.method505();
						class236.method4726();
						if (30 != field1698) {
							return;
						}

						for (class91 var36 = (class91)field1919.method6577(); var36 != null; var36 = (class91)field1919.method6579()) {
							if (var36.field876 > 0) {
								--var36.field876;
							}

							if (var36.field876 == 0) {
								if (var36.field866 >= 0) {
									var4 = var36.field866;
									var5 = var36.field869;
									class196 var24 = class165.method2780(var4);
									if (var5 == 11) {
										var5 = 10;
									}

									if (var5 >= 5 && var5 <= 8) {
										var5 = 4;
									}

									boolean var37 = var24.method3821(var5);
									if (!var37) {
										continue;
									}
								}

								class122.method2313(var36.field867, var36.field874, var36.field863, var36.field875, var36.field866, var36.field878, var36.field869);
								var36.method7951();
							} else {
								if (var36.field865 > 0) {
									--var36.field865;
								}

								if (0 == var36.field865 && var36.field863 >= 1 && var36.field875 >= 1 && var36.field863 <= 102 && var36.field875 <= 102 && (var36.field870 < 0 || class326.method6214(var36.field870, var36.field872))) {
									class122.method2313(var36.field867, var36.field874, var36.field863, var36.field875, var36.field870, var36.field871, var36.field872);
									var36.field865 = -1;
									if (var36.field866 == var36.field870 && var36.field866 == -1) {
										var36.method7951();
									} else if (var36.field870 == var36.field866 && var36.field871 == var36.field878 && var36.field869 == var36.field872) {
										var36.method7951();
									}
								}
							}
						}

						class153.method2707();
						++field1748.field1101;
						if (field1748.field1101 > 750) {
							method4692();
							return;
						}

						class195.method3814();

						for (var2 = 0; var2 < field1744; ++var2) {
							var16 = field1900[var2];
							class85 var25 = field1934[var16];
							if (null != var25) {
								class227.method4632(var25, var25.field790.field2388);
							}
						}

						int[] var38 = class87.field817;

						for (var16 = 0; var16 < class87.field818; ++var16) {
							class88 var42 = field1816[var38[var16]];
							if (null != var42 && var42.field1018 > 0) {
								--var42.field1018;
								if (0 == var42.field1018) {
									var42.field968 = null;
								}
							}
						}

						for (var16 = 0; var16 < field1744; ++var16) {
							var4 = field1900[var16];
							class85 var26 = field1934[var4];
							if (null != var26 && var26.field1018 > 0) {
								--var26.field1018;
								if (0 == var26.field1018) {
									var26.field968 = null;
								}
							}
						}

						++field1745;
						if (0 != field1804) {
							field1782 += 20;
							if (field1782 >= 400) {
								field1804 = 0;
							}
						}

						if (class293.field3565 != null) {
							++field1806;
							if (field1806 >= 15) {
								class53.method1040(class293.field3565);
								class293.field3565 = null;
							}
						}

						class290 var39 = class242.field2895;
						class290 var32 = class379.field4462;
						class242.field2895 = null;
						class379.field4462 = null;
						field1879 = null;
						field1883 = false;
						field1927 = false;
						field1892 = 0;

						while (field1929.method3572() && field1892 < 128) {
							if (field1950 >= 2 && field1929.method3567(82) && 66 == field1929.field2035) {
								String var44 = class93.method1991();
								class122.field1212.method515(var44);
							} else if (1 != field1775 || field1929.field2022 <= 0) {
								field1933[field1892] = field1929.field2035;
								field1956[field1892] = field1929.field2022;
								++field1892;
							}
						}

						if (class172.method2923() && field1929.method3567(82) && field1929.method3567(81) && field1796 != 0) {
							var4 = class142.field1370.field847 - field1796;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != class142.field1370.field847) {
								var5 = class142.field1370.field973[0] + class151.field1447;
								var6 = class142.field1370.field1021[0] + class388.field4509;
								var19 = class152.method2679(class276.field3265, field1748.field1105);
								var19.field3321.method8383(var6);
								var19.field3321.method8354(var4);
								var19.field3321.method8364(var5);
								var19.field3321.method8377(0);
								field1748.method2173(var19);
							}

							field1796 = 0;
						}

						if (1 == class28.field165) {
							field1754.method3552();
						}

						if (-1 != field1862) {
							method7107(field1862, 0, 0, class205.field2337, class340.field4263, 0, 0);
						}

						++field1887;

						while (true) {
							class290 var41;
							class80 var45;
							class290 var46;
							do {
								var45 = (class80)field1907.method6575();
								if (var45 == null) {
									while (true) {
										do {
											var45 = (class80)field1908.method6575();
											if (null == var45) {
												while (true) {
													do {
														var45 = (class80)field1764.method6575();
														if (var45 == null) {
															while (true) {
																while (true) {
																	class284 var27;
																	class202 var47;
																	do {
																		do {
																			do {
																				var47 = (class202)field1909.method6575();
																				if (null == var47) {
																					this.method3412();
																					if (null != class166.field1548) {
																						class166.field1548.method7685(class384.field4486, (class142.field1370.field1012 >> 7) + class151.field1447, class388.field4509 + (class142.field1370.field948 >> 7), false);
																						class166.field1548.method7700();
																					}

																					if (null != field1875) {
																						this.method3037();
																					}

																					if (null != class385.field4502) {
																						class53.method1040(class385.field4502);
																						++field1813;
																						if (0 == class28.field157) {
																							if (field1812) {
																								if (class385.field4502 == class256.field2991 && field1980 != field1800) {
																									class290 var48 = class385.field4502;
																									byte var35 = 0;
																									if (field1867 == 1 && var48.field3500 == 206) {
																										var35 = 1;
																									}

																									if (var48.field3392[field1980] <= 0) {
																										var35 = 0;
																									}

																									var7 = class182.method3010(var48);
																									boolean var34 = (var7 >> 29 & 1) != 0;
																									if (var34) {
																										var8 = field1800;
																										var9 = field1980;
																										var48.field3392[var9] = var48.field3392[var8];
																										var48.field3438[var9] = var48.field3438[var8];
																										var48.field3392[var8] = -1;
																										var48.field3438[var8] = 0;
																									} else if (var35 == 1) {
																										var8 = field1800;
																										var9 = field1980;

																										while (var8 != var9) {
																											if (var8 > var9) {
																												var48.method5543(var8 - 1, var8);
																												--var8;
																											} else if (var8 < var9) {
																												var48.method5543(var8 + 1, var8);
																												++var8;
																											}
																										}
																									} else {
																										var48.method5543(field1980, field1800);
																									}

																									var27 = class152.method2679(class276.field3203, field1748.field1105);
																									var27.field3321.method8377(class385.field4502.field3492);
																									var27.field3321.method8383(field1800);
																									var27.field3321.method8310(field1980);
																									var27.field3321.method8356(var35);
																									field1748.method2173(var27);
																								}
																							} else if (this.method3031()) {
																								this.method3032(field1809, field1810);
																							} else if (field1838 > 0) {
																								method4970(field1809, field1810);
																							}

																							field1806 = 10;
																							class28.field165 = 0;
																							class385.field4502 = null;
																						} else if (field1813 >= 5 && (class28.field158 > field1809 + 5 || class28.field158 < field1809 - 5 || class28.field153 > 5 + field1810 || class28.field153 < field1810 - 5)) {
																							field1812 = true;
																						}
																					}

																					if (class211.method4191()) {
																						var4 = class211.field2481;
																						var5 = class211.field2485;
																						class284 var43 = class152.method2679(class276.field3228, field1748.field1105);
																						var43.field3321.method8323(5);
																						var43.field3321.method8356(field1929.method3567(82) ? (field1929.method3567(81) ? 2 : 1) : 0);
																						var43.field3321.method8383(class151.field1447 + var4);
																						var43.field3321.method8364(class388.field4509 + var5);
																						field1748.method2173(var43);
																						class211.method4192();
																						field1763 = class28.field166;
																						field1696 = class28.field162;
																						field1804 = 1;
																						field1782 = 0;
																						field1942 = var4;
																						field1688 = var5;
																					}

																					if (var39 != class242.field2895) {
																						if (null != var39) {
																							class53.method1040(var39);
																						}

																						if (class242.field2895 != null) {
																							class53.method1040(class242.field2895);
																						}
																					}

																					if (var32 != class379.field4462 && field1735 == field1703) {
																						if (var32 != null) {
																							class53.method1040(var32);
																						}

																						if (null != class379.field4462) {
																							class53.method1040(class379.field4462);
																						}
																					}

																					if (null != class379.field4462) {
																						if (field1735 < field1703) {
																							++field1735;
																							if (field1703 == field1735) {
																								class53.method1040(class379.field4462);
																							}
																						}
																					} else if (field1735 > 0) {
																						--field1735;
																					}

																					class2.method18();
																					if (field1954) {
																						class47.method918();
																					} else if (field1953) {
																						var4 = 64 + class142.field1368 * 128;
																						var5 = class51.field384 * 128 + 64;
																						var6 = class199.method3912(var4, var5, class384.field4486) - class65.field534;
																						class275.method5314(var4, var6, var5);
																						var4 = 64 + class127.field1266 * 128;
																						var5 = 64 + class140.field1357 * 128;
																						var6 = class199.method3912(var4, var5, class384.field4486) - class112.field1140;
																						var7 = var4 - class141.field1363;
																						var8 = var6 - class392.field4523;
																						var9 = var5 - class170.field1608;
																						var10 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7));
																						var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047;
																						var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
																						class157.method2718(var11, var12);
																					}

																					for (var4 = 0; var4 < 5; ++var4) {
																						int var10002 = field1799[var4]++;
																					}

																					class254.field2979.method2274();
																					var4 = ++class28.field168 - 1;
																					var6 = class40.method2946();
																					if (var4 > 15000 && var6 > 15000) {
																						field1749 = 250;
																						class28.method1949(14500);
																						var19 = class152.method2679(class276.field3269, field1748.field1105);
																						field1748.method2173(var19);
																					}

																					class405.field4602.method1132();
																					++field1748.field1108;
																					if (field1748.field1108 > 50) {
																						var19 = class152.method2679(class276.field3274, field1748.field1105);
																						field1748.method2173(var19);
																					}

																					try {
																						field1748.method2164();
																					} catch (IOException var28) {
																						method4692();
																					}

																					return;
																				}
																			} while(var47 == null);
																		} while(var47.field2318 == null);

																		if (var47.field2318.field3400 < 0) {
																			break;
																		}

																		var46 = class180.method2988(var47.field2318.field3418);
																	} while(null == var46 || var46.field3541 == null || var46.field3541.length == 0 || var47.field2318.field3400 >= var46.field3541.length || var47.field2318 != var46.field3541[var47.field2318.field3400]);

																	if (var47.field2318.field3536 == 11 && 0 == var47.field2313) {
																		switch(var47.field2318.method5517()) {
																		case 0:
																			class356.method6604(var47.field2318.method5520(), true, false);
																			break;
																		case 1:
																			var6 = class182.method3010(var47.field2318);
																			boolean var33 = 0 != (var6 >> 22 & 1);
																			if (var33) {
																				int[] var40 = var47.field2318.method5521();
																				if (null != var40) {
																					var27 = class152.method2679(class276.field3299, field1748.field1105);
																					var27.field3321.method8375(var40[2]);
																					var27.field3321.method8312(var47.field2318.field3492);
																					var27.field3321.method8375(var47.field2318.method5519());
																					var27.field3321.method8312(var40[1]);
																					var27.field3321.method8310(var47.field2318.field3400);
																					var27.field3321.method8377(var40[0]);
																					field1748.method2173(var27);
																				}
																			}
																		}
																	} else if (12 == var47.field2318.field3536) {
																		class295 var49 = var47.field2318.method5510();
																		if (null != var49 && var49.method5678()) {
																			switch(var47.field2313) {
																			case 0:
																				field1754.method3550(var47.field2318);
																				var49.method5680(true);
																				var49.method5719(var47.field2317, var47.field2316, field1929.method3567(82), field1929.method3567(81));
																				break;
																			case 1:
																				var49.method5902(var47.field2317, var47.field2316);
																			}
																		}
																	}
																}
															}
														}

														var46 = var45.field733;
														if (var46.field3400 < 0) {
															break;
														}

														var41 = class180.method2988(var46.field3418);
													} while(null == var41 || null == var41.field3541 || var46.field3400 >= var41.field3541.length || var41.field3541[var46.field3400] != var46);

													class69.method2874(var45);
												}
											}

											var46 = var45.field733;
											if (var46.field3400 < 0) {
												break;
											}

											var41 = class180.method2988(var46.field3418);
										} while(var41 == null || null == var41.field3541 || var46.field3400 >= var41.field3541.length || var46 != var41.field3541[var46.field3400]);

										class69.method2874(var45);
									}
								}

								var46 = var45.field733;
								if (var46.field3400 < 0) {
									break;
								}

								var41 = class180.method2988(var46.field3418);
							} while(null == var41 || var41.field3541 == null || var46.field3400 >= var41.field3541.length || var41.field3541[var46.field3400] != var46);

							class69.method2874(var45);
						}
					}

					var31 = class152.method2679(class276.field3281, field1748.field1105);
					var31.field3321.method8323(0);
					var4 = var31.field3321.field4915;
					class219.method4527(var31.field3321);
					var31.field3321.method8398(var31.field3321.field4915 - var4);
					field1748.method2173(var31);
				}
			}
		}
	}

	static final void method3406() {
		if (null != class123.field1217) {
			class123.field1217.method995();
		}

		if (null != class96.field938) {
			class96.field938.method995();
		}

	}

	static final void method5369(class98 var0) {
		int var2 = Math.max(1, var0.field1003 - field1700);
		int var3 = var0.field951 * 64 + var0.field966 * 128;
		int var4 = var0.field955 * 128 + var0.field951 * 64;
		var0.field1012 += (var3 - var0.field1012) / var2;
		var0.field948 += (var4 - var0.field948) / var2;
		var0.field1009 = 0;
		var0.field1014 = var0.field1005;
	}

	static void method683() {
		class284 var1 = class152.method2679(class276.field3202, field1748.field1105);
		var1.field3321.method8323(class74.method1502());
		var1.field3321.method8310(class205.field2337);
		var1.field3321.method8310(class340.field4263);
		field1748.method2173(var1);
	}

	protected final void method607() {
		field1921 = class74.method1493() + 500L;
		this.method3025();
		if (-1 != field1862) {
			this.method3491(true);
		}

	}

	void method3025() {
		int var2 = class205.field2337;
		int var3 = class340.field4263;
		if (super.field263 < var2) {
			var2 = super.field263;
		}

		if (super.field262 < var3) {
			var3 = super.field262;
		}

		if (null != class186.field2040) {
			try {
				client var4 = class122.field1212;
				Object[] var5 = new Object[]{class74.method1502()};
				JSObject.getWindow(var4).call("resize", var5);
			} catch (Throwable var6) {
			}
		}

	}

	final void method3026() {
		int var2;
		if (field1862 != -1) {
			var2 = field1862;
			if (class87.method1889(var2)) {
				class128.method2414(class72.field625[var2], -1);
			}
		}

		for (var2 = 0; var2 < field1911; ++var2) {
			if (field1913[var2]) {
				field1914[var2] = true;
			}

			field1915[var2] = field1913[var2];
			field1913[var2] = false;
		}

		field1990 = field1700;
		field1851 = -1;
		field1852 = -1;
		class256.field2991 = null;
		if (field1862 != -1) {
			field1911 = 0;
			class83.method1641(field1862, 0, 0, class205.field2337, class340.field4263, 0, 0, -1);
		}

		class478.method8712();
		if (field1721) {
			if (field1804 == 1) {
				class28.field172[field1782 / 100].method8866(field1763 - 8, field1696 - 8);
			}

			if (field1804 == 2) {
				class28.field172[field1782 / 100 + 4].method8866(field1763 - 8, field1696 - 8);
			}
		}

		int var3;
		int var4;
		if (!field1837) {
			if (field1851 != -1) {
				var2 = field1851;
				var3 = field1852;
				if ((field1838 >= 2 || 0 != field1855 || field1857) && field1850) {
					var4 = field1838 - 1;
					String var6;
					if (1 == field1855 && field1838 < 2) {
						var6 = class321.field3917 + class321.field3927 + field1952 + " " + class79.field728;
					} else if (field1857 && field1838 < 2) {
						var6 = field1860 + class321.field3927 + field1979 + " " + class79.field728;
					} else {
						String var14;
						if (var4 < 0) {
							var14 = "";
						} else if (field1725[var4].length() > 0) {
							var14 = field1844[var4] + class321.field3927 + field1725[var4];
						} else {
							var14 = field1844[var4];
						}

						var6 = var14;
					}

					if (field1838 > 2) {
						var6 = var6 + class79.method2039(16777215) + " " + '/' + " " + (field1838 - 2) + class321.field3887;
					}

					class140.field1352.method6863(var6, var2 + 4, var3 + 15, 16777215, 0, field1700 / 1000);
				}
			}
		} else {
			class59.method1106();
		}

		if (3 == field1944) {
			for (var2 = 0; var2 < field1911; ++var2) {
				if (field1915[var2]) {
					class478.method8731(field1916[var2], field1917[var2], field1904[var2], field1716[var2], 16711935, 128);
				} else if (field1914[var2]) {
					class478.method8731(field1916[var2], field1917[var2], field1904[var2], field1716[var2], 16711680, 128);
				}
			}
		}

		var2 = class384.field4486;
		var3 = class142.field1370.field1012;
		var4 = class142.field1370.field948;
		int var5 = field1745;

		for (class70 var15 = (class70)class70.field604.method6577(); null != var15; var15 = (class70)class70.field604.method6579()) {
			if (-1 != var15.field601 || var15.field605 != null) {
				int var7 = 0;
				if (var3 > var15.field597) {
					var7 += var3 - var15.field597;
				} else if (var3 < var15.field596) {
					var7 += var15.field596 - var3;
				}

				if (var4 > var15.field599) {
					var7 += var4 - var15.field599;
				} else if (var4 < var15.field594) {
					var7 += var15.field594 - var4;
				}

				if (var7 - 64 <= var15.field603 && class186.field2040.method1868() != 0 && var15.field600 == var2) {
					var7 -= 64;
					if (var7 < 0) {
						var7 = 0;
					}

					int var8 = (var15.field603 - var7) * class186.field2040.method1868() / var15.field603;
					class37 var10000;
					if (null == var15.field602) {
						if (var15.field601 >= 0) {
							var10000 = (class37)null;
							class37 var9 = class37.method481(class235.field2839, var15.field601, 0);
							if (null != var9) {
								class32 var10 = var9.method483().method424(class25.field131);
								class42 var11 = class42.method725(var10, 100, var8);
								var11.method727(-1);
								class76.field694.method1017(var11);
								var15.field602 = var11;
							}
						}
					} else {
						var15.field602.method728(var8);
					}

					if (null == var15.field607) {
						if (null != var15.field605 && (var15.field606 -= var5) <= 0) {
							int var13 = (int)(Math.random() * (double)var15.field605.length);
							var10000 = (class37)null;
							class37 var16 = class37.method481(class235.field2839, var15.field605[var13], 0);
							if (var16 != null) {
								class32 var17 = var16.method483().method424(class25.field131);
								class42 var12 = class42.method725(var17, 100, var8);
								var12.method727(0);
								class76.field694.method1017(var12);
								var15.field607 = var12;
								var15.field606 = var15.field598 + (int)(Math.random() * (double)(var15.field595 - var15.field598));
							}
						}
					} else {
						var15.field607.method728(var8);
						if (!var15.field607.method7949()) {
							var15.field607 = null;
						}
					}
				} else {
					if (null != var15.field602) {
						class76.field694.method1018(var15.field602);
						var15.field602 = null;
					}

					if (null != var15.field607) {
						class76.field694.method1018(var15.field607);
						var15.field607 = null;
					}
				}
			}
		}

		field1745 = 0;
	}

	public static class355 method4352() {
		return field1764;
	}

	static final void method1875(class98 var0, int var1) {
		class64.method1201(var0.field1012, var0.field948, var1);
	}

	boolean method3196(class109 var1, int var2) {
		if (var1.field1110 == 0) {
			class267.field3147 = null;
		} else {
			if (class267.field3147 == null) {
				class267.field3147 = new class367(class54.field404, class122.field1212);
			}

			class267.field3147.method6824(var1.field1106, var2);
		}

		field1792 = field1887;
		class267.field3143 = true;
		var1.field1107 = null;
		return true;
	}

	boolean method3192(class109 var1) {
		if (class267.field3147 != null) {
			class267.field3147.method6817(var1.field1106);
		}

		field1792 = field1887;
		class267.field3143 = true;
		var1.field1107 = null;
		return true;
	}

	final boolean method3483(class109 var1) {
		class411 var3 = var1.method2157();
		class466 var4 = var1.field1106;
		if (var3 == null) {
			return false;
		} else {
			String var22;
			int var28;
			try {
				int var6;
				if (null == var1.field1107) {
					if (var1.field1111) {
						if (!var3.method7616(1)) {
							return false;
						}

						var3.method7604(var1.field1106.field4917, 0, 1);
						var1.field1101 = 0;
						var1.field1111 = false;
					}

					var4.field4915 = 0;
					if (var4.method8272()) {
						if (!var3.method7616(1)) {
							return false;
						}

						var3.method7604(var1.field1106.field4917, 1, 1);
						var1.field1101 = 0;
					}

					var1.field1111 = true;
					class266[] var5 = class197.method3891();
					var6 = var4.method8282();
					if (var6 < 0 || var6 >= var5.length) {
						throw new IOException(var6 + " " + var4.field4915);
					}

					var1.field1107 = var5[var6];
					var1.field1110 = var1.field1107.field3059;
				}

				if (var1.field1110 == -1) {
					if (!var3.method7616(1)) {
						return false;
					}

					var1.method2157().method7604(var4.field4917, 0, 1);
					var1.field1110 = var4.field4917[0] & 255;
				}

				if (-2 == var1.field1110) {
					if (!var3.method7616(2)) {
						return false;
					}

					var1.method2157().method7604(var4.field4917, 0, 2);
					var4.field4915 = 0;
					var1.field1110 = var4.method8328();
				}

				if (!var3.method7616(var1.field1110)) {
					return false;
				}

				var4.field4915 = 0;
				var3.method7604(var4.field4917, 0, var1.field1110);
				var1.field1101 = 0;
				field1694.method6989();
				var1.field1114 = var1.field1113;
				var1.field1113 = var1.field1112;
				var1.field1112 = var1.field1107;
				if (var1.field1107 == class266.field3047) {
					class25.method344(class274.field3186);
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3032) {
					class25.method344(class274.field3183);
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3094) {
					class314.method6166(false, var4);
					var1.field1107 = null;
					return true;
				}

				if (class266.field3045 == var1.field1107) {
					if (class93.field910 == null) {
						class93.field910 = new class392(class51.field380);
					}

					class493 var55 = class51.field380.method7568(var4);
					class93.field910.field4525.method8159(var55.field5069, var55.field5070);
					field1894[++field1895 - 1 & 31] = var55.field5069;
					var1.field1107 = null;
					return true;
				}

				int var21;
				if (var1.field1107 == class266.field3085) {
					class173.field1632 = var4.method8326();
					class125.field1261 = var4.method8475();

					while (var4.field4915 < var1.field1110) {
						var21 = var4.method8326();
						class274 var80 = class274.method3894()[var21];
						class25.method344(var80);
					}

					var1.field1107 = null;
					return true;
				}

				class290 var7;
				int var8;
				int var9;
				int var10;
				if (var1.field1107 == class266.field3064) {
					var21 = var4.method8480();
					var6 = var4.method8328();
					if (var21 < -70000) {
						var6 += 32768;
					}

					if (var21 >= 0) {
						var7 = class180.method2988(var21);
					} else {
						var7 = null;
					}

					for (; var4.field4915 < var1.field1110; class9.method114(var6, var8, var9 - 1, var10)) {
						var8 = var4.method8340();
						var9 = var4.method8328();
						var10 = 0;
						if (var9 != 0) {
							var10 = var4.method8326();
							if (var10 == 255) {
								var10 = var4.method8480();
							}
						}

						if (null != var7 && var8 >= 0 && var8 < var7.field3392.length) {
							var7.field3392[var8] = var9;
							var7.field3438[var8] = var10;
						}
					}

					if (null != var7) {
						class53.method1040(var7);
					}

					class152.method2678();
					field1890[++field1891 - 1 & 31] = var6 & 32767;
					var1.field1107 = null;
					return true;
				}

				class224 var15;
				int var16;
				int var17;
				String var27;
				byte var75;
				if (var1.field1107 == class266.field3122) {
					var75 = var4.method8327();
					var22 = var4.method8335();
					long var23 = (long)var4.method8328();
					long var25 = (long)var4.method8330();
					class329 var61 = (class329)class78.method1584(class329.method2501(), var4.method8326());
					long var12 = var25 + (var23 << 32);
					boolean var69 = false;
					var15 = null;
					class170 var70 = var75 >= 0 ? field1814[var75] : class161.field1507;
					if (var70 == null) {
						var69 = true;
					} else {
						var16 = 0;

						while (true) {
							if (var16 >= 100) {
								if (var61.field4165 && class405.field4602.method1129(new class483(var22, class54.field404))) {
									var69 = true;
								}
								break;
							}

							if (var12 == field1705[var16]) {
								var69 = true;
								break;
							}

							++var16;
						}
					}

					if (!var69) {
						field1705[field1928] = var12;
						field1928 = (field1928 + 1) % 100;
						var27 = class369.method6886(class134.method2481(var4));
						var17 = var75 >= 0 ? 41 : 44;
						if (-1 != var61.field4163) {
							class381.method7106(var17, class79.method8214(var61.field4163) + var22, var27, var70.field1606);
						} else {
							class381.method7106(var17, var22, var27, var70.field1606);
						}
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3111) {
					field1953 = true;
					field1954 = false;
					class142.field1368 = var4.method8326();
					class51.field384 = var4.method8326();
					class65.field534 = var4.method8328();
					class47.field344 = var4.method8326();
					class213.field2536 = var4.method8326();
					if (class213.field2536 >= 100) {
						class141.field1363 = 64 + class142.field1368 * 128;
						class170.field1608 = class51.field384 * 128 + 64;
						class392.field4523 = class199.method3912(class141.field1363, class170.field1608, class384.field4486) - class65.field534;
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3034 == var1.field1107) {
					var21 = var4.method8367();
					if (var21 == 65535) {
						var21 = -1;
					}

					class164.method2767(var21);
					var1.field1107 = null;
					return true;
				}

				if (class266.field3087 == var1.field1107) {
					var21 = var4.method8405();
					var6 = var4.method8306();
					if (var6 == 65535) {
						var6 = -1;
					}

					class1.method4(var6, var21);
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3031) {
					class93.field910 = null;
					var1.field1107 = null;
					return true;
				}

				if (class266.field3106 == var1.field1107) {
					field1695 = field1887;
					var75 = var4.method8327();
					class134 var79 = new class134(var4);
					class170 var64;
					if (var75 >= 0) {
						var64 = field1814[var75];
					} else {
						var64 = class161.field1507;
					}

					var79.method2480(var64);
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3083) {
					var21 = var4.method8380();
					var6 = var4.method8368();
					var28 = var6 >> 10 & 31;
					var8 = var6 >> 5 & 31;
					var9 = var6 & 31;
					var10 = (var8 << 11) + (var28 << 19) + (var9 << 3);
					class290 var60 = class180.method2988(var21);
					if (var60.field3424 != var10) {
						var60.field3424 = var10;
						class53.method1040(var60);
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3129) {
					for (var21 = 0; var21 < field1816.length; ++var21) {
						if (field1816[var21] != null) {
							field1816[var21].field989 = -1;
						}
					}

					for (var21 = 0; var21 < field1934.length; ++var21) {
						if (field1934[var21] != null) {
							field1934[var21].field989 = -1;
						}
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3078) {
					var21 = var4.method8326();
					if (var4.method8326() == 0) {
						field1898[var21] = new class364();
						var4.field4915 += 18;
					} else {
						--var4.field4915;
						field1898[var21] = new class364(var4, false);
					}

					field1959 = field1887;
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3072) {
					class102.method2077(false, var1.field1106);
					var1.field1107 = null;
					return true;
				}

				if (class266.field3029 == var1.field1107) {
					class78 var54 = new class78();
					var54.field716 = var4.method8335();
					var54.field708 = var4.method8328();
					var6 = var4.method8480();
					var54.field714 = var6;
					class131.method2451(45);
					var3.method7609();
					var3 = null;
					class108.method2149(var54);
					var1.field1107 = null;
					return false;
				}

				if (var1.field1107 == class266.field3068) {
					method581();
					var75 = var4.method8327();
					if (var1.field1110 == 1) {
						if (var75 >= 0) {
							field1935[var75] = null;
						} else {
							class3.field22 = null;
						}

						var1.field1107 = null;
						return true;
					}

					if (var75 >= 0) {
						field1935[var75] = new class146(var4);
					} else {
						class3.field22 = new class146(var4);
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3060 == var1.field1107) {
					class25.method344(class274.field3175);
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3103) {
					class93.field911 = class218.method4526(var4.method8326());
					var1.field1107 = null;
					return true;
				}

				int var14;
				long var29;
				long var31;
				String var36;
				String var50;
				if (var1.field1107 == class266.field3116) {
					var50 = var4.method8335();
					var29 = (long)var4.method8328();
					var31 = (long)var4.method8330();
					class329 var33 = (class329)class78.method1584(class329.method2501(), var4.method8326());
					long var34 = var31 + (var29 << 32);
					boolean var65 = false;

					for (var14 = 0; var14 < 100; ++var14) {
						if (field1705[var14] == var34) {
							var65 = true;
							break;
						}
					}

					if (class405.field4602.method1129(new class483(var50, class54.field404))) {
						var65 = true;
					}

					if (!var65 && 0 == field1873) {
						field1705[field1928] = var34;
						field1928 = (1 + field1928) % 100;
						var36 = class369.method6886(class203.method4001(class134.method2481(var4)));
						byte var84;
						if (var33.field4151) {
							var84 = 7;
						} else {
							var84 = 3;
						}

						if (-1 != var33.field4163) {
							class105.method2785(var84, class79.method8214(var33.field4163) + var50, var36);
						} else {
							class105.method2785(var84, var50, var36);
						}
					}

					var1.field1107 = null;
					return true;
				}

				int var13;
				int var18;
				int var19;
				class62 var20;
				int var37;
				int var39;
				byte var62;
				int var85;
				byte var88;
				if (class266.field3118 == var1.field1107) {
					var62 = var4.method8327();
					var28 = var4.method8371();
					var21 = var28 >> 16;
					var6 = var28 >> 8 & 255;
					var8 = (var28 >> 4 & 7) + var21;
					var9 = (var28 & 7) + var6;
					var85 = var4.method8329();
					var16 = var4.method8368();
					var88 = var4.method8494();
					var18 = var4.method8475();
					var14 = var4.method8478() * 4;
					var17 = var4.method8368();
					var19 = var4.method8326();
					var13 = var4.method8367();
					var37 = var4.method8478() * 4;
					var10 = var62 + var8;
					var39 = var88 + var9;
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var39 >= 0 && var10 < 104 && var39 < 104 && var13 != 65535) {
						var8 = var8 * 128 + 64;
						var9 = 64 + var9 * 128;
						var10 = 64 + var10 * 128;
						var39 = var39 * 128 + 64;
						var20 = new class62(var13, class384.field4486, var8, var9, class199.method3912(var8, var9, class384.field4486) - var14, field1700 + var16, var17 + field1700, var18, var19, var85, var37);
						var20.method1185(var10, var39, class199.method3912(var10, var39, class384.field4486) - var37, field1700 + var16);
						field1831.method6572(var20);
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3039 == var1.field1107) {
					var37 = var4.method8357() * 4;
					var88 = var4.method8494();
					var18 = var4.method8326();
					var62 = var4.method8494();
					var13 = var4.method8368();
					var85 = var4.method8450();
					var28 = var4.method8370();
					var21 = var28 >> 16;
					var6 = var28 >> 8 & 255;
					var8 = (var28 >> 4 & 7) + var21;
					var9 = var6 + (var28 & 7);
					var14 = var4.method8326() * 4;
					var19 = var4.method8475();
					var16 = var4.method8306();
					var17 = var4.method8368();
					var10 = var62 + var8;
					var39 = var88 + var9;
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var39 >= 0 && var10 < 104 && var39 < 104 && var13 != 65535) {
						var8 = var8 * 128 + 64;
						var9 = 64 + var9 * 128;
						var10 = 64 + var10 * 128;
						var39 = 64 + var39 * 128;
						var20 = new class62(var13, class384.field4486, var8, var9, class199.method3912(var8, var9, class384.field4486) - var14, var16 + field1700, var17 + field1700, var18, var19, var85, var37);
						var20.method1185(var10, var39, class199.method3912(var10, var39, class384.field4486) - var37, var16 + field1700);
						field1831.method6572(var20);
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3048 == var1.field1107) {
					class405.field4602.field471.method7018(var4, var1.field1110);
					class248.method4924();
					field1897 = field1887;
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3026) {
					var21 = var4.method8367();
					byte var71 = var4.method8477();
					class305.field3660[var21] = var71;
					if (var71 != class305.field3661[var21]) {
						class305.field3661[var21] = var71;
					}

					class97.method2040(var21);
					field1888[++field1889 - 1 & 31] = var21;
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3088) {
					class405.field4602.method1142();
					field1897 = field1887;
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3121) {
					var21 = var4.method8357();
					var22 = var4.method8335();
					var28 = var4.method8326();
					if (var28 >= 1 && var28 <= 8) {
						if (var22.equalsIgnoreCase(class321.field3756)) {
							var22 = null;
						}

						field1825[var28 - 1] = var22;
						field1826[var28 - 1] = var21 == 0;
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3069 == var1.field1107) {
					var21 = var4.method8306();
					class88 var93;
					if (var21 == field1817) {
						var93 = class142.field1370;
					} else {
						var93 = field1816[var21];
					}

					var6 = var4.method8367();
					var28 = var4.method8380();
					if (var93 != null) {
						var93.field994 = var6;
						var93.field1016 = var28 >> 16;
						var93.field997 = (var28 & 65535) + field1700;
						var93.field995 = 0;
						var93.field984 = 0;
						if (var93.field997 > field1700) {
							var93.field995 = -1;
						}

						if (var93.field994 == 65535) {
							var93.field994 = -1;
						}
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3117) {
					class102.method2077(true, var1.field1106);
					var1.field1107 = null;
					return true;
				}

				if (class266.field3051 == var1.field1107) {
					field1706 = var4.method8306() * 30;
					field1903 = field1887;
					var1.field1107 = null;
					return true;
				}

				if (class266.field3071 == var1.field1107) {
					field1695 = field1887;
					var75 = var4.method8327();
					if (var1.field1110 == 1) {
						if (var75 >= 0) {
							field1814[var75] = null;
						} else {
							class161.field1507 = null;
						}

						var1.field1107 = null;
						return true;
					}

					if (var75 >= 0) {
						field1814[var75] = new class170(var4);
					} else {
						class161.field1507 = new class170(var4);
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3022) {
					var21 = var4.method8306();
					field1862 = var21;
					this.method3491(false);
					class53.method1039(var21);
					class47.method920(field1862);

					for (var6 = 0; var6 < 100; ++var6) {
						field1913[var6] = true;
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3123 == var1.field1107) {
					class25.method344(class274.field3179);
					var1.field1107 = null;
					return true;
				}

				if (class266.field3134 == var1.field1107) {
					class152.method2678();
					field1811 = var4.method8328();
					field1903 = field1887;
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3082) {
					for (var21 = 0; var21 < class165.field1534; ++var21) {
						class165 var78 = class127.method2404(var21);
						if (var78 != null) {
							class305.field3660[var21] = 0;
							class305.field3661[var21] = 0;
						}
					}

					class152.method2678();
					field1889 += 32;
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3076) {
					field1953 = false;

					for (var21 = 0; var21 < 5; ++var21) {
						field1955[var21] = false;
					}

					var1.field1107 = null;
					return true;
				}

				class290 var87;
				if (var1.field1107 == class266.field3119) {
					var21 = var4.method8369();
					var6 = var4.method8380();
					var28 = var4.method8329();
					var87 = class180.method2988(var6);
					if (var87.field3408 != var28 || var87.field3409 != var21 || 0 != var87.field3447 || 0 != var87.field3546) {
						var87.field3408 = var28;
						var87.field3409 = var21;
						var87.field3447 = 0;
						var87.field3546 = 0;
						class53.method1040(var87);
						this.method3484(var87);
						if (var87.field3536 == 0) {
							class164.method2766(class72.field625[var6 >> 16], var87, false);
						}
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3054 && field1953) {
					field1954 = true;
					class47.field344 = var4.method8326();
					class213.field2536 = var4.method8326();
					class408.field4615 = var4.method8326();
					class93.field907 = var4.method8326();

					for (var21 = 0; var21 < 5; ++var21) {
						field1955[var21] = false;
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3098) {
					class152.method2678();
					var21 = var4.method8380();
					var6 = var4.method8478();
					var28 = var4.method8478();
					field1835[var28] = var21;
					field1762[var28] = var6;
					field1834[var28] = 1;

					for (var8 = 0; var8 < 98; ++var8) {
						if (var21 >= class323.field4083[var8]) {
							field1834[var28] = var8 + 2;
						}
					}

					field1818[++field1893 - 1 & 31] = var28;
					var1.field1107 = null;
					return true;
				}

				if (class266.field3044 == var1.field1107) {
					method581();
					var75 = var4.method8327();
					class143 var77 = new class143(var4);
					class146 var59;
					if (var75 >= 0) {
						var59 = field1935[var75];
					} else {
						var59 = class3.field22;
					}

					var77.method2559(var59);
					var1.field1107 = null;
					return true;
				}

				if (class266.field3135 == var1.field1107) {
					var21 = var4.method8480();
					var6 = var4.method8478();
					short var82 = (short)var4.method8329();
					var8 = var4.method8368();
					class85 var92 = field1934[var8];
					if (var92 != null) {
						var92.method1724(var6, var21, var82);
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3067 == var1.field1107) {
					field1707 = var4.method8326();
					if (1 == field1707) {
						field1708 = var4.method8328();
					}

					if (field1707 >= 2 && field1707 <= 6) {
						if (2 == field1707) {
							field1713 = 64;
							field1808 = 64;
						}

						if (3 == field1707) {
							field1713 = 0;
							field1808 = 64;
						}

						if (4 == field1707) {
							field1713 = 128;
							field1808 = 64;
						}

						if (5 == field1707) {
							field1713 = 64;
							field1808 = 0;
						}

						if (field1707 == 6) {
							field1713 = 64;
							field1808 = 128;
						}

						field1707 = 2;
						field1710 = var4.method8328();
						field1751 = var4.method8328();
						field1712 = var4.method8326();
					}

					if (10 == field1707) {
						field1776 = var4.method8328();
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3062 == var1.field1107) {
					class25.method344(class274.field3172);
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3128) {
					var28 = var4.method8330();
					var21 = var28 >> 16;
					var6 = var28 >> 8 & 255;
					var8 = var21 + (var28 >> 4 & 7);
					var9 = (var28 & 7) + var6;
					var10 = var4.method8478();
					var39 = var10 >> 2;
					var85 = var10 & 3;
					var13 = field1761[var39];
					var14 = var4.method8306();
					if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
						if (var13 == 0) {
							class225 var68 = class33.field194.method4174(class384.field4486, var8, var9);
							if (var68 != null) {
								var16 = class215.method4664(var68.field2737);
								if (var39 == 2) {
									var68.field2730 = new class63(var16, 2, var85 + 4, class384.field4486, var8, var9, var14, false, var68.field2730);
									var68.field2736 = new class63(var16, 2, var85 + 1 & 3, class384.field4486, var8, var9, var14, false, var68.field2736);
								} else {
									var68.field2730 = new class63(var16, var39, var85, class384.field4486, var8, var9, var14, false, var68.field2730);
								}
							}
						} else if (var13 == 1) {
							class210 var67 = class33.field194.method4326(class384.field4486, var8, var9);
							if (null != var67) {
								var16 = class215.method4664(var67.field2432);
								if (var39 != 4 && var39 != 5) {
									if (var39 == 6) {
										var67.field2439 = new class63(var16, 4, var85 + 4, class384.field4486, var8, var9, var14, false, var67.field2439);
									} else if (var39 == 7) {
										var67.field2439 = new class63(var16, 4, (var85 + 2 & 3) + 4, class384.field4486, var8, var9, var14, false, var67.field2439);
									} else if (var39 == 8) {
										var67.field2439 = new class63(var16, 4, var85 + 4, class384.field4486, var8, var9, var14, false, var67.field2439);
										var67.field2440 = new class63(var16, 4, 4 + (var85 + 2 & 3), class384.field4486, var8, var9, var14, false, var67.field2440);
									}
								} else {
									var67.field2439 = new class63(var16, 4, var85, class384.field4486, var8, var9, var14, false, var67.field2439);
								}
							}
						} else if (var13 == 2) {
							var15 = class33.field194.method4176(class384.field4486, var8, var9);
							if (var39 == 11) {
								var39 = 10;
							}

							if (null != var15) {
								var15.field2714 = new class63(class215.method4664(var15.field2724), var39, var85, class384.field4486, var8, var9, var14, false, var15.field2714);
							}
						} else if (var13 == 3) {
							class227 var66 = class33.field194.method4251(class384.field4486, var8, var9);
							if (null != var66) {
								var66.field2744 = new class63(class215.method4664(var66.field2745), 22, var85, class384.field4486, var8, var9, var14, false, var66.field2744);
							}
						}
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3099 == var1.field1107) {
					class20.method302(var4, var1.field1110);
					class256.method5068();
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3066) {
					class202.field2320 = true;
					class20.method302(var4, var1.field1110);
					class256.method5068();
					var1.field1107 = null;
					return true;
				}

				class102 var86;
				if (var1.field1107 == class266.field3086) {
					var21 = var4.method8536();
					var6 = var4.method8478();
					var28 = var4.method8328();
					var86 = (class102)field1863.method8177((long)var21);
					if (var86 != null) {
						class2.method19(var86, var28 != var86.field1057);
					}

					class18.method214(var21, var28, var6);
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3127) {
					var21 = var4.method8361();
					var6 = var4.method8328();
					var28 = var4.method8328();
					var87 = class180.method2988(var21);
					var87.field3456 = (var6 << 16) + var28;
					var1.field1107 = null;
					return true;
				}

				if (class266.field3120 == var1.field1107) {
					return this.method3192(var1);
				}

				if (var1.field1107 == class266.field3131) {
					class25.method344(class274.field3184);
					var1.field1107 = null;
					return true;
				}

				if (class266.field3053 == var1.field1107) {
					return this.method3196(var1, 1);
				}

				class290 var41;
				if (var1.field1107 == class266.field3056) {
					var21 = var4.method8361();
					var6 = var4.method8480();
					class102 var58 = (class102)field1863.method8177((long)var21);
					var86 = (class102)field1863.method8177((long)var6);
					if (null != var86) {
						class2.method19(var86, null == var58 || var86.field1057 != var58.field1057);
					}

					if (null != var58) {
						var58.method7951();
						field1863.method8170(var58, (long)var6);
					}

					var41 = class180.method2988(var21);
					if (null != var41) {
						class53.method1040(var41);
					}

					var41 = class180.method2988(var6);
					if (var41 != null) {
						class53.method1040(var41);
						class164.method2766(class72.field625[var41.field3492 >>> 16], var41, true);
					}

					if (-1 != field1862) {
						method6246(field1862, 1);
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3136 == var1.field1107) {
					var21 = var4.method8536();
					var6 = var4.method8328();
					var7 = class180.method2988(var21);
					if (6 != var7.field3443 || var6 != var7.field3462) {
						var7.field3443 = 6;
						var7.field3462 = var6;
						class53.method1040(var7);
					}

					var1.field1107 = null;
					return true;
				}

				boolean var56;
				String var57;
				if (var1.field1107 == class266.field3024) {
					var21 = var4.method8340();
					var56 = var4.method8326() == 1;
					var57 = "";
					boolean var63 = false;
					if (var56) {
						var57 = var4.method8335();
						if (class405.field4602.method1129(new class483(var57, class54.field404))) {
							var63 = true;
						}
					}

					String var91 = var4.method8335();
					if (!var63) {
						class105.method2785(var21, var57, var91);
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3133 == var1.field1107) {
					byte[] var52 = new byte[var1.field1110];
					var4.method8268(var52, 0, var52.length);
					class467 var76 = new class467(var52);
					var57 = var76.method8335();
					class356.method6604(var57, true, false);
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3077) {
					method1947();
					var1.field1107 = null;
					return false;
				}

				if (var1.field1107 == class266.field3114) {
					var21 = var4.method8361();
					var6 = var4.method8367();
					var7 = class180.method2988(var21);
					if (var7.field3443 != 1 || var7.field3462 != var6) {
						var7.field3443 = 1;
						var7.field3462 = var6;
						class53.method1040(var7);
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3102 == var1.field1107) {
					var21 = var4.method8329();
					var6 = var4.method8380();
					var7 = class180.method2988(var6);
					if (var21 != var7.field3482 || var21 == -1) {
						var7.field3482 = var21;
						var7.field3539 = 0;
						var7.field3540 = 0;
						class53.method1040(var7);
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3042) {
					class204.field2336 = true;
					class314.method6166(false, var4);
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3033) {
					class25.method344(class274.field3181);
					var1.field1107 = null;
					return true;
				}

				if (class266.field3065 == var1.field1107) {
					class25.method344(class274.field3182);
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3075) {
					class125.field1261 = var4.method8357();
					class173.field1632 = var4.method8475();

					for (var21 = class173.field1632; var21 < class173.field1632 + 8; ++var21) {
						for (var6 = class125.field1261; var6 < 8 + class125.field1261; ++var6) {
							if (field1829[class384.field4486][var21][var6] != null) {
								field1829[class384.field4486][var21][var6] = null;
								class363.method6765(var21, var6);
							}
						}
					}

					for (class91 var51 = (class91)field1919.method6577(); null != var51; var51 = (class91)field1919.method6579()) {
						if (var51.field863 >= class173.field1632 && var51.field863 < 8 + class173.field1632 && var51.field875 >= class125.field1261 && var51.field875 < class125.field1261 + 8 && var51.field867 == class384.field4486) {
							var51.field876 = 0;
						}
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3107) {
					class93.field910 = new class392(class51.field380);
					var1.field1107 = null;
					return true;
				}

				class85 var40;
				if (class266.field3112 == var1.field1107) {
					var28 = var4.method8475();
					var21 = var4.method8367();
					var6 = var4.method8306();
					if (var6 == 65535) {
						var6 = -1;
					}

					var40 = field1934[var21];
					if (null != var40) {
						if (var40.field989 == var6 && var6 != -1) {
							var9 = class214.method4351(var6).field1991;
							if (var9 == 1) {
								var40.field980 = 0;
								var40.field991 = 0;
								var40.field992 = var28;
								var40.field993 = 0;
							} else if (var9 == 2) {
								var40.field993 = 0;
							}
						} else if (var6 == -1 || var40.field989 == -1 || class214.method4351(var6).field2015 >= class214.method4351(var40.field989).field2015) {
							var40.field989 = var6;
							var40.field980 = 0;
							var40.field991 = 0;
							var40.field992 = var28;
							var40.field993 = 0;
							var40.field1022 = var40.field947;
						}
					}

					var1.field1107 = null;
					return true;
				}

				long var42;
				long var45;
				if (class266.field3036 == var1.field1107) {
					var50 = var4.method8335();
					var29 = var4.method8492();
					var31 = (long)var4.method8328();
					var42 = (long)var4.method8330();
					class329 var94 = (class329)class78.method1584(class329.method2501(), var4.method8326());
					var45 = (var31 << 32) + var42;
					boolean var83 = false;

					for (var16 = 0; var16 < 100; ++var16) {
						if (var45 == field1705[var16]) {
							var83 = true;
							break;
						}
					}

					if (var94.field4165 && class405.field4602.method1129(new class483(var50, class54.field404))) {
						var83 = true;
					}

					if (!var83 && 0 == field1873) {
						field1705[field1928] = var45;
						field1928 = (1 + field1928) % 100;
						var27 = class369.method6886(class203.method4001(class134.method2481(var4)));
						if (-1 != var94.field4163) {
							class381.method7106(9, class79.method8214(var94.field4163) + var50, var27, class361.method6603(var29));
						} else {
							class381.method7106(9, var50, var27, class361.method6603(var29));
						}
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3050) {
					class405.field4602.method1131(var4, var1.field1110);
					field1897 = field1887;
					var1.field1107 = null;
					return true;
				}

				boolean var81;
				if (var1.field1107 == class266.field3130) {
					var81 = var4.method8326() == 1;
					if (var81) {
						class251.field2948 = class74.method1493() - var4.method8492();
						class81.field751 = new class330(var4, true);
					} else {
						class81.field751 = null;
					}

					field1902 = field1887;
					var1.field1107 = null;
					return true;
				}

				if (class266.field3063 == var1.field1107) {
					class25.method344(class274.field3174);
					var1.field1107 = null;
					return true;
				}

				if (class266.field3091 == var1.field1107) {
					field1765 = var4.method8326();
					var1.field1107 = null;
					return true;
				}

				if (class266.field3125 == var1.field1107) {
					var21 = var4.method8380();
					var6 = var4.method8367();
					if (var6 == 65535) {
						var6 = -1;
					}

					var28 = var4.method8380();
					var8 = var4.method8367();
					if (var8 == 65535) {
						var8 = -1;
					}

					for (var9 = var6; var9 <= var8; ++var9) {
						var42 = (long)var9 + ((long)var21 << 32);
						class428 var44 = field1740.method8177(var42);
						if (null != var44) {
							var44.method7951();
						}

						field1740.method8170(new class429(var28), var42);
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3027) {
					var21 = var4.method8367();
					var6 = var4.method8536();
					class305.field3660[var21] = var6;
					if (class305.field3661[var21] != var6) {
						class305.field3661[var21] = var6;
					}

					class97.method2040(var21);
					field1888[++field1889 - 1 & 31] = var21;
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3124) {
					var81 = var4.method8333();
					if (var81) {
						if (null == class40.field285) {
							class40.field285 = new class357();
						}
					} else {
						class40.field285 = null;
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3040 == var1.field1107) {
					var10 = var4.method8306();
					var28 = var4.method8405();
					var21 = var28 >> 16;
					var6 = var28 >> 8 & 255;
					var8 = var21 + (var28 >> 4 & 7);
					var9 = (var28 & 7) + var6;
					var39 = var4.method8478();
					var85 = var4.method8368();
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
						var8 = 64 + var8 * 128;
						var9 = var9 * 128 + 64;
						class66 var95 = new class66(var10, class384.field4486, var8, var9, class199.method3912(var8, var9, class384.field4486) - var39, var85, field1700);
						field1821.method6572(var95);
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3046 == var1.field1107) {
					var21 = var4.method8326();
					method5255(var21);
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3089) {
					var21 = var4.method8480();
					var6 = var4.method8480();
					var28 = class274.method5312();
					class284 var89 = class152.method2679(class276.field3196, field1748.field1105);
					var89.field3321.method8377(var21);
					var89.field3321.method8375(var6);
					var89.field3321.method8323(class40.field260);
					var89.field3321.method8323(var28);
					field1748.method2173(var89);
					var1.field1107 = null;
					return true;
				}

				if (class266.field3073 == var1.field1107) {
					for (var21 = 0; var21 < class305.field3661.length; ++var21) {
						if (class305.field3660[var21] != class305.field3661[var21]) {
							class305.field3661[var21] = class305.field3660[var21];
							class97.method2040(var21);
							field1888[++field1889 - 1 & 31] = var21;
						}
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3084) {
					class181.method2995(var4, var1.field1110);
					var1.field1107 = null;
					return true;
				}

				if (class266.field3052 == var1.field1107) {
					class25.method344(class274.field3185);
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3043) {
					var50 = var4.method8335();
					var22 = class369.method6886(class203.method4001(class134.method2481(var4)));
					class105.method2785(6, var50, var22);
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3037) {
					var21 = var4.method8480();
					class102 var74 = (class102)field1863.method8177((long)var21);
					if (null != var74) {
						class2.method19(var74, true);
					}

					if (field1868 != null) {
						class53.method1040(field1868);
						field1868 = null;
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3115) {
					class116.method2212(var4.method8335());
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3038) {
					var50 = var4.method8335();
					var6 = var4.method8536();
					var7 = class180.method2988(var6);
					if (!var50.equals(var7.field3461)) {
						var7.field3461 = var50;
						class53.method1040(var7);
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3093) {
					var21 = var4.method8328();
					var6 = var4.method8536();
					var7 = class180.method2988(var6);
					if (2 != var7.field3443 || var21 != var7.field3462) {
						var7.field3443 = 2;
						var7.field3462 = var21;
						class53.method1040(var7);
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3104 == var1.field1107) {
					var21 = var4.method8328();
					var6 = var4.method8326();
					var28 = var4.method8328();
					class5.method42(var21, var6, var28);
					var1.field1107 = null;
					return true;
				}

				if (class266.field3095 == var1.field1107) {
					var21 = var4.method8480();
					var6 = var4.method8328();
					if (var21 < -70000) {
						var6 += 32768;
					}

					if (var21 >= 0) {
						var7 = class180.method2988(var21);
					} else {
						var7 = null;
					}

					if (var7 != null) {
						for (var8 = 0; var8 < var7.field3392.length; ++var8) {
							var7.field3392[var8] = 0;
							var7.field3438[var8] = 0;
						}
					}

					class65.method1219(var6);
					var8 = var4.method8328();

					for (var9 = 0; var9 < var8; ++var9) {
						var10 = var4.method8357();
						if (var10 == 255) {
							var10 = var4.method8380();
						}

						var39 = var4.method8306();
						if (var7 != null && var9 < var7.field3392.length) {
							var7.field3392[var9] = var39;
							var7.field3438[var9] = var10;
						}

						class9.method114(var6, var9, var39 - 1, var10);
					}

					if (null != var7) {
						class53.method1040(var7);
					}

					class152.method2678();
					field1890[++field1891 - 1 & 31] = var6 & 32767;
					var1.field1107 = null;
					return true;
				}

				if (class266.field3096 == var1.field1107) {
					class314.method6166(true, var4);
					var1.field1107 = null;
					return true;
				}

				if (class266.field3049 == var1.field1107) {
					var4.field4915 += 28;
					if (var4.method8353()) {
						method2033(var4, var4.field4915 - 28);
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3061 == var1.field1107) {
					class25.method344(class274.field3176);
					var1.field1107 = null;
					return true;
				}

				if (class266.field3138 == var1.field1107) {
					var21 = var4.method8306();
					if (var21 == 65535) {
						var21 = -1;
					}

					var6 = var4.method8536();
					var28 = var4.method8380();
					var87 = class180.method2988(var6);
					class200 var90;
					if (!var87.field3398) {
						if (var21 == -1) {
							var87.field3443 = 0;
							var1.field1107 = null;
							return true;
						}

						var90 = class208.method4105(var21);
						var87.field3443 = 4;
						var87.field3462 = var21;
						var87.field3467 = var90.field2265;
						var87.field3454 = var90.field2266;
						var87.field3382 = var90.field2264 * 100 / var28;
						class53.method1040(var87);
					} else {
						var87.field3404 = var21;
						var87.field3538 = var28;
						var90 = class208.method4105(var21);
						var87.field3467 = var90.field2265;
						var87.field3454 = var90.field2266;
						var87.field3453 = var90.field2273;
						var87.field3449 = var90.field2268;
						var87.field3544 = var90.field2253;
						var87.field3382 = var90.field2264;
						if (var90.field2270 == 1) {
							var87.field3459 = 1;
						} else {
							var87.field3459 = 2;
						}

						if (var87.field3517 > 0) {
							var87.field3382 = var87.field3382 * 32 / var87.field3517;
						} else if (var87.field3410 > 0) {
							var87.field3382 = var87.field3382 * 32 / var87.field3410;
						}

						class53.method1040(var87);
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3132 == var1.field1107) {
					class25.method344(class274.field3178);
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3126) {
					class125.field1261 = var4.method8475();
					class173.field1632 = var4.method8475();
					var1.field1107 = null;
					return true;
				}

				if (class266.field3110 == var1.field1107) {
					var21 = var4.method8536();
					var6 = var4.method8367();
					var28 = var4.method8367();
					var8 = var4.method8367();
					var41 = class180.method2988(var21);
					if (var6 != var41.field3467 || var41.field3454 != var8 || var28 != var41.field3382) {
						var41.field3467 = var6;
						var41.field3454 = var8;
						var41.field3382 = var28;
						class53.method1040(var41);
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3108 == var1.field1107) {
					var21 = var1.field1110 + var4.field4915;
					var6 = var4.method8328();
					var28 = var4.method8328();
					if (field1862 != var6) {
						field1862 = var6;
						this.method3491(false);
						class53.method1039(field1862);
						class47.method920(field1862);

						for (var8 = 0; var8 < 100; ++var8) {
							field1913[var8] = true;
						}
					}

					class102 var11;
					for (; var28-- > 0; var11.field1053 = true) {
						var8 = var4.method8480();
						var9 = var4.method8328();
						var10 = var4.method8326();
						var11 = (class102)field1863.method8177((long)var8);
						if (var11 != null && var11.field1057 != var9) {
							class2.method19(var11, true);
							var11 = null;
						}

						if (var11 == null) {
							var11 = class18.method214(var8, var9, var10);
						}
					}

					for (var86 = (class102)field1863.method8172(); var86 != null; var86 = (class102)field1863.method8173()) {
						if (var86.field1053) {
							var86.field1053 = false;
						} else {
							class2.method19(var86, true);
						}
					}

					field1740 = new class458(512);

					while (var4.field4915 < var21) {
						var8 = var4.method8480();
						var9 = var4.method8328();
						var10 = var4.method8328();
						var39 = var4.method8480();

						for (var85 = var9; var85 <= var10; ++var85) {
							var45 = ((long)var8 << 32) + (long)var85;
							field1740.method8170(new class429(var39), var45);
						}
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3041 == var1.field1107) {
					var6 = var4.method8536();
					var21 = var4.method8328();
					var40 = field1934[var21];
					var28 = var4.method8328();
					if (var40 != null) {
						var40.field994 = var28;
						var40.field1016 = var6 >> 16;
						var40.field997 = (var6 & 65535) + field1700;
						var40.field995 = 0;
						var40.field984 = 0;
						if (var40.field997 > field1700) {
							var40.field995 = -1;
						}

						if (65535 == var40.field994) {
							var40.field994 = -1;
						}
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3074) {
					class25.method344(class274.field3180);
					var1.field1107 = null;
					return true;
				}

				if (class266.field3058 == var1.field1107) {
					if (-1 != field1862) {
						method6246(field1862, 0);
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3035 == var1.field1107) {
					field1953 = true;
					field1954 = false;
					class127.field1266 = var4.method8326();
					class140.field1357 = var4.method8326();
					class112.field1140 = var4.method8328();
					class408.field4615 = var4.method8326();
					class93.field907 = var4.method8326();
					if (class93.field907 >= 100) {
						var21 = class127.field1266 * 128 + 64;
						var6 = 64 + class140.field1357 * 128;
						var28 = class199.method3912(var21, var6, class384.field4486) - class112.field1140;
						var8 = var21 - class141.field1363;
						var9 = var28 - class392.field4523;
						var10 = var6 - class170.field1608;
						var39 = (int)Math.sqrt((double)(var10 * var10 + var8 * var8));
						class79.field730 = (int)(Math.atan2((double)var9, (double)var39) * 325.9490051269531D) & 2047;
						class113.field1145 = (int)(Math.atan2((double)var8, (double)var10) * -325.9490051269531D) & 2047;
						if (class79.field730 < 128) {
							class79.field730 = 128;
						}

						if (class79.field730 > 383) {
							class79.field730 = 383;
						}
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3105 == var1.field1107) {
					var75 = var4.method8327();
					var29 = (long)var4.method8328();
					var31 = (long)var4.method8330();
					var42 = var31 + (var29 << 32);
					boolean var38 = false;
					class170 var47 = var75 >= 0 ? field1814[var75] : class161.field1507;
					if (var47 == null) {
						var38 = true;
					} else {
						for (var14 = 0; var14 < 100; ++var14) {
							if (field1705[var14] == var42) {
								var38 = true;
								break;
							}
						}
					}

					if (!var38) {
						field1705[field1928] = var42;
						field1928 = (1 + field1928) % 100;
						var36 = class134.method2481(var4);
						var37 = var75 >= 0 ? 43 : 46;
						class381.method7106(var37, "", var36, var47.field1606);
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3080) {
					class152.method2678();
					field1811 = var4.method8326();
					field1811 = field1811 * 664161535 * 100 * 809546495;
					field1903 = field1887;
					var1.field1107 = null;
					return true;
				}

				if (class266.field3030 == var1.field1107) {
					var21 = var4.method8380();
					var56 = var4.method8326() == 1;
					var7 = class180.method2988(var21);
					if (var56 != var7.field3452) {
						var7.field3452 = var56;
						class53.method1040(var7);
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3109) {
					class204.field2336 = true;
					class314.method6166(true, var4);
					var1.field1107 = null;
					return true;
				}

				class290 var72;
				if (class266.field3070 == var1.field1107) {
					var21 = var4.method8380();
					var72 = class180.method2988(var21);
					var72.field3443 = 3;
					var72.field3462 = class142.field1370.field827.method6051();
					class53.method1040(var72);
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3081) {
					class152.method2678();
					field1870 = var4.method8329();
					field1903 = field1887;
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3028) {
					var1.field1107 = null;
					return true;
				}

				if (class266.field3090 == var1.field1107) {
					return this.method3196(var1, 2);
				}

				if (class266.field3023 == var1.field1107) {
					var21 = var4.method8480();
					if (var21 != field1971) {
						field1971 = var21;
						method4043();
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3057) {
					var50 = var4.method8335();
					Object[] var73 = new Object[var50.length() + 1];

					for (var28 = var50.length() - 1; var28 >= 0; --var28) {
						if (var50.charAt(var28) == 's') {
							var73[var28 + 1] = var4.method8335();
						} else {
							var73[var28 + 1] = new Integer(var4.method8480());
						}
					}

					var73[0] = new Integer(var4.method8480());
					class80 var53 = new class80();
					var53.field735 = var73;
					class69.method2874(var53);
					var1.field1107 = null;
					return true;
				}

				if (class266.field3097 == var1.field1107) {
					var21 = var4.method8480();
					var6 = var4.method8367();
					var7 = class180.method2988(var21);
					if (null != var7 && 0 == var7.field3536) {
						if (var6 > var7.field3423 - var7.field3474) {
							var6 = var7.field3423 - var7.field3474;
						}

						if (var6 < 0) {
							var6 = 0;
						}

						if (var6 != var7.field3421) {
							var7.field3421 = var6;
							class53.method1040(var7);
						}
					}

					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3101) {
					var21 = var4.method8368();
					class81.method1198(var21);
					field1890[++field1891 - 1 & 31] = var21 & 32767;
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3092) {
					var21 = var4.method8326();
					var6 = var4.method8326();
					var28 = var4.method8326();
					var8 = var4.method8326();
					field1955[var21] = true;
					field1985[var21] = var6;
					field1957[var21] = var28;
					field1958[var21] = var8;
					field1799[var21] = 0;
					var1.field1107 = null;
					return true;
				}

				if (class266.field3113 == var1.field1107) {
					field1942 = var4.method8326();
					if (255 == field1942) {
						field1942 = 0;
					}

					field1688 = var4.method8326();
					if (field1688 == 255) {
						field1688 = 0;
					}

					var1.field1107 = null;
					return true;
				}

				if (class266.field3079 == var1.field1107) {
					var21 = var4.method8480();
					var72 = class180.method2988(var21);

					for (var28 = 0; var28 < var72.field3392.length; ++var28) {
						var72.field3392[var28] = -1;
						var72.field3392[var28] = 0;
					}

					class53.method1040(var72);
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3100) {
					var21 = var4.method8326();
					method6050(var21);
					var1.field1107 = null;
					return false;
				}

				if (class266.field3055 == var1.field1107) {
					field1924 = var4.method8326();
					field1925 = var4.method8475();
					var1.field1107 = null;
					return true;
				}

				if (var1.field1107 == class266.field3025) {
					class25.method344(class274.field3173);
					var1.field1107 = null;
					return true;
				}

				class150.method2660("" + (null != var1.field1107 ? -170435115 * var1.field1107.field3137 * 1034875773 : -1) + class79.field723 + (var1.field1113 != null ? -170435115 * var1.field1113.field3137 * 1034875773 : -1) + class79.field723 + (var1.field1114 != null ? var1.field1114.field3137 : -1) + class79.field723 + var1.field1110, (Throwable)null);
				method1947();
			} catch (IOException var48) {
				method4692();
			} catch (Exception var49) {
				var22 = "" + (var1.field1107 != null ? var1.field1107.field3137 : -1) + class79.field723 + (null != var1.field1113 ? -170435115 * var1.field1113.field3137 * 1034875773 : -1) + class79.field723 + (var1.field1114 != null ? var1.field1114.field3137 : -1) + class79.field723 + var1.field1110 + class79.field723 + (class151.field1447 + class142.field1370.field973[0]) + class79.field723 + (class142.field1370.field1021[0] + class388.field4509) + class79.field723;

				for (var28 = 0; var28 < var1.field1110 && var28 < 50; ++var28) {
					var22 = var22 + var4.field4917[var28] + class79.field723;
				}

				class150.method2660(var22, var49);
				method1947();
			}

			return true;
		}
	}

	static class189 method4631(int var0, int var1) {
		field1987.field2055 = var0;
		field1987.field2058 = var1;
		field1987.field2056 = 1;
		field1987.field2057 = 1;
		return field1987;
	}

	static void method4887() {
		field1838 = 0;
		field1837 = false;
	}

	static void method6843() {
		method4887();
		field1844[0] = class321.field3837;
		field1725[0] = "";
		field1932[0] = 1006;
		field1846[0] = false;
		field1838 = 1;
	}

	static final boolean method3643() {
		return field1837;
	}

	final void method3412() {
		boolean var2 = false;

		int var3;
		int var6;
		while (!var2) {
			var2 = true;

			for (var3 = 0; var3 < field1838 - 1; ++var3) {
				if (field1932[var3] < 1000 && field1932[var3 + 1] > 1000) {
					String var4 = field1725[var3];
					field1725[var3] = field1725[var3 + 1];
					field1725[var3 + 1] = var4;
					String var5 = field1844[var3];
					field1844[var3] = field1844[var3 + 1];
					field1844[var3 + 1] = var5;
					var6 = field1932[var3];
					field1932[var3] = field1932[var3 + 1];
					field1932[var3 + 1] = var6;
					var6 = field1839[var3];
					field1839[var3] = field1839[var3 + 1];
					field1839[var3 + 1] = var6;
					var6 = field1832[var3];
					field1832[var3] = field1832[var3 + 1];
					field1832[var3 + 1] = var6;
					var6 = field1802[var3];
					field1802[var3] = field1802[var3 + 1];
					field1802[var3 + 1] = var6;
					var6 = field1843[var3];
					field1843[var3] = field1843[var3 + 1];
					field1843[var3 + 1] = var6;
					boolean var7 = field1846[var3];
					field1846[var3] = field1846[var3 + 1];
					field1846[var3 + 1] = var7;
					var2 = false;
				}
			}
		}

		if (null == class385.field4502) {
			if (null == field1875) {
				int var22;
				label272: {
					int var21 = class28.field165;
					int var8;
					int var10;
					int var12;
					int var17;
					int var23;
					if (field1837) {
						int var16;
						if (var21 != 1 && (class218.field2651 || var21 != 4)) {
							var3 = class28.field158;
							var16 = class28.field153;
							if (var3 < class161.field1506 - 10 || var3 > 10 + class104.field1078 + class161.field1506 || var16 < class85.field792 - 10 || var16 > class28.field169 + class85.field792 + 10) {
								field1837 = false;
								class33.method428(class161.field1506, class85.field792, class104.field1078, class28.field169);
							}
						}

						if (var21 == 1 || !class218.field2651 && var21 == 4) {
							var3 = class161.field1506;
							var16 = class85.field792;
							var17 = class104.field1078;
							var6 = class28.field166;
							var22 = class28.field162;
							var8 = -1;

							for (var23 = 0; var23 < field1838; ++var23) {
								var10 = 15 * (field1838 - 1 - var23) + var16 + 31;
								if (var6 > var3 && var6 < var17 + var3 && var22 > var10 - 13 && var22 < var10 + 3) {
									var8 = var23;
								}
							}

							if (var8 != -1 && var8 >= 0) {
								var23 = field1839[var8];
								var10 = field1832[var8];
								int var24 = field1932[var8];
								var12 = field1802[var8];
								int var13 = field1843[var8];
								String var14 = field1844[var8];
								String var15 = field1725[var8];
								class212.method4343(var23, var10, var24, var12, var13, var14, var15, class28.field166, class28.field162);
							}

							field1837 = false;
							class33.method428(class161.field1506, class85.field792, class104.field1078, class28.field169);
						}
					} else {
						var3 = field1838 - 1;
						if ((var21 == 1 || !class218.field2651 && var21 == 4) && var3 >= 0) {
							var17 = field1932[var3];
							if (var17 == 39 || var17 == 40 || var17 == 41 || var17 == 42 || var17 == 43 || var17 == 33 || var17 == 34 || var17 == 35 || var17 == 36 || var17 == 37 || var17 == 38 || var17 == 1005) {
								var6 = field1839[var3];
								var22 = field1832[var3];
								class290 var18 = class180.method2988(var22);
								var10 = class182.method3010(var18);
								boolean var9 = 0 != (var10 >> 28 & 1);
								if (var9) {
									break label272;
								}

								var12 = class182.method3010(var18);
								boolean var11 = (var12 >> 29 & 1) != 0;
								if (var11) {
									break label272;
								}
							}
						}

						if ((var21 == 1 || !class218.field2651 && var21 == 4) && this.method3031()) {
							var21 = 2;
						}

						if ((var21 == 1 || !class218.field2651 && var21 == 4) && field1838 > 0 && var3 >= 0) {
							var17 = field1839[var3];
							var6 = field1832[var3];
							var22 = field1932[var3];
							var8 = field1802[var3];
							var23 = field1843[var3];
							String var20 = field1844[var3];
							String var19 = field1725[var3];
							class212.method4343(var17, var6, var22, var8, var23, var20, var19, class28.field166, class28.field162);
						}

						if (var21 == 2 && field1838 > 0) {
							this.method3032(class28.field166, class28.field162);
						}
					}

					return;
				}

				if (null != class385.field4502 && !field1812 && field1838 > 0 && !this.method3031()) {
					method4970(field1809, field1810);
				}

				field1812 = false;
				field1813 = 0;
				if (null != class385.field4502) {
					class53.method1040(class385.field4502);
				}

				class385.field4502 = class180.method2988(var22);
				field1800 = var6;
				field1809 = class28.field166;
				field1810 = class28.field162;
				if (var3 >= 0) {
					method425(var3);
				}

				class53.method1040(class385.field4502);
			}
		}
	}

	final boolean method3031() {
		int var2 = field1838 - 1;
		return (field1780 && field1838 > 2 || class267.method5274(var2)) && !field1846[var2];
	}

	final void method3032(int var1, int var2) {
		int var4 = class140.field1352.method6901(class321.field3970);

		int var5;
		int var6;
		for (var5 = 0; var5 < field1838; ++var5) {
			var6 = class140.field1352.method6901(class51.method1016(var5));
			if (var6 > var4) {
				var4 = var6;
			}
		}

		var4 += 8;
		var5 = 22 + field1838 * 15;
		var6 = var1 - var4 / 2;
		if (var4 + var6 > class205.field2337) {
			var6 = class205.field2337 - var4;
		}

		if (var6 < 0) {
			var6 = 0;
		}

		int var7 = var2;
		if (var5 + var2 > class340.field4263) {
			var7 = class340.field4263 - var5;
		}

		if (var7 < 0) {
			var7 = 0;
		}

		class161.field1506 = var6;
		class85.field792 = var7;
		class104.field1078 = var4;
		class28.field169 = field1838 * 15 + 22;
		var1 -= field1841;
		var2 -= field1969;
		class33.field194.method4210(class384.field4486, var1, var2, false);
		field1837 = true;
	}

	static final void method5311(class71 var0, int var1, int var2) {
		if (var0 != null) {
			class212.method4343(var0.field618, var0.field614, var0.field612, var0.field613, var0.field616, var0.field615, var0.field611, var1, var2);
		}

	}

	static void method5352(int var0, int var1) {
		class284 var3 = class152.method2679(class276.field3286, field1748.field1105);
		var3.field3321.method8364(var1);
		var3.field3321.method8312(var0);
		field1748.method2173(var3);
	}

	public static final void method1404(String var0, String var1, int var2, int var3, int var4, int var5) {
		class38.method497(var0, var1, var2, var3, var4, var5, -1, false);
	}

	static final void method1206(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		class38.method497(var0, var1, var2, var3, var4, var5, var6, false);
	}

	final void method3491(boolean var1) {
		method6942(field1862, class205.field2337, class340.field4263, var1);
	}

	void method3484(class290 var1) {
		class290 var3 = var1.field3418 == -1 ? null : class180.method2988(var1.field3418);
		int var4;
		int var5;
		if (null == var3) {
			var4 = class205.field2337;
			var5 = class340.field4263;
		} else {
			var4 = var3.field3414;
			var5 = var3.field3474;
		}

		class88.method1944(var1, var4, var5, false);
		class92.method1968(var1, var4, var5);
	}

	static final void method6942(int var0, int var1, int var2, boolean var3) {
		if (class87.method1889(var0)) {
			class81.method1631(class72.field625[var0], -1, var1, var2, var3);
		}
	}

	static final void method1346(int var0, int var1, int var2, int var3, int var4) {
		class92.field887[0].method8587(var0, var1);
		class92.field887[1].method8587(var0, var3 + var1 - 16);
		class478.method8680(var0, var1 + 16, 16, var3 - 32, field1901);
		int var6 = (var3 - 32) * var3 / var4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (var3 - 32 - var6) * var2 / (var4 - var3);
		class478.method8680(var0, var1 + 16 + var7, 16, var6, field1833);
		class478.method8688(var0, var1 + 16 + var7, var6, field1766);
		class478.method8688(var0 + 1, var1 + 16 + var7, var6, field1766);
		class478.method8686(var0, var7 + var1 + 16, 16, field1766);
		class478.method8686(var0, var1 + 17 + var7, 16, field1766);
		class478.method8688(var0 + 15, var7 + var1 + 16, var6, field1714);
		class478.method8688(var0 + 14, var1 + 17 + var7, var6 - 1, field1714);
		class478.method8686(var0, var1 + 15 + var7 + var6, 16, field1714);
		class478.method8686(var0 + 1, var1 + 14 + var7 + var6, 15, field1714);
	}

	static void method6763(boolean var0) {
		field1849 = var0;
	}

	static boolean method4662() {
		return field1849;
	}

	static final void method7107(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class87.method1889(var0)) {
			class132.method2460(class72.field625[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}

	static final void method6246(int var0, int var1) {
		if (class87.method1889(var0)) {
			class243.method4848(class72.field625[var0], var1);
		}
	}

	final void method3037() {
		class53.method1040(field1875);
		++class94.field912;
		if (field1883 && field1927) {
			int var2 = class28.field158;
			int var3 = class28.field153;
			var2 -= field1877;
			var3 -= field1878;
			if (var2 < field1881) {
				var2 = field1881;
			}

			if (field1875.field3414 + var2 > field1881 + field1876.field3414) {
				var2 = field1881 + field1876.field3414 - field1875.field3414;
			}

			if (var3 < field1795) {
				var3 = field1795;
			}

			if (var3 + field1875.field3474 > field1795 + field1876.field3474) {
				var3 = field1795 + field1876.field3474 - field1875.field3474;
			}

			int var4 = var2 - field1701;
			int var5 = var3 - field1885;
			int var6 = field1875.field3487;
			if (class94.field912 > field1875.field3440 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
				field1886 = true;
			}

			int var7 = var2 - field1881 + field1876.field3427;
			int var8 = field1876.field3421 + (var3 - field1795);
			class80 var9;
			if (field1875.field3547 != null && field1886) {
				var9 = new class80();
				var9.field733 = field1875;
				var9.field731 = var7;
				var9.field738 = var8;
				var9.field735 = field1875.field3547;
				class69.method2874(var9);
			}

			if (class28.field157 == 0) {
				if (field1886) {
					if (field1875.field3501 != null) {
						var9 = new class80();
						var9.field733 = field1875;
						var9.field731 = var7;
						var9.field738 = var8;
						var9.field745 = field1879;
						var9.field735 = field1875.field3501;
						class69.method2874(var9);
					}

					if (null != field1879) {
						class290 var10 = field1875;
						int var12 = class182.method3010(var10);
						int var11 = var12 >> 17 & 7;
						int var13 = var11;
						class290 var16;
						if (var11 == 0) {
							var16 = null;
						} else {
							int var14 = 0;

							while (true) {
								if (var14 >= var13) {
									var16 = var10;
									break;
								}

								var10 = class180.method2988(var10.field3418);
								if (var10 == null) {
									var16 = null;
									break;
								}

								++var14;
							}
						}

						if (var16 != null) {
							class284 var15 = class152.method2679(class276.field3271, field1748.field1105);
							var15.field3321.method8383(field1875.field3404);
							var15.field3321.method8365(field1875.field3400);
							var15.field3321.method8377(field1879.field3492);
							var15.field3321.method8375(field1875.field3492);
							var15.field3321.method8383(field1879.field3400);
							var15.field3321.method8383(field1879.field3404);
							field1748.method2173(var15);
						}
					}
				} else if (this.method3031()) {
					this.method3032(field1701 + field1877, field1878 + field1885);
				} else if (field1838 > 0) {
					method4970(field1701 + field1877, field1885 + field1878);
				}

				field1875 = null;
			}

		} else {
			if (class94.field912 > 1) {
				if (!field1886 && field1838 > 0) {
					method4970(field1877 + field1701, field1885 + field1878);
				}

				field1875 = null;
			}

		}
	}

	static void method425(int var0) {
		class91.field864 = new class71();
		class91.field864.field618 = field1839[var0];
		class91.field864.field614 = field1832[var0];
		class91.field864.field612 = field1932[var0];
		class91.field864.field613 = field1802[var0];
		class91.field864.field616 = field1843[var0];
		class91.field864.field615 = field1844[var0];
		class91.field864.field611 = field1725[var0];
	}

	static void method4970(int var0, int var1) {
		method5311(class91.field864, var0, var1);
		class91.field864 = null;
	}

	static final void method181(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var2 = (float)var0 / 200.0F + 0.5F;
		method2956((double)var2);
	}

	static final void method2956(double var0) {
		class221.method4529(var0);
		((class228)class221.field2672).method4635(var0);
		class200.field2256.method5357();
		class186.field2040.method1837(var0);
	}

	static final void method213(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class186.field2040.method1833(var0);
	}

	static final void method170(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class186.field2040.method1789(var0);
	}

	static final void method2765() {
		for (int var1 = 0; var1 < class87.field818; ++var1) {
			class88 var2 = field1816[class87.field817[var1]];
			var2.method1913();
		}

	}

	static final void method581() {
		field1899 = field1887;
		class414.field4640 = true;
	}

	static final void method426(String var0) {
		if (null != class267.field3147) {
			class284 var2 = class152.method2679(class276.field3235, field1748.field1105);
			var2.field3321.method8323(class467.method190(var0));
			var2.field3321.method8316(var0);
			field1748.method2173(var2);
		}
	}

	static final void method229() {
		class284 var1 = class152.method2679(class276.field3290, field1748.field1105);
		var1.field3321.method8323(0);
		field1748.method2173(var1);
	}

	static boolean method1138(class290 var0) {
		return var0.field3452;
	}

	static void method2021(byte[] var0, int var1) {
		if (field1742 == null) {
			field1742 = new byte[24];
		}

		class376.method7035(var0, var1, field1742, 0, 24);
	}

	static void method2033(class467 var0, int var1) {
		method2021(var0.field4917, var1);
		class125.method2358(var0, var1);
	}

	public class483 method7105() {
		return null != class142.field1370 ? class142.field1370.field840 : null;
	}

	static void method5255(int var0) {
		field1775 = var0;
	}

	static void method4043() {
		if (field1775 == 1) {
			field1711 = true;
		}

	}

	static void method4347() {
		class186.field2040.method1793(field1693);
	}

	static void method4075(boolean var0) {
		field1780 = var0;
	}
}
