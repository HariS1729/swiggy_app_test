package androidx.compose.ui.text.platform.extensions;

import a2.a;
import a2.c;
import a2.e;
import a2.h;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import bp0.k;
import d2.e;
import d2.r;
import d2.t;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
import lp0.q;
import p1.b;
import p1.c0;
import p1.u;
import s1.c;
import s1.d;
import s1.j;
import s1.l;
import u0.d0;
import u0.f0;
import u0.f1;
import u0.h1;
import u0.k1;
import u1.i;
import u1.s;
import u1.v;
import w1.f;

/* compiled from: SpannableExtensions.android.kt */
public final class SpannableExtensions_androidKt {
    private static final MetricAffectingSpan a(long j, e eVar) {
        long g11 = r.g(j);
        t.a aVar = t.f14026b;
        if (t.g(g11, aVar.b())) {
            return new d(eVar.m0(j));
        }
        if (t.g(g11, aVar.a())) {
            return new c(r.h(j));
        }
        return null;
    }

    public static final void b(u uVar, List<b.C0163b<u>> list, q<? super u, ? super Integer, ? super Integer, k> qVar) {
        p.j(list, "spanStyles");
        p.j(qVar, RenderingDetails.TYPE_BLOCK);
        if (list.size() > 1) {
            int size = list.size();
            int i11 = size * 2;
            Integer[] numArr = new Integer[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                numArr[i12] = 0;
            }
            int size2 = list.size();
            for (int i13 = 0; i13 < size2; i13++) {
                b.C0163b bVar = list.get(i13);
                numArr[i13] = Integer.valueOf(bVar.f());
                numArr[i13 + size] = Integer.valueOf(bVar.d());
            }
            g.B(numArr);
            int intValue = ((Number) ArraysKt___ArraysKt.J(numArr)).intValue();
            for (int i14 = 0; i14 < i11; i14++) {
                int intValue2 = numArr[i14].intValue();
                if (intValue2 != intValue) {
                    int size3 = list.size();
                    u uVar2 = uVar;
                    for (int i15 = 0; i15 < size3; i15++) {
                        b.C0163b bVar2 = list.get(i15);
                        if (bVar2.f() != bVar2.d() && p1.c.i(intValue, intValue2, bVar2.f(), bVar2.d())) {
                            uVar2 = d(uVar2, (u) bVar2.e());
                        }
                    }
                    if (uVar2 != null) {
                        qVar.invoke(uVar2, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                    }
                    intValue = intValue2;
                }
            }
        } else if (!list.isEmpty()) {
            qVar.invoke(d(uVar, (u) list.get(0).e()), Integer.valueOf(list.get(0).f()), Integer.valueOf(list.get(0).d()));
        }
    }

    private static final boolean c(c0 c0Var) {
        return y1.d.b(c0Var.E()) || c0Var.l() != null;
    }

    private static final u d(u uVar, u uVar2) {
        return uVar == null ? uVar2 : uVar.v(uVar2);
    }

    private static final float e(long j, float f11, e eVar) {
        long g11 = r.g(j);
        t.a aVar = t.f14026b;
        if (t.g(g11, aVar.b())) {
            return eVar.m0(j);
        }
        if (t.g(g11, aVar.a())) {
            return r.h(j) * f11;
        }
        return Float.NaN;
    }

    public static final void f(Spannable spannable, long j, int i11, int i12) {
        p.j(spannable, "$this$setBackground");
        if (j != d0.f16756b.f()) {
            r(spannable, new BackgroundColorSpan(f0.j(j)), i11, i12);
        }
    }

    private static final void g(Spannable spannable, a aVar, int i11, int i12) {
        if (aVar != null) {
            r(spannable, new s1.a(aVar.h()), i11, i12);
        }
    }

    private static final void h(Spannable spannable, u0.u uVar, int i11, int i12) {
        if (uVar == null) {
            return;
        }
        if (uVar instanceof k1) {
            i(spannable, ((k1) uVar).b(), i11, i12);
        } else if (uVar instanceof f1) {
            r(spannable, new z1.a((f1) uVar), i11, i12);
        }
    }

    public static final void i(Spannable spannable, long j, int i11, int i12) {
        p.j(spannable, "$this$setColor");
        if (j != d0.f16756b.f()) {
            r(spannable, new ForegroundColorSpan(f0.j(j)), i11, i12);
        }
    }

    private static final void j(Spannable spannable, c0 c0Var, List<b.C0163b<u>> list, lp0.r<? super i, ? super v, ? super s, ? super u1.t, ? extends Typeface> rVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            b.C0163b<u> bVar = list.get(i11);
            b.C0163b bVar2 = bVar;
            if (y1.d.b((u) bVar2.e()) || ((u) bVar2.e()).k() != null) {
                arrayList.add(bVar);
            }
        }
        b(c(c0Var) ? new u(0, 0, c0Var.m(), c0Var.k(), c0Var.l(), c0Var.h(), (String) null, 0, (a) null, (h) null, (f) null, 0, (a2.e) null, (h1) null, 16323, (kotlin.jvm.internal.i) null) : null, arrayList, new SpannableExtensions_androidKt$setFontAttributes$1(spannable, rVar));
    }

    private static final void k(Spannable spannable, String str, int i11, int i12) {
        if (str != null) {
            r(spannable, new s1.b(str), i11, i12);
        }
    }

    public static final void l(Spannable spannable, long j, e eVar, int i11, int i12) {
        p.j(spannable, "$this$setFontSize");
        p.j(eVar, "density");
        long g11 = r.g(j);
        t.a aVar = t.f14026b;
        if (t.g(g11, aVar.b())) {
            r(spannable, new AbsoluteSizeSpan(c.c(eVar.m0(j)), false), i11, i12);
        } else if (t.g(g11, aVar.a())) {
            r(spannable, new RelativeSizeSpan(r.h(j)), i11, i12);
        }
    }

