package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.b;
import bp0.k;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import yp0.f;

/* compiled from: SnapshotFlow.kt */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1 extends Lambda implements p<Set<? extends Object>, b, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f<Set<Object>> f6118a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1(f<Set<Object>> fVar) {
        super(2);
        this.f6118a = fVar;
    }

    public final void a(Set<? extends Object> set, b bVar) {
        kotlin.jvm.internal.p.j(set, "changed");
        kotlin.jvm.internal.p.j(bVar, "<anonymous parameter 1>");
        this.f6118a.e(set);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((Set) obj, (b) obj2);
        return k.f22762a;
    }
}
