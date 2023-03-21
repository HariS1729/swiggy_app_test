package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.a0;

@SuppressLint({"ViewConstructor"})
/* compiled from: GhostViewPort */
class p extends ViewGroup implements m {

    /* renamed from: a  reason: collision with root package name */
    ViewGroup f11988a;

    /* renamed from: b  reason: collision with root package name */
    View f11989b;

    /* renamed from: c  reason: collision with root package name */
    final View f11990c;

    /* renamed from: d  reason: collision with root package name */
    int f11991d;

    /* renamed from: e  reason: collision with root package name */
    private Matrix f11992e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f11993f = new a();

    /* compiled from: GhostViewPort */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        public boolean onPreDraw() {
            View view;
            a0.n0(p.this);
            p pVar = p.this;
            ViewGroup viewGroup = pVar.f11988a;
            if (viewGroup == null || (view = pVar.f11989b) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            a0.n0(p.this.f11988a);
            p pVar2 = p.this;
            pVar2.f11988a = null;
            pVar2.f11989b = null;
            return true;
        }
    }

    p(View view) {
        super(view.getContext());
        this.f11990c = view;
        setWillNotDraw(false);
        setLayerType(2, (Paint) null);
    }

    static p b(View view, ViewGroup viewGroup, Matrix matrix) {
        n nVar;
        if (view.getParent() instanceof ViewGroup) {
            n b11 = n.b(viewGroup);
            p e11 = e(view);
            int i11 = 0;
            if (!(e11 == null || (nVar = (n) e11.getParent()) == b11)) {
                i11 = e11.f11991d;
                nVar.removeView(e11);
                e11 = null;
            }
            if (e11 == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    c(view, viewGroup, matrix);
                }
                e11 = new p(view);
                e11.h(matrix);
                if (b11 == null) {
                    b11 = new n(viewGroup);
                } else {
                    b11.g();
                }
                d(viewGroup, b11);
                d(viewGroup, e11);
                b11.a(e11);
                e11.f11991d = i11;
            } else if (matrix != null) {
                e11.h(matrix);
            }
            e11.f11991d++;
            return e11;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        p0.j(viewGroup2, matrix);
        matrix.preTranslate((float) (-viewGroup2.getScrollX()), (float) (-viewGroup2.getScrollY()));
        p0.k(viewGroup, matrix);
    }

    static void d(View view, View view2) {
        p0.g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    static p e(View view) {
        return (p) view.getTag(R.id.ghost_view);
    }

    static void f(View view) {
        p e11 = e(view);
        if (e11 != null) {
            int i11 = e11.f11991d - 1;
            e11.f11991d = i11;
            if (i11 <= 0) {
                ((n) e11.getParent()).removeView(e11);
            }
        }
    }

    static void g(View view, p pVar) {
        view.setTag(R.id.ghost_view, pVar);
    }

    public void a(ViewGroup viewGroup, View view) {
        this.f11988a = viewGroup;
        this.f11989b = view;
    }

    /* access modifiers changed from: package-private */
    public void h(Matrix matrix) {
        this.f11992e = matrix;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.f11990c, this);
        this.f11990c.getViewTreeObserver().addOnPreDrawListener(this.f11993f);
        p0.i(this.f11990c, 4);
        if (this.f11990c.getParent() != null) {
            ((View) this.f11990c.getParent()).invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f11990c.getViewTreeObserver().removeOnPreDrawListener(this.f11993f);
        p0.i(this.f11990c, 0);
        g(this.f11990c, (p) null);
        if (this.f11990c.getParent() != null) {
            ((View) this.f11990c.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        c.a(canvas, true);
        canvas.setMatrix(this.f11992e);
        p0.i(this.f11990c, 0);
        this.f11990c.invalidate();
        p0.i(this.f11990c, 4);
        drawChild(canvas, this.f11990c, getDrawingTime());
        c.a(canvas, false);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    public void setVisibility(int i11) {
        super.setVisibility(i11);
        if (e(this.f11990c) == this) {
            p0.i(this.f11990c, i11 == 0 ? 4 : 0);
        }
    }
}
