package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import com.afollestad.materialdialogs.R;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import q7.e;

/* compiled from: DialogActionButton.kt */
final class DialogActionButton$update$1 extends Lambda implements a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f13735a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DialogActionButton$update$1(Context context) {
        super(0);
        this.f13735a = context;
    }

    public final int a() {
        return e.j(e.f16390a, this.f13735a, (Integer) null, Integer.valueOf(R.attr.colorPrimary), (a) null, 10, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf(a());
    }
}