    private static final void m(Spannable spannable, h hVar, int i11, int i12) {
        if (hVar != null) {
            r(spannable, new ScaleXSpan(hVar.b()), i11, i12);
            r(spannable, new s1.k(hVar.c()), i11, i12);
        }
    }

    public static final void n(Spannable spannable, long j, float f11, e eVar, a2.c cVar) {
        p.j(spannable, "$this$setLineHeight");
        p.j(eVar, "density");
        p.j(cVar, "lineHeightStyle");
        float e11 = e(j, f11, eVar);
        if (!Float.isNaN(e11)) {
            r(spannable, new s1.f(e11, 0, spannable.length(), c.C0002c.e(cVar.c()), c.C0002c.f(cVar.c()), cVar.b()), 0, spannable.length());
        }
    }

    public static final void o(Spannable spannable, long j, float f11, e eVar) {
        p.j(spannable, "$this$setLineHeight");
        p.j(eVar, "density");
        float e11 = e(j, f11, eVar);
        if (!Float.isNaN(e11)) {
            r(spannable, new s1.e(e11), 0, spannable.length());
        }
    }

    public static final void p(Spannable spannable, f fVar, int i11, int i12) {
        Object obj;
        p.j(spannable, "<this>");
        if (fVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                obj = y1.b.f18009a.a(fVar);
            } else {
                obj = new LocaleSpan(y1.a.a(fVar.isEmpty() ? w1.e.f17446b.a() : fVar.c(0)));
            }
            r(spannable, obj, i11, i12);
        }
    }

    private static final void q(Spannable spannable, h1 h1Var, int i11, int i12) {
        if (h1Var != null) {
            r(spannable, new j(f0.j(h1Var.c()), t0.f.m(h1Var.d()), t0.f.n(h1Var.d()), h1Var.b()), i11, i12);
        }
    }

    public static final void r(Spannable spannable, Object obj, int i11, int i12) {
        p.j(spannable, "<this>");
        p.j(obj, "span");
        spannable.setSpan(obj, i11, i12, 33);
    }

    private static final void s(Spannable spannable, b.C0163b<u> bVar, e eVar, ArrayList<a> arrayList) {
        int f11 = bVar.f();
        int d11 = bVar.d();
        u e11 = bVar.e();
        g(spannable, e11.d(), f11, d11);
        i(spannable, e11.f(), f11, d11);
        h(spannable, e11.e(), f11, d11);
        u(spannable, e11.q(), f11, d11);
        l(spannable, e11.i(), eVar, f11, d11);
        k(spannable, e11.h(), f11, d11);
        m(spannable, e11.s(), f11, d11);
        p(spannable, e11.n(), f11, d11);
        f(spannable, e11.c(), f11, d11);
        q(spannable, e11.p(), f11, d11);
        MetricAffectingSpan a11 = a(e11.m(), eVar);
        if (a11 != null) {
            arrayList.add(new a(a11, f11, d11));
        }
    }

    public static final void t(Spannable spannable, c0 c0Var, List<b.C0163b<u>> list, e eVar, lp0.r<? super i, ? super v, ? super s, ? super u1.t, ? extends Typeface> rVar) {
        p.j(spannable, "<this>");
        p.j(c0Var, "contextTextStyle");
        p.j(list, "spanStyles");
        p.j(eVar, "density");
        p.j(rVar, "resolveTypeface");
        j(spannable, c0Var, list, rVar);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            b.C0163b bVar = list.get(i11);
            int f11 = bVar.f();
            int d11 = bVar.d();
            if (f11 >= 0 && f11 < spannable.length() && d11 > f11 && d11 <= spannable.length()) {
                s(spannable, bVar, eVar, arrayList);
            }
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            a aVar = (a) arrayList.get(i12);
            r(spannable, aVar.a(), aVar.b(), aVar.c());
        }
    }

    public static final void u(Spannable spannable, a2.e eVar, int i11, int i12) {
        p.j(spannable, "<this>");
        if (eVar != null) {
            e.a aVar = a2.e.f915b;
            r(spannable, new l(eVar.d(aVar.d()), eVar.d(aVar.b())), i11, i12);
        }
    }

    public static final void v(Spannable spannable, a2.j jVar, float f11, d2.e eVar) {
        float f12;
        p.j(spannable, "<this>");
        p.j(eVar, "density");
        if (jVar == null) {
            return;
        }
        if ((!r.e(jVar.b(), d2.s.f(0)) || !r.e(jVar.c(), d2.s.f(0))) && !d2.s.g(jVar.b()) && !d2.s.g(jVar.c())) {
            long g11 = r.g(jVar.b());
            t.a aVar = t.f14026b;
            float f13 = 0.0f;
            if (t.g(g11, aVar.b())) {
                f12 = eVar.m0(jVar.b());
            } else {
                f12 = t.g(g11, aVar.a()) ? r.h(jVar.b()) * f11 : 0.0f;
            }
            long g12 = r.g(jVar.c());
            if (t.g(g12, aVar.b())) {
                f13 = eVar.m0(jVar.c());
            } else if (t.g(g12, aVar.a())) {
                f13 = r.h(jVar.c()) * f11;
            }
            r(spannable, new LeadingMarginSpan.Standard((int) ((float) Math.ceil((double) f12)), (int) ((float) Math.ceil((double) f13))), 0, spannable.length());
        }
    }
}
