package androidx.compose.foundation.gestures;

import defpackage.v1;
import defpackage.y1;
import kotlin.jvm.internal.p;

/* compiled from: Scrollable.kt */
final class DefaultFlingBehavior implements y1.k {

    /* renamed from: a  reason: collision with root package name */
    private final v1.u<Float> f3215a;

    public DefaultFlingBehavior(v1.u<Float> uVar) {
        p.j(uVar, "flingDecay");
        this.f3215a = uVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(defpackage.y1.p r18, float r19, fp0.c<? super java.lang.Float> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1 r2 = (androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1) r2
            int r3 = r2.f3219d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f3219d = r3
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1 r2 = new androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1
            r2.<init>(r0, r1)
        L_0x001c:
            r7 = r2
            java.lang.Object r1 = r7.f3217b
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.d()
            int r3 = r7.f3219d
            r4 = 1
            if (r3 == 0) goto L_0x003a
            if (r3 != r4) goto L_0x0032
            java.lang.Object r2 = r7.f3216a
            kotlin.jvm.internal.Ref$FloatRef r2 = (kotlin.jvm.internal.Ref$FloatRef) r2
            bp0.g.b(r1)
            goto L_0x0082
        L_0x0032:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003a:
            bp0.g.b(r1)
            float r1 = java.lang.Math.abs(r19)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0085
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r3 = r19
            r1.f25663a = r3
            kotlin.jvm.internal.Ref$FloatRef r5 = new kotlin.jvm.internal.Ref$FloatRef
            r5.<init>()
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 28
            r16 = 0
            r9 = r19
            v1$i r3 = defpackage.v1.j.b(r8, r9, r10, r12, r14, r15, r16)
            v1$u<java.lang.Float> r6 = r0.f3215a
            r8 = 0
            androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2 r9 = new androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2
            r10 = r18
            r9.<init>(r5, r10, r1)
            r10 = 2
            r11 = 0
            r7.f3216a = r1
            r7.f3219d = r4
            r4 = r6
            r5 = r8
            r6 = r9
            r8 = r10
            r9 = r11
            java.lang.Object r3 = androidx.compose.animation.core.SuspendAnimationKt.h(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x0081
            return r2
        L_0x0081:
            r2 = r1
        L_0x0082:
            float r1 = r2.f25663a
            goto L_0x0088
        L_0x0085:
            r3 = r19
            r1 = r3
        L_0x0088:
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.a.c(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DefaultFlingBehavior.a(y1$p, float, fp0.c):java.lang.Object");
    }
}
