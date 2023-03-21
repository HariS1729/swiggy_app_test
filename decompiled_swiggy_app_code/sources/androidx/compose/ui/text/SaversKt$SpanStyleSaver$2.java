package androidx.compose.ui.text;

import a2.a;
import a2.e;
import a2.h;
import d2.r;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import m0.c;
import p1.u;
import u0.d0;
import u0.h1;
import u1.i;
import u1.s;
import u1.t;
import u1.v;
import w1.f;

/* compiled from: Savers.kt */
final class SaversKt$SpanStyleSaver$2 extends Lambda implements l<Object, u> {

    /* renamed from: a  reason: collision with root package name */
    public static final SaversKt$SpanStyleSaver$2 f7509a = new SaversKt$SpanStyleSaver$2();

    SaversKt$SpanStyleSaver$2() {
        super(1);
    }

    /* renamed from: a */
    public final u invoke(Object obj) {
        d0 d0Var;
        r rVar;
        v vVar;
        r rVar2;
        a aVar;
        h hVar;
        f fVar;
        d0 d0Var2;
        e eVar;
        h1 h1Var;
        Object obj2 = obj;
        p.j(obj2, "it");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        d0.a aVar2 = d0.f16756b;
        c<d0, Object> m11 = SaversKt.m(aVar2);
        Boolean bool = Boolean.FALSE;
        if (!p.e(obj3, bool) && obj3 != null) {
            d0Var = m11.a(obj3);
        } else {
            d0Var = null;
        }
        p.g(d0Var);
        long v = d0Var.v();
        Object obj4 = list.get(1);
        r.a aVar3 = r.f14022b;
        c<r, Object> j = SaversKt.j(aVar3);
        if (!p.e(obj4, bool) && obj4 != null) {
            rVar = j.a(obj4);
        } else {
            rVar = null;
        }
        p.g(rVar);
        long k = rVar.k();
        Object obj5 = list.get(2);
        c<v, Object> o11 = SaversKt.o(v.f16949b);
        if (!p.e(obj5, bool) && obj5 != null) {
            vVar = o11.a(obj5);
        } else {
            vVar = null;
        }
        Object obj6 = list.get(3);
        s sVar = obj6 != null ? (s) obj6 : null;
        Object obj7 = list.get(4);
        t tVar = obj7 != null ? (t) obj7 : null;
        Object obj8 = list.get(6);
        String str = obj8 != null ? (String) obj8 : null;
        Object obj9 = list.get(7);
        c<r, Object> j11 = SaversKt.j(aVar3);
        if (!p.e(obj9, bool) && obj9 != null) {
            rVar2 = j11.a(obj9);
        } else {
            rVar2 = null;
        }
        p.g(rVar2);
        long k11 = rVar2.k();
        Object obj10 = list.get(8);
        c<a, Object> f11 = SaversKt.f(a.f884b);
        if (!p.e(obj10, bool) && obj10 != null) {
            aVar = f11.a(obj10);
        } else {
            aVar = null;
        }
        Object obj11 = list.get(9);
        c<h, Object> h11 = SaversKt.h(h.f927c);
        if (!p.e(obj11, bool) && obj11 != null) {
            hVar = h11.a(obj11);
        } else {
            hVar = null;
        }
        Object obj12 = list.get(10);
        c<f, Object> q = SaversKt.q(f.f17448c);
        if (!p.e(obj12, bool) && obj12 != null) {
            fVar = q.a(obj12);
        } else {
            fVar = null;
        }
        Object obj13 = list.get(11);
        c<d0, Object> m12 = SaversKt.m(aVar2);
        if (!p.e(obj13, bool) && obj13 != null) {
            d0Var2 = m12.a(obj13);
        } else {
            d0Var2 = null;
        }
        p.g(d0Var2);
        long v11 = d0Var2.v();
        Object obj14 = list.get(12);
        c<e, Object> g11 = SaversKt.g(e.f915b);
        if (!p.e(obj14, bool) && obj14 != null) {
            eVar = g11.a(obj14);
        } else {
            eVar = null;
        }
        Object obj15 = list.get(13);
        c<h1, Object> n = SaversKt.n(h1.f16796d);
        if (!p.e(obj15, bool) && obj15 != null) {
            h1Var = n.a(obj15);
        } else {
            h1Var = null;
        }
        return new u(v, k, vVar, sVar, tVar, (i) null, str, k11, aVar, hVar, fVar, v11, eVar, h1Var, 32, (kotlin.jvm.internal.i) null);
    }
}
