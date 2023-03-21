package e0;

import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.b;
import bp0.k;
import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.jvm.internal.p;
import n0.l;
import n0.u;
import n0.v;

/* compiled from: SnapshotState.kt */
public class y0<T> implements u, l<T> {

    /* renamed from: a  reason: collision with root package name */
    private final a1<T> f14273a;

    /* renamed from: b  reason: collision with root package name */
    private a<T> f14274b;

    /* compiled from: SnapshotState.kt */
    private static final class a<T> extends v {

        /* renamed from: c  reason: collision with root package name */
        private T f14275c;

        public a(T t) {
            this.f14275c = t;
        }

        public void a(v vVar) {
            p.j(vVar, "value");
            this.f14275c = ((a) vVar).f14275c;
        }

        public v b() {
            return new a(this.f14275c);
        }

        public final T g() {
            return this.f14275c;
        }

        public final void h(T t) {
            this.f14275c = t;
        }
    }

    public y0(T t, a1<T> a1Var) {
        p.j(a1Var, HttpRequest.HEADER_POLICY);
        this.f14273a = a1Var;
        this.f14274b = new a<>(t);
    }

    public a1<T> c() {
        return this.f14273a;
    }

    public v d(v vVar, v vVar2, v vVar3) {
        p.j(vVar, "previous");
        p.j(vVar2, "current");
        p.j(vVar3, "applied");
        a aVar = (a) vVar;
        a aVar2 = (a) vVar2;
        a aVar3 = (a) vVar3;
        if (c().a(aVar2.g(), aVar3.g())) {
            return vVar2;
        }
        Object b11 = c().b(aVar.g(), aVar2.g(), aVar3.g());
        if (b11 == null) {
            return null;
        }
        v b12 = aVar3.b();
        ((a) b12).h(b11);
        return b12;
    }

    public void f(v vVar) {
        p.j(vVar, "value");
        this.f14274b = (a) vVar;
    }

    public T getValue() {
        return ((a) SnapshotKt.O(this.f14274b, this)).g();
    }

    public v k() {
        return this.f14274b;
    }

    public void setValue(T t) {
        b b11;
        a<T> aVar = this.f14274b;
        b.a aVar2 = b.f6287e;
        a aVar3 = (a) SnapshotKt.A(aVar, aVar2.b());
        if (!c().a(aVar3.g(), t)) {
            a<T> aVar4 = this.f14274b;
            SnapshotKt.D();
            synchronized (SnapshotKt.C()) {
                b11 = aVar2.b();
                ((a) SnapshotKt.L(aVar4, this, b11, aVar3)).h(t);
                k kVar = k.f22762a;
            }
            SnapshotKt.J(b11, this);
        }
    }

    public String toString() {
        return "MutableState(value=" + ((a) SnapshotKt.A(this.f14274b, b.f6287e.b())).g() + ")@" + hashCode();
    }
}
