package androidx.compose.runtime.snapshots;

import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import tp0.f;

@d(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {295, 300, 307}, m = "invokeSuspend")
/* compiled from: SnapshotIdSet.kt */
final class SnapshotIdSet$iterator$1 extends RestrictedSuspendLambda implements p<f<? super Integer>, c<? super k>, Object> {

    /* renamed from: b  reason: collision with root package name */
    Object f6240b;

    /* renamed from: c  reason: collision with root package name */
    int f6241c;

    /* renamed from: d  reason: collision with root package name */
    int f6242d;

    /* renamed from: e  reason: collision with root package name */
    int f6243e;

    /* renamed from: f  reason: collision with root package name */
    private /* synthetic */ Object f6244f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ SnapshotIdSet f6245g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotIdSet$iterator$1(SnapshotIdSet snapshotIdSet, c<? super SnapshotIdSet$iterator$1> cVar) {
        super(2, cVar);
        this.f6245g = snapshotIdSet;
    }

    /* renamed from: a */
    public final Object invoke(f<? super Integer> fVar, c<? super k> cVar) {
        return ((SnapshotIdSet$iterator$1) create(fVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.f6245g, cVar);
        snapshotIdSet$iterator$1.f6244f = obj;
        return snapshotIdSet$iterator$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f6243e
            r3 = 0
            r4 = 1
            r6 = 3
            r7 = 2
            r8 = 64
            r10 = 0
            r12 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r12) goto L_0x003c
            if (r2 == r7) goto L_0x0030
            if (r2 != r6) goto L_0x0028
            int r2 = r0.f6241c
            java.lang.Object r7 = r0.f6244f
            tp0.f r7 = (tp0.f) r7
            bp0.g.b(r21)
            r9 = r2
            r13 = 3
            r2 = r0
            goto L_0x00f4
        L_0x0028:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0030:
            int r2 = r0.f6241c
            java.lang.Object r13 = r0.f6244f
            tp0.f r13 = (tp0.f) r13
            bp0.g.b(r21)
            r9 = r0
            goto L_0x00b7
        L_0x003c:
            int r2 = r0.f6242d
            int r13 = r0.f6241c
            java.lang.Object r14 = r0.f6240b
            int[] r14 = (int[]) r14
            java.lang.Object r15 = r0.f6244f
            tp0.f r15 = (tp0.f) r15
            bp0.g.b(r21)
            r9 = r0
            goto L_0x007b
        L_0x004d:
            bp0.g.b(r21)
            java.lang.Object r2 = r0.f6244f
            tp0.f r2 = (tp0.f) r2
            androidx.compose.runtime.snapshots.SnapshotIdSet r13 = r0.f6245g
            int[] r13 = r13.f6239d
            if (r13 == 0) goto L_0x0080
            int r14 = r13.length
            r9 = r0
            r15 = r2
            r2 = r14
            r14 = r13
            r13 = 0
        L_0x0062:
            if (r13 >= r2) goto L_0x007e
            r17 = r14[r13]
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r17)
            r9.f6244f = r15
            r9.f6240b = r14
            r9.f6241c = r13
            r9.f6242d = r2
            r9.f6243e = r12
            java.lang.Object r6 = r15.a(r6, r9)
            if (r6 != r1) goto L_0x007b
            return r1
        L_0x007b:
            int r13 = r13 + r12
            r6 = 3
            goto L_0x0062
        L_0x007e:
            r2 = r15
            goto L_0x0081
        L_0x0080:
            r9 = r0
        L_0x0081:
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.f6245g
            long r13 = r6.f6237b
            int r6 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00ba
            r13 = r2
            r2 = 0
        L_0x008d:
            if (r2 >= r8) goto L_0x00b9
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.f6245g
            long r14 = r6.f6237b
            long r18 = r4 << r2
            long r14 = r14 & r18
            int r6 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00b7
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.f6245g
            int r6 = r6.f6238c
            int r6 = r6 + r2
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r6)
            r9.f6244f = r13
            r9.f6240b = r3
            r9.f6241c = r2
            r9.f6243e = r7
            java.lang.Object r6 = r13.a(r6, r9)
            if (r6 != r1) goto L_0x00b7
            return r1
        L_0x00b7:
            int r2 = r2 + r12
            goto L_0x008d
        L_0x00b9:
            r2 = r13
        L_0x00ba:
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.f6245g
            long r6 = r6.f6236a
            int r13 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r13 == 0) goto L_0x00f6
            r7 = r2
            r2 = r9
            r9 = 0
        L_0x00c7:
            if (r9 >= r8) goto L_0x00f6
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r2.f6245g
            long r13 = r6.f6236a
            long r15 = r4 << r9
            long r13 = r13 & r15
            int r6 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00f3
            int r6 = r9 + 64
            androidx.compose.runtime.snapshots.SnapshotIdSet r13 = r2.f6245g
            int r13 = r13.f6238c
            int r6 = r6 + r13
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r6)
            r2.f6244f = r7
            r2.f6240b = r3
            r2.f6241c = r9
            r13 = 3
            r2.f6243e = r13
            java.lang.Object r6 = r7.a(r6, r2)
            if (r6 != r1) goto L_0x00f4
            return r1
        L_0x00f3:
            r13 = 3
        L_0x00f4:
            int r9 = r9 + r12
            goto L_0x00c7
        L_0x00f6:
            bp0.k r1 = bp0.k.f22762a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
