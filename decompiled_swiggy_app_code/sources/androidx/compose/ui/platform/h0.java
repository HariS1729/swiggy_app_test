package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import bp0.k;
import lp0.l;
import u0.d1;
import u0.w0;
import u0.x;
import u0.y;

/* compiled from: DeviceRenderNode.android.kt */
public interface h0 {
    void A(Outline outline);

    void B(boolean z11);

    boolean C(int i11, int i12, int i13, int i14);

    void D();

    boolean E();

    void F(int i11);

    void G(int i11);

    float H();

    void c(float f11);

    void e(float f11);

    void f(float f11);

    void g(float f11);

    float getAlpha();

    int getBottom();

    int getHeight();

    int getLeft();

    int getRight();

    int getTop();

    int getWidth();

    void h(float f11);

    void i(float f11);

    void j(d1 d1Var);

    void l(float f11);

    void m(float f11);

    void n(float f11);

    void o(Canvas canvas);

    void p(boolean z11);

    void q(float f11);

    void r(int i11);

    boolean s();

    void t(y yVar, w0 w0Var, l<? super x, k> lVar);

    boolean u();

    boolean v(boolean z11);

    void w(Matrix matrix);

    void x(int i11);

    void y(float f11);

    void z(float f11);
}
