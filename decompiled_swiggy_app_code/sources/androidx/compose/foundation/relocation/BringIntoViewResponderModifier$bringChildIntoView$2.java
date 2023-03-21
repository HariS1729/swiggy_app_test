package androidx.compose.foundation.relocation;

import bp0.k;
import fp0.c;
import i1.m;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import t0.h;
import wp0.j0;

@d(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2", f = "BringIntoViewResponder.kt", l = {214, 223, 230}, m = "invokeSuspend")
/* compiled from: BringIntoViewResponder.kt */
final class BringIntoViewResponderModifier$bringChildIntoView$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f4159a;

    /* renamed from: b  reason: collision with root package name */
    Object f4160b;

    /* renamed from: c  reason: collision with root package name */
    int f4161c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ Object f4162d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ BringIntoViewResponderModifier f4163e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ m f4164f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ h f4165g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BringIntoViewResponderModifier$bringChildIntoView$2(BringIntoViewResponderModifier bringIntoViewResponderModifier, m mVar, h hVar, c<? super BringIntoViewResponderModifier$bringChildIntoView$2> cVar) {
        super(2, cVar);
        this.f4163e = bringIntoViewResponderModifier;
        this.f4164f = mVar;
        this.f4165g = hVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        BringIntoViewResponderModifier$bringChildIntoView$2 bringIntoViewResponderModifier$bringChildIntoView$2 = new BringIntoViewResponderModifier$bringChildIntoView$2(this.f4163e, this.f4164f, this.f4165g, cVar);
        bringIntoViewResponderModifier$bringChildIntoView$2.f4162d = obj;
        return bringIntoViewResponderModifier$bringChildIntoView$2;
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((BringIntoViewResponderModifier$bringChildIntoView$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r9.f4161c
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0044
            if (r1 == r4) goto L_0x0038
            if (r1 == r3) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            java.lang.Object r0 = r9.f4162d
            kotlin.Pair r0 = (kotlin.Pair) r0
            bp0.g.b(r10)     // Catch:{ all -> 0x0041 }
            goto L_0x00c2
        L_0x001b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0023:
            java.lang.Object r1 = r9.f4160b
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r3 = r9.f4159a
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r4 = r9.f4162d
            i1.m r4 = (i1.m) r4
            bp0.g.b(r10)     // Catch:{ all -> 0x0034 }
            goto L_0x00a8
        L_0x0034:
            r10 = move-exception
            r0 = r3
            goto L_0x0119
        L_0x0038:
            java.lang.Object r0 = r9.f4162d
            kotlin.Pair r0 = (kotlin.Pair) r0
            bp0.g.b(r10)     // Catch:{ all -> 0x0041 }
            goto L_0x00f4
        L_0x0041:
            r10 = move-exception
            goto L_0x0119
        L_0x0044:
            bp0.g.b(r10)
            java.lang.Object r10 = r9.f4162d
            wp0.j0 r10 = (wp0.j0) r10
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r1 = r9.f4163e
            i1.m r1 = r1.c()
            if (r1 != 0) goto L_0x0056
            bp0.k r10 = bp0.k.f22762a
            return r10
        L_0x0056:
            i1.m r6 = r9.f4164f
            boolean r6 = r6.D()
            if (r6 != 0) goto L_0x0061
            bp0.k r10 = bp0.k.f22762a
            return r10
        L_0x0061:
            i1.m r6 = r9.f4164f
            t0.h r7 = r9.f4165g
            t0.h r6 = androidx.compose.foundation.relocation.BringIntoViewResponderKt.e(r1, r6, r7)
            kotlin.coroutines.CoroutineContext r10 = r10.X0()
            wp0.k1 r10 = wp0.n1.l(r10)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r6, r10)
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r10 = r9.f4163e
            kotlin.Pair r10 = r10.f4157e
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r8 = r9.f4163e
            r8.f4157e = r7
            if (r10 == 0) goto L_0x00e6
            java.lang.Object r8 = r10.c()     // Catch:{ all -> 0x0117 }
            t0.h r8 = (t0.h) r8     // Catch:{ all -> 0x0117 }
            boolean r6 = androidx.compose.foundation.relocation.BringIntoViewResponderKt.d(r8, r6)     // Catch:{ all -> 0x0117 }
            if (r6 != 0) goto L_0x0090
            goto L_0x00e6
        L_0x0090:
            java.lang.Object r4 = r10.d()     // Catch:{ all -> 0x0117 }
            wp0.k1 r4 = (wp0.k1) r4     // Catch:{ all -> 0x0117 }
            r9.f4162d = r1     // Catch:{ all -> 0x0117 }
            r9.f4159a = r7     // Catch:{ all -> 0x0117 }
            r9.f4160b = r10     // Catch:{ all -> 0x0117 }
            r9.f4161c = r3     // Catch:{ all -> 0x0117 }
            java.lang.Object r3 = r4.x(r9)     // Catch:{ all -> 0x0117 }
            if (r3 != r0) goto L_0x00a5
            return r0
        L_0x00a5:
            r4 = r1
            r3 = r7
            r1 = r10
        L_0x00a8:
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r10 = r9.f4163e     // Catch:{ all -> 0x0034 }
            kotlin.Pair r10 = r10.f4158f     // Catch:{ all -> 0x0034 }
            if (r10 != r1) goto L_0x00c3
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r10 = r9.f4163e     // Catch:{ all -> 0x0034 }
            r9.f4162d = r3     // Catch:{ all -> 0x0034 }
            r9.f4159a = r5     // Catch:{ all -> 0x0034 }
            r9.f4160b = r5     // Catch:{ all -> 0x0034 }
            r9.f4161c = r2     // Catch:{ all -> 0x0034 }
            java.lang.Object r10 = r10.j(r3, r4, r9)     // Catch:{ all -> 0x0034 }
            if (r10 != r0) goto L_0x00c1
            return r0
        L_0x00c1:
            r0 = r3
        L_0x00c2:
            r3 = r0
        L_0x00c3:
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r10 = r9.f4163e
            kotlin.Pair r10 = r10.f4158f
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r0 = r9.f4163e
            kotlin.Pair r0 = r0.f4157e
            if (r10 != r0) goto L_0x00d6
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r10 = r9.f4163e
            r10.f4158f = r5
        L_0x00d6:
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r10 = r9.f4163e
            kotlin.Pair r10 = r10.f4157e
            if (r10 != r3) goto L_0x00e3
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r10 = r9.f4163e
            r10.f4157e = r5
        L_0x00e3:
            bp0.k r10 = bp0.k.f22762a
            return r10
        L_0x00e6:
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r10 = r9.f4163e     // Catch:{ all -> 0x0117 }
            r9.f4162d = r7     // Catch:{ all -> 0x0117 }
            r9.f4161c = r4     // Catch:{ all -> 0x0117 }
            java.lang.Object r10 = r10.j(r7, r1, r9)     // Catch:{ all -> 0x0117 }
            if (r10 != r0) goto L_0x00f3
            return r0
        L_0x00f3:
            r0 = r7
        L_0x00f4:
            bp0.k r10 = bp0.k.f22762a     // Catch:{ all -> 0x0041 }
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r1 = r9.f4163e
            kotlin.Pair r1 = r1.f4158f
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r2 = r9.f4163e
            kotlin.Pair r2 = r2.f4157e
            if (r1 != r2) goto L_0x0109
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r1 = r9.f4163e
            r1.f4158f = r5
        L_0x0109:
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r1 = r9.f4163e
            kotlin.Pair r1 = r1.f4157e
            if (r1 != r0) goto L_0x0116
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r0 = r9.f4163e
            r0.f4157e = r5
        L_0x0116:
            return r10
        L_0x0117:
            r10 = move-exception
            r0 = r7
        L_0x0119:
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r1 = r9.f4163e
            kotlin.Pair r1 = r1.f4158f
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r2 = r9.f4163e
            kotlin.Pair r2 = r2.f4157e
            if (r1 != r2) goto L_0x012c
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r1 = r9.f4163e
            r1.f4158f = r5
        L_0x012c:
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r1 = r9.f4163e
            kotlin.Pair r1 = r1.f4157e
            if (r1 != r0) goto L_0x0139
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r0 = r9.f4163e
            r0.f4157e = r5
        L_0x0139:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
