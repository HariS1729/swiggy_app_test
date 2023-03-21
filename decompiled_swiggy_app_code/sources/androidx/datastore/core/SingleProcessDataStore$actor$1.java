package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: SingleProcessDataStore.kt */
final class SingleProcessDataStore$actor$1 extends Lambda implements l<Throwable, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f9790a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$actor$1(SingleProcessDataStore<T> singleProcessDataStore) {
        super(1);
        this.f9790a = singleProcessDataStore;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return k.f22762a;
    }

    public final void invoke(Throwable th2) {
        if (th2 != null) {
            this.f9790a.f9783h.setValue(new b(th2));
        }
        SingleProcessDataStore.a aVar = SingleProcessDataStore.k;
        Object b11 = aVar.b();
        SingleProcessDataStore<T> singleProcessDataStore = this.f9790a;
        synchronized (b11) {
            aVar.a().remove(singleProcessDataStore.q().getAbsolutePath());
            k kVar = k.f22762a;
        }
    }
}
