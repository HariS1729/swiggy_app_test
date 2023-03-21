package androidx.compose.runtime.snapshots;

import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Snapshot.kt */
final class NestedReadonlySnapshot$readObserver$1$1$1 extends Lambda implements l<Object, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<Object, k> f6232a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<Object, k> f6233b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NestedReadonlySnapshot$readObserver$1$1$1(l<Object, k> lVar, l<Object, k> lVar2) {
        super(1);
        this.f6232a = lVar;
        this.f6233b = lVar2;
    }

    public final void invoke(Object obj) {
        p.j(obj, HexAttribute.HEX_ATTR_THREAD_STATE);
        this.f6232a.invoke(obj);
        this.f6233b.invoke(obj);
    }
}
