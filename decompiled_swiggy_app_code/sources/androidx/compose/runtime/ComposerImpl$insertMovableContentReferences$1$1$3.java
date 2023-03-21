package androidx.compose.runtime;

import bp0.k;
import e0.e;
import e0.q0;
import e0.x0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: Composer.kt */
final class ComposerImpl$insertMovableContentReferences$1$1$3 extends Lambda implements q<e<?>, x0, q0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Ref$IntRef f5938a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<Object> f5939b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$insertMovableContentReferences$1$1$3(Ref$IntRef ref$IntRef, List<? extends Object> list) {
        super(3);
        this.f5938a = ref$IntRef;
        this.f5939b = list;
    }

    public final void a(e<?> eVar, x0 x0Var, q0 q0Var) {
        p.j(eVar, "applier");
        p.j(x0Var, "<anonymous parameter 1>");
        p.j(q0Var, "<anonymous parameter 2>");
        int i11 = this.f5938a.f25664a;
        List<Object> list = this.f5939b;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            int i13 = i11 + i12;
            eVar.g(i13, obj);
            eVar.f(i13, obj);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((e) obj, (x0) obj2, (q0) obj3);
        return k.f22762a;
    }
}
