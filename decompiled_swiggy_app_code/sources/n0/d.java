package n0;

import androidx.compose.runtime.snapshots.NestedReadonlySnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.b;
import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Snapshot.kt */
public final class d extends b {

    /* renamed from: g  reason: collision with root package name */
    private final l<Object, k> f15731g;

    /* renamed from: h  reason: collision with root package name */
    private int f15732h = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(int i11, SnapshotIdSet snapshotIdSet, l<Object, k> lVar) {
        super(i11, snapshotIdSet, (i) null);
        p.j(snapshotIdSet, "invalid");
        this.f15731g = lVar;
    }

    public void d() {
        if (!e()) {
            m(this);
            super.d();
        }
    }

    public l<Object, k> h() {
        return this.f15731g;
    }

    public boolean i() {
        return true;
    }

    public l<Object, k> j() {
        return null;
    }

    public void l(b bVar) {
        p.j(bVar, "snapshot");
        this.f15732h++;
    }

    public void m(b bVar) {
        p.j(bVar, "snapshot");
        int i11 = this.f15732h - 1;
        this.f15732h = i11;
        if (i11 == 0) {
            b();
        }
    }

    public void n() {
    }

    public void o(u uVar) {
        p.j(uVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        Void unused = SnapshotKt.R();
        throw new KotlinNothingValueException();
    }

    public b v(l<Object, k> lVar) {
        SnapshotKt.Y(this);
        return new NestedReadonlySnapshot(f(), g(), lVar, this);
    }
}
