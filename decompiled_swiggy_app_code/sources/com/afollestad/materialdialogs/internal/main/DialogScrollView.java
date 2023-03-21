package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import kotlin.jvm.internal.p;
import q7.e;

/* compiled from: DialogScrollView.kt */
public final class DialogScrollView extends ScrollView {

    /* renamed from: a  reason: collision with root package name */
    private DialogLayout f13760a;

    public DialogScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: private */
    public final void c() {
        setOverScrollMode((getChildCount() == 0 || getMeasuredHeight() == 0 || !d()) ? 2 : 1);
    }

    private final boolean d() {
        View childAt = getChildAt(0);
        p.f(childAt, "getChildAt(0)");
        return childAt.getMeasuredHeight() > getHeight();
    }

    public final void b() {
        boolean z11 = false;
        if (getChildCount() == 0 || getMeasuredHeight() == 0 || !d()) {
            DialogLayout dialogLayout = this.f13760a;
            if (dialogLayout != null) {
                dialogLayout.e(false, false);
                return;
            }
            return;
        }
        View childAt = getChildAt(getChildCount() - 1);
        p.f(childAt, "view");
        int bottom = childAt.getBottom() - (getMeasuredHeight() + getScrollY());
        DialogLayout dialogLayout2 = this.f13760a;
        if (dialogLayout2 != null) {
            boolean z12 = getScrollY() > 0;
            if (bottom > 0) {
                z11 = true;
            }
            dialogLayout2.e(z12, z11);
        }
    }

    public final DialogLayout getRootView() {
        return this.f13760a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e.f16390a.v(this, DialogScrollView$onAttachedToWindow$1.f13761a);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        b();
    }

    public final void setRootView(DialogLayout dialogLayout) {
        this.f13760a = dialogLayout;
    }
}
