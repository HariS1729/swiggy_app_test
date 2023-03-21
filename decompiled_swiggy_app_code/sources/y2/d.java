package y2;

import androidx.datastore.core.DataMigrationInitializer;
import androidx.datastore.core.SingleProcessDataStore;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.p;
import lp0.a;
import wp0.j0;
import z2.b;

/* compiled from: DataStoreFactory.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f18016a = new d();

    private d() {
    }

    public final <T> c<T> a(f<T> fVar, b<T> bVar, List<? extends b<T>> list, j0 j0Var, a<? extends File> aVar) {
        p.j(fVar, "serializer");
        p.j(list, "migrations");
        p.j(j0Var, "scope");
        p.j(aVar, "produceFile");
        return new SingleProcessDataStore(aVar, fVar, j.d(DataMigrationInitializer.f9746a.b(list)), new z2.a(), j0Var);
    }
}
