package androidx.compose.foundation.relocation;

import f0.e;
import y.d;

/* compiled from: BringIntoViewRequester.kt */
final class BringIntoViewRequesterImpl implements d {

    /* renamed from: a  reason: collision with root package name */
    private final e<b> f4140a = new e<>(new b[16], 0);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        if (r7 >= r2) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(t0.h r7, fp0.c<? super bp0.k> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) r0
            int r1 = r0.f4147g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f4147g = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f4145e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f4147g
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            int r7 = r0.f4144d
            int r2 = r0.f4143c
            java.lang.Object r4 = r0.f4142b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f4141a
            t0.h r5 = (t0.h) r5
            bp0.g.b(r8)
            r8 = r5
            goto L_0x0066
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            bp0.g.b(r8)
            f0.e<androidx.compose.foundation.relocation.b> r8 = r6.f4140a
            int r2 = r8.m()
            if (r2 <= 0) goto L_0x0069
            r4 = 0
            java.lang.Object[] r8 = r8.l()
            r4 = r8
            r8 = r7
            r7 = 0
        L_0x0051:
            r5 = r4[r7]
            androidx.compose.foundation.relocation.b r5 = (androidx.compose.foundation.relocation.b) r5
            r0.f4141a = r8
            r0.f4142b = r4
            r0.f4143c = r2
            r0.f4144d = r7
            r0.f4147g = r3
            java.lang.Object r5 = r5.e(r8, r0)
            if (r5 != r1) goto L_0x0066
            return r1
        L_0x0066:
            int r7 = r7 + r3
            if (r7 < r2) goto L_0x0051
        L_0x0069:
            bp0.k r7 = bp0.k.f22762a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.a(t0.h, fp0.c):java.lang.Object");
    }

    public final e<b> b() {
        return this.f4140a;
    }
}
