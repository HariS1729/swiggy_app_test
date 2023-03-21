package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.d;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;
import m2.b;

/* compiled from: Barrier */
public class a extends b {
    private int X0 = 0;
    private boolean Y0 = true;
    private int Z0 = 0;

    /* renamed from: a1  reason: collision with root package name */
    boolean f8216a1 = false;

    public boolean A1() {
        return this.Y0;
    }

    public int B1() {
        return this.X0;
    }

    public int C1() {
        return this.Z0;
    }

    public int D1() {
        int i11 = this.X0;
        if (i11 == 0 || i11 == 1) {
            return 0;
        }
        return (i11 == 2 || i11 == 3) ? 1 : -1;
    }

    /* access modifiers changed from: protected */
    public void E1() {
        for (int i11 = 0; i11 < this.W0; i11++) {
            ConstraintWidget constraintWidget = this.V0[i11];
            if (this.Y0 || constraintWidget.h()) {
                int i12 = this.X0;
                if (i12 == 0 || i12 == 1) {
                    constraintWidget.Y0(0, true);
                } else if (i12 == 2 || i12 == 3) {
                    constraintWidget.Y0(1, true);
                }
            }
        }
    }

    public void F1(boolean z11) {
        this.Y0 = z11;
    }

    public void G1(int i11) {
        this.X0 = i11;
    }

    public void H1(int i11) {
        this.Z0 = i11;
    }

