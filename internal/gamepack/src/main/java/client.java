import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import io.spectralpowered.ObfInfo;
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
import netscape.js.JSObject;

@ObfInfo(
	name = "client"
)
public final class client extends class214 implements class234, OAuthApi {
	@ObfInfo(
		owner = "client",
		name = "bc",
		desc = "Z"
	)
	public static boolean field222;
	@ObfInfo(
		owner = "client",
		name = "rc",
		desc = "Lgc;"
	)
	public static class432 field460;
	@ObfInfo(
		owner = "client",
		name = "ba",
		desc = "I"
	)
	public static int field228;
	@ObfInfo(
		owner = "client",
		name = "be",
		desc = "I"
	)
	public static int field395;
	@ObfInfo(
		owner = "client",
		name = "ke",
		desc = "I"
	)
	public static int field502;
	@ObfInfo(
		owner = "client",
		name = "vw",
		desc = "I"
	)
	public static int field514;
	@ObfInfo(
		owner = "client",
		name = "hn",
		desc = "Lde;"
	)
	public static final class486 field279;
	@ObfInfo(
		owner = "client",
		name = "dn",
		desc = "Z"
	)
	static boolean field230;
	@ObfInfo(
		owner = "client",
		name = "kv",
		desc = "Z"
	)
	static boolean field242;
	@ObfInfo(
		owner = "client",
		name = "lu",
		desc = "Z"
	)
	static boolean field252;
	@ObfInfo(
		owner = "client",
		name = "mn",
		desc = "Z"
	)
	static boolean field258;
	@ObfInfo(
		owner = "client",
		name = "gr",
		desc = "Z"
	)
	static boolean field268;
	@ObfInfo(
		owner = "client",
		name = "bl",
		desc = "Z"
	)
	static boolean field274;
	@ObfInfo(
		owner = "client",
		name = "hr",
		desc = "Z"
	)
	static boolean field281;
	@ObfInfo(
		owner = "client",
		name = "ia",
		desc = "Z"
	)
	static boolean field290;
	@ObfInfo(
		owner = "client",
		name = "ds",
		desc = "Z"
	)
	static boolean field298;
	@ObfInfo(
		owner = "client",
		name = "mp",
		desc = "Z"
	)
	static boolean field311;
	@ObfInfo(
		owner = "client",
		name = "ky",
		desc = "Z"
	)
	static boolean field316;
	@ObfInfo(
		owner = "client",
		name = "le",
		desc = "Z"
	)
	static boolean field343;
	@ObfInfo(
		owner = "client",
		name = "ln",
		desc = "Z"
	)
	static boolean field346;
	@ObfInfo(
		owner = "client",
		name = "mc",
		desc = "Z"
	)
	static boolean field368;
	@ObfInfo(
		owner = "client",
		name = "nf",
		desc = "Z"
	)
	static boolean field378;
	@ObfInfo(
		owner = "client",
		name = "nr",
		desc = "Z"
	)
	static boolean field380;
	@ObfInfo(
		owner = "client",
		name = "nd",
		desc = "Z"
	)
	static boolean field381;
	@ObfInfo(
		owner = "client",
		name = "nh",
		desc = "Z"
	)
	static boolean field384;
	@ObfInfo(
		owner = "client",
		name = "bh",
		desc = "Z"
	)
	static boolean field387;
	@ObfInfo(
		owner = "client",
		name = "nc",
		desc = "Z"
	)
	static boolean field388;
	@ObfInfo(
		owner = "client",
		name = "jt",
		desc = "Z"
	)
	static boolean field402;
	@ObfInfo(
		owner = "client",
		name = "pu",
		desc = "Z"
	)
	static boolean field414;
	@ObfInfo(
		owner = "client",
		name = "px",
		desc = "Z"
	)
	static boolean field417;
	@ObfInfo(
		owner = "client",
		name = "oc",
		desc = "Z"
	)
	static boolean field441;
	@ObfInfo(
		owner = "client",
		name = "rl",
		desc = "Z"
	)
	static boolean field453;
	@ObfInfo(
		owner = "client",
		name = "pa",
		desc = "Z"
	)
	static boolean field458;
	@ObfInfo(
		owner = "client",
		name = "bn",
		desc = "Z"
	)
	static boolean field461;
	@ObfInfo(
		owner = "client",
		name = "sw",
		desc = "Z"
	)
	static boolean field477;
	@ObfInfo(
		owner = "client",
		name = "ts",
		desc = "Z"
	)
	static boolean field484;
	@ObfInfo(
		owner = "client",
		name = "th",
		desc = "Z"
	)
	static boolean field485;
	@ObfInfo(
		owner = "client",
		name = "mi",
		desc = "[Z"
	)
	static boolean[] field357;
	@ObfInfo(
		owner = "client",
		name = "nk",
		desc = "[Z"
	)
	static boolean[] field377;
	@ObfInfo(
		owner = "client",
		name = "qw",
		desc = "[Z"
	)
	static boolean[] field444;
	@ObfInfo(
		owner = "client",
		name = "qe",
		desc = "[Z"
	)
	static boolean[] field445;
	@ObfInfo(
		owner = "client",
		name = "qx",
		desc = "[Z"
	)
	static boolean[] field446;
	@ObfInfo(
		owner = "client",
		name = "ut",
		desc = "[Z"
	)
	static boolean[] field486;
	@ObfInfo(
		owner = "client",
		name = "gg",
		desc = "[B"
	)
	static byte[] field273;
	@ObfInfo(
		owner = "client",
		name = "re",
		desc = "Lgb;"
	)
	static class117 field285;
	@ObfInfo(
		owner = "client",
		name = "ok",
		desc = "Lkd;"
	)
	static class120 field399;
	@ObfInfo(
		owner = "client",
		name = "om",
		desc = "Lkd;"
	)
	static class120 field406;
	@ObfInfo(
		owner = "client",
		name = "ob",
		desc = "Lkd;"
	)
	static class120 field407;
	@ObfInfo(
		owner = "client",
		name = "pv",
		desc = "Lkd;"
	)
	static class120 field410;
	@ObfInfo(
		owner = "client",
		name = "oz",
		desc = "Lkd;"
	)
	static class120 field482;
	@ObfInfo(
		owner = "client",
		name = "qh",
		desc = "Lmq;"
	)
	static class141 field295;
	@ObfInfo(
		owner = "client",
		name = "mo",
		desc = "Lmq;"
	)
	static class141 field352;
	@ObfInfo(
		owner = "client",
		name = "ma",
		desc = "Lmq;"
	)
	static class141 field362;
	@ObfInfo(
		owner = "client",
		name = "qr",
		desc = "Lmq;"
	)
	static class141 field438;
	@ObfInfo(
		owner = "client",
		name = "qg",
		desc = "Lmq;"
	)
	static class141 field439;
	@ObfInfo(
		owner = "client",
		name = "qo",
		desc = "Lmq;"
	)
	static class141 field440;
	@ObfInfo(
		owner = "client",
		name = "mv",
		desc = "Lmq;"
	)
	static class141 field450;
	@ObfInfo(
		owner = "client",
		name = "mu",
		desc = "[[[Lmq;"
	)
	static class141[][][] field360;
	@ObfInfo(
		owner = "client",
		name = "qs",
		desc = "Lqp;"
	)
	static class170 field271;
	@ObfInfo(
		owner = "client",
		name = "oa",
		desc = "Lqp;"
	)
	static class170 field394;
	@ObfInfo(
		owner = "client",
		name = "fh",
		desc = "Lrh;"
	)
	static class218 field353;
	@ObfInfo(
		owner = "client",
		name = "vq",
		desc = "Lni;"
	)
	static class255 field284;
	@ObfInfo(
		owner = "client",
		name = "sq",
		desc = "[Lrx;"
	)
	static class266[] field472;
	@ObfInfo(
		owner = "client",
		name = "gi",
		desc = "[Lcg;"
	)
	static class267[] field465;
	@ObfInfo(
		owner = "client",
		name = "ur",
		desc = "Lko;"
	)
	static class284 field264;
	@ObfInfo(
		owner = "client",
		name = "ve",
		desc = "Lbg;"
	)
	static class290 field509;
	@ObfInfo(
		owner = "client",
		name = "vg",
		desc = "[Lmz;"
	)
	static class324[] field429;
	@ObfInfo(
		owner = "client",
		name = "hz",
		desc = "Lnh;"
	)
	static class337 field225;
	@ObfInfo(
		owner = "client",
		name = "tr",
		desc = "[Lak;"
	)
	static class351[] field288;
	@ObfInfo(
		owner = "client",
		name = "qj",
		desc = "Lrd;"
	)
	static class354 field218;
	@ObfInfo(
		owner = "client",
		name = "ly",
		desc = "[Lcj;"
	)
	static class380[] field347;
	@ObfInfo(
		owner = "client",
		name = "w",
		desc = "[Lgw;"
	)
	static class427[] field289;
	@ObfInfo(
		owner = "client",
		name = "st",
		desc = "[Lep;"
	)
	static class429[] field466;
	@ObfInfo(
		owner = "client",
		name = "fs",
		desc = "Let;"
	)
	static class445 field253;
	@ObfInfo(
		owner = "client",
		name = "dt",
		desc = "Lcz;"
	)
	static class483 field246;
	@ObfInfo(
		owner = "client",
		name = "dp",
		desc = "Lcz;"
	)
	static class483 field467;
	@ObfInfo(
		owner = "client",
		name = "sj",
		desc = "[Lfn;"
	)
	static class57[] field345;
	@ObfInfo(
		owner = "client",
		name = "gk",
		desc = "Lbb;"
	)
	static class63 field269;
	@ObfInfo(
		owner = "client",
		name = "ud",
		desc = "Lpd;"
	)
	static class8 field255;
	@ObfInfo(
		owner = "client",
		name = "vh",
		desc = "Ljv;"
	)
	static class99 field437;
	@ObfInfo(
		owner = "client",
		name = "vp",
		desc = "Ljv;"
	)
	static class99 field512;
	@ObfInfo(
		owner = "client",
		name = "su",
		desc = "I"
	)
	static int field219;
	@ObfInfo(
		owner = "client",
		name = "fp",
		desc = "I"
	)
	static int field220;
	@ObfInfo(
		owner = "client",
		name = "by",
		desc = "I"
	)
	static int field221;
	@ObfInfo(
		owner = "client",
		name = "bi",
		desc = "I"
	)
	static int field224;
	@ObfInfo(
		owner = "client",
		name = "qn",
		desc = "I"
	)
	static int field226;
	@ObfInfo(
		owner = "client",
		name = "lc",
		desc = "I"
	)
	static int field227;
	@ObfInfo(
		owner = "client",
		name = "cc",
		desc = "I"
	)
	static int field229;
	@ObfInfo(
		owner = "client",
		name = "da",
		desc = "I"
	)
	static int field231;
	@ObfInfo(
		owner = "client",
		name = "pf",
		desc = "I"
	)
	static int field232;
	@ObfInfo(
		owner = "client",
		name = "dw",
		desc = "I"
	)
	static int field233;
	@ObfInfo(
		owner = "client",
		name = "nj",
		desc = "I"
	)
	static int field234;
	@ObfInfo(
		owner = "client",
		name = "dc",
		desc = "I"
	)
	static int field237;
	@ObfInfo(
		owner = "client",
		name = "dk",
		desc = "I"
	)
	static int field238;
	@ObfInfo(
		owner = "client",
		name = "df",
		desc = "I"
	)
	static int field239;
	@ObfInfo(
		owner = "client",
		name = "ft",
		desc = "I"
	)
	static int field240;
	@ObfInfo(
		owner = "client",
		name = "dx",
		desc = "I"
	)
	static int field241;
	@ObfInfo(
		owner = "client",
		name = "dd",
		desc = "I"
	)
	static int field243;
	@ObfInfo(
		owner = "client",
		name = "dg",
		desc = "I"
	)
	static int field244;
	@ObfInfo(
		owner = "client",
		name = "jq",
		desc = "I"
	)
	static int field245;
	@ObfInfo(
		owner = "client",
		name = "eh",
		desc = "I"
	)
	static int field248;
	@ObfInfo(
		owner = "client",
		name = "ee",
		desc = "I"
	)
	static int field249;
	@ObfInfo(
		owner = "client",
		name = "em",
		desc = "I"
	)
	static int field250;
	@ObfInfo(
		owner = "client",
		name = "fr",
		desc = "I"
	)
	static int field251;
	@ObfInfo(
		owner = "client",
		name = "ff",
		desc = "I"
	)
	static int field254;
	@ObfInfo(
		owner = "client",
		name = "kh",
		desc = "I"
	)
	static int field257;
	@ObfInfo(
		owner = "client",
		name = "dm",
		desc = "I"
	)
	static int field265;
	@ObfInfo(
		owner = "client",
		name = "nz",
		desc = "I"
	)
	static int field266;
	@ObfInfo(
		owner = "client",
		name = "hs",
		desc = "I"
	)
	static int field275;
	@ObfInfo(
		owner = "client",
		name = "ii",
		desc = "I"
	)
	static int field276;
	@ObfInfo(
		owner = "client",
		name = "ho",
		desc = "I"
	)
	static int field277;
	@ObfInfo(
		owner = "client",
		name = "hf",
		desc = "I"
	)
	static int field280;
	@ObfInfo(
		owner = "client",
		name = "dr",
		desc = "I"
	)
	static int field282;
	@ObfInfo(
		owner = "client",
		name = "iq",
		desc = "I"
	)
	static int field287;
	@ObfInfo(
		owner = "client",
		name = "lb",
		desc = "I"
	)
	static int field294;
	@ObfInfo(
		owner = "client",
		name = "sh",
		desc = "I"
	)
	static int field296;
	@ObfInfo(
		owner = "client",
		name = "jj",
		desc = "I"
	)
	static int field297;
	@ObfInfo(
		owner = "client",
		name = "jv",
		desc = "I"
	)
	static int field299;
	@ObfInfo(
		owner = "client",
		name = "jn",
		desc = "I"
	)
	static int field300;
	@ObfInfo(
		owner = "client",
		name = "jx",
		desc = "I"
	)
	static int field301;
	@ObfInfo(
		owner = "client",
		name = "jf",
		desc = "I"
	)
	static int field302;
	@ObfInfo(
		owner = "client",
		name = "jo",
		desc = "I"
	)
	static int field304;
	@ObfInfo(
		owner = "client",
		name = "jg",
		desc = "I"
	)
	static int field305;
	@ObfInfo(
		owner = "client",
		name = "jc",
		desc = "I"
	)
	static int field306;
	@ObfInfo(
		owner = "client",
		name = "dy",
		desc = "I"
	)
	static int field307;
	@ObfInfo(
		owner = "client",
		name = "bf",
		desc = "I"
	)
	static int field308;
	@ObfInfo(
		owner = "client",
		name = "km",
		desc = "I"
	)
	static int field309;
	@ObfInfo(
		owner = "client",
		name = "kl",
		desc = "I"
	)
	static int field310;
	@ObfInfo(
		owner = "client",
		name = "kx",
		desc = "I"
	)
	static int field312;
	@ObfInfo(
		owner = "client",
		name = "ll",
		desc = "I"
	)
	static int field313;
	@ObfInfo(
		owner = "client",
		name = "hp",
		desc = "I"
	)
	static int field314;
	@ObfInfo(
		owner = "client",
		name = "br",
		desc = "I"
	)
	static int field315;
	@ObfInfo(
		owner = "client",
		name = "kr",
		desc = "I"
	)
	static int field317;
	@ObfInfo(
		owner = "client",
		name = "kp",
		desc = "I"
	)
	static int field319;
	@ObfInfo(
		owner = "client",
		name = "ql",
		desc = "I"
	)
	static int field323;
	@ObfInfo(
		owner = "client",
		name = "ph",
		desc = "I"
	)
	static int field326;
	@ObfInfo(
		owner = "client",
		name = "qd",
		desc = "I"
	)
	static int field327;
	@ObfInfo(
		owner = "client",
		name = "kw",
		desc = "I"
	)
	static int field329;
	@ObfInfo(
		owner = "client",
		name = "lm",
		desc = "I"
	)
	static int field331;
	@ObfInfo(
		owner = "client",
		name = "sd",
		desc = "I"
	)
	static int field332;
	@ObfInfo(
		owner = "client",
		name = "lk",
		desc = "I"
	)
	static int field335;
	@ObfInfo(
		owner = "client",
		name = "lg",
		desc = "I"
	)
	static int field337;
	@ObfInfo(
		owner = "client",
		name = "ls",
		desc = "I"
	)
	static int field338;
	@ObfInfo(
		owner = "client",
		name = "dq",
		desc = "I"
	)
	static int field339;
	@ObfInfo(
		owner = "client",
		name = "lh",
		desc = "I"
	)
	static int field340;
	@ObfInfo(
		owner = "client",
		name = "lj",
		desc = "I"
	)
	static int field341;
	@ObfInfo(
		owner = "client",
		name = "of",
		desc = "I"
	)
	static int field342;
	@ObfInfo(
		owner = "client",
		name = "lq",
		desc = "I"
	)
	static int field344;
	@ObfInfo(
		owner = "client",
		name = "lr",
		desc = "I"
	)
	static int field348;
	@ObfInfo(
		owner = "client",
		name = "ka",
		desc = "I"
	)
	static int field351;
	@ObfInfo(
		owner = "client",
		name = "mq",
		desc = "I"
	)
	static int field359;
	@ObfInfo(
		owner = "client",
		name = "fg",
		desc = "I"
	)
	static int field361;
	@ObfInfo(
		owner = "client",
		name = "jl",
		desc = "I"
	)
	static int field364;
	@ObfInfo(
		owner = "client",
		name = "nm",
		desc = "I"
	)
	static int field369;
	@ObfInfo(
		owner = "client",
		name = "ip",
		desc = "I"
	)
	static int field371;
	@ObfInfo(
		owner = "client",
		name = "uj",
		desc = "I"
	)
	static int field372;
	@ObfInfo(
		owner = "client",
		name = "kc",
		desc = "I"
	)
	static int field373;
	@ObfInfo(
		owner = "client",
		name = "jh",
		desc = "I"
	)
	static int field376;
	@ObfInfo(
		owner = "client",
		name = "no",
		desc = "I"
	)
	static int field382;
	@ObfInfo(
		owner = "client",
		name = "nq",
		desc = "I"
	)
	static int field383;
	@ObfInfo(
		owner = "client",
		name = "nn",
		desc = "I"
	)
	static int field386;
	@ObfInfo(
		owner = "client",
		name = "oy",
		desc = "I"
	)
	static int field389;
	@ObfInfo(
		owner = "client",
		name = "og",
		desc = "I"
	)
	static int field390;
	@ObfInfo(
		owner = "client",
		name = "oq",
		desc = "I"
	)
	static int field393;
	@ObfInfo(
		owner = "client",
		name = "oi",
		desc = "I"
	)
	static int field396;
	@ObfInfo(
		owner = "client",
		name = "oo",
		desc = "I"
	)
	static int field397;
	@ObfInfo(
		owner = "client",
		name = "on",
		desc = "I"
	)
	static int field398;
	@ObfInfo(
		owner = "client",
		name = "uq",
		desc = "I"
	)
	static int field400;
	@ObfInfo(
		owner = "client",
		name = "ow",
		desc = "I"
	)
	static int field401;
	@ObfInfo(
		owner = "client",
		name = "lt",
		desc = "I"
	)
	static int field404;
	@ObfInfo(
		owner = "client",
		name = "lx",
		desc = "I"
	)
	static int field405;
	@ObfInfo(
		owner = "client",
		name = "or",
		desc = "I"
	)
	static int field408;
	@ObfInfo(
		owner = "client",
		name = "pe",
		desc = "I"
	)
	static int field409;
	@ObfInfo(
		owner = "client",
		name = "bq",
		desc = "I"
	)
	static int field411;
	@ObfInfo(
		owner = "client",
		name = "ps",
		desc = "I"
	)
	static int field412;
	@ObfInfo(
		owner = "client",
		name = "oj",
		desc = "I"
	)
	static int field413;
	@ObfInfo(
		owner = "client",
		name = "pn",
		desc = "I"
	)
	static int field416;
	@ObfInfo(
		owner = "client",
		name = "po",
		desc = "I"
	)
	static int field418;
	@ObfInfo(
		owner = "client",
		name = "pq",
		desc = "I"
	)
	static int field420;
	@ObfInfo(
		owner = "client",
		name = "pd",
		desc = "I"
	)
	static int field422;
	@ObfInfo(
		owner = "client",
		name = "rn",
		desc = "I"
	)
	static int field423;
	@ObfInfo(
		owner = "client",
		name = "pb",
		desc = "I"
	)
	static int field424;
	@ObfInfo(
		owner = "client",
		name = "pt",
		desc = "I"
	)
	static int field426;
	@ObfInfo(
		owner = "client",
		name = "pg",
		desc = "I"
	)
	static int field427;
	@ObfInfo(
		owner = "client",
		name = "pi",
		desc = "I"
	)
	static int field428;
	@ObfInfo(
		owner = "client",
		name = "qp",
		desc = "I"
	)
	static int field430;
	@ObfInfo(
		owner = "client",
		name = "jm",
		desc = "I"
	)
	static int field432;
	@ObfInfo(
		owner = "client",
		name = "qi",
		desc = "I"
	)
	static int field433;
	@ObfInfo(
		owner = "client",
		name = "qt",
		desc = "I"
	)
	static int field434;
	@ObfInfo(
		owner = "client",
		name = "kj",
		desc = "I"
	)
	static int field436;
	@ObfInfo(
		owner = "client",
		name = "qm",
		desc = "I"
	)
	static int field442;
	@ObfInfo(
		owner = "client",
		name = "vt",
		desc = "I"
	)
	static int field443;
	@ObfInfo(
		owner = "client",
		name = "ms",
		desc = "I"
	)
	static int field449;
	@ObfInfo(
		owner = "client",
		name = "rx",
		desc = "I"
	)
	static int field455;
	@ObfInfo(
		owner = "client",
		name = "rs",
		desc = "I"
	)
	static int field456;
	@ObfInfo(
		owner = "client",
		name = "rr",
		desc = "I"
	)
	static int field459;
	@ObfInfo(
		owner = "client",
		name = "ja",
		desc = "I"
	)
	static int field462;
	@ObfInfo(
		owner = "client",
		name = "hd",
		desc = "I"
	)
	static int field468;
	@ObfInfo(
		owner = "client",
		name = "sg",
		desc = "I"
	)
	static int field469;
	@ObfInfo(
		owner = "client",
		name = "sx",
		desc = "I"
	)
	static int field473;
	@ObfInfo(
		owner = "client",
		name = "kb",
		desc = "I"
	)
	static int field474;
	@ObfInfo(
		owner = "client",
		name = "rk",
		desc = "I"
	)
	static int field475;
	@ObfInfo(
		owner = "client",
		name = "sz",
		desc = "I"
	)
	static int field476;
	@ObfInfo(
		owner = "client",
		name = "tw",
		desc = "I"
	)
	static int field478;
	@ObfInfo(
		owner = "client",
		name = "op",
		desc = "I"
	)
	static int field481;
	@ObfInfo(
		owner = "client",
		name = "qc",
		desc = "I"
	)
	static int field490;
	@ObfInfo(
		owner = "client",
		name = "mk",
		desc = "I"
	)
	static int field492;
	@ObfInfo(
		owner = "client",
		name = "hu",
		desc = "I"
	)
	static int field499;
	@ObfInfo(
		owner = "client",
		name = "ui",
		desc = "I"
	)
	static int field500;
	@ObfInfo(
		owner = "client",
		name = "us",
		desc = "I"
	)
	static int field501;
	@ObfInfo(
		owner = "client",
		name = "uu",
		desc = "I"
	)
	static int field503;
	@ObfInfo(
		owner = "client",
		name = "ox",
		desc = "I"
	)
	static int field504;
	@ObfInfo(
		owner = "client",
		name = "uc",
		desc = "I"
	)
	static int field505;
	@ObfInfo(
		owner = "client",
		name = "ub",
		desc = "I"
	)
	static int field506;
	@ObfInfo(
		owner = "client",
		name = "li",
		desc = "I"
	)
	static int field511;
	@ObfInfo(
		owner = "client",
		name = "vr",
		desc = "I"
	)
	static int field513;
	@ObfInfo(
		owner = "client",
		name = "vv",
		desc = "I"
	)
	static int field517;
	@ObfInfo(
		owner = "client",
		name = "ks",
		desc = "I"
	)
	static int field520;
	@ObfInfo(
		owner = "client",
		name = "qb",
		desc = "I"
	)
	static int field521;
	@ObfInfo(
		owner = "client",
		name = "rq",
		desc = "[I"
	)
	static int[] field247;
	@ObfInfo(
		owner = "client",
		name = "he",
		desc = "[I"
	)
	static int[] field278;
	@ObfInfo(
		owner = "client",
		name = "mm",
		desc = "[I"
	)
	static int[] field293;
	@ObfInfo(
		owner = "client",
		name = "ku",
		desc = "[I"
	)
	static int[] field320;
	@ObfInfo(
		owner = "client",
		name = "kt",
		desc = "[I"
	)
	static int[] field321;
	@ObfInfo(
		owner = "client",
		name = "ko",
		desc = "[I"
	)
	static int[] field322;
	@ObfInfo(
		owner = "client",
		name = "kz",
		desc = "[I"
	)
	static int[] field324;
	@ObfInfo(
		owner = "client",
		name = "kd",
		desc = "[I"
	)
	static int[] field325;
	@ObfInfo(
		owner = "client",
		name = "un",
		desc = "[I"
	)
	static int[] field330;
	@ObfInfo(
		owner = "client",
		name = "np",
		desc = "[I"
	)
	static int[] field333;
	@ObfInfo(
		owner = "client",
		name = "ta",
		desc = "[I"
	)
	static int[] field334;
	@ObfInfo(
		owner = "client",
		name = "pc",
		desc = "[I"
	)
	static int[] field349;
	@ObfInfo(
		owner = "client",
		name = "me",
		desc = "[I"
	)
	static int[] field354;
	@ObfInfo(
		owner = "client",
		name = "md",
		desc = "[I"
	)
	static int[] field358;
	@ObfInfo(
		owner = "client",
		name = "nu",
		desc = "[I"
	)
	static int[] field363;
	@ObfInfo(
		owner = "client",
		name = "mj",
		desc = "[I"
	)
	static int[] field365;
	@ObfInfo(
		owner = "client",
		name = "my",
		desc = "[I"
	)
	static int[] field366;
	@ObfInfo(
		owner = "client",
		name = "nv",
		desc = "[I"
	)
	static int[] field370;
	@ObfInfo(
		owner = "client",
		name = "ne",
		desc = "[I"
	)
	static int[] field374;
	@ObfInfo(
		owner = "client",
		name = "kf",
		desc = "[I"
	)
	static int[] field415;
	@ObfInfo(
		owner = "client",
		name = "pl",
		desc = "[I"
	)
	static int[] field419;
	@ObfInfo(
		owner = "client",
		name = "pk",
		desc = "[I"
	)
	static int[] field421;
	@ObfInfo(
		owner = "client",
		name = "pz",
		desc = "[I"
	)
	static int[] field425;
	@ObfInfo(
		owner = "client",
		name = "hx",
		desc = "[I"
	)
	static int[] field431;
	@ObfInfo(
		owner = "client",
		name = "rf",
		desc = "[I"
	)
	static int[] field435;
	@ObfInfo(
		owner = "client",
		name = "qy",
		desc = "[I"
	)
	static int[] field447;
	@ObfInfo(
		owner = "client",
		name = "qz",
		desc = "[I"
	)
	static int[] field448;
	@ObfInfo(
		owner = "client",
		name = "ra",
		desc = "[I"
	)
	static int[] field454;
	@ObfInfo(
		owner = "client",
		name = "ny",
		desc = "[I"
	)
	static int[] field463;
	@ObfInfo(
		owner = "client",
		name = "rw",
		desc = "[I"
	)
	static int[] field464;
	@ObfInfo(
		owner = "client",
		name = "sl",
		desc = "[I"
	)
	static int[] field470;
	@ObfInfo(
		owner = "client",
		name = "sv",
		desc = "[I"
	)
	static int[] field471;
	@ObfInfo(
		owner = "client",
		name = "to",
		desc = "[I"
	)
	static int[] field479;
	@ObfInfo(
		owner = "client",
		name = "tj",
		desc = "[I"
	)
	static int[] field480;
	@ObfInfo(
		owner = "client",
		name = "rb",
		desc = "[I"
	)
	static int[] field487;
	@ObfInfo(
		owner = "client",
		name = "ux",
		desc = "[I"
	)
	static int[] field488;
	@ObfInfo(
		owner = "client",
		name = "uv",
		desc = "[I"
	)
	static int[] field489;
	@ObfInfo(
		owner = "client",
		name = "iy",
		desc = "[I"
	)
	static int[] field495;
	@ObfInfo(
		owner = "client",
		name = "wt",
		desc = "[I"
	)
	static int[] field498;
	@ObfInfo(
		owner = "client",
		name = "ki",
		desc = "[I"
	)
	static int[] field507;
	@ObfInfo(
		owner = "client",
		name = "tf",
		desc = "[I"
	)
	static int[] field508;
	@ObfInfo(
		owner = "client",
		name = "uo",
		desc = "[I"
	)
	static int[] field516;
	@ObfInfo(
		owner = "client",
		name = "ws",
		desc = "[I"
	)
	static int[] field519;
	@ObfInfo(
		owner = "client",
		name = "kk",
		desc = "[[I"
	)
	static int[][] field328;
	@ObfInfo(
		owner = "client",
		name = "im",
		desc = "[[[I"
	)
	static int[][][] field291;
	@ObfInfo(
		owner = "client",
		name = "os",
		desc = "Ljava/lang/String;"
	)
	static String field391;
	@ObfInfo(
		owner = "client",
		name = "rg",
		desc = "Ljava/lang/String;"
	)
	static String field457;
	@ObfInfo(
		owner = "client",
		name = "it",
		desc = "Ljava/lang/String;"
	)
	static String field483;
	@ObfInfo(
		owner = "client",
		name = "od",
		desc = "Ljava/lang/String;"
	)
	static String field510;
	@ObfInfo(
		owner = "client",
		name = "nl",
		desc = "[Ljava/lang/String;"
	)
	static String[] field256;
	@ObfInfo(
		owner = "client",
		name = "kq",
		desc = "[Ljava/lang/String;"
	)
	static String[] field318;
	@ObfInfo(
		owner = "client",
		name = "mr",
		desc = "[Ljava/lang/String;"
	)
	static String[] field356;
	@ObfInfo(
		owner = "client",
		name = "na",
		desc = "[Ljava/lang/String;"
	)
	static String[] field375;
	@ObfInfo(
		owner = "client",
		name = "vj",
		desc = "Ljava/util/ArrayList;"
	)
	static ArrayList field515;
	@ObfInfo(
		owner = "client",
		name = "hg",
		desc = "Ljava/util/HashMap;"
	)
	static HashMap field283;
	@ObfInfo(
		owner = "client",
		name = "dv",
		desc = "J"
	)
	static long field235;
	@ObfInfo(
		owner = "client",
		name = "la",
		desc = "J"
	)
	static long field350;
	@ObfInfo(
		owner = "client",
		name = "ro",
		desc = "J"
	)
	static long field392;
	@ObfInfo(
		owner = "client",
		name = "de",
		desc = "J"
	)
	static long field451;
	@ObfInfo(
		owner = "client",
		name = "rh",
		desc = "J"
	)
	static long field452;
	@ObfInfo(
		owner = "client",
		name = "rt",
		desc = "[J"
	)
	static long[] field236;
	@ObfInfo(
		owner = "client",
		name = "uy",
		desc = "S"
	)
	static short field223;
	@ObfInfo(
		owner = "client",
		name = "uz",
		desc = "S"
	)
	static short field263;
	@ObfInfo(
		owner = "client",
		name = "ug",
		desc = "S"
	)
	static short field385;
	@ObfInfo(
		owner = "client",
		name = "ua",
		desc = "S"
	)
	static short field403;
	@ObfInfo(
		owner = "client",
		name = "ul",
		desc = "S"
	)
	static short field491;
	@ObfInfo(
		owner = "client",
		name = "ue",
		desc = "S"
	)
	static short field493;
	@ObfInfo(
		owner = "client",
		name = "up",
		desc = "S"
	)
	static short field496;
	@ObfInfo(
		owner = "client",
		name = "uh",
		desc = "S"
	)
	static short field497;
	@ObfInfo(
		owner = "client",
		name = "wd",
		desc = "Lbx;"
	)
	static final class197 field518;
	@ObfInfo(
		owner = "client",
		name = "in",
		desc = "[I"
	)
	static final int[] field292;
	@ObfInfo(
		owner = "client",
		name = "mb",
		desc = "[I"
	)
	static final int[] field355;
	@ObfInfo(
		owner = "client",
		name = "gh",
		desc = "Ljava/lang/String;"
	)
	static final String field267;
	@ObfInfo(
		owner = "client",
		name = "gp",
		desc = "Z"
	)
	boolean field303;
	@ObfInfo(
		owner = "client",
		name = "gt",
		desc = "Lqy;"
	)
	class127 field270;
	@ObfInfo(
		owner = "client",
		name = "fw",
		desc = "Ln;"
	)
	class19 field259;
	@ObfInfo(
		owner = "client",
		name = "gf",
		desc = "Lt;"
	)
	class3 field260;
	@ObfInfo(
		owner = "client",
		name = "gz",
		desc = "Lt;"
	)
	class3 field367;
	@ObfInfo(
		owner = "client",
		name = "gc",
		desc = "Lr;"
	)
	class472 field286;
	@ObfInfo(
		owner = "client",
		name = "go",
		desc = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester field261;
	@ObfInfo(
		owner = "client",
		name = "gl",
		desc = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field379;
	@ObfInfo(
		owner = "client",
		name = "fj",
		desc = "Ljava/lang/String;"
	)
	String field494;
	@ObfInfo(
		owner = "client",
		name = "gj",
		desc = "Ljava/util/concurrent/Future;"
	)
	Future field262;
	@ObfInfo(
		owner = "client",
		name = "gq",
		desc = "Ljava/util/concurrent/Future;"
	)
	Future field336;
	@ObfInfo(
		owner = "client",
		name = "gw",
		desc = "J"
	)
	long field272;

	static {
		field387 = true;
		field395 = 1;
		field308 = 0;
		field221 = 0;
		field222 = false;
		field274 = false;
		field224 = -1;
		field315 = -1;
		field411 = -1;
		field461 = false;
		field228 = 210;
		field229 = 0;
		field230 = true;
		field231 = 0;
		field451 = -1L;
		field233 = -1;
		field265 = -1;
		field235 = -1L;
		field298 = true;
		field237 = 0;
		field238 = 0;
		field239 = 0;
		field307 = 0;
		field241 = 0;
		field282 = 0;
		field243 = 0;
		field244 = 0;
		field339 = 0;
		field246 = class483.field4024;
		field467 = class483.field4024;
		field248 = 0;
		field249 = 0;
		field250 = 0;
		field251 = 0;
		field220 = 0;
		field361 = 0;
		field254 = 0;
		field240 = 0;
		field253 = class445.field3672;
		field353 = class218.field1894;
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

		field267 = class236.method1029(var2);
		field268 = false;
		field269 = new class63();
		field273 = null;
		field465 = new class267[65536];
		field275 = 0;
		field431 = new int[65536];
		field277 = 0;
		field278 = new int[250];
		field279 = new class486();
		field280 = 0;
		field281 = false;
		field225 = new class337();
		field283 = new HashMap();
		field314 = 0;
		field468 = 1;
		field499 = 0;
		field287 = 1;
		field371 = 0;
		field289 = new class427[4];
		field290 = false;
		field291 = new int[4][13][13];
		field292 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field276 = 0;
		field432 = 2301979;
		field364 = 5063219;
		field245 = 3353893;
		field297 = 7759444;
		field402 = false;
		field299 = 0;
		field300 = 128;
		field301 = 0;
		field302 = 0;
		field376 = 0;
		field304 = 0;
		field305 = 0;
		field306 = 0;
		field462 = 50;
		field351 = 0;
		field309 = 0;
		field310 = 0;
		field373 = 12;
		field312 = 6;
		field502 = 0;
		field242 = false;
		field520 = 0;
		field316 = false;
		field317 = 0;
		field474 = 0;
		field319 = 50;
		field320 = new int[field319];
		field321 = new int[field319];
		field322 = new int[field319];
		field507 = new int[field319];
		field324 = new int[field319];
		field325 = new int[field319];
		field415 = new int[field319];
		field318 = new String[field319];
		field328 = new int[104][104];
		field329 = 0;
		field436 = -1;
		field257 = -1;
		field294 = 0;
		field227 = 0;
		field313 = 0;
		field335 = 0;
		field252 = true;
		field337 = 0;
		field338 = 0;
		field331 = 0;
		field340 = 0;
		field341 = 0;
		field511 = 0;
		field343 = false;
		field344 = 0;
		field404 = 0;
		field346 = true;
		field347 = new class380[2048];
		field348 = -1;
		field405 = 0;
		field350 = -1L;
		field258 = true;
		field449 = 0;
		field492 = 0;
		field354 = new int[1000];
		field355 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		field356 = new String[8];
		field357 = new boolean[8];
		field358 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		field359 = -1;
		field360 = new class141[4][104][104];
		field450 = new class141();
		field362 = new class141();
		field352 = new class141();
		field293 = new int[25];
		field365 = new int[25];
		field366 = new int[25];
		field311 = false;
		field368 = false;
		field369 = 0;
		field370 = new int[500];
		field363 = new int[500];
		field463 = new int[500];
		field333 = new int[500];
		field374 = new int[500];
		field375 = new String[500];
		field256 = new String[500];
		field377 = new boolean[500];
		field378 = false;
		field384 = false;
		field380 = false;
		field381 = true;
		field382 = -1;
		field383 = -1;
		field266 = 0;
		field234 = 50;
		field386 = 0;
		field483 = null;
		field388 = false;
		field389 = -1;
		field390 = -1;
		field391 = null;
		field510 = null;
		field393 = -1;
		field394 = new class170(8);
		field504 = 0;
		field396 = -1;
		field397 = 0;
		field398 = 0;
		field399 = null;
		field342 = 0;
		field401 = 0;
		field481 = 0;
		field413 = -1;
		field441 = false;
		field482 = null;
		field406 = null;
		field407 = null;
		field408 = 0;
		field409 = 0;
		field410 = null;
		field458 = false;
		field412 = -1;
		field326 = -1;
		field414 = false;
		field232 = -1;
		field416 = -1;
		field417 = false;
		field418 = 1;
		field419 = new int[32];
		field420 = 0;
		field421 = new int[32];
		field422 = 0;
		field349 = new int[32];
		field424 = 0;
		field425 = new int[32];
		field426 = 0;
		field427 = 0;
		field428 = 0;
		field323 = 0;
		field430 = 0;
		field226 = 0;
		field490 = 0;
		field433 = 0;
		field434 = 0;
		field327 = 0;
		field218 = new class354();
		field295 = new class141();
		field438 = new class141();
		field439 = new class141();
		field440 = new class141();
		field271 = new class170(512);
		field442 = 0;
		field521 = -2;
		field444 = new boolean[100];
		field445 = new boolean[100];
		field446 = new boolean[100];
		field447 = new int[100];
		field448 = new int[100];
		field435 = new int[100];
		field247 = new int[100];
		field475 = 0;
		field452 = 0L;
		field453 = true;
		field454 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		field455 = 0;
		field456 = 0;
		field457 = "";
		field236 = new long[100];
		field459 = 0;
		field460 = new class432();
		field285 = new class117();
		field423 = 0;
		field487 = new int[128];
		field464 = new int[128];
		field392 = -1L;
		field466 = new class429[4];
		field345 = new class57[4];
		field332 = -1;
		field469 = 0;
		field470 = new int[1000];
		field471 = new int[1000];
		field472 = new class266[1000];
		field473 = 0;
		field219 = 0;
		field296 = 0;
		field476 = -1;
		field477 = false;
		field478 = 0;
		field479 = new int[50];
		field480 = new int[50];
		field508 = new int[50];
		field334 = new int[50];
		field288 = new class351[50];
		field484 = false;
		field485 = false;
		field486 = new boolean[5];
		field516 = new int[5];
		field488 = new int[5];
		field489 = new int[5];
		field330 = new int[5];
		field491 = 256;
		field263 = 205;
		field493 = 256;
		field385 = 320;
		field403 = 1;
		field496 = 32767;
		field497 = 1;
		field223 = 32767;
		field372 = 0;
		field500 = 0;
		field501 = 0;
		field400 = 0;
		field503 = 0;
		field264 = new class284();
		field505 = -1;
		field506 = -1;
		field255 = new class171();
		field429 = new class324[8];
		field509 = new class290();
		field284 = new class255(8, class237.field2007);
		field437 = new class99(64);
		field512 = new class99(64);
		field513 = -1;
		field514 = -1;
		field515 = new ArrayList(10);
		field443 = 0;
		field517 = 0;
		field518 = new class197();
		field519 = new int[50];
		field498 = new int[50];
	}

	@ObfInfo(
		owner = "client",
		name = "<init>",
		desc = "()V"
	)
	public client() {
		this.field303 = false;
		this.field272 = -1L;
	}

	@ObfInfo(
		owner = "client",
		name = "aw",
		desc = "(I)V"
	)
	protected final void method946() {
	}

	@ObfInfo(
		owner = "client",
		name = "init",
		desc = "()V"
	)
	public final void init() {
		if (this.method935()) {
			int var8;
			for (int var1 = 0; var1 <= 28; ++var1) {
				String var2 = this.getParameter(Integer.toString(var1));
				if (null != var2) {
					switch(var1) {
					case 3:
						if (var2.equalsIgnoreCase(class442.field3660)) {
							field222 = true;
						} else {
							field222 = false;
						}
						break;
					case 4:
						if (field315 == -1) {
							field315 = Integer.parseInt(var2);
						}
						break;
					case 5:
						field308 = Integer.parseInt(var2);
						break;
					case 6:
						int var4 = Integer.parseInt(var2);
						class476 var16;
						if (var4 >= 0 && var4 < class476.field4008.length) {
							var16 = class476.field4008[var4];
						} else {
							var16 = null;
						}

						class235.field1995 = var16;
						break;
					case 7:
						class10.field56 = class199.method880(Integer.parseInt(var2));
						break;
					case 8:
						if (var2.equalsIgnoreCase(class442.field3660)) {
						}
						break;
					case 9:
						class467.field3879 = var2;
						break;
					case 10:
						class493[] var3 = new class493[]{class493.field4115, class493.field4112, class493.field4113, class493.field4116, class493.field4114, class493.field4111};
						class41.field210 = (class493)class2.method10(var3, Integer.parseInt(var2));
						if (class41.field210 == class493.field4116) {
							class63.field619 = class194.field1726;
						} else {
							class63.field619 = class194.field1732;
						}
						break;
					case 11:
						class391.field3280 = var2;
						break;
					case 12:
						field395 = Integer.parseInt(var2);
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
						class173.field1290 = Integer.parseInt(var2);
						break;
					case 15:
						field221 = Integer.parseInt(var2);
						break;
					case 17:
						class374.field3175 = var2;
						break;
					case 21:
						field224 = Integer.parseInt(var2);
						break;
					case 25:
						var8 = var2.indexOf(".");
						if (var8 == -1) {
							field228 = Integer.parseInt(var2);
						} else {
							field228 = Integer.parseInt(var2.substring(0, var8));
							Integer.parseInt(var2.substring(var8 + 1));
						}
					}
				}
			}

			class189.method852();
			class182.field1677 = this.getCodeBase().getHost();
			String var9 = class10.field56.field2902;
			byte var10 = 0;

			try {
				class463.field3848 = 22;
				class41.field217 = var10;

				try {
					class7.field36 = System.getProperty("os.name");
				} catch (Exception var14) {
					class7.field36 = "Unknown";
				}

				class129.field1079 = class7.field36.toLowerCase();

				try {
					class134.field1109 = System.getProperty("user.home");
					if (class134.field1109 != null) {
						class134.field1109 = class134.field1109 + "/";
					}
				} catch (Exception var13) {
				}

				try {
					if (class129.field1079.startsWith("win")) {
						if (null == class134.field1109) {
							class134.field1109 = System.getenv("USERPROFILE");
						}
					} else if (null == class134.field1109) {
						class134.field1109 = System.getenv("HOME");
					}

					if (class134.field1109 != null) {
						class134.field1109 = class134.field1109 + "/";
					}
				} catch (Exception var12) {
				}

				if (null == class134.field1109) {
					class134.field1109 = "~/";
				}

				class293.field2384 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class134.field1109, "/tmp/", ""};
				class306.field2457 = new String[]{".jagex_cache_" + class41.field217, ".file_store_" + class41.field217};

				label133:
				for (var8 = 0; var8 < 4; ++var8) {
					class228.field1934 = class198.method876("oldschool", var9, var8);
					if (!class228.field1934.exists()) {
						class228.field1934.mkdirs();
					}

					File[] var11 = class228.field1934.listFiles();
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
						if (!class221.method978(var7, false)) {
							break;
						}

						++var6;
					}
				}

				class96.method387(class228.field1934);
				class212.method919();
				class25.field112 = new class435(new class455(class328.method1668("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
				class25.field113 = new class435(new class455(class328.method1668("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
				class25.field116 = new class435[class463.field3848];

				for (var8 = 0; var8 < class463.field3848; ++var8) {
					class25.field116[var8] = new class435(new class455(class328.method1668("main_file_cache.idx" + var8), "rw", 1048576L), 6000, 0);
				}
			} catch (Exception var15) {
				class445.method2199((String)null, var15);
			}

			class309.field2461 = this;
			class478.field4014 = field315;
			if (field411 == -1) {
				field411 = 0;
			}

			class114.field849 = System.getenv("JX_ACCESS_TOKEN");
			class236.field2005 = System.getenv("JX_REFRESH_TOKEN");
			if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
				this.field303 = true;
			}

			this.method933(765, 503, 210, 1);
		}
	}

	@ObfInfo(
		owner = "client",
		name = "setOtlTokenRequester",
		desc = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.field261 = var1;
			class286.method1419(10);
		}
	}

	@ObfInfo(
		owner = "client",
		name = "setRefreshTokenRequester",
		desc = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (null != var1) {
			this.field379 = var1;
		}
	}

	@ObfInfo(
		owner = "client",
		name = "isOnLoginScreen",
		desc = "()Z"
	)
	public boolean isOnLoginScreen() {
		return 10 == field229;
	}

	@ObfInfo(
		owner = "client",
		name = "getAccountHash",
		desc = "()J"
	)
	public long getAccountHash() {
		return this.field272;
	}

	@ObfInfo(
		owner = "client",
		name = "fw",
		desc = "(I)Z"
	)
	boolean method169() {
		return null != class114.field849 && !class114.field849.trim().isEmpty() && null != class236.field2005 && !class236.field2005.trim().isEmpty();
	}

	@ObfInfo(
		owner = "client",
		name = "gf",
		desc = "(I)Z"
	)
	boolean method170() {
		return null != this.field261;
	}

	@ObfInfo(
		owner = "client",
		name = "go",
		desc = "(Ljava/lang/String;I)V"
	)
	void method191(String var1) throws IOException {
		HashMap var3 = new HashMap();
		var3.put("grant_type", "refresh_token");
		var3.put("scope", "gamesso.token.create");
		var3.put("refresh_token", var1);
		URL var4 = new URL(class391.field3280 + "shield/oauth/token" + (new class59(var3)).method277());
		HashMap var5 = new HashMap();
		var5.put("Authorization", "Basic " + field267);
		var5.put("Host", (new URL(class391.field3280)).getHost());
		var5.put("Accept", class14.field67.method71());
		class374 var6 = class374.field3177;
		RefreshAccessTokenRequester var7 = this.field379;
		if (null != var7) {
			this.field336 = var7.request(var6.method1843(), var4, var5, "");
		} else {
			class192 var8 = new class192(var4, var6, this.field303);
			Iterator var9 = var5.entrySet().iterator();

			while (var9.hasNext()) {
				Entry var10 = (Entry)var9.next();
				var8.method862((String)var10.getKey(), (String)var10.getValue());
			}

			this.field367 = this.field259.method88(var8);
		}
	}

	@ObfInfo(
		owner = "client",
		name = "gj",
		desc = "(Ljava/lang/String;I)V"
	)
	void method171(String var1) throws MalformedURLException, IOException {
		URL var3 = new URL(class391.field3280 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		HashMap var4 = new HashMap();
		var4.put("Authorization", "Bearer " + var1);
		class374 var5 = class374.field3168;
		OtlTokenRequester var6 = this.field261;
		if (null != var6) {
			this.field262 = var6.request(var5.method1843(), var3, var4, "");
		} else {
			class192 var7 = new class192(var3, var5, this.field303);
			Iterator var8 = var4.entrySet().iterator();

			while (var8.hasNext()) {
				Entry var9 = (Entry)var8.next();
				var7.method862((String)var9.getKey(), (String)var9.getValue());
			}

			this.field260 = this.field259.method88(var7);
		}
	}

	@ObfInfo(
		owner = "client",
		name = "ay",
		desc = "(B)V"
	)
	protected final void method951() {
		int[] var2 = new int[]{20, 260, 10000};
		int[] var3 = new int[]{1000, 100, 500};
		if (var2 != null && null != var3) {
			class298.field2394 = var2;
			class119.field879 = new int[var2.length];
			class151.field1173 = new byte[var2.length][][];

			for (int var6 = 0; var6 < class298.field2394.length; ++var6) {
				class151.field1173[var6] = new byte[var3[var6]][];
				class355.field2929.add(var2[var6]);
			}

			Collections.sort(class355.field2929);
		} else {
			class298.field2394 = null;
			class119.field879 = null;
			class151.field1173 = (byte[][][])null;
			class355.field2929.clear();
			class355.field2929.add(100);
			class355.field2929.add(5000);
			class355.field2929.add(10000);
			class355.field2929.add(30000);
		}

		class57.field589 = 0 == field221 ? 43594 : field395 + 40000;
		class15.field72 = 0 == field221 ? 443 : field395 + 50000;
		class148.field1164 = class57.field589;
		class112.field840 = class253.field2087;
		class90.field769 = class253.field2086;
		class207.field1786 = class253.field2090;
		class291.field2374 = class253.field2088;
		class300.field2410 = new class342(this.field303, 210);
		this.method928();
		this.method947();
		class112.field838 = this.method924();
		this.method930(field285, 0);
		this.method930(field460, 1);
		class46.field561 = new class20(255, class25.field112, class25.field113, 500000);
		class50.field574 = class159.method728();
		this.method925();
		String var5 = class384.field3239;
		class128.field1073 = this;
		if (null != var5) {
			class128.field1074 = var5;
		}

		class249.method1080(class50.field574.method2218());
		class240.field2021 = new class9(class63.field619);
		this.field259 = new class19("tokenRequest", 1, 1);
	}

	@ObfInfo(
		owner = "client",
		name = "an",
		desc = "(B)V"
	)
	protected final void method941() {
		++field231;
		this.method174();

		while (true) {
			class42 var2;
			synchronized(class254.field2094) {
				var2 = (class42)class254.field2091.method645();
			}

			if (null == var2) {
				class174.method804();
				method189();
				field460.method2130();
				this.method929();
				synchronized(class466.field3857) {
					class466.field3862 = class466.field3856;
					class466.field3863 = class466.field3859;
					class466.field3858 = class466.field3860;
					class466.field3865 = class466.field3861;
					class466.field3869 = class466.field3866;
					class466.field3870 = class466.field3864;
					class466.field3867 = class466.field3873;
					class466.field3855 = class466.field3868;
					class466.field3866 = 0;
				}

				if (class112.field838 != null) {
					int var6 = class112.field838.method962();
					field327 = var6;
				}

				if (field229 == 0) {
					class71.method311();
					class74.method325();
				} else if (field229 == 5) {
					class67.method301(this, class400.field3376);
					class71.method311();
					class74.method325();
				} else if (10 != field229 && 11 != field229) {
					if (field229 == 20) {
						class67.method301(this, class400.field3376);
						this.method177((byte)-29);
					} else if (field229 == 50) {
						class67.method301(this, class400.field3376);
						this.method177((byte)8);
					} else if (field229 == 25) {
						class214.method958();
					}
				} else {
					class67.method301(this, class400.field3376);
				}

				if (30 == field229) {
					this.method178();
				} else if (field229 == 40 || field229 == 45) {
					this.method177((byte)25);
				}

				return;
			}

			var2.field522.method156(var2.field524, (int)var2.field1134, var2.field523, false);
		}
	}

	@ObfInfo(
		owner = "client",
		name = "ab",
		desc = "(ZI)V"
	)
	protected final void method942(boolean var1) {
		boolean var3 = class323.method1652();
		if (var3 && field477 && class402.field3388 != null) {
			class402.field3388.method1007();
		}

		if ((field229 == 10 || field229 == 20 || field229 == 30) && 0L != field452 && class152.method711() > field452) {
			class249.method1080(class152.method713());
		}

		int var4;
		if (var1) {
			for (var4 = 0; var4 < 100; ++var4) {
				field444[var4] = true;
			}
		}

		if (field229 == 0) {
			this.method943(class359.field3056, class359.field3057, var1);
		} else if (field229 == 5) {
			class117.method463(class114.field848, class188.field1702, class400.field3376);
		} else if (field229 != 10 && field229 != 11) {
			if (field229 == 20) {
				class117.method463(class114.field848, class188.field1702, class400.field3376);
			} else if (field229 == 50) {
				class117.method463(class114.field848, class188.field1702, class400.field3376);
			} else if (25 == field229) {
				if (1 == field371) {
					if (field314 > field468) {
						field468 = field314;
					}

					var4 = (field468 * 50 - field314 * 50) / field468;
					class492.method2436(class177.field1455 + class442.field3661 + class442.field3658 + var4 + "%" + class442.field3662, false);
				} else if (field371 == 2) {
					if (field499 > field287) {
						field287 = field499;
					}

					var4 = 50 + (field287 * 50 - field499 * 50) / field287;
					class492.method2436(class177.field1455 + class442.field3661 + class442.field3658 + var4 + "%" + class442.field3662, false);
				} else {
					class492.method2436(class177.field1455, false);
				}
			} else if (30 == field229) {
				this.method181();
			} else if (field229 == 40) {
				class492.method2436(class177.field1349 + class442.field3661 + class177.field1333, false);
			} else if (45 == field229) {
				class492.method2436(class177.field1465, false);
			}
		} else {
			class117.method463(class114.field848, class188.field1702, class400.field3376);
		}

		if (30 == field229 && 0 == field475 && !var1 && !field453) {
			for (var4 = 0; var4 < field442; ++var4) {
				if (field445[var4]) {
					class39.field199.method262(field447[var4], field448[var4], field435[var4], field247[var4]);
					field445[var4] = false;
				}
			}
		} else if (field229 > 0) {
			class39.field199.method263(0, 0);

			for (var4 = 0; var4 < field442; ++var4) {
				field445[var4] = false;
			}
		}

	}

	@ObfInfo(
		owner = "client",
		name = "al",
		desc = "(I)V"
	)
	protected final void method955() {
		if (class46.field560.method964()) {
			class46.field560.method971();
		}

		if (null != class414.field3423) {
			class414.field3423.field2010 = false;
		}

		class414.field3423 = null;
		field279.method2382();
		if (null != class466.field3857) {
			synchronized(class466.field3857) {
				class466.field3857 = null;
			}
		}

		class112.field838 = null;
		if (null != class402.field3388) {
			class402.field3388.method1008();
		}

		if (null != class288.field2367) {
			class288.field2367.method1008();
		}

		class388.method1904();
		class475.method2353();
		if (class300.field2410 != null) {
			class300.field2410.method2153();
			class300.field2410 = null;
		}

		try {
			class25.field112.method2163();

			for (int var4 = 0; var4 < class463.field3848; ++var4) {
				class25.field116[var4].method2163();
			}

			class25.field113.method2163();
			class25.field115.method2163();
		} catch (Exception var6) {
		}

		this.field259.method91();
	}

	@ObfInfo(
		owner = "client",
		name = "gz",
		desc = "(I)V"
	)
	void method174() {
		if (1000 != field229) {
			boolean var2 = class173.method802();
			if (!var2) {
				this.method175();
			}

		}
	}

	@ObfInfo(
		owner = "client",
		name = "gl",
		desc = "(I)V"
	)
	void method175() {
		if (class462.field3846 >= 4) {
			this.method959("js5crc");
			class261.method1113(1000);
		} else {
			if (class462.field3833 >= 4) {
				if (field229 <= 5) {
					this.method959("js5io");
					class261.method1113(1000);
					return;
				}

				field250 = 3000;
				class462.field3833 = 3;
			}

			if (--field250 + 1 <= 0) {
				try {
					if (field249 == 0) {
						class13.field66 = class21.field104.method1448(class182.field1677, class148.field1164);
						++field249;
					}

					if (field249 == 1) {
						if (class13.field66.field775 == 2) {
							this.method176(-1);
							return;
						}

						if (class13.field66.field775 == 1) {
							++field249;
						}
					}

					class127 var4;
					if (2 == field249) {
						Socket var3 = (Socket)class13.field66.field779;
						class48 var2 = new class48(var3, 40000, 5000);
						class166.field1254 = var2;
						var4 = new class127(5);
						var4.method544(15);
						var4.method534(210);
						class166.field1254.method731(var4.field1072, 0, 5);
						++field249;
						class229.field1939 = class152.method711();
					}

					if (field249 == 3) {
						if (class166.field1254.method732() > 0) {
							int var6 = class166.field1254.method733();
							if (var6 != 0) {
								this.method176(var6);
								return;
							}

							++field249;
						} else if (class152.method711() - class229.field1939 > 30000L) {
							this.method176(-2);
							return;
						}
					}

					if (4 == field249) {
						class160 var14 = class166.field1254;
						boolean var7 = field229 > 20;
						if (class462.field3844 != null) {
							try {
								class462.field3844.method734();
							} catch (Exception var12) {
							}

							class462.field3844 = null;
						}

						class462.field3844 = var14;
						if (null != class462.field3844) {
							try {
								var4 = new class127(4);
								var4.method544(var7 ? 2 : 3);
								var4.method602(0);
								class462.field3844.method731(var4.field1072, 0, 4);
							} catch (IOException var11) {
								try {
									class462.field3844.method734();
								} catch (Exception var10) {
								}

								++class462.field3833;
								class462.field3844 = null;
							}
						}

						class462.field3838.field1070 = 0;
						class207.field1788 = null;
						class10.field44 = null;
						class462.field3826 = 0;

						while (true) {
							class363 var15 = (class363)class462.field3831.method789();
							if (var15 == null) {
								while (true) {
									var15 = (class363)class462.field3836.method789();
									if (var15 == null) {
										if (class462.field3841 != 0) {
											try {
												var4 = new class127(4);
												var4.method544(4);
												var4.method544(class462.field3841);
												var4.method533(0);
												class462.field3844.method731(var4.field1072, 0, 4);
											} catch (IOException var9) {
												try {
													class462.field3844.method734();
												} catch (Exception var8) {
												}

												++class462.field3833;
												class462.field3844 = null;
											}
										}

										class462.field3843 = 0;
										class462.field3828 = class152.method711();
										class13.field66 = null;
										class166.field1254 = null;
										field249 = 0;
										field251 = 0;
										return;
									}

									class462.field3829.method859(var15);
									class462.field3834.method788(var15, var15.field1134);
									++class462.field3835;
									--class462.field3842;
								}
							}

							class462.field3837.method788(var15, var15.field1134);
							++class462.field3830;
							--class462.field3832;
						}
					}
				} catch (IOException var13) {
					this.method176(-3);
				}

			}
		}
	}

	@ObfInfo(
		owner = "client",
		name = "gq",
		desc = "(II)V"
	)
	void method176(int var1) {
		class13.field66 = null;
		class166.field1254 = null;
		field249 = 0;
		if (class148.field1164 == class57.field589) {
			class148.field1164 = class15.field72;
		} else {
			class148.field1164 = class57.field589;
		}

		++field251;
		if (field251 < 2 || var1 != 7 && var1 != 9) {
			if (field251 >= 2 && var1 == 6) {
				this.method959("js5connect_outofdate");
				class261.method1113(1000);
			} else if (field251 >= 4) {
				if (field229 <= 5) {
					this.method959("js5connect");
					class261.method1113(1000);
				} else {
					field250 = 3000;
				}
			}
		} else if (field229 <= 5) {
			this.method959("js5connect_full");
			class261.method1113(1000);
		} else {
			field250 = 3000;
		}

	}

	@ObfInfo(
		owner = "client",
		name = "gm",
		desc = "(B)V"
	)
	final void method177(byte var1) {
		Object var2 = field279.method2384();
		class6 var3 = field279.field4043;

		try {
			if (0 == field220) {
				if (var1 == -1) {
					throw new IllegalStateException();
				}

				if (class189.field1708 == null) {
					label1021: {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						if (!field269.method291()) {
							if (var1 == -1) {
								return;
							}

							if (field361 <= 250) {
								break label1021;
							}
						}

						class189.field1708 = field269.method292();
						field269.method290();
						field269 = null;
					}
				}

				if (null != class189.field1708) {
					if (var1 == -1) {
						return;
					}

					if (var2 != null) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						((class160)var2).method734();
						var2 = null;
					}

					class3.field21 = null;
					field281 = false;
					field361 = 0;
					if (field353.method963()) {
						try {
							this.method191(class236.field2005);
							class323.method1654(21);
						} catch (Throwable var26) {
							class445.method2199((String)null, var26);
							class128.method611(65);
							return;
						}
					} else {
						class323.method1654(1);
					}
				}
			}

			class32 var29;
			if (21 == field220) {
				if (this.field336 != null) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					if (!this.field336.isDone()) {
						return;
					}

					if (this.field336.isCancelled()) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						class128.method611(65);
						this.field336 = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse)this.field336.get();
						if (!var4.isSuccess()) {
							if (var1 == -1) {
								throw new IllegalStateException();
							}

							class128.method611(65);
							this.field336 = null;
							return;
						}

						class114.field849 = var4.getAccessToken();
						class236.field2005 = var4.getRefreshToken();
						this.field336 = null;
					} catch (Exception var25) {
						class445.method2199((String)null, var25);
						class128.method611(65);
						this.field336 = null;
						return;
					}
				} else {
					if (this.field367 == null) {
						class128.method611(65);
						return;
					}

					if (var1 == -1) {
						return;
					}

					if (!this.field367.method16()) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						return;
					}

					if (this.field367.method17()) {
						if (var1 == -1) {
							return;
						}

						class445.method2199(this.field367.method15(), (Throwable)null);
						class128.method611(65);
						this.field367 = null;
						return;
					}

					var29 = this.field367.method18();
					if (var29.method138() != 200) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						class128.method611(65);
						this.field367 = null;
						return;
					}

					field361 = 0;
					class126 var5 = new class126(var29.method139());

					try {
						class114.field849 = var5.method528().getString("access_token");
						class236.field2005 = var5.method528().getString("refresh_token");
					} catch (Exception var24) {
						class445.method2199("Error parsing tokens", var24);
						class128.method611(65);
						this.field367 = null;
						return;
					}
				}

				this.method171(class114.field849);
				class323.method1654(20);
			}

			if (field220 == 20) {
				if (var1 == -1) {
					throw new IllegalStateException();
				}

				if (this.field262 != null) {
					if (!this.field262.isDone()) {
						if (var1 == -1) {
							return;
						}

						return;
					}

					if (this.field262.isCancelled()) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						class128.method611(65);
						this.field262 = null;
						return;
					}

					try {
						OtlTokenResponse var30 = (OtlTokenResponse)this.field262.get();
						if (!var30.isSuccess()) {
							if (var1 == -1) {
								return;
							}

							class128.method611(65);
							this.field262 = null;
							return;
						}

						this.field494 = var30.getToken();
						this.field262 = null;
					} catch (Exception var23) {
						class445.method2199((String)null, var23);
						class128.method611(65);
						this.field262 = null;
						return;
					}
				} else {
					if (null == this.field260) {
						class128.method611(65);
						return;
					}

					if (var1 == -1) {
						throw new IllegalStateException();
					}

					if (!this.field260.method16()) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						return;
					}

					if (this.field260.method17()) {
						if (var1 == -1) {
							return;
						}

						class445.method2199(this.field260.method15(), (Throwable)null);
						class128.method611(65);
						this.field260 = null;
						return;
					}

					var29 = this.field260.method18();
					if (var29.method138() != 200) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						class445.method2199("Response code: " + var29.method138() + "Response body: " + var29.method139(), (Throwable)null);
						class128.method611(65);
						this.field260 = null;
						return;
					}

