package androidx.compose.runtime;

import bp0.k;
import e0.c;
import e0.e;
import e0.q0;
import e0.v0;
import e0.x0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: Composer.kt */
final class ComposerImpl$recordInsert$1 extends Lambda implements q<e<?>, x0, q0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v0 f5958a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f5959b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$recordInsert$1(v0 v0Var, c cVar) {
        super(3);
        this.f5958a = v0Var;
        this.f5959b = cVar;
    }

    public final void a(e<?> eVar, x0 x0Var, q0 q0Var) {
        p.j(eVar, "<anonymous parameter 0>");
        p.j(x0Var, "slots");
        p.j(q0Var, "<anonymous parameter 2>");
        x0Var.D();
        v0 v0Var = this.f5958a;
        x0Var.o0(v0Var, this.f5959b.d(v0Var));
        x0Var.O();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((e) obj, (x0) obj2, (q0) obj3);
        return k.f22762a;
    }
}
