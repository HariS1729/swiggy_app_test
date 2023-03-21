package androidx.compose.runtime;

import e0.b0;
import e0.c0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.p;

/* compiled from: PausableMonotonicFrameClock.kt */
public final class PausableMonotonicFrameClock implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final c0 f6015a;

    /* renamed from: b  reason: collision with root package name */
    private final Latch f6016b = new Latch();

    public PausableMonotonicFrameClock(c0 c0Var) {
        p.j(c0Var, "frameClock");
        this.f6015a = c0Var;
    }

    public final void c() {
        this.f6016b.d();
    }

    public final void d() {
        this.f6016b.f();
    }

    public <R> R fold(R r11, lp0.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        return c0.a.a(this, r11, pVar);
    }

    public <E extends CoroutineContext.a> E get(CoroutineContext.b<E> bVar) {
        return c0.a.b(this, bVar);
    }

    public /* synthetic */ CoroutineContext.b getKey() {
        return b0.a(this);
    }

    public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return c0.a.c(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return c0.a.d(this, coroutineContext);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063 A[PHI: r7 
      PHI: (r7v2 java.lang.Object) = (r7v4 java.lang.Object), (r7v1 java.lang.Object) binds: [B:19:0x0060, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <R> java.lang.Object w0(lp0.l<? super java.lang.Long, ? extends R> r6, fp0.c<? super R> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = (androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1) r0
            int r1 = r0.f6021e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6021e = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = new androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f6019c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f6021e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            bp0.g.b(r7)
            goto L_0x0063
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.f6018b
            lp0.l r6 = (lp0.l) r6
            java.lang.Object r2 = r0.f6017a
            androidx.compose.runtime.PausableMonotonicFrameClock r2 = (androidx.compose.runtime.PausableMonotonicFrameClock) r2
            bp0.g.b(r7)
            goto L_0x0053
        L_0x0040:
            bp0.g.b(r7)
            androidx.compose.runtime.Latch r7 = r5.f6016b
            r0.f6017a = r5
            r0.f6018b = r6
            r0.f6021e = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r2 = r5
        L_0x0053:
            e0.c0 r7 = r2.f6015a
            r2 = 0
            r0.f6017a = r2
            r0.f6018b = r2
            r0.f6021e = r3
            java.lang.Object r7 = r7.w0(r6, r0)
            if (r7 != r1) goto L_0x0063
            return r1
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.w0(lp0.l, fp0.c):java.lang.Object");
    }
}
