package androidx.compose.runtime;

import bp0.k;
import e0.e;
import e0.q0;
import e0.r0;
import e0.x0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: Composer.kt */
final class ComposerImpl$updateValue$1 extends Lambda implements q<e<?>, x0, q0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object f5972a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$updateValue$1(Object obj) {
        super(3);
        this.f5972a = obj;
    }

    public final void a(e<?> eVar, x0 x0Var, q0 q0Var) {
        p.j(eVar, "<anonymous parameter 0>");
        p.j(x0Var, "<anonymous parameter 1>");
        p.j(q0Var, "rememberManager");
        q0Var.b((r0) this.f5972a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((e) obj, (x0) obj2, (q0) obj3);
        return k.f22762a;
    }
}
