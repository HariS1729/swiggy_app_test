package androidx.datastore.core;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: SingleProcessDataStore.kt */
final class c<T> extends d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f9874a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Throwable th2) {
        super((i) null);
        p.j(th2, "readException");
        this.f9874a = th2;
    }

    public final Throwable a() {
        return this.f9874a;
    }
}
