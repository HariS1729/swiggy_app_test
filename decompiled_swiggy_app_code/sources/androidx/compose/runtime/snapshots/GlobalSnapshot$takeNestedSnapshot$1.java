package androidx.compose.runtime.snapshots;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import n0.d;

/* compiled from: Snapshot.kt */
final class GlobalSnapshot$takeNestedSnapshot$1 extends Lambda implements l<SnapshotIdSet, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<Object, k> f6229a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GlobalSnapshot$takeNestedSnapshot$1(l<Object, k> lVar) {
        super(1);
        this.f6229a = lVar;
    }

    /* renamed from: a */
    public final d invoke(SnapshotIdSet snapshotIdSet) {
        int h11;
        p.j(snapshotIdSet, "invalid");
        synchronized (SnapshotKt.C()) {
            h11 = SnapshotKt.f6250e;
            SnapshotKt.f6250e = h11 + 1;
        }
        return new d(h11, snapshotIdSet, this.f6229a);
    }
}
