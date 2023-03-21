package androidx.compose.animation.core;

import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import defpackage.v1;
import e0.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.a;
import kotlin.jvm.internal.i;
import lp0.l;
import lp0.p;

/* compiled from: SuspendAnimation.kt */
public final class SuspendAnimationKt {
    public static final Object b(float f11, float f12, float f13, v1.g<Float> gVar, p<? super Float, ? super Float, k> pVar, c<? super k> cVar) {
        Object d11 = d(VectorConvertersKt.f(kotlin.jvm.internal.k.f25688a), a.c(f11), a.c(f12), a.c(f13), gVar, pVar, cVar);
        return d11 == b.d() ? d11 : k.f22762a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e5 A[Catch:{ CancellationException -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, V extends defpackage.v1.n> java.lang.Object c(defpackage.v1.i<T, V> r24, defpackage.v1.c<T, V> r25, long r26, lp0.l<? super defpackage.v1.f<T, V>, bp0.k> r28, fp0.c<? super bp0.k> r29) {
        /*
            r8 = r24
            r0 = r25
            r1 = r29
            boolean r2 = r1 instanceof androidx.compose.animation.core.SuspendAnimationKt$animate$4
            if (r2 == 0) goto L_0x0019
            r2 = r1
            androidx.compose.animation.core.SuspendAnimationKt$animate$4 r2 = (androidx.compose.animation.core.SuspendAnimationKt$animate$4) r2
            int r3 = r2.f2716f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.f2716f = r3
            goto L_0x001e
        L_0x0019:
            androidx.compose.animation.core.SuspendAnimationKt$animate$4 r2 = new androidx.compose.animation.core.SuspendAnimationKt$animate$4
            r2.<init>(r1)
        L_0x001e:
            r9 = r2
            java.lang.Object r1 = r9.f2715e
            java.lang.Object r10 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r9.f2716f
            r11 = 2
            r12 = 1
            if (r2 == 0) goto L_0x0065
            if (r2 == r12) goto L_0x0049
            if (r2 != r11) goto L_0x0041
            java.lang.Object r0 = r9.f2714d
            r2 = r0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r0 = r9.f2713c
            lp0.l r0 = (lp0.l) r0
            java.lang.Object r3 = r9.f2712b
            v1$c r3 = (defpackage.v1.c) r3
            java.lang.Object r4 = r9.f2711a
            v1$i r4 = (defpackage.v1.i) r4
            goto L_0x005a
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            java.lang.Object r0 = r9.f2714d
            r2 = r0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r0 = r9.f2713c
            lp0.l r0 = (lp0.l) r0
            java.lang.Object r3 = r9.f2712b
            v1$c r3 = (defpackage.v1.c) r3
            java.lang.Object r4 = r9.f2711a
            v1$i r4 = (defpackage.v1.i) r4
        L_0x005a:
            bp0.g.b(r1)     // Catch:{ CancellationException -> 0x0061 }
            r7 = r0
            r0 = r3
            goto L_0x00d8
        L_0x0061:
            r0 = move-exception
            r8 = r4
            goto L_0x0106
        L_0x0065:
            bp0.g.b(r1)
            r1 = 0
            java.lang.Object r14 = r0.e(r1)
            v1$n r16 = r0.g(r1)
            kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef
            r15.<init>()
            r1 = -9223372036854775808
            int r3 = (r26 > r1 ? 1 : (r26 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x00a7
            androidx.compose.animation.core.SuspendAnimationKt$animate$6 r13 = new androidx.compose.animation.core.SuspendAnimationKt$animate$6     // Catch:{ CancellationException -> 0x00a3 }
            r1 = r13
            r2 = r15
            r3 = r14
            r4 = r25
            r5 = r16
            r6 = r24
            r7 = r28
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ CancellationException -> 0x00a3 }
            r9.f2711a = r8     // Catch:{ CancellationException -> 0x00a3 }
            r9.f2712b = r0     // Catch:{ CancellationException -> 0x00a3 }
            r7 = r28
            r9.f2713c = r7     // Catch:{ CancellationException -> 0x00a3 }
            r9.f2714d = r15     // Catch:{ CancellationException -> 0x00a3 }
            r9.f2716f = r12     // Catch:{ CancellationException -> 0x00a3 }
            java.lang.Object r1 = i(r0, r13, r9)     // Catch:{ CancellationException -> 0x00a3 }
            if (r1 != r10) goto L_0x00a0
            return r10
        L_0x00a0:
            r4 = r8
            r2 = r15
            goto L_0x00d8
        L_0x00a3:
            r0 = move-exception
            r2 = r15
            goto L_0x0106
        L_0x00a7:
            r7 = r28
            v1$f r6 = new v1$f     // Catch:{ CancellationException -> 0x0103 }
            v1$q0 r1 = r25.d()     // Catch:{ CancellationException -> 0x0103 }
            java.lang.Object r19 = r25.f()     // Catch:{ CancellationException -> 0x0103 }
            r22 = 1
            androidx.compose.animation.core.SuspendAnimationKt$animate$7 r2 = new androidx.compose.animation.core.SuspendAnimationKt$animate$7     // Catch:{ CancellationException -> 0x0103 }
            r2.<init>(r8)     // Catch:{ CancellationException -> 0x0103 }
            r13 = r6
            r5 = r15
            r15 = r1
            r17 = r26
            r20 = r26
            r23 = r2
            r13.<init>(r14, r15, r16, r17, r19, r20, r22, r23)     // Catch:{ CancellationException -> 0x0100 }
            r1 = r6
            r2 = r26
            r4 = r25
            r13 = r5
            r5 = r24
            r14 = r6
            r6 = r28
            j(r1, r2, r4, r5, r6)     // Catch:{ CancellationException -> 0x00fe }
            r13.f25666a = r14     // Catch:{ CancellationException -> 0x00fe }
            r4 = r8
            r2 = r13
        L_0x00d8:
            T r1 = r2.f25666a     // Catch:{ CancellationException -> 0x0061 }
            kotlin.jvm.internal.p.g(r1)     // Catch:{ CancellationException -> 0x0061 }
            v1$f r1 = (defpackage.v1.f) r1     // Catch:{ CancellationException -> 0x0061 }
            boolean r1 = r1.h()     // Catch:{ CancellationException -> 0x0061 }
            if (r1 == 0) goto L_0x00fb
            androidx.compose.animation.core.SuspendAnimationKt$animate$9 r1 = new androidx.compose.animation.core.SuspendAnimationKt$animate$9     // Catch:{ CancellationException -> 0x0061 }
            r1.<init>(r2, r0, r4, r7)     // Catch:{ CancellationException -> 0x0061 }
            r9.f2711a = r4     // Catch:{ CancellationException -> 0x0061 }
            r9.f2712b = r0     // Catch:{ CancellationException -> 0x0061 }
            r9.f2713c = r7     // Catch:{ CancellationException -> 0x0061 }
            r9.f2714d = r2     // Catch:{ CancellationException -> 0x0061 }
            r9.f2716f = r11     // Catch:{ CancellationException -> 0x0061 }
            java.lang.Object r1 = i(r0, r1, r9)     // Catch:{ CancellationException -> 0x0061 }
            if (r1 != r10) goto L_0x00d8
            return r10
        L_0x00fb:
            bp0.k r0 = bp0.k.f22762a
            return r0
        L_0x00fe:
            r0 = move-exception
            goto L_0x0105
        L_0x0100:
            r0 = move-exception
            r13 = r5
            goto L_0x0105
        L_0x0103:
            r0 = move-exception
            r13 = r15
        L_0x0105:
            r2 = r13
        L_0x0106:
            T r1 = r2.f25666a
            v1$f r1 = (defpackage.v1.f) r1
            r3 = 0
            if (r1 != 0) goto L_0x010e
            goto L_0x0111
        L_0x010e:
            r1.k(r3)
        L_0x0111:
            T r1 = r2.f25666a
            v1$f r1 = (defpackage.v1.f) r1
            if (r1 != 0) goto L_0x0119
        L_0x0117:
            r12 = 0
            goto L_0x0125
        L_0x0119:
            long r1 = r1.c()
            long r4 = r8.f()
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0117
        L_0x0125:
            if (r12 == 0) goto L_0x012a
            r8.r(r3)
        L_0x012a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.c(v1$i, v1$c, long, lp0.l, fp0.c):java.lang.Object");
    }

    public static final <T, V extends v1.n> Object d(v1.q0<T, V> q0Var, T t, T t11, T t12, v1.g<T> gVar, p<? super T, ? super T, k> pVar, c<? super k> cVar) {
        T t13 = t12;
        v1.n nVar = t13 == null ? null : (v1.n) q0Var.a().invoke(t13);
        if (nVar == null) {
            nVar = v1.o.d((v1.n) q0Var.a().invoke(t));
        } else {
            T t14 = t;
        }
        v1.o0 o0Var = new v1.o0(gVar, q0Var, t, t11, nVar);
        v1.i iVar = new v1.i(q0Var, t, nVar, 0, 0, false, 56, (i) null);
        v1.q0<T, V> q0Var2 = q0Var;
        Object f11 = f(iVar, o0Var, 0, new SuspendAnimationKt$animate$3(pVar, q0Var), cVar, 2, (Object) null);
        return f11 == b.d() ? f11 : k.f22762a;
    }

    public static /* synthetic */ Object e(float f11, float f12, float f13, v1.g gVar, p pVar, c cVar, int i11, Object obj) {
        float f14 = (i11 & 4) != 0 ? 0.0f : f13;
        if ((i11 & 8) != 0) {
            gVar = v1.h.g(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        return b(f11, f12, f14, gVar, pVar, cVar);
    }

    public static /* synthetic */ Object f(v1.i iVar, v1.c cVar, long j, l lVar, c cVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j = Long.MIN_VALUE;
        }
        long j11 = j;
        if ((i11 & 4) != 0) {
            lVar = SuspendAnimationKt$animate$5.f2717a;
        }
        return c(iVar, cVar, j11, lVar, cVar2);
    }

    public static final <T, V extends v1.n> Object g(v1.i<T, V> iVar, v1.u<T> uVar, boolean z11, l<? super v1.f<T, V>, k> lVar, c<? super k> cVar) {
        Object c11 = c(iVar, new v1.t(uVar, iVar.k(), iVar.getValue(), iVar.n()), z11 ? iVar.f() : Long.MIN_VALUE, lVar, cVar);
        return c11 == b.d() ? c11 : k.f22762a;
    }

    public static /* synthetic */ Object h(v1.i iVar, v1.u uVar, boolean z11, l lVar, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            lVar = SuspendAnimationKt$animateDecay$4.f2730a;
        }
        return g(iVar, uVar, z11, lVar, cVar);
    }

    private static final <R, T, V extends v1.n> Object i(v1.c<T, V> cVar, l<? super Long, ? extends R> lVar, c<? super R> cVar2) {
        if (cVar.a()) {
            return InfiniteAnimationPolicyKt.a(lVar, cVar2);
        }
        return d0.b(new SuspendAnimationKt$callWithFrameNanos$2(lVar), cVar2);
    }

    /* access modifiers changed from: private */
    public static final <T, V extends v1.n> void j(v1.f<T, V> fVar, long j, v1.c<T, V> cVar, v1.i<T, V> iVar, l<? super v1.f<T, V>, k> lVar) {
        fVar.j(j);
        long d11 = j - fVar.d();
        fVar.l(cVar.e(d11));
        fVar.m(cVar.g(d11));
        if (cVar.b(d11)) {
            fVar.i(fVar.c());
            fVar.k(false);
        }
        k(fVar, iVar);
        lVar.invoke(fVar);
    }

    public static final <T, V extends v1.n> void k(v1.f<T, V> fVar, v1.i<T, V> iVar) {
        kotlin.jvm.internal.p.j(fVar, "<this>");
        kotlin.jvm.internal.p.j(iVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        iVar.s(fVar.e());
        v1.o.c(iVar.n(), fVar.g());
        iVar.p(fVar.b());
        iVar.q(fVar.c());
        iVar.r(fVar.h());
    }
}
