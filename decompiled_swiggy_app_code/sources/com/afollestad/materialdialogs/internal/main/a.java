package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.R;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;
import q7.e;

/* compiled from: BaseSubLayout.kt */
public abstract class a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f13767a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13768b;

    /* renamed from: c  reason: collision with root package name */
    public MaterialDialog f13769c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13770d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.k(context, LogCategory.CONTEXT);
        Paint paint = new Paint();
        this.f13767a = paint;
        e eVar = e.f16390a;
        int i11 = R.dimen.md_divider_height;
        this.f13768b = eVar.c(this, i11);
        setWillNotDraw(false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimension(i11));
        paint.setAntiAlias(true);
    }

    private final int getDividerColor() {
        e eVar = e.f16390a;
        MaterialDialog materialDialog = this.f13769c;
        if (materialDialog == null) {
            p.B("dialog");
        }
        Context context = materialDialog.getContext();
        p.f(context, "dialog.context");
        return e.j(eVar, context, (Integer) null, Integer.valueOf(R.attr.md_divider_color), (lp0.a) null, 10, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final Paint a() {
        this.f13767a.setColor(getDividerColor());
        return this.f13767a;
    }

    public final MaterialDialog getDialog() {
        MaterialDialog materialDialog = this.f13769c;
        if (materialDialog == null) {
            p.B("dialog");
        }
        return materialDialog;
    }

    /* access modifiers changed from: protected */
    public final int getDividerHeight() {
        return this.f13768b;
    }

    public final boolean getDrawDivider() {
        return this.f13770d;
    }

    public final void setDialog(MaterialDialog materialDialog) {
        p.k(materialDialog, "<set-?>");
        this.f13769c = materialDialog;
    }

    public final void setDrawDivider(boolean z11) {
        this.f13770d = z11;
        invalidate();
    }
}
