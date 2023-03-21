package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import d2.b;
import d2.h;
import i1.a;
import i1.e0;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p0.d;

/* compiled from: AlignmentLine.kt */
public final class AlignmentLineKt {
    /* access modifiers changed from: private */
    public static final u c(w wVar, a aVar, float f11, float f12, r rVar, long j) {
        long j11;
        int i11;
        int i12;
        w wVar2 = wVar;
        float f13 = f11;
        float f14 = f12;
        if (d(aVar)) {
            j11 = b.e(j, 0, 0, 0, 0, 11, (Object) null);
        } else {
            j11 = b.e(j, 0, 0, 0, 0, 14, (Object) null);
        }
        e0 N = rVar.N(j11);
        a aVar2 = aVar;
        int A = N.A(aVar);
        if (A == Integer.MIN_VALUE) {
            A = 0;
        }
        int e02 = d(aVar) ? N.e0() : N.A0();
        int m11 = d(aVar) ? b.m(j) : b.n(j);
        h.a aVar3 = h.f13997b;
        int i13 = m11 - e02;
        int m12 = l.m((!h.p(f13, aVar3.c()) ? wVar.j0(f13) : 0) - A, 0, i13);
        int m13 = l.m(((!h.p(f14, aVar3.c()) ? wVar.j0(f14) : 0) - e02) + A, 0, i13 - m12);
        if (d(aVar)) {
            i11 = N.A0();
        } else {
            i11 = Math.max(N.A0() + m12 + m13, b.p(j));
        }
        int i14 = i11;
        if (d(aVar)) {
            i12 = Math.max(N.e0() + m12 + m13, b.o(j));
        } else {
            i12 = N.e0();
        }
        int i15 = i12;
        return v.b(wVar, i14, i15, (Map) null, new AlignmentLineKt$alignmentLineOffsetMeasure$1(aVar, f11, m12, i14, m13, N, i15), 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final boolean d(a aVar) {
        return aVar instanceof i1.h;
    }

    public static final d e(d dVar, a aVar, float f11, float f12) {
        p.j(dVar, "$this$paddingFrom");
        p.j(aVar, "alignmentLine");
        return dVar.N(new a(aVar, f11, f12, InspectableValueKt.c() ? new AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1(aVar, f11, f12) : InspectableValueKt.a(), (i) null));
    }

    public static /* synthetic */ d f(d dVar, a aVar, float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = h.f13997b.c();
        }
        if ((i11 & 4) != 0) {
            f12 = h.f13997b.c();
        }
        return e(dVar, aVar, f11, f12);
    }

    public static final d g(d dVar, float f11, float f12) {
        d dVar2;
        d dVar3;
        p.j(dVar, "$this$paddingFromBaseline");
        h.a aVar = h.f13997b;
        if (!h.p(f12, aVar.c())) {
            dVar2 = f(dVar, androidx.compose.ui.layout.AlignmentLineKt.b(), 0.0f, f12, 2, (Object) null);
        } else {
            dVar2 = d.f16037h0;
        }
        d N = dVar.N(dVar2);
        if (!h.p(f11, aVar.c())) {
            dVar3 = f(dVar, androidx.compose.ui.layout.AlignmentLineKt.a(), f11, 0.0f, 4, (Object) null);
        } else {
            dVar3 = d.f16037h0;
        }
        return N.N(dVar3);
    }
}
