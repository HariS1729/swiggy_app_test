package df0;

import in.swiggy.android.tejas.feature.listing.facets.model.Facet;
import in.swiggy.android.tejas.feature.listing.marketplace.model.MarketPlace;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: ExploreData.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f18239a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18240b;

    /* renamed from: c  reason: collision with root package name */
    private final String f18241c;

    /* renamed from: d  reason: collision with root package name */
    private final String f18242d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f18243e;

    /* renamed from: f  reason: collision with root package name */
    private final String f18244f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f18245g;

    /* renamed from: h  reason: collision with root package name */
    private final String f18246h;

    /* renamed from: i  reason: collision with root package name */
    private final String f18247i;
    private final String j;
    private final String k;

    /* renamed from: l  reason: collision with root package name */
    private final String f18248l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f18249m;
    private final boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final String f18250o;

    /* renamed from: p  reason: collision with root package name */
    private final String f18251p;
    private final String q;

    /* renamed from: r  reason: collision with root package name */
    private final Map<String, List<Facet>> f18252r;

    /* renamed from: s  reason: collision with root package name */
    private final MarketPlace f18253s;

    public a(String str, String str2, String str3, String str4, boolean z11, String str5, boolean z12, String str6, String str7, String str8, String str9, String str10, boolean z13, boolean z14, String str11, String str12, String str13, Map<String, ? extends List<Facet>> map, MarketPlace marketPlace) {
        p.j(str, "searchQuery");
        this.f18239a = str;
        this.f18240b = str2;
        this.f18241c = str3;
        this.f18242d = str4;
        this.f18243e = z11;
        this.f18244f = str5;
        this.f18245g = z12;
        this.f18246h = str6;
        this.f18247i = str7;
        this.j = str8;
        this.k = str9;
        this.f18248l = str10;
        this.f18249m = z13;
        this.n = z14;
        this.f18250o = str11;
        this.f18251p = str12;
        this.q = str13;
        this.f18252r = map;
        this.f18253s = marketPlace;
    }

    public final String a() {
        return this.f18240b;
    }

    public final Map<String, List<Facet>> b() {
        return this.f18252r;
    }

    public final String c() {
        return this.f18247i;
    }

    public final String d() {
        return this.f18241c;
    }

    public final MarketPlace e() {
        return this.f18253s;
    }

    public final String f() {
        return this.f18244f;
    }

    public final String g() {
        return this.j;
    }

    public final String h() {
        return this.f18250o;
    }

    public final String i() {
        return this.f18251p;
    }

    public final String j() {
        return this.f18239a;
    }

    public final boolean k() {
        return this.f18249m;
    }

    public final boolean l() {
        return this.n;
    }

    public final String m() {
        return this.q;
    }

    public final String n() {
        return this.k;
    }

    public final String o() {
        return this.f18248l;
    }

    public final String p() {
        return this.f18246h;
    }

    public final boolean q() {
        return this.f18243e;
    }

    public final boolean r() {
        return this.f18245g;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28, java.lang.String r29, boolean r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, boolean r36, boolean r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.util.Map r41, in.swiggy.android.tejas.feature.listing.marketplace.model.MarketPlace r42, int r43, kotlin.jvm.internal.i r44) {
        /*
            r23 = this;
            r0 = r43
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r27
        L_0x000b:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L_0x0012
            r8 = 0
            goto L_0x0014
        L_0x0012:
            r8 = r28
        L_0x0014:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001a
            r9 = r2
            goto L_0x001c
        L_0x001a:
            r9 = r29
        L_0x001c:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0022
            r10 = 0
            goto L_0x0024
        L_0x0022:
            r10 = r30
        L_0x0024:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x002a
            r11 = r2
            goto L_0x002c
        L_0x002a:
            r11 = r31
        L_0x002c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0032
            r12 = r2
            goto L_0x0034
        L_0x0032:
            r12 = r32
        L_0x0034:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x003a
            r13 = r2
            goto L_0x003c
        L_0x003a:
            r13 = r33
        L_0x003c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0042
            r14 = r2
            goto L_0x0044
        L_0x0042:
            r14 = r34
        L_0x0044:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x004a
            r15 = r2
            goto L_0x004c
        L_0x004a:
            r15 = r35
        L_0x004c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0053
            r16 = 0
            goto L_0x0055
        L_0x0053:
            r16 = r36
        L_0x0055:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x005c
            r17 = 0
            goto L_0x005e
        L_0x005c:
            r17 = r37
        L_0x005e:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0065
            r18 = r2
            goto L_0x0067
        L_0x0065:
            r18 = r38
        L_0x0067:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0070
            r19 = r2
            goto L_0x0072
        L_0x0070:
            r19 = r39
        L_0x0072:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x007a
            r20 = r2
            goto L_0x007c
        L_0x007a:
            r20 = r40
        L_0x007c:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0084
            r21 = r2
            goto L_0x0086
        L_0x0084:
            r21 = r41
        L_0x0086:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x008e
            r22 = r2
            goto L_0x0090
        L_0x008e:
            r22 = r42
        L_0x0090:
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df0.a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.Map, in.swiggy.android.tejas.feature.listing.marketplace.model.MarketPlace, int, kotlin.jvm.internal.i):void");
    }
}
