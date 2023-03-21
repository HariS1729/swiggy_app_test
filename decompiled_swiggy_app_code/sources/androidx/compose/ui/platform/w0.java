package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import bp0.k;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.b;
import u0.d1;
import u0.w;
import u0.x;
import u0.y;

/* compiled from: RenderNodeApi23.android.kt */
public final class w0 implements h0 {

    /* renamed from: h  reason: collision with root package name */
    public static final a f7378h = new a((i) null);

    /* renamed from: i  reason: collision with root package name */
    private static boolean f7379i;
    private static boolean j = true;

    /* renamed from: a  reason: collision with root package name */
    private final AndroidComposeView f7380a;

    /* renamed from: b  reason: collision with root package name */
    private final RenderNode f7381b;

    /* renamed from: c  reason: collision with root package name */
    private int f7382c;

    /* renamed from: d  reason: collision with root package name */
    private int f7383d;

    /* renamed from: e  reason: collision with root package name */
    private int f7384e;

    /* renamed from: f  reason: collision with root package name */
    private int f7385f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7386g;

    /* compiled from: RenderNodeApi23.android.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public w0(AndroidComposeView androidComposeView) {
        p.j(androidComposeView, "ownerView");
        this.f7380a = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        p.i(create, "create(\"Compose\", ownerView)");
        this.f7381b = create;
        if (j) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            J(create);
            a();
            j = false;
        }
        if (f7379i) {
            throw new NoClassDefFoundError();
        }
    }

    private final void J(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            b1 b1Var = b1.f7273a;
            b1Var.c(renderNode, b1Var.a(renderNode));
            b1Var.d(renderNode, b1Var.b(renderNode));
        }
    }

    private final void a() {
        if (Build.VERSION.SDK_INT >= 24) {
            a1.f7262a.a(this.f7381b);
        } else {
            z0.f7400a.a(this.f7381b);
        }
    }

    public void A(Outline outline) {
        this.f7381b.setOutline(outline);
    }

    public void B(boolean z11) {
        this.f7381b.setClipToOutline(z11);
    }

    public boolean C(int i11, int i12, int i13, int i14) {
        d(i11);
        I(i12);
        k(i13);
        b(i14);
        return this.f7381b.setLeftTopRightBottom(i11, i12, i13, i14);
    }

    public void D() {
        a();
    }

    public boolean E() {
        return this.f7386g;
    }

    public void F(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            b1.f7273a.c(this.f7381b, i11);
        }
    }

    public void G(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            b1.f7273a.d(this.f7381b, i11);
        }
    }

    public float H() {
        return this.f7381b.getElevation();
    }

    public void I(int i11) {
        this.f7383d = i11;
    }

    public void b(int i11) {
        this.f7385f = i11;
    }

    public void c(float f11) {
        this.f7381b.setAlpha(f11);
    }

    public void d(int i11) {
        this.f7382c = i11;
    }

    public void e(float f11) {
        this.f7381b.setTranslationY(f11);
    }

    public void f(float f11) {
        this.f7381b.setCameraDistance(-f11);
    }

    public void g(float f11) {
        this.f7381b.setRotationX(f11);
    }

    public float getAlpha() {
        return this.f7381b.getAlpha();
    }

    public int getBottom() {
        return this.f7385f;
    }

    public int getHeight() {
        return getBottom() - getTop();
    }

    public int getLeft() {
        return this.f7382c;
    }

    public int getRight() {
        return this.f7384e;
    }

    public int getTop() {
        return this.f7383d;
    }

    public int getWidth() {
        return getRight() - getLeft();
    }

    public void h(float f11) {
        this.f7381b.setRotationY(f11);
    }

    public void i(float f11) {
        this.f7381b.setRotation(f11);
    }

    public void j(d1 d1Var) {
    }

    public void k(int i11) {
        this.f7384e = i11;
    }

    public void l(float f11) {
        this.f7381b.setScaleX(f11);
    }

    public void m(float f11) {
        this.f7381b.setScaleY(f11);
    }

    public void n(float f11) {
        this.f7381b.setTranslationX(f11);
    }

    public void o(Canvas canvas) {
        p.j(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f7381b);
    }

    public void p(boolean z11) {
        this.f7386g = z11;
        this.f7381b.setClipToBounds(z11);
    }

    public void q(float f11) {
        this.f7381b.setElevation(f11);
    }

    public void r(int i11) {
        I(getTop() + i11);
        b(getBottom() + i11);
        this.f7381b.offsetTopAndBottom(i11);
    }

    public boolean s() {
        return this.f7381b.isValid();
    }

    public void t(y yVar, u0.w0 w0Var, l<? super x, k> lVar) {
        p.j(yVar, "canvasHolder");
        p.j(lVar, "drawBlock");
        Canvas start = this.f7381b.start(getWidth(), getHeight());
        p.i(start, "renderNode.start(width, height)");
        Canvas v = yVar.a().v();
        yVar.a().w(start);
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
        this.f7381b.end(start);
    }

    public boolean u() {
        return this.f7381b.getClipToOutline();
    }

    public boolean v(boolean z11) {
        return this.f7381b.setHasOverlappingRendering(z11);
    }

    public void w(Matrix matrix) {
        p.j(matrix, "matrix");
        this.f7381b.getMatrix(matrix);
    }

    public void x(int i11) {
        d(getLeft() + i11);
        k(getRight() + i11);
        this.f7381b.offsetLeftAndRight(i11);
    }

    public void y(float f11) {
        this.f7381b.setPivotX(f11);
    }

    public void z(float f11) {
        this.f7381b.setPivotY(f11);
    }
}
