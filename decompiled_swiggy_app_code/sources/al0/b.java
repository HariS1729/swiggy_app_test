package al0;

import in.swiggy.android.track.activities.TrackOrderActivity;
import javax.inject.Provider;
import qq.e;

/* compiled from: PipManager_Factory */
public final class b implements e<a> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<TrackOrderActivity> f20079a;

    public b(Provider<TrackOrderActivity> provider) {
        this.f20079a = provider;
    }

    public static b a(Provider<TrackOrderActivity> provider) {
        return new b(provider);
    }

    public static a c(TrackOrderActivity trackOrderActivity) {
        return new a(trackOrderActivity);
    }

    /* renamed from: b */
    public a get() {
        return c(this.f20079a.get());
    }
}
