package el0;

import in.swiggy.android.tejas.coroutines.coroutinespolling.TrackCoroutinesPoller;
import in.swiggy.android.track.v3polling.TrackDEPollingUseCase;
import javax.inject.Provider;
import qq.e;

/* compiled from: TrackDEPollingUseCase_Factory */
public final class b implements e<TrackDEPollingUseCase> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<TrackCoroutinesPoller> f20111a;

    public b(Provider<TrackCoroutinesPoller> provider) {
        this.f20111a = provider;
    }

    public static b a(Provider<TrackCoroutinesPoller> provider) {
        return new b(provider);
    }

    public static TrackDEPollingUseCase c(TrackCoroutinesPoller trackCoroutinesPoller) {
        return new TrackDEPollingUseCase(trackCoroutinesPoller);
    }

    /* renamed from: b */
    public TrackDEPollingUseCase get() {
        return c(this.f20111a.get());
    }
}
