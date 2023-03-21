package cg0;

import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.feature.address.v2.LocationGps;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LocationUtils.kt */
public final class u0 {
    @SerializedName("address-lat-long")

    /* renamed from: a  reason: collision with root package name */
    private String f18189a;
    @SerializedName("final-gps-inaccuracy")

    /* renamed from: b  reason: collision with root package name */
    private String f18190b;
    @SerializedName("staleness")

    /* renamed from: c  reason: collision with root package name */
    private String f18191c;
    @SerializedName("gps")

    /* renamed from: d  reason: collision with root package name */
    private String f18192d;
    @SerializedName("xp-flag")

    /* renamed from: e  reason: collision with root package name */
    private final LocationGps f18193e;
    @SerializedName("original-ping")

    /* renamed from: f  reason: collision with root package name */
    private String f18194f;
    @SerializedName("address-id")

    /* renamed from: g  reason: collision with root package name */
    private String f18195g;
    @SerializedName("address-uid")

    /* renamed from: h  reason: collision with root package name */
    private String f18196h;
    @SerializedName("pin-movement-count")

    /* renamed from: i  reason: collision with root package name */
    private Integer f18197i;
    @SerializedName("recenter-click-count")
    private Integer j;
    @SerializedName("zoom-in-count")
    private Integer k;
    @SerializedName("zoom-out-count")

    /* renamed from: l  reason: collision with root package name */
    private Integer f18198l;
    @SerializedName("nearby-polygon-count-touched")

    /* renamed from: m  reason: collision with root package name */
    private Integer f18199m;
    @SerializedName("maps_recenter_icon_revamp")
    private String n;
    @SerializedName("address_accuracy")

    /* renamed from: o  reason: collision with root package name */
    private Integer f18200o;

    public u0() {
        this((String) null, (String) null, (String) null, (String) null, (LocationGps) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (Integer) null, 32767, (i) null);
    }

    public u0(String str, String str2, String str3, String str4, LocationGps locationGps, String str5, String str6, String str7, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str8, Integer num6) {
        p.j(str, "addressLatLng");
        p.j(str2, "finalGpsInaccuracy");
        p.j(str4, "gps");
        p.j(locationGps, "xpFlag");
        p.j(str5, "originalPing");
        this.f18189a = str;
        this.f18190b = str2;
        this.f18191c = str3;
        this.f18192d = str4;
        this.f18193e = locationGps;
        this.f18194f = str5;
        this.f18195g = str6;
        this.f18196h = str7;
        this.f18197i = num;
        this.j = num2;
        this.k = num3;
        this.f18198l = num4;
        this.f18199m = num5;
        this.n = str8;
        this.f18200o = num6;
    }

    public final void a(Integer num) {
        this.f18200o = num;
    }

    public final void b(String str) {
        this.f18195g = str;
    }

    public final void c(String str) {
        p.j(str, "<set-?>");
        this.f18189a = str;
    }

    public final void d(String str) {
        this.f18196h = str;
    }

    public final void e(String str) {
        p.j(str, "<set-?>");
        this.f18190b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return p.e(this.f18189a, u0Var.f18189a) && p.e(this.f18190b, u0Var.f18190b) && p.e(this.f18191c, u0Var.f18191c) && p.e(this.f18192d, u0Var.f18192d) && p.e(this.f18193e, u0Var.f18193e) && p.e(this.f18194f, u0Var.f18194f) && p.e(this.f18195g, u0Var.f18195g) && p.e(this.f18196h, u0Var.f18196h) && p.e(this.f18197i, u0Var.f18197i) && p.e(this.j, u0Var.j) && p.e(this.k, u0Var.k) && p.e(this.f18198l, u0Var.f18198l) && p.e(this.f18199m, u0Var.f18199m) && p.e(this.n, u0Var.n) && p.e(this.f18200o, u0Var.f18200o);
    }

    public final void f(String str) {
        p.j(str, "<set-?>");
        this.f18192d = str;
    }

    public final void g(String str) {
        this.n = str;
    }

    public final void h(Integer num) {
        this.f18199m = num;
    }

