package com.afollestad.materialdialogs.internal.list;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bp0.k;
import in.juspay.hyper.constants.LogCategory;
import lp0.p;
import q7.e;

/* compiled from: DialogRecyclerView.kt */
public final class DialogRecyclerView extends RecyclerView {
    private p<? super Boolean, ? super Boolean, k> Y0;
    private final a Z0 = new a(this);

    /* compiled from: DialogRecyclerView.kt */
    public static final class a extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DialogRecyclerView f13746a;

        a(DialogRecyclerView dialogRecyclerView) {
            this.f13746a = dialogRecyclerView;
        }

        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            kotlin.jvm.internal.p.k(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i11, i12);
            this.f13746a.D1();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.p.k(context, LogCategory.CONTEXT);
    }

    /* access modifiers changed from: private */
    public final void E1() {
        int i11 = 2;
        if (!(getChildCount() == 0 || getMeasuredHeight() == 0 || H1())) {
            i11 = 1;
        }
        setOverScrollMode(i11);
    }

    private final boolean F1() {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            kotlin.jvm.internal.p.v();
        }
        kotlin.jvm.internal.p.f(adapter, "adapter!!");
        int itemCount = adapter.getItemCount() - 1;
        RecyclerView.o layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).j2() == itemCount) {
                return true;
            }
        } else if (!(layoutManager instanceof GridLayoutManager) || ((GridLayoutManager) layoutManager).j2() != itemCount) {
            return false;
        } else {
            return true;
        }
        return false;
    }

    private final boolean G1() {
        RecyclerView.o layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).e2() == 0) {
                return true;
            }
        } else if (!(layoutManager instanceof GridLayoutManager) || ((GridLayoutManager) layoutManager).e2() != 0) {
            return false;
        } else {
            return true;
        }
        return false;
    }

    private final boolean H1() {
        return F1() && G1();
    }

    public final void D1() {
        p<? super Boolean, ? super Boolean, k> pVar;
        if (getChildCount() != 0 && getMeasuredHeight() != 0 && (pVar = this.Y0) != null) {
            k invoke = pVar.invoke(Boolean.valueOf(!G1()), Boolean.valueOf(!F1()));
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e.f16390a.v(this, DialogRecyclerView$onAttachedToWindow$1.f13747a);
        l(this.Z0);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        d1(this.Z0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        D1();
    }
}
