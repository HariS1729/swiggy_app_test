package gl0;

import hf0.a;
import in.swiggy.android.tejas.feature.cancellation.CancelOnlyManager;
import in.swiggy.android.tejas.feature.detipping.DeTipPostOrderManager;
import in.swiggy.android.tejas.feature.trackv3.TrackV3Manager;
import in.swiggy.android.track.viewmodels.v3.TrackCancellationResponseHandler;
import in.swiggy.android.track.viewmodels.v3.TrackOrderDeliveryStatesViewModel;
import in.swiggy.android.track.viewmodels.v3.TrackOrderFragmentV3ViewModel;
import nq.d;
import wr.c;

/* compiled from: TrackOrderFragmentV3ViewModel_MembersInjector */
public final class j implements d<TrackOrderFragmentV3ViewModel> {
    public static void a(TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel, CancelOnlyManager cancelOnlyManager) {
        trackOrderFragmentV3ViewModel.K = cancelOnlyManager;
    }

    public static void b(TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel, TrackCancellationResponseHandler trackCancellationResponseHandler) {
        trackOrderFragmentV3ViewModel.N = trackCancellationResponseHandler;
    }

    public static void c(TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel, DeTipPostOrderManager deTipPostOrderManager) {
        trackOrderFragmentV3ViewModel.M = deTipPostOrderManager;
    }

    public static void d(TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel, d<TrackOrderDeliveryStatesViewModel> dVar) {
        trackOrderFragmentV3ViewModel.O = dVar;
    }

    public static void e(TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel, c cVar) {
        trackOrderFragmentV3ViewModel.Q = cVar;
    }

    public static void f(TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel, a aVar) {
        trackOrderFragmentV3ViewModel.H = aVar;
    }

    public static void g(TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel, zs.a aVar) {
        trackOrderFragmentV3ViewModel.P = aVar;
    }

    public static void h(TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel, TrackV3Manager trackV3Manager) {
        trackOrderFragmentV3ViewModel.L = trackV3Manager;
    }

    public static void i(TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel, ll0.a aVar) {
        trackOrderFragmentV3ViewModel.I = aVar;
    }
}
