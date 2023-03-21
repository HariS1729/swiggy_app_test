package androidx.compose.foundation.lazy;

import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.newrelic.agent.android.agentdata.HexAttribute;
import e0.g;
import kotlin.jvm.internal.p;
import n1.b;
import n1.h;
import p0.d;
import w.k;
import wp0.j0;

/* compiled from: LazySemantics.kt */
public final class LazySemanticsKt {
    public static final d a(d dVar, k kVar, LazyListState lazyListState, j0 j0Var, boolean z11, boolean z12, boolean z13, g gVar, int i11) {
        d dVar2 = dVar;
        k kVar2 = kVar;
        LazyListState lazyListState2 = lazyListState;
        j0 j0Var2 = j0Var;
        boolean z14 = z11;
        g gVar2 = gVar;
        p.j(dVar2, "<this>");
        p.j(kVar2, "itemProvider");
        p.j(lazyListState2, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(j0Var2, "coroutineScope");
        gVar2.E(-1728067365);
        Object[] objArr = {kVar2, lazyListState2, Boolean.valueOf(z11), Boolean.valueOf(z12), Boolean.valueOf(z13)};
        gVar2.E(-568225417);
        boolean z15 = false;
        for (int i12 = 0; i12 < 5; i12++) {
            z15 |= gVar2.k(objArr[i12]);
        }
        Object F = gVar.F();
        if (z15 || F == g.f14172a.a()) {
            LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1 lazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1 = new LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1(kVar2);
            h hVar = new h(new LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$1(lazyListState2), new LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2(lazyListState2, kVar2), z12);
            LazySemanticsKt$lazyListSemantics$1$scrollByAction$1 lazySemanticsKt$lazyListSemantics$1$scrollByAction$1 = z13 ? new LazySemanticsKt$lazyListSemantics$1$scrollByAction$1(z14, j0Var2, lazyListState2) : null;
            LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1 lazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1 = z13 ? new LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1(lazyListState2, j0Var2) : null;
            int i13 = -1;
            int i14 = z14 ? -1 : 1;
            if (z14) {
                i13 = 1;
            }
            F = SemanticsModifierKt.c(d.f16037h0, false, new LazySemanticsKt$lazyListSemantics$1$1(lazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1, z11, hVar, lazySemanticsKt$lazyListSemantics$1$scrollByAction$1, lazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1, new b(i14, i13)), 1, (Object) null);
            gVar2.y(F);
        }
        gVar.P();
        d N = dVar2.N((d) F);
        gVar.P();
        return N;
    }
}
