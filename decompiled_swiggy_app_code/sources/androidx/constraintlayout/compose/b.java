package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.a;
import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import f2.v;
import java.util.List;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ConstrainScope.kt */
final class b extends BaseHorizontalAnchorable {

    /* renamed from: c  reason: collision with root package name */
    private final Object f8002c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Object obj, int i11, List<l<v, k>> list) {
        super(list, i11);
        p.j(obj, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(list, "tasks");
        this.f8002c = obj;
    }

    public a c(v vVar) {
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        a c11 = vVar.c(this.f8002c);
        p.i(c11, "state.constraints(id)");
        return c11;
    }
}
