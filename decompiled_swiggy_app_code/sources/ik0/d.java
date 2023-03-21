package ik0;

import cl0.a;
import in.swiggy.android.track.services.v3.TrackOrderFragmentV3Service;
import javax.inject.Provider;
import qq.e;
import qq.i;

/* compiled from: TrackOrderFragmentV3Module_ProvidesTrackOrderFragmentV3ServiceFactory */
public final class d implements e<a> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<TrackOrderFragmentV3Service> f20193a;

    public d(Provider<TrackOrderFragmentV3Service> provider) {
        this.f20193a = provider;
    }

    public static d a(Provider<TrackOrderFragmentV3Service> provider) {
        return new d(provider);
    }

    public static a c(TrackOrderFragmentV3Service trackOrderFragmentV3Service) {
        return (a) i.e(c.f20192a.a(trackOrderFragmentV3Service));
    }

    /* renamed from: b */
    public a get() {
        return c(this.f20193a.get());
    }
}
