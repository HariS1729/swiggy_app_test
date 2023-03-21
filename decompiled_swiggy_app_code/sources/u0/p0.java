package u0;

import com.newrelic.agent.android.util.SafeJsonPrimitive;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.d;
import t0.f;
import t0.g;

/* compiled from: Matrix.kt */
public final class p0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16855b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final float[] f16856a;

    /* compiled from: Matrix.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    private /* synthetic */ p0(float[] fArr) {
        this.f16856a = fArr;
    }

    public static final /* synthetic */ p0 a(float[] fArr) {
        return new p0(fArr);
    }

    public static float[] b(float[] fArr) {
        p.j(fArr, "values");
        return fArr;
    }

    public static /* synthetic */ float[] c(float[] fArr, int i11, i iVar) {
        if ((i11 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof p0) && p.e(fArr, ((p0) obj).n());
    }

    public static int e(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final long f(float[] fArr, long j) {
        float m11 = f.m(j);
        float n = f.n(j);
        float f11 = ((float) 1) / (((fArr[3] * m11) + (fArr[7] * n)) + fArr[15]);
        if (!(!Float.isInfinite(f11) && !Float.isNaN(f11))) {
            f11 = 0.0f;
        }
        return g.a(((fArr[0] * m11) + (fArr[4] * n) + fArr[12]) * f11, f11 * ((fArr[1] * m11) + (fArr[5] * n) + fArr[13]));
    }

    public static final void g(float[] fArr, d dVar) {
        p.j(dVar, "rect");
        long f11 = f(fArr, g.a(dVar.b(), dVar.d()));
        long f12 = f(fArr, g.a(dVar.b(), dVar.a()));
        long f13 = f(fArr, g.a(dVar.c(), dVar.d()));
        long f14 = f(fArr, g.a(dVar.c(), dVar.a()));
        dVar.i(Math.min(Math.min(f.m(f11), f.m(f12)), Math.min(f.m(f13), f.m(f14))));
        dVar.k(Math.min(Math.min(f.n(f11), f.n(f12)), Math.min(f.n(f13), f.n(f14))));
        dVar.j(Math.max(Math.max(f.m(f11), f.m(f12)), Math.max(f.m(f13), f.m(f14))));
        dVar.h(Math.max(Math.max(f.n(f11), f.n(f12)), Math.max(f.n(f13), f.n(f14))));
    }

    public static final void h(float[] fArr) {
        int i11 = 0;
        while (i11 < 4) {
            int i12 = 0;
            while (i12 < 4) {
                fArr[(i12 * 4) + i11] = i11 == i12 ? 1.0f : 0.0f;
                i12++;
            }
            i11++;
        }
    }

    public static final void i(float[] fArr, float f11) {
        double d11 = (((double) f11) * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d11);
        float sin = (float) Math.sin(d11);
        float f12 = fArr[0];
        float f13 = fArr[4];
        float f14 = -sin;
        float f15 = fArr[1];
        float f16 = fArr[5];
        float f17 = fArr[2];
        float f18 = fArr[6];
        float f19 = fArr[3];
        float f21 = fArr[7];
        fArr[0] = (cos * f12) + (sin * f13);
        fArr[1] = (cos * f15) + (sin * f16);
        fArr[2] = (cos * f17) + (sin * f18);
        fArr[3] = (cos * f19) + (sin * f21);
        fArr[4] = (f12 * f14) + (f13 * cos);
        fArr[5] = (f15 * f14) + (f16 * cos);
        fArr[6] = (f17 * f14) + (f18 * cos);
        fArr[7] = (f14 * f19) + (cos * f21);
    }

    public static final void j(float[] fArr, float f11, float f12, float f13) {
        fArr[0] = fArr[0] * f11;
        fArr[1] = fArr[1] * f11;
        fArr[2] = fArr[2] * f11;
        fArr[3] = fArr[3] * f11;
        fArr[4] = fArr[4] * f12;
        fArr[5] = fArr[5] * f12;
        fArr[6] = fArr[6] * f12;
        fArr[7] = fArr[7] * f12;
        fArr[8] = fArr[8] * f13;
        fArr[9] = fArr[9] * f13;
        fArr[10] = fArr[10] * f13;
        fArr[11] = fArr[11] * f13;
    }

    public static String k(float[] fArr) {
        return StringsKt__IndentKt.f("\n            |" + fArr[0] + SafeJsonPrimitive.NULL_CHAR + fArr[1] + SafeJsonPrimitive.NULL_CHAR + fArr[2] + SafeJsonPrimitive.NULL_CHAR + fArr[3] + "|\n            |" + fArr[4] + SafeJsonPrimitive.NULL_CHAR + fArr[5] + SafeJsonPrimitive.NULL_CHAR + fArr[6] + SafeJsonPrimitive.NULL_CHAR + fArr[7] + "|\n            |" + fArr[8] + SafeJsonPrimitive.NULL_CHAR + fArr[9] + SafeJsonPrimitive.NULL_CHAR + fArr[10] + SafeJsonPrimitive.NULL_CHAR + fArr[11] + "|\n            |" + fArr[12] + SafeJsonPrimitive.NULL_CHAR + fArr[13] + SafeJsonPrimitive.NULL_CHAR + fArr[14] + SafeJsonPrimitive.NULL_CHAR + fArr[15] + "|\n        ");
    }

    public static final void l(float[] fArr, float f11, float f12, float f13) {
        float f14 = (fArr[0] * f11) + (fArr[4] * f12) + (fArr[8] * f13) + fArr[12];
        float f15 = (fArr[1] * f11) + (fArr[5] * f12) + (fArr[9] * f13) + fArr[13];
        float f16 = (fArr[2] * f11) + (fArr[6] * f12) + (fArr[10] * f13) + fArr[14];
        fArr[12] = f14;
        fArr[13] = f15;
        fArr[14] = f16;
        fArr[15] = (fArr[3] * f11) + (fArr[7] * f12) + (fArr[11] * f13) + fArr[15];
    }

    public static /* synthetic */ void m(float[] fArr, float f11, float f12, float f13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        l(fArr, f11, f12, f13);
    }

    public boolean equals(Object obj) {
        return d(this.f16856a, obj);
    }

    public int hashCode() {
        return e(this.f16856a);
    }

    public final /* synthetic */ float[] n() {
        return this.f16856a;
    }

    public String toString() {
        return k(this.f16856a);
    }
}
