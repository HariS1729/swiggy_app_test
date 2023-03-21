package androidx.compose.runtime;

import bp0.k;
import e0.e;
import e0.q0;
import e0.x0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: Composer.kt */
final class ComposerImpl$realizeUps$1 extends Lambda implements q<e<?>, x0, q0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f5957a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$realizeUps$1(int i11) {
        super(3);
        this.f5957a = i11;
    }

    public final void a(e<?> eVar, x0 x0Var, q0 q0Var) {
        p.j(eVar, "applier");
        p.j(x0Var, "<anonymous parameter 1>");
        p.j(q0Var, "<anonymous parameter 2>");
        int i11 = this.f5957a;
        for (int i12 = 0; i12 < i11; i12++) {
            eVar.i();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((e) obj, (x0) obj2, (q0) obj3);
        return k.f22762a;
    }
}
