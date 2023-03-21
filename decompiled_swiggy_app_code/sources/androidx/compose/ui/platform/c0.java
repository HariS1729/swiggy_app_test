package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import u0.g;
import u0.p0;

/* compiled from: AndroidComposeView.android.kt */
final class c0 implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f7280a = new int[2];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f7281b = p0.c((float[]) null, 1, (i) null);

    private final void b(float[] fArr, Matrix matrix) {
        g.b(this.f7281b, matrix);
        AndroidComposeView_androidKt.g(fArr, this.f7281b);
    }

    private final void c(float[] fArr, float f11, float f12) {
        p0.h(this.f7281b);
        p0.m(this.f7281b, f11, f12, 0.0f, 4, (Object) null);
        AndroidComposeView_androidKt.g(fArr, this.f7281b);
    }

    private final void d(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, fArr);
            c(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            c(fArr, (float) view.getLeft(), (float) view.getTop());
        } else {
            int[] iArr = this.f7280a;
            view.getLocationInWindow(iArr);
            c(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            c(fArr, (float) iArr[0], (float) iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            p.i(matrix, "viewMatrix");
            b(fArr, matrix);
        }
    }

    public void a(View view, float[] fArr) {
        p.j(view, "view");
        p.j(fArr, "matrix");
        p0.h(fArr);
        d(view, fArr);
    }
}
