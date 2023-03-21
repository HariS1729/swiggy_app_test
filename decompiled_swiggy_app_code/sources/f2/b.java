package f2;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import kotlin.jvm.internal.p;

/* compiled from: ConstraintLayoutBaseScope.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Object f14563a;

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayoutBaseScope.c f14564b;

    /* renamed from: c  reason: collision with root package name */
    private final ConstraintLayoutBaseScope.c f14565c;

    /* renamed from: d  reason: collision with root package name */
    private final ConstraintLayoutBaseScope.b f14566d;

    /* renamed from: e  reason: collision with root package name */
    private final ConstraintLayoutBaseScope.c f14567e;

    /* renamed from: f  reason: collision with root package name */
    private final ConstraintLayoutBaseScope.c f14568f;

    /* renamed from: g  reason: collision with root package name */
    private final ConstraintLayoutBaseScope.b f14569g;

    /* renamed from: h  reason: collision with root package name */
    private final ConstraintLayoutBaseScope.a f14570h;

    public b(Object obj) {
        p.j(obj, DistributedTracing.NR_ID_ATTRIBUTE);
        this.f14563a = obj;
        this.f14564b = new ConstraintLayoutBaseScope.c(obj, -2);
        this.f14565c = new ConstraintLayoutBaseScope.c(obj, 0);
        this.f14566d = new ConstraintLayoutBaseScope.b(obj, 0);
        this.f14567e = new ConstraintLayoutBaseScope.c(obj, -1);
        this.f14568f = new ConstraintLayoutBaseScope.c(obj, 1);
        this.f14569g = new ConstraintLayoutBaseScope.b(obj, 1);
        this.f14570h = new ConstraintLayoutBaseScope.a(obj);
    }

    public final ConstraintLayoutBaseScope.b a() {
        return this.f14569g;
    }

    public final ConstraintLayoutBaseScope.c b() {
        return this.f14567e;
    }

    public final Object c() {
        return this.f14563a;
    }

    public final ConstraintLayoutBaseScope.c d() {
        return this.f14564b;
    }

    public final ConstraintLayoutBaseScope.b e() {
        return this.f14566d;
    }
}
