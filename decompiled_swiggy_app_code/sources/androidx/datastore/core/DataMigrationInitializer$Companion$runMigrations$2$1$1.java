package androidx.datastore.core;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;
import y2.b;

@d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
/* compiled from: DataMigrationInitializer.kt */
final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends SuspendLambda implements l<c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f9762a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b<T> f9763b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DataMigrationInitializer$Companion$runMigrations$2$1$1(b<T> bVar, c<? super DataMigrationInitializer$Companion$runMigrations$2$1$1> cVar) {
        super(1, cVar);
        this.f9763b = bVar;
    }

    public final c<k> create(c<?> cVar) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.f9763b, cVar);
    }

    public final Object invoke(c<? super k> cVar) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) create(cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f9762a;
        if (i11 == 0) {
            g.b(obj);
            b<T> bVar = this.f9763b;
            this.f9762a = 1;
            if (bVar.c(this) == d11) {
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
