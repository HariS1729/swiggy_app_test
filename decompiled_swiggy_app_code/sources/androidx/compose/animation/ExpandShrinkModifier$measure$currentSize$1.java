package androidx.compose.animation;

import d2.p;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: EnterExitTransition.kt */
final class ExpandShrinkModifier$measure$currentSize$1 extends Lambda implements l<EnterExitState, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExpandShrinkModifier f2574a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f2575b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExpandShrinkModifier$measure$currentSize$1(ExpandShrinkModifier expandShrinkModifier, long j) {
        super(1);
        this.f2574a = expandShrinkModifier;
        this.f2575b = j;
    }

    public final long a(EnterExitState enterExitState) {
        kotlin.jvm.internal.p.j(enterExitState, "it");
        return this.f2574a.g(enterExitState, this.f2575b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return p.b(a((EnterExitState) obj));
    }
}
