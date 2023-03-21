package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
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
import lp0.p;

/* compiled from: TextField.kt */
final class TextFieldMeasurePolicy implements t {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5696a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final float f5697b;

    public TextFieldMeasurePolicy(boolean z11, float f11) {
        this.f5696a = z11;
        this.f5697b = f11;
    }

    private final int h(j jVar, List<? extends i> list, int i11, p<? super i, ? super Integer, Integer> pVar) {
        T t;
        T t11;
        int i12;
        T t12;
        int i13;
        T t13;
        int i14;
        int i15;
        for (T next : list) {
            if (kotlin.jvm.internal.p.e(TextFieldImplKt.g((i) next), "TextField")) {
                int intValue = pVar.invoke(next, Integer.valueOf(i11)).intValue();
                Iterator<T> it2 = list.iterator();
                while (true) {
                    t = null;
                    if (!it2.hasNext()) {
                        t11 = null;
                        break;
                    }
                    t11 = it2.next();
                    if (kotlin.jvm.internal.p.e(TextFieldImplKt.g((i) t11), "Label")) {
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
                    if (kotlin.jvm.internal.p.e(TextFieldImplKt.g((i) t12), "Trailing")) {
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
                    if (kotlin.jvm.internal.p.e(TextFieldImplKt.g((i) t13), "Leading")) {
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
                    if (kotlin.jvm.internal.p.e(TextFieldImplKt.g((i) next2), "Hint")) {
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
                return TextFieldKt.p(intValue, i12 > 0, i12, i14, i13, i15, TextFieldImplKt.i(), jVar.getDensity());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int i(List<? extends i> list, int i11, p<? super i, ? super Integer, Integer> pVar) {
        T t;
        T t11;
        int i12;
        T t12;
        int i13;
        T t13;
        int i14;
        int i15;
        for (T next : list) {
            if (kotlin.jvm.internal.p.e(TextFieldImplKt.g((i) next), "TextField")) {
                int intValue = pVar.invoke(next, Integer.valueOf(i11)).intValue();
                Iterator<T> it2 = list.iterator();
                while (true) {
                    t = null;
                    if (!it2.hasNext()) {
                        t11 = null;
                        break;
                    }
                    t11 = it2.next();
                    if (kotlin.jvm.internal.p.e(TextFieldImplKt.g((i) t11), "Label")) {
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
                    if (kotlin.jvm.internal.p.e(TextFieldImplKt.g((i) t12), "Trailing")) {
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
                    if (kotlin.jvm.internal.p.e(TextFieldImplKt.g((i) t13), "Leading")) {
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
                    if (kotlin.jvm.internal.p.e(TextFieldImplKt.g((i) next2), "Hint")) {
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
                return TextFieldKt.q(i14, i13, intValue, i12, i15, TextFieldImplKt.i());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public int a(j jVar, List<? extends i> list, int i11) {
        kotlin.jvm.internal.p.j(jVar, "<this>");
        kotlin.jvm.internal.p.j(list, "measurables");
        return h(jVar, list, i11, TextFieldMeasurePolicy$maxIntrinsicHeight$1.f5698a);
    }

    public int b(j jVar, List<? extends i> list, int i11) {
        kotlin.jvm.internal.p.j(jVar, "<this>");
        kotlin.jvm.internal.p.j(list, "measurables");
        return h(jVar, list, i11, TextFieldMeasurePolicy$minIntrinsicHeight$1.f5711a);
    }

    public int c(j jVar, List<? extends i> list, int i11) {
        kotlin.jvm.internal.p.j(jVar, "<this>");
        kotlin.jvm.internal.p.j(list, "measurables");
        return i(list, i11, TextFieldMeasurePolicy$minIntrinsicWidth$1.f5712a);
    }

    public u d(w wVar, List<? extends r> list, long j) {
        T t;
        T t11;
        e0 e0Var;
        T t12;
        int i11;
        T t13;
        e0 e0Var2;
        w wVar2 = wVar;
        kotlin.jvm.internal.p.j(wVar2, "$receiver");
        kotlin.jvm.internal.p.j(list, "measurables");
        int j02 = wVar2.j0(TextFieldImplKt.h());
        int j03 = wVar2.j0(TextFieldKt.f5618a);
        int j04 = wVar2.j0(TextFieldKt.f5619b);
        int j05 = wVar2.j0(TextFieldKt.f5620c);
        long e11 = b.e(j, 0, 0, 0, 0, 10, (Object) null);
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (kotlin.jvm.internal.p.e(LayoutIdKt.a((r) t), "Leading")) {
                break;
            }
        }
        r rVar = (r) t;
        e0 N = rVar == null ? null : rVar.N(e11);
        int k = TextFieldImplKt.k(N) + 0;
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                t11 = null;
                break;
            }
            t11 = it3.next();
            if (kotlin.jvm.internal.p.e(LayoutIdKt.a((r) t11), "Trailing")) {
                break;
            }
        }
        r rVar2 = (r) t11;
        if (rVar2 == null) {
            e0Var = null;
        } else {
            e0Var = rVar2.N(c.j(e11, -k, 0, 2, (Object) null));
        }
        int i12 = -j04;
        int i13 = -(k + TextFieldImplKt.k(e0Var));
        long i14 = c.i(e11, i13, i12);
        Iterator<T> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                t12 = null;
                break;
            }
            t12 = it4.next();
            if (kotlin.jvm.internal.p.e(LayoutIdKt.a((r) t12), "Label")) {
                break;
            }
        }
        r rVar3 = (r) t12;
        e0 N2 = rVar3 == null ? null : rVar3.N(i14);
        if (N2 == null) {
            i11 = 0;
        } else {
            i11 = N2.A(AlignmentLineKt.b());
            if (i11 == Integer.MIN_VALUE) {
                i11 = N2.e0();
            }
        }
        int max = Math.max(i11, j03);
        long i15 = c.i(b.e(j, 0, 0, 0, 0, 11, (Object) null), i13, N2 != null ? (i12 - j05) - max : (-j02) * 2);
        for (r rVar4 : list) {
            if (kotlin.jvm.internal.p.e(LayoutIdKt.a(rVar4), "TextField")) {
                e0 N3 = rVar4.N(i15);
                long e12 = b.e(i15, 0, 0, 0, 0, 14, (Object) null);
                Iterator<T> it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        t13 = null;
                        break;
                    }
                    t13 = it5.next();
                    if (kotlin.jvm.internal.p.e(LayoutIdKt.a((r) t13), "Hint")) {
                        break;
                    }
                }
                r rVar5 = (r) t13;
                if (rVar5 == null) {
                    e0Var2 = null;
                } else {
                    e0Var2 = rVar5.N(e12);
                }
                int j11 = TextFieldKt.q(TextFieldImplKt.k(N), TextFieldImplKt.k(e0Var), N3.A0(), TextFieldImplKt.k(N2), TextFieldImplKt.k(e0Var2), j);
                int i16 = TextFieldKt.p(N3.e0(), N2 != null, max, TextFieldImplKt.j(N), TextFieldImplKt.j(e0Var), TextFieldImplKt.j(e0Var2), j, wVar.getDensity());
                return v.b(wVar, j11, i16, (Map) null, new TextFieldMeasurePolicy$measure$1(N2, j03, i11, j11, i16, N3, e0Var2, N, e0Var, this, max, j05, wVar), 4, (Object) null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public int e(j jVar, List<? extends i> list, int i11) {
        kotlin.jvm.internal.p.j(jVar, "<this>");
        kotlin.jvm.internal.p.j(list, "measurables");
        return i(list, i11, TextFieldMeasurePolicy$maxIntrinsicWidth$1.f5699a);
    }
}
