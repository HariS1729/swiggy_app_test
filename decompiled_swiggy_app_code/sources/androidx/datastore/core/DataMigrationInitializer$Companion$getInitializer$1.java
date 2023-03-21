package androidx.datastore.core;

import androidx.datastore.core.DataMigrationInitializer;
import bp0.g;
import bp0.k;
import fp0.c;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import y2.b;
import y2.e;

@d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
/* compiled from: DataMigrationInitializer.kt */
final class DataMigrationInitializer$Companion$getInitializer$1 extends SuspendLambda implements p<e<T>, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f9747a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f9748b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<b<T>> f9749c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DataMigrationInitializer$Companion$getInitializer$1(List<? extends b<T>> list, c<? super DataMigrationInitializer$Companion$getInitializer$1> cVar) {
        super(2, cVar);
        this.f9749c = list;
    }

    /* renamed from: a */
    public final Object invoke(e<T> eVar, c<? super k> cVar) {
        return ((DataMigrationInitializer$Companion$getInitializer$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        DataMigrationInitializer$Companion$getInitializer$1 dataMigrationInitializer$Companion$getInitializer$1 = new DataMigrationInitializer$Companion$getInitializer$1(this.f9749c, cVar);
        dataMigrationInitializer$Companion$getInitializer$1.f9748b = obj;
        return dataMigrationInitializer$Companion$getInitializer$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f9747a;
        if (i11 == 0) {
            g.b(obj);
            DataMigrationInitializer.Companion companion = DataMigrationInitializer.f9746a;
            List<b<T>> list = this.f9749c;
            this.f9747a = 1;
            if (companion.c(list, (e) this.f9748b, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
