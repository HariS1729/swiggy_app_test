package androidx.compose.animation.core;

import androidx.compose.ui.platform.l0;
import e0.d0;
import fp0.c;
import lp0.l;

/* compiled from: InfiniteAnimationPolicy.kt */
public final class InfiniteAnimationPolicyKt {
    public static final <R> Object a(l<? super Long, ? extends R> lVar, c<? super R> cVar) {
        l0 l0Var = (l0) cVar.getContext().get(l0.X);
        if (l0Var == null) {
            return d0.b(lVar, cVar);
        }
        return l0Var.e0(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(lVar, (c<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2>) null), cVar);
    }
}
