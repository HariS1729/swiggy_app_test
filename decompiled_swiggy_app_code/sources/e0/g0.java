package e0;

import androidx.compose.runtime.RecomposeScopeImpl;
import f0.c;
import g0.g;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.p;

/* compiled from: Composer.kt */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final e0<Object> f14175a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f14176b;

    /* renamed from: c  reason: collision with root package name */
    private final o f14177c;

    /* renamed from: d  reason: collision with root package name */
    private final v0 f14178d;

    /* renamed from: e  reason: collision with root package name */
    private final c f14179e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Pair<RecomposeScopeImpl, c<Object>>> f14180f;

    /* renamed from: g  reason: collision with root package name */
    private final g<l<Object>, d1<Object>> f14181g;

    public g0(e0<Object> e0Var, Object obj, o oVar, v0 v0Var, c cVar, List<Pair<RecomposeScopeImpl, c<Object>>> list, g<l<Object>, ? extends d1<? extends Object>> gVar) {
        p.j(e0Var, "content");
        p.j(oVar, "composition");
        p.j(v0Var, "slotTable");
        p.j(cVar, "anchor");
        p.j(list, "invalidations");
        p.j(gVar, "locals");
        this.f14175a = e0Var;
        this.f14176b = obj;
        this.f14177c = oVar;
        this.f14178d = v0Var;
        this.f14179e = cVar;
        this.f14180f = list;
        this.f14181g = gVar;
    }

    public final c a() {
        return this.f14179e;
    }

    public final o b() {
        return this.f14177c;
    }

    public final e0<Object> c() {
        return this.f14175a;
    }

    public final List<Pair<RecomposeScopeImpl, c<Object>>> d() {
        return this.f14180f;
    }

    public final g<l<Object>, d1<Object>> e() {
        return this.f14181g;
    }

    public final Object f() {
        return this.f14176b;
    }

    public final v0 g() {
        return this.f14178d;
    }
}
