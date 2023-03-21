package c1;

import c1.a;
import in.swiggy.android.tejas.network.HttpRequest;
import j1.d;
import j1.e;
import j1.f;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;

/* compiled from: FocusAwareInputModifier.kt */
public class b<T extends a> implements j1.b, d<b<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final l<a, Boolean> f12759a;

    /* renamed from: b  reason: collision with root package name */
    private final l<a, Boolean> f12760b;

    /* renamed from: c  reason: collision with root package name */
    private final f<b<T>> f12761c;

    /* renamed from: d  reason: collision with root package name */
    private b<T> f12762d;

    public b(l<? super a, Boolean> lVar, l<? super a, Boolean> lVar2, f<b<T>> fVar) {
        p.j(fVar, HttpRequest.HEADER_KEY);
        this.f12759a = lVar;
        this.f12760b = lVar2;
        this.f12761c = fVar;
    }

    private final boolean c(T t) {
        l<a, Boolean> lVar = this.f12759a;
        if (lVar != null && lVar.invoke(t).booleanValue()) {
            return true;
        }
        b<T> bVar = this.f12762d;
        if (bVar != null) {
            return bVar.c(t);
        }
        return false;
    }

    private final boolean e(T t) {
        b<T> bVar = this.f12762d;
        if (bVar != null && bVar.e(t)) {
            return true;
        }
        l<a, Boolean> lVar = this.f12760b;
        if (lVar != null) {
            return lVar.invoke(t).booleanValue();
        }
        return false;
    }

    public void D(e eVar) {
        p.j(eVar, "scope");
        this.f12762d = (b) eVar.a(getKey());
    }

    public /* synthetic */ p0.d N(p0.d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    /* renamed from: a */
    public b<T> getValue() {
        return this;
    }

    public final boolean d(T t) {
        p.j(t, "event");
        return e(t) || c(t);
    }

    public f<b<T>> getKey() {
        return this.f12761c;
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }
}
