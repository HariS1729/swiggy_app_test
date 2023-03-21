package e0;

import bp0.f;
import kotlin.jvm.internal.p;
import lp0.a;

/* compiled from: ValueHolders.kt */
public final class a0<T> implements d1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f f14162a;

    public a0(a<? extends T> aVar) {
        p.j(aVar, "valueProducer");
        this.f14162a = b.b(aVar);
    }

    private final T d() {
        return this.f14162a.getValue();
    }

    public T getValue() {
        return d();
    }
}
