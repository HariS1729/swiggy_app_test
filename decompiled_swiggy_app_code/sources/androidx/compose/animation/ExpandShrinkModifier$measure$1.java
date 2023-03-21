package androidx.compose.animation;

import bp0.k;
import i1.e0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: EnterExitTransition.kt */
final class ExpandShrinkModifier$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f2571a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f2572b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f2573c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExpandShrinkModifier$measure$1(e0 e0Var, long j, long j11) {
        super(1);
        this.f2571a = e0Var;
        this.f2572b = j;
        this.f2573c = j11;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        e0.a.j(aVar, this.f2571a, d2.l.j(this.f2572b) + d2.l.j(this.f2573c), d2.l.k(this.f2572b) + d2.l.k(this.f2573c), 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
