package com.afollestad.materialdialogs;

import android.content.Context;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;

/* compiled from: MaterialDialog.kt */
final class MaterialDialog$invalidateBackgroundColorAndRadius$1 extends Lambda implements a<Float> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MaterialDialog f13723a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MaterialDialog$invalidateBackgroundColorAndRadius$1(MaterialDialog materialDialog) {
        super(0);
        this.f13723a = materialDialog;
    }

    public final float a() {
        Context context = this.f13723a.getContext();
        p.f(context, LogCategory.CONTEXT);
        return context.getResources().getDimension(R.dimen.md_dialog_default_corner_radius);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Float.valueOf(a());
    }
}
