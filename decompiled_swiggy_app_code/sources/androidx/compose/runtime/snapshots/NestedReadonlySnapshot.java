package androidx.compose.runtime.snapshots;

import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import n0.o;
import n0.u;

/* compiled from: Snapshot.kt */
public final class NestedReadonlySnapshot extends b {

    /* renamed from: g  reason: collision with root package name */
    private final b f6230g;

    /* renamed from: h  reason: collision with root package name */
    private final l<Object, k> f6231h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedReadonlySnapshot(int i11, SnapshotIdSet snapshotIdSet, l<Object, k> lVar, b bVar) {
        super(i11, snapshotIdSet, (i) null);
        p.j(snapshotIdSet, "invalid");
        p.j(bVar, "parent");
        this.f6230g = bVar;
        bVar.l(this);
        if (lVar != null) {
            l<Object, k> h11 = bVar.h();
            if (h11 != null) {
                lVar = new NestedReadonlySnapshot$readObserver$1$1$1(lVar, h11);
            }
        } else {
            lVar = bVar.h();
        }
        this.f6231h = lVar;
    }

    /* renamed from: A */
    public Void o(u uVar) {
        p.j(uVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        Void unused = SnapshotKt.R();
        throw new KotlinNothingValueException();
    }

    /* renamed from: B */
    public NestedReadonlySnapshot v(l<Object, k> lVar) {
        return new NestedReadonlySnapshot(f(), g(), lVar, this.f6230g);
    }

    public void d() {
        if (!e()) {
            if (f() != this.f6230g.f()) {
                b();
            }
            this.f6230g.m(this);
            super.d();
        }
    }

    public l<Object, k> h() {
        return this.f6231h;
    }

    public boolean i() {
        return true;
    }

    public l<Object, k> j() {
        return null;
    }

    public void n() {
    }

    /* renamed from: y */
    public Void l(b bVar) {
        p.j(bVar, "snapshot");
        o.b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: z */
    public Void m(b bVar) {
        p.j(bVar, "snapshot");
        o.b();
        throw new KotlinNothingValueException();
    }
}
