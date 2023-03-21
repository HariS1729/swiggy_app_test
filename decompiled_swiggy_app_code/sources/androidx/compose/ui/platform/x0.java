package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import bp0.k;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.b;
import u0.d1;
import u0.w;
import u0.w0;
import u0.x;
import u0.y;

/* compiled from: RenderNodeApi29.android.kt */
public final class x0 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    private final AndroidComposeView f7389a;

    /* renamed from: b  reason: collision with root package name */
    private final RenderNode f7390b = new RenderNode("Compose");

    public x0(AndroidComposeView androidComposeView) {
        p.j(androidComposeView, "ownerView");
        this.f7389a = androidComposeView;
    }

    public void A(Outline outline) {
        this.f7390b.setOutline(outline);
    }

    public void B(boolean z11) {
        this.f7390b.setClipToOutline(z11);
    }

    public boolean C(int i11, int i12, int i13, int i14) {
        return this.f7390b.setPosition(i11, i12, i13, i14);
    }

    public void D() {
        this.f7390b.discardDisplayList();
    }

    public boolean E() {
        return this.f7390b.getClipToBounds();
    }

    public void F(int i11) {
        this.f7390b.setAmbientShadowColor(i11);
    }

    public void G(int i11) {
        this.f7390b.setSpotShadowColor(i11);
    }

    public float H() {
        return this.f7390b.getElevation();
    }

    public void c(float f11) {
        this.f7390b.setAlpha(f11);
    }

    public void e(float f11) {
        this.f7390b.setTranslationY(f11);
    }

    public void f(float f11) {
        this.f7390b.setCameraDistance(f11);
    }

    public void g(float f11) {
        this.f7390b.setRotationX(f11);
    }

    public float getAlpha() {
        return this.f7390b.getAlpha();
    }

    public int getBottom() {
        return this.f7390b.getBottom();
    }

    public int getHeight() {
        return this.f7390b.getHeight();
    }

    public int getLeft() {
        return this.f7390b.getLeft();
    }

    public int getRight() {
        return this.f7390b.getRight();
    }

    public int getTop() {
        return this.f7390b.getTop();
    }

    public int getWidth() {
        return this.f7390b.getWidth();
    }

    public void h(float f11) {
        this.f7390b.setRotationY(f11);
    }

    public void i(float f11) {
        this.f7390b.setRotationZ(f11);
    }

    public void j(d1 d1Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            y0.f7396a.a(this.f7390b, d1Var);
        }
    }

    public void l(float f11) {
        this.f7390b.setScaleX(f11);
    }

    public void m(float f11) {
        this.f7390b.setScaleY(f11);
    }

    public void n(float f11) {
        this.f7390b.setTranslationX(f11);
    }

    public void o(Canvas canvas) {
        p.j(canvas, "canvas");
        canvas.drawRenderNode(this.f7390b);
    }

    public void p(boolean z11) {
        this.f7390b.setClipToBounds(z11);
    }

    public void q(float f11) {
        this.f7390b.setElevation(f11);
    }

    public void r(int i11) {
        this.f7390b.offsetTopAndBottom(i11);
    }

    public boolean s() {
        return this.f7390b.hasDisplayList();
    }

    public void t(y yVar, w0 w0Var, l<? super x, k> lVar) {
        p.j(yVar, "canvasHolder");
        p.j(lVar, "drawBlock");
        RecordingCanvas beginRecording = this.f7390b.beginRecording();
        p.i(beginRecording, "renderNode.beginRecording()");
        Canvas v = yVar.a().v();
        yVar.a().w(beginRecording);
        b a11 = yVar.a();
        if (w0Var != null) {
            a11.a();
            w.c(a11, w0Var, 0, 2, (Object) null);
        }
        lVar.invoke(a11);
        if (w0Var != null) {
            a11.o();
        }
        yVar.a().w(v);
        this.f7390b.endRecording();
    }

    public boolean u() {
        return this.f7390b.getClipToOutline();
    }

    public boolean v(boolean z11) {
        return this.f7390b.setHasOverlappingRendering(z11);
    }

    public void w(Matrix matrix) {
        p.j(matrix, "matrix");
        this.f7390b.getMatrix(matrix);
    }

    public void x(int i11) {
        this.f7390b.offsetLeftAndRight(i11);
    }

    public void y(float f11) {
        this.f7390b.setPivotX(f11);
    }

    public void z(float f11) {
        this.f7390b.setPivotY(f11);
    }
}
