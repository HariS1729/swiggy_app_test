package androidx.compose.animation;

import bp0.k;
import i1.e0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: EnterExitTransition.kt */
final class SlideModifier$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SlideModifier f2596a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e0 f2597b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f2598c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SlideModifier$measure$1(SlideModifier slideModifier, e0 e0Var, long j) {
        super(1);
        this.f2596a = slideModifier;
        this.f2597b = e0Var;
        this.f2598c = j;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        e0.a aVar2 = aVar;
        e0.a.x(aVar2, this.f2597b, this.f2596a.a().a(this.f2596a.e(), new SlideModifier$measure$1$slideOffset$1(this.f2596a, this.f2598c)).getValue().n(), 0.0f, (l) null, 6, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
