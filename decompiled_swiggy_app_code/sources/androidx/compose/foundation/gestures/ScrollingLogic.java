package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import d2.u;
import d2.v;
import defpackage.y1;
import e0.d1;
import kotlin.jvm.internal.p;
import s.l;
import t0.f;
import t0.g;

/* compiled from: Scrollable.kt */
final class ScrollingLogic {

    /* renamed from: a  reason: collision with root package name */
    private final Orientation f3516a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3517b;

    /* renamed from: c  reason: collision with root package name */
    private final d1<NestedScrollDispatcher> f3518c;

    /* renamed from: d  reason: collision with root package name */
    private final y1.r f3519d;

    /* renamed from: e  reason: collision with root package name */
    private final y1.k f3520e;

    /* renamed from: f  reason: collision with root package name */
    private final l f3521f;

    public ScrollingLogic(Orientation orientation, boolean z11, d1<NestedScrollDispatcher> d1Var, y1.r rVar, y1.k kVar, l lVar) {
        p.j(orientation, "orientation");
        p.j(d1Var, "nestedScrollDispatcher");
        p.j(rVar, "scrollableState");
        p.j(kVar, "flingBehavior");
        this.f3516a = orientation;
        this.f3517b = z11;
        this.f3518c = d1Var;
        this.f3519d = rVar;
        this.f3520e = kVar;
        this.f3521f = lVar;
    }

    public final long a(y1.p pVar, long j, f fVar, int i11) {
        long j11;
        y1.p pVar2 = pVar;
        long j12 = j;
        int i12 = i11;
        p.j(pVar, "$this$dispatchScroll");
        l lVar = this.f3521f;
        if (lVar == null || !lVar.isEnabled()) {
            f fVar2 = fVar;
            j11 = f.f16662b.c();
        } else {
            j11 = this.f3521f.c(j12, fVar, i12);
        }
        long q = f.q(j12, j11);
        NestedScrollDispatcher value = this.f3518c.getValue();
        long q11 = f.q(q, value.d(q, i12));
        long h11 = h(l(pVar.a(k(h(q11)))));
        long q12 = f.q(q11, h11);
        long b11 = value.b(h11, q12, i11);
        l lVar2 = this.f3521f;
        if (lVar2 != null && lVar2.isEnabled()) {
            this.f3521f.a(q11, f.q(q12, b11), fVar, i11);
        }
        return q12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(long r13, fp0.c<? super d2.u> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.f3525d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3525d = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r12, r15)
        L_0x0018:
            r4 = r0
            java.lang.Object r15 = r4.f3523b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r4.f3525d
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r13 = r4.f3522a
            kotlin.jvm.internal.Ref$LongRef r13 = (kotlin.jvm.internal.Ref$LongRef) r13
            bp0.g.b(r15)
            goto L_0x005d
        L_0x002e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0036:
            bp0.g.b(r15)
            kotlin.jvm.internal.Ref$LongRef r15 = new kotlin.jvm.internal.Ref$LongRef
            r15.<init>()
            r15.f25665a = r13
            y1$r r1 = r12.f3519d
            r3 = 0
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r11 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r15
            r8 = r13
            r5.<init>(r6, r7, r8, r10)
            r5 = 1
            r6 = 0
            r4.f3522a = r15
            r4.f3525d = r2
            r2 = r3
            r3 = r11
            java.lang.Object r13 = defpackage.y1.q.a(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L_0x005c
            return r0
        L_0x005c:
            r13 = r15
        L_0x005d:
            long r13 = r13.f25665a
            d2.u r13 = d2.u.b(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.b(long, fp0.c):java.lang.Object");
    }

    public final y1.k c() {
        return this.f3520e;
    }

    public final y1.r d() {
        return this.f3519d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(float r13, fp0.c<? super bp0.k> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1) r0
            int r1 = r0.f3544g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3544g = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f3542e
            java.lang.Object r7 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r0.f3544g
            r8 = 0
            r9 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x006d
            if (r1 == r5) goto L_0x005f
            if (r1 == r4) goto L_0x0055
            if (r1 == r3) goto L_0x004a
            if (r1 == r2) goto L_0x003f
            if (r1 != r9) goto L_0x0037
            bp0.g.b(r14)
            goto L_0x0125
        L_0x0037:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003f:
            long r1 = r0.f3541d
            java.lang.Object r13 = r0.f3538a
            androidx.compose.foundation.gestures.ScrollingLogic r13 = (androidx.compose.foundation.gestures.ScrollingLogic) r13
            bp0.g.b(r14)
            goto L_0x00fc
        L_0x004a:
            long r3 = r0.f3541d
            java.lang.Object r13 = r0.f3538a
            androidx.compose.foundation.gestures.ScrollingLogic r13 = (androidx.compose.foundation.gestures.ScrollingLogic) r13
            bp0.g.b(r14)
            goto L_0x00d8
        L_0x0055:
            long r4 = r0.f3541d
            java.lang.Object r13 = r0.f3538a
            androidx.compose.foundation.gestures.ScrollingLogic r13 = (androidx.compose.foundation.gestures.ScrollingLogic) r13
            bp0.g.b(r14)
            goto L_0x00c0
        L_0x005f:
            float r13 = r0.f3540c
            java.lang.Object r1 = r0.f3539b
            androidx.compose.foundation.gestures.ScrollingLogic r1 = (androidx.compose.foundation.gestures.ScrollingLogic) r1
            java.lang.Object r5 = r0.f3538a
            androidx.compose.foundation.gestures.ScrollingLogic r5 = (androidx.compose.foundation.gestures.ScrollingLogic) r5
            bp0.g.b(r14)
            goto L_0x0091
        L_0x006d:
            bp0.g.b(r14)
            s.l r14 = r12.f3521f
            if (r14 == 0) goto L_0x009f
            boolean r14 = r14.isEnabled()
            if (r14 == 0) goto L_0x009f
            s.l r14 = r12.f3521f
            long r10 = r12.m(r13)
            r0.f3538a = r12
            r0.f3539b = r12
            r0.f3540c = r13
            r0.f3544g = r5
            java.lang.Object r14 = r14.f(r10, r0)
            if (r14 != r7) goto L_0x008f
            return r7
        L_0x008f:
            r1 = r12
            r5 = r1
        L_0x0091:
            d2.u r14 = (d2.u) r14
            long r10 = r14.n()
            float r14 = r1.j(r10)
            r1 = r14
            r14 = r13
            r13 = r5
            goto L_0x00a3
        L_0x009f:
            r14 = 0
            r14 = r13
            r1 = 0
            r13 = r12
        L_0x00a3:
            float r14 = r14 - r1
            long r5 = r13.m(r14)
            e0.d1<androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher> r14 = r13.f3518c
            java.lang.Object r14 = r14.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r14 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher) r14
            r0.f3538a = r13
            r0.f3539b = r8
            r0.f3541d = r5
            r0.f3544g = r4
            java.lang.Object r14 = r14.c(r5, r0)
            if (r14 != r7) goto L_0x00bf
            return r7
        L_0x00bf:
            r4 = r5
        L_0x00c0:
            d2.u r14 = (d2.u) r14
            long r10 = r14.n()
            long r4 = d2.u.k(r4, r10)
            r0.f3538a = r13
            r0.f3541d = r4
            r0.f3544g = r3
            java.lang.Object r14 = r13.b(r4, r0)
            if (r14 != r7) goto L_0x00d7
            return r7
        L_0x00d7:
            r3 = r4
        L_0x00d8:
            d2.u r14 = (d2.u) r14
            long r10 = r14.n()
            e0.d1<androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher> r14 = r13.f3518c
            java.lang.Object r14 = r14.getValue()
            r1 = r14
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher) r1
            long r3 = d2.u.k(r3, r10)
            r0.f3538a = r13
            r0.f3541d = r10
            r0.f3544g = r2
            r2 = r3
            r4 = r10
            r6 = r0
            java.lang.Object r14 = r1.a(r2, r4, r6)
            if (r14 != r7) goto L_0x00fb
            return r7
        L_0x00fb:
            r1 = r10
        L_0x00fc:
            d2.u r14 = (d2.u) r14
            long r3 = r14.n()
            long r1 = d2.u.k(r1, r3)
            s.l r14 = r13.f3521f
            if (r14 == 0) goto L_0x0128
            boolean r14 = r14.isEnabled()
            if (r14 == 0) goto L_0x0128
            s.l r14 = r13.f3521f
            float r1 = r13.j(r1)
            long r1 = r13.m(r1)
            r0.f3538a = r8
            r0.f3544g = r9
            java.lang.Object r13 = r14.e(r1, r0)
            if (r13 != r7) goto L_0x0125
            return r7
        L_0x0125:
            bp0.k r13 = bp0.k.f22762a
            return r13
        L_0x0128:
            bp0.k r13 = bp0.k.f22762a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.e(float, fp0.c):java.lang.Object");
    }

