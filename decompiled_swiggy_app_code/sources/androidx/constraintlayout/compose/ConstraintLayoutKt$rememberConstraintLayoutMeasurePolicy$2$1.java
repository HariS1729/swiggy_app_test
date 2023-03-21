package androidx.constraintlayout.compose;

import f2.e;
import i1.i;
import i1.j;
import i1.r;
import i1.t;
import i1.u;
import i1.v;
import i1.w;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: ConstraintLayout.kt */
final class ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$2$1 implements t {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Measurer f7945a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f7946b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f7947c;

    ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$2$1(Measurer measurer, e eVar, int i11) {
        this.f7945a = measurer;
        this.f7946b = eVar;
        this.f7947c = i11;
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
        p.j(wVar, "$this$MeasurePolicy");
        p.j(list, "measurables");
        long v = this.f7945a.v(j, wVar.getLayoutDirection(), this.f7946b, list, this.f7947c, wVar);
        return v.b(wVar, d2.p.g(v), d2.p.f(v), (Map) null, new ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$2$1$measure$1(this.f7945a, list), 4, (Object) null);
    }

    public int e(j jVar, List<? extends i> list, int i11) {
        return t.a.b(this, jVar, list, i11);
    }
}
