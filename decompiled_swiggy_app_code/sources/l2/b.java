package l2;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.a;
import androidx.constraintlayout.core.state.c;
import java.util.Iterator;

/* compiled from: AlignVerticallyReference */
public class b extends c {

    /* renamed from: n0  reason: collision with root package name */
    private float f15443n0 = 0.5f;

    public b(State state) {
        super(state, State.Helper.ALIGN_VERTICALLY);
    }

    public void b() {
        Iterator<Object> it2 = this.f8156l0.iterator();
        while (it2.hasNext()) {
            a c11 = this.f8154j0.c(it2.next());
            c11.t();
            Object obj = this.S;
            if (obj != null) {
                c11.k0(obj);
            } else {
                Object obj2 = this.T;
                if (obj2 != null) {
                    c11.j0(obj2);
                } else {
                    c11.k0(State.f8106f);
                }
            }
            Object obj3 = this.U;
            if (obj3 != null) {
                c11.p(obj3);
            } else {
                Object obj4 = this.V;
                if (obj4 != null) {
                    c11.o(obj4);
                } else {
                    c11.o(State.f8106f);
                }
            }
            float f11 = this.f15443n0;
            if (f11 != 0.5f) {
                c11.o0(f11);
            }
        }
    }
}
