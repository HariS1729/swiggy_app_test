package androidx.compose.runtime;

import bp0.k;
import e0.e;
import e0.i0;
import e0.q0;
import e0.x0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: Composer.kt */
final class ComposerImpl$insertMovableContentReferences$1$1$5$1$2 extends Lambda implements q<e<?>, x0, q0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Ref$IntRef f5945a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<q<e<?>, x0, q0, k>> f5946b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$insertMovableContentReferences$1$1$5$1$2(Ref$IntRef ref$IntRef, List<q<e<?>, x0, q0, k>> list) {
        super(3);
        this.f5945a = ref$IntRef;
        this.f5946b = list;
    }

    public final void a(e<?> eVar, x0 x0Var, q0 q0Var) {
        p.j(eVar, "applier");
        p.j(x0Var, "slots");
        p.j(q0Var, "rememberManager");
        int i11 = this.f5945a.f25664a;
        if (i11 > 0) {
            eVar = new i0<>(eVar, i11);
        }
        List<q<e<?>, x0, q0, k>> list = this.f5946b;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            list.get(i12).invoke(eVar, x0Var, q0Var);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((e) obj, (x0) obj2, (q0) obj3);
        return k.f22762a;
    }
}
