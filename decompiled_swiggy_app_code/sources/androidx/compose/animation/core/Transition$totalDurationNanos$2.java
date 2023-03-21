package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: Transition.kt */
final class Transition$totalDurationNanos$2 extends Lambda implements a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Transition<S> f2768a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Transition$totalDurationNanos$2(Transition<S> transition) {
        super(0);
        this.f2768a = transition;
    }

    /* renamed from: a */
    public final Long invoke() {
        long j = 0;
        for (Transition.d k : this.f2768a.f2739h) {
            j = Math.max(j, k.k());
        }
        for (Transition n : this.f2768a.f2740i) {
            j = Math.max(j, n.n());
        }
        return Long.valueOf(j);
    }
}
