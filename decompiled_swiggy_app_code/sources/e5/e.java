package e5;

import java.io.File;
import kotlin.jvm.internal.p;

/* compiled from: MuxerConfiguration.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private File f14377a;

    /* renamed from: b  reason: collision with root package name */
    private int f14378b;

    /* renamed from: c  reason: collision with root package name */
    private int f14379c;

    /* renamed from: d  reason: collision with root package name */
    private String f14380d;

    /* renamed from: e  reason: collision with root package name */
    private int f14381e;

    /* renamed from: f  reason: collision with root package name */
    private float f14382f;

    /* renamed from: g  reason: collision with root package name */
    private int f14383g;

    /* renamed from: h  reason: collision with root package name */
    private b f14384h;

    /* renamed from: i  reason: collision with root package name */
    private int f14385i;

    public e(File file, int i11, int i12, String str, int i13, float f11, int i14, b bVar, int i15) {
        p.j(file, "file");
        p.j(str, "mimeType");
        p.j(bVar, "frameMuxer");
        this.f14377a = file;
        this.f14378b = i11;
        this.f14379c = i12;
        this.f14380d = str;
        this.f14381e = i13;
        this.f14382f = f11;
        this.f14383g = i14;
        this.f14384h = bVar;
        this.f14385i = i15;
    }

    public final int a() {
        return this.f14383g;
    }

    public final b b() {
        return this.f14384h;
    }

    public final int c() {
        return this.f14381e;
    }

    public final float d() {
        return this.f14382f;
    }

    public final int e() {
        return this.f14385i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p.e(this.f14377a, eVar.f14377a) && this.f14378b == eVar.f14378b && this.f14379c == eVar.f14379c && p.e(this.f14380d, eVar.f14380d) && this.f14381e == eVar.f14381e && Float.compare(this.f14382f, eVar.f14382f) == 0 && this.f14383g == eVar.f14383g && p.e(this.f14384h, eVar.f14384h) && this.f14385i == eVar.f14385i;
    }

    public final String f() {
        return this.f14380d;
    }

    public final int g() {
        return this.f14379c;
    }

    public final int h() {
        return this.f14378b;
    }

    public int hashCode() {
        File file = this.f14377a;
        int i11 = 0;
        int hashCode = (((((file != null ? file.hashCode() : 0) * 31) + this.f14378b) * 31) + this.f14379c) * 31;
        String str = this.f14380d;
        int hashCode2 = (((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f14381e) * 31) + Float.floatToIntBits(this.f14382f)) * 31) + this.f14383g) * 31;
        b bVar = this.f14384h;
        if (bVar != null) {
            i11 = bVar.hashCode();
        }
        return ((hashCode2 + i11) * 31) + this.f14385i;
    }

    public String toString() {
        return "MuxerConfig(file=" + this.f14377a + ", videoWidth=" + this.f14378b + ", videoHeight=" + this.f14379c + ", mimeType=" + this.f14380d + ", framesPerImage=" + this.f14381e + ", framesPerSecond=" + this.f14382f + ", bitrate=" + this.f14383g + ", frameMuxer=" + this.f14384h + ", iFrameInterval=" + this.f14385i + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ e(java.io.File r11, int r12, int r13, java.lang.String r14, int r15, float r16, int r17, e5.b r18, int r19, int r20, kotlin.jvm.internal.i r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0009
            r1 = 320(0x140, float:4.48E-43)
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x0011
            r2 = 240(0xf0, float:3.36E-43)
            goto L_0x0012
        L_0x0011:
            r2 = r13
        L_0x0012:
            r3 = r0 & 8
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "video/avc"
            goto L_0x001a
        L_0x0019:
            r3 = r14
        L_0x001a:
            r4 = r0 & 16
            if (r4 == 0) goto L_0x0020
            r4 = 1
            goto L_0x0021
        L_0x0020:
            r4 = r15
        L_0x0021:
            r5 = r0 & 32
            if (r5 == 0) goto L_0x0028
            r5 = 1092616192(0x41200000, float:10.0)
            goto L_0x002a
        L_0x0028:
            r5 = r16
        L_0x002a:
            r6 = r0 & 64
            if (r6 == 0) goto L_0x0032
            r6 = 1500000(0x16e360, float:2.101948E-39)
            goto L_0x0034
        L_0x0032:
            r6 = r17
        L_0x0034:
            r7 = r0 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0047
            e5.c r7 = new e5.c
            java.lang.String r8 = r11.getAbsolutePath()
            java.lang.String r9 = "file.absolutePath"
            kotlin.jvm.internal.p.i(r8, r9)
            r7.<init>(r8, r5)
            goto L_0x0049
        L_0x0047:
            r7 = r18
        L_0x0049:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0050
            r0 = 10
            goto L_0x0052
        L_0x0050:
            r0 = r19
        L_0x0052:
            r12 = r10
            r13 = r11
            r14 = r1
            r15 = r2
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.e.<init>(java.io.File, int, int, java.lang.String, int, float, int, e5.b, int, int, kotlin.jvm.internal.i):void");
    }
}
