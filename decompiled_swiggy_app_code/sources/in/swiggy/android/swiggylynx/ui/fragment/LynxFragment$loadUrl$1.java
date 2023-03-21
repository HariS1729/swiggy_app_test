package in.swiggy.android.swiggylynx.ui.fragment;

import bp0.k;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: LynxFragment.kt */
final class LynxFragment$loadUrl$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LynxFragment f19582a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f19583b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LynxFragment$loadUrl$1(LynxFragment lynxFragment, String str) {
        super(0);
        this.f19582a = lynxFragment;
        this.f19583b = str;
    }

    public final void invoke() {
        this.f19582a.h1().P1();
        if (this.f19583b.length() > 0) {
            ILynxViewUpdateHandler.DefaultImpls.a(this.f19582a, this.f19583b, (Map) null, false, true, false, (String) null, (String) null, false, 246, (Object) null);
        }
    }
}
