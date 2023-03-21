package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.b;
import fp0.c;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import lp0.l;
import wp0.k0;
import wp0.k1;
import yp0.f;
import yp0.i;

/* compiled from: GlobalSnapshotManager.android.kt */
public final class GlobalSnapshotManager {

    /* renamed from: a  reason: collision with root package name */
    public static final GlobalSnapshotManager f7144a = new GlobalSnapshotManager();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f7145b = new AtomicBoolean(false);

    private GlobalSnapshotManager() {
    }

    public final void a() {
        if (f7145b.compareAndSet(false, true)) {
            f b11 = i.b(-1, (BufferOverflow) null, (l) null, 6, (Object) null);
            k1 unused = j.d(k0.a(AndroidUiDispatcher.f7075l.b()), (CoroutineContext) null, (CoroutineStart) null, new GlobalSnapshotManager$ensureStarted$1(b11, (c<? super GlobalSnapshotManager$ensureStarted$1>) null), 3, (Object) null);
            b.f6287e.f(new GlobalSnapshotManager$ensureStarted$2(b11));
        }
    }
}
