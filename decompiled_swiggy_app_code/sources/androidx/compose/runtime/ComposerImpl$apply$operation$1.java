package androidx.compose.runtime;

import bp0.k;
import e0.e;
import e0.q0;
import e0.x0;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;

/* compiled from: Composer.kt */
final class ComposerImpl$apply$operation$1 extends Lambda implements q<e<?>, x0, q0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<T, V, k> f5902a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ V f5903b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$apply$operation$1(p<? super T, ? super V, k> pVar, V v) {
        super(3);
        this.f5902a = pVar;
        this.f5903b = v;
    }

    public final void a(e<?> eVar, x0 x0Var, q0 q0Var) {
        kotlin.jvm.internal.p.j(eVar, "applier");
        kotlin.jvm.internal.p.j(x0Var, "<anonymous parameter 1>");
        kotlin.jvm.internal.p.j(q0Var, "<anonymous parameter 2>");
        this.f5902a.invoke(eVar.a(), this.f5903b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((e) obj, (x0) obj2, (q0) obj3);
        return k.f22762a;
    }
}
