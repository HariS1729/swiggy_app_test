package gl0;

import in.swiggy.android.track.viewmodels.v3.TrackOrderDeliveryStatesViewModel;
import in.swiggy.android.track.viewmodels.v3.orderstates.TrackOrderDeliveryStateViewModel;
import javax.inject.Provider;

/* compiled from: TrackOrderDeliveryStatesViewModel_MembersInjector */
public final class d implements nq.d<TrackOrderDeliveryStatesViewModel> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<nq.d<TrackOrderDeliveryStateViewModel>> f20145a;

    public d(Provider<nq.d<TrackOrderDeliveryStateViewModel>> provider) {
        this.f20145a = provider;
    }

    public static nq.d<TrackOrderDeliveryStatesViewModel> a(Provider<nq.d<TrackOrderDeliveryStateViewModel>> provider) {
        return new d(provider);
    }

    public static void b(TrackOrderDeliveryStatesViewModel trackOrderDeliveryStatesViewModel, nq.d<TrackOrderDeliveryStateViewModel> dVar) {
        trackOrderDeliveryStatesViewModel.v = dVar;
    }

    /* renamed from: c */
    public void injectMembers(TrackOrderDeliveryStatesViewModel trackOrderDeliveryStatesViewModel) {
        b(trackOrderDeliveryStatesViewModel, this.f20145a.get());
    }
}
