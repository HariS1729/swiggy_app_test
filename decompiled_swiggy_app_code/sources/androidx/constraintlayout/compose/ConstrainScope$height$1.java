package androidx.constraintlayout.compose;

import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import f2.v;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ConstrainScope.kt */
final class ConstrainScope$height$1 extends Lambda implements l<v, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ConstrainScope f7921a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Dimension f7922b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConstrainScope$height$1(ConstrainScope constrainScope, Dimension dimension) {
        super(1);
        this.f7921a = constrainScope;
        this.f7922b = dimension;
    }

    public final void a(v vVar) {
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        vVar.c(this.f7921a.d()).D(((f2.k) this.f7922b).e(vVar));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((v) obj);
        return k.f22762a;
    }
}
