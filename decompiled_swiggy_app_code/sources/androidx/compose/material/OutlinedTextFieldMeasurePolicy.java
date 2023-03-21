package androidx.compose.material;

import androidx.compose.ui.layout.LayoutIdKt;
import bp0.k;
import d2.b;
import d2.c;
import i1.e0;
import i1.i;
import i1.j;
import i1.r;
import i1.t;
import i1.u;
import i1.v;
import i1.w;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.p;
import lp0.l;
import t0.m;

/* compiled from: OutlinedTextField.kt */
final class OutlinedTextFieldMeasurePolicy implements t {

    /* renamed from: a  reason: collision with root package name */
    private final l<t0.l, k> f5187a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5188b;

    /* renamed from: c  reason: collision with root package name */
    private final float f5189c;

    public OutlinedTextFieldMeasurePolicy(l<? super t0.l, k> lVar, boolean z11, float f11) {
        p.j(lVar, "onLabelMeasured");
        this.f5187a = lVar;
        this.f5188b = z11;
        this.f5189c = f11;
    }

    private final int i(j jVar, List<? extends i> list, int i11, lp0.p<? super i, ? super Integer, Integer> pVar) {
        T t;
        T t11;
        int i12;
        T t12;
        int i13;
        T t13;
        int i14;
        int i15;
        for (T next : list) {
            if (p.e(TextFieldImplKt.g((i) next), "TextField")) {
                int intValue = pVar.invoke(next, Integer.valueOf(i11)).intValue();
                Iterator<T> it2 = list.iterator();
                while (true) {
                    t = null;
                    if (!it2.hasNext()) {
                        t11 = null;
                        break;
                    }
                    t11 = it2.next();
                    if (p.e(TextFieldImplKt.g((i) t11), "Label")) {
                        break;
                    }
                }
                i iVar = (i) t11;
                if (iVar == null) {
                    i12 = 0;
                } else {
                    i12 = pVar.invoke(iVar, Integer.valueOf(i11)).intValue();
                }
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        t12 = null;
                        break;
                    }
                    t12 = it3.next();
                    if (p.e(TextFieldImplKt.g((i) t12), "Trailing")) {
                        break;
                    }
                }
                i iVar2 = (i) t12;
                if (iVar2 == null) {
                    i13 = 0;
                } else {
                    i13 = pVar.invoke(iVar2, Integer.valueOf(i11)).intValue();
                }
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        t13 = null;
                        break;
                    }
                    t13 = it4.next();
                    if (p.e(TextFieldImplKt.g((i) t13), "Leading")) {
                        break;
                    }
                }
                i iVar3 = (i) t13;
                if (iVar3 == null) {
                    i14 = 0;
                } else {
                    i14 = pVar.invoke(iVar3, Integer.valueOf(i11)).intValue();
                }
                Iterator<T> it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    T next2 = it5.next();
                    if (p.e(TextFieldImplKt.g((i) next2), "Hint")) {
                        t = next2;
                        break;
                    }
                }
                i iVar4 = (i) t;
                if (iVar4 == null) {
                    i15 = 0;
                } else {
                    i15 = pVar.invoke(iVar4, Integer.valueOf(i11)).intValue();
                }
                return OutlinedTextFieldKt.m(i14, i13, intValue, i12, i15, TextFieldImplKt.i(), jVar.getDensity());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int j(List<? extends i> list, int i11, lp0.p<? super i, ? super Integer, Integer> pVar) {
        T t;
        T t11;
        int i12;
        T t12;
        int i13;
        T t13;
        int i14;
        int i15;
        for (T next : list) {
            if (p.e(TextFieldImplKt.g((i) next), "TextField")) {
                int intValue = pVar.invoke(next, Integer.valueOf(i11)).intValue();
                Iterator<T> it2 = list.iterator();
                while (true) {
                    t = null;
                    if (!it2.hasNext()) {
                        t11 = null;
                        break;
                    }
                    t11 = it2.next();
                    if (p.e(TextFieldImplKt.g((i) t11), "Label")) {
                        break;
                    }
                }
                i iVar = (i) t11;
                if (iVar == null) {
                    i12 = 0;
                } else {
                    i12 = pVar.invoke(iVar, Integer.valueOf(i11)).intValue();
                }
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        t12 = null;
                        break;
                    }
                    t12 = it3.next();
                    if (p.e(TextFieldImplKt.g((i) t12), "Trailing")) {
                        break;
                    }
                }
                i iVar2 = (i) t12;
                if (iVar2 == null) {
                    i13 = 0;
                } else {
                    i13 = pVar.invoke(iVar2, Integer.valueOf(i11)).intValue();
                }
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        t13 = null;
                        break;
                    }
                    t13 = it4.next();
                    if (p.e(TextFieldImplKt.g((i) t13), "Leading")) {
                        break;
                    }
                }
                i iVar3 = (i) t13;
                if (iVar3 == null) {
                    i14 = 0;
                } else {
                    i14 = pVar.invoke(iVar3, Integer.valueOf(i11)).intValue();
                }
                Iterator<T> it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    T next2 = it5.next();
                    if (p.e(TextFieldImplKt.g((i) next2), "Hint")) {
                        t = next2;
                        break;
                    }
                }
                i iVar4 = (i) t;
                if (iVar4 == null) {
                    i15 = 0;
                } else {
                    i15 = pVar.invoke(iVar4, Integer.valueOf(i11)).intValue();
                }
                return OutlinedTextFieldKt.n(i14, i13, intValue, i12, i15, TextFieldImplKt.i());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public int a(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        return i(jVar, list, i11, OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1.f5190a);
    }

    public int b(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        return i(jVar, list, i11, OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1.f5201a);
    }

    public int c(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        return j(list, i11, OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1.f5202a);
    }

    public u d(w wVar, List<? extends r> list, long j) {
        T t;
        e0 e0Var;
        T t11;
        e0 e0Var2;
        T t12;
        T t13;
        w wVar2 = wVar;
        p.j(wVar2, "$receiver");
        p.j(list, "measurables");
        int j02 = wVar2.j0(TextFieldImplKt.h());
        long e11 = b.e(j, 0, 0, 0, 0, 10, (Object) null);
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (p.e(LayoutIdKt.a((r) t), "Leading")) {
                break;
            }
        }
        r rVar = (r) t;
        if (rVar == null) {
            e0Var = null;
        } else {
            e0Var = rVar.N(e11);
        }
        int i11 = 0;
        int k = TextFieldImplKt.k(e0Var) + 0;
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                t11 = null;
                break;
            }
            t11 = it3.next();
            if (p.e(LayoutIdKt.a((r) t11), "Trailing")) {
                break;
            }
        }
        r rVar2 = (r) t11;
        if (rVar2 == null) {
            e0Var2 = null;
        } else {
            e0Var2 = rVar2.N(c.j(e11, -k, 0, 2, (Object) null));
        }
        int i12 = -(k + TextFieldImplKt.k(e0Var2));
        int i13 = -j02;
        long i14 = c.i(e11, i12, i13);
        Iterator<T> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                t12 = null;
                break;
            }
            t12 = it4.next();
            if (p.e(LayoutIdKt.a((r) t12), "Label")) {
                break;
            }
        }
        r rVar3 = (r) t12;
        e0 N = rVar3 == null ? null : rVar3.N(i14);
        if (N != null) {
            g().invoke(t0.l.c(m.a((float) N.A0(), (float) N.e0())));
        }
        long e12 = b.e(c.i(j, i12, i13 - Math.max(TextFieldImplKt.j(N) / 2, j02)), 0, 0, 0, 0, 11, (Object) null);
        for (r rVar4 : list) {
            if (p.e(LayoutIdKt.a(rVar4), "TextField")) {
                e0 N2 = rVar4.N(e12);
                long e13 = b.e(e12, 0, 0, 0, 0, 14, (Object) null);
                Iterator<T> it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        t13 = null;
                        break;
                    }
                    t13 = it5.next();
                    if (p.e(LayoutIdKt.a((r) t13), "Hint")) {
                        break;
                    }
                }
                r rVar5 = (r) t13;
                e0 N3 = rVar5 == null ? null : rVar5.N(e13);
                long j11 = j;
                int j12 = OutlinedTextFieldKt.n(TextFieldImplKt.k(e0Var), TextFieldImplKt.k(e0Var2), N2.A0(), TextFieldImplKt.k(N), TextFieldImplKt.k(N3), j11);
                int i15 = OutlinedTextFieldKt.m(TextFieldImplKt.j(e0Var), TextFieldImplKt.j(e0Var2), N2.e0(), TextFieldImplKt.j(N), TextFieldImplKt.j(N3), j11, wVar.getDensity());
                for (r rVar6 : list) {
                    if (p.e(LayoutIdKt.a(rVar6), "border")) {
                        int i16 = j12 != Integer.MAX_VALUE ? j12 : 0;
                        if (i15 != Integer.MAX_VALUE) {
                            i11 = i15;
                        }
                        return v.b(wVar, j12, i15, (Map) null, new OutlinedTextFieldMeasurePolicy$measure$2(i15, j12, e0Var, e0Var2, N2, N, N3, rVar6.N(c.a(i16, j12, i11, i15)), this, wVar), 4, (Object) null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public int e(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        return j(list, i11, OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1.f5191a);
    }

    public final float f() {
        return this.f5189c;
    }

    public final l<t0.l, k> g() {
        return this.f5187a;
    }

    public final boolean h() {
        return this.f5188b;
    }
}
