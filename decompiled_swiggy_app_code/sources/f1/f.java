package f1;

import kotlin.jvm.internal.i;

/* compiled from: PointerEvent.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final long f14484a;

    /* renamed from: b  reason: collision with root package name */
    private final long f14485b;

    private f(long j, long j11) {
        this.f14484a = j;
        this.f14485b = j11;
    }

    public /* synthetic */ f(long j, long j11, i iVar) {
        this(j, j11);
    }

    public final long a() {
        return this.f14485b;
    }

    public final long b() {
        return this.f14484a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f14484a + ", position=" + t0.f.t(this.f14485b) + ')';
    }
}
