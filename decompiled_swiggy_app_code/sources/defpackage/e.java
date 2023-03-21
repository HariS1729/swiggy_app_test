package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.IInterface;
import android.text.TextUtils;
import android.util.Log;
import bb.h;
import com.amazon.identity.auth.device.AuthError;
import com.truecaller.android.sdk.TruecallerSdkScope;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.http2.Settings;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;
import org.apache.fontbox.ttf.WGL4Names;

/* renamed from: e  reason: default package */
public class e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f14145a = "e";

    /* renamed from: b  reason: collision with root package name */
    static String f14146b = "7cac391937981b6134bdce1fd9834c253181f5abf91ded6078210d0f91ace360";

    /* renamed from: c  reason: collision with root package name */
    private static String f14147c = "2f19adeb284eb36f7f07786152b9a1d14b21653203ad0b04ebbf9c73ab6d7625";

    /* renamed from: d  reason: collision with root package name */
    private static Object f14148d = new Object();

    /* renamed from: e$a */
    class a implements r1 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f14149a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f14150b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Intent f14151c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f14152d;

        a(c cVar, d dVar, Intent intent, CountDownLatch countDownLatch) {
            this.f14149a = cVar;
            this.f14150b = dVar;
            this.f14151c = intent;
            this.f14152d = countDownLatch;
        }

        public void a(IInterface iInterface) {
            this.f14149a.j(iInterface);
            this.f14149a.g(this.f14150b);
            this.f14149a.i(this.f14151c);
            this.f14152d.countDown();
        }

        public void b(AuthError authError) {
            this.f14149a.j((IInterface) null);
            this.f14149a.g((d) null);
            this.f14149a.i((Intent) null);
            k1.i(e.f14145a, "Bind - error");
            this.f14152d.countDown();
        }
    }

    /* renamed from: e$b */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        static c f14155a;

        /* renamed from: b  reason: collision with root package name */
        static long f14156b;

        public static c a() {
            return f14155a;
        }

        static void b(c cVar) {
            f14155a = cVar;
            f14156b = cVar == null ? 0 : new Date().getTime();
        }

        static boolean c() {
            return f14155a == null || new Date().getTime() > f14156b + 86400000;
        }
    }

    /* renamed from: e$c */
    class c {

        /* renamed from: a  reason: collision with root package name */
        private final cr f38217a;

        /* renamed from: b  reason: collision with root package name */
        private IInterface f38218b;

        /* renamed from: c  reason: collision with root package name */
        private d f38219c;

        /* renamed from: d  reason: collision with root package name */
        private Intent f38220d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f38221e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final ResolveInfo f38222f;

        public c(cr crVar, IInterface iInterface, d dVar, boolean z11, ResolveInfo resolveInfo, Intent intent) {
            this.f38217a = crVar;
            this.f38218b = iInterface;
            g(dVar);
            this.f38221e = z11;
            this.f38222f = resolveInfo;
            this.f38220d = intent;
        }

        /* access modifiers changed from: private */
        public ResolveInfo c() {
            return this.f38222f;
        }

        /* access modifiers changed from: private */
        public void g(d dVar) {
            this.f38219c = dVar;
        }

        public d a() {
            return this.f38219c;
        }

        public Intent b() {
            return this.f38220d;
        }

        public IInterface e() {
            return this.f38218b;
        }

        public cr f() {
            return this.f38217a;
        }

        public void i(Intent intent) {
            this.f38220d = intent;
        }

        public void j(IInterface iInterface) {
            this.f38218b = iInterface;
        }
    }

    /* renamed from: e$d */
    /* compiled from: WavDescriptor */
    public class d extends h<C0449e> {
        public d(C0449e eVar) {
            super(eVar);
        }

        public String f(int i11) {
            return super.f(i11);
        }
    }

    /* renamed from: e$e  reason: collision with other inner class name */
    /* compiled from: WavDirectory */
    public class C0449e extends bb.b {

        /* renamed from: f  reason: collision with root package name */
        protected static final HashMap<Integer, String> f38224f;

        /* renamed from: g  reason: collision with root package name */
        protected static final transient HashMap<String, Integer> f38225g;

        /* renamed from: h  reason: collision with root package name */
        protected static final transient HashMap<Integer, String> f38226h;

        static {
            HashMap<Integer, String> hashMap = new HashMap<>();
            f38224f = hashMap;
            HashMap<String, Integer> hashMap2 = new HashMap<>();
            f38225g = hashMap2;
            HashMap<Integer, String> hashMap3 = new HashMap<>();
            f38226h = hashMap3;
            hashMap2.put("IART", 7);
            hashMap2.put("INAM", 8);
            hashMap2.put("IPRD", 9);
            hashMap2.put("ITRK", 10);
            hashMap2.put("ICRD", 11);
            hashMap2.put("IGNR", 12);
            hashMap2.put("ICMT", 13);
            hashMap2.put("ICOP", 14);
            hashMap2.put("ISFT", 15);
            hashMap.put(1, "Format");
            hashMap.put(2, "Channels");
            hashMap.put(3, "Samples Per Second");
            hashMap.put(4, "Bytes Per Second");
            hashMap.put(5, "Block Alignment");
            hashMap.put(6, "Bits Per Sample");
            hashMap.put(7, "Artist");
            hashMap.put(8, "Title");
            hashMap.put(9, "Product");
            hashMap.put(10, "Track Number");
            hashMap.put(11, "Date Created");
            hashMap.put(12, "Genre");
            hashMap.put(13, "Comments");
            hashMap.put(14, "Copyright");
            hashMap.put(15, "Software");
            hashMap.put(16, "Duration");
            hashMap3.put(1, "Microsoft PCM");
            hashMap3.put(2, "Microsoft ADPCM");
            hashMap3.put(3, "Microsoft IEEE float");
            hashMap3.put(4, "Compaq VSELP");
            hashMap3.put(5, "IBM CVSD");
            hashMap3.put(6, "Microsoft a-Law");
            hashMap3.put(7, "Microsoft u-Law");
            hashMap3.put(8, "Microsoft DTS");
            hashMap3.put(9, "DRM");
            hashMap3.put(10, "WMA 9 Speech");
            hashMap3.put(11, "Microsoft Windows Media RT Voice");
            hashMap3.put(16, "OKI-ADPCM");
            hashMap3.put(17, "Intel IMA/DVI-ADPCM");
            hashMap3.put(18, "Videologic Mediaspace ADPCM");
            hashMap3.put(19, "Sierra ADPCM");
            hashMap3.put(20, "Antex G.723 ADPCM");
            hashMap3.put(21, "DSP Solutions DIGISTD");
            hashMap3.put(22, "DSP Solutions DIGIFIX");
            hashMap3.put(23, "Dialoic OKI ADPCM");
            hashMap3.put(24, "Media Vision ADPCM");
            hashMap3.put(25, "HP CU");
            hashMap3.put(26, "HP Dynamic Voice");
            hashMap3.put(32, "Yamaha ADPCM");
            hashMap3.put(33, "SONARC Speech Compression");
            hashMap3.put(34, "DSP Group True Speech");
            hashMap3.put(35, "Echo Speech Corp.");
            hashMap3.put(36, "Virtual Music Audiofile AF36");
            hashMap3.put(37, "Audio Processing Tech.");
            hashMap3.put(38, "Virtual Music Audiofile AF10");
            hashMap3.put(39, "Aculab Prosody 1612");
            hashMap3.put(40, "Merging Tech. LRC");
            hashMap3.put(48, "Dolby AC2");
            hashMap3.put(49, "Microsoft GSM610");
            hashMap3.put(50, "MSN Audio");
            hashMap3.put(51, "Antex ADPCME");
            hashMap3.put(52, "Control Resources VQLPC");
            hashMap3.put(53, "DSP Solutions DIGIREAL");
            hashMap3.put(54, "DSP Solutions DIGIADPCM");
            hashMap3.put(55, "Control Resources CR10");
            hashMap3.put(56, "Natural MicroSystems VBX ADPCM");
            hashMap3.put(57, "Crystal Semiconductor IMA ADPCM");
            hashMap3.put(58, "Echo Speech ECHOSC3");
            hashMap3.put(59, "Rockwell ADPCM");
            hashMap3.put(60, "Rockwell DIGITALK");
            hashMap3.put(61, "Xebec Multimedia");
            hashMap3.put(64, "Antex G.721 ADPCM");
            hashMap3.put(65, "Antex G.728 CELP");
            hashMap3.put(66, "Microsoft MSG723");
            hashMap3.put(67, "IBM AVC ADPCM");
            hashMap3.put(69, "ITU-T G.726");
            hashMap3.put(80, "Microsoft MPEG");
            hashMap3.put(81, "RT23 or PAC");
            hashMap3.put(82, "InSoft RT24");
            hashMap3.put(83, "InSoft PAC");
            hashMap3.put(85, "MP3");
            hashMap3.put(89, "Cirrus");
            hashMap3.put(96, "Cirrus Logic");
            hashMap3.put(97, "ESS Tech. PCM");
            hashMap3.put(98, "Voxware Inc.");
            hashMap3.put(99, "Canopus ATRAC");
            hashMap3.put(100, "APICOM G.726 ADPCM");
            hashMap3.put(101, "APICOM G.722 ADPCM");
            hashMap3.put(102, "Microsoft DSAT");
            hashMap3.put(103, "Micorsoft DSAT DISPLAY");
            hashMap3.put(105, "Voxware Byte Aligned");
            hashMap3.put(112, "Voxware AC8");
            hashMap3.put(113, "Voxware AC10");
            hashMap3.put(114, "Voxware AC16");
            hashMap3.put(115, "Voxware AC20");
            hashMap3.put(116, "Voxware MetaVoice");
            hashMap3.put(117, "Voxware MetaSound");
            hashMap3.put(118, "Voxware RT29HW");
            hashMap3.put(119, "Voxware VR12");
            hashMap3.put(120, "Voxware VR18");
            hashMap3.put(121, "Voxware TQ40");
            hashMap3.put(122, "Voxware SC3");
            hashMap3.put(123, "Voxware SC3");
            hashMap3.put(128, "Soundsoft");
            hashMap3.put(129, "Voxware TQ60");
            hashMap3.put(130, "Microsoft MSRT24");
            hashMap3.put(131, "AT&T G.729A");
            hashMap3.put(132, "Motion Pixels MVI MV12");
            hashMap3.put(133, "DataFusion G.726");
            hashMap3.put(134, "DataFusion GSM610");
            hashMap3.put(136, "Iterated Systems Audio");
            hashMap3.put(137, "Onlive");
            hashMap3.put(138, "Multitude, Inc. FT SX20");
            hashMap3.put(139, "Infocom ITS A/S G.721 ADPCM");
            hashMap3.put(140, "Convedia G729");
            hashMap3.put(141, "Not specified congruency, Inc.");
            hashMap3.put(145, "Siemens SBC24");
            hashMap3.put(146, "Sonic Foundry Dolby AC3 APDIF");
            hashMap3.put(147, "MediaSonic G.723");
            hashMap3.put(148, "Aculab Prosody 8kbps");
            hashMap3.put(151, "ZyXEL ADPCM");
            hashMap3.put(152, "Philips LPCBB");
            hashMap3.put(153, "Studer Professional Audio Packed");
            hashMap3.put(160, "Malden PhonyTalk");
            hashMap3.put(161, "Racal Recorder GSM");
            hashMap3.put(162, "Racal Recorder G720.a");
            hashMap3.put(163, "Racal G723.1");
            hashMap3.put(164, "Racal Tetra ACELP");
            hashMap3.put(176, "NEC AAC NEC Corporation");
            hashMap3.put(255, "AAC");
            hashMap3.put(256, "Rhetorex ADPCM");
            hashMap3.put(257, "IBM u-Law");
            hashMap3.put(Integer.valueOf(WGL4Names.NUMBER_OF_MAC_GLYPHS), "IBM a-Law");
            hashMap3.put(259, "IBM ADPCM");
            hashMap3.put(273, "Vivo G.723");
            hashMap3.put(274, "Vivo Siren");
            hashMap3.put(288, "Philips Speech Processing CELP");
            hashMap3.put(289, "Philips Speech Processing GRUNDIG");
            hashMap3.put(291, "Digital G.723");
            hashMap3.put(293, "Sanyo LD ADPCM");
            hashMap3.put(304, "Sipro Lab ACEPLNET");
            hashMap3.put(305, "Sipro Lab ACELP4800");
            hashMap3.put(306, "Sipro Lab ACELP8V3");
            hashMap3.put(Integer.valueOf(StatusLine.HTTP_TEMP_REDIRECT), "Sipro Lab G.729");
            hashMap3.put(Integer.valueOf(StatusLine.HTTP_PERM_REDIRECT), "Sipro Lab G.729A");
            hashMap3.put(309, "Sipro Lab Kelvin");
            hashMap3.put(310, "VoiceAge AMR");
            hashMap3.put(320, "Dictaphone G.726 ADPCM");
            hashMap3.put(336, "Qualcomm PureVoice");
            hashMap3.put(337, "Qualcomm HalfRate");
            hashMap3.put(341, "Ring Zero Systems TUBGSM");
            hashMap3.put(352, "Microsoft Audio1");
            hashMap3.put(353, "Windows Media Audio V2 V7 V8 V9 / DivX audio (WMA) / Alex AC3 Audio");
            hashMap3.put(354, "Windows Media Audio Professional V9");
            hashMap3.put(355, "Windows Media Audio Lossless V9");
            hashMap3.put(356, "WMA Pro over S/PDIF");
            hashMap3.put(368, "UNISYS NAP ADPCM");
            hashMap3.put(369, "UNISYS NAP ULAW");
            hashMap3.put(370, "UNISYS NAP ALAW");
            hashMap3.put(371, "UNISYS NAP 16K");
            hashMap3.put(372, "MM SYCOM ACM SYC008 SyCom Technologies");
            hashMap3.put(373, "MM SYCOM ACM SYC701 G726L SyCom Technologies");
            hashMap3.put(374, "MM SYCOM ACM SYC701 CELP54 SyCom Technologies");
            hashMap3.put(375, "MM SYCOM ACM SYC701 CELP68 SyCom Technologies");
            hashMap3.put(376, "Knowledge Adventure ADPCM");
            hashMap3.put(384, "Fraunhofer IIS MPEG2AAC");
            hashMap3.put(Integer.valueOf(OS2WindowsMetricsTable.WEIGHT_CLASS_NORMAL), "Digital Theater Systems DTS DS");
            hashMap3.put(Integer.valueOf(TruecallerSdkScope.FOOTER_TYPE_MANUALLY), "Creative Labs ADPCM");
            hashMap3.put(514, "Creative Labs FASTSPEECH8");
            hashMap3.put(515, "Creative Labs FASTSPEECH10");
            hashMap3.put(528, "UHER ADPCM");
            hashMap3.put(533, "Ulead DV ACM");
            hashMap3.put(534, "Ulead DV ACM");
            hashMap3.put(544, "Quarterdeck Corp.");
            hashMap3.put(560, "I-Link VC");
            hashMap3.put(576, "Aureal Semiconductor Raw Sport");
            hashMap3.put(577, "ESST AC3");
            hashMap3.put(592, "Interactive Products HSX");
            hashMap3.put(593, "Interactive Products RPELP");
            hashMap3.put(608, "Consistent CS2");
            hashMap3.put(624, "Sony SCX");
            hashMap3.put(625, "Sony SCY");
            hashMap3.put(626, "Sony ATRAC3");
            hashMap3.put(627, "Sony SPC");
            hashMap3.put(640, "TELUM Telum Inc.");
            hashMap3.put(641, "TELUMIA Telum Inc.");
            hashMap3.put(645, "Norcom Voice Systems ADPCM");
            hashMap3.put(768, "Fujitsu FM TOWNS SND");
            hashMap3.put(769, "Fujitsu (not specified)");
            hashMap3.put(770, "Fujitsu (not specified)");
            hashMap3.put(771, "Fujitsu (not specified)");
            hashMap3.put(772, "Fujitsu (not specified)");
            hashMap3.put(773, "Fujitsu (not specified)");
            hashMap3.put(774, "Fujitsu (not specified)");
            hashMap3.put(775, "Fujitsu (not specified)");
            hashMap3.put(776, "Fujitsu (not specified)");
            hashMap3.put(848, "Micronas Semiconductors, Inc. Development");
            hashMap3.put(849, "Micronas Semiconductors, Inc. CELP833");
            hashMap3.put(1024, "Brooktree Digital");
            hashMap3.put(1025, "Intel Music Coder (IMC)");
            hashMap3.put(1026, "Ligos Indeo Audio");
            hashMap3.put(1104, "QDesign Music");
            hashMap3.put(1280, "On2 VP7 On2 Technologies");
            hashMap3.put(1281, "On2 VP6 On2 Technologies");
            hashMap3.put(1664, "AT&T VME VMPCM");
            hashMap3.put(1665, "AT&T TCP");
            hashMap3.put(1792, "YMPEG Alpha (dummy for MPEG-2 compressor)");
            hashMap3.put(2222, "ClearJump LiteWave (lossless)");
            hashMap3.put(4096, "Olivetti GSM");
            hashMap3.put(4097, "Olivetti ADPCM");
            hashMap3.put(4098, "Olivetti CELP");
            hashMap3.put(4099, "Olivetti SBC");
            hashMap3.put(4100, "Olivetti OPR");
            hashMap3.put(4352, "Lernout & Hauspie");
            hashMap3.put(4353, "Lernout & Hauspie CELP codec");
            hashMap3.put(4354, "Lernout & Hauspie SBC codec");
            hashMap3.put(4355, "Lernout & Hauspie SBC codec");
            hashMap3.put(4356, "Lernout & Hauspie SBC codec");
            hashMap3.put(5120, "Norris Comm. Inc.");
            hashMap3.put(5121, "ISIAudio");
            hashMap3.put(5376, "AT&T Soundspace Music Compression");
            hashMap3.put(6172, "VoxWare RT24 speech codec");
            hashMap3.put(6174, "Lucent elemedia AX24000P Music codec");
            hashMap3.put(6513, "Sonic Foundry LOSSLESS");
            hashMap3.put(6521, "Innings Telecom Inc. ADPCM");
            hashMap3.put(7175, "Lucent SX8300P speech codec");
            hashMap3.put(7180, "Lucent SX5363S G.723 compliant codec");
            hashMap3.put(7939, "CUseeMe DigiTalk (ex-Rocwell)");
            hashMap3.put(8132, "NCT Soft ALF2CD ACM");
            hashMap3.put(8192, "FAST Multimedia DVM");
            hashMap3.put(8193, "Dolby DTS (Digital Theater System)");
            hashMap3.put(8194, "RealAudio 1 / 2 14.4");
            hashMap3.put(8195, "RealAudio 1 / 2 28.8");
            hashMap3.put(8196, "RealAudio G2 / 8 Cook (low bitrate)");
            hashMap3.put(8197, "RealAudio 3 / 4 / 5 Music (DNET)");
            hashMap3.put(8198, "RealAudio 10 AAC (RAAC)");
            hashMap3.put(8199, "RealAudio 10 AAC+ (RACP)");
            hashMap3.put(9472, "Reserved range to 0x2600 Microsoft");
            hashMap3.put(13075, "makeAVIS (ffvfw fake AVI sound from AviSynth scripts)");
            hashMap3.put(16707, "Divio MPEG-4 AAC audio");
            hashMap3.put(16897, "Nokia adaptive multirate");
            hashMap3.put(16963, "Divio G726 Divio, Inc.");
            hashMap3.put(17228, "LEAD Speech");
            hashMap3.put(22092, "LEAD Vorbis");
            hashMap3.put(22358, "WavPack Audio");
            hashMap3.put(26447, "Ogg Vorbis (mode 1)");
            hashMap3.put(26448, "Ogg Vorbis (mode 2)");
            hashMap3.put(26449, "Ogg Vorbis (mode 3)");
            hashMap3.put(26479, "Ogg Vorbis (mode 1+)");
            hashMap3.put(26480, "Ogg Vorbis (mode 2+)");
            hashMap3.put(26481, "Ogg Vorbis (mode 3+)");
            hashMap3.put(28672, "3COM NBX 3Com Corporation");
            hashMap3.put(28781, "FAAD AAC");
            hashMap3.put(31265, "GSM-AMR (CBR, no SID)");
            hashMap3.put(31266, "GSM-AMR (VBR, including SID)");
            hashMap3.put(41216, "Comverse Infosys Ltd. G723 1");
            hashMap3.put(41217, "Comverse Infosys Ltd. AVQSBC");
            hashMap3.put(41218, "Comverse Infosys Ltd. OLDSBC");
            hashMap3.put(41219, "Symbol Technologies G729A");
            hashMap3.put(41220, "VoiceAge AMR WB VoiceAge Corporation");
            hashMap3.put(41221, "Ingenient Technologies Inc. G726");
            hashMap3.put(41222, "ISO/MPEG-4 advanced audio Coding");
            hashMap3.put(41223, "Encore Software Ltd G726");
            hashMap3.put(41225, "Speex ACM Codec xiph.org");
            hashMap3.put(57260, "DebugMode SonicFoundry Vegas FrameServer ACM Codec");
            hashMap3.put(59144, "Unknown -");
            hashMap3.put(61868, "Free Lossless Audio Codec FLAC");
            hashMap3.put(65534, "Extensible");
            hashMap3.put(Integer.valueOf(Settings.DEFAULT_INITIAL_WINDOW_SIZE), "Development");
        }

        public C0449e() {
            E(new d(this));
        }

        public String n() {
            return "WAV";
        }

        /* access modifiers changed from: protected */
        public HashMap<Integer, String> w() {
            return f38224f;
        }
    }

    /* renamed from: e$f */
    /* compiled from: WavRiffHandler */
    public class f implements wa.a {

        /* renamed from: a  reason: collision with root package name */
        private final C0449e f38227a;

        /* renamed from: b  reason: collision with root package name */
        private String f38228b = "";

        public f(bb.e eVar) {
            C0449e eVar2 = new C0449e();
            this.f38227a = eVar2;
            eVar.a(eVar2);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r10.f38227a.a("Error calculating duration: bytes per second not found");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00f1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r11, byte[] r12) {
            /*
                r10 = this;
                java.lang.String r0 = "fmt "
                boolean r0 = r11.equals(r0)     // Catch:{ IOException -> 0x011c }
                r1 = 3
                r2 = 2
                r3 = 4
                r4 = 0
                r5 = 1
                if (r0 == 0) goto L_0x0087
                ab.a r11 = new ab.a     // Catch:{ IOException -> 0x011c }
                r11.<init>(r12)     // Catch:{ IOException -> 0x011c }
                r11.w(r4)     // Catch:{ IOException -> 0x011c }
                short r12 = r11.f(r4)     // Catch:{ IOException -> 0x011c }
                short r0 = r11.f(r2)     // Catch:{ IOException -> 0x011c }
                int r4 = r11.h(r3)     // Catch:{ IOException -> 0x011c }
                r6 = 8
                int r6 = r11.h(r6)     // Catch:{ IOException -> 0x011c }
                r7 = 12
                short r7 = r11.f(r7)     // Catch:{ IOException -> 0x011c }
                if (r12 == r5) goto L_0x0053
                java.util.HashMap<java.lang.Integer, java.lang.String> r11 = defpackage.e.C0449e.f38226h     // Catch:{ IOException -> 0x011c }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x011c }
                boolean r8 = r11.containsKey(r8)     // Catch:{ IOException -> 0x011c }
                if (r8 == 0) goto L_0x004b
                e$e r8 = r10.f38227a     // Catch:{ IOException -> 0x011c }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x011c }
                java.lang.Object r11 = r11.get(r12)     // Catch:{ IOException -> 0x011c }
                java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x011c }
                r8.R(r5, r11)     // Catch:{ IOException -> 0x011c }
                goto L_0x0070
            L_0x004b:
                e$e r11 = r10.f38227a     // Catch:{ IOException -> 0x011c }
                java.lang.String r12 = "Unknown"
                r11.R(r5, r12)     // Catch:{ IOException -> 0x011c }
                goto L_0x0070
            L_0x0053:
                r8 = 14
                short r11 = r11.f(r8)     // Catch:{ IOException -> 0x011c }
                e$e r8 = r10.f38227a     // Catch:{ IOException -> 0x011c }
                r9 = 6
                r8.J(r9, r11)     // Catch:{ IOException -> 0x011c }
                e$e r11 = r10.f38227a     // Catch:{ IOException -> 0x011c }
                java.util.HashMap<java.lang.Integer, java.lang.String> r8 = defpackage.e.C0449e.f38226h     // Catch:{ IOException -> 0x011c }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x011c }
                java.lang.Object r12 = r8.get(r12)     // Catch:{ IOException -> 0x011c }
                java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x011c }
                r11.R(r5, r12)     // Catch:{ IOException -> 0x011c }
            L_0x0070:
                e$e r11 = r10.f38227a     // Catch:{ IOException -> 0x011c }
                r11.J(r2, r0)     // Catch:{ IOException -> 0x011c }
                e$e r11 = r10.f38227a     // Catch:{ IOException -> 0x011c }
                r11.J(r1, r4)     // Catch:{ IOException -> 0x011c }
                e$e r11 = r10.f38227a     // Catch:{ IOException -> 0x011c }
                r11.J(r3, r6)     // Catch:{ IOException -> 0x011c }
                e$e r11 = r10.f38227a     // Catch:{ IOException -> 0x011c }
                r12 = 5
                r11.J(r12, r7)     // Catch:{ IOException -> 0x011c }
                goto L_0x0126
            L_0x0087:
                java.lang.String r0 = "data"
                boolean r0 = r11.equals(r0)     // Catch:{ IOException -> 0x011c }
                if (r0 == 0) goto L_0x00f9
                e$e r11 = r10.f38227a     // Catch:{ MetadataException -> 0x00f1 }
                boolean r11 = r11.b(r3)     // Catch:{ MetadataException -> 0x00f1 }
                if (r11 == 0) goto L_0x0126
                int r11 = r12.length     // Catch:{ MetadataException -> 0x00f1 }
                double r11 = (double) r11     // Catch:{ MetadataException -> 0x00f1 }
                e$e r0 = r10.f38227a     // Catch:{ MetadataException -> 0x00f1 }
                double r6 = r0.g(r3)     // Catch:{ MetadataException -> 0x00f1 }
                double r11 = r11 / r6
                int r0 = (int) r11     // Catch:{ MetadataException -> 0x00f1 }
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                r8 = 4633641066610819072(0x404e000000000000, double:60.0)
                double r6 = java.lang.Math.pow(r8, r6)     // Catch:{ MetadataException -> 0x00f1 }
                int r3 = (int) r6     // Catch:{ MetadataException -> 0x00f1 }
                int r3 = r0 / r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ MetadataException -> 0x00f1 }
                r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r6 = java.lang.Math.pow(r8, r6)     // Catch:{ MetadataException -> 0x00f1 }
                int r6 = (int) r6     // Catch:{ MetadataException -> 0x00f1 }
                int r0 = r0 / r6
                int r6 = r3.intValue()     // Catch:{ MetadataException -> 0x00f1 }
                int r6 = r6 * 60
                int r0 = r0 - r6
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ MetadataException -> 0x00f1 }
                r6 = 0
                double r6 = java.lang.Math.pow(r8, r6)     // Catch:{ MetadataException -> 0x00f1 }
                double r11 = r11 / r6
                int r6 = r0.intValue()     // Catch:{ MetadataException -> 0x00f1 }
                int r6 = r6 * 60
                double r6 = (double) r6     // Catch:{ MetadataException -> 0x00f1 }
                double r11 = r11 - r6
                long r11 = java.lang.Math.round(r11)     // Catch:{ MetadataException -> 0x00f1 }
                int r12 = (int) r11     // Catch:{ MetadataException -> 0x00f1 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r12)     // Catch:{ MetadataException -> 0x00f1 }
                java.lang.String r12 = "%1$02d:%2$02d:%3$02d"
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ MetadataException -> 0x00f1 }
                r1[r4] = r3     // Catch:{ MetadataException -> 0x00f1 }
                r1[r5] = r0     // Catch:{ MetadataException -> 0x00f1 }
                r1[r2] = r11     // Catch:{ MetadataException -> 0x00f1 }
                java.lang.String r11 = java.lang.String.format(r12, r1)     // Catch:{ MetadataException -> 0x00f1 }
                e$e r12 = r10.f38227a     // Catch:{ MetadataException -> 0x00f1 }
                r0 = 16
                r12.R(r0, r11)     // Catch:{ MetadataException -> 0x00f1 }
                goto L_0x0126
            L_0x00f1:
                e$e r11 = r10.f38227a     // Catch:{ IOException -> 0x011c }
                java.lang.String r12 = "Error calculating duration: bytes per second not found"
                r11.a(r12)     // Catch:{ IOException -> 0x011c }
                goto L_0x0126
            L_0x00f9:
                java.util.HashMap<java.lang.String, java.lang.Integer> r0 = defpackage.e.C0449e.f38225g     // Catch:{ IOException -> 0x011c }
                boolean r1 = r0.containsKey(r11)     // Catch:{ IOException -> 0x011c }
                if (r1 == 0) goto L_0x0126
                e$e r1 = r10.f38227a     // Catch:{ IOException -> 0x011c }
                java.lang.Object r11 = r0.get(r11)     // Catch:{ IOException -> 0x011c }
                java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ IOException -> 0x011c }
                int r11 = r11.intValue()     // Catch:{ IOException -> 0x011c }
                java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x011c }
                r0.<init>(r12)     // Catch:{ IOException -> 0x011c }
                int r12 = r12.length     // Catch:{ IOException -> 0x011c }
                int r12 = r12 - r5
                java.lang.String r12 = r0.substring(r4, r12)     // Catch:{ IOException -> 0x011c }
                r1.R(r11, r12)     // Catch:{ IOException -> 0x011c }
                goto L_0x0126
            L_0x011c:
                r11 = move-exception
                e$e r12 = r10.f38227a
                java.lang.String r11 = r11.getMessage()
                r12.a(r11)
            L_0x0126:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.e.f.a(java.lang.String, byte[]):void");
        }

        public boolean b(String str) {
            if (str.equals("INFO")) {
                this.f38228b = "INFO";
                return true;
            }
            this.f38228b = "";
            return false;
        }

        public boolean c(String str) {
            return str.equals("fmt ") || (this.f38228b.equals("INFO") && C0449e.f38225g.containsKey(str)) || str.equals(CardTypeAdapterFactory.DATA);
        }

        public boolean d(String str) {
            return str.equals("WAVE");
        }
    }

    public static void f(Context context) {
        synchronized (f14148d) {
            k1.i(f14145a, "Unbinding Highest Versioned Service");
            c a11 = b.a();
            if (!(a11 == null || a11.a() == null)) {
                g(context, a11.a(), a11.b());
                a11.j((IInterface) null);
                a11.g((d) null);
                a11.i((Intent) null);
            }
        }
    }

    public static void g(Context context, ServiceConnection serviceConnection, Intent intent) {
        String packageName = intent != null ? intent.getComponent().getPackageName() : null;
        String str = f14145a;
        k1.a(str, "Unbinding pkg=" + packageName);
        if (serviceConnection != null) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException unused) {
                Log.w(f14145a, String.format("IllegalArgumentException is received during unbinding from %s. Ignored.", new Object[]{packageName}));
            }
        }
    }

    private static boolean i(Context context, Signature[] signatureArr) {
        String str;
        Signature signature;
        if (f1.f(context)) {
            k1.i(f14145a, "Attempting to check fingerprint in development environment");
            str = f14146b;
            signature = signatureArr[0];
        } else {
            k1.i(f14145a, "Attempting to check fingerprint in production environment");
            str = f14147c;
            signature = signatureArr[0];
        }
        return j(str, signature);
    }

    static boolean j(String str, Signature signature) {
        String str2;
        String message;
        String str3;
        try {
            String a11 = h1.a(signature, ce.SHA_256);
            String str4 = f14145a;
            k1.b(str4, "Expected fingerprint", "Fingerprint=" + str);
            k1.b(str4, "Extracted fingerprint", "Fingerprint=" + a11);
            return str.equals(a11);
        } catch (CertificateException e11) {
            str2 = f14145a;
            message = e11.getMessage();
            str3 = "CertificateException getting Fingerprint. ";
            k1.b(str2, str3, message);
            return false;
        } catch (NoSuchAlgorithmException e12) {
            str2 = f14145a;
            message = e12.getMessage();
            str3 = "NoSuchAlgorithmException getting Fingerprint. ";
            k1.b(str2, str3, message);
            return false;
        } catch (IOException e13) {
            str2 = f14145a;
            message = e13.getMessage();
            str3 = "IOException getting Fingerprint. ";
            k1.b(str2, str3, message);
            return false;
        }
    }

    public static void k(Context context) {
        synchronized (f14148d) {
            k1.i(f14145a, "Clearing Highest Versioned Service");
            c a11 = b.a();
            if (a11 != null) {
                g(context, a11.a(), a11.b());
                b.b((c) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public c a(List<c> list) {
        String str = f14145a;
        k1.i(str, "Number of MAP services to compare = " + list.size());
        c cVar = null;
        for (c next : list) {
            if (cVar == null || next.f().a(cVar.f()) > 0) {
                cVar = next;
            }
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        r1 = r6.getPackageManager();
        r3 = new android.content.Intent();
        r3.setAction("com.amazon.identity.auth.device.authorization.MapAuthorizationService");
        r1 = r1.queryIntentServices(r3, 0);
        defpackage.k1.i(r0, "Number of services found : " + r1.size());
        r7 = d(r6, r1, r7);
        r3 = f14148d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        defpackage.e.b.b(a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        if (defpackage.e.b.a() != null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        defpackage.k1.i(r0, "Returning no service to use");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0090, code lost:
        h(r6);
        defpackage.k1.i(r0, "Returning service to use");
        r6 = defpackage.e.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        if (r6 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        r2 = r6.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a2, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.IInterface b(android.content.Context r6, boolean r7) throws com.amazon.identity.auth.device.AuthError {
        /*
            r5 = this;
            boolean r0 = defpackage.z0.b()
            if (r0 != 0) goto L_0x00aa
            java.lang.String r0 = f14145a
            java.lang.String r1 = "getAuthorizationServiceInstance"
            defpackage.k1.a(r0, r1)
            java.lang.Object r1 = f14148d
            monitor-enter(r1)
            r2 = 0
            if (r7 == 0) goto L_0x0028
            e$c r7 = defpackage.e.b.a()     // Catch:{ all -> 0x00a7 }
            if (r7 == 0) goto L_0x0049
            d r3 = r7.a()     // Catch:{ all -> 0x00a7 }
            android.content.Intent r4 = r7.b()     // Catch:{ all -> 0x00a7 }
            g(r6, r3, r4)     // Catch:{ all -> 0x00a7 }
            defpackage.e.b.b(r2)     // Catch:{ all -> 0x00a7 }
            goto L_0x0049
        L_0x0028:
            e$c r7 = defpackage.e.b.a()     // Catch:{ all -> 0x00a7 }
            if (r7 == 0) goto L_0x0048
            d r3 = r7.a()     // Catch:{ all -> 0x00a7 }
            android.content.Intent r4 = r7.b()     // Catch:{ all -> 0x00a7 }
            g(r6, r3, r4)     // Catch:{ all -> 0x00a7 }
            boolean r3 = r5.h(r6)     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x0045
            android.os.IInterface r6 = r7.e()     // Catch:{ all -> 0x00a7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            return r6
        L_0x0045:
            defpackage.e.b.b(r2)     // Catch:{ all -> 0x00a7 }
        L_0x0048:
            r7 = r2
        L_0x0049:
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r4 = "com.amazon.identity.auth.device.authorization.MapAuthorizationService"
            r3.setAction(r4)
            r4 = 0
            java.util.List r1 = r1.queryIntentServices(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number of services found : "
            r3.append(r4)
            int r4 = r1.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            defpackage.k1.i(r0, r3)
            java.util.List r7 = r5.d(r6, r1, r7)
            java.lang.Object r3 = f14148d
            monitor-enter(r3)
            e$c r7 = r5.a(r7)     // Catch:{ all -> 0x00a4 }
            defpackage.e.b.b(r7)     // Catch:{ all -> 0x00a4 }
            e$c r7 = defpackage.e.b.a()     // Catch:{ all -> 0x00a4 }
            if (r7 != 0) goto L_0x0090
            java.lang.String r6 = "Returning no service to use"
            defpackage.k1.i(r0, r6)     // Catch:{ all -> 0x00a4 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a4 }
            return r2
        L_0x0090:
            r5.h(r6)     // Catch:{ all -> 0x00a4 }
            java.lang.String r6 = "Returning service to use"
            defpackage.k1.i(r0, r6)     // Catch:{ all -> 0x00a4 }
            e$c r6 = defpackage.e.b.a()     // Catch:{ all -> 0x00a4 }
            if (r6 == 0) goto L_0x00a2
            android.os.IInterface r2 = r6.e()     // Catch:{ all -> 0x00a4 }
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x00a4 }
            return r2
        L_0x00a4:
            r6 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a4 }
            throw r6
        L_0x00a7:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            throw r6
        L_0x00aa:
            java.lang.String r6 = f14145a
            java.lang.String r7 = "getAuthorizationServiceInstance started on main thread"
            defpackage.k1.h(r6, r7)
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "getAuthorizationServiceInstance started on main thread"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.b(android.content.Context, boolean):android.os.IInterface");
    }

    /* access modifiers changed from: package-private */
    public List<c> d(Context context, List<ResolveInfo> list, c cVar) throws AuthError {
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo next : list) {
            if (cVar == null || !next.serviceInfo.applicationInfo.packageName.equals(cVar.f38222f.serviceInfo.applicationInfo.packageName)) {
                try {
                    String str = f14145a;
                    k1.i(str, "Verifying signature for pkg=" + next.serviceInfo.applicationInfo.packageName);
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo(next.serviceInfo.applicationInfo.packageName, 64).signatures;
                    if (signatureArr.length != 1) {
                        k1.b(str, "Security count failure", "Signature count (" + signatureArr.length + ") is incorrect.");
                    } else if (!i(context, signatureArr)) {
                        k1.b(str, "Security check failure", "Signature is incorrect.");
                    } else {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.applicationInfo.packageName, serviceInfo.name);
                        Bundle bundle = context.getPackageManager().getServiceInfo(componentName, 128).metaData;
                        if (bundle != null) {
                            boolean z11 = bundle.getBoolean("map.primary");
                            String string = bundle.getString("map.version");
                            if (!TextUtils.isEmpty(string) || z11) {
                                arrayList.add(new c(z11 ? cr.f60038c : new cr(string), (IInterface) null, new d(), z11, next, new Intent().setComponent(componentName)));
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException e11) {
                    String str2 = f14145a;
                    k1.b(str2, "NameNotFoundException.", "msg=" + e11.getMessage());
                }
            } else {
                String str3 = f14145a;
                k1.i(str3, "Ignoring previous service =" + next.serviceInfo.name);
            }
        }
        return arrayList;
    }

    public q1 e(Context context, boolean z11) throws AuthError {
        String str = f14145a;
        k1.i(str, "Attempting to retrieve remote Android service. Ignore cached service=" + z11);
        return (q1) b(context, z11);
    }

    /* access modifiers changed from: package-private */
    public boolean h(Context context) throws AuthError {
        if (b.c()) {
            return false;
        }
        c a11 = b.a();
        ServiceInfo serviceInfo = a11.c().serviceInfo;
        ComponentName componentName = new ComponentName(serviceInfo.applicationInfo.packageName, serviceInfo.name);
        Intent intent = new Intent();
        intent.setComponent(componentName);
        d dVar = new d();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        dVar.c(new a(a11, dVar, intent, countDownLatch));
        if (context.bindService(intent, dVar, 5)) {
            try {
                String str = f14145a;
                k1.i(str, "Awaiting latch");
                if (!countDownLatch.await(10, TimeUnit.SECONDS)) {
                    k1.j(str, "Unable to establish bind within timelimit = 10");
                    b.b((c) null);
                    throw new AuthError("Binding to authorization service has timed out!", AuthError.ERROR_TYPE.ERROR_THREAD);
                }
            } catch (InterruptedException e11) {
                String str2 = f14145a;
                k1.b(str2, "InterruptedException", "msg+=" + e11.getMessage());
                b.b((c) null);
                throw new AuthError("Binding to authorization service has timed out!", e11, AuthError.ERROR_TYPE.ERROR_THREAD);
            }
        } else {
            b.b((c) null);
            String str3 = f14145a;
            k1.j(str3, "Bind Service " + intent.getComponent().flattenToString() + "unsuccessful");
        }
        return true;
    }
}
