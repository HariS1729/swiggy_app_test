package defpackage;

import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;

/* renamed from: a  reason: default package */
/* compiled from: Coroutines.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineDispatcher f815a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineDispatcher f816b;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineDispatcher f817c;

    public a(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3) {
        p.j(coroutineDispatcher, "mainDispatcher");
        p.j(coroutineDispatcher2, "defaultDispatcher");
        p.j(coroutineDispatcher3, "ioDispatcher");
        this.f815a = coroutineDispatcher;
        this.f816b = coroutineDispatcher2;
        this.f817c = coroutineDispatcher3;
    }

    public final CoroutineDispatcher a() {
        return this.f816b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p.e(this.f815a, aVar.f815a) && p.e(this.f816b, aVar.f816b) && p.e(this.f817c, aVar.f817c);
    }

    public int hashCode() {
        return (((this.f815a.hashCode() * 31) + this.f816b.hashCode()) * 31) + this.f817c.hashCode();
    }

    public String toString() {
        return "CoroutineDispatchers(mainDispatcher=" + this.f815a + ", defaultDispatcher=" + this.f816b + ", ioDispatcher=" + this.f817c + ')';
    }
}
