package androidx.compose.ui.node;

import k1.r;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: OwnerSnapshotObserver.kt */
final class OwnerSnapshotObserver$clearInvalidObservations$1 extends Lambda implements l<Object, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final OwnerSnapshotObserver$clearInvalidObservations$1 f6937a = new OwnerSnapshotObserver$clearInvalidObservations$1();

    OwnerSnapshotObserver$clearInvalidObservations$1() {
        super(1);
    }

    /* renamed from: a */
    public final Boolean invoke(Object obj) {
        p.j(obj, "it");
        return Boolean.valueOf(!((r) obj).o0());
    }
}
