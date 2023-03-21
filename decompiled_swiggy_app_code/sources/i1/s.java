package i1;

import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import d2.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: MeasurePolicy.kt */
public final /* synthetic */ class s {
    public static int a(t tVar, j jVar, List list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new e((i) list.get(i12), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return tVar.d(new k(jVar, jVar.getLayoutDirection()), arrayList, c.b(0, i11, 0, 0, 13, (Object) null)).getHeight();
    }

    public static int b(t tVar, j jVar, List list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new e((i) list.get(i12), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return tVar.d(new k(jVar, jVar.getLayoutDirection()), arrayList, c.b(0, 0, 0, i11, 7, (Object) null)).getWidth();
    }

    public static int c(t tVar, j jVar, List list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new e((i) list.get(i12), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return tVar.d(new k(jVar, jVar.getLayoutDirection()), arrayList, c.b(0, i11, 0, 0, 13, (Object) null)).getHeight();
    }

    public static int d(t tVar, j jVar, List list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new e((i) list.get(i12), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return tVar.d(new k(jVar, jVar.getLayoutDirection()), arrayList, c.b(0, 0, 0, i11, 7, (Object) null)).getWidth();
    }
}
