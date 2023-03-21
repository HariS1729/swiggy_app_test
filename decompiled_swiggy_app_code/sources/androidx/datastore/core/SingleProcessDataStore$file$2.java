package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import java.io.File;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;

/* compiled from: SingleProcessDataStore.kt */
final class SingleProcessDataStore$file$2 extends Lambda implements a<File> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f9807a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$file$2(SingleProcessDataStore<T> singleProcessDataStore) {
        super(0);
        this.f9807a = singleProcessDataStore;
    }

    /* renamed from: a */
    public final File invoke() {
        File file = (File) this.f9807a.f9776a.invoke();
        String absolutePath = file.getAbsolutePath();
        SingleProcessDataStore.a aVar = SingleProcessDataStore.k;
        synchronized (aVar.b()) {
            if (!aVar.a().contains(absolutePath)) {
                Set<String> a11 = aVar.a();
                p.i(absolutePath, "it");
                a11.add(absolutePath);
            } else {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }
        return file;
    }
}