    public int hashCode() {
        int hashCode = ((this.f18189a.hashCode() * 31) + this.f18190b.hashCode()) * 31;
        String str = this.f18191c;
        int i11 = 0;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f18192d.hashCode()) * 31) + this.f18193e.hashCode()) * 31) + this.f18194f.hashCode()) * 31;
        String str2 = this.f18195g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18196h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f18197i;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.j;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.k;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f18198l;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f18199m;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str4 = this.n;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num6 = this.f18200o;
        if (num6 != null) {
            i11 = num6.hashCode();
        }
        return hashCode10 + i11;
    }

    public final void i(String str) {
        p.j(str, "<set-?>");
        this.f18194f = str;
    }

    public final void j(Integer num) {
        this.f18197i = num;
    }

    public final void k(Integer num) {
        this.j = num;
    }

    public final void l(Integer num) {
        this.k = num;
    }

    public final void m(Integer num) {
        this.f18198l = num;
    }

    public String toString() {
        return "LocationObjectLog(addressLatLng=" + this.f18189a + ", finalGpsInaccuracy=" + this.f18190b + ", staleness=" + this.f18191c + ", gps=" + this.f18192d + ", xpFlag=" + this.f18193e + ", originalPing=" + this.f18194f + ", addressId=" + this.f18195g + ", addressUid=" + this.f18196h + ", pinMovementCount=" + this.f18197i + ", recenterClickCount=" + this.j + ", zoomInCount=" + this.k + ", zoomOutCount=" + this.f18198l + ", nearbyPolygonCountTouched=" + this.f18199m + ", mapsRecenterIconRevamp=" + this.n + ", addressAccuracy=" + this.f18200o + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ u0(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, in.swiggy.android.tejas.feature.address.v2.LocationGps r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.Integer r25, java.lang.Integer r26, java.lang.Integer r27, java.lang.Integer r28, java.lang.Integer r29, java.lang.String r30, java.lang.Integer r31, int r32, kotlin.jvm.internal.i r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = "0.0,0.0"
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0012
            java.lang.String r2 = "0"
            goto L_0x0014
        L_0x0012:
            r2 = r18
        L_0x0014:
            r3 = r0 & 4
            r4 = 0
            if (r3 == 0) goto L_0x001b
            r3 = r4
            goto L_0x001d
        L_0x001b:
            r3 = r19
        L_0x001d:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0024
            java.lang.String r5 = "on"
            goto L_0x0026
        L_0x0024:
            r5 = r20
        L_0x0026:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0036
            in.swiggy.android.tejas.feature.address.v2.LocationGps r6 = new in.swiggy.android.tejas.feature.address.v2.LocationGps
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 7
            r12 = 0
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0038
        L_0x0036:
            r6 = r21
        L_0x0038:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x003f
            java.lang.String r7 = "no"
            goto L_0x0041
        L_0x003f:
            r7 = r22
        L_0x0041:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0047
            r8 = r4
            goto L_0x0049
        L_0x0047:
            r8 = r23
        L_0x0049:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x004f
            r9 = r4
            goto L_0x0051
        L_0x004f:
            r9 = r24
        L_0x0051:
            r10 = r0 & 256(0x100, float:3.59E-43)
            r11 = 0
            if (r10 == 0) goto L_0x005b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            goto L_0x005d
        L_0x005b:
            r10 = r25
        L_0x005d:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0066
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            goto L_0x0068
        L_0x0066:
            r12 = r26
        L_0x0068:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0071
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            goto L_0x0073
        L_0x0071:
            r13 = r27
        L_0x0073:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x007c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            goto L_0x007e
        L_0x007c:
            r14 = r28
        L_0x007e:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0087
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x0089
        L_0x0087:
            r11 = r29
        L_0x0089:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x008f
            r15 = r4
            goto L_0x0091
        L_0x008f:
            r15 = r30
        L_0x0091:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r4 = r31
        L_0x0098:
            r17 = r16
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r12
            r28 = r13
            r29 = r14
            r30 = r11
            r31 = r15
            r32 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cg0.u0.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, in.swiggy.android.tejas.feature.address.v2.LocationGps, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.i):void");
    }
}
