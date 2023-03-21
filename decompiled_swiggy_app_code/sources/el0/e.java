package el0;

import in.swiggy.android.track.v3polling.TrackV3PollingUseCase;
import in.swiggy.android.track.v3polling.TrackV3PollingViewModel;
import javax.inject.Provider;

/* compiled from: TrackV3PollingViewModel_Factory */
public final class e implements qq.e<TrackV3PollingViewModel> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<TrackV3PollingUseCase> f20115a;

    public e(Provider<TrackV3PollingUseCase> provider) {
        this.f20115a = provider;
    }

    public static e a(Provider<TrackV3PollingUseCase> provider) {
        return new e(provider);
    }

    public static TrackV3PollingViewModel c(TrackV3PollingUseCase trackV3PollingUseCase) {
        return new TrackV3PollingViewModel(trackV3PollingUseCase);
    }

    /* renamed from: b */
    public TrackV3PollingViewModel get() {
        return c(this.f20115a.get());
    }
}
