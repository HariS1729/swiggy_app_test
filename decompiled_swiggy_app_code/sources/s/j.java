package s;

import android.os.Build;
import androidx.compose.foundation.MagnifierKt;
import d2.h;
import d2.k;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Magnifier.kt */
public final class j {

    /* renamed from: g  reason: collision with root package name */
    public static final a f16539g = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final j f16540h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final j f16541i;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16542a;

    /* renamed from: b  reason: collision with root package name */
    private final long f16543b;

    /* renamed from: c  reason: collision with root package name */
    private final float f16544c;

    /* renamed from: d  reason: collision with root package name */
    private final float f16545d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f16546e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f16547f;

    /* compiled from: Magnifier.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public static /* synthetic */ boolean d(a aVar, j jVar, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = Build.VERSION.SDK_INT;
            }
            return aVar.c(jVar, i11);
        }

        public final j a() {
            return j.f16540h;
        }

        public final j b() {
            return j.f16541i;
        }

        public final boolean c(j jVar, int i11) {
            p.j(jVar, "style");
            return MagnifierKt.b(i11) && !jVar.f() && (jVar.h() || p.e(jVar, a()) || i11 >= 29);
        }
    }

    static {
        j jVar = new j(0, 0.0f, 0.0f, false, false, 31, (i) null);
        f16540h = jVar;
        f16541i = new j(true, jVar.f16543b, jVar.f16544c, jVar.f16545d, jVar.f16546e, jVar.f16547f, (i) null);
    }

    public /* synthetic */ j(long j, float f11, float f12, boolean z11, boolean z12, i iVar) {
        this(j, f11, f12, z11, z12);
    }

    private j(boolean z11, long j, float f11, float f12, boolean z12, boolean z13) {
        this.f16542a = z11;
        this.f16543b = j;
        this.f16544c = f11;
        this.f16545d = f12;
        this.f16546e = z12;
        this.f16547f = z13;
    }

    public /* synthetic */ j(boolean z11, long j, float f11, float f12, boolean z12, boolean z13, i iVar) {
        this(z11, j, f11, f12, z12, z13);
    }

    public final boolean c() {
        return this.f16546e;
    }

    public final float d() {
        return this.f16544c;
    }

    public final float e() {
        return this.f16545d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f16542a == jVar.f16542a && k.f(this.f16543b, jVar.f16543b) && h.p(this.f16544c, jVar.f16544c) && h.p(this.f16545d, jVar.f16545d) && this.f16546e == jVar.f16546e && this.f16547f == jVar.f16547f;
    }

    public final boolean f() {
        return this.f16547f;
    }

    public final long g() {
        return this.f16543b;
    }

    public final boolean h() {
        return this.f16542a;
    }

    public int hashCode() {
        return (((((((((a0.h.a(this.f16542a) * 31) + k.i(this.f16543b)) * 31) + h.q(this.f16544c)) * 31) + h.q(this.f16545d)) * 31) + a0.h.a(this.f16546e)) * 31) + a0.h.a(this.f16547f);
    }

    public final boolean i() {
        return a.d(f16539g, this, 0, 2, (Object) null);
    }

    public String toString() {
        if (this.f16542a) {
            return "MagnifierStyle.TextDefault";
        }
        return "MagnifierStyle(size=" + k.j(this.f16543b) + ", cornerRadius=" + h.r(this.f16544c) + ", elevation=" + h.r(this.f16545d) + ", clippingEnabled=" + this.f16546e + ", fishEyeEnabled=" + this.f16547f + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ j(long r8, float r10, float r11, boolean r12, boolean r13, int r14, kotlin.jvm.internal.i r15) {
        /*
            r7 = this;
            r0 = r14 & 1
            if (r0 == 0) goto L_0x000b
            d2.k$a r0 = d2.k.f14006b
            long r0 = r0.a()
            goto L_0x000c
        L_0x000b:
            r0 = r8
        L_0x000c:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0017
            d2.h$a r2 = d2.h.f13997b
            float r2 = r2.c()
            goto L_0x0018
        L_0x0017:
            r2 = r10
        L_0x0018:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0023
            d2.h$a r3 = d2.h.f13997b
            float r3 = r3.c()
            goto L_0x0024
        L_0x0023:
            r3 = r11
        L_0x0024:
            r4 = r14 & 8
            if (r4 == 0) goto L_0x002a
            r4 = 1
            goto L_0x002b
        L_0x002a:
            r4 = r12
        L_0x002b:
            r5 = r14 & 16
            if (r5 == 0) goto L_0x0031
            r5 = 0
            goto L_0x0032
        L_0x0031:
            r5 = r13
        L_0x0032:
            r6 = 0
            r8 = r7
            r9 = r0
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r8.<init>((long) r9, (float) r11, (float) r12, (boolean) r13, (boolean) r14, (kotlin.jvm.internal.i) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.j.<init>(long, float, float, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }

    private j(long j, float f11, float f12, boolean z11, boolean z12) {
        this(false, j, f11, f12, z11, z12, (i) null);
    }
}
