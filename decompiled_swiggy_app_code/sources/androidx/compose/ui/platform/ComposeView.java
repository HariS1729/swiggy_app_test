package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import bp0.k;
import e0.a1;
import e0.g;
import e0.h0;
import e0.s0;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.i;
import lp0.p;

/* compiled from: ComposeView.android.kt */
public final class ComposeView extends AbstractComposeView {
    public static final int j = 8;

    /* renamed from: h  reason: collision with root package name */
    private final h0<p<g, Integer, k>> f7100h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7101i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (i) null);
        kotlin.jvm.internal.p.j(context, LogCategory.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i11, int i12, i iVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public void a(g gVar, int i11) {
        g t = gVar.t(420213850);
        p value = this.f7100h.getValue();
        if (value != null) {
            value.invoke(t, 0);
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new ComposeView$Content$1(this, i11));
        }
    }

    public CharSequence getAccessibilityClassName() {
        String name = ComposeView.class.getName();
        kotlin.jvm.internal.p.i(name, "javaClass.name");
        return name;
    }

    /* access modifiers changed from: protected */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f7101i;
    }

    public final void setContent(p<? super g, ? super Integer, k> pVar) {
        kotlin.jvm.internal.p.j(pVar, "content");
        this.f7101i = true;
        this.f7100h.setValue(pVar);
        if (isAttachedToWindow()) {
            d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.p.j(context, LogCategory.CONTEXT);
        this.f7100h = j.e((Object) null, (a1) null, 2, (Object) null);
    }
}
