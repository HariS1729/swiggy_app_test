package androidx.constraintlayout.compose;

import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import f2.v;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ConstrainScope.kt */
final class ConstrainScope$width$1 extends Lambda implements l<v, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ConstrainScope f7923a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Dimension f7924b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConstrainScope$width$1(ConstrainScope constrainScope, Dimension dimension) {
        super(1);
        this.f7923a = constrainScope;
        this.f7924b = dimension;
    }

    public final void a(v vVar) {
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        vVar.c(this.f7923a.d()).q0(((f2.k) this.f7924b).e(vVar));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((v) obj);
        return k.f22762a;
    }
}
