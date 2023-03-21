package androidx.datastore.core;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: SingleProcessDataStore.kt */
final class b<T> extends d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f9873a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Throwable th2) {
        super((i) null);
        p.j(th2, "finalException");
        this.f9873a = th2;
    }

    public final Throwable a() {
        return this.f9873a;
    }
}
