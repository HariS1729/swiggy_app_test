package androidx.compose.ui.layout;

import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import d2.p;
import d2.q;
import i1.b0;
import lp0.l;
import p0.c;
import p0.d;
import p0.e;

/* compiled from: OnRemeasuredModifier.kt */
final class f extends o0 implements b0 {

    /* renamed from: b  reason: collision with root package name */
    private final l<p, k> f6800b;

    /* renamed from: c  reason: collision with root package name */
    private long f6801c = q.a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(l<? super p, k> lVar, l<? super n0, k> lVar2) {
        super(lVar2);
        kotlin.jvm.internal.p.j(lVar, "onSizeChanged");
        kotlin.jvm.internal.p.j(lVar2, "inspectorInfo");
        this.f6800b = lVar;
    }

    public /* synthetic */ d N(d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return e.c(this, obj, pVar);
    }

    public void Y(long j) {
        if (!p.e(this.f6801c, j)) {
            this.f6800b.invoke(p.b(j));
            this.f6801c = j;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return kotlin.jvm.internal.p.e(this.f6800b, ((f) obj).f6800b);
    }

    public int hashCode() {
        return this.f6800b.hashCode();
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
