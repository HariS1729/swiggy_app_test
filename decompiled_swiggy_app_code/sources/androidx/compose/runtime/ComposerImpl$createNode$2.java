package androidx.compose.runtime;

import bp0.k;
import e0.c;
import e0.e;
import e0.q0;
import e0.x0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.q;

/* compiled from: Composer.kt */
final class ComposerImpl$createNode$2 extends Lambda implements q<e<?>, x0, q0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a<T> f5910a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f5911b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f5912c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$createNode$2(a<? extends T> aVar, c cVar, int i11) {
        super(3);
        this.f5910a = aVar;
        this.f5911b = cVar;
        this.f5912c = i11;
    }

    public final void a(e<?> eVar, x0 x0Var, q0 q0Var) {
        p.j(eVar, "applier");
        p.j(x0Var, "slots");
        p.j(q0Var, "<anonymous parameter 2>");
        T invoke = this.f5910a.invoke();
        x0Var.d1(this.f5911b, invoke);
        eVar.f(this.f5912c, invoke);
        eVar.h(invoke);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((e) obj, (x0) obj2, (q0) obj3);
        return k.f22762a;
    }
}
