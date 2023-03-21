package l2;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import k2.a;

/* compiled from: GuidelineReference */
public class f implements e, a {

    /* renamed from: a  reason: collision with root package name */
    final State f15450a;

    /* renamed from: b  reason: collision with root package name */
    private int f15451b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.f f15452c;

    /* renamed from: d  reason: collision with root package name */
    private int f15453d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f15454e = -1;

    /* renamed from: f  reason: collision with root package name */
    private float f15455f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    private Object f15456g;

    public f(State state) {
        this.f15450a = state;
    }

    public ConstraintWidget a() {
        if (this.f15452c == null) {
            this.f15452c = new androidx.constraintlayout.core.widgets.f();
        }
        return this.f15452c;
    }

    public void b() {
        this.f15452c.G1(this.f15451b);
        int i11 = this.f15453d;
        if (i11 != -1) {
            this.f15452c.D1(i11);
            return;
        }
        int i12 = this.f15454e;
        if (i12 != -1) {
            this.f15452c.E1(i12);
        } else {
            this.f15452c.F1(this.f15455f);
        }
    }

    public void c(ConstraintWidget constraintWidget) {
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            this.f15452c = (androidx.constraintlayout.core.widgets.f) constraintWidget;
        } else {
            this.f15452c = null;
        }
    }

    public void d(Object obj) {
        this.f15456g = obj;
    }

    public e e() {
        return null;
    }

    public f f(Object obj) {
        this.f15453d = -1;
        this.f15454e = this.f15450a.d(obj);
        this.f15455f = 0.0f;
        return this;
    }

    public f g(float f11) {
        this.f15453d = -1;
        this.f15454e = -1;
        this.f15455f = f11;
        return this;
    }

    public Object getKey() {
        return this.f15456g;
    }

    public void h(int i11) {
        this.f15451b = i11;
    }

    public f i(Object obj) {
        this.f15453d = this.f15450a.d(obj);
        this.f15454e = -1;
        this.f15455f = 0.0f;
        return this;
    }
}
