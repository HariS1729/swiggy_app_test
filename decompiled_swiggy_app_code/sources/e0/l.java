package e0;

import kotlin.jvm.internal.i;
import lp0.a;

/* compiled from: CompositionLocal.kt */
public abstract class l<T> {

    /* renamed from: a  reason: collision with root package name */
    private final a0<T> f14210a;

    private l(a<? extends T> aVar) {
        this.f14210a = new a0<>(aVar);
    }

    public /* synthetic */ l(a aVar, i iVar) {
        this(aVar);
    }

    public final a0<T> a() {
        return this.f14210a;
    }

    public abstract d1<T> b(T t, g gVar, int i11);
}
