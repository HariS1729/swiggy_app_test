package androidx.datastore.core;

import bp0.k;
import fp0.c;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.e;

/* compiled from: SafeCollector.common.kt */
public final class SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1 implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f9785a;

    public SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1(d dVar) {
        this.f9785a = dVar;
    }

    public Object collect(final e eVar, c cVar) {
        Object collect = this.f9785a.collect(new e<d<T>>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, fp0.c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1 r0 = (androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.f9788b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f9788b = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1 r0 = new androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f9787a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
                    int r2 = r0.f9788b
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    bp0.g.b(r6)
                    goto L_0x0053
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    bp0.g.b(r6)
                    kotlinx.coroutines.flow.e r6 = r3
                    androidx.datastore.core.d r5 = (androidx.datastore.core.d) r5
                    boolean r2 = r5 instanceof androidx.datastore.core.c
                    if (r2 != 0) goto L_0x0073
                    boolean r2 = r5 instanceof androidx.datastore.core.b
                    if (r2 != 0) goto L_0x006c
                    boolean r2 = r5 instanceof androidx.datastore.core.a
                    if (r2 == 0) goto L_0x0056
                    androidx.datastore.core.a r5 = (androidx.datastore.core.a) r5
                    java.lang.Object r5 = r5.b()
                    r0.f9788b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0053
                    return r1
                L_0x0053:
                    bp0.k r5 = bp0.k.f22762a
                    return r5
                L_0x0056:
                    boolean r5 = r5 instanceof androidx.datastore.core.e
                    if (r5 == 0) goto L_0x0066
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                    java.lang.String r6 = r6.toString()
                    r5.<init>(r6)
                    throw r5
                L_0x0066:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                L_0x006c:
                    androidx.datastore.core.b r5 = (androidx.datastore.core.b) r5
                    java.lang.Throwable r5 = r5.a()
                    throw r5
                L_0x0073:
                    androidx.datastore.core.c r5 = (androidx.datastore.core.c) r5
                    java.lang.Throwable r5 = r5.a()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, fp0.c):java.lang.Object");
            }
        }, cVar);
        if (collect == b.d()) {
            return collect;
        }
        return k.f22762a;
    }
}
