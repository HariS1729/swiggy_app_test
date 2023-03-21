package androidx.compose.ui;

import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.n0;
import bp0.k;
import e0.g;
import lp0.l;
import lp0.q;
import p0.d;
import s0.c;
import s0.p;

/* compiled from: ComposedModifier.kt */
public final class ComposedModifierKt {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final q<c, g, Integer, d> f6314a = ComposedModifierKt$WrapFocusEventModifier$1.f6316a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final q<p, g, Integer, d> f6315b = ComposedModifierKt$WrapFocusRequesterModifier$1.f6318a;

    public static final d c(d dVar, l<? super n0, k> lVar, q<? super d, ? super g, ? super Integer, ? extends d> qVar) {
        kotlin.jvm.internal.p.j(dVar, "<this>");
        kotlin.jvm.internal.p.j(lVar, "inspectorInfo");
        kotlin.jvm.internal.p.j(qVar, "factory");
        return dVar.N(new a(lVar, qVar));
    }

    public static /* synthetic */ d d(d dVar, l<n0, k> lVar, q qVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = InspectableValueKt.a();
        }
        return c(dVar, lVar, qVar);
    }

    public static final d e(g gVar, d dVar) {
        kotlin.jvm.internal.p.j(gVar, "<this>");
        kotlin.jvm.internal.p.j(dVar, "modifier");
        if (dVar.x(ComposedModifierKt$materialize$1.f6319a)) {
            return dVar;
        }
        gVar.E(1219399079);
        d dVar2 = (d) dVar.s(d.f16037h0, new ComposedModifierKt$materialize$result$1(gVar));
        gVar.P();
        return dVar2;
    }
}
