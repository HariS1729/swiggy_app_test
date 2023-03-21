package com.afollestad.materialdialogs;

import android.content.Context;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;

/* compiled from: MaterialDialog.kt */
final class MaterialDialog$positiveButton$1$1 extends Lambda implements a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MaterialDialog f13727a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MaterialDialog$positiveButton$1$1(MaterialDialog materialDialog) {
        super(0);
        this.f13727a = materialDialog;
    }

    public final int a() {
        Context context = this.f13727a.getContext();
        p.f(context, LogCategory.CONTEXT);
        return context.getResources().getDimensionPixelSize(R.dimen.md_action_button_textsize);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf(a());
    }
}
