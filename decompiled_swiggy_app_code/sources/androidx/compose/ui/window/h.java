package androidx.compose.ui.window;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: AndroidPopup.android.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f7870a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7871b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7872c;

    /* renamed from: d  reason: collision with root package name */
    private final SecureFlagPolicy f7873d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f7874e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f7875f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f7876g;

    public h() {
        this(false, false, false, (SecureFlagPolicy) null, false, false, false, 127, (i) null);
    }

    public h(boolean z11, boolean z12, boolean z13, SecureFlagPolicy secureFlagPolicy, boolean z14, boolean z15, boolean z16) {
        p.j(secureFlagPolicy, "securePolicy");
        this.f7870a = z11;
        this.f7871b = z12;
        this.f7872c = z13;
        this.f7873d = secureFlagPolicy;
        this.f7874e = z14;
        this.f7875f = z15;
        this.f7876g = z16;
    }

    public final boolean a() {
        return this.f7875f;
    }

    public final boolean b() {
        return this.f7871b;
    }

    public final boolean c() {
        return this.f7872c;
    }

    public final boolean d() {
        return this.f7874e;
    }

    public final boolean e() {
        return this.f7870a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f7870a == hVar.f7870a && this.f7871b == hVar.f7871b && this.f7872c == hVar.f7872c && this.f7873d == hVar.f7873d && this.f7874e == hVar.f7874e && this.f7875f == hVar.f7875f && this.f7876g == hVar.f7876g;
    }

    public final SecureFlagPolicy f() {
        return this.f7873d;
    }

    public final boolean g() {
        return this.f7876g;
    }

    public int hashCode() {
        return (((((((((((((a0.h.a(this.f7871b) * 31) + a0.h.a(this.f7870a)) * 31) + a0.h.a(this.f7871b)) * 31) + a0.h.a(this.f7872c)) * 31) + this.f7873d.hashCode()) * 31) + a0.h.a(this.f7874e)) * 31) + a0.h.a(this.f7875f)) * 31) + a0.h.a(this.f7876g);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ h(boolean r7, boolean r8, boolean r9, androidx.compose.ui.window.SecureFlagPolicy r10, boolean r11, boolean r12, boolean r13, int r14, kotlin.jvm.internal.i r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = 0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            r1 = 1
            if (r7 == 0) goto L_0x000f
            r2 = 1
            goto L_0x0010
        L_0x000f:
            r2 = r8
        L_0x0010:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0016
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = r9
        L_0x0017:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001d
            androidx.compose.ui.window.SecureFlagPolicy r10 = androidx.compose.ui.window.SecureFlagPolicy.Inherit
        L_0x001d:
            r4 = r10
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0024
            r5 = 1
            goto L_0x0025
        L_0x0024:
            r5 = r11
        L_0x0025:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r1 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = 0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r5
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.h.<init>(boolean, boolean, boolean, androidx.compose.ui.window.SecureFlagPolicy, boolean, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ h(boolean r5, boolean r6, boolean r7, androidx.compose.ui.window.SecureFlagPolicy r8, boolean r9, boolean r10, int r11, kotlin.jvm.internal.i r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0005
            r5 = 0
        L_0x0005:
            r12 = r11 & 2
            r0 = 1
            if (r12 == 0) goto L_0x000c
            r12 = 1
            goto L_0x000d
        L_0x000c:
            r12 = r6
        L_0x000d:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = r7
        L_0x0014:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001a
            androidx.compose.ui.window.SecureFlagPolicy r8 = androidx.compose.ui.window.SecureFlagPolicy.Inherit
        L_0x001a:
            r2 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0021
            r3 = 1
            goto L_0x0022
        L_0x0021:
            r3 = r9
        L_0x0022:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r10
        L_0x0028:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.h.<init>(boolean, boolean, boolean, androidx.compose.ui.window.SecureFlagPolicy, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(boolean z11, boolean z12, boolean z13, SecureFlagPolicy secureFlagPolicy, boolean z14, boolean z15) {
        this(z11, z12, z13, secureFlagPolicy, z14, z15, false);
        p.j(secureFlagPolicy, "securePolicy");
    }
}
