package androidx.compose.animation.core;

import bp0.k;
import defpackage.v1;
import e0.d1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;
import lp0.p;
import wp0.j0;
import yp0.f;

@d(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", l = {368}, m = "invokeSuspend")
/* compiled from: AnimateAsState.kt */
final class AnimateAsStateKt$animateValueAsState$3 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f2641a;

    /* renamed from: b  reason: collision with root package name */
    int f2642b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f2643c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ f<T> f2644d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Animatable<T, V> f2645e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ d1<v1.g<T>> f2646f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ d1<l<T, k>> f2647g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimateAsStateKt$animateValueAsState$3(f<T> fVar, Animatable<T, V> animatable, d1<? extends v1.g<T>> d1Var, d1<? extends l<? super T, k>> d1Var2, c<? super AnimateAsStateKt$animateValueAsState$3> cVar) {
        super(2, cVar);
        this.f2644d = fVar;
        this.f2645e = animatable;
        this.f2646f = d1Var;
        this.f2647g = d1Var2;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        AnimateAsStateKt$animateValueAsState$3 animateAsStateKt$animateValueAsState$3 = new AnimateAsStateKt$animateValueAsState$3(this.f2644d, this.f2645e, this.f2646f, this.f2647g, cVar);
        animateAsStateKt$animateValueAsState$3.f2643c = obj;
        return animateAsStateKt$animateValueAsState$3;
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((AnimateAsStateKt$animateValueAsState$3) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f2642b
            r3 = 1
            if (r2 == 0) goto L_0x0024
            if (r2 != r3) goto L_0x001c
            java.lang.Object r2 = r0.f2641a
            yp0.h r2 = (yp0.h) r2
            java.lang.Object r4 = r0.f2643c
            wp0.j0 r4 = (wp0.j0) r4
            bp0.g.b(r18)
            r6 = r18
            r5 = r0
            goto L_0x0044
        L_0x001c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0024:
            bp0.g.b(r18)
            java.lang.Object r2 = r0.f2643c
            wp0.j0 r2 = (wp0.j0) r2
            yp0.f<T> r4 = r0.f2644d
            yp0.h r4 = r4.iterator()
            r5 = r0
            r16 = r4
            r4 = r2
            r2 = r16
        L_0x0037:
            r5.f2643c = r4
            r5.f2641a = r2
            r5.f2642b = r3
            java.lang.Object r6 = r2.a(r5)
            if (r6 != r1) goto L_0x0044
            return r1
        L_0x0044:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0078
            java.lang.Object r6 = r2.next()
            yp0.f<T> r7 = r5.f2644d
            java.lang.Object r7 = r7.h()
            java.lang.Object r7 = yp0.j.f(r7)
            if (r7 != 0) goto L_0x005e
            r9 = r6
            goto L_0x005f
        L_0x005e:
            r9 = r7
        L_0x005f:
            r6 = 0
            r14 = 0
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1 r15 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1
            androidx.compose.animation.core.Animatable<T, V> r10 = r5.f2645e
            e0.d1<v1$g<T>> r11 = r5.f2646f
            e0.d1<lp0.l<T, bp0.k>> r12 = r5.f2647g
            r13 = 0
            r8 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r11 = 3
            r12 = 0
            r7 = r4
            r8 = r6
            r9 = r14
            r10 = r15
            wp0.k1 unused = wp0.j.d(r7, r8, r9, r10, r11, r12)
            goto L_0x0037
        L_0x0078:
            bp0.k r1 = bp0.k.f22762a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
