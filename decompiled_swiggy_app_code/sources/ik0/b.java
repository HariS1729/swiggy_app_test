package ik0;

import in.swiggy.android.track.TrackOrderFragmentService;
import javax.inject.Provider;
import qq.e;
import qq.i;

/* compiled from: TrackOrderFragmentModule_ProvidesTrackOrderFragmentServiceFactory */
public final class b implements e<xj0.b> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<TrackOrderFragmentService> f20191a;

    public b(Provider<TrackOrderFragmentService> provider) {
        this.f20191a = provider;
    }

    public static b a(Provider<TrackOrderFragmentService> provider) {
        return new b(provider);
    }

    public static xj0.b c(TrackOrderFragmentService trackOrderFragmentService) {
        return (xj0.b) i.e(a.f20190a.a(trackOrderFragmentService));
    }

    /* renamed from: b */
    public xj0.b get() {
        return c(this.f20191a.get());
    }
}
