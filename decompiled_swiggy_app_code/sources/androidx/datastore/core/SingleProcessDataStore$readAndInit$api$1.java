package androidx.datastore.core;

import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.sync.c;
import y2.e;

/* compiled from: SingleProcessDataStore.kt */
public final class SingleProcessDataStore$readAndInit$api$1 implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f9823a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Ref$BooleanRef f9824b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<T> f9825c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f9826d;

    SingleProcessDataStore$readAndInit$api$1(c cVar, Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef<T> ref$ObjectRef, SingleProcessDataStore<T> singleProcessDataStore) {
        this.f9823a = cVar;
        this.f9824b = ref$BooleanRef;
        this.f9825c = ref$ObjectRef;
        this.f9826d = singleProcessDataStore;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a A[Catch:{ all -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ba A[Catch:{ all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0 A[Catch:{ all -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7 A[SYNTHETIC, Splitter:B:47:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(lp0.p<? super T, ? super fp0.c<? super T>, ? extends java.lang.Object> r11, fp0.c<? super T> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1) r0
            int r1 = r0.f9834h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9834h = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f9832f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f9834h
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0076
            if (r2 == r5) goto L_0x005a
            if (r2 == r4) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            java.lang.Object r11 = r0.f9829c
            java.lang.Object r1 = r0.f9828b
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r0 = r0.f9827a
            kotlinx.coroutines.sync.c r0 = (kotlinx.coroutines.sync.c) r0
            bp0.g.b(r12)     // Catch:{ all -> 0x003b }
            goto L_0x00cc
        L_0x003b:
            r11 = move-exception
            goto L_0x00e1
        L_0x003e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0046:
            java.lang.Object r11 = r0.f9829c
            androidx.datastore.core.SingleProcessDataStore r11 = (androidx.datastore.core.SingleProcessDataStore) r11
            java.lang.Object r2 = r0.f9828b
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r4 = r0.f9827a
            kotlinx.coroutines.sync.c r4 = (kotlinx.coroutines.sync.c) r4
            bp0.g.b(r12)     // Catch:{ all -> 0x0056 }
            goto L_0x00b2
        L_0x0056:
            r11 = move-exception
            r0 = r4
            goto L_0x00e1
        L_0x005a:
            java.lang.Object r11 = r0.f9831e
            androidx.datastore.core.SingleProcessDataStore r11 = (androidx.datastore.core.SingleProcessDataStore) r11
            java.lang.Object r2 = r0.f9830d
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r5 = r0.f9829c
            kotlin.jvm.internal.Ref$BooleanRef r5 = (kotlin.jvm.internal.Ref$BooleanRef) r5
            java.lang.Object r7 = r0.f9828b
            kotlinx.coroutines.sync.c r7 = (kotlinx.coroutines.sync.c) r7
            java.lang.Object r8 = r0.f9827a
            lp0.p r8 = (lp0.p) r8
            bp0.g.b(r12)
            r12 = r7
            r9 = r8
            r8 = r11
            r11 = r9
            goto L_0x0096
        L_0x0076:
            bp0.g.b(r12)
            kotlinx.coroutines.sync.c r12 = r10.f9823a
            kotlin.jvm.internal.Ref$BooleanRef r2 = r10.f9824b
            kotlin.jvm.internal.Ref$ObjectRef<T> r7 = r10.f9825c
            androidx.datastore.core.SingleProcessDataStore<T> r8 = r10.f9826d
            r0.f9827a = r11
            r0.f9828b = r12
            r0.f9829c = r2
            r0.f9830d = r7
            r0.f9831e = r8
            r0.f9834h = r5
            java.lang.Object r5 = r12.a(r6, r0)
            if (r5 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r5 = r2
            r2 = r7
        L_0x0096:
            boolean r5 = r5.f25661a     // Catch:{ all -> 0x00df }
            if (r5 != 0) goto L_0x00d7
            T r5 = r2.f25666a     // Catch:{ all -> 0x00df }
            r0.f9827a = r12     // Catch:{ all -> 0x00df }
            r0.f9828b = r2     // Catch:{ all -> 0x00df }
            r0.f9829c = r8     // Catch:{ all -> 0x00df }
            r0.f9830d = r6     // Catch:{ all -> 0x00df }
            r0.f9831e = r6     // Catch:{ all -> 0x00df }
            r0.f9834h = r4     // Catch:{ all -> 0x00df }
            java.lang.Object r11 = r11.invoke(r5, r0)     // Catch:{ all -> 0x00df }
            if (r11 != r1) goto L_0x00af
            return r1
        L_0x00af:
            r4 = r12
            r12 = r11
            r11 = r8
        L_0x00b2:
            T r5 = r2.f25666a     // Catch:{ all -> 0x0056 }
            boolean r5 = kotlin.jvm.internal.p.e(r12, r5)     // Catch:{ all -> 0x0056 }
            if (r5 != 0) goto L_0x00d0
            r0.f9827a = r4     // Catch:{ all -> 0x0056 }
            r0.f9828b = r2     // Catch:{ all -> 0x0056 }
            r0.f9829c = r12     // Catch:{ all -> 0x0056 }
            r0.f9834h = r3     // Catch:{ all -> 0x0056 }
            java.lang.Object r11 = r11.z(r12, r0)     // Catch:{ all -> 0x0056 }
            if (r11 != r1) goto L_0x00c9
            return r1
        L_0x00c9:
            r11 = r12
            r1 = r2
            r0 = r4
        L_0x00cc:
            r1.f25666a = r11     // Catch:{ all -> 0x003b }
            r2 = r1
            goto L_0x00d1
        L_0x00d0:
            r0 = r4
        L_0x00d1:
            T r11 = r2.f25666a     // Catch:{ all -> 0x003b }
            r0.c(r6)
            return r11
        L_0x00d7:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "InitializerApi.updateData should not be called after initialization is complete."
            r11.<init>(r0)     // Catch:{ all -> 0x00df }
            throw r11     // Catch:{ all -> 0x00df }
        L_0x00df:
            r11 = move-exception
            r0 = r12
        L_0x00e1:
            r0.c(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1.a(lp0.p, fp0.c):java.lang.Object");
    }
}