    public void g(d dVar, boolean z11) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z12;
        int i11;
        int i12;
        int i13;
        ConstraintAnchor[] constraintAnchorArr2 = this.Y;
        constraintAnchorArr2[0] = this.Q;
        constraintAnchorArr2[2] = this.R;
        constraintAnchorArr2[1] = this.S;
        constraintAnchorArr2[3] = this.T;
        int i14 = 0;
        while (true) {
            constraintAnchorArr = this.Y;
            if (i14 >= constraintAnchorArr.length) {
                break;
            }
            constraintAnchorArr[i14].f8166i = dVar.q(constraintAnchorArr[i14]);
            i14++;
        }
        int i15 = this.X0;
        if (i15 >= 0 && i15 < 4) {
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i15];
            if (!this.f8216a1) {
                z1();
            }
            if (this.f8216a1) {
                this.f8216a1 = false;
                int i16 = this.X0;
                if (i16 == 0 || i16 == 1) {
                    dVar.f(this.Q.f8166i, this.f8183h0);
                    dVar.f(this.S.f8166i, this.f8183h0);
                } else if (i16 == 2 || i16 == 3) {
                    dVar.f(this.R.f8166i, this.f8185i0);
                    dVar.f(this.T.f8166i, this.f8185i0);
                }
            } else {
                int i17 = 0;
                while (true) {
                    if (i17 >= this.W0) {
                        z12 = false;
                        break;
                    }
                    ConstraintWidget constraintWidget = this.V0[i17];
                    if ((this.Y0 || constraintWidget.h()) && ((((i12 = this.X0) == 0 || i12 == 1) && constraintWidget.C() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.Q.f8163f != null && constraintWidget.S.f8163f != null) || (((i13 = this.X0) == 2 || i13 == 3) && constraintWidget.X() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.R.f8163f != null && constraintWidget.T.f8163f != null))) {
                        z12 = true;
                    } else {
                        i17++;
                    }
                }
                z12 = true;
                boolean z13 = this.Q.l() || this.S.l();
                boolean z14 = this.R.l() || this.T.l();
                boolean z15 = !z12 && (((i11 = this.X0) == 0 && z13) || ((i11 == 2 && z14) || ((i11 == 1 && z13) || (i11 == 3 && z14))));
                int i18 = 5;
                if (!z15) {
                    i18 = 4;
                }
                for (int i19 = 0; i19 < this.W0; i19++) {
                    ConstraintWidget constraintWidget2 = this.V0[i19];
                    if (this.Y0 || constraintWidget2.h()) {
                        SolverVariable q = dVar.q(constraintWidget2.Y[this.X0]);
                        ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.Y;
                        int i21 = this.X0;
                        constraintAnchorArr3[i21].f8166i = q;
                        int i22 = (constraintAnchorArr3[i21].f8163f == null || constraintAnchorArr3[i21].f8163f.f8161d != this) ? 0 : constraintAnchorArr3[i21].f8164g + 0;
                        if (i21 == 0 || i21 == 2) {
                            dVar.i(constraintAnchor.f8166i, q, this.Z0 - i22, z12);
                        } else {
                            dVar.g(constraintAnchor.f8166i, q, this.Z0 + i22, z12);
                        }
                        dVar.e(constraintAnchor.f8166i, q, this.Z0 + i22, i18);
                    }
                }
                int i23 = this.X0;
                if (i23 == 0) {
                    dVar.e(this.S.f8166i, this.Q.f8166i, 0, 8);
                    dVar.e(this.Q.f8166i, this.f8173c0.S.f8166i, 0, 4);
                    dVar.e(this.Q.f8166i, this.f8173c0.Q.f8166i, 0, 0);
                } else if (i23 == 1) {
                    dVar.e(this.Q.f8166i, this.S.f8166i, 0, 8);
                    dVar.e(this.Q.f8166i, this.f8173c0.Q.f8166i, 0, 4);
                    dVar.e(this.Q.f8166i, this.f8173c0.S.f8166i, 0, 0);
                } else if (i23 == 2) {
                    dVar.e(this.T.f8166i, this.R.f8166i, 0, 8);
                    dVar.e(this.R.f8166i, this.f8173c0.T.f8166i, 0, 4);
                    dVar.e(this.R.f8166i, this.f8173c0.R.f8166i, 0, 0);
                } else if (i23 == 3) {
                    dVar.e(this.R.f8166i, this.T.f8166i, 0, 8);
                    dVar.e(this.R.f8166i, this.f8173c0.R.f8166i, 0, 4);
                    dVar.e(this.R.f8166i, this.f8173c0.T.f8166i, 0, 0);
                }
            }
        }
    }

    public boolean h() {
        return true;
    }

    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.n(constraintWidget, hashMap);
        a aVar = (a) constraintWidget;
        this.X0 = aVar.X0;
        this.Y0 = aVar.Y0;
        this.Z0 = aVar.Z0;
    }

    public boolean r0() {
        return this.f8216a1;
    }

    public boolean s0() {
        return this.f8216a1;
    }

    public String toString() {
        String str = "[Barrier] " + v() + " {";
        for (int i11 = 0; i11 < this.W0; i11++) {
            ConstraintWidget constraintWidget = this.V0[i11];
            if (i11 > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.v();
        }
        return str + "}";
    }

    public boolean z1() {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        boolean z11 = true;
        while (true) {
            i11 = this.W0;
            if (i14 >= i11) {
                break;
            }
            ConstraintWidget constraintWidget = this.V0[i14];
            if ((this.Y0 || constraintWidget.h()) && ((((i12 = this.X0) == 0 || i12 == 1) && !constraintWidget.r0()) || (((i13 = this.X0) == 2 || i13 == 3) && !constraintWidget.s0()))) {
                z11 = false;
            }
            i14++;
        }
        if (!z11 || i11 <= 0) {
            return false;
        }
        int i15 = 0;
        boolean z12 = false;
        for (int i16 = 0; i16 < this.W0; i16++) {
            ConstraintWidget constraintWidget2 = this.V0[i16];
            if (this.Y0 || constraintWidget2.h()) {
                if (!z12) {
                    int i17 = this.X0;
                    if (i17 == 0) {
                        i15 = constraintWidget2.q(ConstraintAnchor.Type.LEFT).e();
                    } else if (i17 == 1) {
                        i15 = constraintWidget2.q(ConstraintAnchor.Type.RIGHT).e();
                    } else if (i17 == 2) {
                        i15 = constraintWidget2.q(ConstraintAnchor.Type.TOP).e();
                    } else if (i17 == 3) {
                        i15 = constraintWidget2.q(ConstraintAnchor.Type.BOTTOM).e();
                    }
                    z12 = true;
                }
                int i18 = this.X0;
                if (i18 == 0) {
                    i15 = Math.min(i15, constraintWidget2.q(ConstraintAnchor.Type.LEFT).e());
                } else if (i18 == 1) {
                    i15 = Math.max(i15, constraintWidget2.q(ConstraintAnchor.Type.RIGHT).e());
                } else if (i18 == 2) {
                    i15 = Math.min(i15, constraintWidget2.q(ConstraintAnchor.Type.TOP).e());
                } else if (i18 == 3) {
                    i15 = Math.max(i15, constraintWidget2.q(ConstraintAnchor.Type.BOTTOM).e());
                }
            }
        }
        int i19 = i15 + this.Z0;
        int i21 = this.X0;
        if (i21 == 0 || i21 == 1) {
            L0(i19, i19);
        } else {
            O0(i19, i19);
        }
        this.f8216a1 = true;
        return true;
    }
}
