package u0;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import kotlin.jvm.internal.p;
import u0.l1;
import u0.m1;

/* compiled from: AndroidPaint.android.kt */
public final class i {

    /* compiled from: AndroidPaint.android.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16801a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f16802b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f16803c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            iArr[Paint.Style.STROKE.ordinal()] = 1;
            f16801a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            f16802b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            iArr3[Paint.Join.MITER.ordinal()] = 1;
            iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            iArr3[Paint.Join.ROUND.ordinal()] = 3;
            f16803c = iArr3;
        }
    }

    public static final t0 a() {
        return new h();
    }

    public static final float b(Paint paint) {
        p.j(paint, "<this>");
        return ((float) paint.getAlpha()) / 255.0f;
    }

    public static final long c(Paint paint) {
        p.j(paint, "<this>");
        return f0.b(paint.getColor());
    }

    public static final int d(Paint paint) {
        p.j(paint, "<this>");
        if (!paint.isFilterBitmap()) {
            return h0.f16791a.b();
        }
        return h0.f16791a.a();
    }

    public static final int e(Paint paint) {
        p.j(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i11 = strokeCap == null ? -1 : a.f16802b[strokeCap.ordinal()];
        if (i11 == 1) {
            return l1.f16824b.a();
        }
        if (i11 == 2) {
            return l1.f16824b.b();
        }
        if (i11 != 3) {
            return l1.f16824b.a();
        }
        return l1.f16824b.c();
    }

    public static final int f(Paint paint) {
        p.j(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i11 = strokeJoin == null ? -1 : a.f16803c[strokeJoin.ordinal()];
        if (i11 == 1) {
            return m1.f16837b.b();
        }
        if (i11 == 2) {
            return m1.f16837b.a();
        }
        if (i11 != 3) {
            return m1.f16837b.b();
        }
        return m1.f16837b.c();
    }

    public static final float g(Paint paint) {
        p.j(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public static final float h(Paint paint) {
        p.j(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public static final Paint i() {
        return new Paint(7);
    }

    public static final void j(Paint paint, float f11) {
        p.j(paint, "<this>");
        paint.setAlpha((int) ((float) Math.rint((double) (f11 * 255.0f))));
    }

    public static final void k(Paint paint, int i11) {
        p.j(paint, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            s1.f16886a.a(paint, i11);
        } else {
            paint.setXfermode(new PorterDuffXfermode(a.b(i11)));
        }
    }

    public static final void l(Paint paint, long j) {
        p.j(paint, "$this$setNativeColor");
        paint.setColor(f0.j(j));
    }

    public static final void m(Paint paint, e0 e0Var) {
        p.j(paint, "<this>");
        paint.setColorFilter(e0Var != null ? d.c(e0Var) : null);
    }

    public static final void n(Paint paint, int i11) {
        p.j(paint, "$this$setNativeFilterQuality");
        paint.setFilterBitmap(!h0.d(i11, h0.f16791a.b()));
    }

    public static final void o(Paint paint, x0 x0Var) {
        p.j(paint, "<this>");
        k kVar = (k) x0Var;
        paint.setPathEffect(kVar != null ? kVar.a() : null);
    }

    public static final void p(Paint paint, Shader shader) {
        p.j(paint, "<this>");
        paint.setShader(shader);
    }

    public static final void q(Paint paint, int i11) {
        Paint.Cap cap;
        p.j(paint, "$this$setNativeStrokeCap");
        l1.a aVar = l1.f16824b;
        if (l1.g(i11, aVar.c())) {
            cap = Paint.Cap.SQUARE;
        } else if (l1.g(i11, aVar.b())) {
            cap = Paint.Cap.ROUND;
        } else if (l1.g(i11, aVar.a())) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final void r(Paint paint, int i11) {
        Paint.Join join;
        p.j(paint, "$this$setNativeStrokeJoin");
        m1.a aVar = m1.f16837b;
        if (m1.g(i11, aVar.b())) {
            join = Paint.Join.MITER;
        } else if (m1.g(i11, aVar.a())) {
            join = Paint.Join.BEVEL;
        } else if (m1.g(i11, aVar.c())) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void s(Paint paint, float f11) {
        p.j(paint, "<this>");
        paint.setStrokeMiter(f11);
    }

    public static final void t(Paint paint, float f11) {
        p.j(paint, "<this>");
        paint.setStrokeWidth(f11);
    }

    public static final void u(Paint paint, int i11) {
        Paint.Style style;
        p.j(paint, "$this$setNativeStyle");
        if (u0.d(i11, u0.f16890a.b())) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }
}
