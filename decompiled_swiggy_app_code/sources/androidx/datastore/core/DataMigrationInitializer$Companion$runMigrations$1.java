package androidx.datastore.core;

import androidx.datastore.core.DataMigrationInitializer;
import fp0.c;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import y2.e;

@d(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
/* compiled from: DataMigrationInitializer.kt */
final class DataMigrationInitializer$Companion$runMigrations$1<T> extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f9750a;

    /* renamed from: b  reason: collision with root package name */
    Object f9751b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f9752c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ DataMigrationInitializer.Companion f9753d;

    /* renamed from: e  reason: collision with root package name */
    int f9754e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DataMigrationInitializer$Companion$runMigrations$1(DataMigrationInitializer.Companion companion, c<? super DataMigrationInitializer$Companion$runMigrations$1> cVar) {
        super(cVar);
        this.f9753d = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.f9752c = obj;
        this.f9754e |= Integer.MIN_VALUE;
        return this.f9753d.c((List) null, (e) null, this);
    }
}
