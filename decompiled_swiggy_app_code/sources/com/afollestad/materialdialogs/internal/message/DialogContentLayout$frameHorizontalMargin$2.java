package com.afollestad.materialdialogs.internal.message;

import com.afollestad.materialdialogs.R;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: DialogContentLayout.kt */
final class DialogContentLayout$frameHorizontalMargin$2 extends Lambda implements a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DialogContentLayout f13779a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DialogContentLayout$frameHorizontalMargin$2(DialogContentLayout dialogContentLayout) {
        super(0);
        this.f13779a = dialogContentLayout;
    }

    public final int a() {
        return this.f13779a.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_horizontal);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf(a());
    }
}
