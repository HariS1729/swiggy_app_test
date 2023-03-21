package androidx.compose.runtime;

import bp0.k;
import e0.c;
import e0.e;
import e0.q0;
import e0.x0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: Composer.kt */
final class ComposerImpl$insertMovableContentReferences$1$1$1 extends Lambda implements q<e<?>, x0, q0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Ref$IntRef f5930a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f5931b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$insertMovableContentReferences$1$1$1(Ref$IntRef ref$IntRef, c cVar) {
        super(3);
        this.f5930a = ref$IntRef;
        this.f5931b = cVar;
    }

    public final void a(e<?> eVar, x0 x0Var, q0 q0Var) {
        p.j(eVar, "applier");
        p.j(x0Var, "slots");
        p.j(q0Var, "<anonymous parameter 2>");
        this.f5930a.f25664a = ComposerImpl.H0(x0Var, this.f5931b, eVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((e) obj, (x0) obj2, (q0) obj3);
        return k.f22762a;
    }
}
