package androidx.compose.animation.core;

import defpackage.v1;
import e0.d1;
import e0.g;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.p;

/* compiled from: InfiniteTransition.kt */
public final class InfiniteTransitionKt {
    public static final d1<Float> a(InfiniteTransition infiniteTransition, float f11, float f12, v1.f0<Float> f0Var, g gVar, int i11) {
        p.j(infiniteTransition, "<this>");
        p.j(f0Var, "animationSpec");
        gVar.E(1399864148);
        d1<Float> b11 = b(infiniteTransition, Float.valueOf(f11), Float.valueOf(f12), VectorConvertersKt.f(k.f25688a), f0Var, gVar, (i11 & 112) | 8 | (i11 & 896) | ((i11 << 3) & 57344));
        gVar.P();
        return b11;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: androidx.compose.animation.core.InfiniteTransition$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: androidx.compose.animation.core.InfiniteTransition$a} */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, V extends defpackage.v1.n> e0.d1<T> b(androidx.compose.animation.core.InfiniteTransition r7, T r8, T r9, defpackage.v1.q0<T, V> r10, defpackage.v1.f0<T> r11, e0.g r12, int r13) {
        /*
            java.lang.String r13 = "<this>"
            kotlin.jvm.internal.p.j(r7, r13)
            java.lang.String r13 = "typeConverter"
            kotlin.jvm.internal.p.j(r10, r13)
            java.lang.String r13 = "animationSpec"
            kotlin.jvm.internal.p.j(r11, r13)
            r13 = 1847699412(0x6e21a7d4, float:1.2507495E28)
            r12.E(r13)
            r13 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r12.E(r13)
            java.lang.Object r13 = r12.F()
            e0.g$a r0 = e0.g.f14172a
            java.lang.Object r0 = r0.a()
            if (r13 != r0) goto L_0x0035
            androidx.compose.animation.core.InfiniteTransition$a r13 = new androidx.compose.animation.core.InfiniteTransition$a
            r1 = r13
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r12.y(r13)
        L_0x0035:
            r12.P()
            androidx.compose.animation.core.InfiniteTransition$a r13 = (androidx.compose.animation.core.InfiniteTransition.a) r13
            androidx.compose.animation.core.InfiniteTransitionKt$animateValue$1 r10 = new androidx.compose.animation.core.InfiniteTransitionKt$animateValue$1
            r10.<init>(r8, r13, r9, r11)
            r8 = 0
            e0.u.g(r10, r12, r8)
            androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2 r8 = new androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2
            r8.<init>(r7, r13)
            r7 = 6
            e0.u.b(r13, r8, r12, r7)
            r12.P()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransitionKt.b(androidx.compose.animation.core.InfiniteTransition, java.lang.Object, java.lang.Object, v1$q0, v1$f0, e0.g, int):e0.d1");
    }

    public static final InfiniteTransition c(g gVar, int i11) {
        gVar.E(353815743);
        gVar.E(-3687241);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            F = new InfiniteTransition();
            gVar.y(F);
        }
        gVar.P();
        InfiniteTransition infiniteTransition = (InfiniteTransition) F;
        infiniteTransition.h(gVar, 8);
        gVar.P();
        return infiniteTransition;
    }
}
