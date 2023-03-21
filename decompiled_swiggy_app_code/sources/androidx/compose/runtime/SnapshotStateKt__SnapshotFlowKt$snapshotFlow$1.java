package androidx.compose.runtime;

import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.a;
import lp0.p;

@d(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {134, 138, 160}, m = "invokeSuspend")
/* compiled from: SnapshotFlow.kt */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends SuspendLambda implements p<e<? super T>, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f6108a;

    /* renamed from: b  reason: collision with root package name */
    Object f6109b;

    /* renamed from: c  reason: collision with root package name */
    Object f6110c;

    /* renamed from: d  reason: collision with root package name */
    Object f6111d;

    /* renamed from: e  reason: collision with root package name */
    Object f6112e;

    /* renamed from: f  reason: collision with root package name */
    int f6113f;

    /* renamed from: g  reason: collision with root package name */
    int f6114g;

    /* renamed from: h  reason: collision with root package name */
    private /* synthetic */ Object f6115h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ a<T> f6116i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(a<? extends T> aVar, c<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1> cVar) {
        super(2, cVar);
        this.f6116i = aVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.f6116i, cVar);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.f6115h = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    public final Object invoke(e<? super T> eVar, c<? super k> cVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: kotlinx.coroutines.flow.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00db A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e8 A[Catch:{ all -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0100 A[Catch:{ all -> 0x0053 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r1.f6114g
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0074
            if (r2 == r6) goto L_0x0057
            if (r2 == r5) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            java.lang.Object r2 = r1.f6112e
            java.lang.Object r7 = r1.f6111d
            n0.c r7 = (n0.c) r7
            java.lang.Object r8 = r1.f6110c
            yp0.f r8 = (yp0.f) r8
            java.lang.Object r9 = r1.f6109b
            lp0.l r9 = (lp0.l) r9
            java.lang.Object r10 = r1.f6108a
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r11 = r1.f6115h
            kotlinx.coroutines.flow.e r11 = (kotlinx.coroutines.flow.e) r11
            goto L_0x006d
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0033:
            int r2 = r1.f6113f
            java.lang.Object r7 = r1.f6112e
            java.lang.Object r8 = r1.f6111d
            n0.c r8 = (n0.c) r8
            java.lang.Object r9 = r1.f6110c
            yp0.f r9 = (yp0.f) r9
            java.lang.Object r10 = r1.f6109b
            lp0.l r10 = (lp0.l) r10
            java.lang.Object r11 = r1.f6108a
            java.util.Set r11 = (java.util.Set) r11
            java.lang.Object r12 = r1.f6115h
            kotlinx.coroutines.flow.e r12 = (kotlinx.coroutines.flow.e) r12
            bp0.g.b(r17)     // Catch:{ all -> 0x0053 }
            r13 = r17
            r14 = r1
            goto L_0x00e4
        L_0x0053:
            r0 = move-exception
            r7 = r8
            goto L_0x015a
        L_0x0057:
            java.lang.Object r2 = r1.f6112e
            java.lang.Object r7 = r1.f6111d
            n0.c r7 = (n0.c) r7
            java.lang.Object r8 = r1.f6110c
            yp0.f r8 = (yp0.f) r8
            java.lang.Object r9 = r1.f6109b
            lp0.l r9 = (lp0.l) r9
            java.lang.Object r10 = r1.f6108a
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r11 = r1.f6115h
            kotlinx.coroutines.flow.e r11 = (kotlinx.coroutines.flow.e) r11
        L_0x006d:
            bp0.g.b(r17)     // Catch:{ all -> 0x0071 }
            goto L_0x00c4
        L_0x0071:
            r0 = move-exception
            goto L_0x015a
        L_0x0074:
            bp0.g.b(r17)
            java.lang.Object r2 = r1.f6115h
            r11 = r2
            kotlinx.coroutines.flow.e r11 = (kotlinx.coroutines.flow.e) r11
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 r9 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1
            r9.<init>(r10)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r7 = 6
            r8 = 0
            yp0.f r8 = yp0.i.b(r2, r8, r8, r7, r8)
            androidx.compose.runtime.snapshots.b$a r2 = androidx.compose.runtime.snapshots.b.f6287e
            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1 r7 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1
            r7.<init>(r8)
            n0.c r7 = r2.e(r7)
            androidx.compose.runtime.snapshots.b r2 = r2.i(r9)     // Catch:{ all -> 0x0071 }
            lp0.a<T> r12 = r1.f6116i     // Catch:{ all -> 0x0071 }
            androidx.compose.runtime.snapshots.b r13 = r2.k()     // Catch:{ all -> 0x0155 }
            java.lang.Object r12 = r12.invoke()     // Catch:{ all -> 0x014f }
            r2.r(r13)     // Catch:{ all -> 0x0155 }
            r2.d()     // Catch:{ all -> 0x0071 }
            r1.f6115h = r11     // Catch:{ all -> 0x0071 }
            r1.f6108a = r10     // Catch:{ all -> 0x0071 }
            r1.f6109b = r9     // Catch:{ all -> 0x0071 }
            r1.f6110c = r8     // Catch:{ all -> 0x0071 }
            r1.f6111d = r7     // Catch:{ all -> 0x0071 }
            r1.f6112e = r12     // Catch:{ all -> 0x0071 }
            r1.f6114g = r6     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = r11.emit(r12, r1)     // Catch:{ all -> 0x0071 }
            if (r2 != r0) goto L_0x00c3
            return r0
        L_0x00c3:
            r2 = r12
        L_0x00c4:
            r12 = r1
        L_0x00c5:
            r12.f6115h = r11     // Catch:{ all -> 0x0071 }
            r12.f6108a = r10     // Catch:{ all -> 0x0071 }
            r12.f6109b = r9     // Catch:{ all -> 0x0071 }
            r12.f6110c = r8     // Catch:{ all -> 0x0071 }
            r12.f6111d = r7     // Catch:{ all -> 0x0071 }
            r12.f6112e = r2     // Catch:{ all -> 0x0071 }
            r12.f6113f = r3     // Catch:{ all -> 0x0071 }
            r12.f6114g = r5     // Catch:{ all -> 0x0071 }
            java.lang.Object r13 = r8.c(r12)     // Catch:{ all -> 0x0071 }
            if (r13 != r0) goto L_0x00dc
            return r0
        L_0x00dc:
            r14 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r2
            r2 = 0
        L_0x00e4:
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0053 }
        L_0x00e6:
            if (r2 != 0) goto L_0x00f1
            boolean r2 = androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.d(r11, r13)     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x00ef
            goto L_0x00f1
        L_0x00ef:
            r2 = 0
            goto L_0x00f2
        L_0x00f1:
            r2 = 1
        L_0x00f2:
            java.lang.Object r13 = r9.h()     // Catch:{ all -> 0x0053 }
            java.lang.Object r13 = yp0.j.f(r13)     // Catch:{ all -> 0x0053 }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0053 }
            if (r13 != 0) goto L_0x00e6
            if (r2 == 0) goto L_0x0146
            r11.clear()     // Catch:{ all -> 0x0053 }
            androidx.compose.runtime.snapshots.b$a r2 = androidx.compose.runtime.snapshots.b.f6287e     // Catch:{ all -> 0x0053 }
            androidx.compose.runtime.snapshots.b r2 = r2.i(r10)     // Catch:{ all -> 0x0053 }
            lp0.a<T> r13 = r14.f6116i     // Catch:{ all -> 0x0053 }
            androidx.compose.runtime.snapshots.b r15 = r2.k()     // Catch:{ all -> 0x0141 }
            java.lang.Object r13 = r13.invoke()     // Catch:{ all -> 0x013b }
            r2.r(r15)     // Catch:{ all -> 0x0141 }
            r2.d()     // Catch:{ all -> 0x0053 }
            boolean r2 = kotlin.jvm.internal.p.e(r13, r7)     // Catch:{ all -> 0x0053 }
            if (r2 != 0) goto L_0x0146
            r14.f6115h = r12     // Catch:{ all -> 0x0053 }
            r14.f6108a = r11     // Catch:{ all -> 0x0053 }
            r14.f6109b = r10     // Catch:{ all -> 0x0053 }
            r14.f6110c = r9     // Catch:{ all -> 0x0053 }
            r14.f6111d = r8     // Catch:{ all -> 0x0053 }
            r14.f6112e = r13     // Catch:{ all -> 0x0053 }
            r14.f6114g = r4     // Catch:{ all -> 0x0053 }
            java.lang.Object r2 = r12.emit(r13, r14)     // Catch:{ all -> 0x0053 }
            if (r2 != r0) goto L_0x0134
            return r0
        L_0x0134:
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r2 = r13
            goto L_0x014c
        L_0x013b:
            r0 = move-exception
            r3 = r0
            r2.r(r15)     // Catch:{ all -> 0x0141 }
            throw r3     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r0 = move-exception
            r2.d()     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0146:
            r2 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
        L_0x014c:
            r12 = r14
            goto L_0x00c5
        L_0x014f:
            r0 = move-exception
            r3 = r0
            r2.r(r13)     // Catch:{ all -> 0x0155 }
            throw r3     // Catch:{ all -> 0x0155 }
        L_0x0155:
            r0 = move-exception
            r2.d()     // Catch:{ all -> 0x0071 }
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x015a:
            r7.dispose()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
