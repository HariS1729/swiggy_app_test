package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import f0.e;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: SnapshotStateObserver.kt */
final class SnapshotStateObserver$readObserver$1 extends Lambda implements l<Object, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SnapshotStateObserver f6281a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateObserver$readObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(1);
        this.f6281a = snapshotStateObserver;
    }

    public final void invoke(Object obj) {
        p.j(obj, HexAttribute.HEX_ATTR_THREAD_STATE);
        if (!this.f6281a.f6273f) {
            e b11 = this.f6281a.f6271d;
            SnapshotStateObserver snapshotStateObserver = this.f6281a;
            synchronized (b11) {
                SnapshotStateObserver.a c11 = snapshotStateObserver.f6274g;
                p.g(c11);
                c11.a(obj);
                k kVar = k.f22762a;
            }
        }
    }
}