    public final long f(long j) {
        if (this.f3519d.a()) {
            return f.f16662b.c();
        }
        return l(g(this.f3519d.b(g(k(j)))));
    }

    public final float g(float f11) {
        return this.f3517b ? f11 * ((float) -1) : f11;
    }

    public final long h(long j) {
        return this.f3517b ? f.s(j, -1.0f) : j;
    }

    public final boolean i() {
        if (!this.f3519d.a()) {
            l lVar = this.f3521f;
            if (lVar != null ? lVar.b() : false) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final float j(long j) {
        return this.f3516a == Orientation.Horizontal ? u.h(j) : u.i(j);
    }

    public final float k(long j) {
        return this.f3516a == Orientation.Horizontal ? f.m(j) : f.n(j);
    }

    public final long l(float f11) {
        if (f11 == 0.0f) {
            return f.f16662b.c();
        }
        if (this.f3516a == Orientation.Horizontal) {
            return g.a(f11, 0.0f);
        }
        return g.a(0.0f, f11);
    }

    public final long m(float f11) {
        return this.f3516a == Orientation.Horizontal ? v.a(f11, 0.0f) : v.a(0.0f, f11);
    }

    public final long n(long j, float f11) {
        return this.f3516a == Orientation.Horizontal ? u.e(j, f11, 0.0f, 2, (Object) null) : u.e(j, 0.0f, f11, 1, (Object) null);
    }
}
