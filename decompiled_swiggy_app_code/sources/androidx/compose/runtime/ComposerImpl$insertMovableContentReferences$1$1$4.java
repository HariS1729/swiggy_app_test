package androidx.compose.runtime;

import bp0.k;
import e0.c;
import e0.e;
import e0.f0;
import e0.g0;
import e0.j;
import e0.q0;
import e0.x0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: Composer.kt */
final class ComposerImpl$insertMovableContentReferences$1$1$4 extends Lambda implements q<e<?>, x0, q0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComposerImpl f5940a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g0 f5941b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g0 f5942c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$insertMovableContentReferences$1$1$4(ComposerImpl composerImpl, g0 g0Var, g0 g0Var2) {
        super(3);
        this.f5940a = composerImpl;
        this.f5941b = g0Var;
        this.f5942c = g0Var2;
    }

    public final void a(e<?> eVar, x0 x0Var, q0 q0Var) {
        p.j(eVar, "<anonymous parameter 0>");
        p.j(x0Var, "slots");
        p.j(q0Var, "<anonymous parameter 2>");
        f0 k = this.f5940a.f5883c.k(this.f5941b);
        if (k != null) {
            List<c> r02 = x0Var.r0(1, k.a(), 1);
            if (true ^ r02.isEmpty()) {
                j jVar = (j) this.f5942c.b();
                int size = r02.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Object Q0 = x0Var.Q0(r02.get(i11), 0);
                    RecomposeScopeImpl recomposeScopeImpl = Q0 instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) Q0 : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.g(jVar);
                    }
                }
                return;
            }
            return;
        }
        ComposerKt.x("Could not resolve state for movable content");
        throw new KotlinNothingValueException();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((e) obj, (x0) obj2, (q0) obj3);
        return k.f22762a;
    }
}
