package androidx.compose.ui.window;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AbstractComposeView;
import bp0.k;
import e0.a1;
import e0.g;
import e0.h0;
import e0.s0;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: AndroidDialog.android.kt */
final class DialogLayout extends AbstractComposeView {

    /* renamed from: h  reason: collision with root package name */
    private final Window f7838h;

    /* renamed from: i  reason: collision with root package name */
    private final h0 f7839i = j.e(ComposableSingletons$AndroidDialog_androidKt.f7832a.a(), (a1) null, 2, (Object) null);
    private boolean j;
    private boolean k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogLayout(Context context, Window window) {
        super(context, (AttributeSet) null, 0, 6, (i) null);
        p.j(context, LogCategory.CONTEXT);
        p.j(window, "window");
        this.f7838h = window;
    }

    private final lp0.p<g, Integer, k> getContent() {
        return (lp0.p) this.f7839i.getValue();
    }

    private final int getDisplayHeight() {
        return c.c(((float) getContext().getResources().getConfiguration().screenHeightDp) * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return c.c(((float) getContext().getResources().getConfiguration().screenWidthDp) * getContext().getResources().getDisplayMetrics().density);
    }

    private final void setContent(lp0.p<? super g, ? super Integer, k> pVar) {
        this.f7839i.setValue(pVar);
    }

    public void a(g gVar, int i11) {
        g t = gVar.t(1735448596);
        getContent().invoke(t, 0);
        s0 v = t.v();
        if (v != null) {
            v.a(new DialogLayout$Content$4(this, i11));
        }
    }

    public void g(boolean z11, int i11, int i12, int i13, int i14) {
        super.g(z11, i11, i12, i13, i14);
        View childAt = getChildAt(0);
        if (childAt != null) {
            k().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.k;
    }

    public void h(int i11, int i12) {
        if (this.j) {
            super.h(i11, i12);
        } else {
            super.h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public Window k() {
        return this.f7838h;
    }

    public final void l(a aVar, lp0.p<? super g, ? super Integer, k> pVar) {
        p.j(aVar, "parent");
        p.j(pVar, "content");
        setParentCompositionContext(aVar);
        setContent(pVar);
        this.k = true;
        d();
    }

    public final void m(boolean z11) {
        this.j = z11;
    }
}
