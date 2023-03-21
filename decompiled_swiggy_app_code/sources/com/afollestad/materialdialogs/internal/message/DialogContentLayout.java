package com.afollestad.materialdialogs.internal.message;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import bp0.f;
import bp0.k;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.main.DialogScrollView;
import in.juspay.hyper.constants.LogCategory;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import lp0.l;
import p7.a;
import q7.e;
import sp0.j;

/* compiled from: DialogContentLayout.kt */
public final class DialogContentLayout extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ j[] f13771h = {s.h(new PropertyReference1Impl(s.b(DialogContentLayout.class), "frameHorizontalMargin", "getFrameHorizontalMargin()I"))};

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f13772a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f13773b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13774c;

    /* renamed from: d  reason: collision with root package name */
    private final f f13775d = b.b(new DialogContentLayout$frameHorizontalMargin$2(this));

    /* renamed from: e  reason: collision with root package name */
    private DialogScrollView f13776e;

    /* renamed from: f  reason: collision with root package name */
    private DialogRecyclerView f13777f;

    /* renamed from: g  reason: collision with root package name */
    private View f13778g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.k(context, LogCategory.CONTEXT);
    }

    private final void a(boolean z11) {
        if (this.f13776e == null) {
            DialogScrollView dialogScrollView = (DialogScrollView) q7.f.b(this, R.layout.md_dialog_stub_scrollview, (ViewGroup) null, 2, (Object) null);
            dialogScrollView.setRootView(getRootLayout());
            View childAt = dialogScrollView.getChildAt(0);
            if (childAt != null) {
                this.f13772a = (ViewGroup) childAt;
                if (!z11) {
                    e eVar = e.f16390a;
                    e.u(eVar, dialogScrollView, 0, 0, 0, eVar.c(dialogScrollView, R.dimen.md_dialog_frame_margin_vertical), 7, (Object) null);
                }
                this.f13776e = dialogScrollView;
                addView(dialogScrollView);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    public static /* synthetic */ void d(DialogContentLayout dialogContentLayout, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = -1;
        }
        if ((i13 & 2) != 0) {
            i12 = -1;
        }
        dialogContentLayout.c(i11, i12);
    }

    public static /* synthetic */ void f(DialogContentLayout dialogContentLayout, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = -1;
        }
        if ((i13 & 2) != 0) {
            i12 = -1;
        }
        dialogContentLayout.e(i11, i12);
    }

    private final int getFrameHorizontalMargin() {
        f fVar = this.f13775d;
        j jVar = f13771h[0];
        return ((Number) fVar.getValue()).intValue();
    }

    private final DialogLayout getRootLayout() {
        ViewParent parent = getParent();
        if (parent != null) {
            return (DialogLayout) parent;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.afollestad.materialdialogs.internal.main.DialogLayout");
    }

    public final boolean b() {
        return getChildCount() > 1;
    }

    public final void c(int i11, int i12) {
        if (i11 != -1) {
            e.u(e.f16390a, getChildAt(0), 0, i11, 0, 0, 13, (Object) null);
        }
        if (i12 != -1) {
            e.u(e.f16390a, getChildAt(getChildCount() - 1), 0, 0, 0, i12, 7, (Object) null);
        }
    }

    public final void e(int i11, int i12) {
        View view = this.f13776e;
        if (view == null) {
            view = this.f13777f;
        }
        if (i11 != -1) {
            e.u(e.f16390a, view, 0, i11, 0, 0, 13, (Object) null);
        }
        if (i12 != -1) {
            e.u(e.f16390a, view, 0, 0, 0, i12, 7, (Object) null);
        }
    }

    public final void g(MaterialDialog materialDialog, Integer num, CharSequence charSequence, Typeface typeface, Float f11, l<? super a, k> lVar) {
        p.k(materialDialog, "dialog");
        a(false);
        if (this.f13773b == null) {
            int i11 = R.layout.md_dialog_stub_message;
            ViewGroup viewGroup = this.f13772a;
            if (viewGroup == null) {
                p.v();
            }
            TextView textView = (TextView) q7.f.a(this, i11, viewGroup);
            ViewGroup viewGroup2 = this.f13772a;
            if (viewGroup2 == null) {
                p.v();
            }
            viewGroup2.addView(textView);
            this.f13773b = textView;
        }
        TextView textView2 = this.f13773b;
        if (textView2 == null) {
            p.v();
        }
        a aVar = new a(materialDialog, textView2);
        if (lVar != null) {
            k invoke = lVar.invoke(aVar);
        }
        TextView textView3 = this.f13773b;
        if (textView3 != null) {
            if (typeface != null) {
                textView3.setTypeface(typeface);
            }
            e.h(e.f16390a, textView3, materialDialog.e(), Integer.valueOf(R.attr.md_color_content), (Integer) null, 4, (Object) null);
            aVar.c(num, charSequence);
            if (f11 != null) {
                textView3.setTextSize(0, f11.floatValue());
            }
        }
    }

    public final View getCustomView() {
        return this.f13778g;
    }

    public final DialogRecyclerView getRecyclerView() {
        return this.f13777f;
    }

    public final DialogScrollView getScrollView() {
        return this.f13776e;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int childCount = getChildCount();
        int i17 = 0;
        int i18 = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            p.f(childAt, "currentChild");
            int measuredHeight = childAt.getMeasuredHeight() + i18;
            if (!p.e(childAt, this.f13778g) || !this.f13774c) {
                i15 = getMeasuredWidth();
                i16 = 0;
            } else {
                i16 = getFrameHorizontalMargin();
                i15 = getMeasuredWidth() - getFrameHorizontalMargin();
            }
            childAt.layout(i16, i18, i15, measuredHeight);
            i17++;
            i18 = measuredHeight;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        DialogScrollView dialogScrollView = this.f13776e;
        if (dialogScrollView != null) {
            dialogScrollView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        }
        DialogScrollView dialogScrollView2 = this.f13776e;
        int measuredHeight = dialogScrollView2 != null ? dialogScrollView2.getMeasuredHeight() : 0;
        int i14 = size2 - measuredHeight;
        int childCount = this.f13776e != null ? getChildCount() - 1 : getChildCount();
        if (childCount == 0) {
            setMeasuredDimension(size, measuredHeight);
            return;
        }
        int i15 = i14 / childCount;
        int childCount2 = getChildCount();
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt = getChildAt(i16);
            p.f(childAt, "currentChild");
            int id2 = childAt.getId();
            DialogScrollView dialogScrollView3 = this.f13776e;
            if (dialogScrollView3 == null || id2 != dialogScrollView3.getId()) {
                if (!p.e(childAt, this.f13778g) || !this.f13774c) {
                    i13 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                } else {
                    i13 = View.MeasureSpec.makeMeasureSpec(size - (getFrameHorizontalMargin() * 2), 1073741824);
                }
                childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE));
                measuredHeight += childAt.getMeasuredHeight();
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setCustomView(View view) {
        this.f13778g = view;
    }

    public final void setRecyclerView(DialogRecyclerView dialogRecyclerView) {
        this.f13777f = dialogRecyclerView;
    }

    public final void setScrollView(DialogScrollView dialogScrollView) {
        this.f13776e = dialogScrollView;
    }
}
