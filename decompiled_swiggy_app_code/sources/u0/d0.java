package u0;

import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import bp0.l;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import okhttp3.internal.ws.WebSocketProtocol;
import v0.c;
import v0.d;

/* compiled from: Color.kt */
public final class d0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16756b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f16757c = f0.c(4278190080L);

    /* renamed from: d  reason: collision with root package name */
    private static final long f16758d = f0.c(4282664004L);

    /* renamed from: e  reason: collision with root package name */
    private static final long f16759e = f0.c(4287137928L);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final long f16760f = f0.c(4291611852L);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final long f16761g = f0.c(4294967295L);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final long f16762h = f0.c(4294901760L);

    /* renamed from: i  reason: collision with root package name */
    private static final long f16763i = f0.c(4278255360L);
    /* access modifiers changed from: private */
    public static final long j = f0.c(4278190335L);
    private static final long k = f0.c(4294967040L);

    /* renamed from: l  reason: collision with root package name */
    private static final long f16764l = f0.c(4278255615L);

    /* renamed from: m  reason: collision with root package name */
    private static final long f16765m = f0.c(4294902015L);
    /* access modifiers changed from: private */
    public static final long n = f0.b(0);
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final long f16766o = f0.a(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.f6442a.u());

    /* renamed from: a  reason: collision with root package name */
    private final long f16767a;

    /* compiled from: Color.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final long a() {
            return d0.f16757c;
        }

        public final long b() {
            return d0.j;
        }

        public final long c() {
            return d0.f16760f;
        }

        public final long d() {
            return d0.f16762h;
        }

        public final long e() {
            return d0.n;
        }

        public final long f() {
            return d0.f16766o;
        }

        public final long g() {
            return d0.f16761g;
        }
    }

    private /* synthetic */ d0(long j11) {
        this.f16767a = j11;
    }

    public static final /* synthetic */ d0 h(long j11) {
        return new d0(j11);
    }

    public static long i(long j11) {
        return j11;
    }

    public static final long j(long j11, androidx.compose.ui.graphics.colorspace.a aVar) {
        p.j(aVar, "colorSpace");
        if (p.e(aVar, q(j11))) {
            return j11;
        }
        d i11 = c.i(q(j11), aVar, 0, 2, (Object) null);
        float[] d11 = f0.f(j11);
        i11.a(d11);
        return f0.a(d11[0], d11[1], d11[2], d11[3], aVar);
    }

    public static final long k(long j11, float f11, float f12, float f13, float f14) {
        return f0.a(f12, f13, f14, f11, q(j11));
    }

    public static /* synthetic */ long l(long j11, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = o(j11);
        }
        float f15 = f11;
        if ((i11 & 2) != 0) {
            f12 = s(j11);
        }
        float f16 = f12;
        if ((i11 & 4) != 0) {
            f13 = r(j11);
        }
        float f17 = f13;
        if ((i11 & 8) != 0) {
            f14 = p(j11);
        }
        return k(j11, f15, f16, f17, f14);
    }

    public static boolean m(long j11, Object obj) {
        return (obj instanceof d0) && j11 == ((d0) obj).v();
    }

    public static final boolean n(long j11, long j12) {
        return j11 == j12;
    }

    public static final float o(long j11) {
        float f11;
        float f12;
        if (bp0.i.c(63 & j11) == 0) {
            f12 = (float) l.b(bp0.i.c(bp0.i.c(j11 >>> 56) & 255));
            f11 = 255.0f;
        } else {
            f12 = (float) l.b(bp0.i.c(bp0.i.c(j11 >>> 6) & 1023));
            f11 = 1023.0f;
        }
        return f12 / f11;
    }

    public static final float p(long j11) {
        if (bp0.i.c(63 & j11) == 0) {
            return ((float) l.b(bp0.i.c(bp0.i.c(j11 >>> 32) & 255))) / 255.0f;
        }
        return i0.d(i0.c((short) ((int) bp0.i.c(bp0.i.c(j11 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX))));
    }

    public static final androidx.compose.ui.graphics.colorspace.a q(long j11) {
        ColorSpaces colorSpaces = ColorSpaces.f6442a;
        return colorSpaces.h()[(int) bp0.i.c(j11 & 63)];
    }

    public static final float r(long j11) {
        if (bp0.i.c(63 & j11) == 0) {
            return ((float) l.b(bp0.i.c(bp0.i.c(j11 >>> 40) & 255))) / 255.0f;
        }
        return i0.d(i0.c((short) ((int) bp0.i.c(bp0.i.c(j11 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX))));
    }

    public static final float s(long j11) {
        if (bp0.i.c(63 & j11) == 0) {
            return ((float) l.b(bp0.i.c(bp0.i.c(j11 >>> 48) & 255))) / 255.0f;
        }
        return i0.d(i0.c((short) ((int) bp0.i.c(bp0.i.c(j11 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX))));
    }

    public static int t(long j11) {
        return bp0.i.e(j11);
    }

    public static String u(long j11) {
        return "Color(" + s(j11) + ", " + r(j11) + ", " + p(j11) + ", " + o(j11) + ", " + q(j11).g() + ')';
    }

    public boolean equals(Object obj) {
        return m(this.f16767a, obj);
    }

    public int hashCode() {
        return t(this.f16767a);
    }

    public String toString() {
        return u(this.f16767a);
    }

    public final /* synthetic */ long v() {
        return this.f16767a;
    }
}
