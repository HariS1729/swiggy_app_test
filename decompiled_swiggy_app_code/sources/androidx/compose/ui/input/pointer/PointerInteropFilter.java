package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import f1.b0;
import f1.c0;
import f1.j0;
import lp0.l;
import lp0.p;
import p0.c;
import p0.d;
import p0.e;

/* compiled from: PointerInteropFilter.android.kt */
public final class PointerInteropFilter implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public l<? super MotionEvent, Boolean> f6648a;

    /* renamed from: b  reason: collision with root package name */
    private j0 f6649b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6650c;

    /* renamed from: d  reason: collision with root package name */
    private final b0 f6651d = new PointerInteropFilter$pointerInputFilter$1(this);

    /* compiled from: PointerInteropFilter.android.kt */
    private enum DispatchToViewState {
        Unknown,
        Dispatching,
        NotDispatching
    }

    public /* synthetic */ d N(d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, p pVar) {
        return e.c(this, obj, pVar);
    }

    public final boolean a() {
        return this.f6650c;
    }

    public final l<MotionEvent, Boolean> c() {
        l<? super MotionEvent, Boolean> lVar = this.f6648a;
        if (lVar != null) {
            return lVar;
        }
        kotlin.jvm.internal.p.B("onTouchEvent");
        return null;
    }

    public final void d(boolean z11) {
        this.f6650c = z11;
    }

    public final void e(l<? super MotionEvent, Boolean> lVar) {
        kotlin.jvm.internal.p.j(lVar, "<set-?>");
        this.f6648a = lVar;
    }

    public final void f(j0 j0Var) {
        j0 j0Var2 = this.f6649b;
        if (j0Var2 != null) {
            j0Var2.b((PointerInteropFilter) null);
        }
        this.f6649b = j0Var;
        if (j0Var != null) {
            j0Var.b(this);
        }
    }

    public b0 q0() {
        return this.f6651d;
    }

    public /* synthetic */ Object s(Object obj, p pVar) {
        return e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
