package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import f2.v;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import l2.f;
import lp0.l;

/* compiled from: ConstraintLayoutBaseScope.kt */
final class ConstraintLayoutBaseScope$createGuidelineFromStart$2 extends Lambda implements l<v, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f7934a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f7935b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConstraintLayoutBaseScope$createGuidelineFromStart$2(int i11, float f11) {
        super(1);
        this.f7934a = i11;
        this.f7935b = f11;
    }

    public final void a(v vVar) {
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        f t = vVar.t(Integer.valueOf(this.f7934a));
        float f11 = this.f7935b;
        if (vVar.w() == LayoutDirection.Ltr) {
            t.g(f11);
        } else {
            t.g(1.0f - f11);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((v) obj);
        return k.f22762a;
    }
}
