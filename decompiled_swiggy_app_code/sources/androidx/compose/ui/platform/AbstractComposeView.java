package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.a;
import bp0.k;
import e0.g;
import e0.h;
import in.juspay.hyper.constants.LogCategory;
import java.lang.ref.WeakReference;
import k1.q;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import l0.b;

/* compiled from: ComposeView.android.kt */
public abstract class AbstractComposeView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<a> f6941a;

    /* renamed from: b  reason: collision with root package name */
    private IBinder f6942b;

    /* renamed from: c  reason: collision with root package name */
    private h f6943c;

    /* renamed from: d  reason: collision with root package name */
    private a f6944d;

    /* renamed from: e  reason: collision with root package name */
    private lp0.a<k> f6945e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6946f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6947g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (i) null);
        p.j(context, LogCategory.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i11, int i12, i iVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final a b(a aVar) {
        a aVar2 = i(aVar) ? aVar : null;
        if (aVar2 != null) {
            this.f6941a = new WeakReference<>(aVar2);
        }
        return aVar;
    }

    private final void c() {
        if (!this.f6947g) {
            throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
        }
    }

    /* JADX INFO: finally extract failed */
    private final void f() {
        if (this.f6943c == null) {
            try {
                this.f6947g = true;
                this.f6943c = a2.e(this, j(), b.c(-656146368, true, new AbstractComposeView$ensureCompositionCreated$1(this)));
                this.f6947g = false;
            } catch (Throwable th2) {
                this.f6947g = false;
                throw th2;
            }
        }
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean i(a aVar) {
        return !(aVar instanceof Recomposer) || ((Recomposer) aVar).X().getValue().compareTo(Recomposer.State.ShuttingDown) > 0;
    }

    private final a j() {
        a aVar;
        a aVar2 = this.f6944d;
        if (aVar2 != null) {
            return aVar2;
        }
        a d11 = WindowRecomposer_androidKt.d(this);
        a aVar3 = null;
        a b11 = d11 != null ? b(d11) : null;
        if (b11 != null) {
            return b11;
        }
        WeakReference<a> weakReference = this.f6941a;
        if (!(weakReference == null || (aVar = (a) weakReference.get()) == null || !i(aVar))) {
            aVar3 = aVar;
        }
        a aVar4 = aVar3;
        return aVar4 == null ? b(WindowRecomposer_androidKt.h(this)) : aVar4;
    }

    private final void setParentContext(a aVar) {
        if (this.f6944d != aVar) {
            this.f6944d = aVar;
            if (aVar != null) {
                this.f6941a = null;
            }
            h hVar = this.f6943c;
            if (hVar != null) {
                hVar.dispose();
                this.f6943c = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f6942b != iBinder) {
            this.f6942b = iBinder;
            this.f6941a = null;
        }
    }

    public abstract void a(g gVar, int i11);

    public void addView(View view) {
        c();
        super.addView(view);
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i11, layoutParams);
    }

    public final void d() {
        if (this.f6944d != null || isAttachedToWindow()) {
            f();
            return;
        }
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
    }

    public final void e() {
        h hVar = this.f6943c;
        if (hVar != null) {
            hVar.dispose();
        }
        this.f6943c = null;
        requestLayout();
    }

    public void g(boolean z11, int i11, int i12, int i13, int i14) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i13 - i11) - getPaddingRight(), (i14 - i12) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        return this.f6943c != null;
    }

    /* access modifiers changed from: protected */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f6946f;
    }

    public void h(int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i11, i12);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i11)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i12) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i12)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        g(z11, i11, i12, i13, i14);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i11, int i12) {
        f();
        h(i11, i12);
    }

    public void onRtlPropertiesChanged(int i11) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i11);
        }
    }

    public final void setParentCompositionContext(a aVar) {
        setParentContext(aVar);
    }

    public final void setShowLayoutBounds(boolean z11) {
        this.f6946f = z11;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((q) childAt).setShowLayoutBounds(z11);
        }
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy viewCompositionStrategy) {
        p.j(viewCompositionStrategy, "strategy");
        lp0.a<k> aVar = this.f6945e;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f6945e = viewCompositionStrategy.a(this);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractComposeView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p.j(context, LogCategory.CONTEXT);
        setClipChildren(false);
        setClipToPadding(false);
        this.f6945e = ViewCompositionStrategy.f7175a.a().a(this);
    }

    public void addView(View view, int i11) {
        c();
        super.addView(view, i11);
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i11, ViewGroup.LayoutParams layoutParams, boolean z11) {
        c();
        return super.addViewInLayout(view, i11, layoutParams, z11);
    }

    public void addView(View view, int i11, int i12) {
        c();
        super.addView(view, i11, i12);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i11, layoutParams);
    }
}
