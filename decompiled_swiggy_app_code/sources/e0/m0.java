package e0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.a;

/* compiled from: CompositionLocal.kt */
public abstract class m0<T> extends l<T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m0(a<? extends T> aVar) {
        super(aVar, (i) null);
        p.j(aVar, "defaultFactory");
    }

    public final n0<T> c(T t) {
        return new n0<>(this, t, true);
    }

    public final n0<T> d(T t) {
        return new n0<>(this, t, false);
    }
}
