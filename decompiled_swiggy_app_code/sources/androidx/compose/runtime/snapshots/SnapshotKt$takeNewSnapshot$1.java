package androidx.compose.runtime.snapshots;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Snapshot.kt */
final class SnapshotKt$takeNewSnapshot$1 extends Lambda implements l<SnapshotIdSet, T> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<SnapshotIdSet, T> f6261a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotKt$takeNewSnapshot$1(l<? super SnapshotIdSet, ? extends T> lVar) {
        super(1);
        this.f6261a = lVar;
    }

    /* renamed from: a */
    public final T invoke(SnapshotIdSet snapshotIdSet) {
        p.j(snapshotIdSet, "invalid");
        T t = (b) this.f6261a.invoke(snapshotIdSet);
        synchronized (SnapshotKt.C()) {
            SnapshotKt.f6249d = SnapshotKt.f6249d.n(t.f());
            k kVar = k.f22762a;
        }
        return t;
    }
}
