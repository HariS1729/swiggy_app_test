package androidx.compose.foundation.layout;

import d2.b;
import i1.j;
import i1.r;
import i1.s;
import i1.t;
import i1.u;
import i1.v;
import i1.w;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: Spacer.kt */
final class SpacerMeasurePolicy implements t {

    /* renamed from: a  reason: collision with root package name */
    public static final SpacerMeasurePolicy f3855a = new SpacerMeasurePolicy();

    private SpacerMeasurePolicy() {
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

    public u d(w wVar, List<? extends r> list, long j) {
        p.j(wVar, "$this$measure");
        p.j(list, "measurables");
        return v.b(wVar, b.l(j) ? b.n(j) : 0, b.k(j) ? b.m(j) : 0, (Map) null, SpacerMeasurePolicy$measure$1$1.f3856a, 4, (Object) null);
    }

    public /* synthetic */ int e(j jVar, List list, int i11) {
        return s.b(this, jVar, list, i11);
    }
}
