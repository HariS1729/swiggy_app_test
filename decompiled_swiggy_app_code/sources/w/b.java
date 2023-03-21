package w;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.newrelic.agent.android.agentdata.HexAttribute;
import e0.g;
import kotlin.jvm.internal.p;
import p0.d;

/* compiled from: LazyBeyondBoundsModifier.kt */
public final class b {
    public static final d b(d dVar, LazyListState lazyListState, e eVar, boolean z11, g gVar, int i11) {
        p.j(dVar, "<this>");
        p.j(lazyListState, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(eVar, "beyondBoundsInfo");
        gVar.E(1245943849);
        LayoutDirection layoutDirection = (LayoutDirection) gVar.z(CompositionLocalsKt.j());
        Object[] objArr = {lazyListState, eVar, Boolean.valueOf(z11), layoutDirection};
        gVar.E(-568225417);
        boolean z12 = false;
        for (int i12 = 0; i12 < 4; i12++) {
            z12 |= gVar.k(objArr[i12]);
        }
        Object F = gVar.F();
        if (z12 || F == g.f14172a.a()) {
            F = new f(lazyListState, eVar, z11, layoutDirection);
            gVar.y(F);
        }
        gVar.P();
        d N = dVar.N((d) F);
        gVar.P();
        return N;
    }

    /* access modifiers changed from: private */
    public static final Void c() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
    }
}
