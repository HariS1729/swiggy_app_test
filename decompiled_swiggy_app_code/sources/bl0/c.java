package bl0;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import bp0.k;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.track.addressUpdate.TrackAddressHalfCardFragment;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;

/* compiled from: TrackInterfaceImpl.kt */
public final class c implements a {
    public void a(Fragment fragment, String str, Address address, float f11, a<k> aVar, l<? super String, k> lVar) {
        p.j(fragment, "fragment");
        p.j(address, "deliveryAddress");
        p.j(aVar, "refreshTrack");
        p.j(lVar, "goToHelp");
        TrackAddressHalfCardFragment.a aVar2 = TrackAddressHalfCardFragment.f20589m;
        FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
        p.i(parentFragmentManager, "fragment.parentFragmentManager");
        aVar2.a(parentFragmentManager, str, address, f11, aVar, lVar);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(androidx.fragment.app.Fragment r4) {
        /*
            r3 = this;
            java.lang.String r0 = "f"
            kotlin.jvm.internal.p.j(r4, r0)
            androidx.fragment.app.FragmentManager r0 = r4.getParentFragmentManager()
            java.lang.String r1 = "TrackAddressHalfCardFragment"
            androidx.fragment.app.Fragment r0 = r0.k0(r1)
            boolean r1 = r0 instanceof in.swiggy.android.track.addressUpdate.TrackAddressHalfCardFragment
            r2 = 0
            if (r1 == 0) goto L_0x0017
            in.swiggy.android.track.addressUpdate.TrackAddressHalfCardFragment r0 = (in.swiggy.android.track.addressUpdate.TrackAddressHalfCardFragment) r0
            goto L_0x0018
        L_0x0017:
            r0 = r2
        L_0x0018:
            if (r0 != 0) goto L_0x001b
            goto L_0x001e
        L_0x001b:
            r0.dismiss()
        L_0x001e:
            androidx.fragment.app.FragmentManager r0 = r4.getParentFragmentManager()
            java.lang.String r1 = "AddressChangeConfirmDialogFragment"
            androidx.fragment.app.Fragment r0 = r0.k0(r1)
            boolean r1 = r0 instanceof in.swiggy.android.track.addressUpdate.handlers.AddressChangeConfirmDialogFragment
            if (r1 == 0) goto L_0x002f
            in.swiggy.android.track.addressUpdate.handlers.AddressChangeConfirmDialogFragment r0 = (in.swiggy.android.track.addressUpdate.handlers.AddressChangeConfirmDialogFragment) r0
            goto L_0x0030
        L_0x002f:
            r0 = r2
        L_0x0030:
            if (r0 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r0.dismiss()
        L_0x0036:
            androidx.fragment.app.FragmentManager r4 = r4.getParentFragmentManager()
            java.lang.String r0 = "AddressChangeDeclineBottomFragment"
            androidx.fragment.app.Fragment r4 = r4.k0(r0)
            boolean r0 = r4 instanceof in.swiggy.android.track.addressUpdate.handlers.AddressChangeDeclineBottomFragment
            if (r0 == 0) goto L_0x0047
            r2 = r4
            in.swiggy.android.track.addressUpdate.handlers.AddressChangeDeclineBottomFragment r2 = (in.swiggy.android.track.addressUpdate.handlers.AddressChangeDeclineBottomFragment) r2
        L_0x0047:
            if (r2 != 0) goto L_0x004a
            goto L_0x004d
        L_0x004a:
            r2.dismiss()
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bl0.c.b(androidx.fragment.app.Fragment):void");
    }
}
