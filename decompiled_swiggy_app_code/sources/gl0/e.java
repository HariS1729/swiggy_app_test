package gl0;

import android.content.Intent;
import in.swiggy.android.track.viewmodels.v3.TrackOrderFragmentV3ViewModel;
import kotlin.jvm.internal.p;

/* compiled from: TrackOrderFragmentV3GameHandler.kt */
public final class e {
    public static final void a(TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel, int i11, int i12, Intent intent) {
        String str;
        p.j(trackOrderFragmentV3ViewModel, "<this>");
        trackOrderFragmentV3ViewModel.q4().x();
        boolean z11 = true;
        trackOrderFragmentV3ViewModel.i3().j(true);
        trackOrderFragmentV3ViewModel.E3().j(0);
        trackOrderFragmentV3ViewModel.P2();
        String L3 = trackOrderFragmentV3ViewModel.L3();
        if (L3 == null) {
            L3 = "";
        }
        trackOrderFragmentV3ViewModel.A4(L3);
        String str2 = null;
        if (intent == null) {
            str = null;
        } else {
            str = intent.getStringExtra(".deepLink");
        }
        if (intent != null) {
            str2 = intent.getStringExtra(".deepLinkData");
        }
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                z11 = false;
            }
            if (z11) {
                trackOrderFragmentV3ViewModel.q4().b(str);
            } else {
                trackOrderFragmentV3ViewModel.q4().o4(str, str2);
            }
        }
    }
}
