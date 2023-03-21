package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import bp0.k;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import wp0.w;

/* compiled from: SingleProcessDataStore.kt */
final class SingleProcessDataStore$actor$2 extends Lambda implements p<SingleProcessDataStore.b<T>, Throwable, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final SingleProcessDataStore$actor$2 f9791a = new SingleProcessDataStore$actor$2();

    SingleProcessDataStore$actor$2() {
        super(2);
    }

    public final void a(SingleProcessDataStore.b<T> bVar, Throwable th2) {
        kotlin.jvm.internal.p.j(bVar, "msg");
        if (bVar instanceof SingleProcessDataStore.b.C0055b) {
            w a11 = ((SingleProcessDataStore.b.C0055b) bVar).a();
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            a11.a(th2);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((SingleProcessDataStore.b) obj, (Throwable) obj2);
        return k.f22762a;
    }
}
