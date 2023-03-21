package androidx.compose.runtime;

import bp0.k;
import e0.c;
import e0.e;
import e0.f0;
import e0.g0;
import e0.q0;
import e0.v0;
import e0.x0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: Composer.kt */
final class ComposerImpl$reportFreeMovableContent$reportGroup$1 extends Lambda implements q<e<?>, x0, q0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComposerImpl f5965a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g0 f5966b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f5967c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$reportFreeMovableContent$reportGroup$1(ComposerImpl composerImpl, g0 g0Var, c cVar) {
        super(3);
        this.f5965a = composerImpl;
        this.f5966b = g0Var;
        this.f5967c = cVar;
    }

    /* JADX INFO: finally extract failed */
    public final void a(e<?> eVar, x0 x0Var, q0 q0Var) {
        p.j(eVar, "<anonymous parameter 0>");
        p.j(x0Var, "slots");
        p.j(q0Var, "<anonymous parameter 2>");
        v0 v0Var = new v0();
        c cVar = this.f5967c;
        x0 p11 = v0Var.p();
        try {
            p11.D();
            x0Var.t0(cVar, 1, p11);
            p11.O();
            k kVar = k.f22762a;
            p11.F();
            this.f5965a.f5883c.j(this.f5966b, new f0(v0Var));
        } catch (Throwable th2) {
            p11.F();
            throw th2;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((e) obj, (x0) obj2, (q0) obj3);
        return k.f22762a;
    }
}
