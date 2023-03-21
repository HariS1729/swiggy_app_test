package androidx.compose.ui.platform;

import android.graphics.Matrix;
import bp0.k;
import kotlin.jvm.internal.i;
import lp0.p;
import u0.g;
import u0.p0;

/* compiled from: LayerMatrixCache.android.kt */
public final class r0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final p<T, Matrix, k> f7335a;

    /* renamed from: b  reason: collision with root package name */
    private Matrix f7336b;

    /* renamed from: c  reason: collision with root package name */
    private Matrix f7337c;

    /* renamed from: d  reason: collision with root package name */
    private float[] f7338d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f7339e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7340f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7341g = true;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7342h = true;

    public r0(p<? super T, ? super Matrix, k> pVar) {
        kotlin.jvm.internal.p.j(pVar, "getMatrix");
        this.f7335a = pVar;
    }

    public final float[] a(T t) {
        float[] fArr = this.f7339e;
        if (fArr == null) {
            fArr = p0.c((float[]) null, 1, (i) null);
            this.f7339e = fArr;
        }
        if (this.f7341g) {
            this.f7342h = p0.a(b(t), fArr);
            this.f7341g = false;
        }
        if (this.f7342h) {
            return fArr;
        }
        return null;
    }

    public final float[] b(T t) {
        float[] fArr = this.f7338d;
        if (fArr == null) {
            fArr = p0.c((float[]) null, 1, (i) null);
            this.f7338d = fArr;
        }
        if (!this.f7340f) {
            return fArr;
        }
        Matrix matrix = this.f7336b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f7336b = matrix;
        }
        this.f7335a.invoke(t, matrix);
        Matrix matrix2 = this.f7337c;
        if (matrix2 == null || !kotlin.jvm.internal.p.e(matrix, matrix2)) {
            g.b(fArr, matrix);
            this.f7336b = matrix2;
            this.f7337c = matrix;
        }
        this.f7340f = false;
        return fArr;
    }

    public final void c() {
        this.f7340f = true;
        this.f7341g = true;
    }
}
