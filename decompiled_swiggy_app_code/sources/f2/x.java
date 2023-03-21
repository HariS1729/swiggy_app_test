package f2;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import d2.h;

/* compiled from: ConstraintScopeCommon.kt */
public interface x {

    /* compiled from: ConstraintScopeCommon.kt */
    public static final class a {
        public static /* synthetic */ void a(x xVar, ConstraintLayoutBaseScope.c cVar, float f11, float f12, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    f11 = h.n((float) 0);
                }
                if ((i11 & 4) != 0) {
                    f12 = h.n((float) 0);
                }
                xVar.a(cVar, f11, f12);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
        }
    }

    void a(ConstraintLayoutBaseScope.c cVar, float f11, float f12);
}
