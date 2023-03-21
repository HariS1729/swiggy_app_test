package w;

import androidx.compose.foundation.lazy.LazyListState;
import com.newrelic.agent.android.agentdata.HexAttribute;
import e0.g;
import f0.e;
import kotlin.jvm.internal.p;
import p0.d;

/* compiled from: LazyListPinningModifier.kt */
public final class o {
    public static final d a(d dVar, LazyListState lazyListState, e eVar, g gVar, int i11) {
        p.j(dVar, "<this>");
        p.j(lazyListState, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(eVar, "beyondBoundsInfo");
        gVar.E(854917725);
        int i12 = e.f14468d;
        gVar.E(511388516);
        boolean k = gVar.k(lazyListState) | gVar.k(eVar);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = new n(lazyListState, eVar);
            gVar.y(F);
        }
        gVar.P();
        d N = dVar.N((d) F);
        gVar.P();
        return N;
    }
}
