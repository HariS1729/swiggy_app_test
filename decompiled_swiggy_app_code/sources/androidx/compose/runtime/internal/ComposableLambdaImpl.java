package androidx.compose.runtime.internal;

import e0.g;
import e0.o0;
import e0.s0;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.x;
import l0.a;
import l0.b;
import lp0.q;
import lp0.r;
import lp0.s;
import lp0.t;
import lp0.u;

/* compiled from: ComposableLambda.jvm.kt */
public final class ComposableLambdaImpl implements a {

    /* renamed from: a  reason: collision with root package name */
    private final int f6142a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f6143b;

    /* renamed from: c  reason: collision with root package name */
    private Object f6144c;

    /* renamed from: d  reason: collision with root package name */
    private o0 f6145d;

    /* renamed from: e  reason: collision with root package name */
    private List<o0> f6146e;

    public ComposableLambdaImpl(int i11, boolean z11) {
        this.f6142a = i11;
        this.f6143b = z11;
    }

    private final void g(g gVar) {
        o0 C;
        if (this.f6143b && (C = gVar.C()) != null) {
            gVar.l(C);
            if (b.e(this.f6145d, C)) {
                this.f6145d = C;
                return;
            }
            List<o0> list = this.f6146e;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.f6146e = arrayList;
                arrayList.add(C);
                return;
            }
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (b.e(list.get(i11), C)) {
                    list.set(i11, C);
                    return;
                }
            }
            list.add(C);
        }
    }

    private final void h() {
        if (this.f6143b) {
            o0 o0Var = this.f6145d;
            if (o0Var != null) {
                o0Var.invalidate();
                this.f6145d = null;
            }
            List<o0> list = this.f6146e;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list.get(i11).invalidate();
                }
                list.clear();
            }
        }
    }

    public /* bridge */ /* synthetic */ Object P(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return d(obj, obj2, obj3, (g) obj4, ((Number) obj5).intValue());
    }

    public Object a(g gVar, int i11) {
        p.j(gVar, "c");
        g t = gVar.t(this.f6142a);
        g(t);
        int d11 = i11 | (t.k(this) ? b.d(0) : b.f(0));
        Object obj = this.f6144c;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((lp0.p) x.e(obj, 2)).invoke(t, Integer.valueOf(d11));
        s0 v = t.v();
        if (v != null) {
            v.a((lp0.p) x.e(this, 2));
        }
        return invoke;
    }

    public Object b(Object obj, g gVar, int i11) {
        p.j(gVar, "c");
        g t = gVar.t(this.f6142a);
        g(t);
        int d11 = t.k(this) ? b.d(1) : b.f(1);
        Object obj2 = this.f6144c;
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((q) x.e(obj2, 3)).invoke(obj, t, Integer.valueOf(d11 | i11));
        s0 v = t.v();
        if (v != null) {
            v.a(new ComposableLambdaImpl$invoke$1(this, obj, i11));
        }
        return invoke;
    }

    public Object c(Object obj, Object obj2, g gVar, int i11) {
        p.j(gVar, "c");
        g t = gVar.t(this.f6142a);
        g(t);
        int d11 = t.k(this) ? b.d(2) : b.f(2);
        Object obj3 = this.f6144c;
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((r) x.e(obj3, 4)).invoke(obj, obj2, t, Integer.valueOf(d11 | i11));
        s0 v = t.v();
        if (v != null) {
            v.a(new ComposableLambdaImpl$invoke$2(this, obj, obj2, i11));
        }
        return invoke;
    }

    public Object d(Object obj, Object obj2, Object obj3, g gVar, int i11) {
        p.j(gVar, "c");
        g t = gVar.t(this.f6142a);
        g(t);
        int d11 = t.k(this) ? b.d(3) : b.f(3);
        Object obj4 = this.f6144c;
        Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object P = ((s) x.e(obj4, 5)).P(obj, obj2, obj3, t, Integer.valueOf(d11 | i11));
        s0 v = t.v();
        if (v != null) {
            v.a(new ComposableLambdaImpl$invoke$3(this, obj, obj2, obj3, i11));
        }
        return P;
    }

    public Object e(Object obj, Object obj2, Object obj3, Object obj4, g gVar, int i11) {
        p.j(gVar, "c");
        g t = gVar.t(this.f6142a);
        g(t);
        int d11 = t.k(this) ? b.d(4) : b.f(4);
        Object obj5 = this.f6144c;
        Objects.requireNonNull(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((t) x.e(obj5, 6)).invoke(obj, obj2, obj3, obj4, t, Integer.valueOf(d11 | i11));
        s0 v = t.v();
        if (v != null) {
            v.a(new ComposableLambdaImpl$invoke$4(this, obj, obj2, obj3, obj4, i11));
        }
        return invoke;
    }

    public Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, g gVar, int i11) {
        g gVar2 = gVar;
        p.j(gVar2, "c");
        g t = gVar2.t(this.f6142a);
        g(t);
        int d11 = t.k(this) ? b.d(5) : b.f(5);
        Object obj6 = this.f6144c;
        Objects.requireNonNull(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object l02 = ((u) x.e(obj6, 7)).l0(obj, obj2, obj3, obj4, obj5, t, Integer.valueOf(i11 | d11));
        s0 v = t.v();
        if (v != null) {
            v.a(new ComposableLambdaImpl$invoke$5(this, obj, obj2, obj3, obj4, obj5, i11));
        }
        return l02;
    }

    public final void i(Object obj) {
        p.j(obj, RenderingDetails.TYPE_BLOCK);
        if (!p.e(this.f6144c, obj)) {
            boolean z11 = this.f6144c == null;
            this.f6144c = obj;
            if (!z11) {
                h();
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((g) obj, ((Number) obj2).intValue());
    }

    public /* bridge */ /* synthetic */ Object l0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return f(obj, obj2, obj3, obj4, obj5, (g) obj6, ((Number) obj7).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b(obj, (g) obj2, ((Number) obj3).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return c(obj, obj2, (g) obj3, ((Number) obj4).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return e(obj, obj2, obj3, obj4, (g) obj5, ((Number) obj6).intValue());
    }
}
