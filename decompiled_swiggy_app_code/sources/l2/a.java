package l2;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.c;
import java.util.Iterator;

/* compiled from: AlignHorizontallyReference */
public class a extends c {

    /* renamed from: n0  reason: collision with root package name */
    private float f15442n0 = 0.5f;

    public a(State state) {
        super(state, State.Helper.ALIGN_VERTICALLY);
    }

    public void b() {
        Iterator<Object> it2 = this.f8156l0.iterator();
        while (it2.hasNext()) {
            androidx.constraintlayout.core.state.a c11 = this.f8154j0.c(it2.next());
            c11.s();
            Object obj = this.O;
            if (obj != null) {
                c11.h0(obj);
            } else {
                Object obj2 = this.P;
                if (obj2 != null) {
                    c11.g0(obj2);
                } else {
                    c11.h0(State.f8106f);
                }
            }
            Object obj3 = this.Q;
            if (obj3 != null) {
                c11.y(obj3);
            } else {
                Object obj4 = this.R;
                if (obj4 != null) {
                    c11.x(obj4);
                } else {
                    c11.x(State.f8106f);
                }
            }
            float f11 = this.f15442n0;
            if (f11 != 0.5f) {
                c11.E(f11);
            }
        }
    }
}
