package androidx.compose.material;

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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.p;

/* compiled from: AlertDialog.kt */
final class AlertDialogKt$AlertDialogFlowRow$1 implements t {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f4837a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f4838b;

    AlertDialogKt$AlertDialogFlowRow$1(float f11, float f12) {
        this.f4837a = f11;
        this.f4838b = f12;
    }

    private static final boolean f(List<e0> list, Ref$IntRef ref$IntRef, w wVar, float f11, long j, e0 e0Var) {
        return list.isEmpty() || (ref$IntRef.f25664a + wVar.j0(f11)) + e0Var.A0() <= b.n(j);
    }

    private static final void g(List<List<e0>> list, Ref$IntRef ref$IntRef, w wVar, float f11, List<e0> list2, List<Integer> list3, Ref$IntRef ref$IntRef2, List<Integer> list4, Ref$IntRef ref$IntRef3, Ref$IntRef ref$IntRef4) {
        if (!list.isEmpty()) {
            ref$IntRef.f25664a += wVar.j0(f11);
        }
        list.add(s.E0(list2));
        list3.add(Integer.valueOf(ref$IntRef2.f25664a));
        list4.add(Integer.valueOf(ref$IntRef.f25664a));
        ref$IntRef.f25664a += ref$IntRef2.f25664a;
        ref$IntRef3.f25664a = Math.max(ref$IntRef3.f25664a, ref$IntRef4.f25664a);
        list2.clear();
        ref$IntRef4.f25664a = 0;
        ref$IntRef2.f25664a = 0;
    }

    public int a(j jVar, List<? extends i> list, int i11) {
        return t.a.a(this, jVar, list, i11);
    }

    public int b(j jVar, List<? extends i> list, int i11) {
        return t.a.c(this, jVar, list, i11);
    }

    public int c(j jVar, List<? extends i> list, int i11) {
        return t.a.d(this, jVar, list, i11);
    }

    public final u d(w wVar, List<? extends r> list, long j) {
        int i11;
        Ref$IntRef ref$IntRef;
        ArrayList arrayList;
        Ref$IntRef ref$IntRef2;
        w wVar2 = wVar;
        p.j(wVar2, "$this$Layout");
        p.j(list, "measurables");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Ref$IntRef ref$IntRef3 = new Ref$IntRef();
        Ref$IntRef ref$IntRef4 = new Ref$IntRef();
        ArrayList arrayList5 = new ArrayList();
        Ref$IntRef ref$IntRef5 = new Ref$IntRef();
        Ref$IntRef ref$IntRef6 = new Ref$IntRef();
        long b11 = c.b(0, b.n(j), 0, 0, 13, (Object) null);
        for (r N : list) {
            e0 N2 = N.N(b11);
            long j11 = b11;
            Ref$IntRef ref$IntRef7 = ref$IntRef6;
            if (!f(arrayList5, ref$IntRef5, wVar, this.f4837a, j, N2)) {
                ref$IntRef2 = ref$IntRef5;
                arrayList = arrayList5;
                ref$IntRef = ref$IntRef4;
                g(arrayList2, ref$IntRef4, wVar, this.f4838b, arrayList5, arrayList3, ref$IntRef7, arrayList4, ref$IntRef3, ref$IntRef2);
            } else {
                ref$IntRef2 = ref$IntRef5;
                arrayList = arrayList5;
                ref$IntRef = ref$IntRef4;
            }
            Ref$IntRef ref$IntRef8 = ref$IntRef2;
            if (!arrayList.isEmpty()) {
                ref$IntRef8.f25664a += wVar2.j0(this.f4837a);
            }
            e0 e0Var = N2;
            ArrayList arrayList6 = arrayList;
            arrayList6.add(e0Var);
            ref$IntRef8.f25664a += e0Var.A0();
            ref$IntRef6 = ref$IntRef7;
            ref$IntRef6.f25664a = Math.max(ref$IntRef6.f25664a, e0Var.e0());
            arrayList5 = arrayList6;
            ref$IntRef5 = ref$IntRef8;
            b11 = j11;
            ref$IntRef4 = ref$IntRef;
        }
        ArrayList arrayList7 = arrayList5;
        Ref$IntRef ref$IntRef9 = ref$IntRef4;
        Ref$IntRef ref$IntRef10 = ref$IntRef5;
        if (!arrayList7.isEmpty()) {
            g(arrayList2, ref$IntRef9, wVar, this.f4838b, arrayList7, arrayList3, ref$IntRef6, arrayList4, ref$IntRef3, ref$IntRef10);
        }
        if (b.n(j) != Integer.MAX_VALUE) {
            i11 = b.n(j);
        } else {
            i11 = Math.max(ref$IntRef3.f25664a, b.p(j));
        }
        int i12 = i11;
        return v.b(wVar, i12, Math.max(ref$IntRef9.f25664a, b.o(j)), (Map) null, new AlertDialogKt$AlertDialogFlowRow$1$measure$1(arrayList2, wVar, this.f4837a, i12, arrayList4), 4, (Object) null);
    }

    public int e(j jVar, List<? extends i> list, int i11) {
        return t.a.b(this, jVar, list, i11);
    }
}
