package gk0;

import in.swiggy.android.track.cancellation.v3.TrackCancelOrderBottomV3ViewModel;
import javax.inject.Provider;
import qq.e;

/* compiled from: TrackCancelOrderBottomV3ViewModel_Factory */
public final class a implements e<TrackCancelOrderBottomV3ViewModel> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<us.e> f20140a;

    public a(Provider<us.e> provider) {
        this.f20140a = provider;
    }

    public static a a(Provider<us.e> provider) {
        return new a(provider);
    }

    public static TrackCancelOrderBottomV3ViewModel c(us.e eVar) {
        return new TrackCancelOrderBottomV3ViewModel(eVar);
    }

    /* renamed from: b */
    public TrackCancelOrderBottomV3ViewModel get() {
        return c(this.f20140a.get());
    }
}
