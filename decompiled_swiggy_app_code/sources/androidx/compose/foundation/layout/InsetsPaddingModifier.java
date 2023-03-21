package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import d2.c;
import defpackage.a2;
import e0.a1;
import e0.h0;
import i1.e0;
import i1.i;
import i1.j;
import i1.q;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import j1.b;
import j1.d;
import j1.e;
import j1.f;
import java.util.Map;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: WindowInsetsPadding.kt */
public final class InsetsPaddingModifier extends o0 implements q, b, d<a2.x> {

    /* renamed from: b  reason: collision with root package name */
    private final a2.x f3722b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f3723c;

    /* renamed from: d  reason: collision with root package name */
    private final h0 f3724d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsetsPaddingModifier(a2.x xVar, l<? super n0, k> lVar) {
        super(lVar);
        p.j(xVar, "insets");
        p.j(lVar, "inspectorInfo");
        this.f3722b = xVar;
        this.f3723c = j.e(xVar, (a1) null, 2, (Object) null);
        this.f3724d = j.e(xVar, (a1) null, 2, (Object) null);
    }

    private final a2.x c() {
        return (a2.x) this.f3724d.getValue();
    }

    private final a2.x d() {
        return (a2.x) this.f3723c.getValue();
    }

    private final void f(a2.x xVar) {
        this.f3724d.setValue(xVar);
    }

    private final void g(a2.x xVar) {
        this.f3723c.setValue(xVar);
    }

    public void D(e eVar) {
        p.j(eVar, "scope");
        a2.x xVar = (a2.x) eVar.a(WindowInsetsPaddingKt.a());
        g(a2.y.b(this.f3722b, xVar));
        f(a2.y.c(xVar, this.f3722b));
    }

    public u K(w wVar, r rVar, long j) {
        p.j(wVar, "$this$measure");
        p.j(rVar, "measurable");
        int d11 = d().d(wVar, wVar.getLayoutDirection());
        int c11 = d().c(wVar);
        int a11 = d().a(wVar, wVar.getLayoutDirection()) + d11;
        int b11 = d().b(wVar) + c11;
        e0 N = rVar.N(c.i(j, -a11, -b11));
        return v.b(wVar, c.g(j, N.A0() + a11), c.f(j, N.e0() + b11), (Map) null, new InsetsPaddingModifier$measure$1(N, d11, c11), 4, (Object) null);
    }

    public /* synthetic */ int L(j jVar, i iVar, int i11) {
        return androidx.compose.ui.layout.b.d(this, jVar, iVar, i11);
    }

    public /* synthetic */ p0.d N(p0.d dVar) {
        return p0.c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    /* renamed from: e */
    public a2.x getValue() {
        return c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsPaddingModifier)) {
            return false;
        }
        return p.e(((InsetsPaddingModifier) obj).f3722b, this.f3722b);
    }

    public /* synthetic */ int f0(j jVar, i iVar, int i11) {
        return androidx.compose.ui.layout.b.a(this, jVar, iVar, i11);
    }

    public f<a2.x> getKey() {
        return WindowInsetsPaddingKt.a();
    }

    public int hashCode() {
        return this.f3722b.hashCode();
    }

    public /* synthetic */ int n0(j jVar, i iVar, int i11) {
        return androidx.compose.ui.layout.b.c(this, jVar, iVar, i11);
    }

    public /* synthetic */ int p(j jVar, i iVar, int i11) {
        return androidx.compose.ui.layout.b.b(this, jVar, iVar, i11);
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InsetsPaddingModifier(a2.x xVar, l lVar, int i11, kotlin.jvm.internal.i iVar) {
        this(xVar, (i11 & 2) != 0 ? InspectableValueKt.c() ? new InsetsPaddingModifier$special$$inlined$debugInspectorInfo$1(xVar) : InspectableValueKt.a() : lVar);
    }
}
