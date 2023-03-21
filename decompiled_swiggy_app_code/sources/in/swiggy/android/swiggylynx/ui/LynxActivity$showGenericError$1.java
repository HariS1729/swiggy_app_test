package in.swiggy.android.swiggylynx.ui;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: LynxActivity.kt */
final class LynxActivity$showGenericError$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LynxActivity f19553a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LynxActivity$showGenericError$1(LynxActivity lynxActivity) {
        super(0);
        this.f19553a = lynxActivity;
    }

    public final void invoke() {
        SwiggyLynxWebView u12 = this.f19553a.u1();
        if (u12 != null) {
            u12.reload();
        }
    }
}
