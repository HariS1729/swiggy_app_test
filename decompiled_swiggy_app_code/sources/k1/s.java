package k1;

import androidx.compose.ui.node.LayoutNodeWrapper;
import f1.c0;
import kotlin.jvm.internal.p;

/* compiled from: PointerInputEntity.kt */
public final class s extends i<s, c0> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(LayoutNodeWrapper layoutNodeWrapper, c0 c0Var) {
        super(layoutNodeWrapper, c0Var);
        p.j(layoutNodeWrapper, "layoutNodeWrapper");
        p.j(c0Var, "modifier");
    }

    public void g() {
        super.g();
        ((c0) c()).q0().H0(b());
        ((c0) c()).q0().G0(true);
    }

    public void h() {
        super.h();
        ((c0) c()).q0().G0(false);
    }

    public final boolean j() {
        if (!((c0) c()).q0().o0()) {
            s sVar = (s) d();
            if (sVar != null ? sVar.j() : false) {
                return true;
            }
            return false;
        }
        return true;
    }
}
