package androidx.compose.animation;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: EnterExitTransition.kt */
final class SlideModifier$measure$1$slideOffset$1 extends Lambda implements l<EnterExitState, d2.l> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SlideModifier f2599a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f2600b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SlideModifier$measure$1$slideOffset$1(SlideModifier slideModifier, long j) {
        super(1);
        this.f2599a = slideModifier;
        this.f2600b = j;
    }

    public final long a(EnterExitState enterExitState) {
        p.j(enterExitState, "it");
        return this.f2599a.f(enterExitState, this.f2600b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return d2.l.b(a((EnterExitState) obj));
    }
}
