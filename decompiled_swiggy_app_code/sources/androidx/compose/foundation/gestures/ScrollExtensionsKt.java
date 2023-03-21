package androidx.compose.foundation.gestures;

import defpackage.v1;
import defpackage.y1;
import fp0.c;

/* compiled from: ScrollExtensions.kt */
public final class ScrollExtensionsKt {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.y1.r r7, float r8, defpackage.v1.g<java.lang.Float> r9, fp0.c<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1) r0
            int r1 = r0.f3463c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3463c = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1
            r0.<init>(r10)
        L_0x0018:
            r4 = r0
            java.lang.Object r10 = r4.f3462b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r4.f3463c
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r7 = r4.f3461a
            kotlin.jvm.internal.Ref$FloatRef r7 = (kotlin.jvm.internal.Ref$FloatRef) r7
            bp0.g.b(r10)
            goto L_0x0057
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            bp0.g.b(r10)
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            r3 = 0
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 r5 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2
            r1 = 0
            r5.<init>(r8, r9, r10, r1)
            r8 = 1
            r6 = 0
            r4.f3461a = r10
            r4.f3463c = r2
            r1 = r7
            r2 = r3
            r3 = r5
            r5 = r8
            java.lang.Object r7 = defpackage.y1.q.a(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r7 = r10
        L_0x0057:
            float r7 = r7.f25663a
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.a.c(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.a(y1$r, float, v1$g, fp0.c):java.lang.Object");
    }

    public static /* synthetic */ Object b(y1.r rVar, float f11, v1.g gVar, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            gVar = v1.h.g(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        return a(rVar, f11, gVar, cVar);
    }
}
