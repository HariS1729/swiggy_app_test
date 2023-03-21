package androidx.compose.foundation.lazy;

import bp0.k;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import e0.g;
import java.util.List;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import lp0.r;
import w.c;
import w.h;
import x.b;
import x.i;

/* compiled from: LazyListScopeImpl.kt */
public final class LazyListScopeImpl implements c {

    /* renamed from: a  reason: collision with root package name */
    private final i<h> f4032a;

    /* renamed from: b  reason: collision with root package name */
    private final b<h> f4033b;

    /* renamed from: c  reason: collision with root package name */
    private List<Integer> f4034c;

    public LazyListScopeImpl() {
        i<h> iVar = new i<>();
        this.f4032a = iVar;
        this.f4033b = iVar;
    }

    public void a(Object obj, Object obj2, q<? super c, ? super g, ? super Integer, k> qVar) {
        p.j(qVar, "content");
        this.f4032a.c(1, new h(obj != null ? new LazyListScopeImpl$item$1(obj) : null, new LazyListScopeImpl$item$2(obj2), l0.b.c(-735119482, true, new LazyListScopeImpl$item$3(qVar))));
    }

    public void b(int i11, l<? super Integer, ? extends Object> lVar, l<? super Integer, ? extends Object> lVar2, r<? super c, ? super Integer, ? super g, ? super Integer, k> rVar) {
        p.j(lVar2, AnalyticsAttribute.CONTENT_TYPE_ATTRIBUTE);
        p.j(rVar, "itemContent");
        this.f4032a.c(i11, new h(lVar, lVar2, rVar));
    }

    public /* synthetic */ void c(int i11, l lVar, r rVar) {
        LazyListScope$CC.b(this, i11, lVar, rVar);
    }

    public /* synthetic */ void d(Object obj, q qVar) {
        LazyListScope$CC.a(this, obj, qVar);
    }

    public final List<Integer> e() {
        List<Integer> list = this.f4034c;
        return list == null ? k.j() : list;
    }

    public final b<h> f() {
        return this.f4033b;
    }
}
