package el0;

import in.swiggy.android.tejas.feature.trackv3.TrackPollerInput;
import kotlin.jvm.internal.p;

/* compiled from: TrackV3PollingParams.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private long f20112a;

    /* renamed from: b  reason: collision with root package name */
    private final TrackPollerInput f20113b;

    public c(long j, TrackPollerInput trackPollerInput) {
        p.j(trackPollerInput, "trackPollerInput");
        this.f20112a = j;
        this.f20113b = trackPollerInput;
    }

    public final long a() {
        return this.f20112a;
    }

    public final TrackPollerInput b() {
        return this.f20113b;
    }
}
