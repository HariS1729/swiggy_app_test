package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* compiled from: Optimizer */
public class g {

    /* renamed from: a  reason: collision with root package name */
    static boolean[] f8364a = new boolean[3];

    static void a(d dVar, d dVar2, ConstraintWidget constraintWidget) {
        constraintWidget.t = -1;
        constraintWidget.f8203u = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.f8171b0[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f8171b0[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i11 = constraintWidget.Q.f8164g;
            int a02 = dVar.a0() - constraintWidget.S.f8164g;
            ConstraintAnchor constraintAnchor = constraintWidget.Q;
            constraintAnchor.f8166i = dVar2.q(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.S;
            constraintAnchor2.f8166i = dVar2.q(constraintAnchor2);
            dVar2.f(constraintWidget.Q.f8166i, i11);
            dVar2.f(constraintWidget.S.f8166i, a02);
            constraintWidget.t = 2;
            constraintWidget.U0(i11, a02);
        }
        if (dVar.f8171b0[1] != dimensionBehaviour2 && constraintWidget.f8171b0[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i12 = constraintWidget.R.f8164g;
            int z11 = dVar.z() - constraintWidget.T.f8164g;
            ConstraintAnchor constraintAnchor3 = constraintWidget.R;
            constraintAnchor3.f8166i = dVar2.q(constraintAnchor3);
            ConstraintAnchor constraintAnchor4 = constraintWidget.T;
            constraintAnchor4.f8166i = dVar2.q(constraintAnchor4);
            dVar2.f(constraintWidget.R.f8166i, i12);
            dVar2.f(constraintWidget.T.f8166i, z11);
            if (constraintWidget.f8192n0 > 0 || constraintWidget.Z() == 8) {
                ConstraintAnchor constraintAnchor5 = constraintWidget.U;
                constraintAnchor5.f8166i = dVar2.q(constraintAnchor5);
                dVar2.f(constraintWidget.U.f8166i, constraintWidget.f8192n0 + i12);
            }
            constraintWidget.f8203u = 2;
            constraintWidget.l1(i12, z11);
        }
    }

    public static final boolean b(int i11, int i12) {
        return (i11 & i12) == i12;
    }
}
