package androidx.datastore.core;

import kotlin.jvm.internal.i;

/* compiled from: SingleProcessDataStore.kt */
final class a<T> extends d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f9871a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9872b;

    public a(T t, int i11) {
        super((i) null);
        this.f9871a = t;
        this.f9872b = i11;
    }

    public final void a() {
        T t = this.f9871a;
        boolean z11 = false;
        if ((t != null ? t.hashCode() : 0) == this.f9872b) {
            z11 = true;
        }
        if (!z11) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    public final T b() {
        return this.f9871a;
    }
}
