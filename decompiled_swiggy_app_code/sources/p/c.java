package p;

import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.core.Transition;
import d2.p;
import e0.a1;
import e0.h0;

/* compiled from: AnimatedVisibility.kt */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private Transition<EnterExitState> f15988a;

    /* renamed from: b  reason: collision with root package name */
    private final h0<p> f15989b = j.e(p.b(p.f14019b.a()), (a1) null, 2, (Object) null);

    public c(Transition<EnterExitState> transition) {
        kotlin.jvm.internal.p.j(transition, "transition");
        this.f15988a = transition;
    }

    public final h0<p> a() {
        return this.f15989b;
    }
}
