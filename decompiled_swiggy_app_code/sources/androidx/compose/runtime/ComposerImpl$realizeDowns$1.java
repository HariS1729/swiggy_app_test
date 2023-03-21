package androidx.compose.runtime;

import bp0.k;
import e0.e;
import e0.q0;
import e0.x0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: Composer.kt */
final class ComposerImpl$realizeDowns$1 extends Lambda implements q<e<?>, x0, q0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object[] f5950a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$realizeDowns$1(Object[] objArr) {
        super(3);
        this.f5950a = objArr;
    }

    public final void a(e<?> eVar, x0 x0Var, q0 q0Var) {
        p.j(eVar, "applier");
        p.j(x0Var, "<anonymous parameter 1>");
        p.j(q0Var, "<anonymous parameter 2>");
        for (Object h11 : this.f5950a) {
            eVar.h(h11);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((e) obj, (x0) obj2, (q0) obj3);
        return k.f22762a;
    }
}
