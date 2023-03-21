package yg0;

import androidx.fragment.app.Fragment;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.swiggylynx.plugin.location.LocationPlugin;
import kotlin.jvm.internal.p;
import us.f;

/* compiled from: LocationFragmentPlugin.kt */
public final class b extends LocationPlugin {

    /* renamed from: g  reason: collision with root package name */
    private final Fragment f20032g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(androidx.fragment.app.Fragment r3, cg0.n r4, us.f r5) {
        /*
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.p.j(r3, r0)
            java.lang.String r0 = "locationContext"
            kotlin.jvm.internal.p.j(r4, r0)
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            java.lang.String r1 = "fragment.requireActivity()"
            kotlin.jvm.internal.p.i(r0, r1)
            r2.<init>(r0, r4, r5)
            r2.f20032g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yg0.b.<init>(androidx.fragment.app.Fragment, cg0.n, us.f):void");
    }

    public void r(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        X0(str, bVar2);
        f p11 = p();
        if (p11 != null) {
            p11.Q(this.f20032g);
        }
    }
}
