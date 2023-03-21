package el0;

import in.swiggy.android.tejas.coroutines.coroutinespolling.TrackCoroutinesPoller;
import in.swiggy.android.track.v3polling.TrackV3PollingUseCase;
import javax.inject.Provider;
import qq.e;

/* compiled from: TrackV3PollingUseCase_Factory */
public final class d implements e<TrackV3PollingUseCase> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<TrackCoroutinesPoller> f20114a;

    public d(Provider<TrackCoroutinesPoller> provider) {
        this.f20114a = provider;
    }

    public static d a(Provider<TrackCoroutinesPoller> provider) {
        return new d(provider);
    }

    public static TrackV3PollingUseCase c(TrackCoroutinesPoller trackCoroutinesPoller) {
        return new TrackV3PollingUseCase(trackCoroutinesPoller);
    }

    /* renamed from: b */
    public TrackV3PollingUseCase get() {
        return c(this.f20114a.get());
    }
}
