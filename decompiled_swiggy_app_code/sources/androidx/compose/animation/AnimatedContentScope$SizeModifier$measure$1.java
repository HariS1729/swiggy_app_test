package androidx.compose.animation;

import bp0.k;
import i1.e0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentScope$SizeModifier$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f2451a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f2452b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedContentScope$SizeModifier$measure$1(e0 e0Var, long j) {
        super(1);
        this.f2451a = e0Var;
        this.f2452b = j;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        e0.a.l(aVar, this.f2451a, this.f2452b, 0.0f, 2, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
