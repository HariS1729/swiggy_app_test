package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.b;
import com.newrelic.agent.android.agentdata.HexAttribute;
import d2.h;
import f2.v;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ConstraintLayout.kt */
final class Dimension$Companion$value$1 extends Lambda implements l<v, b> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f7973a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Dimension$Companion$value$1(float f11) {
        super(1);
        this.f7973a = f11;
    }

    /* renamed from: a */
    public final b invoke(v vVar) {
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        b a11 = b.a(vVar.d(h.k(this.f7973a)));
        p.i(a11, "Fixed(state.convertDimension(dp))");
        return a11;
    }
}
