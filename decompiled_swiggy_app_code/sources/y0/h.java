package y0;

import bp0.k;
import kotlin.jvm.internal.i;
import lp0.a;
import w0.f;

/* compiled from: Vector.kt */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private a<k> f17965a;

    private h() {
    }

    public /* synthetic */ h(i iVar) {
        this();
    }

    public abstract void a(f fVar);

    public a<k> b() {
        return this.f17965a;
    }

    public final void c() {
        a<k> b11 = b();
        if (b11 != null) {
            b11.invoke();
        }
    }

    public void d(a<k> aVar) {
        this.f17965a = aVar;
    }
}
