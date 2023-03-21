package w;

import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: LazyListHeaders.kt */
public final class g {
    public static final q a(List<q> list, t tVar, List<Integer> list2, int i11, int i12, int i13) {
        List<q> list3 = list;
        t tVar2 = tVar;
        List<Integer> list4 = list2;
        int i14 = i11;
        p.j(list, "composedVisibleItems");
        p.j(tVar2, "itemProvider");
        p.j(list4, "headerIndexes");
        int index = ((q) s.W(list)).getIndex();
        int size = list2.size();
        int i15 = 0;
        int i16 = -1;
        int i17 = -1;
        while (i15 < size && list4.get(i15).intValue() <= index) {
            i16 = list4.get(i15).intValue();
            i15++;
            i17 = ((i15 < 0 || i15 > k.l(list2)) ? -1 : list4.get(i15)).intValue();
        }
        int size2 = list.size();
        int i18 = Integer.MIN_VALUE;
        int i19 = Integer.MIN_VALUE;
        int i21 = -1;
        for (int i22 = 0; i22 < size2; i22++) {
            q qVar = list.get(i22);
            if (qVar.getIndex() == i16) {
                i18 = qVar.f();
                i21 = i22;
            } else if (qVar.getIndex() == i17) {
                i19 = qVar.f();
            }
        }
        if (i16 == -1) {
            return null;
        }
        s a11 = tVar2.a(a.b(i16));
        int max = i18 != Integer.MIN_VALUE ? Math.max(-i14, i18) : -i14;
        if (i19 != Integer.MIN_VALUE) {
            max = Math.min(max, i19 - a11.d());
        }
        q f11 = a11.f(max, i12, i13);
        if (i21 != -1) {
            list.set(i21, f11);
        } else {
            list.add(0, f11);
        }
        return f11;
    }
}
