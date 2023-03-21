package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import d2.b;
import d2.c;
import i1.e0;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: RootMeasurePolicy.kt */
public final class RootMeasurePolicy extends LayoutNode.e {

    /* renamed from: b  reason: collision with root package name */
    public static final RootMeasurePolicy f6770b = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    public u d(w wVar, List<? extends r> list, long j) {
        p.j(wVar, "$this$measure");
        p.j(list, "measurables");
        if (list.isEmpty()) {
            return v.b(wVar, b.p(j), b.o(j), (Map) null, RootMeasurePolicy$measure$1.f6771a, 4, (Object) null);
        }
        if (list.size() == 1) {
            e0 N = ((r) list.get(0)).N(j);
            return v.b(wVar, c.g(j, N.A0()), c.f(j, N.e0()), (Map) null, new RootMeasurePolicy$measure$2(N), 4, (Object) null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((r) list.get(i11)).N(j));
        }
        int size2 = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size2; i14++) {
            e0 e0Var = (e0) arrayList.get(i14);
            i12 = Math.max(e0Var.A0(), i12);
            i13 = Math.max(e0Var.e0(), i13);
        }
        return v.b(wVar, c.g(j, i12), c.f(j, i13), (Map) null, new RootMeasurePolicy$measure$4(arrayList), 4, (Object) null);
    }
}
