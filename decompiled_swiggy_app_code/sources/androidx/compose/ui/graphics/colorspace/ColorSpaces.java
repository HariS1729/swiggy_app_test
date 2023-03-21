package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.i;
import v0.e;
import v0.g;
import v0.h;

/* compiled from: ColorSpaces.kt */
public final class ColorSpaces {

    /* renamed from: a  reason: collision with root package name */
    public static final ColorSpaces f6442a = new ColorSpaces();

    /* renamed from: b  reason: collision with root package name */
    private static final float[] f6443b;

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f6444c;

    /* renamed from: d  reason: collision with root package name */
    private static final g f6445d;

    /* renamed from: e  reason: collision with root package name */
    private static final g f6446e;

    /* renamed from: f  reason: collision with root package name */
    private static final Rgb f6447f;

    /* renamed from: g  reason: collision with root package name */
    private static final Rgb f6448g;

    /* renamed from: h  reason: collision with root package name */
    private static final Rgb f6449h;

    /* renamed from: i  reason: collision with root package name */
    private static final Rgb f6450i;
    private static final Rgb j;
    private static final Rgb k;

    /* renamed from: l  reason: collision with root package name */
    private static final Rgb f6451l;

    /* renamed from: m  reason: collision with root package name */
    private static final Rgb f6452m;
    private static final Rgb n;

    /* renamed from: o  reason: collision with root package name */
    private static final Rgb f6453o;

    /* renamed from: p  reason: collision with root package name */
    private static final Rgb f6454p;
    private static final Rgb q;

    /* renamed from: r  reason: collision with root package name */
    private static final Rgb f6455r;

    /* renamed from: s  reason: collision with root package name */
    private static final Rgb f6456s;
    private static final a t;

    /* renamed from: u  reason: collision with root package name */
    private static final a f6457u;
    private static final Rgb v;

    /* renamed from: w  reason: collision with root package name */
    private static final a f6458w;

    /* renamed from: x  reason: collision with root package name */
    private static final a[] f6459x;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f6443b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f6444c = fArr2;
        g gVar = new g(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, (i) null);
        f6445d = gVar;
        g gVar2 = new g(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, (i) null);
        f6446e = gVar2;
        e eVar = e.f17027a;
        float[] fArr3 = fArr;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr3, eVar.e(), gVar, 0);
        f6447f = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr3, eVar.e(), 1.0d, 0.0f, 1.0f, 1);
        f6448g = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr3, eVar.e(), (float[]) null, ColorSpaces$ExtendedSrgb$1.f6460a, ColorSpaces$ExtendedSrgb$2.f6461a, -0.799f, 2.399f, gVar, 2);
        f6449h = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr3, eVar.e(), 1.0d, -0.5f, 7.499f, 3);
        f6450i = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, eVar.e(), new g(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (i) null), 4);
        j = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, eVar.e(), new g(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, (i) null), 5);
        k = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new h(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f6451l = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, eVar.e(), gVar, 7);
        f6452m = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, eVar.a(), new g(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (i) null), 8);
        n = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, eVar.e(), new g(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (i) null), 9);
        f6453o = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, eVar.e(), 2.2d, 0.0f, 1.0f, 10);
        f6454p = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, eVar.b(), new g(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, (i) null), 11);
        q = rgb12;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, eVar.d(), 1.0d, -65504.0f, 65504.0f, 12);
        f6455r = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, eVar.d(), 1.0d, -65504.0f, 65504.0f, 13);
        f6456s = rgb14;
        v0.i iVar = new v0.i("Generic XYZ", 14);
        t = iVar;
        b bVar = new b("Generic L*a*b*", 15);
        f6457u = bVar;
        float[] fArr4 = fArr;
        Rgb rgb15 = new Rgb("None", fArr4, eVar.e(), gVar2, 16);
        v = rgb15;
        c cVar = new c("Oklab", 17);
        f6458w = cVar;
        f6459x = new a[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, iVar, bVar, rgb15, cVar};
    }

    private ColorSpaces() {
    }

    public final Rgb a() {
        return f6455r;
    }

    public final Rgb b() {
        return f6456s;
    }

    public final Rgb c() {
        return f6454p;
    }

    public final Rgb d() {
        return k;
    }

    public final Rgb e() {
        return j;
    }

    public final a f() {
        return f6457u;
    }

    public final a g() {
        return t;
    }

    public final a[] h() {
        return f6459x;
    }

    public final Rgb i() {
        return f6451l;
    }

    public final Rgb j() {
        return f6452m;
    }

    public final Rgb k() {
        return f6449h;
    }

    public final Rgb l() {
        return f6450i;
    }

    public final Rgb m() {
        return f6448g;
    }

    public final Rgb n() {
        return n;
    }

    public final float[] o() {
        return f6444c;
    }

    public final a p() {
        return f6458w;
    }

    public final Rgb q() {
        return q;
    }

    public final Rgb r() {
        return f6453o;
    }

    public final Rgb s() {
        return f6447f;
    }

    public final float[] t() {
        return f6443b;
    }

    public final Rgb u() {
        return v;
    }
}
