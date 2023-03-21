package f2;

import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.state.b;
import com.newrelic.agent.android.agentdata.HexAttribute;
import d2.h;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ConstraintLayout.kt */
public final class k implements Dimension.a, Dimension {

    /* renamed from: b  reason: collision with root package name */
    private final l<v, b> f14577b;

    /* renamed from: c  reason: collision with root package name */
    private h f14578c;

    /* renamed from: d  reason: collision with root package name */
    private Object f14579d;

    /* renamed from: e  reason: collision with root package name */
    private h f14580e;

    /* renamed from: f  reason: collision with root package name */
    private Object f14581f;

    public k(l<? super v, ? extends b> lVar) {
        p.j(lVar, "baseDimension");
        this.f14577b = lVar;
    }

    public final h a() {
        return this.f14580e;
    }

    public final Object b() {
        return this.f14581f;
    }

    public final h c() {
        return this.f14578c;
    }

    public final Object d() {
        return this.f14579d;
    }

    public final b e(v vVar) {
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        b invoke = this.f14577b.invoke(vVar);
        if (d() != null) {
            invoke.o(d());
        } else if (c() != null) {
            h c11 = c();
            p.g(c11);
            invoke.n(vVar.d(c11));
        }
        if (b() != null) {
            invoke.m(b());
        } else if (a() != null) {
            h a11 = a();
            p.g(a11);
            invoke.l(vVar.d(a11));
        }
        return invoke;
    }
}
