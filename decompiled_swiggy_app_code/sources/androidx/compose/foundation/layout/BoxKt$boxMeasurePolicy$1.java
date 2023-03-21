package androidx.compose.foundation.layout;

import d2.b;
import d2.c;
import i1.e0;
import i1.j;
import i1.r;
import i1.s;
import i1.t;
import i1.u;
import i1.v;
import i1.w;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.p;
import p0.a;

/* compiled from: Box.kt */
final class BoxKt$boxMeasurePolicy$1 implements t {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f3683a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f3684b;

    BoxKt$boxMeasurePolicy$1(boolean z11, a aVar) {
        this.f3683a = z11;
        this.f3684b = aVar;
    }

    public /* synthetic */ int a(j jVar, List list, int i11) {
        return s.a(this, jVar, list, i11);
    }

    public /* synthetic */ int b(j jVar, List list, int i11) {
        return s.c(this, jVar, list, i11);
    }

    public /* synthetic */ int c(j jVar, List list, int i11) {
        return s.d(this, jVar, list, i11);
    }

    public final u d(w wVar, List<? extends r> list, long j) {
        long j11;
        int i11;
        e0 e0Var;
        int i12;
        List<? extends r> list2 = list;
        p.j(wVar, "$this$MeasurePolicy");
        p.j(list2, "measurables");
        if (list.isEmpty()) {
            return v.b(wVar, b.p(j), b.o(j), (Map) null, BoxKt$boxMeasurePolicy$1$measure$1.f3685a, 4, (Object) null);
        }
        if (this.f3683a) {
            j11 = j;
        } else {
            j11 = b.e(j, 0, 0, 0, 0, 10, (Object) null);
        }
        if (list.size() == 1) {
            r rVar = (r) list2.get(0);
            if (!BoxKt.f(rVar)) {
                e0 N = rVar.N(j11);
                int max = Math.max(b.p(j), N.A0());
                i11 = Math.max(b.o(j), N.e0());
                e0Var = N;
                i12 = max;
            } else {
                i12 = b.p(j);
                int o11 = b.o(j);
                e0Var = rVar.N(b.f13990b.c(b.p(j), b.o(j)));
                i11 = o11;
            }
            return v.b(wVar, i12, i11, (Map) null, new BoxKt$boxMeasurePolicy$1$measure$2(e0Var, rVar, wVar, i12, i11, this.f3684b), 4, (Object) null);
        }
        e0[] e0VarArr = new e0[list.size()];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f25664a = b.p(j);
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.f25664a = b.o(j);
        int size = list.size();
        boolean z11 = false;
        for (int i13 = 0; i13 < size; i13++) {
            r rVar2 = (r) list2.get(i13);
            if (!BoxKt.f(rVar2)) {
                e0 N2 = rVar2.N(j11);
                e0VarArr[i13] = N2;
                ref$IntRef.f25664a = Math.max(ref$IntRef.f25664a, N2.A0());
                ref$IntRef2.f25664a = Math.max(ref$IntRef2.f25664a, N2.e0());
            } else {
                z11 = true;
            }
        }
        if (z11) {
            int i14 = ref$IntRef.f25664a;
            int i15 = i14 != Integer.MAX_VALUE ? i14 : 0;
            int i16 = ref$IntRef2.f25664a;
            long a11 = c.a(i15, i14, i16 != Integer.MAX_VALUE ? i16 : 0, i16);
            int size2 = list.size();
            for (int i17 = 0; i17 < size2; i17++) {
                r rVar3 = (r) list2.get(i17);
                if (BoxKt.f(rVar3)) {
                    e0VarArr[i17] = rVar3.N(a11);
                }
            }
        }
        return v.b(wVar, ref$IntRef.f25664a, ref$IntRef2.f25664a, (Map) null, new BoxKt$boxMeasurePolicy$1$measure$5(e0VarArr, list, wVar, ref$IntRef, ref$IntRef2, this.f3684b), 4, (Object) null);
    }

    public /* synthetic */ int e(j jVar, List list, int i11) {
        return s.b(this, jVar, list, i11);
    }
}
