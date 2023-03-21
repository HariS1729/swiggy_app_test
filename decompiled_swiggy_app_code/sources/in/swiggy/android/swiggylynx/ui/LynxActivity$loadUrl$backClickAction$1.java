package in.swiggy.android.swiggylynx.ui;

import android.widget.FrameLayout;
import bp0.k;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.R;
import java.util.Map;
import js.c;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: LynxActivity.kt */
final class LynxActivity$loadUrl$backClickAction$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LynxActivity f19547a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f19548b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LynxActivity$loadUrl$backClickAction$1(LynxActivity lynxActivity, String str) {
        super(0);
        this.f19547a = lynxActivity;
        this.f19548b = str;
    }

    public final void invoke() {
        LynxActivity lynxActivity = this.f19547a;
        int i11 = R.id.webContainer;
        FrameLayout frameLayout = (FrameLayout) lynxActivity.findViewById(i11);
        boolean z11 = false;
        if (frameLayout != null && c.f(Integer.valueOf(frameLayout.getChildCount()), 1)) {
            this.f19547a.j2();
            FrameLayout frameLayout2 = (FrameLayout) this.f19547a.findViewById(i11);
            if (frameLayout2 != null) {
                frameLayout2.removeView(this.f19547a.G1().pop());
            }
            LynxActivity lynxActivity2 = this.f19547a;
            lynxActivity2.D2(lynxActivity2.G1().peek());
            if (this.f19548b.length() > 0) {
                z11 = true;
            }
            if (z11) {
                ILynxViewUpdateHandler.DefaultImpls.a(this.f19547a, this.f19548b, (Map) null, false, true, false, (String) null, (String) null, false, 246, (Object) null);
            }
        }
    }
}
