package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import bp0.k;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import k1.r;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;

/* compiled from: OwnerSnapshotObserver.kt */
public final class OwnerSnapshotObserver {

    /* renamed from: a  reason: collision with root package name */
    private final SnapshotStateObserver f6933a;

    /* renamed from: b  reason: collision with root package name */
    private final l<LayoutNode, k> f6934b = OwnerSnapshotObserver$onCommitAffectingMeasure$1.f6940a;

    /* renamed from: c  reason: collision with root package name */
    private final l<LayoutNode, k> f6935c = OwnerSnapshotObserver$onCommitAffectingLayout$1.f6938a;

    /* renamed from: d  reason: collision with root package name */
    private final l<LayoutNode, k> f6936d = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.f6939a;

    public OwnerSnapshotObserver(l<? super a<k>, k> lVar) {
        p.j(lVar, "onChangedExecutor");
        this.f6933a = new SnapshotStateObserver(lVar);
    }

    public final void a() {
        this.f6933a.h(OwnerSnapshotObserver$clearInvalidObservations$1.f6937a);
    }

    public final void b(LayoutNode layoutNode, a<k> aVar) {
        p.j(layoutNode, "node");
        p.j(aVar, RenderingDetails.TYPE_BLOCK);
        e(layoutNode, this.f6936d, aVar);
    }

    public final void c(LayoutNode layoutNode, a<k> aVar) {
        p.j(layoutNode, "node");
        p.j(aVar, RenderingDetails.TYPE_BLOCK);
        e(layoutNode, this.f6935c, aVar);
    }

    public final void d(LayoutNode layoutNode, a<k> aVar) {
        p.j(layoutNode, "node");
        p.j(aVar, RenderingDetails.TYPE_BLOCK);
        e(layoutNode, this.f6934b, aVar);
    }

    public final <T extends r> void e(T t, l<? super T, k> lVar, a<k> aVar) {
        p.j(t, "target");
        p.j(lVar, "onChanged");
        p.j(aVar, RenderingDetails.TYPE_BLOCK);
        this.f6933a.j(t, lVar, aVar);
    }

    public final void f() {
        this.f6933a.k();
    }

    public final void g() {
        this.f6933a.l();
        this.f6933a.g();
    }
}
