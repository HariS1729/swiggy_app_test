package s0;

import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import e0.a1;
import e0.h0;
import j1.b;
import j1.d;
import j1.e;
import j1.f;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;

/* compiled from: FocusProperties.kt */
public final class n extends o0 implements b, d<n> {

    /* renamed from: b  reason: collision with root package name */
    private final l<l, k> f16584b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f16585c = j.e((Object) null, (a1) null, 2, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    private final f<n> f16586d = FocusPropertiesKt.c();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(l<? super l, k> lVar, l<? super n0, k> lVar2) {
        super(lVar2);
        p.j(lVar, "focusPropertiesScope");
        p.j(lVar2, "inspectorInfo");
        this.f16584b = lVar;
    }

    private final n e() {
        return (n) this.f16585c.getValue();
    }

    private final void g(n nVar) {
        this.f16585c.setValue(nVar);
    }

    public void D(e eVar) {
        p.j(eVar, "scope");
        g((n) eVar.a(FocusPropertiesKt.c()));
    }

    public /* synthetic */ p0.d N(p0.d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    public final void c(l lVar) {
        p.j(lVar, "focusProperties");
        this.f16584b.invoke(lVar);
        n e11 = e();
        if (e11 != null) {
            e11.c(lVar);
        }
    }

    public final l<l, k> d() {
        return this.f16584b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof n) && p.e(this.f16584b, ((n) obj).f16584b);
    }

    /* renamed from: f */
    public n getValue() {
        return this;
    }

    public f<n> getKey() {
        return this.f16586d;
    }

    public int hashCode() {
        return this.f16584b.hashCode();
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }
}
