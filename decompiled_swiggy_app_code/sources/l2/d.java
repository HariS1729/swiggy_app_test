package l2;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.c;

/* compiled from: ChainReference */
public class d extends c {

    /* renamed from: n0  reason: collision with root package name */
    protected float f15448n0 = 0.5f;

    /* renamed from: o0  reason: collision with root package name */
    protected State.Chain f15449o0 = State.Chain.SPREAD;

    public d(State state, State.Helper helper) {
        super(state, helper);
    }

    public d t0(float f11) {
        this.f15448n0 = f11;
        return this;
    }

    public d u0(State.Chain chain) {
        this.f15449o0 = chain;
        return this;
    }
}
