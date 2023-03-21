package in.swiggy.android.swiggylynx.ui.fragment;

import bp0.k;
import in.swiggy.android.swiggylynx.ui.SwiggyLynxWebView;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: LynxFragment.kt */
final class LynxFragment$showError$1$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LynxFragment f19584a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LynxFragment$showError$1$1(LynxFragment lynxFragment) {
        super(0);
        this.f19584a = lynxFragment;
    }

    public final void invoke() {
        SwiggyLynxWebView C0 = this.f19584a.C0();
        if (C0 != null) {
            C0.r();
        }
        SwiggyLynxWebView C02 = this.f19584a.C0();
        if (C02 != null) {
            C02.reload();
        }
    }
}
