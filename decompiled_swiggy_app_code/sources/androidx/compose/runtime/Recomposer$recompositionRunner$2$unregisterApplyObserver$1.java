package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.snapshots.b;
import bp0.k;
import java.util.Set;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import wp0.n;

/* compiled from: Recomposer.kt */
final class Recomposer$recompositionRunner$2$unregisterApplyObserver$1 extends Lambda implements p<Set<? extends Object>, b, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Recomposer f6075a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$recompositionRunner$2$unregisterApplyObserver$1(Recomposer recomposer) {
        super(2);
        this.f6075a = recomposer;
    }

    public final void a(Set<? extends Object> set, b bVar) {
        n nVar;
        kotlin.jvm.internal.p.j(set, "changed");
        kotlin.jvm.internal.p.j(bVar, "<anonymous parameter 1>");
        Object E = this.f6075a.f6044e;
        Recomposer recomposer = this.f6075a;
        synchronized (E) {
            if (((Recomposer.State) recomposer.f6053r.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                recomposer.f6048i.add(set);
                nVar = recomposer.U();
            } else {
                nVar = null;
            }
        }
        if (nVar != null) {
            Result.a aVar = Result.f25582b;
            nVar.resumeWith(Result.b(k.f22762a));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((Set) obj, (b) obj2);
        return k.f22762a;
    }
}
