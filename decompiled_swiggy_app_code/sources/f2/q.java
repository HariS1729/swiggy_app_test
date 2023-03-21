package f2;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import d2.h;

/* compiled from: ConstraintScopeCommon.kt */
public interface q {

    /* compiled from: ConstraintScopeCommon.kt */
    public static final class a {
        public static /* synthetic */ void a(q qVar, ConstraintLayoutBaseScope.b bVar, float f11, float f12, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    f11 = h.n((float) 0);
                }
                if ((i11 & 4) != 0) {
                    f12 = h.n((float) 0);
                }
                qVar.a(bVar, f11, f12);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
        }
    }

    void a(ConstraintLayoutBaseScope.b bVar, float f11, float f12);
}
