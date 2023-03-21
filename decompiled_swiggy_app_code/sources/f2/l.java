package f2;

import androidx.constraintlayout.compose.e;
import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import f2.g;
import i1.r;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: DslConstraintSet.kt */
public final class l implements g {

    /* renamed from: a  reason: collision with root package name */
    private final lp0.l<e, k> f14582a;

    /* renamed from: b  reason: collision with root package name */
    private final e f14583b;

    public l(lp0.l<? super e, k> lVar, e eVar) {
        p.j(lVar, "description");
        this.f14582a = lVar;
        this.f14583b = eVar;
    }

    public void a(v vVar, List<? extends r> list) {
        g.a.a(this, vVar, list);
    }

    public void c(v vVar) {
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        e eVar = new e();
        this.f14582a.invoke(eVar);
        eVar.a(vVar);
    }

    public boolean d(List<? extends r> list) {
        return g.a.b(this, list);
    }

    public e e() {
        return this.f14583b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(lp0.l lVar, e eVar, int i11, i iVar) {
        this(lVar, (i11 & 2) != 0 ? null : eVar);
    }
}
