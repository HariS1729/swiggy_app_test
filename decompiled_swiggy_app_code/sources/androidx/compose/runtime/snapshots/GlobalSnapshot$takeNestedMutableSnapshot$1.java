package androidx.compose.runtime.snapshots;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Snapshot.kt */
final class GlobalSnapshot$takeNestedMutableSnapshot$1 extends Lambda implements l<SnapshotIdSet, a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<Object, k> f6227a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<Object, k> f6228b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GlobalSnapshot$takeNestedMutableSnapshot$1(l<Object, k> lVar, l<Object, k> lVar2) {
        super(1);
        this.f6227a = lVar;
        this.f6228b = lVar2;
    }

    /* renamed from: a */
    public final a invoke(SnapshotIdSet snapshotIdSet) {
        int h11;
        p.j(snapshotIdSet, "invalid");
        synchronized (SnapshotKt.C()) {
            h11 = SnapshotKt.f6250e;
            SnapshotKt.f6250e = h11 + 1;
        }
        return new a(h11, snapshotIdSet, this.f6227a, this.f6228b);
    }
}
