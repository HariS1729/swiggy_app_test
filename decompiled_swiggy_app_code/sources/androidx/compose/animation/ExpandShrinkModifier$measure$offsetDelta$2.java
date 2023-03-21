package androidx.compose.animation;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: EnterExitTransition.kt */
final class ExpandShrinkModifier$measure$offsetDelta$2 extends Lambda implements l<EnterExitState, d2.l> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExpandShrinkModifier f2577a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f2578b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExpandShrinkModifier$measure$offsetDelta$2(ExpandShrinkModifier expandShrinkModifier, long j) {
        super(1);
        this.f2577a = expandShrinkModifier;
        this.f2578b = j;
    }

    public final long a(EnterExitState enterExitState) {
        p.j(enterExitState, "it");
        return this.f2577a.h(enterExitState, this.f2578b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return d2.l.b(a((EnterExitState) obj));
    }
}
