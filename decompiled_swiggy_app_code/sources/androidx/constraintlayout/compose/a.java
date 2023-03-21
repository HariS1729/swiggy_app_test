package androidx.constraintlayout.compose;

import bp0.k;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import f2.v;
import java.util.List;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ConstrainScope.kt */
final class a implements f2.a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f8000a;

    /* renamed from: b  reason: collision with root package name */
    private final List<l<v, k>> f8001b;

    public a(Object obj, List<l<v, k>> list) {
        p.j(obj, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(list, "tasks");
        this.f8000a = obj;
        this.f8001b = list;
    }
}
