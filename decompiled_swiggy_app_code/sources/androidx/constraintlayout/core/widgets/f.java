package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.d;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* compiled from: Guideline */
public class f extends ConstraintWidget {
    protected float V0 = -1.0f;
    protected int W0 = -1;
    protected int X0 = -1;
    protected boolean Y0 = true;
    private ConstraintAnchor Z0 = this.R;

    /* renamed from: a1  reason: collision with root package name */
    private int f8360a1;

    /* renamed from: b1  reason: collision with root package name */
    private int f8361b1;

    /* renamed from: c1  reason: collision with root package name */
    private boolean f8362c1;

    /* compiled from: Guideline */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8363a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8363a = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8363a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8363a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8363a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8363a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8363a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8363a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f8363a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f8363a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.f.a.<clinit>():void");
        }
    }

    public f() {
        this.f8360a1 = 0;
        this.f8361b1 = 0;
        this.Z.clear();
        this.Z.add(this.Z0);
        int length = this.Y.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.Y[i11] = this.Z0;
        }
    }

    public int A1() {
        return this.X0;
    }

    public float B1() {
        return this.V0;
    }

    public void C1(int i11) {
        this.Z0.t(i11);
        this.f8362c1 = true;
    }

    public void D1(int i11) {
        if (i11 > -1) {
            this.V0 = -1.0f;
            this.W0 = i11;
            this.X0 = -1;
        }
    }

    public void E1(int i11) {
        if (i11 > -1) {
            this.V0 = -1.0f;
            this.W0 = -1;
            this.X0 = i11;
        }
    }

    public void F1(float f11) {
        if (f11 > -1.0f) {
            this.V0 = f11;
            this.W0 = -1;
            this.X0 = -1;
        }
    }

    public void G1(int i11) {
        if (this.f8360a1 != i11) {
            this.f8360a1 = i11;
            this.Z.clear();
            if (this.f8360a1 == 1) {
                this.Z0 = this.Q;
            } else {
                this.Z0 = this.R;
            }
            this.Z.add(this.Z0);
            int length = this.Y.length;
            for (int i12 = 0; i12 < length; i12++) {
                this.Y[i12] = this.Z0;
            }
        }
    }

    public void g(d dVar, boolean z11) {
        d dVar2 = (d) N();
        if (dVar2 != null) {
            ConstraintAnchor q = dVar2.q(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor q11 = dVar2.q(ConstraintAnchor.Type.RIGHT);
            ConstraintWidget constraintWidget = this.f8173c0;
            boolean z12 = true;
            boolean z13 = constraintWidget != null && constraintWidget.f8171b0[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (this.f8360a1 == 0) {
                q = dVar2.q(ConstraintAnchor.Type.TOP);
                q11 = dVar2.q(ConstraintAnchor.Type.BOTTOM);
                ConstraintWidget constraintWidget2 = this.f8173c0;
                if (constraintWidget2 == null || constraintWidget2.f8171b0[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    z12 = false;
                }
                z13 = z12;
            }
            if (this.f8362c1 && this.Z0.n()) {
                SolverVariable q12 = dVar.q(this.Z0);
                dVar.f(q12, this.Z0.e());
                if (this.W0 != -1) {
                    if (z13) {
                        dVar.h(dVar.q(q11), q12, 0, 5);
                    }
                } else if (this.X0 != -1 && z13) {
                    SolverVariable q13 = dVar.q(q11);
                    dVar.h(q12, dVar.q(q), 0, 5);
                    dVar.h(q13, q12, 0, 5);
                }
                this.f8362c1 = false;
            } else if (this.W0 != -1) {
                SolverVariable q14 = dVar.q(this.Z0);
                dVar.e(q14, dVar.q(q), this.W0, 8);
                if (z13) {
                    dVar.h(dVar.q(q11), q14, 0, 5);
                }
            } else if (this.X0 != -1) {
                SolverVariable q15 = dVar.q(this.Z0);
                SolverVariable q16 = dVar.q(q11);
                dVar.e(q15, q16, -this.X0, 8);
                if (z13) {
                    dVar.h(q15, dVar.q(q), 0, 5);
                    dVar.h(q16, q15, 0, 5);
                }
            } else if (this.V0 != -1.0f) {
                dVar.d(d.s(dVar, dVar.q(this.Z0), dVar.q(q11), this.V0));
            }
        }
    }

    public boolean h() {
        return true;
    }

    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.n(constraintWidget, hashMap);
        f fVar = (f) constraintWidget;
        this.V0 = fVar.V0;
        this.W0 = fVar.W0;
        this.X0 = fVar.X0;
        this.Y0 = fVar.Y0;
        G1(fVar.f8360a1);
    }

    public ConstraintAnchor q(ConstraintAnchor.Type type) {
        int i11 = a.f8363a[type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            if (this.f8360a1 == 1) {
                return this.Z0;
            }
            return null;
        } else if ((i11 == 3 || i11 == 4) && this.f8360a1 == 0) {
            return this.Z0;
        } else {
            return null;
        }
    }

    public boolean r0() {
        return this.f8362c1;
    }

    public boolean s0() {
        return this.f8362c1;
    }

    public void w1(d dVar, boolean z11) {
        if (N() != null) {
            int x11 = dVar.x(this.Z0);
            if (this.f8360a1 == 1) {
                s1(x11);
                t1(0);
                R0(N().z());
                q1(0);
                return;
            }
            s1(0);
            t1(x11);
            q1(N().a0());
            R0(0);
        }
    }

    public ConstraintAnchor x1() {
        return this.Z0;
    }

    public int y1() {
        return this.f8360a1;
    }

    public int z1() {
        return this.W0;
    }
}
