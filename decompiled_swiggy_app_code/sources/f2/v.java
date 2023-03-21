package f2;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import d2.c;
import d2.e;
import d2.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k2.a;
import kotlin.jvm.internal.p;

/* compiled from: ConstraintLayout.kt */
public final class v extends State {

    /* renamed from: g  reason: collision with root package name */
    private final e f14607g;

    /* renamed from: h  reason: collision with root package name */
    private long f14608h = c.b(0, 0, 0, 0, 15, (Object) null);

    /* renamed from: i  reason: collision with root package name */
    public LayoutDirection f14609i;
    private final List<Object> j = new ArrayList();
    private boolean k = true;

    /* renamed from: l  reason: collision with root package name */
    private final Set<ConstraintWidget> f14610l = new LinkedHashSet();

    public v(e eVar) {
        p.j(eVar, "density");
        this.f14607g = eVar;
    }

    public final void A(long j11) {
        this.f14608h = j11;
    }

    public int d(Object obj) {
        if (obj instanceof h) {
            return this.f14607g.j0(((h) obj).s());
        }
        return super.d(obj);
    }

    public void o() {
        ConstraintWidget a11;
        HashMap<Object, a> hashMap = this.f8107a;
        p.i(hashMap, "mReferences");
        for (Map.Entry<Object, a> value : hashMap.entrySet()) {
            a aVar = (a) value.getValue();
            if (!(aVar == null || (a11 = aVar.a()) == null)) {
                a11.x0();
            }
        }
        this.f8107a.clear();
        HashMap<Object, a> hashMap2 = this.f8107a;
        p.i(hashMap2, "mReferences");
        hashMap2.put(State.f8106f, this.f8110d);
        this.j.clear();
        this.k = true;
        super.o();
    }

    public final void v(Object obj) {
        p.j(obj, DistributedTracing.NR_ID_ATTRIBUTE);
        this.j.add(obj);
        this.k = true;
    }

    public final LayoutDirection w() {
        LayoutDirection layoutDirection = this.f14609i;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        p.B("layoutDirection");
        throw null;
    }

    public final long x() {
        return this.f14608h;
    }

    public final boolean y(ConstraintWidget constraintWidget) {
        p.j(constraintWidget, "constraintWidget");
        if (this.k) {
            this.f14610l.clear();
            Iterator<T> it2 = this.j.iterator();
            while (it2.hasNext()) {
                a aVar = this.f8107a.get(it2.next());
                ConstraintWidget a11 = aVar == null ? null : aVar.a();
                if (a11 != null) {
                    this.f14610l.add(a11);
                }
            }
            this.k = false;
        }
        return this.f14610l.contains(constraintWidget);
    }

    public final void z(LayoutDirection layoutDirection) {
        p.j(layoutDirection, "<set-?>");
        this.f14609i = layoutDirection;
    }
}
