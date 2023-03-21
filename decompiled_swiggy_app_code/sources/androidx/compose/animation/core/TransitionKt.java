package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import defpackage.v1;
import e0.g;
import e0.u;
import kotlin.jvm.internal.p;

/* compiled from: Transition.kt */
public final class TransitionKt {
    public static final <S, T> Transition<T> a(Transition<S> transition, T t, T t11, String str, g gVar, int i11) {
        p.j(transition, "<this>");
        p.j(str, "childLabel");
        gVar.E(-382162874);
        gVar.E(-3686930);
        boolean k = gVar.k(transition);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            v1.i0 i0Var = new v1.i0(t);
            F = new Transition(i0Var, transition.h() + " > " + str);
            gVar.y(F);
        }
        gVar.P();
        Transition<T> transition2 = (Transition) F;
        u.b(transition2, new TransitionKt$createChildTransitionInternal$1(transition, transition2), gVar, 0);
        if (transition.q()) {
            transition2.y(t, t11, transition.i());
        } else {
            transition2.G(t11, gVar, ((i11 >> 3) & 8) | ((i11 >> 6) & 14));
            transition2.B(false);
        }
        gVar.P();
        return transition2;
    }

    public static final <S, T, V extends v1.n> Transition<S>.a<T, V> b(Transition<S> transition, v1.q0<T, V> q0Var, String str, g gVar, int i11, int i12) {
        p.j(transition, "<this>");
        p.j(q0Var, "typeConverter");
        gVar.E(-44505534);
        if ((i12 & 2) != 0) {
            str = "DeferredAnimation";
        }
        gVar.E(-3686930);
        boolean k = gVar.k(transition);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = new Transition.a(transition, q0Var, str);
            gVar.y(F);
        }
        gVar.P();
        Transition<S>.a<T, V> aVar = (Transition.a) F;
        u.b(aVar, new TransitionKt$createDeferredAnimation$1(transition, aVar), gVar, 8);
        if (transition.q()) {
            aVar.d();
        }
        gVar.P();
        return aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: androidx.compose.animation.core.Transition$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: androidx.compose.animation.core.Transition$d} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r0 == e0.g.f14172a.a()) goto L_0x0032;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T, V extends defpackage.v1.n> e0.d1<T> c(androidx.compose.animation.core.Transition<S> r7, T r8, T r9, defpackage.v1.a0<T> r10, defpackage.v1.q0<T, V> r11, java.lang.String r12, e0.g r13, int r14) {
        /*
            java.lang.String r14 = "<this>"
            kotlin.jvm.internal.p.j(r7, r14)
            java.lang.String r14 = "animationSpec"
            kotlin.jvm.internal.p.j(r10, r14)
            java.lang.String r14 = "typeConverter"
            kotlin.jvm.internal.p.j(r11, r14)
            java.lang.String r14 = "label"
            kotlin.jvm.internal.p.j(r12, r14)
            r14 = 460682138(0x1b75739a, float:2.0303278E-22)
            r13.E(r14)
            r14 = -3686930(0xffffffffffc7bdee, float:NaN)
            r13.E(r14)
            boolean r14 = r13.k(r7)
            java.lang.Object r0 = r13.F()
            if (r14 != 0) goto L_0x0032
            e0.g$a r14 = e0.g.f14172a
            java.lang.Object r14 = r14.a()
            if (r0 != r14) goto L_0x0043
        L_0x0032:
            androidx.compose.animation.core.Transition$d r0 = new androidx.compose.animation.core.Transition$d
            v1$n r4 = defpackage.v1.j.e(r11, r9)
            r1 = r0
            r2 = r7
            r3 = r8
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r13.y(r0)
        L_0x0043:
            r13.P()
            androidx.compose.animation.core.Transition$d r0 = (androidx.compose.animation.core.Transition.d) r0
            boolean r11 = r7.q()
            if (r11 == 0) goto L_0x0052
            r0.E(r8, r9, r10)
            goto L_0x0055
        L_0x0052:
            r0.F(r9, r10)
        L_0x0055:
            androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1 r8 = new androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1
            r8.<init>(r7, r0)
            r7 = 0
            e0.u.b(r0, r8, r13, r7)
            r13.P()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.TransitionKt.c(androidx.compose.animation.core.Transition, java.lang.Object, java.lang.Object, v1$a0, v1$q0, java.lang.String, e0.g, int):e0.d1");
    }

    public static final <T> Transition<T> d(T t, String str, g gVar, int i11, int i12) {
        gVar.E(1641299376);
        if ((i12 & 2) != 0) {
            str = null;
        }
        gVar.E(-3687241);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            F = new Transition(t, str);
            gVar.y(F);
        }
        gVar.P();
        Transition<T> transition = (Transition) F;
        transition.f(t, gVar, (i11 & 8) | 48 | (i11 & 14));
        u.b(transition, new TransitionKt$updateTransition$1(transition), gVar, 6);
        gVar.P();
        return transition;
    }

    public static final <T> Transition<T> e(v1.i0<T> i0Var, String str, g gVar, int i11, int i12) {
        p.j(i0Var, "transitionState");
        gVar.E(1641303020);
        if ((i12 & 2) != 0) {
            str = null;
        }
        gVar.E(-3686930);
        boolean k = gVar.k(i0Var);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = new Transition(i0Var, str);
            gVar.y(F);
        }
        gVar.P();
        Transition<T> transition = (Transition) F;
        transition.f(i0Var.b(), gVar, 0);
        u.b(transition, new TransitionKt$updateTransition$2(transition), gVar, 0);
        gVar.P();
        return transition;
    }
}
