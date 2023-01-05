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

public final class client extends class141 implements class435, OAuthApi {
   public static boolean field426 = false;
   public static class463 field664;
   public static int field432 = 210;
   public static int field599 = 1;
   public static int field706;
   public static int field718;
   public static final class393 field483;
   static boolean field434 = true;
   static boolean field446;
   static boolean field456;
   static boolean field462;
   static boolean field472;
   static boolean field478 = false;
   static boolean field485;
   static boolean field494;
   static boolean field502 = true;
   static boolean field515;
   static boolean field520;
   static boolean field547;
   static boolean field550;
   static boolean field572;
   static boolean field582;
   static boolean field584;
   static boolean field585;
   static boolean field588;
   static boolean field591 = true;
   static boolean field592;
   static boolean field606;
   static boolean field618;
   static boolean field621;
   static boolean field645;
   static boolean field657;
   static boolean field662;
   static boolean field665 = false;
   static boolean field681;
   static boolean field688;
   static boolean field689;
   static boolean[] field561;
   static boolean[] field581;
   static boolean[] field648;
   static boolean[] field649;
   static boolean[] field650;
   static boolean[] field690;
   static byte[] field477;
   static class112[] field549;
   static class136[] field492;
   static class160 field557;
   static class170 field473;
   static class210 field603;
   static class210 field610;
   static class210 field611;
   static class210 field614;
   static class210 field686;
   static class216 field422;
   static class23 field457;
   static class238 field429;
   static class27[] field670;
   static class29[] field633;
   static class302 field713;
   static class31 field641;
   static class31 field716;
   static class319[] field676;
   static class34 field450;
   static class34 field671;
   static class391[] field493;
   static class392 field468;
   static class397 field499;
   static class397 field556;
   static class397 field566;
   static class397 field642;
   static class397 field643;
   static class397 field644;
   static class397 field654;
   static class397[][][] field564;
   static class398 field489;
   static class473 field488;
   static class47[] field551;
   static class53[] field669;
   static class95 field475;
   static class95 field598;
   static class98 field459;
   static int field423;
   static int field424;
   static int field425 = 0;
   static int field428 = -1;
   static int field430;
   static int field431;
   static int field433 = 0;
   static int field435 = 0;
   static int field436;
   static int field437 = -1;
   static int field438;
   static int field441 = 0;
   static int field442 = 0;
   static int field443 = 0;
   static int field444;
   static int field445 = 0;
   static int field447 = 0;
   static int field448 = 0;
   static int field449;
   static int field452;
   static int field453;
   static int field454;
   static int field455;
   static int field458;
   static int field461;
   static int field469 = -1;
   static int field470;
   static int field479;
   static int field480;
   static int field481;
   static int field484;
   static int field486 = 0;
   static int field491;
   static int field498;
   static int field500;
   static int field501;
   static int field503;
   static int field504;
   static int field505;
   static int field506;
   static int field508;
   static int field509;
   static int field510;
   static int field511 = 0;
   static int field512 = 0;
   static int field513;
   static int field514;
   static int field516;
   static int field517;
   static int field518;
   static int field519 = -1;
   static int field521;
   static int field523;
   static int field527;
   static int field530;
   static int field531;
   static int field533;
   static int field535;
   static int field536;
   static int field539;
   static int field541;
   static int field542;
   static int field543 = 0;
   static int field544;
   static int field545;
   static int field546;
   static int field548;
   static int field552;
   static int field555;
   static int field563;
   static int field565;
   static int field568;
   static int field573;
   static int field575;
   static int field576;
   static int field577;
   static int field580;
   static int field586;
   static int field587;
   static int field590;
   static int field593;
   static int field594;
   static int field597;
   static int field600;
   static int field601;
   static int field602;
   static int field604;
   static int field605;
   static int field608;
   static int field609;
   static int field612;
   static int field613;
   static int field615 = -1;
   static int field616;
   static int field617;
   static int field620;
   static int field622;
   static int field624;
   static int field626;
   static int field627;
   static int field628;
   static int field630;
   static int field631;
   static int field632;
   static int field634;
   static int field636;
   static int field637;
   static int field638;
   static int field640;
   static int field646;
   static int field647;
   static int field653;
   static int field659;
   static int field660;
   static int field663;
   static int field666;
   static int field672;
   static int field673;
   static int field677;
   static int field678;
   static int field679;
   static int field680;
   static int field682;
   static int field685;
   static int field694;
   static int field696;
   static int field703;
   static int field704;
   static int field705;
   static int field707;
   static int field708;
   static int field709;
   static int field710;
   static int field715;
   static int field717;
   static int field721;
   static int field724;
   static int field725;
   static int[] field451;
   static int[] field482;
   static int[] field497;
   static int[] field524;
   static int[] field525;
   static int[] field526;
   static int[] field528;
   static int[] field529;
   static int[] field534;
   static int[] field537;
   static int[] field538;
   static int[] field553;
   static int[] field558;
   static int[] field562;
   static int[] field567;
   static int[] field569;
   static int[] field570;
   static int[] field574;
   static int[] field578;
   static int[] field619;
   static int[] field623;
   static int[] field625;
   static int[] field629;
   static int[] field635;
   static int[] field639;
   static int[] field651;
   static int[] field652;
   static int[] field658;
   static int[] field667;
   static int[] field668;
   static int[] field674;
   static int[] field675;
   static int[] field683;
   static int[] field684;
   static int[] field691;
   static int[] field692;
   static int[] field693;
   static int[] field699;
   static int[] field702;
   static int[] field711;
   static int[] field712;
   static int[] field720;
   static int[] field723;
   static int[][] field532;
   static int[][][] field495;
   static String field595;
   static String field661;
   static String field687;
   static String field714;
   static String[] field460;
   static String[] field522;
   static String[] field560;
   static String[] field579;
   static ArrayList field719;
   static HashMap field487;
   static long field439 = -1L;
   static long field554;
   static long field596;
   static long field655 = -1L;
   static long field656;
   static long[] field440;
   static short field427;
   static short field467;
   static short field589;
   static short field607;
   static short field695;
   static short field697;
   static short field700;
   static short field701;
   static final class488 field722;
   static final int[] field496;
   static final int[] field559;
   static final String field471;
   boolean field507 = false;
   class134 field474;
   class18 field463;
   class285 field490;
   class326 field464;
   class326 field571;
   OtlTokenRequester field465;
   RefreshAccessTokenRequester field583;
   String field698;
   Future field466;
   Future field540;
   long field476 = -1L;

