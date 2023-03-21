package androidx.compose.runtime.snapshots;

import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Snapshot.kt */
final class GlobalSnapshot$1$1$1 extends Lambda implements l<Object, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<l<Object, k>> f6226a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GlobalSnapshot$1$1$1(List<l<Object, k>> list) {
        super(1);
        this.f6226a = list;
    }

    public final void invoke(Object obj) {
        p.j(obj, HexAttribute.HEX_ATTR_THREAD_STATE);
        List<l<Object, k>> list = this.f6226a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            list.get(i11).invoke(obj);
        }
    }
}
