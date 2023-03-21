package androidx.compose.foundation;

import bp0.k;
import defpackage.y1;
import e0.d1;
import e0.h0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.a;
import lp0.p;
import u.n;
import wp0.j0;

@d(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", l = {412, 414, 421, 422, 431}, m = "invokeSuspend")
/* compiled from: Clickable.kt */
final class ClickableKt$handlePressInteraction$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    boolean f2941a;

    /* renamed from: b  reason: collision with root package name */
    int f2942b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f2943c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ y1.n f2944d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f2945e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ u.k f2946f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ h0<n> f2947g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ d1<a<Boolean>> f2948h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$handlePressInteraction$2(y1.n nVar, long j, u.k kVar, h0<n> h0Var, d1<? extends a<Boolean>> d1Var, c<? super ClickableKt$handlePressInteraction$2> cVar) {
        super(2, cVar);
        this.f2944d = nVar;
        this.f2945e = j;
        this.f2946f = kVar;
        this.f2947g = h0Var;
        this.f2948h = d1Var;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new ClickableKt$handlePressInteraction$2(this.f2944d, this.f2945e, this.f2946f, this.f2947g, this.f2948h, cVar);
        clickableKt$handlePressInteraction$2.f2943c = obj;
        return clickableKt$handlePressInteraction$2;
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((ClickableKt$handlePressInteraction$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f2942b
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r7) goto L_0x0037
            if (r2 == r6) goto L_0x0031
            if (r2 == r5) goto L_0x0028
            if (r2 == r4) goto L_0x0023
            if (r2 != r3) goto L_0x001b
            goto L_0x0023
        L_0x001b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0023:
            bp0.g.b(r20)
            goto L_0x00da
        L_0x0028:
            java.lang.Object r2 = r0.f2943c
            u.o r2 = (u.o) r2
            bp0.g.b(r20)
            goto L_0x00a8
        L_0x0031:
            boolean r2 = r0.f2941a
            bp0.g.b(r20)
            goto L_0x008c
        L_0x0037:
            java.lang.Object r2 = r0.f2943c
            wp0.k1 r2 = (wp0.k1) r2
            bp0.g.b(r20)
            r3 = r20
            goto L_0x0072
        L_0x0041:
            bp0.g.b(r20)
            java.lang.Object r2 = r0.f2943c
            r9 = r2
            wp0.j0 r9 = (wp0.j0) r9
            r10 = 0
            r11 = 0
            androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1 r2 = new androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1
            e0.d1<lp0.a<java.lang.Boolean>> r13 = r0.f2948h
            long r14 = r0.f2945e
            u.k r12 = r0.f2946f
            e0.h0<u.n> r3 = r0.f2947g
            r18 = 0
            r16 = r12
            r12 = r2
            r17 = r3
            r12.<init>(r13, r14, r16, r17, r18)
            r13 = 3
            r14 = 0
            wp0.k1 r2 = wp0.j.d(r9, r10, r11, r12, r13, r14)
            y1$n r3 = r0.f2944d
            r0.f2943c = r2
            r0.f2942b = r7
            java.lang.Object r3 = r3.H(r0)
            if (r3 != r1) goto L_0x0072
            return r1
        L_0x0072:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r7 = r2.b()
            if (r7 == 0) goto L_0x00b5
            r0.f2943c = r8
            r0.f2941a = r3
            r0.f2942b = r6
            java.lang.Object r2 = wp0.n1.g(r2, r0)
            if (r2 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r2 = r3
        L_0x008c:
            if (r2 == 0) goto L_0x00da
            u.n r2 = new u.n
            long r6 = r0.f2945e
            r2.<init>(r6, r8)
            u.o r3 = new u.o
            r3.<init>(r2)
            u.k r6 = r0.f2946f
            r0.f2943c = r3
            r0.f2942b = r5
            java.lang.Object r2 = r6.c(r2, r0)
            if (r2 != r1) goto L_0x00a7
            return r1
        L_0x00a7:
            r2 = r3
        L_0x00a8:
            u.k r3 = r0.f2946f
            r0.f2943c = r8
            r0.f2942b = r4
            java.lang.Object r2 = r3.c(r2, r0)
            if (r2 != r1) goto L_0x00da
            return r1
        L_0x00b5:
            e0.h0<u.n> r2 = r0.f2947g
            java.lang.Object r2 = r2.getValue()
            u.n r2 = (u.n) r2
            if (r2 == 0) goto L_0x00da
            u.k r4 = r0.f2946f
            if (r3 == 0) goto L_0x00c9
            u.o r3 = new u.o
            r3.<init>(r2)
            goto L_0x00ce
        L_0x00c9:
            u.m r3 = new u.m
            r3.<init>(r2)
        L_0x00ce:
            r0.f2943c = r8
            r2 = 5
            r0.f2942b = r2
            java.lang.Object r2 = r4.c(r3, r0)
            if (r2 != r1) goto L_0x00da
            return r1
        L_0x00da:
            e0.h0<u.n> r1 = r0.f2947g
            r1.setValue(r8)
            bp0.k r1 = bp0.k.f22762a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$handlePressInteraction$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
