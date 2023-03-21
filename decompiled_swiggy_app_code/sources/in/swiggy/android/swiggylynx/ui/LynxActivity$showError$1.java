package in.swiggy.android.swiggylynx.ui;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: LynxActivity.kt */
final class LynxActivity$showError$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LynxActivity f19551a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LynxActivity$showError$1(LynxActivity lynxActivity) {
        super(0);
        this.f19551a = lynxActivity;
    }

    public final void invoke() {
        SwiggyLynxWebView u12 = this.f19551a.u1();
        if (u12 != null) {
            u12.r();
        }
        SwiggyLynxWebView u13 = this.f19551a.u1();
        if (u13 != null) {
            u13.reload();
        }
    }
}
