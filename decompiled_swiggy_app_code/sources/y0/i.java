package y0;

import e0.a;
import kotlin.jvm.internal.p;

/* compiled from: VectorCompose.kt */
public final class i extends a<h> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(h hVar) {
        super(hVar);
        p.j(hVar, "root");
    }

    private final b m(h hVar) {
        if (hVar instanceof b) {
            return (b) hVar;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    public void b(int i11, int i12) {
        m((h) a()).j(i11, i12);
    }

    public void e(int i11, int i12, int i13) {
        m((h) a()).i(i11, i12, i13);
    }

    /* access modifiers changed from: protected */
    public void k() {
        b m11 = m((h) j());
        m11.j(0, m11.f());
    }

    /* renamed from: n */
    public void g(int i11, h hVar) {
        p.j(hVar, "instance");
    }

    /* renamed from: o */
    public void f(int i11, h hVar) {
        p.j(hVar, "instance");
        m((h) a()).h(i11, hVar);
    }
}