					this.field494 = var29.method139();
					this.field260 = null;
				}

				field361 = 0;
				class323.method1654(1);
			}

			if (field220 == 1) {
				if (var1 == -1) {
					return;
				}

				if (null == class3.field21) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					class3.field21 = class21.field104.method1448(class182.field1677, class148.field1164);
				}

				if (class3.field21.field775 == 2) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					throw new IOException();
				}

				if (class3.field21.field775 == 1) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					Socket var31 = (Socket)class3.field21.field779;
					class48 var32 = new class48(var31, 40000, 5000);
					var2 = var32;
					field279.method2381(var32);
					class3.field21 = null;
					class323.method1654(2);
				}
			}

			class299 var33;
			if (2 == field220) {
				field279.method2380();
				var33 = class342.method1739();
				var33.field2405 = null;
				var33.field2400 = 0;
				var33.field2403 = new class6(5000);
				var33.field2403.method544(class41.field208.field214);
				field279.method2389(var33);
				field279.method2386();
				var3.field1070 = 0;
				class323.method1654(3);
			}

			int var16;
			if (field220 == 3) {
				if (var1 == -1) {
					return;
				}

				if (class402.field3388 != null) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					class402.field3388.method1017();
				}

				if (null != class288.field2367) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					class288.field2367.method1017();
				}

				if (((class160)var2).method735(1)) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					var16 = ((class160)var2).method733();
					if (null != class402.field3388) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						class402.field3388.method1017();
					}

					if (class288.field2367 != null) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						class288.field2367.method1017();
					}

					if (var16 != 0) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						class128.method611(var16);
						return;
					}

					var3.field1070 = 0;
					class323.method1654(4);
				}
			}

			if (field220 == 4) {
				if (var1 == -1) {
					throw new IllegalStateException();
				}

				if (var3.field1070 < 8) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					var16 = ((class160)var2).method732();
					if (var16 > 8 - var3.field1070) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						var16 = 8 - var3.field1070;
					}

					if (var16 > 0) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						((class160)var2).method730(var3.field1072, var3.field1070, var16);
						var3.field1070 += var16;
					}
				}

				if (8 == var3.field1070) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					var3.field1070 = 0;
					class1.field6 = var3.method598();
					class323.method1654(5);
				}
			}

			if (field220 == 5) {
				if (var1 == -1) {
					throw new IllegalStateException();
				}

				field279.field4043.field1070 = 0;
				field279.method2380();
				class6 var34 = new class6(500);
				int[] var35 = new int[]{class189.field1708.nextInt(), class189.field1708.nextInt(), class189.field1708.nextInt(), class189.field1708.nextInt()};
				var34.field1070 = 0;
				var34.method544(1);
				var34.method534(var35[0]);
				var34.method534(var35[1]);
				var34.method534(var35[2]);
				var34.method534(var35[3]);
				var34.method536(class1.field6);
				if (40 == field229) {
					var34.method534(class413.field3421[0]);
					var34.method534(class413.field3421[1]);
					var34.method534(class413.field3421[2]);
					var34.method534(class413.field3421[3]);
				} else {
					if (50 == field229) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						var34.method544(class445.field3675.method330());
						var34.method534(class74.field659);
					} else {
						var34.method544(field253.method330());
						switch(field253.field3674) {
						case 0:
							var34.field1070 += 4;
						case 1:
						default:
							break;
						case 2:
							var34.method534(class50.field574.method2221(class359.field3071));
							break;
						case 3:
						case 4:
							var34.method602(class398.field3358);
							++var34.field1070;
						}
					}

					if (field353.method963()) {
						if (var1 == -1) {
							return;
						}

						var34.method544(class218.field1887.method330());
						var34.method538(this.field494, (byte)16);
					} else {
						var34.method544(class218.field1894.method330());
						var34.method538(class359.field3067, (byte)13);
					}
				}

				var34.method563(class329.field2599, class329.field2597);
				class413.field3421 = var35;
				class299 var7 = class342.method1739();
				var7.field2405 = null;
				var7.field2400 = 0;
				var7.field2403 = new class6(5000);
				var7.field2403.field1070 = 0;
				if (40 == field229) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					var7.field2403.method544(class41.field211.field214);
				} else {
					var7.field2403.method544(class41.field209.field214);
				}

				var7.field2403.method533(0);
				int var8 = var7.field2403.field1070;
				var7.field2403.method534(210);
				var7.field2403.method534(1);
				var7.field2403.method544(field315);
				var7.field2403.method544(field411);
				byte var9 = 0;
				var7.field2403.method544(var9);
				var7.field2403.method540(var34.field1072, 0, var34.field1070);
				int var10 = var7.field2403.field1070;
				var7.field2403.method538(class359.field3071, (byte)124);
				class6 var10000 = var7.field2403;
				byte var10001;
				if (field453) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					var10001 = 1;
				} else {
					var10001 = 0;
				}

				int var46 = var10001 << 1;
				byte var10002;
				if (field274) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					var10002 = 1;
				} else {
					var10002 = 0;
				}

				var10000.method544(var46 | var10002);
				var7.field2403.method533(class427.field3529);
				var7.field2403.method533(class476.field4003);
				class6 var11 = var7.field2403;
				int var14;
				if (field273 != null) {
					if (var1 == -1) {
						return;
					}

					var11.method540(field273, 0, field273.length);
				} else {
					byte[] var13 = new byte[24];

					try {
						class25.field115.method2164(0L);
						class25.field115.method2159(var13);

						for (var14 = 0; var14 < 24; ++var14) {
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
					} catch (Exception var27) {
						for (int var15 = 0; var15 < 24; ++var15) {
							if (var1 == -1) {
								throw new IllegalStateException();
							}

							var13[var15] = -1;
						}
					}

					var11.method540(var13, 0, var13.length);
				}

				var7.field2403.method538(class467.field3879, (byte)19);
				var7.field2403.method534(class173.field1290);
				class127 var12 = new class127(class372.field3166.method1813());
				class372.field3166.method1812(var12);
				var7.field2403.method540(var12.field1072, 0, var12.field1072.length);
				var7.field2403.method544(field315);
				var7.field2403.method534(0);
				var7.field2403.method534(class313.field2473.field2306);
				var7.field2403.method580(class329.field2596.field2306);
				var7.field2403.method580(class1.field7.field2306);
				var7.field2403.method579(class306.field2456.field2306);
				var7.field2403.method580(class85.field702.field2306);
				var7.field2403.method579(class473.field3989.field2306);
				var7.field2403.method580(0);
				var7.field2403.method581(class446.field3678.field2306);
				var7.field2403.method579(class317.field2494.field2306);
				var7.field2403.method534(class471.field3963.field2306);
				var7.field2403.method580(class96.field782.field2306);
				var7.field2403.method534(class298.field2397.field2306);
				var7.field2403.method581(class16.field82.field2306);
				var7.field2403.method534(class374.field3179.field2306);
				var7.field2403.method534(class460.field3809.field2306);
				var7.field2403.method581(class46.field549.field2306);
				var7.field2403.method534(class32.field176.field2306);
				var7.field2403.method579(class49.field570.field2306);
				var7.field2403.method579(class440.field3648.field2306);
				var7.field2403.method534(class303.field2437.field2306);
				var7.field2403.method581(class431.field3575.field2306);
				var7.field2403.method600(var35, var10, var7.field2403.field1070);
				var7.field2403.method543(var7.field2403.field1070 - var8);
				field279.method2389(var7);
				field279.method2386();
				field279.field4042 = new class205(var35);
				int[] var42 = new int[4];

				for (var14 = 0; var14 < 4; ++var14) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					var42[var14] = 50 + var35[var14];
				}

				var3.method29(var42);
				class323.method1654(6);
			}

			int var18;
			boolean var45;
			if (6 == field220) {
				if (var1 == -1) {
					throw new IllegalStateException();
				}

				if (((class160)var2).method732() > 0) {
					label1029: {
						var16 = ((class160)var2).method733();
						if (var16 == 61) {
							if (var1 == -1) {
								throw new IllegalStateException();
							}

							label922: {
								var18 = ((class160)var2).method732();
								if (var18 == 1) {
									if (var1 == -1) {
										return;
									}

									if (((class160)var2).method733() == 1) {
										var45 = true;
										break label922;
									}
								}

								var45 = false;
							}

							class113.field842 = var45;
							class323.method1654(5);
						}

						if (var16 == 21) {
							if (var1 == -1) {
								throw new IllegalStateException();
							}

							if (20 == field229) {
								if (var1 == -1) {
									return;
								}

								class323.method1654(12);
								break label1029;
							}
						}

						if (var16 == 2) {
							if (var1 == -1) {
								throw new IllegalStateException();
							}

							class323.method1654(14);
						} else {
							label908: {
								if (var16 == 15) {
									if (var1 == -1) {
										throw new IllegalStateException();
									}

									if (40 == field229) {
										if (var1 == -1) {
											throw new IllegalStateException();
										}

										field279.field4047 = -1;
										class323.method1654(19);
										break label908;
									}
								}

								if (var16 == 64) {
									if (var1 == -1) {
										return;
									}

									class323.method1654(10);
								} else {
									label902: {
										if (var16 == 23) {
											if (var1 == -1) {
												throw new IllegalStateException();
											}

											if (field254 < 1) {
												if (var1 == -1) {
													return;
												}

												++field254;
												class323.method1654(0);
												break label902;
											}
										}

										if (var16 == 29) {
											if (var1 == -1) {
												throw new IllegalStateException();
											}

											class323.method1654(17);
										} else {
											if (var16 != 69) {
												class128.method611(var16);
												return;
											}

											if (var1 == -1) {
												throw new IllegalStateException();
											}

											class323.method1654(7);
										}
									}
								}
							}
						}
					}
				}
			}

			if (7 == field220) {
				if (var1 == -1) {
					throw new IllegalStateException();
				}

				if (((class160)var2).method732() >= 2) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					((class160)var2).method730(var3.field1072, 0, 2);
					var3.field1070 = 0;
					class288.field2368 = var3.method549();
					class323.method1654(8);
				}
			}

			if (field220 == 8) {
				if (var1 == -1) {
					throw new IllegalStateException();
				}

				if (((class160)var2).method732() >= class288.field2368) {
					var3.field1070 = 0;
					((class160)var2).method730(var3.field1072, var3.field1070, class288.field2368);
					class403 var36 = class150.method700()[var3.method547()];

					try {
						class269 var37 = class462.method2273(var36);
						this.field286 = new class472(var3, var37);
						class323.method1654(9);
					} catch (Exception var22) {
						class128.method611(22);
						return;
					}
				}
			}

			if (9 == field220) {
				if (var1 == -1) {
					throw new IllegalStateException();
				}

				if (this.field286.method2337()) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					this.field270 = this.field286.method2336();
					this.field286.method2333();
					this.field286 = null;
					if (this.field270 == null) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						class128.method611(22);
						return;
					}

					field279.method2380();
					var33 = class342.method1739();
					var33.field2405 = null;
					var33.field2400 = 0;
					var33.field2403 = new class6(5000);
					var33.field2403.method544(class41.field212.field214);
					var33.field2403.method533(this.field270.field1070);
					var33.field2403.method541(this.field270);
					field279.method2389(var33);
					field279.method2386();
					this.field270 = null;
					class323.method1654(6);
				}
			}

			if (field220 == 10) {
				if (var1 == -1) {
					throw new IllegalStateException();
				}

				if (((class160)var2).method732() > 0) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					class251.field2068 = ((class160)var2).method733();
					class323.method1654(11);
				}
			}

			if (11 == field220) {
				if (var1 == -1) {
					throw new IllegalStateException();
				}

				if (((class160)var2).method732() >= class251.field2068) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					((class160)var2).method730(var3.field1072, 0, class251.field2068);
					var3.field1070 = 0;
					class323.method1654(6);
				}
			}

			if (field220 == 12) {
				if (var1 == -1) {
					throw new IllegalStateException();
				}

				if (((class160)var2).method732() > 0) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					field240 = (((class160)var2).method733() + 3) * 60;
					class323.method1654(13);
				}
			}

			if (13 == field220) {
				if (var1 == -1) {
					throw new IllegalStateException();
				} else {
					field361 = 0;
					class300.method1452(class177.field1365, class177.field1366, field240 / 60 + class177.field1423);
					if (--field240 <= 0) {
						if (var1 == -1) {
							return;
						}

						class323.method1654(0);
					}

				}
			} else {
				if (14 == field220) {
					if (var1 == -1) {
						throw new IllegalStateException();
					}

					if (((class160)var2).method732() >= 1) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						class14.field70 = ((class160)var2).method733();
						class323.method1654(15);
					}
				}

				if (field220 == 15) {
					if (var1 == -1) {
						return;
					}

					if (((class160)var2).method732() >= class14.field70) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						if (((class160)var2).method733() == 1) {
							if (var1 == -1) {
								throw new IllegalStateException();
							}

							var45 = true;
						} else {
							var45 = false;
						}

						boolean var43 = var45;
						((class160)var2).method730(var3.field1072, 0, 4);
						var3.field1070 = 0;
						boolean var44 = false;
						if (var43) {
							if (var1 == -1) {
								throw new IllegalStateException();
							}

							var18 = var3.method30() << 24;
							var18 |= var3.method30() << 16;
							var18 |= var3.method30() << 8;
							var18 |= var3.method30();
							class50.field574.method2219(class359.field3071, var18);
						}

						if (field268) {
							if (var1 == -1) {
								return;
							}

							class50.field574.method2214(class359.field3071);
						} else {
							class50.field574.method2214((String)null);
						}

						class438.method2174();
						field481 = ((class160)var2).method733();
						if (((class160)var2).method733() == 1) {
							if (var1 == -1) {
								throw new IllegalStateException();
							}

							var45 = true;
						} else {
							var45 = false;
						}

						field441 = var45;
						field348 = ((class160)var2).method733();
						field348 <<= 8;
						field348 += ((class160)var2).method733();
						field405 = ((class160)var2).method733();
						((class160)var2).method730(var3.field1072, 0, 8);
						var3.field1070 = 0;
						this.field272 = var3.method598();
						if (class14.field70 >= 29) {
							if (var1 == -1) {
								throw new IllegalStateException();
							}

							((class160)var2).method730(var3.field1072, 0, 8);
							var3.field1070 = 0;
							field350 = var3.method598();
						}

						((class160)var2).method730(var3.field1072, 0, 1);
						var3.field1070 = 0;
						class346[] var6 = class236.method1030();
						int var19 = var3.method36();
						if (var19 < 0) {
							throw new IOException(var19 + " " + var3.field1070);
						}

						if (var1 == -1) {
							throw new IllegalStateException();
						}

						if (var19 >= var6.length) {
							if (var1 == -1) {
								throw new IllegalStateException();
							}

							throw new IOException(var19 + " " + var3.field1070);
						}

						field279.field4044 = var6[var19];
						field279.field4047 = field279.field4044.field2798;
						((class160)var2).method730(var3.field1072, 0, 2);
						var3.field1070 = 0;
						field279.field4047 = var3.method549();

						try {
							class273.method1339(class309.field2461, "zap");
						} catch (Throwable var21) {
						}

						class323.method1654(16);
					}
				}

				if (field220 == 16) {
					if (var1 == -1) {
						throw new IllegalStateException();
					} else {
						if (((class160)var2).method732() >= field279.field4047) {
							if (var1 == -1) {
								return;
							}

							var3.field1070 = 0;
							((class160)var2).method730(var3.field1072, 0, field279.field4047);
							field225.method1691();
							class252.method1092();
							class247.method1077(var3);
							class391.field3279 = -1;
							class415.method2013(false, var3);
							field279.field4044 = null;
						}

					}
				} else {
					if (17 == field220 && ((class160)var2).method732() >= 2) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						var3.field1070 = 0;
						((class160)var2).method730(var3.field1072, 0, 2);
						var3.field1070 = 0;
						class113.field845 = var3.method549();
						class323.method1654(18);
					}

					if (18 == field220 && ((class160)var2).method732() >= class113.field845) {
						if (var1 == -1) {
							return;
						}

						var3.field1070 = 0;
						((class160)var2).method730(var3.field1072, 0, class113.field845);
						var3.field1070 = 0;
						String var38 = var3.method555();
						String var41 = var3.method555();
						String var39 = var3.method555();
						class300.method1452(var38, var41, var39);
						class261.method1113(10);
						if (field353.method963()) {
							if (var1 == -1) {
								return;
							}

							class286.method1419(9);
						}
					}

					if (19 == field220) {
						if (var1 == -1) {
							throw new IllegalStateException();
						} else {
							if (-1 == field279.field4047) {
								if (var1 == -1) {
									return;
								}

								if (((class160)var2).method732() < 2) {
									if (var1 == -1) {
										throw new IllegalStateException();
									}

									return;
								}

								((class160)var2).method730(var3.field1072, 0, 2);
								var3.field1070 = 0;
								field279.field4047 = var3.method549();
							}

							if (((class160)var2).method732() >= field279.field4047) {
								((class160)var2).method730(var3.field1072, 0, field279.field4047);
								var3.field1070 = 0;
								var16 = field279.field4047;
								field225.method1688();
								field279.method2380();
								field279.field4043.field1070 = 0;
								field279.field4044 = null;
								field279.field4049 = null;
								field279.field4050 = null;
								field279.field4051 = null;
								field279.field4047 = 0;
								field279.field4040 = 0;
								field237 = 0;
								class212.method915();
								field296 = 0;
								field473 = 0;

								for (var18 = 0; var18 < 2048; ++var18) {
									if (var1 == -1) {
										throw new IllegalStateException();
									}

									field347[var18] = null;
								}

								class113.field846 = null;

								for (var18 = 0; var18 < field465.length; ++var18) {
									if (var1 == -1) {
										throw new IllegalStateException();
									}

									class267 var40 = field465[var18];
									if (null != var40) {
										var40.field2641 = -1;
										var40.field2642 = false;
									}
								}

								class128.method606();
								class261.method1113(30);

								for (var18 = 0; var18 < 100; ++var18) {
									if (var1 == -1) {
										throw new IllegalStateException();
									}

									field444[var18] = true;
								}

								var33 = class480.method2370(class356.field2940, field279.field4042);
								var33.field2403.method544(class152.method713());
								var33.field2403.method533(class427.field3529);
								var33.field2403.method533(class476.field4003);
								field279.method2389(var33);
								class247.method1077(var3);
								if (var3.field1070 != var16) {
									if (var1 == -1) {
										throw new IllegalStateException();
									} else {
										throw new RuntimeException();
									}
								}
							}
						}
					} else {
						++field361;
						if (field361 > 2000) {
							if (var1 == -1) {
								throw new IllegalStateException();
							} else if (field254 < 1) {
								if (var1 == -1) {
									throw new IllegalStateException();
								} else {
									if (class57.field589 == class148.field1164) {
										if (var1 == -1) {
											throw new IllegalStateException();
										}

										class148.field1164 = class15.field72;
									} else {
										class148.field1164 = class57.field589;
									}

									++field254;
									class323.method1654(0);
								}
							} else {
								class128.method611(-3);
							}
						}
					}
				}
			}
		} catch (IOException var28) {
			if (field254 < 1) {
				if (var1 == -1) {
					throw new IllegalStateException();
				} else {
					if (class148.field1164 == class57.field589) {
						if (var1 == -1) {
							throw new IllegalStateException();
						}

						class148.field1164 = class15.field72;
					} else {
						class148.field1164 = class57.field589;
					}

					++field254;
					class323.method1654(0);
				}
			} else {
				class128.method611(-2);
			}
		}
	}

	@ObfInfo(
		owner = "client",
		name = "gg",
		desc = "(I)V"
	)
	final void method178() {
		if (field237 > 1) {
			--field237;
		}

		if (field280 > 0) {
			--field280;
		}

		if (field281) {
			field281 = false;
			class149.method698();
		} else {
			if (!field368) {
				class17.method86();
			}

			int var2;
			for (var2 = 0; var2 < 100 && this.method193(field279); ++var2) {
			}

			if (field229 == 30) {
				while (true) {
					class408 var3 = (class408)class323.field2565.method1941();
					boolean var30;
					if (null == var3) {
						var30 = false;
					} else {
						var30 = true;
					}

					int var4;
					class299 var31;
					if (!var30) {
						class299 var15;
						int var16;
						if (field225.field2693) {
							var15 = class480.method2370(class356.field3026, field279.field4042);
							var15.field2403.method544(0);
							var16 = var15.field2403.field1070;
							field225.method1693(var15.field2403);
							var15.field2403.method586(var15.field2403.field1070 - var16);
							field279.method2389(var15);
							field225.method1692();
						}

						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						int var12;
						synchronized(class414.field3423.field2009) {
							if (!field387) {
								class414.field3423.field2015 = 0;
							} else if (class466.field3869 != 0 || class414.field3423.field2015 >= 40) {
								var31 = null;
								var4 = 0;
								var5 = 0;
								var6 = 0;
								var7 = 0;

								for (var8 = 0; var8 < class414.field3423.field2015 && (var31 == null || var31.field2403.field1070 - var4 < 246); ++var8) {
									var5 = var8;
									var9 = class414.field3423.field2012[var8];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									var10 = class414.field3423.field2011[var8];
									if (var10 < -1) {
										var10 = -1;
									} else if (var10 > 65534) {
										var10 = 65534;
									}

									if (field233 != var10 || var9 != field265) {
										if (null == var31) {
											var31 = class480.method2370(class356.field3004, field279.field4042);
											var31.field2403.method544(0);
											var4 = var31.field2403.field1070;
											class6 var10000 = var31.field2403;
											var10000.field1070 += 2;
											var6 = 0;
											var7 = 0;
										}

										int var13;
										if (field235 != -1L) {
											var11 = var10 - field233;
											var12 = var9 - field265;
											var13 = (int)((class414.field3423.field2013[var8] - field235) / 20L);
											var6 = (int)((long)var6 + (class414.field3423.field2013[var8] - field235) % 20L);
										} else {
											var11 = var10;
											var12 = var9;
											var13 = Integer.MAX_VALUE;
										}

										field233 = var10;
										field265 = var9;
										if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
											var11 += 32;
											var12 += 32;
											var31.field2403.method533(var12 + (var13 << 12) + (var11 << 6));
										} else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
											var11 += 128;
											var12 += 128;
											var31.field2403.method544(var13 + 128);
											var31.field2403.method533((var11 << 8) + var12);
										} else if (var13 < 32) {
											var31.field2403.method544(var13 + 192);
											if (var10 != -1 && var9 != -1) {
												var31.field2403.method534(var10 | var9 << 16);
											} else {
												var31.field2403.method534(Integer.MIN_VALUE);
											}
										} else {
											var31.field2403.method533((var13 & 8191) + 57344);
											if (var10 != -1 && var9 != -1) {
												var31.field2403.method534(var10 | var9 << 16);
											} else {
												var31.field2403.method534(Integer.MIN_VALUE);
											}
										}

										++var7;
										field235 = class414.field3423.field2013[var8];
									}
								}

								if (var31 != null) {
									var31.field2403.method586(var31.field2403.field1070 - var4);
									var8 = var31.field2403.field1070;
									var31.field2403.field1070 = var4;
									var31.field2403.method544(var6 / var7);
									var31.field2403.method544(var6 % var7);
									var31.field2403.field1070 = var8;
									field279.method2389(var31);
								}

								if (var5 >= class414.field3423.field2015) {
									class414.field3423.field2015 = 0;
								} else {
									class238 var50 = class414.field3423;
									var50.field2015 -= var5;
									System.arraycopy(class414.field3423.field2011, var5, class414.field3423.field2011, 0, class414.field3423.field2015);
									System.arraycopy(class414.field3423.field2012, var5, class414.field3423.field2012, 0, class414.field3423.field2015);
									System.arraycopy(class414.field3423.field2013, var5, class414.field3423.field2013, 0, class414.field3423.field2015);
								}
							}
						}

						class299 var19;
						if (class466.field3869 == 1 || !class151.field1180 && class466.field3869 == 4 || 2 == class466.field3869) {
							long var17 = class466.field3855 - field451;
							if (var17 > 32767L) {
								var17 = 32767L;
							}

							field451 = class466.field3855;
							var4 = class466.field3867;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class476.field4003) {
								var4 = class476.field4003;
							}

							var5 = class466.field3870;
							if (var5 < 0) {
								var5 = 0;
							} else if (var5 > class427.field3529) {
								var5 = class427.field3529;
							}

							var6 = (int)var17;
							var19 = class480.method2370(class356.field2997, field279.field4042);
							var19.field2403.method533((2 == class466.field3869 ? 1 : 0) + (var6 << 1));
							var19.field2403.method533(var5);
							var19.field2403.method533(var4);
							field279.method2389(var19);
						}

						if (field460.field3588 > 0) {
							var15 = class480.method2370(class356.field2931, field279.field4042);
							var15.field2403.method533(0);
							var16 = var15.field2403.field1070;
							long var20 = class152.method711();

							for (var6 = 0; var6 < field460.field3588; ++var6) {
								long var22 = var20 - field392;
								if (var22 > 16777215L) {
									var22 = 16777215L;
								}

								field392 = var20;
								var15.field2403.method602((int)var22);
								var15.field2403.method544(field460.field3585[var6]);
							}

							var15.field2403.method543(var15.field2403.field1070 - var16);
							field279.method2389(var15);
						}

						if (field520 > 0) {
							--field520;
						}

						if (field460.method2132(96) || field460.method2132(97) || field460.method2132(98) || field460.method2132(99)) {
							field316 = true;
						}

						if (field316 && field520 <= 0) {
							field520 = 20;
							field316 = false;
							var15 = class480.method2370(class356.field3032, field279.field4042);
							var15.field2403.method533(field301);
							var15.field2403.method533(field300);
							field279.method2389(var15);
						}

						if (class6.field30 && !field298) {
							field298 = true;
							var15 = class480.method2370(class356.field3018, field279.field4042);
							var15.field2403.method544(1);
							field279.method2389(var15);
						}

						if (!class6.field30 && field298) {
							field298 = false;
							var15 = class480.method2370(class356.field3018, field279.field4042);
							var15.field2403.method544(0);
							field279.method2389(var15);
						}

						if (class164.field1249 != null) {
							class164.field1249.method1280();
						}

						if (class228.field1932) {
							if (class228.field1933 != null) {
								class228.field1933.method1487();
							}

							class378.method1861();
							class228.field1932 = false;
						}

						class74.method324();
						class411.method2010();
						if (30 != field229) {
							return;
						}

						for (class138 var36 = (class138)field450.method646(); var36 != null; var36 = (class138)field450.method648()) {
							if (var36.field1130 > 0) {
								--var36.field1130;
							}

							if (var36.field1130 == 0) {
								if (var36.field1121 >= 0) {
									var4 = var36.field1121;
									var5 = var36.field1124;
									class87 var24 = class85.method356(var4);
									if (var5 == 11) {
										var5 = 10;
									}

									if (var5 >= 5 && var5 <= 8) {
										var5 = 4;
									}

									boolean var37 = var24.method364(var5);
									if (!var37) {
										continue;
									}
								}

								class309.method1498(var36.field1122, var36.field1128, var36.field1118, var36.field1129, var36.field1121, var36.field1131, var36.field1124);
								var36.method637();
							} else {
								if (var36.field1120 > 0) {
									--var36.field1120;
								}

								if (0 == var36.field1120 && var36.field1118 >= 1 && var36.field1129 >= 1 && var36.field1118 <= 102 && var36.field1129 <= 102 && (var36.field1125 < 0 || class38.method158(var36.field1125, var36.field1127))) {
									class309.method1498(var36.field1122, var36.field1128, var36.field1118, var36.field1129, var36.field1125, var36.field1126, var36.field1127);
									var36.field1120 = -1;
									if (var36.field1121 == var36.field1125 && var36.field1121 == -1) {
										var36.method637();
									} else if (var36.field1125 == var36.field1121 && var36.field1126 == var36.field1131 && var36.field1124 == var36.field1127) {
										var36.method637();
									}
								}
							}
						}

						class357.method1786();
						++field279.field4040;
						if (field279.field4040 > 750) {
							class149.method698();
							return;
						}

						class473.method2349();

						for (var2 = 0; var2 < field275; ++var2) {
							var16 = field431[var2];
							class267 var25 = field465[var16];
							if (null != var25) {
								class340.method1707(var25, var25.field2213.field3470);
							}
						}

						int[] var38 = class268.field2220;

						for (var16 = 0; var16 < class268.field2221; ++var16) {
							class380 var42 = field347[var38[var16]];
							if (null != var42 && var42.field2678 > 0) {
								--var42.field2678;
								if (0 == var42.field2678) {
									var42.field2628 = null;
								}
							}
						}

						for (var16 = 0; var16 < field275; ++var16) {
							var4 = field431[var16];
							class267 var26 = field465[var4];
							if (null != var26 && var26.field2678 > 0) {
								--var26.field2678;
								if (0 == var26.field2678) {
									var26.field2628 = null;
								}
							}
						}

						++field276;
						if (0 != field335) {
							field313 += 20;
							if (field313 >= 400) {
								field335 = 0;
							}
						}

						if (class101.field800 != null) {
							++field337;
							if (field337 >= 15) {
								class184.method836(class101.field800);
								class101.field800 = null;
							}
						}

						class120 var39 = class393.field3284;
						class120 var32 = class219.field1895;
						class393.field3284 = null;
						class219.field1895 = null;
						field410 = null;
						field414 = false;
						field458 = false;
						field423 = 0;

						while (field460.method2136() && field423 < 128) {
							if (field481 >= 2 && field460.method2132(82) && 66 == field460.field3590) {
								String var44 = class397.method1960();
								class309.field2461.method926(var44);
							} else if (1 != field306 || field460.field3577 <= 0) {
								field464[field423] = field460.field3590;
								field487[field423] = field460.field3577;
								++field423;
							}
						}

						if (class300.method1451() && field460.method2132(82) && field460.method2132(81) && field327 != 0) {
							var4 = class113.field846.field3214 - field327;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != class113.field846.field3214) {
								var5 = class113.field846.field2633[0] + class312.field2465;
								var6 = class113.field846.field2681[0] + class325.field2575;
								var19 = class480.method2370(class356.field3003, field279.field4042);
								var19.field2403.method584(var6);
								var19.field2403.method566(var4);
								var19.field2403.method572(var5);
								var19.field2403.method581(0);
								field279.method2389(var19);
							}

							field327 = 0;
						}

						if (1 == class466.field3869) {
							field285.method456();
						}

						if (-1 != field393) {
							class56.method267(field393, 0, 0, class427.field3529, class476.field4003, 0, 0);
						}

						++field418;

						while (true) {
							class120 var41;
							class488 var45;
							class120 var46;
							do {
								var45 = (class488)field438.method645();
								if (var45 == null) {
									while (true) {
										do {
											var45 = (class488)field439.method645();
											if (null == var45) {
												while (true) {
													do {
														var45 = (class488)field295.method645();
														if (var45 == null) {
															while (true) {
																while (true) {
																	class299 var27;
																	class70 var47;
																	do {
																		do {
																			do {
																				var47 = (class70)field440.method645();
																				if (null == var47) {
																					this.method190();
																					if (null != class164.field1249) {
																						class164.field1249.method1289(class347.field2878, (class113.field846.field2672 >> 7) + class312.field2465, class325.field2575 + (class113.field846.field2608 >> 7), false);
																						class164.field1249.method1300();
																					}

																					if (null != field406) {
																						this.method185();
																					}

																					if (null != class321.field2562) {
																						class184.method836(class321.field2562);
																						++field344;
																						if (0 == class466.field3862) {
																							if (field343) {
																								if (class321.field2562 == class167.field1257 && field511 != field331) {
																									class120 var48 = class321.field2562;
																									byte var35 = 0;
																									if (field398 == 1 && var48.field993 == 206) {
																										var35 = 1;
																									}

																									if (var48.field887[field511] <= 0) {
																										var35 = 0;
																									}

																									var7 = class203.method892(var48);
																									boolean var34 = (var7 >> 29 & 1) != 0;
																									if (var34) {
																										var8 = field331;
																										var9 = field511;
																										var48.field887[var9] = var48.field887[var8];
																										var48.field931[var9] = var48.field931[var8];
																										var48.field887[var8] = -1;
																										var48.field931[var8] = 0;
																									} else if (var35 == 1) {
																										var8 = field331;
																										var9 = field511;

																										while (var8 != var9) {
																											if (var8 > var9) {
																												var48.method499(var8 - 1, var8);
																												--var8;
																											} else if (var8 < var9) {
																												var48.method499(var8 + 1, var8);
																												++var8;
																											}
																										}
																									} else {
																										var48.method499(field511, field331);
																									}

																									var27 = class480.method2370(class356.field2941, field279.field4042);
																									var27.field2403.method581(class321.field2562.field985);
																									var27.field2403.method584(field331);
																									var27.field2403.method533(field511);
																									var27.field2403.method568(var35);
																									field279.method2389(var27);
																								}
																							} else if (this.method182()) {
																								this.method183(field340, field341);
																							} else if (field369 > 0) {
																								class221.method981(field340, field341);
																							}

																							field337 = 10;
																							class466.field3869 = 0;
																							class321.field2562 = null;
																						} else if (field344 >= 5 && (class466.field3863 > field340 + 5 || class466.field3863 < field340 - 5 || class466.field3858 > 5 + field341 || class466.field3858 < field341 - 5)) {
																							field343 = true;
																						}
																					}

																					if (class318.method1587()) {
																						var4 = class318.field2526;
																						var5 = class318.field2529;
																						class299 var43 = class480.method2370(class356.field2966, field279.field4042);
																						var43.field2403.method544(5);
																						var43.field2403.method568(field460.method2132(82) ? (field460.method2132(81) ? 2 : 1) : 0);
																						var43.field2403.method584(class312.field2465 + var4);
																						var43.field2403.method572(class325.field2575 + var5);
																						field279.method2389(var43);
																						class318.method1588();
																						field294 = class466.field3870;
																						field227 = class466.field3867;
																						field335 = 1;
																						field313 = 0;
																						field473 = var4;
																						field219 = var5;
																					}

																					if (var39 != class393.field3284) {
																						if (null != var39) {
																							class184.method836(var39);
																						}

																						if (class393.field3284 != null) {
																							class184.method836(class393.field3284);
																						}
																					}

																					if (var32 != class219.field1895 && field266 == field234) {
																						if (var32 != null) {
																							class184.method836(var32);
																						}

																						if (null != class219.field1895) {
																							class184.method836(class219.field1895);
																						}
																					}

																					if (null != class219.field1895) {
																						if (field266 < field234) {
																							++field266;
																							if (field234 == field266) {
																								class184.method836(class219.field1895);
																							}
																						}
																					} else if (field266 > 0) {
																						--field266;
																					}

																					class374.method1847();
																					if (field485) {
																						class148.method694();
																					} else if (field484) {
																						var4 = 64 + class113.field844 * 128;
																						var5 = class189.field1709 * 128 + 64;
																						var6 = class327.method1666(var4, var5, class347.field2878) - class461.field3825;
																						class247.method1078(var4, var6, var5);
																						var4 = 64 + class342.field2745 * 128;
																						var5 = 64 + class114.field850 * 128;
																						var6 = class327.method1666(var4, var5, class347.field2878) - class252.field2083;
																						var7 = var4 - class463.field3850;
																						var8 = var6 - class110.field825;
																						var9 = var5 - class57.field594;
																						var10 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7));
																						var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047;
																						var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
																						class381.method1892(var11, var12);
																					}

																					for (var4 = 0; var4 < 5; ++var4) {
																						int var10002 = field330[var4]++;
																					}

																					class46.field560.method975();
																					var4 = ++class466.field3871 - 1;
																					var6 = class459.method2264();
																					if (var4 > 15000 && var6 > 15000) {
																						field280 = 250;
																						class380.method1888(14500);
																						var19 = class480.method2370(class356.field3007, field279.field4042);
																						field279.method2389(var19);
																					}

																					class240.field2021.method43();
																					++field279.field4045;
																					if (field279.field4045 > 50) {
																						var19 = class480.method2370(class356.field3012, field279.field4042);
																						field279.method2389(var19);
																					}

																					try {
																						field279.method2386();
																					} catch (IOException var28) {
																						class149.method698();
																					}

																					return;
																				}
																			} while(var47 == null);
																		} while(var47.field633 == null);

																		if (var47.field633.field895 < 0) {
																			break;
																		}

																		var46 = class67.method299(var47.field633.field912);
																	} while(null == var46 || var46.field1031 == null || var46.field1031.length == 0 || var47.field633.field895 >= var46.field1031.length || var47.field633 != var46.field1031[var47.field633.field895]);

																	if (var47.field633.field1026 == 11 && 0 == var47.field630) {
																		switch(var47.field633.method490()) {
																		case 0:
																			class10.method62(var47.field633.method492(), true, false);
																			break;
																		case 1:
																			var6 = class203.method892(var47.field633);
																			boolean var33 = 0 != (var6 >> 22 & 1);
																			if (var33) {
																				int[] var40 = var47.field633.method493();
																				if (null != var40) {
																					var27 = class480.method2370(class356.field3037, field279.field4042);
																					var27.field2403.method579(var40[2]);
																					var27.field2403.method534(var47.field633.field985);
																					var27.field2403.method579(var47.field633.method491());
																					var27.field2403.method534(var40[1]);
																					var27.field2403.method533(var47.field633.field895);
																					var27.field2403.method581(var40[0]);
																					field279.method2389(var27);
																				}
																			}
																		}
																	} else if (12 == var47.field633.field1026) {
																		class262 var49 = var47.field633.method485();
																		if (null != var49 && var49.method1116()) {
																			switch(var47.field630) {
																			case 0:
																				field285.method454(var47.field633);
																				var49.method1118(true);
																				var49.method1151(var47.field632, var47.field631, field460.method2132(82), field460.method2132(81));
																				break;
																			case 1:
																				var49.method1190(var47.field632, var47.field631);
																			}
																		}
																	}
																}
															}
														}

														var46 = var45.field4067;
														if (var46.field895 < 0) {
															break;
														}

														var41 = class67.method299(var46.field912);
													} while(null == var41 || null == var41.field1031 || var46.field895 >= var41.field1031.length || var41.field1031[var46.field895] != var46);

													class396.method1949(var45);
												}
											}

											var46 = var45.field4067;
											if (var46.field895 < 0) {
												break;
											}

											var41 = class67.method299(var46.field912);
										} while(var41 == null || null == var41.field1031 || var46.field895 >= var41.field1031.length || var46 != var41.field1031[var46.field895]);

										class396.method1949(var45);
									}
								}

								var46 = var45.field4067;
								if (var46.field895 < 0) {
									break;
								}

								var41 = class67.method299(var46.field912);
							} while(null == var41 || var41.field1031 == null || var46.field895 >= var41.field1031.length || var41.field1031[var46.field895] != var46);

							class396.method1949(var45);
						}
					}

					var31 = class480.method2370(class356.field3019, field279.field4042);
					var31.field2403.method544(0);
					var4 = var31.field2403.field1070;
					class119.method472(var31.field2403);
					var31.field2403.method586(var31.field2403.field1070 - var4);
					field279.method2389(var31);
				}
			}
		}
	}

	@ObfInfo(
		owner = "client",
		name = "k",
		desc = "(B)V"
	)
	protected final void method950() {
		field452 = class152.method711() + 500L;
		this.method180();
		if (-1 != field393) {
			this.method195(true);
		}

	}

	@ObfInfo(
		owner = "client",
		name = "hk",
		desc = "(I)V"
	)
	void method180() {
		int var2 = class427.field3529;
		int var3 = class476.field4003;
		if (super.field1852 < var2) {
			var2 = super.field1852;
		}

		if (super.field1851 < var3) {
			var3 = super.field1851;
		}

		if (null != class50.field574) {
			try {
				client var4 = class309.field2461;
				Object[] var5 = new Object[]{class152.method713()};
				JSObject.getWindow(var4).call("resize", var5);
			} catch (Throwable var6) {
			}
		}

	}

	@ObfInfo(
		owner = "client",
		name = "hq",
		desc = "(S)V"
	)
	final void method181() {
		int var2;
		if (field393 != -1) {
			var2 = field393;
			if (class268.method1275(var2)) {
				class81.method337(class329.field2600[var2], -1);
			}
		}

		for (var2 = 0; var2 < field442; ++var2) {
			if (field444[var2]) {
				field445[var2] = true;
			}

			field446[var2] = field444[var2];
			field444[var2] = false;
		}

		field521 = field231;
		field382 = -1;
		field383 = -1;
		class167.field1257 = null;
		if (field393 != -1) {
			field442 = 0;
			class431.method2125(field393, 0, 0, class427.field3529, class476.field4003, 0, 0, -1);
		}

		class162.method758();
		if (field252) {
			if (field335 == 1) {
				class466.field3874[field313 / 100].method1240(field294 - 8, field227 - 8);
			}

			if (field335 == 2) {
				class466.field3874[field313 / 100 + 4].method1240(field294 - 8, field227 - 8);
			}
		}

		int var3;
		int var4;
		if (!field368) {
			if (field382 != -1) {
				var2 = field382;
				var3 = field383;
				if ((field369 >= 2 || 0 != field386 || field388) && field381) {
					var4 = field369 - 1;
					String var6;
					if (1 == field386 && field369 < 2) {
						var6 = class177.field1486 + class177.field1496 + field483 + " " + class442.field3664;
					} else if (field388 && field369 < 2) {
						var6 = field391 + class177.field1496 + field510 + " " + class442.field3664;
					} else {
						String var14;
						if (var4 < 0) {
							var14 = "";
						} else if (field256[var4].length() > 0) {
							var14 = field375[var4] + class177.field1496 + field256[var4];
						} else {
							var14 = field375[var4];
						}

						var6 = var14;
					}

					if (field369 > 2) {
						var6 = var6 + class238.method1032(16777215) + " " + '/' + " " + (field369 - 2) + class177.field1456;
					}

					class114.field848.method2031(var6, var2 + 4, var3 + 15, 16777215, 0, field231 / 1000);
				}
			}
		} else {
			class290.method1428();
		}

		if (3 == field475) {
			for (var2 = 0; var2 < field442; ++var2) {
				if (field446[var2]) {
					class162.method762(field447[var2], field448[var2], field435[var2], field247[var2], 16711935, 128);
				} else if (field445[var2]) {
					class162.method762(field447[var2], field448[var2], field435[var2], field247[var2], 16711680, 128);
				}
			}
		}

		var2 = class347.field2878;
		var3 = class113.field846.field2672;
		var4 = class113.field846.field2608;
		int var5 = field276;

		for (class156 var15 = (class156)class156.field1200.method646(); null != var15; var15 = (class156)class156.field1200.method648()) {
			if (-1 != var15.field1197 || var15.field1201 != null) {
				int var7 = 0;
				if (var3 > var15.field1193) {
					var7 += var3 - var15.field1193;
				} else if (var3 < var15.field1192) {
					var7 += var15.field1192 - var3;
				}

				if (var4 > var15.field1195) {
					var7 += var4 - var15.field1195;
				} else if (var4 < var15.field1190) {
					var7 += var15.field1190 - var4;
				}

				if (var7 - 64 <= var15.field1199 && class50.field574.method2230() != 0 && var15.field1196 == var2) {
					var7 -= 64;
					if (var7 < 0) {
						var7 = 0;
					}

					int var8 = (var15.field1199 - var7) * class50.field574.method2230() / var15.field1199;
					class351 var10000;
					if (null == var15.field1198) {
						if (var15.field1197 >= 0) {
							var10000 = (class351)null;
							class351 var9 = class351.method1767(class303.field2437, var15.field1197, 0);
							if (null != var9) {
								class82 var10 = var9.method1768().method339(class297.field2393);
								class316 var11 = class316.method1516(var10, 100, var8);
								var11.method1518(-1);
								class197.field1739.method1065(var11);
								var15.field1198 = var11;
							}
						}
					} else {
						var15.field1198.method1519(var8);
					}

					if (null == var15.field1203) {
						if (null != var15.field1201 && (var15.field1202 -= var5) <= 0) {
							int var13 = (int)(Math.random() * (double)var15.field1201.length);
							var10000 = (class351)null;
							class351 var16 = class351.method1767(class303.field2437, var15.field1201[var13], 0);
							if (var16 != null) {
								class82 var17 = var16.method1768().method339(class297.field2393);
								class316 var12 = class316.method1516(var17, 100, var8);
								var12.method1518(0);
								class197.field1739.method1065(var12);
								var15.field1203 = var12;
								var15.field1202 = var15.field1194 + (int)(Math.random() * (double)(var15.field1191 - var15.field1194));
							}
						}
					} else {
						var15.field1203.method1519(var8);
						if (!var15.field1203.method636()) {
							var15.field1203 = null;
						}
					}
				} else {
					if (null != var15.field1198) {
						class197.field1739.method1066(var15.field1198);
						var15.field1198 = null;
					}

					if (null != var15.field1203) {
						class197.field1739.method1066(var15.field1203);
						var15.field1203 = null;
					}
				}
			}
		}

		field276 = 0;
	}

	@ObfInfo(
		owner = "client",
		name = "ic",
		desc = "(Lde;II)Z"
	)
	boolean method187(class486 var1, int var2) {
		if (var1.field4047 == 0) {
			class228.field1933 = null;
		} else {
			if (class228.field1933 == null) {
				class228.field1933 = new class17(class63.field619, class309.field2461);
			}

			class228.field1933.method82(var1.field4043, var2);
		}

		field323 = field418;
		class228.field1932 = true;
		var1.field4044 = null;
		return true;
	}

	@ObfInfo(
		owner = "client",
		name = "iw",
		desc = "(Lde;I)Z"
	)
	boolean method186(class486 var1) {
		if (class228.field1933 != null) {
			class228.field1933.method79(var1.field4043);
		}

		field323 = field418;
		class228.field1932 = true;
		var1.field4044 = null;
		return true;
	}

	@ObfInfo(
		owner = "client",
		name = "il",
		desc = "(Lde;I)Z"
	)
	final boolean method193(class486 var1) {
		class160 var3 = var1.method2384();
		class6 var4 = var1.field4043;
		if (var3 == null) {
			return false;
		} else {
			String var22;
			int var28;
			try {
				int var6;
				if (null == var1.field4044) {
					if (var1.field4048) {
						if (!var3.method735(1)) {
							return false;
						}

						var3.method730(var1.field4043.field1072, 0, 1);
						var1.field4040 = 0;
						var1.field4048 = false;
					}

					var4.field1070 = 0;
					if (var4.method31()) {
						if (!var3.method735(1)) {
							return false;
						}

						var3.method730(var1.field4043.field1072, 1, 1);
						var1.field4040 = 0;
					}

					var1.field4048 = true;
					class346[] var5 = class236.method1030();
					var6 = var4.method36();
					if (var6 < 0 || var6 >= var5.length) {
						throw new IOException(var6 + " " + var4.field1070);
					}

					var1.field4044 = var5[var6];
					var1.field4047 = var1.field4044.field2798;
				}

				if (var1.field4047 == -1) {
					if (!var3.method735(1)) {
						return false;
					}

					var1.method2384().method730(var4.field1072, 0, 1);
					var1.field4047 = var4.field1072[0] & 255;
				}

				if (-2 == var1.field4047) {
					if (!var3.method735(2)) {
						return false;
					}

					var1.method2384().method730(var4.field1072, 0, 2);
					var4.field1070 = 0;
					var1.field4047 = var4.method549();
				}

				if (!var3.method735(var1.field4047)) {
					return false;
				}

				var4.field1070 = 0;
				var3.method730(var4.field1072, 0, var1.field4047);
				var1.field4040 = 0;
				field225.method1694();
				var1.field4051 = var1.field4050;
				var1.field4050 = var1.field4049;
				var1.field4049 = var1.field4044;
				if (var1.field4044 == class346.field2786) {
					class297.method1440(class204.field1773);
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2771) {
					class297.method1440(class204.field1770);
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2833) {
					class155.method718(false, var4);
					var1.field4044 = null;
					return true;
				}

				if (class346.field2784 == var1.field4044) {
					if (class397.field3352 == null) {
						class397.field3352 = new class110(class189.field1706);
					}

					class331 var55 = class189.field1706.method23(var4);
					class397.field3352.field827.method1215(var55.field2601, var55.field2602);
					field425[++field426 - 1 & 31] = var55.field2601;
					var1.field4044 = null;
					return true;
				}

				int var21;
				if (var1.field4044 == class346.field2824) {
					class169.field1269 = var4.method547();
					class84.field697 = var4.method592();

					while (var4.field1070 < var1.field4047) {
						var21 = var4.method547();
						class204 var80 = class327.method1662()[var21];
						class297.method1440(var80);
					}

					var1.field4044 = null;
					return true;
				}

				class120 var7;
				int var8;
				int var9;
				int var10;
				if (var1.field4044 == class346.field2803) {
					var21 = var4.method595();
					var6 = var4.method549();
					if (var21 < -70000) {
						var6 += 32768;
					}

					if (var21 >= 0) {
						var7 = class67.method299(var21);
					} else {
						var7 = null;
					}

					for (; var4.field1070 < var1.field4047; class286.method1420(var6, var8, var9 - 1, var10)) {
						var8 = var4.method559();
						var9 = var4.method549();
						var10 = 0;
						if (var9 != 0) {
							var10 = var4.method547();
							if (var10 == 255) {
								var10 = var4.method595();
							}
						}

						if (null != var7 && var8 >= 0 && var8 < var7.field887.length) {
							var7.field887[var8] = var9;
							var7.field931[var8] = var10;
						}
					}

					if (null != var7) {
						class184.method836(var7);
					}

					class480.method2369();
					field421[++field422 - 1 & 31] = var6 & 32767;
					var1.field4044 = null;
					return true;
				}

				class211 var15;
				int var16;
				int var17;
				String var27;
				byte var75;
				if (var1.field4044 == class346.field2861) {
					var75 = var4.method548();
					var22 = var4.method555();
					long var23 = (long)var4.method549();
					long var25 = (long)var4.method551();
					class425 var61 = (class425)class2.method10(class283.method1394(), var4.method547());
					long var12 = var25 + (var23 << 32);
					boolean var69 = false;
					var15 = null;
					class57 var70 = var75 >= 0 ? field345[var75] : class198.field1746;
					if (var70 == null) {
						var69 = true;
					} else {
						var16 = 0;

						while (true) {
							if (var16 >= 100) {
								if (var61.field3523 && class240.field2021.method41(new class257(var22, class63.field619))) {
									var69 = true;
								}
								break;
							}

							if (var12 == field236[var16]) {
								var69 = true;
								break;
							}

							++var16;
						}
					}

					if (!var69) {
						field236[field459] = var12;
						field459 = (field459 + 1) % 100;
						var27 = class420.method2042(class302.method1456(var4));
						var17 = var75 >= 0 ? 41 : 44;
						if (-1 != var61.field3521) {
							class65.method296(var17, class185.method843(var61.field3521) + var22, var27, var70.field592);
						} else {
							class65.method296(var17, var22, var27, var70.field592);
						}
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2850) {
					field484 = true;
					field485 = false;
					class113.field844 = var4.method547();
					class189.field1709 = var4.method547();
					class461.field3825 = var4.method549();
					class148.field1166 = var4.method547();
					class438.field3645 = var4.method547();
					if (class438.field3645 >= 100) {
						class463.field3850 = 64 + class113.field844 * 128;
						class57.field594 = class189.field1709 * 128 + 64;
						class110.field825 = class327.method1666(class463.field3850, class57.field594, class347.field2878) - class461.field3825;
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2773 == var1.field4044) {
					var21 = var4.method574();
					if (var21 == 65535) {
						var21 = -1;
					}

					class378.method1863(var21);
					var1.field4044 = null;
					return true;
				}

				if (class346.field2826 == var1.field4044) {
					var21 = var4.method587();
					var6 = var4.method531();
					if (var6 == 65535) {
						var6 = -1;
					}

					class199.method879(var6, var21);
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2770) {
					class397.field3352 = null;
					var1.field4044 = null;
					return true;
				}

				if (class346.field2845 == var1.field4044) {
					field226 = field418;
					var75 = var4.method548();
					class302 var79 = new class302(var4);
					class57 var64;
					if (var75 >= 0) {
						var64 = field345[var75];
					} else {
						var64 = class198.field1746;
					}

					var79.method1455(var64);
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2822) {
					var21 = var4.method582();
					var6 = var4.method575();
					var28 = var6 >> 10 & 31;
					var8 = var6 >> 5 & 31;
					var9 = var6 & 31;
					var10 = (var8 << 11) + (var28 << 19) + (var9 << 3);
					class120 var60 = class67.method299(var21);
					if (var60.field917 != var10) {
						var60.field917 = var10;
						class184.method836(var60);
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2868) {
					for (var21 = 0; var21 < field347.length; ++var21) {
						if (field347[var21] != null) {
							field347[var21].field2649 = -1;
						}
					}

					for (var21 = 0; var21 < field465.length; ++var21) {
						if (field465[var21] != null) {
							field465[var21].field2649 = -1;
						}
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2817) {
					var21 = var4.method547();
					if (var4.method547() == 0) {
						field429[var21] = new class324();
						var4.field1070 += 18;
					} else {
						--var4.field1070;
						field429[var21] = new class324(var4, false);
					}

					field490 = field418;
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2811) {
					class415.method2013(false, var1.field4043);
					var1.field4044 = null;
					return true;
				}

				if (class346.field2768 == var1.field4044) {
					class2 var54 = new class2();
					var54.field18 = var4.method555();
					var54.field10 = var4.method549();
					var6 = var4.method595();
					var54.field16 = var6;
					class261.method1113(45);
					var3.method734();
					var3 = null;
					class61.method282(var54);
					var1.field4044 = null;
					return false;
				}

				if (var1.field4044 == class346.field2807) {
					class214.method948();
					var75 = var4.method548();
					if (var1.field4047 == 1) {
						if (var75 >= 0) {
							field466[var75] = null;
						} else {
							class91.field770 = null;
						}

						var1.field4044 = null;
						return true;
					}

					if (var75 >= 0) {
						field466[var75] = new class429(var4);
					} else {
						class91.field770 = new class429(var4);
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2799 == var1.field4044) {
					class297.method1440(class204.field1763);
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2842) {
					class397.field3353 = class151.method702(var4.method547());
					var1.field4044 = null;
					return true;
				}

				int var14;
				long var29;
				long var31;
				String var36;
				String var50;
				if (var1.field4044 == class346.field2855) {
					var50 = var4.method555();
					var29 = (long)var4.method549();
					var31 = (long)var4.method551();
					class425 var33 = (class425)class2.method10(class283.method1394(), var4.method547());
					long var34 = var31 + (var29 << 32);
					boolean var65 = false;

					for (var14 = 0; var14 < 100; ++var14) {
						if (field236[var14] == var34) {
							var65 = true;
							break;
						}
					}

					if (class240.field2021.method41(new class257(var50, class63.field619))) {
						var65 = true;
					}

					if (!var65 && 0 == field404) {
						field236[field459] = var34;
						field459 = (1 + field459) % 100;
						var36 = class420.method2042(class457.method2258(class302.method1456(var4)));
						byte var84;
						if (var33.field3509) {
							var84 = 7;
						} else {
							var84 = 3;
						}

						if (-1 != var33.field3521) {
							class164.method765(var84, class185.method843(var33.field3521) + var50, var36);
						} else {
							class164.method765(var84, var50, var36);
						}
					}

					var1.field4044 = null;
					return true;
				}

				int var13;
				int var18;
				int var19;
				class208 var20;
				int var37;
				int var39;
				byte var62;
				int var85;
				byte var88;
				if (class346.field2857 == var1.field4044) {
					var62 = var4.method548();
					var28 = var4.method578();
					var21 = var28 >> 16;
					var6 = var28 >> 8 & 255;
					var8 = (var28 >> 4 & 7) + var21;
					var9 = (var28 & 7) + var6;
					var85 = var4.method550();
					var16 = var4.method575();
					var88 = var4.method599();
					var18 = var4.method592();
					var14 = var4.method594() * 4;
					var17 = var4.method575();
					var19 = var4.method547();
					var13 = var4.method574();
					var37 = var4.method594() * 4;
					var10 = var62 + var8;
					var39 = var88 + var9;
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var39 >= 0 && var10 < 104 && var39 < 104 && var13 != 65535) {
						var8 = var8 * 128 + 64;
						var9 = 64 + var9 * 128;
						var10 = 64 + var10 * 128;
						var39 = var39 * 128 + 64;
						var20 = new class208(var13, class347.field2878, var8, var9, class327.method1666(var8, var9, class347.field2878) - var14, field231 + var16, var17 + field231, var18, var19, var85, var37);
						var20.method901(var10, var39, class327.method1666(var10, var39, class347.field2878) - var37, field231 + var16);
						field362.method642(var20);
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2778 == var1.field4044) {
					var37 = var4.method569() * 4;
					var88 = var4.method599();
					var18 = var4.method547();
					var62 = var4.method599();
					var13 = var4.method575();
					var85 = var4.method590();
					var28 = var4.method577();
					var21 = var28 >> 16;
					var6 = var28 >> 8 & 255;
					var8 = (var28 >> 4 & 7) + var21;
					var9 = var6 + (var28 & 7);
					var14 = var4.method547() * 4;
					var19 = var4.method592();
					var16 = var4.method531();
					var17 = var4.method575();
					var10 = var62 + var8;
					var39 = var88 + var9;
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var39 >= 0 && var10 < 104 && var39 < 104 && var13 != 65535) {
						var8 = var8 * 128 + 64;
						var9 = 64 + var9 * 128;
						var10 = 64 + var10 * 128;
						var39 = 64 + var39 * 128;
						var20 = new class208(var13, class347.field2878, var8, var9, class327.method1666(var8, var9, class347.field2878) - var14, var16 + field231, var17 + field231, var18, var19, var85, var37);
						var20.method901(var10, var39, class327.method1666(var10, var39, class347.field2878) - var37, var16 + field231);
						field362.method642(var20);
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2787 == var1.field4044) {
					class240.field2021.field39.method1513(var4, var1.field4047);
					class400.method1982();
					field428 = field418;
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2765) {
					var21 = var4.method574();
					byte var71 = var4.method593();
					class291.field2372[var21] = var71;
					if (var71 != class291.field2373[var21]) {
						class291.field2373[var21] = var71;
					}

					class238.method1033(var21);
					field419[++field420 - 1 & 31] = var21;
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2827) {
					class240.field2021.method50();
					field428 = field418;
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2860) {
					var21 = var4.method569();
					var22 = var4.method555();
					var28 = var4.method547();
					if (var28 >= 1 && var28 <= 8) {
						if (var22.equalsIgnoreCase(class177.field1325)) {
							var22 = null;
						}

						field356[var28 - 1] = var22;
						field357[var28 - 1] = var21 == 0;
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2808 == var1.field4044) {
					var21 = var4.method531();
					class380 var93;
					if (var21 == field348) {
						var93 = class113.field846;
					} else {
						var93 = field347[var21];
					}

					var6 = var4.method574();
					var28 = var4.method582();
					if (var93 != null) {
						var93.field2654 = var6;
						var93.field2676 = var28 >> 16;
						var93.field2657 = (var28 & 65535) + field231;
						var93.field2655 = 0;
						var93.field2644 = 0;
						if (var93.field2657 > field231) {
							var93.field2655 = -1;
						}

						if (var93.field2654 == 65535) {
							var93.field2654 = -1;
						}
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2856) {
					class415.method2013(true, var1.field4043);
					var1.field4044 = null;
					return true;
				}

				if (class346.field2790 == var1.field4044) {
					field237 = var4.method531() * 30;
					field434 = field418;
					var1.field4044 = null;
					return true;
				}

				if (class346.field2810 == var1.field4044) {
					field226 = field418;
					var75 = var4.method548();
					if (var1.field4047 == 1) {
						if (var75 >= 0) {
							field345[var75] = null;
						} else {
							class198.field1746 = null;
						}

						var1.field4044 = null;
						return true;
					}

					if (var75 >= 0) {
						field345[var75] = new class57(var4);
					} else {
						class198.field1746 = new class57(var4);
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2761) {
					var21 = var4.method531();
					field393 = var21;
					this.method195(false);
					class184.method835(var21);
					class148.method696(field393);

					for (var6 = 0; var6 < 100; ++var6) {
						field444[var6] = true;
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2862 == var1.field4044) {
					class297.method1440(class204.field1766);
					var1.field4044 = null;
					return true;
				}

				if (class346.field2873 == var1.field4044) {
					class480.method2369();
					field342 = var4.method549();
					field434 = field418;
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2821) {
					for (var21 = 0; var21 < class85.field701; ++var21) {
						class85 var78 = class342.method1738(var21);
						if (var78 != null) {
							class291.field2372[var21] = 0;
							class291.field2373[var21] = 0;
						}
					}

					class480.method2369();
					field420 += 32;
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2815) {
					field484 = false;

					for (var21 = 0; var21 < 5; ++var21) {
						field486[var21] = false;
					}

					var1.field4044 = null;
					return true;
				}

				class120 var87;
				if (var1.field4044 == class346.field2858) {
					var21 = var4.method576();
					var6 = var4.method582();
					var28 = var4.method550();
					var87 = class67.method299(var6);
					if (var87.field902 != var28 || var87.field903 != var21 || 0 != var87.field940 || 0 != var87.field1036) {
						var87.field902 = var28;
						var87.field903 = var21;
						var87.field940 = 0;
						var87.field1036 = 0;
						class184.method836(var87);
						this.method194(var87);
						if (var87.field1026 == 0) {
							class378.method1862(class329.field2600[var6 >> 16], var87, false);
						}
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2793 && field484) {
					field485 = true;
					class148.field1166 = var4.method547();
					class438.field3645 = var4.method547();
					class4.field25 = var4.method547();
					class397.field3350 = var4.method547();

					for (var21 = 0; var21 < 5; ++var21) {
						field486[var21] = false;
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2837) {
					class480.method2369();
					var21 = var4.method582();
					var6 = var4.method594();
					var28 = var4.method594();
					field366[var28] = var21;
					field293[var28] = var6;
					field365[var28] = 1;

					for (var8 = 0; var8 < 98; ++var8) {
						if (var21 >= class150.field1171[var8]) {
							field365[var28] = var8 + 2;
						}
					}

					field349[++field424 - 1 & 31] = var28;
					var1.field4044 = null;
					return true;
				}

				if (class346.field2783 == var1.field4044) {
					class214.method948();
					var75 = var4.method548();
					class182 var77 = new class182(var4);
					class429 var59;
					if (var75 >= 0) {
						var59 = field466[var75];
					} else {
						var59 = class91.field770;
					}

					var77.method832(var59);
					var1.field4044 = null;
					return true;
				}

				if (class346.field2874 == var1.field4044) {
					var21 = var4.method595();
					var6 = var4.method594();
					short var82 = (short)var4.method550();
					var8 = var4.method575();
					class267 var92 = field465[var8];
					if (var92 != null) {
						var92.method1261(var6, var21, var82);
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2806 == var1.field4044) {
					field238 = var4.method547();
					if (1 == field238) {
						field239 = var4.method549();
					}

					if (field238 >= 2 && field238 <= 6) {
						if (2 == field238) {
							field244 = 64;
							field339 = 64;
						}

						if (3 == field238) {
							field244 = 0;
							field339 = 64;
						}

						if (4 == field238) {
							field244 = 128;
							field339 = 64;
						}

						if (5 == field238) {
							field244 = 64;
							field339 = 0;
						}

						if (field238 == 6) {
							field244 = 64;
							field339 = 128;
						}

						field238 = 2;
						field241 = var4.method549();
						field282 = var4.method549();
						field243 = var4.method547();
					}

					if (10 == field238) {
						field307 = var4.method549();
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2801 == var1.field4044) {
					class297.method1440(class204.field1760);
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2867) {
					var28 = var4.method551();
					var21 = var28 >> 16;
					var6 = var28 >> 8 & 255;
					var8 = var21 + (var28 >> 4 & 7);
					var9 = (var28 & 7) + var6;
					var10 = var4.method594();
					var39 = var10 >> 2;
					var85 = var10 & 3;
					var13 = field292[var39];
					var14 = var4.method531();
					if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
						if (var13 == 0) {
							class384 var68 = class408.field3415.method1578(class347.field2878, var8, var9);
							if (var68 != null) {
								var16 = class174.method803(var68.field3237);
								if (var39 == 2) {
									var68.field3230 = new class89(var16, 2, var85 + 4, class347.field2878, var8, var9, var14, false, var68.field3230);
									var68.field3236 = new class89(var16, 2, var85 + 1 & 3, class347.field2878, var8, var9, var14, false, var68.field3236);
								} else {
									var68.field3230 = new class89(var16, var39, var85, class347.field2878, var8, var9, var14, false, var68.field3230);
								}
							}
						} else if (var13 == 1) {
							class173 var67 = class408.field3415.method1612(class347.field2878, var8, var9);
							if (null != var67) {
								var16 = class174.method803(var67.field1280);
								if (var39 != 4 && var39 != 5) {
									if (var39 == 6) {
										var67.field1286 = new class89(var16, 4, var85 + 4, class347.field2878, var8, var9, var14, false, var67.field1286);
									} else if (var39 == 7) {
										var67.field1286 = new class89(var16, 4, (var85 + 2 & 3) + 4, class347.field2878, var8, var9, var14, false, var67.field1286);
									} else if (var39 == 8) {
										var67.field1286 = new class89(var16, 4, var85 + 4, class347.field2878, var8, var9, var14, false, var67.field1286);
										var67.field1287 = new class89(var16, 4, 4 + (var85 + 2 & 3), class347.field2878, var8, var9, var14, false, var67.field1287);
									}
								} else {
									var67.field1286 = new class89(var16, 4, var85, class347.field2878, var8, var9, var14, false, var67.field1286);
								}
							}
						} else if (var13 == 2) {
							var15 = class408.field3415.method1580(class347.field2878, var8, var9);
							if (var39 == 11) {
								var39 = 10;
							}

							if (null != var15) {
								var15.field1822 = new class89(class174.method803(var15.field1831), var39, var85, class347.field2878, var8, var9, var14, false, var15.field1822);
							}
						} else if (var13 == 3) {
							class340 var66 = class408.field3415.method1602(class347.field2878, var8, var9);
							if (null != var66) {
								var66.field2718 = new class89(class174.method803(var66.field2719), 22, var85, class347.field2878, var8, var9, var14, false, var66.field2718);
							}
						}
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2838 == var1.field4044) {
					class3.method19(var4, var1.field4047);
					class167.method782();
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2805) {
					class70.field634 = true;
					class3.method19(var4, var1.field4047);
					class167.method782();
					var1.field4044 = null;
					return true;
				}

				class415 var86;
				if (var1.field4044 == class346.field2825) {
					var21 = var4.method603();
					var6 = var4.method594();
					var28 = var4.method549();
					var86 = (class415)field394.method791((long)var21);
					if (var86 != null) {
						class374.method1848(var86, var28 != var86.field3426, (byte)93);
					}

					class472.method2332(var21, var28, var6);
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2866) {
					var21 = var4.method571();
					var6 = var4.method549();
					var28 = var4.method549();
					var87 = class67.method299(var21);
					var87.field949 = (var6 << 16) + var28;
					var1.field4044 = null;
					return true;
				}

				if (class346.field2859 == var1.field4044) {
					return this.method186(var1);
				}

				if (var1.field4044 == class346.field2870) {
					class297.method1440(class204.field1771);
					var1.field4044 = null;
					return true;
				}

				if (class346.field2792 == var1.field4044) {
					return this.method187(var1, 1);
				}

				class120 var41;
				if (var1.field4044 == class346.field2795) {
					var21 = var4.method571();
					var6 = var4.method595();
					class415 var58 = (class415)field394.method791((long)var21);
					var86 = (class415)field394.method791((long)var6);
					if (null != var86) {
						class374.method1848(var86, null == var58 || var86.field3426 != var58.field3426, (byte)105);
					}

					if (null != var58) {
						var58.method637();
						field394.method788(var58, (long)var6);
					}

					var41 = class67.method299(var21);
					if (null != var41) {
						class184.method836(var41);
					}

					var41 = class67.method299(var6);
					if (var41 != null) {
						class184.method836(var41);
						class378.method1862(class329.field2600[var41.field985 >>> 16], var41, true);
					}

					if (-1 != field393) {
						class452.method2240(field393, 1);
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2875 == var1.field4044) {
					var21 = var4.method603();
					var6 = var4.method549();
					var7 = class67.method299(var21);
					if (6 != var7.field936 || var6 != var7.field955) {
						var7.field936 = 6;
						var7.field955 = var6;
						class184.method836(var7);
					}

					var1.field4044 = null;
					return true;
				}

				boolean var56;
				String var57;
				if (var1.field4044 == class346.field2763) {
					var21 = var4.method559();
					var56 = var4.method547() == 1;
					var57 = "";
					boolean var63 = false;
					if (var56) {
						var57 = var4.method555();
						if (class240.field2021.method41(new class257(var57, class63.field619))) {
							var63 = true;
						}
					}

					String var91 = var4.method555();
					if (!var63) {
						class164.method765(var21, var57, var91);
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2872 == var1.field4044) {
					byte[] var52 = new byte[var1.field4047];
					var4.method27(var52, 0, var52.length);
					class127 var76 = new class127(var52);
					var57 = var76.method555();
					class10.method62(var57, true, false);
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2816) {
					class380.method1887();
					var1.field4044 = null;
					return false;
				}

				if (var1.field4044 == class346.field2853) {
					var21 = var4.method571();
					var6 = var4.method574();
					var7 = class67.method299(var21);
					if (var7.field936 != 1 || var7.field955 != var6) {
						var7.field936 = 1;
						var7.field955 = var6;
						class184.method836(var7);
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2841 == var1.field4044) {
					var21 = var4.method550();
					var6 = var4.method582();
					var7 = class67.method299(var6);
					if (var21 != var7.field975 || var21 == -1) {
						var7.field975 = var21;
						var7.field1029 = 0;
						var7.field1030 = 0;
						class184.method836(var7);
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2781) {
					class123.field1061 = true;
					class155.method718(false, var4);
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2772) {
					class297.method1440(class204.field1768);
					var1.field4044 = null;
					return true;
				}

				if (class346.field2804 == var1.field4044) {
					class297.method1440(class204.field1769);
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2814) {
					class84.field697 = var4.method569();
					class169.field1269 = var4.method592();

					for (var21 = class169.field1269; var21 < class169.field1269 + 8; ++var21) {
						for (var6 = class84.field697; var6 < 8 + class84.field697; ++var6) {
							if (field360[class347.field2878][var21][var6] != null) {
								field360[class347.field2878][var21][var6] = null;
								class471.method2329(var21, var6);
							}
						}
					}

					for (class138 var51 = (class138)field450.method646(); null != var51; var51 = (class138)field450.method648()) {
						if (var51.field1118 >= class169.field1269 && var51.field1118 < 8 + class169.field1269 && var51.field1129 >= class84.field697 && var51.field1129 < class84.field697 + 8 && var51.field1122 == class347.field2878) {
							var51.field1130 = 0;
						}
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2846) {
					class397.field3352 = new class110(class189.field1706);
					var1.field4044 = null;
					return true;
				}

				class267 var40;
				if (class346.field2851 == var1.field4044) {
					var28 = var4.method592();
					var21 = var4.method574();
					var6 = var4.method531();
					if (var6 == 65535) {
						var6 = -1;
					}

					var40 = field465[var21];
					if (null != var40) {
						if (var40.field2649 == var6 && var6 != -1) {
							var9 = class271.method1277(var6).field2026;
							if (var9 == 1) {
								var40.field2640 = 0;
								var40.field2651 = 0;
								var40.field2652 = var28;
								var40.field2653 = 0;
							} else if (var9 == 2) {
								var40.field2653 = 0;
							}
						} else if (var6 == -1 || var40.field2649 == -1 || class271.method1277(var6).field2049 >= class271.method1277(var40.field2649).field2049) {
							var40.field2649 = var6;
							var40.field2640 = 0;
							var40.field2651 = 0;
							var40.field2652 = var28;
							var40.field2653 = 0;
							var40.field2682 = var40.field2607;
						}
					}

					var1.field4044 = null;
					return true;
				}

				long var42;
				long var45;
				if (class346.field2775 == var1.field4044) {
					var50 = var4.method555();
					var29 = var4.method598();
					var31 = (long)var4.method549();
					var42 = (long)var4.method551();
					class425 var94 = (class425)class2.method10(class283.method1394(), var4.method547());
					var45 = (var31 << 32) + var42;
					boolean var83 = false;

					for (var16 = 0; var16 < 100; ++var16) {
						if (var45 == field236[var16]) {
							var83 = true;
							break;
						}
					}

					if (var94.field3523 && class240.field2021.method41(new class257(var50, class63.field619))) {
						var83 = true;
					}

					if (!var83 && 0 == field404) {
						field236[field459] = var45;
						field459 = (1 + field459) % 100;
						var27 = class420.method2042(class457.method2258(class302.method1456(var4)));
						if (-1 != var94.field3521) {
							class65.method296(9, class185.method843(var94.field3521) + var50, var27, class10.method61(var29));
						} else {
							class65.method296(9, var50, var27, class10.method61(var29));
						}
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2789) {
					class240.field2021.method42(var4, var1.field4047);
					field428 = field418;
					var1.field4044 = null;
					return true;
				}

				boolean var81;
				if (var1.field4044 == class346.field2869) {
					var81 = var4.method547() == 1;
					if (var81) {
						class221.field1901 = class152.method711() - var4.method598();
						class201.field1756 = new class348(var4, true);
					} else {
						class201.field1756 = null;
					}

					field433 = field418;
					var1.field4044 = null;
					return true;
				}

				if (class346.field2802 == var1.field4044) {
					class297.method1440(class204.field1762);
					var1.field4044 = null;
					return true;
				}

				if (class346.field2830 == var1.field4044) {
					field296 = var4.method547();
					var1.field4044 = null;
					return true;
				}

				if (class346.field2864 == var1.field4044) {
					var21 = var4.method582();
					var6 = var4.method574();
					if (var6 == 65535) {
						var6 = -1;
					}

					var28 = var4.method582();
					var8 = var4.method574();
					if (var8 == 65535) {
						var8 = -1;
					}

					for (var9 = var6; var9 <= var8; ++var9) {
						var42 = (long)var9 + ((long)var21 << 32);
						class139 var44 = field271.method791(var42);
						if (null != var44) {
							var44.method637();
						}

						field271.method788(new class245(var28), var42);
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2766) {
					var21 = var4.method574();
					var6 = var4.method603();
					class291.field2372[var21] = var6;
					if (class291.field2373[var21] != var6) {
						class291.field2373[var21] = var6;
					}

					class238.method1033(var21);
					field419[++field420 - 1 & 31] = var21;
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2863) {
					var81 = var4.method553();
					if (var81) {
						if (null == class214.field1874) {
							class214.field1874 = new class426();
						}
					} else {
						class214.field1874 = null;
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2779 == var1.field4044) {
					var10 = var4.method531();
					var28 = var4.method587();
					var21 = var28 >> 16;
					var6 = var28 >> 8 & 255;
					var8 = var21 + (var28 >> 4 & 7);
					var9 = (var28 & 7) + var6;
					var39 = var4.method594();
					var85 = var4.method575();
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
						var8 = 64 + var8 * 128;
						var9 = var9 * 128 + 64;
						class339 var95 = new class339(var10, class347.field2878, var8, var9, class327.method1666(var8, var9, class347.field2878) - var39, var85, field231);
						field352.method642(var95);
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2785 == var1.field4044) {
					var21 = var4.method547();
					class405.method1990(var21);
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2828) {
					var21 = var4.method595();
					var6 = var4.method595();
					var28 = class204.method894();
					class299 var89 = class480.method2370(class356.field2934, field279.field4042);
					var89.field2403.method581(var21);
					var89.field2403.method579(var6);
					var89.field2403.method544(class214.field1849);
					var89.field2403.method544(var28);
					field279.method2389(var89);
					var1.field4044 = null;
					return true;
				}

				if (class346.field2812 == var1.field4044) {
					for (var21 = 0; var21 < class291.field2373.length; ++var21) {
						if (class291.field2372[var21] != class291.field2373[var21]) {
							class291.field2373[var21] = class291.field2372[var21];
							class238.method1033(var21);
							field419[++field420 - 1 & 31] = var21;
						}
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2823) {
					class143.method654(var4, var1.field4047);
					var1.field4044 = null;
					return true;
				}

				if (class346.field2791 == var1.field4044) {
					class297.method1440(class204.field1772);
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2782) {
					var50 = var4.method555();
					var22 = class420.method2042(class457.method2258(class302.method1456(var4)));
					class164.method765(6, var50, var22);
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2776) {
					var21 = var4.method595();
					class415 var74 = (class415)field394.method791((long)var21);
					if (null != var74) {
						class374.method1848(var74, true, (byte)115);
					}

					if (field399 != null) {
						class184.method836(field399);
						field399 = null;
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2854) {
					class434.method2150(var4.method555());
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2777) {
					var50 = var4.method555();
					var6 = var4.method603();
					var7 = class67.method299(var6);
					if (!var50.equals(var7.field954)) {
						var7.field954 = var50;
						class184.method836(var7);
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2832) {
					var21 = var4.method549();
					var6 = var4.method603();
					var7 = class67.method299(var6);
					if (2 != var7.field936 || var21 != var7.field955) {
						var7.field936 = 2;
						var7.field955 = var21;
						class184.method836(var7);
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2843 == var1.field4044) {
					var21 = var4.method549();
					var6 = var4.method547();
					var28 = var4.method549();
					class338.method1699(var21, var6, var28);
					var1.field4044 = null;
					return true;
				}

				if (class346.field2834 == var1.field4044) {
					var21 = var4.method595();
					var6 = var4.method549();
					if (var21 < -70000) {
						var6 += 32768;
					}

					if (var21 >= 0) {
						var7 = class67.method299(var21);
					} else {
						var7 = null;
					}

					if (var7 != null) {
						for (var8 = 0; var8 < var7.field887.length; ++var8) {
							var7.field887[var8] = 0;
							var7.field931[var8] = 0;
						}
					}

					class461.method2271(var6);
					var8 = var4.method549();

					for (var9 = 0; var9 < var8; ++var9) {
						var10 = var4.method569();
						if (var10 == 255) {
							var10 = var4.method582();
						}

						var39 = var4.method531();
						if (var7 != null && var9 < var7.field887.length) {
							var7.field887[var9] = var39;
							var7.field931[var9] = var10;
						}

						class286.method1420(var6, var9, var39 - 1, var10);
					}

					if (null != var7) {
						class184.method836(var7);
					}

					class480.method2369();
					field421[++field422 - 1 & 31] = var6 & 32767;
					var1.field4044 = null;
					return true;
				}

				if (class346.field2835 == var1.field4044) {
					class155.method718(true, var4);
					var1.field4044 = null;
					return true;
				}

				if (class346.field2788 == var1.field4044) {
					var4.field1070 += 28;
					if (var4.method565()) {
						class402.method1987(var4, var4.field1070 - 28);
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2800 == var1.field4044) {
					class297.method1440(class204.field1764);
					var1.field4044 = null;
					return true;
				}

				if (class346.field2877 == var1.field4044) {
					var21 = var4.method531();
					if (var21 == 65535) {
						var21 = -1;
					}

					var6 = var4.method603();
					var28 = var4.method582();
					var87 = class67.method299(var6);
					class263 var90;
					if (!var87.field893) {
						if (var21 == -1) {
							var87.field936 = 0;
							var1.field4044 = null;
							return true;
						}

						var90 = class423.method2062(var21);
						var87.field936 = 4;
						var87.field955 = var21;
						var87.field960 = var90.field2152;
						var87.field947 = var90.field2153;
						var87.field882 = var90.field2151 * 100 / var28;
						class184.method836(var87);
					} else {
						var87.field898 = var21;
						var87.field1028 = var28;
						var90 = class423.method2062(var21);
						var87.field960 = var90.field2152;
						var87.field947 = var90.field2153;
						var87.field946 = var90.field2160;
						var87.field942 = var90.field2155;
						var87.field1034 = var90.field2141;
						var87.field882 = var90.field2151;
						if (var90.field2157 == 1) {
							var87.field952 = 1;
						} else {
							var87.field952 = 2;
						}

						if (var87.field1008 > 0) {
							var87.field882 = var87.field882 * 32 / var87.field1008;
						} else if (var87.field904 > 0) {
							var87.field882 = var87.field882 * 32 / var87.field904;
						}

						class184.method836(var87);
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2871 == var1.field4044) {
					class297.method1440(class204.field1765);
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2865) {
					class84.field697 = var4.method592();
					class169.field1269 = var4.method592();
					var1.field4044 = null;
					return true;
				}

				if (class346.field2849 == var1.field4044) {
					var21 = var4.method603();
					var6 = var4.method574();
					var28 = var4.method574();
					var8 = var4.method574();
					var41 = class67.method299(var21);
					if (var6 != var41.field960 || var41.field947 != var8 || var28 != var41.field882) {
						var41.field960 = var6;
						var41.field947 = var8;
						var41.field882 = var28;
						class184.method836(var41);
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2847 == var1.field4044) {
					var21 = var1.field4047 + var4.field1070;
					var6 = var4.method549();
					var28 = var4.method549();
					if (field393 != var6) {
						field393 = var6;
						this.method195(false);
						class184.method835(field393);
						class148.method696(field393);

						for (var8 = 0; var8 < 100; ++var8) {
							field444[var8] = true;
						}
					}

					class415 var11;
					for (; var28-- > 0; var11.field3425 = true) {
						var8 = var4.method595();
						var9 = var4.method549();
						var10 = var4.method547();
						var11 = (class415)field394.method791((long)var8);
						if (var11 != null && var11.field3426 != var9) {
							class374.method1848(var11, true, (byte)88);
							var11 = null;
						}

						if (var11 == null) {
							var11 = class472.method2332(var8, var9, var10);
						}
					}

					for (var86 = (class415)field394.method789(); var86 != null; var86 = (class415)field394.method790()) {
						if (var86.field3425) {
							var86.field3425 = false;
						} else {
							class374.method1848(var86, true, (byte)93);
						}
					}

					field271 = new class170(512);

					while (var4.field1070 < var21) {
						var8 = var4.method595();
						var9 = var4.method549();
						var10 = var4.method549();
						var39 = var4.method595();

						for (var85 = var9; var85 <= var10; ++var85) {
							var45 = ((long)var8 << 32) + (long)var85;
							field271.method788(new class245(var39), var45);
						}
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2780 == var1.field4044) {
					var6 = var4.method603();
					var21 = var4.method549();
					var40 = field465[var21];
					var28 = var4.method549();
					if (var40 != null) {
						var40.field2654 = var28;
						var40.field2676 = var6 >> 16;
						var40.field2657 = (var6 & 65535) + field231;
						var40.field2655 = 0;
						var40.field2644 = 0;
						if (var40.field2657 > field231) {
							var40.field2655 = -1;
						}

						if (65535 == var40.field2654) {
							var40.field2654 = -1;
						}
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2813) {
					class297.method1440(class204.field1767);
					var1.field4044 = null;
					return true;
				}

				if (class346.field2797 == var1.field4044) {
					if (-1 != field393) {
						class452.method2240(field393, 0);
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2774 == var1.field4044) {
					field484 = true;
					field485 = false;
					class342.field2745 = var4.method547();
					class114.field850 = var4.method547();
					class252.field2083 = var4.method549();
					class4.field25 = var4.method547();
					class397.field3350 = var4.method547();
					if (class397.field3350 >= 100) {
						var21 = class342.field2745 * 128 + 64;
						var6 = 64 + class114.field850 * 128;
						var28 = class327.method1666(var21, var6, class347.field2878) - class252.field2083;
						var8 = var21 - class463.field3850;
						var9 = var28 - class110.field825;
						var10 = var6 - class57.field594;
						var39 = (int)Math.sqrt((double)(var10 * var10 + var8 * var8));
						class442.field3666 = (int)(Math.atan2((double)var9, (double)var39) * 325.9490051269531D) & 2047;
						class22.field105 = (int)(Math.atan2((double)var8, (double)var10) * -325.9490051269531D) & 2047;
						if (class442.field3666 < 128) {
							class442.field3666 = 128;
						}

						if (class442.field3666 > 383) {
							class442.field3666 = 383;
						}
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2844 == var1.field4044) {
					var75 = var4.method548();
					var29 = (long)var4.method549();
					var31 = (long)var4.method551();
					var42 = var31 + (var29 << 32);
					boolean var38 = false;
					class57 var47 = var75 >= 0 ? field345[var75] : class198.field1746;
					if (var47 == null) {
						var38 = true;
					} else {
						for (var14 = 0; var14 < 100; ++var14) {
							if (field236[var14] == var42) {
								var38 = true;
								break;
							}
						}
					}

					if (!var38) {
						field236[field459] = var42;
						field459 = (1 + field459) % 100;
						var36 = class302.method1456(var4);
						var37 = var75 >= 0 ? 43 : 46;
						class65.method296(var37, "", var36, var47.field592);
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2819) {
					class480.method2369();
					field342 = var4.method547();
					field342 = field342 * 664161535 * 100 * 809546495;
					field434 = field418;
					var1.field4044 = null;
					return true;
				}

				if (class346.field2769 == var1.field4044) {
					var21 = var4.method582();
					var56 = var4.method547() == 1;
					var7 = class67.method299(var21);
					if (var56 != var7.field945) {
						var7.field945 = var56;
						class184.method836(var7);
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2848) {
					class123.field1061 = true;
					class155.method718(true, var4);
					var1.field4044 = null;
					return true;
				}

				class120 var72;
				if (class346.field2809 == var1.field4044) {
					var21 = var4.method582();
					var72 = class67.method299(var21);
					var72.field936 = 3;
					var72.field955 = class113.field846.field3194.method1404();
					class184.method836(var72);
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2820) {
					class480.method2369();
					field401 = var4.method550();
					field434 = field418;
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2767) {
					var1.field4044 = null;
					return true;
				}

				if (class346.field2829 == var1.field4044) {
					return this.method187(var1, 2);
				}

				if (class346.field2762 == var1.field4044) {
					var21 = var4.method595();
					if (var21 != field502) {
						field502 = var21;
						class427.method2088();
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2796) {
					var50 = var4.method555();
					Object[] var73 = new Object[var50.length() + 1];

					for (var28 = var50.length() - 1; var28 >= 0; --var28) {
						if (var50.charAt(var28) == 's') {
							var73[var28 + 1] = var4.method555();
						} else {
							var73[var28 + 1] = new Integer(var4.method595());
						}
					}

					var73[0] = new Integer(var4.method595());
					class488 var53 = new class488();
					var53.field4069 = var73;
					class396.method1949(var53);
					var1.field4044 = null;
					return true;
				}

				if (class346.field2836 == var1.field4044) {
					var21 = var4.method595();
					var6 = var4.method574();
					var7 = class67.method299(var21);
					if (null != var7 && 0 == var7.field1026) {
						if (var6 > var7.field916 - var7.field967) {
							var6 = var7.field916 - var7.field967;
						}

						if (var6 < 0) {
							var6 = 0;
						}

						if (var6 != var7.field914) {
							var7.field914 = var6;
							class184.method836(var7);
						}
					}

					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2840) {
					var21 = var4.method575();
					class89.method379(var21);
					field421[++field422 - 1 & 31] = var21 & 32767;
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2831) {
					var21 = var4.method547();
					var6 = var4.method547();
					var28 = var4.method547();
					var8 = var4.method547();
					field486[var21] = true;
					field516[var21] = var6;
					field488[var21] = var28;
					field489[var21] = var8;
					field330[var21] = 0;
					var1.field4044 = null;
					return true;
				}

				if (class346.field2852 == var1.field4044) {
					field473 = var4.method547();
					if (255 == field473) {
						field473 = 0;
					}

					field219 = var4.method547();
					if (field219 == 255) {
						field219 = 0;
					}

					var1.field4044 = null;
					return true;
				}

				if (class346.field2818 == var1.field4044) {
					var21 = var4.method595();
					var72 = class67.method299(var21);

					for (var28 = 0; var28 < var72.field887.length; ++var28) {
						var72.field887[var28] = -1;
						var72.field887[var28] = 0;
					}

					class184.method836(var72);
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2839) {
					var21 = var4.method547();
					class284.method1403(var21);
					var1.field4044 = null;
					return false;
				}

				if (class346.field2794 == var1.field4044) {
					field455 = var4.method547();
					field456 = var4.method592();
					var1.field4044 = null;
					return true;
				}

				if (var1.field4044 == class346.field2764) {
					class297.method1440(class204.field1761);
					var1.field4044 = null;
					return true;
				}

				class445.method2199("" + (null != var1.field4044 ? -170435115 * var1.field4044.field2876 * 1034875773 : -1) + class442.field3659 + (var1.field4050 != null ? -170435115 * var1.field4050.field2876 * 1034875773 : -1) + class442.field3659 + (var1.field4051 != null ? var1.field4051.field2876 : -1) + class442.field3659 + var1.field4047, (Throwable)null);
				class380.method1887();
			} catch (IOException var48) {
				class149.method698();
			} catch (Exception var49) {
				var22 = "" + (var1.field4044 != null ? var1.field4044.field2876 : -1) + class442.field3659 + (null != var1.field4050 ? -170435115 * var1.field4050.field2876 * 1034875773 : -1) + class442.field3659 + (var1.field4051 != null ? var1.field4051.field2876 : -1) + class442.field3659 + var1.field4047 + class442.field3659 + (class312.field2465 + class113.field846.field2633[0]) + class442.field3659 + (class113.field846.field2681[0] + class325.field2575) + class442.field3659;

				for (var28 = 0; var28 < var1.field4047 && var28 < 50; ++var28) {
					var22 = var22 + var4.field1072[var28] + class442.field3659;
				}

				class445.method2199(var22, var49);
				class380.method1887();
			}

			return true;
		}
	}

	@ObfInfo(
		owner = "client",
		name = "jr",
		desc = "(I)V"
	)
	final void method190() {
		boolean var2 = false;

		int var3;
		int var6;
		while (!var2) {
			var2 = true;

			for (var3 = 0; var3 < field369 - 1; ++var3) {
				if (field463[var3] < 1000 && field463[var3 + 1] > 1000) {
					String var4 = field256[var3];
					field256[var3] = field256[var3 + 1];
					field256[var3 + 1] = var4;
					String var5 = field375[var3];
					field375[var3] = field375[var3 + 1];
					field375[var3 + 1] = var5;
					var6 = field463[var3];
					field463[var3] = field463[var3 + 1];
					field463[var3 + 1] = var6;
					var6 = field370[var3];
					field370[var3] = field370[var3 + 1];
					field370[var3 + 1] = var6;
					var6 = field363[var3];
					field363[var3] = field363[var3 + 1];
					field363[var3 + 1] = var6;
					var6 = field333[var3];
					field333[var3] = field333[var3 + 1];
					field333[var3 + 1] = var6;
					var6 = field374[var3];
					field374[var3] = field374[var3 + 1];
					field374[var3 + 1] = var6;
					boolean var7 = field377[var3];
					field377[var3] = field377[var3 + 1];
					field377[var3 + 1] = var7;
					var2 = false;
				}
			}
		}

		if (null == class321.field2562) {
			if (null == field406) {
				int var22;
				label220: {
					int var21 = class466.field3869;
					int var8;
					int var10;
					int var12;
					int var17;
					int var23;
					if (field368) {
						int var16;
						if (var21 != 1 && (class151.field1180 || var21 != 4)) {
							var3 = class466.field3863;
							var16 = class466.field3858;
							if (var3 < class198.field1745 - 10 || var3 > 10 + class483.field4027 + class198.field1745 || var16 < class267.field2215 - 10 || var16 > class466.field3872 + class267.field2215 + 10) {
								field368 = false;
								class408.method2001(class198.field1745, class267.field2215, class483.field4027, class466.field3872);
							}
						}

						if (var21 == 1 || !class151.field1180 && var21 == 4) {
							var3 = class198.field1745;
							var16 = class267.field2215;
							var17 = class483.field4027;
							var6 = class466.field3870;
							var22 = class466.field3867;
							var8 = -1;

							for (var23 = 0; var23 < field369; ++var23) {
								var10 = 15 * (field369 - 1 - var23) + var16 + 31;
								if (var6 > var3 && var6 < var17 + var3 && var22 > var10 - 13 && var22 < var10 + 3) {
									var8 = var23;
								}
							}

							if (var8 != -1 && var8 >= 0) {
								var23 = field370[var8];
								var10 = field363[var8];
								int var24 = field463[var8];
								var12 = field333[var8];
								int var13 = field374[var8];
								String var14 = field375[var8];
								String var15 = field256[var8];
								class35.method147(var23, var10, var24, var12, var13, var14, var15, class466.field3870, class466.field3867);
							}

							field368 = false;
							class408.method2001(class198.field1745, class267.field2215, class483.field4027, class466.field3872);
						}
					} else {
						var3 = field369 - 1;
						if ((var21 == 1 || !class151.field1180 && var21 == 4) && var3 >= 0) {
							var17 = field463[var3];
							if (var17 == 39 || var17 == 40 || var17 == 41 || var17 == 42 || var17 == 43 || var17 == 33 || var17 == 34 || var17 == 35 || var17 == 36 || var17 == 37 || var17 == 38 || var17 == 1005) {
								var6 = field370[var3];
								var22 = field363[var3];
								class120 var18 = class67.method299(var22);
								var10 = class203.method892(var18);
								boolean var9 = 0 != (var10 >> 28 & 1);
								if (var9) {
									break label220;
								}

								var12 = class203.method892(var18);
								boolean var11 = (var12 >> 29 & 1) != 0;
								if (var11) {
									break label220;
								}
							}
						}

						if ((var21 == 1 || !class151.field1180 && var21 == 4) && this.method182()) {
							var21 = 2;
						}

						if ((var21 == 1 || !class151.field1180 && var21 == 4) && field369 > 0 && var3 >= 0) {
							var17 = field370[var3];
							var6 = field363[var3];
							var22 = field463[var3];
							var8 = field333[var3];
							var23 = field374[var3];
							String var20 = field375[var3];
							String var19 = field256[var3];
							class35.method147(var17, var6, var22, var8, var23, var20, var19, class466.field3870, class466.field3867);
						}

						if (var21 == 2 && field369 > 0) {
							this.method183(class466.field3870, class466.field3867);
						}
					}

					return;
				}

				if (null != class321.field2562 && !field343 && field369 > 0 && !this.method182()) {
					class221.method981(field340, field341);
				}

				field343 = false;
				field344 = 0;
				if (null != class321.field2562) {
					class184.method836(class321.field2562);
				}

				class321.field2562 = class67.method299(var22);
				field331 = var6;
				field340 = class466.field3870;
				field341 = class466.field3867;
				if (var3 >= 0) {
					class408.method1998(var3);
				}

				class184.method836(class321.field2562);
			}
		}
	}

	@ObfInfo(
		owner = "client",
		name = "jp",
		desc = "(I)Z"
	)
	final boolean method182() {
		int var2 = field369 - 1;
		return (field311 && field369 > 2 || class228.method996(var2)) && !field377[var2];
	}

	@ObfInfo(
		owner = "client",
		name = "jn",
		desc = "(III)V"
	)
	final void method183(int var1, int var2) {
		int var4 = class114.field848.method2045(class177.field1539);

		int var5;
		int var6;
		for (var5 = 0; var5 < field369; ++var5) {
			var6 = class114.field848.method2045(class189.method857(var5));
			if (var6 > var4) {
				var4 = var6;
			}
		}

		var4 += 8;
		var5 = 22 + field369 * 15;
		var6 = var1 - var4 / 2;
		if (var4 + var6 > class427.field3529) {
			var6 = class427.field3529 - var4;
		}

		if (var6 < 0) {
			var6 = 0;
		}

		int var7 = var2;
		if (var5 + var2 > class476.field4003) {
			var7 = class476.field4003 - var5;
		}

		if (var7 < 0) {
			var7 = 0;
		}

		class198.field1745 = var6;
		class267.field2215 = var7;
		class483.field4027 = var4;
		class466.field3872 = field369 * 15 + 22;
		var1 -= field372;
		var2 -= field500;
		class408.field3415.method1599(class347.field2878, var1, var2, false);
		field368 = true;
	}

	@ObfInfo(
		owner = "client",
		name = "kb",
		desc = "(ZI)V"
	)
	final void method195(boolean var1) {
		class355.method1774(field393, class427.field3529, class476.field4003, var1);
	}

	@ObfInfo(
		owner = "client",
		name = "kp",
		desc = "(Lkd;I)V"
	)
	void method194(class120 var1) {
		class120 var3 = var1.field912 == -1 ? null : class67.method299(var1.field912);
		int var4;
		int var5;
		if (null == var3) {
			var4 = class427.field3529;
			var5 = class476.field4003;
		} else {
			var4 = var3.field908;
			var5 = var3.field967;
		}

		class380.method1885(var1, var4, var5, false);
		class306.method1491(var1, var4, var5);
	}

	@ObfInfo(
		owner = "client",
		name = "ls",
		desc = "(I)V"
	)
	final void method185() {
		class184.method836(field406);
		++class161.field1220;
		if (field414 && field458) {
			int var2 = class466.field3863;
			int var3 = class466.field3858;
			var2 -= field408;
			var3 -= field409;
			if (var2 < field412) {
				var2 = field412;
			}

			if (field406.field908 + var2 > field412 + field407.field908) {
				var2 = field412 + field407.field908 - field406.field908;
			}

			if (var3 < field326) {
				var3 = field326;
			}

			if (var3 + field406.field967 > field326 + field407.field967) {
				var3 = field326 + field407.field967 - field406.field967;
			}

			int var4 = var2 - field232;
			int var5 = var3 - field416;
			int var6 = field406.field980;
			if (class161.field1220 > field406.field933 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
				field417 = true;
			}

			int var7 = var2 - field412 + field407.field920;
			int var8 = field407.field914 + (var3 - field326);
			class488 var9;
			if (field406.field1037 != null && field417) {
				var9 = new class488();
				var9.field4067 = field406;
				var9.field4065 = var7;
				var9.field4071 = var8;
				var9.field4069 = field406.field1037;
				class396.method1949(var9);
			}

			if (class466.field3862 == 0) {
				if (field417) {
					if (field406.field994 != null) {
						var9 = new class488();
						var9.field4067 = field406;
						var9.field4065 = var7;
						var9.field4071 = var8;
						var9.field4077 = field410;
						var9.field4069 = field406.field994;
						class396.method1949(var9);
					}

					if (null != field410) {
						class120 var10 = field406;
						int var12 = class203.method892(var10);
						int var11 = var12 >> 17 & 7;
						int var13 = var11;
						class120 var16;
						if (var11 == 0) {
							var16 = null;
						} else {
							int var14 = 0;

							while (true) {
								if (var14 >= var13) {
									var16 = var10;
									break;
								}

								var10 = class67.method299(var10.field912);
								if (var10 == null) {
									var16 = null;
									break;
								}

								++var14;
							}
						}

						if (var16 != null) {
							class299 var15 = class480.method2370(class356.field3009, field279.field4042);
							var15.field2403.method584(field406.field898);
							var15.field2403.method573(field406.field895);
							var15.field2403.method581(field410.field985);
							var15.field2403.method579(field406.field985);
							var15.field2403.method584(field410.field895);
							var15.field2403.method584(field410.field898);
							field279.method2389(var15);
						}
					}
				} else if (this.method182()) {
					this.method183(field232 + field408, field409 + field416);
				} else if (field369 > 0) {
					class221.method981(field232 + field408, field416 + field409);
				}

				field406 = null;
			}

		} else {
			if (class161.field1220 > 1) {
				if (!field417 && field369 > 0) {
					class221.method981(field408 + field232, field416 + field409);
				}

				field406 = null;
			}

		}
	}

	@ObfInfo(
		owner = "client",
		name = "mw",
		desc = "(B)Lrp;"
	)
	public class257 method1021() {
		return null != class113.field846 ? class113.field846.field3207 : null;
	}

	@ObfInfo(
		owner = "client",
		name = "fm",
		desc = "(B)Lpb;"
	)
	static class272 method197() {
		return class164.field1249;
	}

	@ObfInfo(
		owner = "client",
		name = "z",
		desc = "(ILbm;ZI)I"
	)
	static int method196(int var0, class461 var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			class161.field1227 -= 3;
			class338.method1699(class386.field3248[class161.field1227], class386.field3248[1 + class161.field1227], class386.field3248[class161.field1227 + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			class378.method1863(class386.field3248[--class161.field1227]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			class161.field1227 -= 2;
			class199.method879(class386.field3248[class161.field1227], class386.field3248[class161.field1227 + 1]);
			return 1;
		} else {
			class161 var4;
			class112 var5;
			int var6;
			int var7;
			String var8;
			if (var0 != ScriptOpcodes.SETDEVICEOPTION && var0 != ScriptOpcodes.SETGAMEOPTION && var0 != ScriptOpcodes.SETCLIENTOPTION && var0 != ScriptOpcodes.SETBRIGHTNESS && var0 != ScriptOpcodes.SETVOLUMEMUSIC && var0 != ScriptOpcodes.SETVOLUMESOUNDS && var0 != ScriptOpcodes.SETVOLUMEAREASOUNDS) {
				if (var0 != ScriptOpcodes.GETDEVICEOPTION && var0 != ScriptOpcodes.GETGAMEOPTION && var0 != ScriptOpcodes.GETCLIENTOPTION && var0 != ScriptOpcodes.GETBRIGHTNESS && var0 != ScriptOpcodes.GETVOLUMEMUSIC && var0 != ScriptOpcodes.GETVOLUMESOUNDS && var0 != ScriptOpcodes.GETVOLUMEAREASOUNDS) {
					return var0 == ScriptOpcodes._3211 ? 1 : 2;
				} else {
					var4 = class161.field1224;
					var5 = class112.field841;
					boolean var9 = false;
					if (var0 == ScriptOpcodes.GETDEVICEOPTION) {
						var7 = class386.field3248[--class161.field1227];
						var4 = (class161)class2.method10(class277.method1388(), var7);
						if (var4 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var7));
						}
					}

					if (var0 == ScriptOpcodes.GETGAMEOPTION) {
						var7 = class386.field3248[--class161.field1227];
						var5 = (class112)class2.method10(class413.method2011(), var7);
						if (var5 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var7));
						}
					}

					if (var0 == ScriptOpcodes.GETCLIENTOPTION) {
						var7 = class386.field3248[--class161.field1227];
						var4 = (class161)class2.method10(class277.method1388(), var7);
						if (var4 == null) {
							var5 = (class112)class2.method10(class413.method2011(), var7);
							if (var5 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var7));
							}
						}
					} else if (var0 == ScriptOpcodes.GETBRIGHTNESS) {
						var4 = class161.field1228;
					} else if (var0 == ScriptOpcodes.GETVOLUMEMUSIC) {
						var5 = class112.field833;
					} else if (var0 == ScriptOpcodes.GETVOLUMESOUNDS) {
						var5 = class112.field836;
					} else if (var0 == ScriptOpcodes.GETVOLUMEAREASOUNDS) {
						var5 = class112.field837;
					}

					if (var5 == class112.field841) {
						switch(var4.field1225) {
						case 1:
							var6 = class50.field574.method2203() ? 1 : 0;
							break;
						case 2:
							var6 = class50.field574.method2213() ? 1 : 0;
							break;
						case 3:
							var6 = class50.field574.method2205() ? 1 : 0;
							break;
						case 4:
							var6 = class50.field574.method2207();
							break;
						case 5:
							var6 = class424.method2069();
							break;
						default:
							var8 = String.format("Unkown device option: %s.", var4.toString());
							throw new RuntimeException(var8);
						}
					} else {
						switch(var5.field835) {
						case 1:
							var6 = class50.field574.method2202() ? 1 : 0;
							break;
						case 2:
							var7 = class50.field574.method2210();
							var6 = Math.round((float)(var7 * 100) / 255.0F);
							break;
						case 3:
							var7 = class50.field574.method2211();
							var6 = Math.round((float)(var7 * 100) / 127.0F);
							break;
						case 4:
							var7 = class50.field574.method2230();
							var6 = Math.round((float)(var7 * 100) / 127.0F);
							break;
						default:
							var8 = String.format("Unkown game option: %s.", var5.toString());
							throw new RuntimeException(var8);
						}
					}

					class386.field3248[++class161.field1227 - 1] = var6;
					return 1;
				}
			} else {
				var4 = class161.field1224;
				var5 = class112.field841;
				var6 = class386.field3248[--class161.field1227];
				if (var0 == ScriptOpcodes.SETDEVICEOPTION) {
					var7 = class386.field3248[--class161.field1227];
					var4 = (class161)class2.method10(class277.method1388(), var7);
					if (null == var4) {
						throw new RuntimeException(String.format("Unrecognized device option %d", var7));
					}
				}

				if (var0 == ScriptOpcodes.SETGAMEOPTION) {
					var7 = class386.field3248[--class161.field1227];
					var5 = (class112)class2.method10(class413.method2011(), var7);
					if (null == var5) {
						throw new RuntimeException(String.format("Unrecognized game option %d", var7));
					}
				}

				if (var0 == ScriptOpcodes.SETCLIENTOPTION) {
					var7 = class386.field3248[--class161.field1227];
					var4 = (class161)class2.method10(class277.method1388(), var7);
					if (var4 == null) {
						var5 = (class112)class2.method10(class413.method2011(), var7);
						if (null == var5) {
							throw new RuntimeException(String.format("Unrecognized client option %d", var7));
						}
					}
				} else if (var0 == ScriptOpcodes.SETBRIGHTNESS) {
					var4 = class161.field1228;
				} else if (var0 == ScriptOpcodes.SETVOLUMEMUSIC) {
					var5 = class112.field833;
				} else if (var0 == ScriptOpcodes.SETVOLUMESOUNDS) {
					var5 = class112.field836;
				} else if (var0 == ScriptOpcodes.SETVOLUMEAREASOUNDS) {
					var5 = class112.field837;
				}

				if (class112.field841 == var5) {
					switch(var4.field1225) {
					case 1:
						class50.field574.method2225(var6 == 1);
						break;
					case 2:
						class50.field574.method2223(var6 == 1);
						break;
					case 3:
						class50.field574.method2226(var6 == 1);
						break;
					case 4:
						if (var6 < 0) {
							var6 = 0;
						}

						class50.field574.method2206(var6);
						break;
					case 5:
						class19.method90(var6);
						break;
					default:
						var8 = String.format("Unkown device option: %s.", var4.toString());
						throw new RuntimeException(var8);
					}
				} else {
					switch(var5.field835) {
					case 1:
						class50.field574.method2229(var6 == 1);
						break;
					case 2:
						var6 = Math.min(Math.max(var6, 0), 100);
						var7 = Math.round((float)(var6 * 255) / 100.0F);
						class72.method314(var7);
						break;
					case 3:
						var6 = Math.min(Math.max(var6, 0), 100);
						var7 = Math.round((float)(var6 * 127) / 100.0F);
						class472.method2331(var7);
						break;
					case 4:
						var6 = Math.min(Math.max(var6, 0), 100);
						var7 = Math.round((float)(var6 * 127) / 100.0F);
						class362.method1807(var7);
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

	@ObfInfo(
		owner = "client",
		name = "gs",
		desc = "(S)V"
	)
	static final void method189() {
		if (null != class288.field2367) {
			class288.field2367.method1018();
		}

		if (null != class402.field3388) {
			class402.field3388.method1018();
		}

	}
}
