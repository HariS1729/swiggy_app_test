package androidx.compose.runtime;

import bp0.k;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: SnapshotFlow.kt */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 extends Lambda implements l<Object, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Set<Object> f6117a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1(Set<Object> set) {
        super(1);
        this.f6117a = set;
    }

    public final void invoke(Object obj) {
        p.j(obj, "it");
        this.f6117a.add(obj);
    }
}
