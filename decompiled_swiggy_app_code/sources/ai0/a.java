package ai0;

import android.location.Location;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import in.swiggy.android.swiggylynx.ui.SwiggyLynxWebView;
import in.swiggy.android.swiggylynx.ui.fragment.LynxFragment;
import kotlin.jvm.internal.p;

/* compiled from: LynxFragmentService.kt */
public final class a implements bi0.a {

    /* renamed from: a  reason: collision with root package name */
    private final LynxFragment f18087a;

    public a(LynxFragment lynxFragment) {
        p.j(lynxFragment, "fragment");
        this.f18087a = lynxFragment;
    }

    public void a(Location location) {
        p.j(location, "location");
        FragmentActivity activity = this.f18087a.getActivity();
        if (activity != null) {
            this.f18087a.G0().i().b(activity, location);
        }
    }

    public boolean b() {
        LynxFragment lynxFragment = this.f18087a;
        Bundle arguments = lynxFragment.getArguments();
        boolean z11 = arguments == null ? false : arguments.getBoolean("isInstamart", false);
        Bundle arguments2 = lynxFragment.getArguments();
        boolean z12 = arguments2 == null ? false : arguments2.getBoolean("isGenie", false);
        if (z11 || z12) {
            return true;
        }
        return false;
    }

    public void c() {
        LynxFragment lynxFragment = this.f18087a;
        for (SwiggyLynxWebView destroy : lynxFragment.Z0()) {
            destroy.destroy();
        }
        lynxFragment.Z0().clear();
        lynxFragment.z0().L.removeAllViews();
    }

    public void d(boolean z11) {
        LynxFragment lynxFragment = this.f18087a;
        if (lynxFragment.B1()) {
            lynxFragment.V0().a(z11);
        }
    }

    public int e() {
        FragmentActivity activity;
        LynxFragment lynxFragment = this.f18087a;
        if (!lynxFragment.A1() && (activity = lynxFragment.getActivity()) != null) {
            return lynxFragment.G0().i().a(activity);
        }
        return 0;
    }
}