   static {
      field450 = class34.field331;
      field671 = class34.field331;
      field452 = 0;
      field453 = 0;
      field454 = 0;
      field455 = 0;
      field424 = 0;
      field565 = 0;
      field458 = 0;
      field444 = 0;
      field457 = class23.field170;
      field557 = class160.field1661;
      int var1 = "com_jagex_auth_desktop_osrs:public".length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3);
         if (var4 > 127) {
            var2[var3] = 63;
         } else {
            var2[var3] = (byte)var4;
         }
      }

      field471 = class438.method2093(var2);
      field472 = false;
      field473 = new class170();
      field477 = null;
      field669 = new class53[65536];
      field479 = 0;
      field635 = new int[65536];
      field481 = 0;
      field482 = new int[250];
      field483 = new class393();
      field484 = 0;
      field485 = false;
      field429 = new class238();
      field487 = new HashMap();
      field518 = 0;
      field672 = 1;
      field703 = 0;
      field491 = 1;
      field575 = 0;
      field493 = new class391[4];
      field494 = false;
      field495 = new int[4][13][13];
      field496 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      field480 = 0;
      field636 = 2301979;
      field568 = 5063219;
      field449 = 3353893;
      field501 = 7759444;
      field606 = false;
      field503 = 0;
      field504 = 128;
      field505 = 0;
      field506 = 0;
      field580 = 0;
      field508 = 0;
      field509 = 0;
      field510 = 0;
      field666 = 50;
      field555 = 0;
      field513 = 0;
      field514 = 0;
      field577 = 12;
      field516 = 6;
      field706 = 0;
      field446 = false;
      field724 = 0;
      field520 = false;
      field521 = 0;
      field678 = 0;
      field523 = 50;
      field524 = new int[field523];
      field525 = new int[field523];
      field526 = new int[field523];
      field711 = new int[field523];
      field528 = new int[field523];
      field529 = new int[field523];
      field619 = new int[field523];
      field522 = new String[field523];
      field532 = new int[104][104];
      field533 = 0;
      field640 = -1;
      field461 = -1;
      field498 = 0;
      field431 = 0;
      field517 = 0;
      field539 = 0;
      field456 = true;
      field541 = 0;
      field542 = 0;
      field535 = 0;
      field544 = 0;
      field545 = 0;
      field715 = 0;
      field547 = false;
      field548 = 0;
      field608 = 0;
      field550 = true;
      field551 = new class47[2048];
      field552 = -1;
      field609 = 0;
      field554 = -1L;
      field462 = true;
      field653 = 0;
      field696 = 0;
      field558 = new int[1000];
      field559 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      field560 = new String[8];
      field561 = new boolean[8];
      field562 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      field563 = -1;
      field564 = new class397[4][104][104];
      field654 = new class397();
      field566 = new class397();
      field556 = new class397();
      field497 = new int[25];
      field569 = new int[25];
      field570 = new int[25];
      field515 = false;
      field572 = false;
      field573 = 0;
      field574 = new int[500];
      field567 = new int[500];
      field667 = new int[500];
      field537 = new int[500];
      field578 = new int[500];
      field579 = new String[500];
      field460 = new String[500];
      field581 = new boolean[500];
      field582 = false;
      field588 = false;
      field584 = false;
      field585 = true;
      field586 = -1;
      field587 = -1;
      field470 = 0;
      field438 = 50;
      field590 = 0;
      field687 = null;
      field592 = false;
      field593 = -1;
      field594 = -1;
      field595 = null;
      field714 = null;
      field597 = -1;
      field598 = new class95(8);
      field708 = 0;
      field600 = -1;
      field601 = 0;
      field602 = 0;
      field603 = null;
      field546 = 0;
      field605 = 0;
      field685 = 0;
      field617 = -1;
      field645 = false;
      field686 = null;
      field610 = null;
      field611 = null;
      field612 = 0;
      field613 = 0;
      field614 = null;
      field662 = false;
      field616 = -1;
      field530 = -1;
      field618 = false;
      field436 = -1;
      field620 = -1;
      field621 = false;
      field622 = 1;
      field623 = new int[32];
      field624 = 0;
      field625 = new int[32];
      field626 = 0;
      field553 = new int[32];
      field628 = 0;
      field629 = new int[32];
      field630 = 0;
      field631 = 0;
      field632 = 0;
      field527 = 0;
      field634 = 0;
      field430 = 0;
      field694 = 0;
      field637 = 0;
      field638 = 0;
      field531 = 0;
      field422 = new class216();
      field499 = new class397();
      field642 = new class397();
      field643 = new class397();
      field644 = new class397();
      field475 = new class95(512);
      field646 = 0;
      field725 = -2;
      field648 = new boolean[100];
      field649 = new boolean[100];
      field650 = new boolean[100];
      field651 = new int[100];
      field652 = new int[100];
      field639 = new int[100];
      field451 = new int[100];
      field679 = 0;
      field656 = 0L;
      field657 = true;
      field658 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      field659 = 0;
      field660 = 0;
      field661 = "";
      field440 = new long[100];
      field663 = 0;
      field664 = new class463();
      field489 = new class398();
      field627 = 0;
      field691 = new int[128];
      field668 = new int[128];
      field596 = -1L;
      field670 = new class27[4];
      field549 = new class112[4];
      field536 = -1;
      field673 = 0;
      field674 = new int[1000];
      field675 = new int[1000];
      field676 = new class319[1000];
      field677 = 0;
      field423 = 0;
      field500 = 0;
      field680 = -1;
      field681 = false;
      field682 = 0;
      field683 = new int[50];
      field684 = new int[50];
      field712 = new int[50];
      field538 = new int[50];
      field492 = new class136[50];
      field688 = false;
      field689 = false;
      field690 = new boolean[5];
      field720 = new int[5];
      field692 = new int[5];
      field693 = new int[5];
      field534 = new int[5];
      field695 = 256;
      field467 = 205;
      field697 = 256;
      field589 = 320;
      field607 = 1;
      field700 = 32767;
      field701 = 1;
      field427 = 32767;
      field576 = 0;
      field704 = 0;
      field705 = 0;
      field604 = 0;
      field707 = 0;
      field468 = new class392();
      field709 = -1;
      field710 = -1;
      field459 = new class130();
      field633 = new class29[8];
      field713 = new class302();
      field488 = new class473(8, class404.field3527);
      field641 = new class31(64);
      field716 = new class31(64);
      field717 = -1;
      field718 = -1;
      field719 = new ArrayList(10);
      field647 = 0;
      field721 = 0;
      field722 = new class488();
      field723 = new int[50];
      field702 = new int[50];
   }

   protected final void method761() {
   }

   public final void init() {
      if (this.method750()) {
         int var3;
         for(int var1 = 0; var1 <= 28; ++var1) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (null != var2) {
               switch(var1) {
               case 3:
                  if (var2.equalsIgnoreCase(class389.field3432)) {
                     field426 = true;
                  } else {
                     field426 = false;
                  }
                  break;
               case 4:
                  if (field519 == -1) {
                     field519 = Integer.parseInt(var2);
                  }
                  break;
               case 5:
                  field512 = Integer.parseInt(var2);
                  break;
               case 6:
                  int var4 = Integer.parseInt(var2);
                  class22 var15;
                  if (var4 >= 0 && var4 < class22.field166.length) {
                     var15 = class22.field166[var4];
                  } else {
                     var15 = null;
                  }

                  class300.field2886 = var15;
                  break;
               case 7:
                  class213.field2396 = class457.method2164(Integer.parseInt(var2));
                  break;
               case 8:
                  if (var2.equalsIgnoreCase(class389.field3432)) {
                     ;
                  }
                  break;
               case 9:
                  class243.field2593 = var2;
                  break;
               case 10:
                  class340[] var14 = new class340[]{class340.field3135, class340.field3132, class340.field3133, class340.field3136, class340.field3134, class340.field3131};
                  class451.field3700 = (class340)class296.method1399(var14, Integer.parseInt(var2));
                  if (class451.field3700 == class340.field3136) {
                     class170.field1860 = class468.field3897;
                  } else {
                     class170.field1860 = class468.field3903;
                  }
                  break;
               case 11:
                  class222.field2434 = var2;
                  break;
               case 12:
                  field599 = Integer.parseInt(var2);
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
                  class316.field3006 = Integer.parseInt(var2);
                  break;
               case 15:
                  field425 = Integer.parseInt(var2);
                  break;
               case 17:
                  class328.field3062 = var2;
                  break;
               case 21:
                  field428 = Integer.parseInt(var2);
                  break;
               case 25:
                  var3 = var2.indexOf(".");
                  if (var3 == -1) {
                     field432 = Integer.parseInt(var2);
                  } else {
                     field432 = Integer.parseInt(var2.substring(0, var3));
                     Integer.parseInt(var2.substring(var3 + 1));
                  }
               }
            }
         }

         class352.method1684();
         class105.field1354 = this.getCodeBase().getHost();
         String var12 = class213.field2396.field1442;
         byte var13 = 0;

         try {
            class342.field3146 = 22;
            class451.field3707 = var13;

            try {
               class122.field1449 = System.getProperty("os.name");
            } catch (Exception var10) {
               class122.field1449 = "Unknown";
            }

            class119.field1431 = class122.field1449.toLowerCase();

            try {
               class131.field1474 = System.getProperty("user.home");
               if (class131.field1474 != null) {
                  class131.field1474 = class131.field1474 + "/";
               }
            } catch (Exception var9) {
               ;
            }

            try {
               if (class119.field1431.startsWith("win")) {
                  if (null == class131.field1474) {
                     class131.field1474 = System.getenv("USERPROFILE");
                  }
               } else if (null == class131.field1474) {
                  class131.field1474 = System.getenv("HOME");
               }

               if (class131.field1474 != null) {
                  class131.field1474 = class131.field1474 + "/";
               }
            } catch (Exception var8) {
               ;
            }

            if (null == class131.field1474) {
               class131.field1474 = "~/";
            }

            class109.field1379 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class131.field1474, "/tmp/", ""};
            class137.field1497 = new String[]{".jagex_cache_" + class451.field3707, ".file_store_" + class451.field3707};

            label133:
            for(var3 = 0; var3 < 4; ++var3) {
               class103.field1351 = class359.method1710("oldschool", var12, var3);
               if (!class103.field1351.exists()) {
                  class103.field1351.mkdirs();
               }

               File[] var16 = class103.field1351.listFiles();
               if (null == var16) {
                  break;
               }

               File[] var5 = var16;
               int var6 = 0;

               while(true) {
                  if (var6 >= var5.length) {
                     break label133;
                  }

                  File var7 = var5[var6];
                  if (!class2.method7(var7, false)) {
                     break;
                  }

                  ++var6;
               }
            }

            class286.method1364(class103.field1351);
            class341.method1638();
            class143.field1545 = new class443(new class476(class61.method339("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class143.field1546 = new class443(new class476(class61.method339("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            class143.field1549 = new class443[class342.field3146];

            for(var3 = 0; var3 < class342.field3146; ++var3) {
               class143.field1549[var3] = new class443(new class476(class61.method339("main_file_cache.idx" + var3), "rw", 1048576L), 6000, 0);
            }
         } catch (Exception var11) {
            class23.method122((String)null, var11);
         }

         class140.field1508 = this;
         class139.field1504 = field519;
         if (field615 == -1) {
            field615 = 0;
         }

         class299.field2881 = System.getenv("JX_ACCESS_TOKEN");
         class438.field3632 = System.getenv("JX_REFRESH_TOKEN");
         if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field507 = true;
         }

         this.method748(765, 503, 210, 1);
      }
   }

   boolean method261() {
      return null != class299.field2881 && !class299.field2881.trim().isEmpty() && null != class438.field3632 && !class438.field3632.trim().isEmpty();
   }

   boolean method262() {
      return null != this.field465;
   }

   void method283(String var1) throws IOException {
      HashMap var3 = new HashMap();
      var3.put("grant_type", "refresh_token");
      var3.put("scope", "gamesso.token.create");
      var3.put("refresh_token", var1);
      URL var4 = new URL(class222.field2434 + "shield/oauth/token" + (new class21(var3)).method116());
      HashMap var5 = new HashMap();
      var5.put("Authorization", "Basic " + field471);
      var5.put("Host", (new URL(class222.field2434)).getHost());
      var5.put("Accept", class450.field3694.method2128());
      class328 var6 = class328.field3064;
      RefreshAccessTokenRequester var7 = this.field583;
      if (null != var7) {
         this.field540 = var7.request(var6.method1584(), var4, var5, "");
      } else {
         class201 var8 = new class201(var4, var6, this.field507);
         Iterator var9 = var5.entrySet().iterator();

         while(var9.hasNext()) {
            Entry var10 = (Entry)var9.next();
            var8.method1012((String)var10.getKey(), (String)var10.getValue());
         }

         this.field571 = this.field463.method102(var8);
      }
   }

   void method263(String var1) throws MalformedURLException, IOException {
      URL var3 = new URL(class222.field2434 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
      HashMap var4 = new HashMap();
      var4.put("Authorization", "Bearer " + var1);
      class328 var5 = class328.field3055;
      OtlTokenRequester var6 = this.field465;
      if (null != var6) {
         this.field466 = var6.request(var5.method1584(), var3, var4, "");
      } else {
         class201 var7 = new class201(var3, var5, this.field507);
         Iterator var8 = var4.entrySet().iterator();

         while(var8.hasNext()) {
            Entry var9 = (Entry)var8.next();
            var7.method1012((String)var9.getKey(), (String)var9.getValue());
         }

         this.field464 = this.field463.method102(var7);
      }
   }

   protected final void method766() {
      int[] var2 = new int[]{20, 260, 10000};
      int[] var3 = new int[]{1000, 100, 500};
      if (var2 != null && null != var3) {
         class405.field3529 = var2;
         class83.field952 = new int[var2.length];
         class211.field2368 = new byte[var2.length][][];

         for(int var4 = 0; var4 < class405.field3529.length; ++var4) {
            class211.field2368[var4] = new byte[var3[var4]][];
            class461.field3849.add(var2[var4]);
         }

         Collections.sort(class461.field3849);
      } else {
         class405.field3529 = null;
         class83.field952 = null;
         class211.field2368 = (byte[][][])null;
         class461.field3849.clear();
         class461.field3849.add(Integer.valueOf(100));
         class461.field3849.add(Integer.valueOf(5000));
         class461.field3849.add(Integer.valueOf(10000));
         class461.field3849.add(Integer.valueOf(30000));
      }

      class112.field1389 = 0 == field425 ? 'ꩊ' : field599 + '鱀';
      class33.field326 = 0 == field425 ? 443 : field599 + '썐';
      class373.field3296 = class112.field1389;
      class235.field2552 = class371.field3291;
      class253.field2638 = class371.field3290;
      class490.field4040 = class371.field3294;
      class484.field3993 = class371.field3292;
      class20.field151 = new class329(this.field507, 210);
      this.method743();
      this.method762();
      class235.field2550 = this.method739();
      this.method745(field489, 0);
      this.method745(field664, 1);
      class430.field3601 = new class416(255, class143.field1545, class143.field1546, 500000);
      class111.field1385 = class320.method1563();
      this.method740();
      String var5 = class176.field1928;
      class363.field3248 = this;
      if (null != var5) {
         class363.field3249 = var5;
      }

      class281.method1349(class111.field1385.method1333());
      class321.field3026 = new class88(class170.field1860);
      this.field463 = new class18("tokenRequest", 1, 1);
   }

   protected final void method756() {
      ++field435;
      this.method266();

      while(true) {
         class397 var3 = class267.field2693;
         class19 var2;
         synchronized(class267.field2693) {
            var2 = (class19)class267.field2690.method1933();
         }

         if (null == var2) {
            class7.method25();
            method281();
            field664.method2270();
            this.method744();
            class182 var8 = class182.field1951;
            synchronized(class182.field1951) {
               class182.field1956 = class182.field1950;
               class182.field1957 = class182.field1953;
               class182.field1952 = class182.field1954;
               class182.field1959 = class182.field1955;
               class182.field1963 = class182.field1960;
               class182.field1964 = class182.field1958;
               class182.field1961 = class182.field1967;
               class182.field1949 = class182.field1962;
               class182.field1960 = 0;
            }

            if (class235.field2550 != null) {
               int var9 = class235.field2550.method1624();
               field531 = var9;
            }

            if (field433 == 0) {
               class74.method407();
               class377.method1798();
            } else if (field433 == 5) {
               class274.method1303(this, class441.field3651);
               class74.method407();
               class377.method1798();
            } else if (10 != field433 && 11 != field433) {
               if (field433 == 20) {
                  class274.method1303(this, class441.field3651);
                  this.method269((byte)-29);
               } else if (field433 == 50) {
                  class274.method1303(this, class441.field3651);
                  this.method269((byte)8);
               } else if (field433 == 25) {
                  class141.method773();
               }
            } else {
               class274.method1303(this, class441.field3651);
            }

            if (30 == field433) {
               this.method270();
            } else if (field433 == 40 || field433 == 45) {
               this.method269((byte)25);
            }

            return;
         }

         var2.field143.method1151(var2.field145, (int)var2.field1361, var2.field144, false);
      }
   }

   protected final void method757(boolean var1) {
      boolean var3 = class384.method1820();
      if (var3 && field681 && class327.field3054 != null) {
         class327.field3054.method822();
      }

      if ((field433 == 10 || field433 == 20 || field433 == 30) && 0L != field656 && class154.method814() > field656) {
         class281.method1349(class154.method816());
      }

      int var4;
      if (var1) {
         for(var4 = 0; var4 < 100; ++var4) {
            field648[var4] = true;
         }
      }

      if (field433 == 0) {
         this.method758(class52.field761, class52.field762, var1);
      } else if (field433 == 5) {
         class398.method1945(class299.field2880, class248.field2615, class441.field3651);
      } else if (field433 != 10 && field433 != 11) {
         if (field433 == 20) {
            class398.method1945(class299.field2880, class248.field2615, class441.field3651);
         } else if (field433 == 50) {
            class398.method1945(class299.field2880, class248.field2615, class441.field3651);
         } else if (25 == field433) {
            if (1 == field575) {
               if (field518 > field672) {
                  field672 = field518;
               }

               var4 = (field672 * 50 - field518 * 50) / field672;
               class414.method2003(class96.field1150 + class389.field3433 + class389.field3430 + var4 + "%" + class389.field3434, false);
            } else if (field575 == 2) {
               if (field703 > field491) {
                  field491 = field703;
               }

               var4 = 50 + (field491 * 50 - field703 * 50) / field491;
               class414.method2003(class96.field1150 + class389.field3433 + class389.field3430 + var4 + "%" + class389.field3434, false);
            } else {
               class414.method2003(class96.field1150, false);
            }
         } else if (30 == field433) {
            this.method273();
         } else if (field433 == 40) {
            class414.method2003(class96.field1044 + class389.field3433 + class96.field1028, false);
         } else if (45 == field433) {
            class414.method2003(class96.field1160, false);
         }
      } else {
         class398.method1945(class299.field2880, class248.field2615, class441.field3651);
      }

      if (30 == field433 && 0 == field679 && !var1 && !field657) {
         for(var4 = 0; var4 < field646; ++var4) {
            if (field649[var4]) {
               class204.field2184.method1055(field651[var4], field652[var4], field639[var4], field451[var4]);
               field649[var4] = false;
            }
         }
      } else if (field433 > 0) {
         class204.field2184.method1056(0, 0);

         for(var4 = 0; var4 < field646; ++var4) {
            field649[var4] = false;
         }
      }

   }

   protected final void method770() {
      if (class430.field3600.method1768()) {
         class430.field3600.method1775();
      }

      if (null != class351.field3179) {
         class351.field3179.field3101 = false;
      }

      class351.field3179 = null;
      field483.method1913();
      if (null != class182.field1951) {
         class182 var2 = class182.field1951;
         synchronized(class182.field1951) {
            class182.field1951 = null;
         }
      }

      class235.field2550 = null;
      if (null != class327.field3054) {
         class327.field3054.method823();
      }

      if (null != class175.field1916) {
         class175.field1916.method823();
      }

      class315.method1520();
      class90.method497();
      if (class20.field151 != null) {
         class20.field151.method863();
         class20.field151 = null;
      }

      try {
         class143.field1545.method2115();

         for(int var6 = 0; var6 < class342.field3146; ++var6) {
            class143.field1549[var6].method2115();
         }

         class143.field1546.method2115();
         class143.field1548.method2115();
      } catch (Exception var5) {
         ;
      }

      this.field463.method105();
   }

   void method266() {
      if (1000 != field433) {
         boolean var2 = class316.method1525();
         if (!var2) {
            this.method267();
         }

      }
   }

   void method267() {
      if (class475.field3964 >= 4) {
         this.method774("js5crc");
         class72.method402(1000);
      } else {
         if (class475.field3951 >= 4) {
            if (field433 <= 5) {
               this.method774("js5io");
               class72.method402(1000);
               return;
            }

            field454 = 3000;
            class475.field3951 = 3;
         }

         if (--field454 + 1 <= 0) {
            try {
               if (field453 == 0) {
                  class485.field3995 = class358.field3203.method109(class105.field1354, class373.field3296);
                  ++field453;
               }

               if (field453 == 1) {
                  if (class485.field3995.field1551 == 2) {
                     this.method268(-1);
                     return;
                  }

                  if (class485.field3995.field1551 == 1) {
                     ++field453;
                  }
               }

               class134 var4;
               if (2 == field453) {
                  Socket var3 = (Socket)class485.field3995.field1555;
                  class56 var2 = new class56(var3, 40000, 5000);
                  class406.field3538 = var2;
                  var4 = new class134(5);
                  var4.method666(15);
                  var4.method656(210);
                  class406.field3538.method2051(var4.field1489, 0, 5);
                  ++field453;
                  class51.field754 = class154.method814();
               }

               if (field453 == 3) {
                  if (class406.field3538.method2052() > 0) {
                     int var12 = class406.field3538.method2053();
                     if (var12 != 0) {
                        this.method268(var12);
                        return;
                     }

                     ++field453;
                  } else if (class154.method814() - class51.field754 > 30000L) {
                     this.method268(-2);
                     return;
                  }
               }

               if (4 == field453) {
                  class429 var13 = class406.field3538;
                  boolean var14 = field433 > 20;
                  if (class475.field3962 != null) {
                     try {
                        class475.field3962.method2054();
                     } catch (Exception var10) {
                        ;
                     }

                     class475.field3962 = null;
                  }

                  class475.field3962 = var13;
                  if (null != class475.field3962) {
                     try {
                        var4 = new class134(4);
                        var4.method666(var14 ? 2 : 3);
                        var4.method724(0);
                        class475.field3962.method2051(var4.field1489, 0, 4);
                     } catch (IOException var9) {
                        try {
                           class475.field3962.method2054();
                        } catch (Exception var8) {
                           ;
                        }

                        ++class475.field3951;
                        class475.field3962 = null;
                     }
                  }

                  class475.field3956.field1487 = 0;
                  class490.field4042 = null;
                  class213.field2384 = null;
                  class475.field3944 = 0;

                  while(true) {
                     class289 var15 = (class289)class475.field3949.method543();
                     if (var15 == null) {
                        while(true) {
                           var15 = (class289)class475.field3954.method543();
                           if (var15 == null) {
                              if (class475.field3959 != 0) {
                                 try {
                                    var4 = new class134(4);
                                    var4.method666(4);
                                    var4.method666(class475.field3959);
                                    var4.method655(0);
                                    class475.field3962.method2051(var4.field1489, 0, 4);
                                 } catch (IOException var7) {
                                    try {
                                       class475.field3962.method2054();
                                    } catch (Exception var6) {
                                       ;
                                    }

                                    ++class475.field3951;
                                    class475.field3962 = null;
                                 }
                              }

                              class475.field3961 = 0;
                              class475.field3946 = class154.method814();
                              class485.field3995 = null;
                              class406.field3538 = null;
                              field453 = 0;
                              field455 = 0;
                              return;
                           }

                           class475.field3947.method29(var15);
                           class475.field3952.method542(var15, var15.field1361);
                           ++class475.field3953;
                           --class475.field3960;
                        }
                     }

                     class475.field3955.method542(var15, var15.field1361);
                     ++class475.field3948;
                     --class475.field3950;
                  }
               }
            } catch (IOException var11) {
               this.method268(-3);
            }

         }
      }
   }

   void method268(int var1) {
      class485.field3995 = null;
      class406.field3538 = null;
      field453 = 0;
      if (class373.field3296 == class112.field1389) {
         class373.field3296 = class33.field326;
      } else {
         class373.field3296 = class112.field1389;
      }

      ++field455;
      if (field455 < 2 || var1 != 7 && var1 != 9) {
         if (field455 >= 2 && var1 == 6) {
            this.method774("js5connect_outofdate");
            class72.method402(1000);
         } else if (field455 >= 4) {
            if (field433 <= 5) {
               this.method774("js5connect");
               class72.method402(1000);
            } else {
               field454 = 3000;
            }
         }
      } else if (field433 <= 5) {
         this.method774("js5connect_full");
         class72.method402(1000);
      } else {
         field454 = 3000;
      }

   }

   final void method269(byte var1) {
      Object var2 = field483.method1915();
      class421 var3 = field483.field3460;

      try {
         if (0 == field424) {
            if (var1 == -1) {
               throw new IllegalStateException();
            }

            if (class352.field3184 == null) {
               label1021: {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  if (!field473.method904()) {
                     if (var1 == -1) {
                        return;
                     }

                     if (field565 <= 250) {
                        break label1021;
                     }
                  }

                  class352.field3184 = field473.method905();
                  field473.method903();
                  field473 = null;
               }
            }

            if (null != class352.field3184) {
               if (var1 == -1) {
                  return;
               }

               if (var2 != null) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  ((class429)var2).method2054();
                  var2 = null;
               }

               class326.field3047 = null;
               field485 = false;
               field565 = 0;
               if (field557.method848()) {
                  try {
                     this.method283(class438.field3632);
                     class384.method1822(21);
                  } catch (Throwable var21) {
                     class23.method122((String)null, var21);
                     class363.method1758(65);
                     return;
                  }
               } else {
                  class384.method1822(1);
               }
            }
         }

         class269 var24;
         if (21 == field424) {
            if (this.field540 != null) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               if (!this.field540.isDone()) {
                  return;
               }

               if (this.field540.isCancelled()) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  class363.method1758(65);
                  this.field540 = null;
                  return;
               }

               try {
                  RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse)this.field540.get();
                  if (!var4.isSuccess()) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     class363.method1758(65);
                     this.field540 = null;
                     return;
                  }

                  class299.field2881 = var4.getAccessToken();
                  class438.field3632 = var4.getRefreshToken();
                  this.field540 = null;
               } catch (Exception var20) {
                  class23.method122((String)null, var20);
                  class363.method1758(65);
                  this.field540 = null;
                  return;
               }
            } else {
               if (this.field571 == null) {
                  class363.method1758(65);
                  return;
               }

               if (var1 == -1) {
                  return;
               }

               if (!this.field571.method1576()) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  return;
               }

               if (this.field571.method1577()) {
                  if (var1 == -1) {
                     return;
                  }

                  class23.method122(this.field571.method1575(), (Throwable)null);
                  class363.method1758(65);
                  this.field571 = null;
                  return;
               }

               var24 = this.field571.method1578();
               if (var24.method1276() != 200) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  class363.method1758(65);
                  this.field571 = null;
                  return;
               }

               field565 = 0;
               class477 var5 = new class477(var24.method1277());

               try {
                  class299.field2881 = var5.method2308().getString("access_token");
                  class438.field3632 = var5.method2308().getString("refresh_token");
               } catch (Exception var19) {
                  class23.method122("Error parsing tokens", var19);
                  class363.method1758(65);
                  this.field571 = null;
                  return;
               }
            }

            this.method263(class299.field2881);
            class384.method1822(20);
         }

         if (field424 == 20) {
            if (var1 == -1) {
               throw new IllegalStateException();
            }

            if (this.field466 != null) {
               if (!this.field466.isDone()) {
                  if (var1 == -1) {
                     return;
                  }

                  return;
               }

               if (this.field466.isCancelled()) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  class363.method1758(65);
                  this.field466 = null;
                  return;
               }

               try {
                  OtlTokenResponse var25 = (OtlTokenResponse)this.field466.get();
                  if (!var25.isSuccess()) {
                     if (var1 == -1) {
                        return;
                     }

                     class363.method1758(65);
                     this.field466 = null;
                     return;
                  }

                  this.field698 = var25.getToken();
                  this.field466 = null;
               } catch (Exception var18) {
                  class23.method122((String)null, var18);
                  class363.method1758(65);
                  this.field466 = null;
                  return;
               }
            } else {
               if (null == this.field464) {
                  class363.method1758(65);
                  return;
               }

               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               if (!this.field464.method1576()) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  return;
               }

               if (this.field464.method1577()) {
                  if (var1 == -1) {
                     return;
                  }

                  class23.method122(this.field464.method1575(), (Throwable)null);
                  class363.method1758(65);
                  this.field464 = null;
                  return;
               }

               var24 = this.field464.method1578();
               if (var24.method1276() != 200) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  class23.method122("Response code: " + var24.method1276() + "Response body: " + var24.method1277(), (Throwable)null);
                  class363.method1758(65);
                  this.field464 = null;
                  return;
               }

               this.field698 = var24.method1277();
               this.field464 = null;
            }

            field565 = 0;
            class384.method1822(1);
         }

         if (field424 == 1) {
            if (var1 == -1) {
               return;
            }

            if (null == class326.field3047) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               class326.field3047 = class358.field3203.method109(class105.field1354, class373.field3296);
            }

            if (class326.field3047.field1551 == 2) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               throw new IOException();
            }

            if (class326.field3047.field1551 == 1) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               Socket var26 = (Socket)class326.field3047.field1555;
               class56 var27 = new class56(var26, 40000, 5000);
               var2 = var27;
               field483.method1912(var27);
               class326.field3047 = null;
               class384.method1822(2);
            }
         }

         class81 var28;
         if (2 == field424) {
            field483.method1911();
            var28 = class329.method1595();
            var28.field935 = null;
            var28.field930 = 0;
            var28.field933 = new class421(5000);
            var28.field933.method666(class451.field3698.field3704);
            field483.method1920(var28);
            field483.method1917();
            var3.field1487 = 0;
            class384.method1822(3);
         }

         int var29;
         if (field424 == 3) {
            if (var1 == -1) {
               return;
            }

            if (class327.field3054 != null) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               class327.field3054.method832();
            }

            if (null != class175.field1916) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               class175.field1916.method832();
            }

            if (((class429)var2).method2055(1)) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               var29 = ((class429)var2).method2053();
               if (null != class327.field3054) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  class327.field3054.method832();
               }

               if (class175.field1916 != null) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  class175.field1916.method832();
               }

               if (var29 != 0) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  class363.method1758(var29);
                  return;
               }

               var3.field1487 = 0;
               class384.method1822(4);
            }
         }

         if (field424 == 4) {
            if (var1 == -1) {
               throw new IllegalStateException();
            }

            if (var3.field1487 < 8) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               var29 = ((class429)var2).method2052();
               if (var29 > 8 - var3.field1487) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  var29 = 8 - var3.field1487;
               }

               if (var29 > 0) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  ((class429)var2).method2050(var3.field1489, var3.field1487, var29);
                  var3.field1487 += var29;
               }
            }

            if (8 == var3.field1487) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               var3.field1487 = 0;
               class205.field2190 = var3.method720();
               class384.method1822(5);
            }
         }

         if (field424 == 5) {
            if (var1 == -1) {
               throw new IllegalStateException();
            }

            field483.field3460.field1487 = 0;
            field483.method1911();
            class421 var35 = new class421(500);
            int[] var30 = new int[]{class352.field3184.nextInt(), class352.field3184.nextInt(), class352.field3184.nextInt(), class352.field3184.nextInt()};
            var35.field1487 = 0;
            var35.method666(1);
            var35.method656(var30[0]);
            var35.method656(var30[1]);
            var35.method656(var30[2]);
            var35.method656(var30[3]);
            var35.method658(class205.field2190);
            if (40 == field433) {
               var35.method656(class482.field3989[0]);
               var35.method656(class482.field3989[1]);
               var35.method656(class482.field3989[2]);
               var35.method656(class482.field3989[3]);
            } else {
               if (50 == field433) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  var35.method666(class23.field173.method2118());
                  var35.method656(class377.field3309);
               } else {
                  var35.method666(field457.method2118());
                  switch(field457.field172) {
                  case 0:
                     var35.field1487 += 4;
                  case 1:
                  default:
                     break;
                  case 2:
                     var35.method656(class111.field1385.method1336(class52.field776));
                     break;
                  case 3:
                  case 4:
                     var35.method724(class250.field2621);
                     ++var35.field1487;
                  }
               }

               if (field557.method848()) {
                  if (var1 == -1) {
                     return;
                  }

                  var35.method666(class160.field1654.method2118());
                  var35.method660(this.field698, (byte)16);
               } else {
                  var35.method666(class160.field1661.method2118());
                  var35.method660(class52.field772, (byte)13);
               }
            }

            var35.method685(class71.field852, class71.field850);
            class482.field3989 = var30;
            class81 var7 = class329.method1595();
            var7.field935 = null;
            var7.field930 = 0;
            var7.field933 = new class421(5000);
            var7.field933.field1487 = 0;
            if (40 == field433) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               var7.field933.method666(class451.field3701.field3704);
            } else {
               var7.field933.method666(class451.field3699.field3704);
            }

            var7.field933.method655(0);
            int var8 = var7.field933.field1487;
            var7.field933.method656(210);
            var7.field933.method656(1);
            var7.field933.method666(field519);
            var7.field933.method666(field615);
            byte var9 = 0;
            var7.field933.method666(var9);
            var7.field933.method662(var35.field1489, 0, var35.field1487);
            int var10 = var7.field933.field1487;
            var7.field933.method660(class52.field776, (byte)124);
            class421 var10000 = var7.field933;
            byte var10001;
            if (field657) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            int var44 = var10001 << 1;
            byte var10002;
            if (field478) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               var10002 = 1;
            } else {
               var10002 = 0;
            }

            var10000.method666(var44 | var10002);
            var7.field933.method655(class391.field3440);
            var7.field933.method655(class22.field161);
            class421 var11 = var7.field933;
            int var14;
            if (field477 != null) {
               if (var1 == -1) {
                  return;
               }

               var11.method662(field477, 0, field477.length);
            } else {
               byte[] var13 = new byte[24];

               try {
                  class143.field1548.method2116(0L);
                  class143.field1548.method2111(var13);

                  for(var14 = 0; var14 < 24; ++var14) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     if (0 != var13[var14]) {
                        if (var1 == -1) {
                           throw new IllegalStateException();
                        }
                        break;
                     }
                  }

                  if (var14 >= 24) {
                     if (var1 == -1) {
                        return;
                     }

                     throw new IOException();
                  }
               } catch (Exception var22) {
                  for(int var15 = 0; var15 < 24; ++var15) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     var13[var15] = -1;
                  }
               }

               var11.method662(var13, 0, var13.length);
            }

            var7.field933.method660(class243.field2593, (byte)19);
            var7.field933.method656(class316.field3006);
            class134 var12 = new class134(class348.field3173.method1824());
            class348.field3173.method1823(var12);
            var7.field933.method662(var12.field1489, 0, var12.field1489.length);
            var7.field933.method666(field519);
            var7.field933.method656(0);
            var7.field933.method656(class361.field3239.field1710);
            var7.field933.method702(class71.field849.field1710);
            var7.field933.method702(class205.field2191.field1710);
            var7.field933.method701(class137.field1496.field1710);
            var7.field933.method702(class212.field2380.field1710);
            var7.field933.method701(class399.field3509.field1710);
            var7.field933.method702(0);
            var7.field933.method703(class280.field2767.field1710);
            var7.field933.method701(class417.field3564.field1710);
            var7.field933.method656(class307.field2902.field1710);
            var7.field933.method702(class286.field2786.field1710);
            var7.field933.method656(class405.field3532.field1710);
            var7.field933.method703(class252.field2634.field1710);
            var7.field933.method656(class328.field3066.field1710);
            var7.field933.method656(class39.field366.field1710);
            var7.field933.method703(class430.field3589.field1710);
            var7.field933.method656(class269.field2702.field1710);
            var7.field933.method701(class278.field2760.field1710);
            var7.field933.method701(class42.field375.field1710);
            var7.field933.method656(class35.field350.field1710);
            var7.field933.method703(class44.field377.field1710);
            var7.field933.method722(var30, var10, var7.field933.field1487);
            var7.field933.method665(var7.field933.field1487 - var8);
            field483.method1920(var7);
            field483.method1917();
            field483.field3459 = new class1(var30);
            int[] var42 = new int[4];

            for(var14 = 0; var14 < 4; ++var14) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               var42[var14] = 50 + var30[var14];
            }

            var3.method2018(var42);
            class384.method1822(6);
         }

         int var31;
         boolean var43;
         if (6 == field424) {
            if (var1 == -1) {
               throw new IllegalStateException();
            }

            if (((class429)var2).method2052() > 0) {
               label1029: {
                  var29 = ((class429)var2).method2053();
                  if (var29 == 61) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     label922: {
                        var31 = ((class429)var2).method2052();
                        if (var31 == 1) {
                           if (var1 == -1) {
                              return;
                           }

                           if (((class429)var2).method2053() == 1) {
                              var43 = true;
                              break label922;
                           }
                        }

                        var43 = false;
                     }

                     class89.field978 = var43;
                     class384.method1822(5);
                  }

                  if (var29 == 21) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     if (20 == field433) {
                        if (var1 == -1) {
                           return;
                        }

                        class384.method1822(12);
                        break label1029;
                     }
                  }

                  if (var29 == 2) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     class384.method1822(14);
                  } else {
                     label908: {
                        if (var29 == 15) {
                           if (var1 == -1) {
                              throw new IllegalStateException();
                           }

                           if (40 == field433) {
                              if (var1 == -1) {
                                 throw new IllegalStateException();
                              }

                              field483.field3464 = -1;
                              class384.method1822(19);
                              break label908;
                           }
                        }

                        if (var29 == 64) {
                           if (var1 == -1) {
                              return;
                           }

                           class384.method1822(10);
                        } else {
                           label902: {
                              if (var29 == 23) {
                                 if (var1 == -1) {
                                    throw new IllegalStateException();
                                 }

                                 if (field458 < 1) {
                                    if (var1 == -1) {
                                       return;
                                    }

                                    ++field458;
                                    class384.method1822(0);
                                    break label902;
                                 }
                              }

                              if (var29 == 29) {
                                 if (var1 == -1) {
                                    throw new IllegalStateException();
                                 }

                                 class384.method1822(17);
                              } else {
                                 if (var29 != 69) {
                                    class363.method1758(var29);
                                    return;
                                 }

                                 if (var1 == -1) {
                                    throw new IllegalStateException();
                                 }

                                 class384.method1822(7);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if (7 == field424) {
            if (var1 == -1) {
               throw new IllegalStateException();
            }

            if (((class429)var2).method2052() >= 2) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               ((class429)var2).method2050(var3.field1489, 0, 2);
               var3.field1487 = 0;
               class175.field1917 = var3.method671();
               class384.method1822(8);
            }
         }

         if (field424 == 8) {
            if (var1 == -1) {
               throw new IllegalStateException();
            }

            if (((class429)var2).method2052() >= class175.field1917) {
               var3.field1487 = 0;
               ((class429)var2).method2050(var3.field1489, var3.field1487, class175.field1917);
               class91 var38 = class166.method897()[var3.method669()];

               try {
                  class347 var33 = class475.method2299(var38);
                  this.field490 = new class285(var3, var33);
                  class384.method1822(9);
               } catch (Exception var17) {
                  class363.method1758(22);
                  return;
               }
            }
         }

         if (9 == field424) {
            if (var1 == -1) {
               throw new IllegalStateException();
            }

            if (this.field490.method1362()) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               this.field474 = this.field490.method1361();
               this.field490.method1358();
               this.field490 = null;
               if (this.field474 == null) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  class363.method1758(22);
                  return;
               }

               field483.method1911();
               var28 = class329.method1595();
               var28.field935 = null;
               var28.field930 = 0;
               var28.field933 = new class421(5000);
               var28.field933.method666(class451.field3702.field3704);
               var28.field933.method655(this.field474.field1487);
               var28.field933.method663(this.field474);
               field483.method1920(var28);
               field483.method1917();
               this.field474 = null;
               class384.method1822(6);
            }
         }

         if (field424 == 10) {
            if (var1 == -1) {
               throw new IllegalStateException();
            }

            if (((class429)var2).method2052() > 0) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               class118.field1428 = ((class429)var2).method2053();
               class384.method1822(11);
            }
         }

         if (11 == field424) {
            if (var1 == -1) {
               throw new IllegalStateException();
            }

            if (((class429)var2).method2052() >= class118.field1428) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               ((class429)var2).method2050(var3.field1489, 0, class118.field1428);
               var3.field1487 = 0;
               class384.method1822(6);
            }
         }

         if (field424 == 12) {
            if (var1 == -1) {
               throw new IllegalStateException();
            }

            if (((class429)var2).method2052() > 0) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               field444 = (((class429)var2).method2053() + 3) * 60;
               class384.method1822(13);
            }
         }

         if (13 == field424) {
            if (var1 == -1) {
               throw new IllegalStateException();
            } else {
               field565 = 0;
               class20.method113(class96.field1060, class96.field1061, field444 / 60 + class96.field1118);
               if (--field444 <= 0) {
                  if (var1 == -1) {
                     return;
                  }

                  class384.method1822(0);
               }

            }
         } else {
            if (14 == field424) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               if (((class429)var2).method2052() >= 1) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  class450.field3697 = ((class429)var2).method2053();
                  class384.method1822(15);
               }
            }

            if (field424 == 15) {
               if (var1 == -1) {
                  return;
               }

               if (((class429)var2).method2052() >= class450.field3697) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  if (((class429)var2).method2053() == 1) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     var43 = true;
                  } else {
                     var43 = false;
                  }

                  boolean var39 = var43;
                  ((class429)var2).method2050(var3.field1489, 0, 4);
                  var3.field1487 = 0;
                  boolean var36 = false;
                  if (var39) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     var31 = var3.method2019() << 24;
                     var31 |= var3.method2019() << 16;
                     var31 |= var3.method2019() << 8;
                     var31 |= var3.method2019();
                     class111.field1385.method1334(class52.field776, var31);
                  }

                  if (field472) {
                     if (var1 == -1) {
                        return;
                     }

                     class111.field1385.method1329(class52.field776);
                  } else {
                     class111.field1385.method1329((String)null);
                  }

                  class448.method2122();
                  field685 = ((class429)var2).method2053();
                  if (((class429)var2).method2053() == 1) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     var43 = true;
                  } else {
                     var43 = false;
                  }

                  field645 = var43;
                  field552 = ((class429)var2).method2053();
                  field552 <<= 8;
                  field552 += ((class429)var2).method2053();
                  field609 = ((class429)var2).method2053();
                  ((class429)var2).method2050(var3.field1489, 0, 8);
                  var3.field1487 = 0;
                  this.field476 = var3.method720();
                  if (class450.field3697 >= 29) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     ((class429)var2).method2050(var3.field1489, 0, 8);
                     var3.field1487 = 0;
                     field554 = var3.method720();
                  }

                  ((class429)var2).method2050(var3.field1489, 0, 1);
                  var3.field1487 = 0;
                  class200[] var6 = class438.method2094();
                  int var37 = var3.method2025();
                  if (var37 < 0) {
                     throw new IOException(var37 + " " + var3.field1487);
                  }

                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  if (var37 >= var6.length) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     throw new IOException(var37 + " " + var3.field1487);
                  }

                  field483.field3461 = var6[var37];
                  field483.field3464 = field483.field3461.field2082;
                  ((class429)var2).method2050(var3.field1489, 0, 2);
                  var3.field1487 = 0;
                  field483.field3464 = var3.method671();

                  try {
                     class178.method937(class140.field1508, "zap");
                  } catch (Throwable var16) {
                     ;
                  }

                  class384.method1822(16);
               }
            }

            if (field424 == 16) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               } else {
                  if (((class429)var2).method2052() >= field483.field3464) {
                     if (var1 == -1) {
                        return;
                     }

                     var3.field1487 = 0;
                     ((class429)var2).method2050(var3.field1489, 0, field483.field3464);
                     field429.method1206();
                     class297.method1403();
                     class155.method817(var3);
                     class222.field2433 = -1;
                     class240.method1214(false, var3);
                     field483.field3461 = null;
                  }

               }
            } else {
               if (17 == field424 && ((class429)var2).method2052() >= 2) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  var3.field1487 = 0;
                  ((class429)var2).method2050(var3.field1489, 0, 2);
                  var3.field1487 = 0;
                  class89.field981 = var3.method671();
                  class384.method1822(18);
               }

               if (18 == field424 && ((class429)var2).method2052() >= class89.field981) {
                  if (var1 == -1) {
                     return;
                  }

                  var3.field1487 = 0;
                  ((class429)var2).method2050(var3.field1489, 0, class89.field981);
                  var3.field1487 = 0;
                  String var40 = var3.method677();
                  String var41 = var3.method677();
                  String var32 = var3.method677();
                  class20.method113(var40, var41, var32);
                  class72.method402(10);
                  if (field557.method848()) {
                     if (var1 == -1) {
                        return;
                     }

                     class324.method1569(9);
                  }
               }

               if (19 == field424) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  } else {
                     if (-1 == field483.field3464) {
                        if (var1 == -1) {
                           return;
                        }

                        if (((class429)var2).method2052() < 2) {
                           if (var1 == -1) {
                              throw new IllegalStateException();
                           }

                           return;
                        }

                        ((class429)var2).method2050(var3.field1489, 0, 2);
                        var3.field1487 = 0;
                        field483.field3464 = var3.method671();
                     }

                     if (((class429)var2).method2052() >= field483.field3464) {
                        ((class429)var2).method2050(var3.field1489, 0, field483.field3464);
                        var3.field1487 = 0;
                        var29 = field483.field3464;
                        field429.method1203();
                        field483.method1911();
                        field483.field3460.field1487 = 0;
                        field483.field3461 = null;
                        field483.field3466 = null;
                        field483.field3467 = null;
                        field483.field3468 = null;
                        field483.field3464 = 0;
                        field483.field3457 = 0;
                        field441 = 0;
                        class341.method1634();
                        field500 = 0;
                        field677 = 0;

                        for(var31 = 0; var31 < 2048; ++var31) {
                           if (var1 == -1) {
                              throw new IllegalStateException();
                           }

                           field551[var31] = null;
                        }

                        class89.field982 = null;

                        for(var31 = 0; var31 < field669.length; ++var31) {
                           if (var1 == -1) {
                              throw new IllegalStateException();
                           }

                           class53 var34 = field669[var31];
                           if (null != var34) {
                              var34.field266 = -1;
                              var34.field267 = false;
                           }
                        }

                        class363.method1753();
                        class72.method402(30);

                        for(var31 = 0; var31 < 100; ++var31) {
                           if (var1 == -1) {
                              throw new IllegalStateException();
                           }

                           field648[var31] = true;
                        }

                        var28 = class189.method982(class165.field1726, field483.field3459);
                        var28.field933.method666(class154.method816());
                        var28.field933.method655(class391.field3440);
                        var28.field933.method655(class22.field161);
                        field483.method1920(var28);
                        class155.method817(var3);
                        if (var3.field1487 != var29) {
                           if (var1 == -1) {
                              throw new IllegalStateException();
                           } else {
                              throw new RuntimeException();
                           }
                        }
                     }
                  }
               } else {
                  ++field565;
                  if (field565 > 2000) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     } else if (field458 < 1) {
                        if (var1 == -1) {
                           throw new IllegalStateException();
                        } else {
                           if (class112.field1389 == class373.field3296) {
                              if (var1 == -1) {
                                 throw new IllegalStateException();
                              }

                              class373.field3296 = class33.field326;
                           } else {
                              class373.field3296 = class112.field1389;
                           }

                           ++field458;
                           class384.method1822(0);
                        }
                     } else {
                        class363.method1758(-3);
                     }
                  }
               }
            }
         }
      } catch (IOException var23) {
         if (field458 < 1) {
            if (var1 == -1) {
               throw new IllegalStateException();
            } else {
               if (class373.field3296 == class112.field1389) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  class373.field3296 = class33.field326;
               } else {
                  class373.field3296 = class112.field1389;
               }

               ++field458;
               class384.method1822(0);
            }
         } else {
            class363.method1758(-2);
         }
      }
   }

   final void method270() {
      if (field441 > 1) {
         --field441;
      }

      if (field484 > 0) {
         --field484;
      }

      if (field485) {
         field485 = false;
         class380.method1808();
      } else {
         if (!field572) {
            class85.method468();
         }

         int var2;
         for(var2 = 0; var2 < 100 && this.method285(field483); ++var2) {
            ;
         }

         if (field433 == 30) {
            while(true) {
               class13 var3 = (class13)class384.field3334.method327();
               boolean var17;
               if (null == var3) {
                  var17 = false;
               } else {
                  var17 = true;
               }

               int var4;
               class81 var18;
               if (!var17) {
                  class81 var19;
                  int var20;
                  if (field429.field2569) {
                     var19 = class189.method982(class165.field1812, field483.field3459);
                     var19.field933.method666(0);
                     var20 = var19.field933.field1487;
                     field429.method1208(var19.field933);
                     var19.field933.method708(var19.field933.field1487 - var20);
                     field483.method1920(var19);
                     field429.method1207();
                  }

                  Object var21 = class351.field3179.field3100;
                  int var5;
                  int var6;
                  int var7;
                  int var8;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  synchronized(class351.field3179.field3100) {
                     if (!field591) {
                        class351.field3179.field3106 = 0;
                     } else if (class182.field1963 != 0 || class351.field3179.field3106 >= 40) {
                        var18 = null;
                        var4 = 0;
                        var5 = 0;
                        var6 = 0;
                        var7 = 0;

                        for(var8 = 0; var8 < class351.field3179.field3106 && (var18 == null || var18.field933.field1487 - var4 < 246); ++var8) {
                           var5 = var8;
                           var9 = class351.field3179.field3103[var8];
                           if (var9 < -1) {
                              var9 = -1;
                           } else if (var9 > 65534) {
                              var9 = 65534;
                           }

                           var10 = class351.field3179.field3102[var8];
                           if (var10 < -1) {
                              var10 = -1;
                           } else if (var10 > 65534) {
                              var10 = 65534;
                           }

                           if (field437 != var10 || var9 != field469) {
                              if (null == var18) {
                                 var18 = class189.method982(class165.field1790, field483.field3459);
                                 var18.field933.method666(0);
                                 var4 = var18.field933.field1487;
                                 var18.field933.field1487 += 2;
                                 var6 = 0;
                                 var7 = 0;
                              }

                              int var13;
                              if (field439 != -1L) {
                                 var11 = var10 - field437;
                                 var12 = var9 - field469;
                                 var13 = (int)((class351.field3179.field3104[var8] - field439) / 20L);
                                 var6 = (int)((long)var6 + (class351.field3179.field3104[var8] - field439) % 20L);
                              } else {
                                 var11 = var10;
                                 var12 = var9;
                                 var13 = Integer.MAX_VALUE;
                              }

                              field437 = var10;
                              field469 = var9;
                              if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                 var11 += 32;
                                 var12 += 32;
                                 var18.field933.method655(var12 + (var13 << 12) + (var11 << 6));
                              } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                                 var11 += 128;
                                 var12 += 128;
                                 var18.field933.method666(var13 + 128);
                                 var18.field933.method655((var11 << 8) + var12);
                              } else if (var13 < 32) {
                                 var18.field933.method666(var13 + 192);
                                 if (var10 != -1 && var9 != -1) {
                                    var18.field933.method656(var10 | var9 << 16);
                                 } else {
                                    var18.field933.method656(Integer.MIN_VALUE);
                                 }
                              } else {
                                 var18.field933.method655((var13 & 8191) + '\ue000');
                                 if (var10 != -1 && var9 != -1) {
                                    var18.field933.method656(var10 | var9 << 16);
                                 } else {
                                    var18.field933.method656(Integer.MIN_VALUE);
                                 }
                              }

                              ++var7;
                              field439 = class351.field3179.field3104[var8];
                           }
                        }

                        if (var18 != null) {
                           var18.field933.method708(var18.field933.field1487 - var4);
                           var8 = var18.field933.field1487;
                           var18.field933.field1487 = var4;
                           var18.field933.method666(var6 / var7);
                           var18.field933.method666(var6 % var7);
                           var18.field933.field1487 = var8;
                           field483.method1920(var18);
                        }

                        if (var5 >= class351.field3179.field3106) {
                           class351.field3179.field3106 = 0;
                        } else {
                           class351.field3179.field3106 -= var5;
                           System.arraycopy(class351.field3179.field3102, var5, class351.field3179.field3102, 0, class351.field3179.field3106);
                           System.arraycopy(class351.field3179.field3103, var5, class351.field3179.field3103, 0, class351.field3179.field3106);
                           System.arraycopy(class351.field3179.field3104, var5, class351.field3179.field3104, 0, class351.field3179.field3106);
                        }
                     }
                  }

                  class81 var30;
                  if (class182.field1963 == 1 || !class211.field2375 && class182.field1963 == 4 || 2 == class182.field1963) {
                     long var22 = class182.field1949 - field655;
                     if (var22 > 32767L) {
                        var22 = 32767L;
                     }

                     field655 = class182.field1949;
                     var4 = class182.field1961;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > class22.field161) {
                        var4 = class22.field161;
                     }

                     var5 = class182.field1964;
                     if (var5 < 0) {
                        var5 = 0;
                     } else if (var5 > class391.field3440) {
                        var5 = class391.field3440;
                     }

                     var6 = (int)var22;
                     var30 = class189.method982(class165.field1783, field483.field3459);
                     var30.field933.method655((2 == class182.field1963 ? 1 : 0) + (var6 << 1));
                     var30.field933.method655(var5);
                     var30.field933.method655(var4);
                     field483.method1920(var30);
                  }

                  if (field664.field3863 > 0) {
                     var19 = class189.method982(class165.field1717, field483.field3459);
                     var19.field933.method655(0);
                     var20 = var19.field933.field1487;
                     long var23 = class154.method814();

                     for(var6 = 0; var6 < field664.field3863; ++var6) {
                        long var34 = var23 - field596;
                        if (var34 > 16777215L) {
                           var34 = 16777215L;
                        }

                        field596 = var23;
                        var19.field933.method724((int)var34);
                        var19.field933.method666(field664.field3860[var6]);
                     }

                     var19.field933.method665(var19.field933.field1487 - var20);
                     field483.method1920(var19);
                  }

                  if (field724 > 0) {
                     --field724;
                  }

                  if (field664.method2272(96) || field664.method2272(97) || field664.method2272(98) || field664.method2272(99)) {
                     field520 = true;
                  }

                  if (field520 && field724 <= 0) {
                     field724 = 20;
                     field520 = false;
                     var19 = class189.method982(class165.field1818, field483.field3459);
                     var19.field933.method655(field505);
                     var19.field933.method655(field504);
                     field483.method1920(var19);
                  }

                  if (class421.field3573 && !field502) {
                     field502 = true;
                     var19 = class189.method982(class165.field1804, field483.field3459);
                     var19.field933.method666(1);
                     field483.method1920(var19);
                  }

                  if (!class421.field3573 && field502) {
                     field502 = false;
                     var19 = class189.method982(class165.field1804, field483.field3459);
                     var19.field933.method666(0);
                     field483.method1920(var19);
                  }

                  if (class237.field2566 != null) {
                     class237.field2566.method1826();
                  }

                  if (class103.field1349) {
                     if (class103.field1350 != null) {
                        class103.field1350.method208();
                     }

                     class357.method1707();
                     class103.field1349 = false;
                  }

                  class377.method1797();
                  class228.method1147();
                  if (30 != field433) {
                     return;
                  }

                  for(class474 var25 = (class474)field654.method1934(); var25 != null; var25 = (class474)field654.method1936()) {
                     if (var25.field3942 > 0) {
                        --var25.field3942;
                     }

                     if (var25.field3942 == 0) {
                        if (var25.field3933 >= 0) {
                           var4 = var25.field3933;
                           var5 = var25.field3936;
                           class173 var31 = class212.method1110(var4);
                           if (var5 == 11) {
                              var5 = 10;
                           }

                           if (var5 >= 5 && var5 <= 8) {
                              var5 = 4;
                           }

                           boolean var24 = var31.method917(var5);
                           if (!var24) {
                              continue;
                           }
                        }

                        class140.method736(var25.field3934, var25.field3940, var25.field3930, var25.field3941, var25.field3933, var25.field3943, var25.field3936);
                        var25.method567();
                     } else {
                        if (var25.field3932 > 0) {
                           --var25.field3932;
                        }

                        if (0 == var25.field3932 && var25.field3930 >= 1 && var25.field3941 >= 1 && var25.field3930 <= 102 && var25.field3941 <= 102 && (var25.field3937 < 0 || class230.method1153(var25.field3937, var25.field3939))) {
                           class140.method736(var25.field3934, var25.field3940, var25.field3930, var25.field3941, var25.field3937, var25.field3938, var25.field3939);
                           var25.field3932 = -1;
                           if (var25.field3933 == var25.field3937 && var25.field3933 == -1) {
                              var25.method567();
                           } else if (var25.field3937 == var25.field3933 && var25.field3938 == var25.field3943 && var25.field3936 == var25.field3939) {
                              var25.method567();
                           }
                        }
                     }
                  }

                  class159.method845();
                  ++field483.field3457;
                  if (field483.field3457 > 750) {
                     class380.method1808();
                     return;
                  }

                  class399.method1956();

                  for(var2 = 0; var2 < field479; ++var2) {
                     var20 = field635[var2];
                     class53 var26 = field669[var20];
                     if (null != var26) {
                        class344.method1658(var26, var26.field798.field2720);
                     }
                  }

                  int[] var28 = class25.field179;

                  for(var20 = 0; var20 < class25.field180; ++var20) {
                     class47 var27 = field551[var28[var20]];
                     if (null != var27 && var27.field303 > 0) {
                        --var27.field303;
                        if (0 == var27.field303) {
                           var27.field253 = null;
                        }
                     }
                  }

                  for(var20 = 0; var20 < field479; ++var20) {
                     var4 = field635[var20];
                     class53 var35 = field669[var4];
                     if (null != var35 && var35.field303 > 0) {
                        --var35.field303;
                        if (0 == var35.field303) {
                           var35.field253 = null;
                        }
                     }
                  }

                  ++field480;
                  if (0 != field539) {
                     field517 += 20;
                     if (field517 >= 400) {
                        field539 = 0;
                     }
                  }

                  if (class215.field2405 != null) {
                     ++field541;
                     if (field541 >= 15) {
                        class214.method1117(class215.field2405);
                        class215.field2405 = null;
                     }
                  }

                  class210 var32 = class353.field3188;
                  class210 var33 = class422.field3574;
                  class353.field3188 = null;
                  class422.field3574 = null;
                  field614 = null;
                  field618 = false;
                  field662 = false;
                  field627 = 0;

                  while(field664.method2276() && field627 < 128) {
                     if (field685 >= 2 && field664.method2272(82) && 66 == field664.field3865) {
                        String var29 = class298.method1412();
                        class140.field1508.method741(var29);
                     } else if (1 != field510 || field664.field3852 <= 0) {
                        field668[field627] = field664.field3865;
                        field691[field627] = field664.field3852;
                        ++field627;
                     }
                  }

                  if (class20.method112() && field664.method2272(82) && field664.method2272(81) && field531 != 0) {
                     var4 = class89.field982.field408 - field531;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > 3) {
                        var4 = 3;
                     }

                     if (var4 != class89.field982.field408) {
                        var5 = class89.field982.field258[0] + class381.field3325;
                        var6 = class89.field982.field306[0] + class345.field3166;
                        var30 = class189.method982(class165.field1789, field483.field3459);
                        var30.field933.method706(var6);
                        var30.field933.method688(var4);
                        var30.field933.method694(var5);
                        var30.field933.method703(0);
                        field483.method1920(var30);
                     }

                     field531 = 0;
                  }

                  if (1 == class182.field1963) {
                     field489.method1942();
                  }

                  if (-1 != field597) {
                     class64.method349(field597, 0, 0, class391.field3440, class22.field161, 0, 0);
                  }

                  ++field622;

                  while(true) {
                     class210 var36;
                     class210 var38;
                     class169 var39;
                     do {
                        var39 = (class169)field642.method1933();
                        if (var39 == null) {
                           while(true) {
                              do {
                                 var39 = (class169)field643.method1933();
                                 if (null == var39) {
                                    while(true) {
                                       do {
                                          var39 = (class169)field499.method1933();
                                          if (var39 == null) {
                                             while(true) {
                                                while(true) {
                                                   class81 var37;
                                                   class38 var42;
                                                   do {
                                                      do {
                                                         do {
                                                            var42 = (class38)field644.method1933();
                                                            if (null == var42) {
                                                               this.method282();
                                                               if (null != class237.field2566) {
                                                                  class237.field2566.method1835(class195.field2036, (class89.field982.field297 >> 7) + class381.field3325, class345.field3166 + (class89.field982.field233 >> 7), false);
                                                                  class237.field2566.method1846();
                                                               }

                                                               if (null != field610) {
                                                                  this.method277();
                                                               }

                                                               if (null != class202.field2178) {
                                                                  class214.method1117(class202.field2178);
                                                                  ++field548;
                                                                  if (0 == class182.field1956) {
                                                                     if (field547) {
                                                                        if (class202.field2178 == class325.field3043 && field715 != field535) {
                                                                           class210 var46 = class202.field2178;
                                                                           byte var47 = 0;
                                                                           if (field602 == 1 && var46.field2315 == 206) {
                                                                              var47 = 1;
                                                                           }

                                                                           if (var46.field2209[field715] <= 0) {
                                                                              var47 = 0;
                                                                           }

                                                                           var7 = class172.method913(var46);
                                                                           boolean var41 = (var7 >> 29 & 1) != 0;
                                                                           if (var41) {
                                                                              var8 = field535;
                                                                              var9 = field715;
                                                                              var46.field2209[var9] = var46.field2209[var8];
                                                                              var46.field2253[var9] = var46.field2253[var8];
                                                                              var46.field2209[var8] = -1;
                                                                              var46.field2253[var8] = 0;
                                                                           } else if (var47 == 1) {
                                                                              var8 = field535;
                                                                              var9 = field715;

                                                                              while(var8 != var9) {
                                                                                 if (var8 > var9) {
                                                                                    var46.method1090(var8 - 1, var8);
                                                                                    --var8;
                                                                                 } else if (var8 < var9) {
                                                                                    var46.method1090(var8 + 1, var8);
                                                                                    ++var8;
                                                                                 }
                                                                              }
                                                                           } else {
                                                                              var46.method1090(field715, field535);
                                                                           }

                                                                           var37 = class189.method982(class165.field1727, field483.field3459);
                                                                           var37.field933.method703(class202.field2178.field2307);
                                                                           var37.field933.method706(field535);
                                                                           var37.field933.method655(field715);
                                                                           var37.field933.method690(var47);
                                                                           field483.method1920(var37);
                                                                        }
                                                                     } else if (this.method274()) {
                                                                        this.method275(field544, field545);
                                                                     } else if (field573 > 0) {
                                                                        class2.method10(field544, field545);
                                                                     }

                                                                     field541 = 10;
                                                                     class182.field1963 = 0;
                                                                     class202.field2178 = null;
                                                                  } else if (field548 >= 5 && (class182.field1957 > field544 + 5 || class182.field1957 < field544 - 5 || class182.field1952 > 5 + field545 || class182.field1952 < field545 - 5)) {
                                                                     field547 = true;
                                                                  }
                                                               }

                                                               if (class12.method57()) {
                                                                  var4 = class12.field92;
                                                                  var5 = class12.field95;
                                                                  class81 var43 = class189.method982(class165.field1752, field483.field3459);
                                                                  var43.field933.method666(5);
                                                                  var43.field933.method690(field664.method2272(82) ? (field664.method2272(81) ? 2 : 1) : 0);
                                                                  var43.field933.method706(class381.field3325 + var4);
                                                                  var43.field933.method694(class345.field3166 + var5);
                                                                  field483.method1920(var43);
                                                                  class12.method58();
                                                                  field498 = class182.field1964;
                                                                  field431 = class182.field1961;
                                                                  field539 = 1;
                                                                  field517 = 0;
                                                                  field677 = var4;
                                                                  field423 = var5;
                                                               }

                                                               if (var32 != class353.field3188) {
                                                                  if (null != var32) {
                                                                     class214.method1117(var32);
                                                                  }

                                                                  if (class353.field3188 != null) {
                                                                     class214.method1117(class353.field3188);
                                                                  }
                                                               }

                                                               if (var33 != class422.field3574 && field470 == field438) {
                                                                  if (var33 != null) {
                                                                     class214.method1117(var33);
                                                                  }

                                                                  if (null != class422.field3574) {
                                                                     class214.method1117(class422.field3574);
                                                                  }
                                                               }

                                                               if (null != class422.field3574) {
                                                                  if (field470 < field438) {
                                                                     ++field470;
                                                                     if (field438 == field470) {
                                                                        class214.method1117(class422.field3574);
                                                                     }
                                                                  }
                                                               } else if (field470 > 0) {
                                                                  --field470;
                                                               }

                                                               class328.method1589();
                                                               if (field689) {
                                                                  class373.method1784();
                                                               } else if (field688) {
                                                                  var4 = 64 + class89.field980 * 128;
                                                                  var5 = class352.field3185 * 128 + 64;
                                                                  var6 = class192.method991(var4, var5, class195.field2036) - class472.field3922;
                                                                  class155.method818(var4, var6, var5);
                                                                  var4 = 64 + class329.field3067 * 128;
                                                                  var5 = 64 + class299.field2882 * 128;
                                                                  var6 = class192.method991(var4, var5, class195.field2036) - class297.field2857;
                                                                  var7 = var4 - class342.field3148;
                                                                  var8 = var6 - class318.field3010;
                                                                  var9 = var5 - class112.field1394;
                                                                  var10 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7));
                                                                  var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047;
                                                                  var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
                                                                  class408.method1993(var11, var12);
                                                               }

                                                               for(var4 = 0; var4 < 5; ++var4) {
                                                                  ++field534[var4];
                                                               }

                                                               class430.field3600.method1779();
                                                               var4 = ++class182.field1965 - 1;
                                                               var6 = class147.method783();
                                                               if (var4 > 15000 && var6 > 15000) {
                                                                  field484 = 250;
                                                                  class47.method256(14500);
                                                                  var30 = class189.method982(class165.field1793, field483.field3459);
                                                                  field483.method1920(var30);
                                                               }

                                                               class321.field3026.method477();
                                                               ++field483.field3462;
                                                               if (field483.field3462 > 50) {
                                                                  var30 = class189.method982(class165.field1798, field483.field3459);
                                                                  field483.method1920(var30);
                                                               }

                                                               try {
                                                                  field483.method1917();
                                                               } catch (IOException var15) {
                                                                  class380.method1808();
                                                               }

                                                               return;
                                                            }
                                                         } while(var42 == null);
                                                      } while(var42.field362 == null);

                                                      if (var42.field362.field2217 < 0) {
                                                         break;
                                                      }

                                                      var38 = class274.method1301(var42.field362.field2234);
                                                   } while(null == var38 || var38.field2353 == null || var38.field2353.length == 0 || var42.field362.field2217 >= var38.field2353.length || var42.field362 != var38.field2353[var42.field362.field2217]);

                                                   if (var42.field362.field2348 == 11 && 0 == var42.field359) {
                                                      switch(var42.field362.method1081()) {
                                                      case 0:
                                                         class213.method1115(var42.field362.method1083(), true, false);
                                                         break;
                                                      case 1:
                                                         var6 = class172.method913(var42.field362);
                                                         boolean var45 = 0 != (var6 >> 22 & 1);
                                                         if (var45) {
                                                            int[] var40 = var42.field362.method1084();
                                                            if (null != var40) {
                                                               var37 = class189.method982(class165.field1823, field483.field3459);
                                                               var37.field933.method701(var40[2]);
                                                               var37.field933.method656(var42.field362.field2307);
                                                               var37.field933.method701(var42.field362.method1082());
                                                               var37.field933.method656(var40[1]);
                                                               var37.field933.method655(var42.field362.field2217);
                                                               var37.field933.method703(var40[0]);
                                                               field483.method1920(var37);
                                                            }
                                                         }
                                                      }
                                                   } else if (12 == var42.field362.field2348) {
                                                      class459 var44 = var42.field362.method1076();
                                                      if (null != var44 && var44.method2184()) {
                                                         switch(var42.field359) {
                                                         case 0:
                                                            field489.method1940(var42.field362);
                                                            var44.method2186(true);
                                                            var44.method2219(var42.field361, var42.field360, field664.method2272(82), field664.method2272(81));
                                                            break;
                                                         case 1:
                                                            var44.method2258(var42.field361, var42.field360);
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }

                                          var38 = var39.field1848;
                                          if (var38.field2217 < 0) {
                                             break;
                                          }

                                          var36 = class274.method1301(var38.field2234);
                                       } while(null == var36 || null == var36.field2353 || var38.field2217 >= var36.field2353.length || var36.field2353[var38.field2217] != var38);

                                       class194.method1001(var39);
                                    }
                                 }

                                 var38 = var39.field1848;
                                 if (var38.field2217 < 0) {
                                    break;
                                 }

                                 var36 = class274.method1301(var38.field2234);
                              } while(var36 == null || null == var36.field2353 || var38.field2217 >= var36.field2353.length || var38 != var36.field2353[var38.field2217]);

                              class194.method1001(var39);
                           }
                        }

                        var38 = var39.field1848;
                        if (var38.field2217 < 0) {
                           break;
                        }

                        var36 = class274.method1301(var38.field2234);
                     } while(null == var36 || var36.field2353 == null || var38.field2217 >= var36.field2353.length || var36.field2353[var38.field2217] != var38);

                     class194.method1001(var39);
                  }
               }

               var18 = class189.method982(class165.field1805, field483.field3459);
               var18.field933.method666(0);
               var4 = var18.field933.field1487;
               class83.method443(var18.field933);
               var18.field933.method708(var18.field933.field1487 - var4);
               field483.method1920(var18);
            }
         }
      }
   }

   protected final void method765() {
      field656 = class154.method814() + 500L;
      this.method272();
      if (-1 != field597) {
         this.method287(true);
      }

   }

   void method272() {
      int var2 = class391.field3440;
      int var3 = class22.field161;
      if (super.field1520 < var2) {
         var2 = super.field1520;
      }

      if (super.field1519 < var3) {
         var3 = super.field1519;
      }

      if (null != class111.field1385) {
         try {
            client var4 = class140.field1508;
            Object[] var5 = new Object[]{class154.method816()};
            JSObject.getWindow(var4).call("resize", var5);
         } catch (Throwable var6) {
            ;
         }
      }

   }

   final void method273() {
      int var2;
      if (field597 != -1) {
         var2 = field597;
         if (class25.method126(var2)) {
            class77.method417(class71.field853[var2], -1);
         }
      }

      for(var2 = 0; var2 < field646; ++var2) {
         if (field648[var2]) {
            field649[var2] = true;
         }

         field650[var2] = field648[var2];
         field648[var2] = false;
      }

      field725 = field435;
      field586 = -1;
      field587 = -1;
      class325.field3043 = null;
      if (field597 != -1) {
         field646 = 0;
         class44.method226(field597, 0, 0, class391.field3440, class22.field161, 0, 0, -1);
      }

      class362.method1748();
      if (field456) {
         if (field539 == 1) {
            class182.field1968[field517 / 100].method1548(field498 - 8, field431 - 8);
         }

         if (field539 == 2) {
            class182.field1968[field517 / 100 + 4].method1548(field498 - 8, field431 - 8);
         }
      }

      int var3;
      int var4;
      if (!field572) {
         if (field586 != -1) {
            var2 = field586;
            var3 = field587;
            if ((field573 >= 2 || 0 != field590 || field592) && field585) {
               var4 = field573 - 1;
               String var6;
               if (1 == field590 && field573 < 2) {
                  var6 = class96.field1181 + class96.field1191 + field687 + " " + class389.field3436;
               } else if (field592 && field573 < 2) {
                  var6 = field595 + class96.field1191 + field714 + " " + class389.field3436;
               } else {
                  String var7;
                  if (var4 < 0) {
                     var7 = "";
                  } else if (field460[var4].length() > 0) {
                     var7 = field579[var4] + class96.field1191 + field460[var4];
                  } else {
                     var7 = field579[var4];
                  }

                  var6 = var7;
               }

               if (field573 > 2) {
                  var6 = var6 + class334.method1616(16777215) + " " + '/' + " " + (field573 - 2) + class96.field1151;
               }

               class299.field2880.method524(var6, var2 + 4, var3 + 15, 16777215, 0, field435 / 1000);
            }
         }
      } else {
         class302.method1427();
      }

      if (3 == field679) {
         for(var2 = 0; var2 < field646; ++var2) {
            if (field650[var2]) {
               class362.method1752(field651[var2], field652[var2], field639[var2], field451[var2], 16711935, 128);
            } else if (field649[var2]) {
               class362.method1752(field651[var2], field652[var2], field639[var2], field451[var2], 16711680, 128);
            }
         }
      }

      var2 = class195.field2036;
      var3 = class89.field982.field297;
      var4 = class89.field982.field233;
      int var5 = field480;

      for(class82 var13 = (class82)class82.field946.method1934(); null != var13; var13 = (class82)class82.field946.method1936()) {
         if (-1 != var13.field943 || var13.field947 != null) {
            int var14 = 0;
            if (var3 > var13.field939) {
               var14 += var3 - var13.field939;
            } else if (var3 < var13.field938) {
               var14 += var13.field938 - var3;
            }

            if (var4 > var13.field941) {
               var14 += var4 - var13.field941;
            } else if (var4 < var13.field936) {
               var14 += var13.field936 - var4;
            }

            if (var14 - 64 <= var13.field945 && class111.field1385.method1345() != 0 && var13.field942 == var2) {
               var14 -= 64;
               if (var14 < 0) {
                  var14 = 0;
               }

               int var8 = (var13.field945 - var14) * class111.field1385.method1345() / var13.field945;
               class136 var10000;
               if (null == var13.field944) {
                  if (var13.field943 >= 0) {
                     var10000 = (class136)null;
                     class136 var9 = class136.method728(class35.field350, var13.field943, 0);
                     if (null != var9) {
                        class388 var10 = var9.method729().method1884(class412.field3552);
                        class310 var11 = class310.method1449(var10, 100, var8);
                        var11.method1451(-1);
                        class488.field4008.method1923(var11);
                        var13.field944 = var11;
                     }
                  }
               } else {
                  var13.field944.method1452(var8);
               }

               if (null == var13.field949) {
                  if (null != var13.field947 && (var13.field948 -= var5) <= 0) {
                     int var15 = (int)(Math.random() * (double)var13.field947.length);
                     var10000 = (class136)null;
                     class136 var16 = class136.method728(class35.field350, var13.field947[var15], 0);
                     if (var16 != null) {
                        class388 var17 = var16.method729().method1884(class412.field3552);
                        class310 var12 = class310.method1449(var17, 100, var8);
                        var12.method1451(0);
                        class488.field4008.method1923(var12);
                        var13.field949 = var12;
                        var13.field948 = var13.field940 + (int)(Math.random() * (double)(var13.field937 - var13.field940));
                     }
                  }
               } else {
                  var13.field949.method1452(var8);
                  if (!var13.field949.method566()) {
                     var13.field949 = null;
                  }
               }
            } else {
               if (null != var13.field944) {
                  class488.field4008.method1924(var13.field944);
                  var13.field944 = null;
               }

               if (null != var13.field949) {
                  class488.field4008.method1924(var13.field949);
                  var13.field949 = null;
               }
            }
         }
      }

      field480 = 0;
   }

   boolean method279(class393 var1, int var2) {
      if (var1.field3464 == 0) {
         class103.field1350 = null;
      } else {
         if (class103.field1350 == null) {
            class103.field1350 = new class85(class170.field1860, class140.field1508);
         }

         class103.field1350.method465(var1.field3460, var2);
      }

      field527 = field622;
      class103.field1349 = true;
      var1.field3461 = null;
      return true;
   }

   boolean method278(class393 var1) {
      if (class103.field1350 != null) {
         class103.field1350.method462(var1.field3460);
      }

      field527 = field622;
      class103.field1349 = true;
      var1.field3461 = null;
      return true;
   }

   final boolean method285(class393 var1) {
      class429 var3 = var1.method1915();
      class421 var4 = var1.field3460;
      if (var3 == null) {
         return false;
      } else {
         String var6;
         int var7;
         try {
            int var24;
            if (null == var1.field3461) {
               if (var1.field3465) {
                  if (!var3.method2055(1)) {
                     return false;
                  }

                  var3.method2050(var1.field3460.field1489, 0, 1);
                  var1.field3457 = 0;
                  var1.field3465 = false;
               }

               var4.field1487 = 0;
               if (var4.method2020()) {
                  if (!var3.method2055(1)) {
                     return false;
                  }

                  var3.method2050(var1.field3460.field1489, 1, 1);
                  var1.field3457 = 0;
               }

               var1.field3465 = true;
               class200[] var5 = class438.method2094();
               var24 = var4.method2025();
               if (var24 < 0 || var24 >= var5.length) {
                  throw new IOException(var24 + " " + var4.field1487);
               }

               var1.field3461 = var5[var24];
               var1.field3464 = var1.field3461.field2082;
            }

            if (var1.field3464 == -1) {
               if (!var3.method2055(1)) {
                  return false;
               }

               var1.method1915().method2050(var4.field1489, 0, 1);
               var1.field3464 = var4.field1489[0] & 255;
            }

            if (-2 == var1.field3464) {
               if (!var3.method2055(2)) {
                  return false;
               }

               var1.method1915().method2050(var4.field1489, 0, 2);
               var4.field1487 = 0;
               var1.field3464 = var4.method671();
            }

            if (!var3.method2055(var1.field3464)) {
               return false;
            }

            var4.field1487 = 0;
            var3.method2050(var4.field1489, 0, var1.field3464);
            var1.field3457 = 0;
            field429.method1209();
            var1.field3468 = var1.field3467;
            var1.field3467 = var1.field3466;
            var1.field3466 = var1.field3461;
            if (var1.field3461 == class200.field2070) {
               class412.method1997(class167.field1841);
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2055) {
               class412.method1997(class167.field1838);
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2117) {
               class446.method2119(false, var4);
               var1.field3461 = null;
               return true;
            }

            if (class200.field2068 == var1.field3461) {
               if (class298.field2877 == null) {
                  class298.field2877 = new class318(class352.field3182);
               }

               class426 var88 = class352.field3182.method90(var4);
               class298.field2877.field3012.method550(var88.field3581, var88.field3582);
               field629[++field630 - 1 & 31] = var88.field3581;
               var1.field3461 = null;
               return true;
            }

            int var23;
            if (var1.field3461 == class200.field2108) {
               class116.field1415 = var4.method669();
               class360.field3233 = var4.method714();

               while(var4.field1487 < var1.field3464) {
                  var23 = var4.method669();
                  class167 var87 = class192.method987()[var23];
                  class412.method1997(var87);
               }

               var1.field3461 = null;
               return true;
            }

            int var8;
            int var9;
            class210 var29;
            int var37;
            if (var1.field3461 == class200.field2087) {
               var23 = var4.method717();
               var24 = var4.method671();
               if (var23 < -70000) {
                  var24 += 32768;
               }

               if (var23 >= 0) {
                  var29 = class274.method1301(var23);
               } else {
                  var29 = null;
               }

               for(; var4.field1487 < var1.field3464; class324.method1570(var24, var8, var9 - 1, var37)) {
                  var8 = var4.method681();
                  var9 = var4.method671();
                  var37 = 0;
                  if (var9 != 0) {
                     var37 = var4.method669();
                     if (var37 == 255) {
                        var37 = var4.method717();
                     }
                  }

                  if (null != var29 && var8 >= 0 && var8 < var29.field2209.length) {
                     var29.field2209[var8] = var9;
                     var29.field2253[var8] = var37;
                  }
               }

               if (null != var29) {
                  class214.method1117(var29);
               }

               class189.method981();
               field625[++field626 - 1 & 31] = var24 & 32767;
               var1.field3461 = null;
               return true;
            }

            int var16;
            int var17;
            byte var27;
            class323 var62;
            String var63;
            if (var1.field3461 == class200.field2145) {
               var27 = var4.method670();
               var6 = var4.method677();
               long var83 = (long)var4.method671();
               long var61 = (long)var4.method673();
               class224 var69 = (class224)class296.method1399(class251.method1234(), var4.method669());
               long var59 = var61 + (var83 << 32);
               boolean var65 = false;
               var62 = null;
               class112 var79 = var27 >= 0 ? field549[var27] : class359.field3209;
               if (var79 == null) {
                  var65 = true;
               } else {
                  var16 = 0;

                  while(true) {
                     if (var16 >= 100) {
                        if (var69.field2456 && class321.field3026.method475(new class174(var6, class170.field1860))) {
                           var65 = true;
                        }
                        break;
                     }

                     if (var59 == field440[var16]) {
                        var65 = true;
                        break;
                     }

                     ++var16;
                  }
               }

               if (!var65) {
                  field440[field663] = var59;
                  field663 = (field663 + 1) % 100;
                  var63 = class93.method535(class124.method633(var4));
                  var17 = var27 >= 0 ? 41 : 44;
                  if (-1 != var69.field2454) {
                     class43.method222(var17, class180.method945(var69.field2454) + var6, var63, var79.field1392);
                  } else {
                     class43.method222(var17, var6, var63, var79.field1392);
                  }
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2134) {
               field688 = true;
               field689 = false;
               class89.field980 = var4.method669();
               class352.field3185 = var4.method669();
               class472.field3922 = var4.method671();
               class373.field3298 = var4.method669();
               class448.field3689 = var4.method669();
               if (class448.field3689 >= 100) {
                  class342.field3148 = 64 + class89.field980 * 128;
                  class112.field1394 = class352.field3185 * 128 + 64;
                  class318.field3010 = class192.method991(class342.field3148, class112.field1394, class195.field2036) - class472.field3922;
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2057 == var1.field3461) {
               var23 = var4.method696();
               if (var23 == 65535) {
                  var23 = -1;
               }

               class357.method1709(var23);
               var1.field3461 = null;
               return true;
            }

            if (class200.field2110 == var1.field3461) {
               var23 = var4.method709();
               var24 = var4.method653();
               if (var24 == 65535) {
                  var24 = -1;
               }

               class457.method2163(var24, var23);
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2054) {
               class298.field2877 = null;
               var1.field3461 = null;
               return true;
            }

            if (class200.field2129 == var1.field3461) {
               field430 = field622;
               var27 = var4.method670();
               class124 var85 = new class124(var4);
               class112 var81;
               if (var27 >= 0) {
                  var81 = field549[var27];
               } else {
                  var81 = class359.field3209;
               }

               var85.method632(var81);
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2106) {
               var23 = var4.method704();
               var24 = var4.method697();
               var7 = var24 >> 10 & 31;
               var8 = var24 >> 5 & 31;
               var9 = var24 & 31;
               var37 = (var8 << 11) + (var7 << 19) + (var9 << 3);
               class210 var67 = class274.method1301(var23);
               if (var67.field2239 != var37) {
                  var67.field2239 = var37;
                  class214.method1117(var67);
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2152) {
               for(var23 = 0; var23 < field551.length; ++var23) {
                  if (field551[var23] != null) {
                     field551[var23].field274 = -1;
                  }
               }

               for(var23 = 0; var23 < field669.length; ++var23) {
                  if (field669[var23] != null) {
                     field669[var23].field274 = -1;
                  }
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2101) {
               var23 = var4.method669();
               if (var4.method669() == 0) {
                  field633[var23] = new class29();
                  var4.field1487 += 18;
               } else {
                  --var4.field1487;
                  field633[var23] = new class29(var4, false);
               }

               field694 = field622;
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2095) {
               class240.method1214(false, var1.field3460);
               var1.field3461 = null;
               return true;
            }

            if (class200.field2052 == var1.field3461) {
               class296 var86 = new class296();
               var86.field2840 = var4.method677();
               var86.field2832 = var4.method671();
               var24 = var4.method717();
               var86.field2838 = var24;
               class72.method402(45);
               var3.method2054();
               var3 = null;
               class447.method2121(var86);
               var1.field3461 = null;
               return false;
            }

            if (var1.field3461 == class200.field2091) {
               class141.method763();
               var27 = var4.method670();
               if (var1.field3464 == 1) {
                  if (var27 >= 0) {
                     field670[var27] = null;
                  } else {
                     class449.field3690 = null;
                  }

                  var1.field3461 = null;
                  return true;
               }

               if (var27 >= 0) {
                  field670[var27] = new class27(var4);
               } else {
                  class449.field3690 = new class27(var4);
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2083 == var1.field3461) {
               class412.method1997(class167.field1831);
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2126) {
               class298.field2878 = class211.method1105(var4.method669());
               var1.field3461 = null;
               return true;
            }

            int var14;
            String var25;
            long var28;
            long var38;
            String var52;
            if (var1.field3461 == class200.field2139) {
               var25 = var4.method677();
               var38 = (long)var4.method671();
               var28 = (long)var4.method673();
               class224 var58 = (class224)class296.method1399(class251.method1234(), var4.method669());
               long var64 = var28 + (var38 << 32);
               boolean var55 = false;

               for(var14 = 0; var14 < 100; ++var14) {
                  if (field440[var14] == var64) {
                     var55 = true;
                     break;
                  }
               }

               if (class321.field3026.method475(new class174(var25, class170.field1860))) {
                  var55 = true;
               }

               if (!var55 && 0 == field608) {
                  field440[field663] = var64;
                  field663 = (1 + field663) % 100;
                  var52 = class93.method535(class465.method2281(class124.method633(var4)));
                  byte var73;
                  if (var58.field2442) {
                     var73 = 7;
                  } else {
                     var73 = 3;
                  }

                  if (-1 != var58.field2454) {
                     class237.method1197(var73, class180.method945(var58.field2454) + var25, var52);
                  } else {
                     class237.method1197(var73, var25, var52);
                  }
               }

               var1.field3461 = null;
               return true;
            }

            int var11;
            int var15;
            int var18;
            int var19;
            class260 var20;
            int var42;
            byte var46;
            int var47;
            byte var54;
            if (class200.field2141 == var1.field3461) {
               var46 = var4.method670();
               var7 = var4.method700();
               var23 = var7 >> 16;
               var24 = var7 >> 8 & 255;
               var8 = (var7 >> 4 & 7) + var23;
               var9 = (var7 & 7) + var24;
               var42 = var4.method672();
               var16 = var4.method697();
               var54 = var4.method721();
               var18 = var4.method714();
               var14 = var4.method716() * 4;
               var17 = var4.method697();
               var19 = var4.method669();
               var47 = var4.method696();
               var15 = var4.method716() * 4;
               var37 = var46 + var8;
               var11 = var54 + var9;
               if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var37 >= 0 && var11 >= 0 && var37 < 104 && var11 < 104 && var47 != 65535) {
                  var8 = var8 * 128 + 64;
                  var9 = 64 + var9 * 128;
                  var37 = 64 + var37 * 128;
                  var11 = var11 * 128 + 64;
                  var20 = new class260(var47, class195.field2036, var8, var9, class192.method991(var8, var9, class195.field2036) - var14, field435 + var16, var17 + field435, var18, var19, var42, var15);
                  var20.method1252(var37, var11, class192.method991(var37, var11, class195.field2036) - var15, field435 + var16);
                  field566.method1930(var20);
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2062 == var1.field3461) {
               var15 = var4.method691() * 4;
               var54 = var4.method721();
               var18 = var4.method669();
               var46 = var4.method721();
               var47 = var4.method697();
               var42 = var4.method712();
               var7 = var4.method699();
               var23 = var7 >> 16;
               var24 = var7 >> 8 & 255;
               var8 = (var7 >> 4 & 7) + var23;
               var9 = var24 + (var7 & 7);
               var14 = var4.method669() * 4;
               var19 = var4.method714();
               var16 = var4.method653();
               var17 = var4.method697();
               var37 = var46 + var8;
               var11 = var54 + var9;
               if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var37 >= 0 && var11 >= 0 && var37 < 104 && var11 < 104 && var47 != 65535) {
                  var8 = var8 * 128 + 64;
                  var9 = 64 + var9 * 128;
                  var37 = 64 + var37 * 128;
                  var11 = 64 + var11 * 128;
                  var20 = new class260(var47, class195.field2036, var8, var9, class192.method991(var8, var9, class195.field2036) - var14, var16 + field435, var17 + field435, var18, var19, var42, var15);
                  var20.method1252(var37, var11, class192.method991(var37, var11, class195.field2036) - var15, var16 + field435);
                  field566.method1930(var20);
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2071 == var1.field3461) {
               class321.field3026.field976.method1783(var4, var1.field3464);
               class441.method2107();
               field632 = field622;
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2049) {
               var23 = var4.method696();
               byte var84 = var4.method715();
               class484.field3991[var23] = var84;
               if (var84 != class484.field3992[var23]) {
                  class484.field3992[var23] = var84;
               }

               class334.method1617(var23);
               field623[++field624 - 1 & 31] = var23;
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2111) {
               class321.field3026.method484();
               field632 = field622;
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2144) {
               var23 = var4.method691();
               var6 = var4.method677();
               var7 = var4.method669();
               if (var7 >= 1 && var7 <= 8) {
                  if (var6.equalsIgnoreCase(class96.field1020)) {
                     var6 = null;
                  }

                  field560[var7 - 1] = var6;
                  field561[var7 - 1] = var23 == 0;
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2092 == var1.field3461) {
               var23 = var4.method653();
               class47 var75;
               if (var23 == field552) {
                  var75 = class89.field982;
               } else {
                  var75 = field551[var23];
               }

               var24 = var4.method696();
               var7 = var4.method704();
               if (var75 != null) {
                  var75.field279 = var24;
                  var75.field301 = var7 >> 16;
                  var75.field282 = (var7 & '\uffff') + field435;
                  var75.field280 = 0;
                  var75.field269 = 0;
                  if (var75.field282 > field435) {
                     var75.field280 = -1;
                  }

                  if (var75.field279 == 65535) {
                     var75.field279 = -1;
                  }
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2140) {
               class240.method1214(true, var1.field3460);
               var1.field3461 = null;
               return true;
            }

            if (class200.field2074 == var1.field3461) {
               field441 = var4.method653() * 30;
               field638 = field622;
               var1.field3461 = null;
               return true;
            }

            if (class200.field2094 == var1.field3461) {
               field430 = field622;
               var27 = var4.method670();
               if (var1.field3464 == 1) {
                  if (var27 >= 0) {
                     field549[var27] = null;
                  } else {
                     class359.field3209 = null;
                  }

                  var1.field3461 = null;
                  return true;
               }

               if (var27 >= 0) {
                  field549[var27] = new class112(var4);
               } else {
                  class359.field3209 = new class112(var4);
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2045) {
               var23 = var4.method653();
               field597 = var23;
               this.method287(false);
               class214.method1116(var23);
               class373.method1786(field597);

               for(var24 = 0; var24 < 100; ++var24) {
                  field648[var24] = true;
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2146 == var1.field3461) {
               class412.method1997(class167.field1834);
               var1.field3461 = null;
               return true;
            }

            if (class200.field2157 == var1.field3461) {
               class189.method981();
               field546 = var4.method671();
               field638 = field622;
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2105) {
               for(var23 = 0; var23 < class212.field2379; ++var23) {
                  class212 var82 = class329.method1594(var23);
                  if (var82 != null) {
                     class484.field3991[var23] = 0;
                     class484.field3992[var23] = 0;
                  }
               }

               class189.method981();
               field624 += 32;
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2099) {
               field688 = false;

               for(var23 = 0; var23 < 5; ++var23) {
                  field690[var23] = false;
               }

               var1.field3461 = null;
               return true;
            }

            class210 var40;
            if (var1.field3461 == class200.field2142) {
               var23 = var4.method698();
               var24 = var4.method704();
               var7 = var4.method672();
               var40 = class274.method1301(var24);
               if (var40.field2224 != var7 || var40.field2225 != var23 || 0 != var40.field2262 || 0 != var40.field2358) {
                  var40.field2224 = var7;
                  var40.field2225 = var23;
                  var40.field2262 = 0;
                  var40.field2358 = 0;
                  class214.method1117(var40);
                  this.method286(var40);
                  if (var40.field2348 == 0) {
                     class357.method1708(class71.field853[var24 >> 16], var40, false);
                  }
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2077 && field688) {
               field689 = true;
               class373.field3298 = var4.method669();
               class448.field3689 = var4.method669();
               class14.field127 = var4.method669();
               class298.field2875 = var4.method669();

               for(var23 = 0; var23 < 5; ++var23) {
                  field690[var23] = false;
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2121) {
               class189.method981();
               var23 = var4.method704();
               var24 = var4.method716();
               var7 = var4.method716();
               field570[var7] = var23;
               field497[var7] = var24;
               field569[var7] = 1;

               for(var8 = 0; var8 < 98; ++var8) {
                  if (var23 >= class166.field1827[var8]) {
                     field569[var7] = var8 + 2;
                  }
               }

               field553[++field628 - 1 & 31] = var7;
               var1.field3461 = null;
               return true;
            }

            if (class200.field2067 == var1.field3461) {
               class141.method763();
               var27 = var4.method670();
               class105 var80 = new class105(var4);
               class27 var77;
               if (var27 >= 0) {
                  var77 = field670[var27];
               } else {
                  var77 = class449.field3690;
               }

               var80.method565(var77);
               var1.field3461 = null;
               return true;
            }

            if (class200.field2158 == var1.field3461) {
               var23 = var4.method717();
               var24 = var4.method716();
               short var76 = (short)var4.method672();
               var8 = var4.method697();
               class53 var50 = field669[var8];
               if (var50 != null) {
                  var50.method302(var24, var23, var76);
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2090 == var1.field3461) {
               field442 = var4.method669();
               if (1 == field442) {
                  field443 = var4.method671();
               }

               if (field442 >= 2 && field442 <= 6) {
                  if (2 == field442) {
                     field448 = 64;
                     field543 = 64;
                  }

                  if (3 == field442) {
                     field448 = 0;
                     field543 = 64;
                  }

                  if (4 == field442) {
                     field448 = 128;
                     field543 = 64;
                  }

                  if (5 == field442) {
                     field448 = 64;
                     field543 = 0;
                  }

                  if (field442 == 6) {
                     field448 = 64;
                     field543 = 128;
                  }

                  field442 = 2;
                  field445 = var4.method671();
                  field486 = var4.method671();
                  field447 = var4.method669();
               }

               if (10 == field442) {
                  field511 = var4.method671();
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2085 == var1.field3461) {
               class412.method1997(class167.field1828);
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2151) {
               var7 = var4.method673();
               var23 = var7 >> 16;
               var24 = var7 >> 8 & 255;
               var8 = var23 + (var7 >> 4 & 7);
               var9 = (var7 & 7) + var24;
               var37 = var4.method716();
               var11 = var37 >> 2;
               var42 = var37 & 3;
               var47 = field496[var11];
               var14 = var4.method653();
               if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
                  if (var47 == 0) {
                     class176 var70 = class13.field126.method48(class195.field2036, var8, var9);
                     if (var70 != null) {
                        var16 = class7.method24(var70.field1926);
                        if (var11 == 2) {
                           var70.field1919 = new class479(var16, 2, var42 + 4, class195.field2036, var8, var9, var14, false, var70.field1919);
                           var70.field1925 = new class479(var16, 2, var42 + 1 & 3, class195.field2036, var8, var9, var14, false, var70.field1925);
                        } else {
                           var70.field1919 = new class479(var16, var11, var42, class195.field2036, var8, var9, var14, false, var70.field1919);
                        }
                     }
                  } else if (var47 == 1) {
                     class316 var68 = class13.field126.method82(class195.field2036, var8, var9);
                     if (null != var68) {
                        var16 = class7.method24(var68.field2996);
                        if (var11 != 4 && var11 != 5) {
                           if (var11 == 6) {
                              var68.field3002 = new class479(var16, 4, var42 + 4, class195.field2036, var8, var9, var14, false, var68.field3002);
                           } else if (var11 == 7) {
                              var68.field3002 = new class479(var16, 4, (var42 + 2 & 3) + 4, class195.field2036, var8, var9, var14, false, var68.field3002);
                           } else if (var11 == 8) {
                              var68.field3002 = new class479(var16, 4, var42 + 4, class195.field2036, var8, var9, var14, false, var68.field3002);
                              var68.field3003 = new class479(var16, 4, 4 + (var42 + 2 & 3), class195.field2036, var8, var9, var14, false, var68.field3003);
                           }
                        } else {
                           var68.field3002 = new class479(var16, 4, var42, class195.field2036, var8, var9, var14, false, var68.field3002);
                        }
                     }
                  } else if (var47 == 2) {
                     var62 = class13.field126.method50(class195.field2036, var8, var9);
                     if (var11 == 11) {
                        var11 = 10;
                     }

                     if (null != var62) {
                        var62.field3029 = new class479(class7.method24(var62.field3038), var11, var42, class195.field2036, var8, var9, var14, false, var62.field3029);
                     }
                  } else if (var47 == 3) {
                     class344 var66 = class13.field126.method72(class195.field2036, var8, var9);
                     if (null != var66) {
                        var66.field3157 = new class479(class7.method24(var66.field3158), 22, var42, class195.field2036, var8, var9, var14, false, var66.field3157);
                     }
                  }
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2122 == var1.field3461) {
               class326.method1579(var4, var1.field3464);
               class325.method1572();
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2089) {
               class38.field363 = true;
               class326.method1579(var4, var1.field3464);
               class325.method1572();
               var1.field3461 = null;
               return true;
            }

            class240 var36;
            if (var1.field3461 == class200.field2109) {
               var23 = var4.method725();
               var24 = var4.method716();
               var7 = var4.method671();
               var36 = (class240)field598.method545((long)var23);
               if (var36 != null) {
                  class328.method1590(var36, var7 != var36.field2580, (byte)93);
               }

               class285.method1357(var23, var7, var24);
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2150) {
               var23 = var4.method693();
               var24 = var4.method671();
               var7 = var4.method671();
               var40 = class274.method1301(var23);
               var40.field2271 = (var24 << 16) + var7;
               var1.field3461 = null;
               return true;
            }

            if (class200.field2143 == var1.field3461) {
               return this.method278(var1);
            }

            if (var1.field3461 == class200.field2154) {
               class412.method1997(class167.field1839);
               var1.field3461 = null;
               return true;
            }

            if (class200.field2076 == var1.field3461) {
               return this.method279(var1, 1);
            }

            class210 var33;
            if (var1.field3461 == class200.field2079) {
               var23 = var4.method693();
               var24 = var4.method717();
               class240 var72 = (class240)field598.method545((long)var23);
               var36 = (class240)field598.method545((long)var24);
               if (null != var36) {
                  class328.method1590(var36, null == var72 || var36.field2580 != var72.field2580, (byte)105);
               }

               if (null != var72) {
                  var72.method567();
                  field598.method542(var72, (long)var24);
               }

               var33 = class274.method1301(var23);
               if (null != var33) {
                  class214.method1117(var33);
               }

               var33 = class274.method1301(var24);
               if (var33 != null) {
                  class214.method1117(var33);
                  class357.method1708(class71.field853[var33.field2307 >>> 16], var33, true);
               }

               if (-1 != field597) {
                  class100.method552(field597, 1);
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2159 == var1.field3461) {
               var23 = var4.method725();
               var24 = var4.method671();
               var29 = class274.method1301(var23);
               if (6 != var29.field2258 || var24 != var29.field2277) {
                  var29.field2258 = 6;
                  var29.field2277 = var24;
                  class214.method1117(var29);
               }

               var1.field3461 = null;
               return true;
            }

            boolean var34;
            String var60;
            if (var1.field3461 == class200.field2047) {
               var23 = var4.method681();
               var34 = var4.method669() == 1;
               var60 = "";
               boolean var57 = false;
               if (var34) {
                  var60 = var4.method677();
                  if (class321.field3026.method475(new class174(var60, class170.field1860))) {
                     var57 = true;
                  }
               }

               String var43 = var4.method677();
               if (!var57) {
                  class237.method1197(var23, var60, var43);
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2156 == var1.field3461) {
               byte[] var74 = new byte[var1.field3464];
               var4.method2016(var74, 0, var74.length);
               class134 var78 = new class134(var74);
               var60 = var78.method677();
               class213.method1115(var60, true, false);
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2100) {
               class47.method255();
               var1.field3461 = null;
               return false;
            }

            if (var1.field3461 == class200.field2137) {
               var23 = var4.method693();
               var24 = var4.method696();
               var29 = class274.method1301(var23);
               if (var29.field2258 != 1 || var29.field2277 != var24) {
                  var29.field2258 = 1;
                  var29.field2277 = var24;
                  class214.method1117(var29);
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2125 == var1.field3461) {
               var23 = var4.method672();
               var24 = var4.method704();
               var29 = class274.method1301(var24);
               if (var23 != var29.field2297 || var23 == -1) {
                  var29.field2297 = var23;
                  var29.field2351 = 0;
                  var29.field2352 = 0;
                  class214.method1117(var29);
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2065) {
               class295.field2829 = true;
               class446.method2119(false, var4);
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2056) {
               class412.method1997(class167.field1836);
               var1.field3461 = null;
               return true;
            }

            if (class200.field2088 == var1.field3461) {
               class412.method1997(class167.field1837);
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2098) {
               class360.field3233 = var4.method691();
               class116.field1415 = var4.method714();

               for(var23 = class116.field1415; var23 < class116.field1415 + 8; ++var23) {
                  for(var24 = class360.field3233; var24 < 8 + class360.field3233; ++var24) {
                     if (field564[class195.field2036][var23][var24] != null) {
                        field564[class195.field2036][var23][var24] = null;
                        class307.method1443(var23, var24);
                     }
                  }
               }

               for(class474 var71 = (class474)field654.method1934(); null != var71; var71 = (class474)field654.method1936()) {
                  if (var71.field3930 >= class116.field1415 && var71.field3930 < 8 + class116.field1415 && var71.field3941 >= class360.field3233 && var71.field3941 < class360.field3233 + 8 && var71.field3934 == class195.field2036) {
                     var71.field3942 = 0;
                  }
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2130) {
               class298.field2877 = new class318(class352.field3182);
               var1.field3461 = null;
               return true;
            }

            class53 var30;
            if (class200.field2135 == var1.field3461) {
               var7 = var4.method714();
               var23 = var4.method696();
               var24 = var4.method653();
               if (var24 == 65535) {
                  var24 = -1;
               }

               var30 = field669[var23];
               if (null != var30) {
                  if (var30.field274 == var24 && var24 != -1) {
                     var9 = class242.method1218(var24).field897;
                     if (var9 == 1) {
                        var30.field265 = 0;
                        var30.field276 = 0;
                        var30.field277 = var7;
                        var30.field278 = 0;
                     } else if (var9 == 2) {
                        var30.field278 = 0;
                     }
                  } else if (var24 == -1 || var30.field274 == -1 || class242.method1218(var24).field920 >= class242.method1218(var30.field274).field920) {
                     var30.field274 = var24;
                     var30.field265 = 0;
                     var30.field276 = 0;
                     var30.field277 = var7;
                     var30.field278 = 0;
                     var30.field307 = var30.field232;
                  }
               }

               var1.field3461 = null;
               return true;
            }

            long var10;
            long var44;
            if (class200.field2059 == var1.field3461) {
               var25 = var4.method677();
               var38 = var4.method720();
               var28 = (long)var4.method671();
               var10 = (long)var4.method673();
               class224 var51 = (class224)class296.method1399(class251.method1234(), var4.method669());
               var44 = (var28 << 32) + var10;
               boolean var56 = false;

               for(var16 = 0; var16 < 100; ++var16) {
                  if (var44 == field440[var16]) {
                     var56 = true;
                     break;
                  }
               }

               if (var51.field2456 && class321.field3026.method475(new class174(var25, class170.field1860))) {
                  var56 = true;
               }

               if (!var56 && 0 == field608) {
                  field440[field663] = var44;
                  field663 = (1 + field663) % 100;
                  var63 = class93.method535(class465.method2281(class124.method633(var4)));
                  if (-1 != var51.field2454) {
                     class43.method222(9, class180.method945(var51.field2454) + var25, var63, class213.method1114(var38));
                  } else {
                     class43.method222(9, var25, var63, class213.method1114(var38));
                  }
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2073) {
               class321.field3026.method476(var4, var1.field3464);
               field632 = field622;
               var1.field3461 = null;
               return true;
            }

            boolean var53;
            if (var1.field3461 == class200.field2153) {
               var53 = var4.method669() == 1;
               if (var53) {
                  class2.field7 = class154.method814() - var4.method720();
                  class233.field2523 = new class231(var4, true);
               } else {
                  class233.field2523 = null;
               }

               field637 = field622;
               var1.field3461 = null;
               return true;
            }

            if (class200.field2086 == var1.field3461) {
               class412.method1997(class167.field1830);
               var1.field3461 = null;
               return true;
            }

            if (class200.field2114 == var1.field3461) {
               field500 = var4.method669();
               var1.field3461 = null;
               return true;
            }

            if (class200.field2148 == var1.field3461) {
               var23 = var4.method704();
               var24 = var4.method696();
               if (var24 == 65535) {
                  var24 = -1;
               }

               var7 = var4.method704();
               var8 = var4.method696();
               if (var8 == 65535) {
                  var8 = -1;
               }

               for(var9 = var24; var9 <= var8; ++var9) {
                  var10 = (long)var9 + ((long)var23 << 32);
                  class106 var48 = field475.method545(var10);
                  if (null != var48) {
                     var48.method567();
                  }

                  field475.method542(new class258(var7), var10);
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2050) {
               var23 = var4.method696();
               var24 = var4.method725();
               class484.field3991[var23] = var24;
               if (class484.field3992[var23] != var24) {
                  class484.field3992[var23] = var24;
               }

               class334.method1617(var23);
               field623[++field624 - 1 & 31] = var23;
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2147) {
               var53 = var4.method675();
               if (var53) {
                  if (null == class141.field1542) {
                     class141.field1542 = new class92();
                  }
               } else {
                  class141.field1542 = null;
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2063 == var1.field3461) {
               var37 = var4.method653();
               var7 = var4.method709();
               var23 = var7 >> 16;
               var24 = var7 >> 8 & 255;
               var8 = var23 + (var7 >> 4 & 7);
               var9 = (var7 & 7) + var24;
               var11 = var4.method716();
               var42 = var4.method697();
               if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                  var8 = 64 + var8 * 128;
                  var9 = var9 * 128 + 64;
                  class378 var45 = new class378(var37, class195.field2036, var8, var9, class192.method991(var8, var9, class195.field2036) - var11, var42, field435);
                  field556.method1930(var45);
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2069 == var1.field3461) {
               var23 = var4.method669();
               class456.method2161(var23);
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2112) {
               var23 = var4.method717();
               var24 = var4.method717();
               var7 = class167.method899();
               class81 var41 = class189.method982(class165.field1720, field483.field3459);
               var41.field933.method703(var23);
               var41.field933.method701(var24);
               var41.field933.method666(class141.field1517);
               var41.field933.method666(var7);
               field483.method1920(var41);
               var1.field3461 = null;
               return true;
            }

            if (class200.field2096 == var1.field3461) {
               for(var23 = 0; var23 < class484.field3992.length; ++var23) {
                  if (class484.field3991[var23] != class484.field3992[var23]) {
                     class484.field3992[var23] = class484.field3991[var23];
                     class334.method1617(var23);
                     field623[++field624 - 1 & 31] = var23;
                  }
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2107) {
               class333.method1614(var4, var1.field3464);
               var1.field3461 = null;
               return true;
            }

            if (class200.field2075 == var1.field3461) {
               class412.method1997(class167.field1840);
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2066) {
               var25 = var4.method677();
               var6 = class93.method535(class465.method2281(class124.method633(var4)));
               class237.method1197(6, var25, var6);
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2060) {
               var23 = var4.method717();
               class240 var49 = (class240)field598.method545((long)var23);
               if (null != var49) {
                  class328.method1590(var49, true, (byte)115);
               }

               if (field603 != null) {
                  class214.method1117(field603);
                  field603 = null;
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2138) {
               class163.method860(var4.method677());
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2061) {
               var25 = var4.method677();
               var24 = var4.method725();
               var29 = class274.method1301(var24);
               if (!var25.equals(var29.field2276)) {
                  var29.field2276 = var25;
                  class214.method1117(var29);
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2116) {
               var23 = var4.method671();
               var24 = var4.method725();
               var29 = class274.method1301(var24);
               if (2 != var29.field2258 || var23 != var29.field2277) {
                  var29.field2258 = 2;
                  var29.field2277 = var23;
                  class214.method1117(var29);
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2127 == var1.field3461) {
               var23 = var4.method671();
               var24 = var4.method669();
               var7 = var4.method671();
               class123.method631(var23, var24, var7);
               var1.field3461 = null;
               return true;
            }

            if (class200.field2118 == var1.field3461) {
               var23 = var4.method717();
               var24 = var4.method671();
               if (var23 < -70000) {
                  var24 += 32768;
               }

               if (var23 >= 0) {
                  var29 = class274.method1301(var23);
               } else {
                  var29 = null;
               }

               if (var29 != null) {
                  for(var8 = 0; var8 < var29.field2209.length; ++var8) {
                     var29.field2209[var8] = 0;
                     var29.field2253[var8] = 0;
                  }
               }

               class472.method2287(var24);
               var8 = var4.method671();

               for(var9 = 0; var9 < var8; ++var9) {
                  var37 = var4.method691();
                  if (var37 == 255) {
                     var37 = var4.method704();
                  }

                  var11 = var4.method653();
                  if (var29 != null && var9 < var29.field2209.length) {
                     var29.field2209[var9] = var11;
                     var29.field2253[var9] = var37;
                  }

                  class324.method1570(var24, var9, var11 - 1, var37);
               }

               if (null != var29) {
                  class214.method1117(var29);
               }

               class189.method981();
               field625[++field626 - 1 & 31] = var24 & 32767;
               var1.field3461 = null;
               return true;
            }

            if (class200.field2119 == var1.field3461) {
               class446.method2119(true, var4);
               var1.field3461 = null;
               return true;
            }

            if (class200.field2072 == var1.field3461) {
               var4.field1487 += 28;
               if (var4.method687()) {
                  class327.method1582(var4, var4.field1487 - 28);
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2084 == var1.field3461) {
               class412.method1997(class167.field1832);
               var1.field3461 = null;
               return true;
            }

            if (class200.field2161 == var1.field3461) {
               var23 = var4.method653();
               if (var23 == 65535) {
                  var23 = -1;
               }

               var24 = var4.method725();
               var7 = var4.method704();
               var40 = class274.method1301(var24);
               class458 var35;
               if (!var40.field2215) {
                  if (var23 == -1) {
                     var40.field2258 = 0;
                     var1.field3461 = null;
                     return true;
                  }

                  var35 = class272.method1294(var23);
                  var40.field2258 = 4;
                  var40.field2277 = var23;
                  var40.field2282 = var35.field3769;
                  var40.field2269 = var35.field3770;
                  var40.field2204 = var35.field3768 * 100 / var7;
                  class214.method1117(var40);
               } else {
                  var40.field2220 = var23;
                  var40.field2350 = var7;
                  var35 = class272.method1294(var23);
                  var40.field2282 = var35.field3769;
                  var40.field2269 = var35.field3770;
                  var40.field2268 = var35.field3777;
                  var40.field2264 = var35.field3772;
                  var40.field2356 = var35.field3758;
                  var40.field2204 = var35.field3768;
                  if (var35.field3774 == 1) {
                     var40.field2274 = 1;
                  } else {
                     var40.field2274 = 2;
                  }

                  if (var40.field2330 > 0) {
                     var40.field2204 = var40.field2204 * 32 / var40.field2330;
                  } else if (var40.field2226 > 0) {
                     var40.field2204 = var40.field2204 * 32 / var40.field2226;
                  }

                  class214.method1117(var40);
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2155 == var1.field3461) {
               class412.method1997(class167.field1833);
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2149) {
               class360.field3233 = var4.method714();
               class116.field1415 = var4.method714();
               var1.field3461 = null;
               return true;
            }

            if (class200.field2133 == var1.field3461) {
               var23 = var4.method725();
               var24 = var4.method696();
               var7 = var4.method696();
               var8 = var4.method696();
               var33 = class274.method1301(var23);
               if (var24 != var33.field2282 || var33.field2269 != var8 || var7 != var33.field2204) {
                  var33.field2282 = var24;
                  var33.field2269 = var8;
                  var33.field2204 = var7;
                  class214.method1117(var33);
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2131 == var1.field3461) {
               var23 = var1.field3464 + var4.field1487;
               var24 = var4.method671();
               var7 = var4.method671();
               if (field597 != var24) {
                  field597 = var24;
                  this.method287(false);
                  class214.method1116(field597);
                  class373.method1786(field597);

                  for(var8 = 0; var8 < 100; ++var8) {
                     field648[var8] = true;
                  }
               }

               class240 var39;
               for(; var7-- > 0; var39.field2579 = true) {
                  var8 = var4.method717();
                  var9 = var4.method671();
                  var37 = var4.method669();
                  var39 = (class240)field598.method545((long)var8);
                  if (var39 != null && var39.field2580 != var9) {
                     class328.method1590(var39, true, (byte)88);
                     var39 = null;
                  }

                  if (var39 == null) {
                     var39 = class285.method1357(var8, var9, var37);
                  }
               }

               for(var36 = (class240)field598.method543(); var36 != null; var36 = (class240)field598.method544()) {
                  if (var36.field2579) {
                     var36.field2579 = false;
                  } else {
                     class328.method1590(var36, true, (byte)93);
                  }
               }

               field475 = new class95(512);

               while(var4.field1487 < var23) {
                  var8 = var4.method717();
                  var9 = var4.method671();
                  var37 = var4.method671();
                  var11 = var4.method717();

                  for(var42 = var9; var42 <= var37; ++var42) {
                     var44 = ((long)var8 << 32) + (long)var42;
                     field475.method542(new class258(var11), var44);
                  }
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2064 == var1.field3461) {
               var24 = var4.method725();
               var23 = var4.method671();
               var30 = field669[var23];
               var7 = var4.method671();
               if (var30 != null) {
                  var30.field279 = var7;
                  var30.field301 = var24 >> 16;
                  var30.field282 = (var24 & '\uffff') + field435;
                  var30.field280 = 0;
                  var30.field269 = 0;
                  if (var30.field282 > field435) {
                     var30.field280 = -1;
                  }

                  if (65535 == var30.field279) {
                     var30.field279 = -1;
                  }
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2097) {
               class412.method1997(class167.field1835);
               var1.field3461 = null;
               return true;
            }

            if (class200.field2081 == var1.field3461) {
               if (-1 != field597) {
                  class100.method552(field597, 0);
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2058 == var1.field3461) {
               field688 = true;
               field689 = false;
               class329.field3067 = var4.method669();
               class299.field2882 = var4.method669();
               class297.field2857 = var4.method671();
               class14.field127 = var4.method669();
               class298.field2875 = var4.method669();
               if (class298.field2875 >= 100) {
                  var23 = class329.field3067 * 128 + 64;
                  var24 = 64 + class299.field2882 * 128;
                  var7 = class192.method991(var23, var24, class195.field2036) - class297.field2857;
                  var8 = var23 - class342.field3148;
                  var9 = var7 - class318.field3010;
                  var37 = var24 - class112.field1394;
                  var11 = (int)Math.sqrt((double)(var37 * var37 + var8 * var8));
                  class389.field3438 = (int)(Math.atan2((double)var9, (double)var11) * 325.9490051269531D) & 2047;
                  class177.field1929 = (int)(Math.atan2((double)var8, (double)var37) * -325.9490051269531D) & 2047;
                  if (class389.field3438 < 128) {
                     class389.field3438 = 128;
                  }

                  if (class389.field3438 > 383) {
                     class389.field3438 = 383;
                  }
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2128 == var1.field3461) {
               var27 = var4.method670();
               var38 = (long)var4.method671();
               var28 = (long)var4.method673();
               var10 = var28 + (var38 << 32);
               boolean var12 = false;
               class112 var13 = var27 >= 0 ? field549[var27] : class359.field3209;
               if (var13 == null) {
                  var12 = true;
               } else {
                  for(var14 = 0; var14 < 100; ++var14) {
                     if (field440[var14] == var10) {
                        var12 = true;
                        break;
                     }
                  }
               }

               if (!var12) {
                  field440[field663] = var10;
                  field663 = (1 + field663) % 100;
                  var52 = class124.method633(var4);
                  var15 = var27 >= 0 ? 43 : 46;
                  class43.method222(var15, "", var52, var13.field1392);
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2103) {
               class189.method981();
               field546 = var4.method669();
               field546 = field546 * 664161535 * 100 * 809546495;
               field638 = field622;
               var1.field3461 = null;
               return true;
            }

            if (class200.field2053 == var1.field3461) {
               var23 = var4.method704();
               var34 = var4.method669() == 1;
               var29 = class274.method1301(var23);
               if (var34 != var29.field2267) {
                  var29.field2267 = var34;
                  class214.method1117(var29);
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2132) {
               class295.field2829 = true;
               class446.method2119(true, var4);
               var1.field3461 = null;
               return true;
            }

            class210 var26;
            if (class200.field2093 == var1.field3461) {
               var23 = var4.method704();
               var26 = class274.method1301(var23);
               var26.field2258 = 3;
               var26.field2277 = class89.field982.field388.method1905();
               class214.method1117(var26);
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2104) {
               class189.method981();
               field605 = var4.method672();
               field638 = field622;
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2051) {
               var1.field3461 = null;
               return true;
            }

            if (class200.field2113 == var1.field3461) {
               return this.method279(var1, 2);
            }

            if (class200.field2046 == var1.field3461) {
               var23 = var4.method717();
               if (var23 != field706) {
                  field706 = var23;
                  class391.method1892();
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2080) {
               var25 = var4.method677();
               Object[] var31 = new Object[var25.length() + 1];

               for(var7 = var25.length() - 1; var7 >= 0; --var7) {
                  if (var25.charAt(var7) == 's') {
                     var31[var7 + 1] = var4.method677();
                  } else {
                     var31[var7 + 1] = new Integer(var4.method717());
                  }
               }

               var31[0] = new Integer(var4.method717());
               class169 var32 = new class169();
               var32.field1850 = var31;
               class194.method1001(var32);
               var1.field3461 = null;
               return true;
            }

            if (class200.field2120 == var1.field3461) {
               var23 = var4.method717();
               var24 = var4.method696();
               var29 = class274.method1301(var23);
               if (null != var29 && 0 == var29.field2348) {
                  if (var24 > var29.field2238 - var29.field2289) {
                     var24 = var29.field2238 - var29.field2289;
                  }

                  if (var24 < 0) {
                     var24 = 0;
                  }

                  if (var24 != var29.field2236) {
                     var29.field2236 = var24;
                     class214.method1117(var29);
                  }
               }

               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2124) {
               var23 = var4.method697();
               class479.method2313(var23);
               field625[++field626 - 1 & 31] = var23 & 32767;
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2115) {
               var23 = var4.method669();
               var24 = var4.method669();
               var7 = var4.method669();
               var8 = var4.method669();
               field690[var23] = true;
               field720[var23] = var24;
               field692[var23] = var7;
               field693[var23] = var8;
               field534[var23] = 0;
               var1.field3461 = null;
               return true;
            }

            if (class200.field2136 == var1.field3461) {
               field677 = var4.method669();
               if (255 == field677) {
                  field677 = 0;
               }

               field423 = var4.method669();
               if (field423 == 255) {
                  field423 = 0;
               }

               var1.field3461 = null;
               return true;
            }

            if (class200.field2102 == var1.field3461) {
               var23 = var4.method717();
               var26 = class274.method1301(var23);

               for(var7 = 0; var7 < var26.field2209.length; ++var7) {
                  var26.field2209[var7] = -1;
                  var26.field2209[var7] = 0;
               }

               class214.method1117(var26);
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2123) {
               var23 = var4.method669();
               class392.method1904(var23);
               var1.field3461 = null;
               return false;
            }

            if (class200.field2078 == var1.field3461) {
               field659 = var4.method669();
               field660 = var4.method714();
               var1.field3461 = null;
               return true;
            }

            if (var1.field3461 == class200.field2048) {
               class412.method1997(class167.field1829);
               var1.field3461 = null;
               return true;
            }

            class23.method122("" + (null != var1.field3461 ? -170435115 * var1.field3461.field2160 * 1034875773 : -1) + class389.field3431 + (var1.field3467 != null ? -170435115 * var1.field3467.field2160 * 1034875773 : -1) + class389.field3431 + (var1.field3468 != null ? var1.field3468.field2160 : -1) + class389.field3431 + var1.field3464, (Throwable)null);
            class47.method255();
         } catch (IOException var21) {
            class380.method1808();
         } catch (Exception var22) {
            var6 = "" + (var1.field3461 != null ? var1.field3461.field2160 : -1) + class389.field3431 + (null != var1.field3467 ? -170435115 * var1.field3467.field2160 * 1034875773 : -1) + class389.field3431 + (var1.field3468 != null ? var1.field3468.field2160 : -1) + class389.field3431 + var1.field3464 + class389.field3431 + (class381.field3325 + class89.field982.field258[0]) + class389.field3431 + (class89.field982.field306[0] + class345.field3166) + class389.field3431;

            for(var7 = 0; var7 < var1.field3464 && var7 < 50; ++var7) {
               var6 = var6 + var4.field1489[var7] + class389.field3431;
            }

            class23.method122(var6, var22);
            class47.method255();
         }

         return true;
      }
   }

   final void method282() {
      boolean var2 = false;

      int var3;
      int var6;
      while(!var2) {
         var2 = true;

         for(var3 = 0; var3 < field573 - 1; ++var3) {
            if (field667[var3] < 1000 && field667[var3 + 1] > 1000) {
               String var4 = field460[var3];
               field460[var3] = field460[var3 + 1];
               field460[var3 + 1] = var4;
               String var5 = field579[var3];
               field579[var3] = field579[var3 + 1];
               field579[var3 + 1] = var5;
               var6 = field667[var3];
               field667[var3] = field667[var3 + 1];
               field667[var3 + 1] = var6;
               var6 = field574[var3];
               field574[var3] = field574[var3 + 1];
               field574[var3 + 1] = var6;
               var6 = field567[var3];
               field567[var3] = field567[var3 + 1];
               field567[var3 + 1] = var6;
               var6 = field537[var3];
               field537[var3] = field537[var3 + 1];
               field537[var3 + 1] = var6;
               var6 = field578[var3];
               field578[var3] = field578[var3 + 1];
               field578[var3 + 1] = var6;
               boolean var7 = field581[var3];
               field581[var3] = field581[var3 + 1];
               field581[var3 + 1] = var7;
               var2 = false;
            }
         }
      }

      if (null == class202.field2178) {
         if (null == field610) {
            int var19;
            label220: {
               int var16 = class182.field1963;
               int var10;
               int var12;
               int var18;
               int var20;
               int var21;
               if (field572) {
                  int var17;
                  if (var16 != 1 && (class211.field2375 || var16 != 4)) {
                     var3 = class182.field1957;
                     var17 = class182.field1952;
                     if (var3 < class359.field3208 - 10 || var3 > 10 + class34.field334 + class359.field3208 || var17 < class53.field800 - 10 || var17 > class182.field1966 + class53.field800 + 10) {
                        field572 = false;
                        class13.method87(class359.field3208, class53.field800, class34.field334, class182.field1966);
                     }
                  }

                  if (var16 == 1 || !class211.field2375 && var16 == 4) {
                     var3 = class359.field3208;
                     var17 = class53.field800;
                     var18 = class34.field334;
                     var6 = class182.field1964;
                     var19 = class182.field1961;
                     var20 = -1;

                     for(var21 = 0; var21 < field573; ++var21) {
                        var10 = 15 * (field573 - 1 - var21) + var17 + 31;
                        if (var6 > var3 && var6 < var18 + var3 && var19 > var10 - 13 && var19 < var10 + 3) {
                           var20 = var21;
                        }
                     }

                     if (var20 != -1 && var20 >= 0) {
                        var21 = field574[var20];
                        var10 = field567[var20];
                        int var24 = field667[var20];
                        var12 = field537[var20];
                        int var13 = field578[var20];
                        String var14 = field579[var20];
                        String var15 = field460[var20];
                        class226.method1145(var21, var10, var24, var12, var13, var14, var15, class182.field1964, class182.field1961);
                     }

                     field572 = false;
                     class13.method87(class359.field3208, class53.field800, class34.field334, class182.field1966);
                  }
               } else {
                  var3 = field573 - 1;
                  if ((var16 == 1 || !class211.field2375 && var16 == 4) && var3 >= 0) {
                     var18 = field667[var3];
                     if (var18 == 39 || var18 == 40 || var18 == 41 || var18 == 42 || var18 == 43 || var18 == 33 || var18 == 34 || var18 == 35 || var18 == 36 || var18 == 37 || var18 == 38 || var18 == 1005) {
                        var6 = field574[var3];
                        var19 = field567[var3];
                        class210 var8 = class274.method1301(var19);
                        var10 = class172.method913(var8);
                        boolean var9 = 0 != (var10 >> 28 & 1);
                        if (var9) {
                           break label220;
                        }

                        var12 = class172.method913(var8);
                        boolean var11 = (var12 >> 29 & 1) != 0;
                        if (var11) {
                           break label220;
                        }
                     }
                  }

                  if ((var16 == 1 || !class211.field2375 && var16 == 4) && this.method274()) {
                     var16 = 2;
                  }

                  if ((var16 == 1 || !class211.field2375 && var16 == 4) && field573 > 0 && var3 >= 0) {
                     var18 = field574[var3];
                     var6 = field567[var3];
                     var19 = field667[var3];
                     var20 = field537[var3];
                     var21 = field578[var3];
                     String var22 = field579[var3];
                     String var23 = field460[var3];
                     class226.method1145(var18, var6, var19, var20, var21, var22, var23, class182.field1964, class182.field1961);
                  }

                  if (var16 == 2 && field573 > 0) {
                     this.method275(class182.field1964, class182.field1961);
                  }
               }

               return;
            }

            if (null != class202.field2178 && !field547 && field573 > 0 && !this.method274()) {
               class2.method10(field544, field545);
            }

            field547 = false;
            field548 = 0;
            if (null != class202.field2178) {
               class214.method1117(class202.field2178);
            }

            class202.field2178 = class274.method1301(var19);
            field535 = var6;
            field544 = class182.field1964;
            field545 = class182.field1961;
            if (var3 >= 0) {
               class13.method84(var3);
            }

            class214.method1117(class202.field2178);
         }
      }
   }

   final boolean method274() {
      int var2 = field573 - 1;
      return (field515 && field573 > 2 || class103.method560(var2)) && !field581[var2];
   }

   final void method275(int var1, int var2) {
      int var4 = class299.field2880.method538(class96.field1234);

      int var5;
      int var6;
      for(var5 = 0; var5 < field573; ++var5) {
         var6 = class299.field2880.method538(class352.method1689(var5));
         if (var6 > var4) {
            var4 = var6;
         }
      }

      var4 += 8;
      var5 = 22 + field573 * 15;
      var6 = var1 - var4 / 2;
      if (var4 + var6 > class391.field3440) {
         var6 = class391.field3440 - var4;
      }

      if (var6 < 0) {
         var6 = 0;
      }

      int var7 = var2;
      if (var5 + var2 > class22.field161) {
         var7 = class22.field161 - var5;
      }

      if (var7 < 0) {
         var7 = 0;
      }

      class359.field3208 = var6;
      class53.field800 = var7;
      class34.field334 = var4;
      class182.field1966 = field573 * 15 + 22;
      var1 -= field576;
      var2 -= field704;
      class13.field126.method69(class195.field2036, var1, var2, false);
      field572 = true;
   }

   final void method287(boolean var1) {
      class461.method2264(field597, class391.field3440, class22.field161, var1);
   }

   void method286(class210 var1) {
      class210 var3 = var1.field2234 == -1 ? null : class274.method1301(var1.field2234);
      int var4;
      int var5;
      if (null == var3) {
         var4 = class391.field3440;
         var5 = class22.field161;
      } else {
         var4 = var3.field2230;
         var5 = var3.field2289;
      }

      class47.method253(var1, var4, var5, false);
      class137.method732(var1, var4, var5);
   }

   final void method277() {
      class214.method1117(field610);
      ++class188.field1982;
      if (field618 && field662) {
         int var2 = class182.field1957;
         int var3 = class182.field1952;
         var2 -= field612;
         var3 -= field613;
         if (var2 < field616) {
            var2 = field616;
         }

         if (field610.field2230 + var2 > field616 + field611.field2230) {
            var2 = field616 + field611.field2230 - field610.field2230;
         }

         if (var3 < field530) {
            var3 = field530;
         }

         if (var3 + field610.field2289 > field530 + field611.field2289) {
            var3 = field530 + field611.field2289 - field610.field2289;
         }

         int var4 = var2 - field436;
         int var5 = var3 - field620;
         int var6 = field610.field2302;
         if (class188.field1982 > field610.field2255 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
            field621 = true;
         }

         int var7 = var2 - field616 + field611.field2242;
         int var8 = field611.field2236 + (var3 - field530);
         class169 var9;
         if (field610.field2359 != null && field621) {
            var9 = new class169();
            var9.field1848 = field610;
            var9.field1846 = var7;
            var9.field1852 = var8;
            var9.field1850 = field610.field2359;
            class194.method1001(var9);
         }

         if (class182.field1956 == 0) {
            if (field621) {
               if (field610.field2316 != null) {
                  var9 = new class169();
                  var9.field1848 = field610;
                  var9.field1846 = var7;
                  var9.field1852 = var8;
                  var9.field1858 = field614;
                  var9.field1850 = field610.field2316;
                  class194.method1001(var9);
               }

               if (null != field614) {
                  class210 var10 = field610;
                  int var12 = class172.method913(var10);
                  int var11 = var12 >> 17 & 7;
                  int var13 = var11;
                  class210 var15;
                  if (var11 == 0) {
                     var15 = null;
                  } else {
                     int var14 = 0;

                     while(true) {
                        if (var14 >= var13) {
                           var15 = var10;
                           break;
                        }

                        var10 = class274.method1301(var10.field2234);
                        if (var10 == null) {
                           var15 = null;
                           break;
                        }

                        ++var14;
                     }
                  }

                  if (var15 != null) {
                     class81 var16 = class189.method982(class165.field1795, field483.field3459);
                     var16.field933.method706(field610.field2220);
                     var16.field933.method695(field610.field2217);
                     var16.field933.method703(field614.field2307);
                     var16.field933.method701(field610.field2307);
                     var16.field933.method706(field614.field2217);
                     var16.field933.method706(field614.field2220);
                     field483.method1920(var16);
                  }
               }
            } else if (this.method274()) {
               this.method275(field436 + field612, field613 + field620);
            } else if (field573 > 0) {
               class2.method10(field436 + field612, field620 + field613);
            }

            field610 = null;
         }

      } else {
         if (class188.field1982 > 1) {
            if (!field621 && field573 > 0) {
               class2.method10(field612 + field436, field620 + field613);
            }

            field610 = null;
         }

      }
   }

   public class174 method2086() {
      return null != class89.field982 ? class89.field982.field401 : null;
   }

   static class386 method289() {
      return class237.field2566;
   }

   static int method288(int var0, class472 var1, boolean var2) {
      if (var0 == 3200) {
         class188.field1989 -= 3;
         class123.method631(class150.field1580[class188.field1989], class150.field1580[1 + class188.field1989], class150.field1580[class188.field1989 + 2]);
         return 1;
      } else if (var0 == 3201) {
         class357.method1709(class150.field1580[--class188.field1989]);
         return 1;
      } else if (var0 == 3202) {
         class188.field1989 -= 2;
         class457.method2163(class150.field1580[class188.field1989], class150.field1580[class188.field1989 + 1]);
         return 1;
      } else {
         class188 var4;
         class235 var5;
         int var6;
         int var7;
         String var9;
         if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
            if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
               return var0 == 3211 ? 1 : 2;
            } else {
               var4 = class188.field1986;
               var5 = class235.field2553;
               boolean var8 = false;
               if (var0 == 3214) {
                  var7 = class150.field1580[--class188.field1989];
                  var4 = (class188)class296.method1399(class452.method2149(), var7);
                  if (var4 == null) {
                     throw new RuntimeException(String.format("Unrecognized device option %d", var7));
                  }
               }

               if (var0 == 3215) {
                  var7 = class150.field1580[--class188.field1989];
                  var5 = (class235)class296.method1399(class482.method2316(), var7);
                  if (var5 == null) {
                     throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                  }
               }

               if (var0 == 3210) {
                  var7 = class150.field1580[--class188.field1989];
                  var4 = (class188)class296.method1399(class452.method2149(), var7);
                  if (var4 == null) {
                     var5 = (class235)class296.method1399(class482.method2316(), var7);
                     if (var5 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                     }
                  }
               } else if (var0 == 3182) {
                  var4 = class188.field1990;
               } else if (var0 == 3204) {
                  var5 = class235.field2545;
               } else if (var0 == 3206) {
                  var5 = class235.field2548;
               } else if (var0 == 3208) {
                  var5 = class235.field2549;
               }

               if (var5 == class235.field2553) {
                  switch(var4.field1987) {
                  case 1:
                     var6 = class111.field1385.method1318() ? 1 : 0;
                     break;
                  case 2:
                     var6 = class111.field1385.method1328() ? 1 : 0;
                     break;
                  case 3:
                     var6 = class111.field1385.method1320() ? 1 : 0;
                     break;
                  case 4:
                     var6 = class111.field1385.method1322();
                     break;
                  case 5:
                     var6 = class125.method636();
                     break;
                  default:
                     var9 = String.format("Unkown device option: %s.", var4.toString());
                     throw new RuntimeException(var9);
                  }
               } else {
                  switch(var5.field2547) {
                  case 1:
                     var6 = class111.field1385.method1317() ? 1 : 0;
                     break;
                  case 2:
                     var7 = class111.field1385.method1325();
                     var6 = Math.round((float)(var7 * 100) / 255.0F);
                     break;
                  case 3:
                     var7 = class111.field1385.method1326();
                     var6 = Math.round((float)(var7 * 100) / 127.0F);
                     break;
                  case 4:
                     var7 = class111.field1385.method1345();
                     var6 = Math.round((float)(var7 * 100) / 127.0F);
                     break;
                  default:
                     var9 = String.format("Unkown game option: %s.", var5.toString());
                     throw new RuntimeException(var9);
                  }
               }

               class150.field1580[++class188.field1989 - 1] = var6;
               return 1;
            }
         } else {
            var4 = class188.field1986;
            var5 = class235.field2553;
            var6 = class150.field1580[--class188.field1989];
            if (var0 == 3212) {
               var7 = class150.field1580[--class188.field1989];
               var4 = (class188)class296.method1399(class452.method2149(), var7);
               if (null == var4) {
                  throw new RuntimeException(String.format("Unrecognized device option %d", var7));
               }
            }

            if (var0 == 3213) {
               var7 = class150.field1580[--class188.field1989];
               var5 = (class235)class296.method1399(class482.method2316(), var7);
               if (null == var5) {
                  throw new RuntimeException(String.format("Unrecognized game option %d", var7));
               }
            }

            if (var0 == 3209) {
               var7 = class150.field1580[--class188.field1989];
               var4 = (class188)class296.method1399(class452.method2149(), var7);
               if (var4 == null) {
                  var5 = (class235)class296.method1399(class482.method2316(), var7);
                  if (null == var5) {
                     throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                  }
               }
            } else if (var0 == 3181) {
               var4 = class188.field1990;
            } else if (var0 == 3203) {
               var5 = class235.field2545;
            } else if (var0 == 3205) {
               var5 = class235.field2548;
            } else if (var0 == 3207) {
               var5 = class235.field2549;
            }

            if (class235.field2553 == var5) {
               switch(var4.field1987) {
               case 1:
                  class111.field1385.method1340(var6 == 1);
                  break;
               case 2:
                  class111.field1385.method1338(var6 == 1);
                  break;
               case 3:
                  class111.field1385.method1341(var6 == 1);
                  break;
               case 4:
                  if (var6 < 0) {
                     var6 = 0;
                  }

                  class111.field1385.method1321(var6);
                  break;
               case 5:
                  class18.method104(var6);
                  break;
               default:
                  var9 = String.format("Unkown device option: %s.", var4.toString());
                  throw new RuntimeException(var9);
               }
            } else {
               switch(var5.field2547) {
               case 1:
                  class111.field1385.method1344(var6 == 1);
                  break;
               case 2:
                  var6 = Math.min(Math.max(var6, 0), 100);
                  var7 = Math.round((float)(var6 * 255) / 100.0F);
                  class291.method1368(var7);
                  break;
               case 3:
                  var6 = Math.min(Math.max(var6, 0), 100);
                  var7 = Math.round((float)(var6 * 127) / 100.0F);
                  class285.method1356(var7);
                  break;
               case 4:
                  var6 = Math.min(Math.max(var6, 0), 100);
                  var7 = Math.round((float)(var6 * 127) / 100.0F);
                  class304.method1438(var7);
                  break;
               default:
                  var9 = String.format("Unkown game option: %s.", var5.toString());
                  throw new RuntimeException(var9);
               }
            }

            return 1;
         }
      }
   }

   static final void method281() {
      if (null != class175.field1916) {
         class175.field1916.method833();
      }

      if (null != class327.field3054) {
         class327.field3054.method833();
      }

   }
}
