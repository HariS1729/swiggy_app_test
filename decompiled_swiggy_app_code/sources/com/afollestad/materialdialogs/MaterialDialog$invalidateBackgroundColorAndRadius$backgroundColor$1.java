package com.afollestad.materialdialogs;

import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: MaterialDialog.kt */
final class MaterialDialog$invalidateBackgroundColorAndRadius$backgroundColor$1 extends Lambda implements a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MaterialDialog f13724a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MaterialDialog$invalidateBackgroundColorAndRadius$backgroundColor$1(MaterialDialog materialDialog) {
        super(0);
        this.f13724a = materialDialog;
    }

    public final int a() {
        return q7.a.c(this.f13724a, (Integer) null, Integer.valueOf(R.attr.colorBackgroundFloating), (a) null, 5, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf(a());
    }
}
