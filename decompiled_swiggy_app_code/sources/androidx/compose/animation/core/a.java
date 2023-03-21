package androidx.compose.animation.core;

import defpackage.v1;
import defpackage.v1.n;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: VectorConverters.kt */
final class a<T, V extends v1.n> implements v1.q0<T, V> {

    /* renamed from: a  reason: collision with root package name */
    private final l<T, V> f2815a;

    /* renamed from: b  reason: collision with root package name */
    private final l<V, T> f2816b;

    public a(l<? super T, ? extends V> lVar, l<? super V, ? extends T> lVar2) {
        p.j(lVar, "convertToVector");
        p.j(lVar2, "convertFromVector");
        this.f2815a = lVar;
        this.f2816b = lVar2;
    }

    public l<T, V> a() {
        return this.f2815a;
    }

    public l<V, T> b() {
        return this.f2816b;
    }
}
