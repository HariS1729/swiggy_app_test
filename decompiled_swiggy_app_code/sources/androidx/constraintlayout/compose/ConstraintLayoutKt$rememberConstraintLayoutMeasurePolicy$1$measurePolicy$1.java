package androidx.constraintlayout.compose;

import e0.h0;
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
final class ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1 implements t {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Measurer f7937a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ConstraintSetForInlineDsl f7938b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f7939c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ h0<Boolean> f7940d;

    ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1(Measurer measurer, ConstraintSetForInlineDsl constraintSetForInlineDsl, int i11, h0<Boolean> h0Var) {
        this.f7937a = measurer;
        this.f7938b = constraintSetForInlineDsl;
        this.f7939c = i11;
        this.f7940d = h0Var;
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
        long v = this.f7937a.v(j, wVar.getLayoutDirection(), this.f7938b, list, this.f7939c, wVar);
        this.f7940d.getValue();
        return v.b(wVar, d2.p.g(v), d2.p.f(v), (Map) null, new ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1$measure$1(this.f7937a, list), 4, (Object) null);
    }

    public int e(j jVar, List<? extends i> list, int i11) {
        return t.a.b(this, jVar, list, i11);
    }
}
