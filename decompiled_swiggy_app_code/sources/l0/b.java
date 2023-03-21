package l0;

import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import e0.g;
import e0.o0;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import java.util.Objects;
import kotlin.jvm.internal.p;

/* compiled from: ComposableLambda.kt */
public final class b {
    public static final int a(int i11, int i12) {
        return i11 << (((i12 % 10) * 3) + 1);
    }

    public static final a b(g gVar, int i11, boolean z11, Object obj) {
        ComposableLambdaImpl composableLambdaImpl;
        p.j(gVar, "composer");
        p.j(obj, RenderingDetails.TYPE_BLOCK);
        gVar.E(i11);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            composableLambdaImpl = new ComposableLambdaImpl(i11, z11);
            gVar.y(composableLambdaImpl);
        } else {
            Objects.requireNonNull(F, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) F;
        }
        composableLambdaImpl.i(obj);
        gVar.P();
        return composableLambdaImpl;
    }

    public static final a c(int i11, boolean z11, Object obj) {
        p.j(obj, RenderingDetails.TYPE_BLOCK);
        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(i11, z11);
        composableLambdaImpl.i(obj);
        return composableLambdaImpl;
    }

    public static final int d(int i11) {
        return a(2, i11);
    }

    public static final boolean e(o0 o0Var, o0 o0Var2) {
        p.j(o0Var2, "other");
        if (o0Var != null) {
            if ((o0Var instanceof RecomposeScopeImpl) && (o0Var2 instanceof RecomposeScopeImpl)) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) o0Var;
                if (!recomposeScopeImpl.s() || p.e(o0Var, o0Var2) || p.e(recomposeScopeImpl.j(), ((RecomposeScopeImpl) o0Var2).j())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static final int f(int i11) {
        return a(1, i11);
    }
}
