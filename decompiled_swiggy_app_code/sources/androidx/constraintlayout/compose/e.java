package androidx.constraintlayout.compose;

import bp0.k;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import f2.b;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ConstraintLayout.kt */
public final class e extends ConstraintLayoutBaseScope {
    public final ConstrainScope h(b bVar, l<? super ConstrainScope, k> lVar) {
        p.j(bVar, "ref");
        p.j(lVar, "constrainBlock");
        ConstrainScope constrainScope = new ConstrainScope(bVar.c());
        lVar.invoke(constrainScope);
        e().addAll(constrainScope.g());
        return constrainScope;
    }

    public final b i(Object obj) {
        p.j(obj, DistributedTracing.NR_ID_ATTRIBUTE);
        return new b(obj);
    }
}
