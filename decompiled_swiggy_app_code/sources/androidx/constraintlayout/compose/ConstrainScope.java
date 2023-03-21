package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.state.State;
import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import d2.h;
import f2.a;
import f2.b;
import f2.q;
import f2.v;
import f2.x;
import f2.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ConstrainScope.kt */
public final class ConstrainScope {

    /* renamed from: a  reason: collision with root package name */
    private final Object f7904a;

    /* renamed from: b  reason: collision with root package name */
    private final List<l<v, k>> f7905b;

    /* renamed from: c  reason: collision with root package name */
    private final b f7906c;

    /* renamed from: d  reason: collision with root package name */
    private final x f7907d;

    /* renamed from: e  reason: collision with root package name */
    private final x f7908e;

    /* renamed from: f  reason: collision with root package name */
    private final q f7909f;

    /* renamed from: g  reason: collision with root package name */
    private final x f7910g;

    /* renamed from: h  reason: collision with root package name */
    private final x f7911h;

    /* renamed from: i  reason: collision with root package name */
    private final q f7912i;
    private final a j;
    private Dimension k;

    /* renamed from: l  reason: collision with root package name */
    private Dimension f7913l;

    /* renamed from: m  reason: collision with root package name */
    private y f7914m = y.f14614b.a();
    private float n = 1.0f;

    /* renamed from: o  reason: collision with root package name */
    private float f7915o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    private float f7916p = 1.0f;
    private float q;

    /* renamed from: r  reason: collision with root package name */
    private float f7917r;

    /* renamed from: s  reason: collision with root package name */
    private float f7918s;
    private float t;

    /* renamed from: u  reason: collision with root package name */
    private float f7919u;
    private float v;

    /* renamed from: w  reason: collision with root package name */
    private float f7920w;

    public ConstrainScope(Object obj) {
        p.j(obj, DistributedTracing.NR_ID_ATTRIBUTE);
        this.f7904a = obj;
        ArrayList arrayList = new ArrayList();
        this.f7905b = arrayList;
        Integer num = State.f8106f;
        p.i(num, "PARENT");
        this.f7906c = new b(num);
        this.f7907d = new f(obj, -2, arrayList);
        this.f7908e = new f(obj, 0, arrayList);
        this.f7909f = new b(obj, 0, arrayList);
        this.f7910g = new f(obj, -1, arrayList);
        this.f7911h = new f(obj, 1, arrayList);
        this.f7912i = new b(obj, 1, arrayList);
        this.j = new a(obj, arrayList);
        Dimension.Companion companion = Dimension.f7970a;
        this.k = companion.b();
        this.f7913l = companion.b();
        float f11 = (float) 0;
        this.q = h.n(f11);
        this.f7917r = h.n(f11);
        this.f7918s = h.n(f11);
        this.t = 0.5f;
        this.f7919u = 0.5f;
        this.v = Float.NaN;
        this.f7920w = Float.NaN;
    }

    public final void a(v vVar) {
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        for (l invoke : this.f7905b) {
            invoke.invoke(vVar);
        }
    }

    public final q b() {
        return this.f7912i;
    }

    public final x c() {
        return this.f7910g;
    }

    public final Object d() {
        return this.f7904a;
    }

    public final b e() {
        return this.f7906c;
    }

    public final x f() {
        return this.f7907d;
    }

    public final List<l<v, k>> g() {
        return this.f7905b;
    }

    public final q h() {
        return this.f7909f;
    }

    public final void i(Dimension dimension) {
        p.j(dimension, "value");
        this.f7913l = dimension;
        this.f7905b.add(new ConstrainScope$height$1(this, dimension));
    }

    public final void j(Dimension dimension) {
        p.j(dimension, "value");
        this.k = dimension;
        this.f7905b.add(new ConstrainScope$width$1(this, dimension));
    }
}
