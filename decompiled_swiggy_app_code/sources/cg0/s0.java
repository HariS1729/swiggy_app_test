package cg0;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LocationUtils.kt */
public final class s0 {
    @SerializedName("gps-inaccuracy")

    /* renamed from: a  reason: collision with root package name */
    private String f18182a;
    @SerializedName("try-count")

    /* renamed from: b  reason: collision with root package name */
    private int f18183b;
    @SerializedName("accepted")

    /* renamed from: c  reason: collision with root package name */
    private String f18184c;
    @SerializedName("source")

    /* renamed from: d  reason: collision with root package name */
    private String f18185d;
    @SerializedName("type")

    /* renamed from: e  reason: collision with root package name */
    private String f18186e;

    public s0() {
        this((String) null, 0, (String) null, (String) null, (String) null, 31, (i) null);
    }

    public s0(String str, int i11, String str2, String str3, String str4) {
        p.j(str, "gpsInaccuracy");
        p.j(str2, "accepted");
        p.j(str3, "source");
        p.j(str4, "type");
        this.f18182a = str;
        this.f18183b = i11;
        this.f18184c = str2;
        this.f18185d = str3;
        this.f18186e = str4;
    }

    public final int a() {
        return this.f18183b;
    }

    public final void b(String str) {
        p.j(str, "<set-?>");
        this.f18184c = str;
    }

    public final void c(String str) {
        p.j(str, "<set-?>");
        this.f18185d = str;
    }

    public final void d(int i11) {
        this.f18183b = i11;
    }

    public final void e(String str) {
        p.j(str, "<set-?>");
        this.f18186e = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return p.e(this.f18182a, s0Var.f18182a) && this.f18183b == s0Var.f18183b && p.e(this.f18184c, s0Var.f18184c) && p.e(this.f18185d, s0Var.f18185d) && p.e(this.f18186e, s0Var.f18186e);
    }

    public int hashCode() {
        return (((((((this.f18182a.hashCode() * 31) + this.f18183b) * 31) + this.f18184c.hashCode()) * 31) + this.f18185d.hashCode()) * 31) + this.f18186e.hashCode();
    }

    public String toString() {
        return "LocationContextLog(gpsInaccuracy=" + this.f18182a + ", tryCount=" + this.f18183b + ", accepted=" + this.f18184c + ", source=" + this.f18185d + ", type=" + this.f18186e + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ s0(java.lang.String r4, int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.i r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            java.lang.String r4 = "0"
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000d
            r5 = 1
            r10 = 1
            goto L_0x000e
        L_0x000d:
            r10 = r5
        L_0x000e:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0014
            java.lang.String r6 = "no"
        L_0x0014:
            r0 = r6
            r5 = r9 & 8
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x001d
            r1 = r6
            goto L_0x001e
        L_0x001d:
            r1 = r7
        L_0x001e:
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0024
            r2 = r6
            goto L_0x0025
        L_0x0024:
            r2 = r8
        L_0x0025:
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cg0.s0.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
