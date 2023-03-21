package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Collections;
import l2.e;
import m2.b;

/* compiled from: HelperReference */
public class c extends a implements e {

    /* renamed from: j0  reason: collision with root package name */
    protected final State f8154j0;

    /* renamed from: k0  reason: collision with root package name */
    final State.Helper f8155k0;

    /* renamed from: l0  reason: collision with root package name */
    protected ArrayList<Object> f8156l0 = new ArrayList<>();

    /* renamed from: m0  reason: collision with root package name */
    private b f8157m0;

    public c(State state, State.Helper helper) {
        super(state);
        this.f8154j0 = state;
        this.f8155k0 = helper;
    }

    public ConstraintWidget a() {
        return s0();
    }

    public void b() {
    }

    public c r0(Object... objArr) {
        Collections.addAll(this.f8156l0, objArr);
        return this;
    }

    public b s0() {
        return this.f8157m0;
    }
}
