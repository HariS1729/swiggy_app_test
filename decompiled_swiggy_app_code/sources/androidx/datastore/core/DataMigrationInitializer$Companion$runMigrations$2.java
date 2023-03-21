package androidx.datastore.core;

import bp0.k;
import fp0.c;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;
import lp0.p;
import y2.b;

@d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
/* compiled from: DataMigrationInitializer.kt */
final class DataMigrationInitializer$Companion$runMigrations$2 extends SuspendLambda implements p<T, c<? super T>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f9755a;

    /* renamed from: b  reason: collision with root package name */
    Object f9756b;

    /* renamed from: c  reason: collision with root package name */
    Object f9757c;

    /* renamed from: d  reason: collision with root package name */
    int f9758d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f9759e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ List<b<T>> f9760f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ List<l<c<? super k>, Object>> f9761g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DataMigrationInitializer$Companion$runMigrations$2(List<? extends b<T>> list, List<l<c<? super k>, Object>> list2, c<? super DataMigrationInitializer$Companion$runMigrations$2> cVar) {
        super(2, cVar);
        this.f9760f = list;
        this.f9761g = list2;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.f9760f, this.f9761g, cVar);
        dataMigrationInitializer$Companion$runMigrations$2.f9759e = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    public final Object invoke(T t, c<? super T> cVar) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(t, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r10.f9758d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 == r3) goto L_0x0024
            if (r1 != r2) goto L_0x001c
            java.lang.Object r1 = r10.f9755a
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r10.f9759e
            java.util.List r4 = (java.util.List) r4
            bp0.g.b(r11)
            r7 = r10
            goto L_0x008c
        L_0x001c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0024:
            java.lang.Object r1 = r10.f9757c
            java.lang.Object r4 = r10.f9756b
            y2.b r4 = (y2.b) r4
            java.lang.Object r5 = r10.f9755a
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r10.f9759e
            java.util.List r6 = (java.util.List) r6
            bp0.g.b(r11)
            r7 = r10
            r9 = r6
            r6 = r4
            r4 = r9
            goto L_0x006a
        L_0x003a:
            bp0.g.b(r11)
            java.lang.Object r11 = r10.f9759e
            java.util.List<y2.b<T>> r1 = r10.f9760f
            java.util.List<lp0.l<fp0.c<? super bp0.k>, java.lang.Object>> r4 = r10.f9761g
            java.util.Iterator r1 = r1.iterator()
            r5 = r10
        L_0x0048:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0091
            java.lang.Object r6 = r1.next()
            y2.b r6 = (y2.b) r6
            r5.f9759e = r4
            r5.f9755a = r1
            r5.f9756b = r6
            r5.f9757c = r11
            r5.f9758d = r3
            java.lang.Object r7 = r6.b(r11, r5)
            if (r7 != r0) goto L_0x0065
            return r0
        L_0x0065:
            r9 = r1
            r1 = r11
            r11 = r7
            r7 = r5
            r5 = r9
        L_0x006a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x008e
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r11 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            r8 = 0
            r11.<init>(r6, r8)
            r4.add(r11)
            r7.f9759e = r4
            r7.f9755a = r5
            r7.f9756b = r8
            r7.f9757c = r8
            r7.f9758d = r2
            java.lang.Object r11 = r6.a(r1, r7)
            if (r11 != r0) goto L_0x008f
            return r0
        L_0x008c:
            r5 = r7
            goto L_0x0048
        L_0x008e:
            r11 = r1
        L_0x008f:
            r1 = r5
            goto L_0x008c
        L_0x0091:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
