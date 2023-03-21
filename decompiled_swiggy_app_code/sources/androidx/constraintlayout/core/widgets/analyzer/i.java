package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import n2.a;

/* compiled from: HelperReferences */
class i extends WidgetRun {
    public i(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    private void q(DependencyNode dependencyNode) {
        this.f8234h.k.add(dependencyNode);
        dependencyNode.f8226l.add(this.f8234h);
    }

    public void a(a aVar) {
        androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) this.f8228b;
        int B1 = aVar2.B1();
        int i11 = 0;
        int i12 = -1;
        for (DependencyNode dependencyNode : this.f8234h.f8226l) {
            int i13 = dependencyNode.f8223g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (B1 == 0 || B1 == 2) {
            this.f8234h.d(i12 + aVar2.C1());
        } else {
            this.f8234h.d(i11 + aVar2.C1());
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        ConstraintWidget constraintWidget = this.f8228b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            this.f8234h.f8218b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget;
            int B1 = aVar.B1();
            boolean A1 = aVar.A1();
            int i11 = 0;
            if (B1 == 0) {
                this.f8234h.f8221e = DependencyNode.Type.LEFT;
                while (i11 < aVar.W0) {
                    ConstraintWidget constraintWidget2 = aVar.V0[i11];
                    if (A1 || constraintWidget2.Z() != 8) {
                        DependencyNode dependencyNode = constraintWidget2.f8176e.f8234h;
                        dependencyNode.k.add(this.f8234h);
                        this.f8234h.f8226l.add(dependencyNode);
                    }
                    i11++;
                }
                q(this.f8228b.f8176e.f8234h);
                q(this.f8228b.f8176e.f8235i);
            } else if (B1 == 1) {
                this.f8234h.f8221e = DependencyNode.Type.RIGHT;
                while (i11 < aVar.W0) {
                    ConstraintWidget constraintWidget3 = aVar.V0[i11];
                    if (A1 || constraintWidget3.Z() != 8) {
                        DependencyNode dependencyNode2 = constraintWidget3.f8176e.f8235i;
                        dependencyNode2.k.add(this.f8234h);
                        this.f8234h.f8226l.add(dependencyNode2);
                    }
                    i11++;
                }
                q(this.f8228b.f8176e.f8234h);
                q(this.f8228b.f8176e.f8235i);
            } else if (B1 == 2) {
                this.f8234h.f8221e = DependencyNode.Type.TOP;
                while (i11 < aVar.W0) {
                    ConstraintWidget constraintWidget4 = aVar.V0[i11];
                    if (A1 || constraintWidget4.Z() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget4.f8178f.f8234h;
                        dependencyNode3.k.add(this.f8234h);
                        this.f8234h.f8226l.add(dependencyNode3);
                    }
                    i11++;
                }
                q(this.f8228b.f8178f.f8234h);
                q(this.f8228b.f8178f.f8235i);
            } else if (B1 == 3) {
                this.f8234h.f8221e = DependencyNode.Type.BOTTOM;
                while (i11 < aVar.W0) {
                    ConstraintWidget constraintWidget5 = aVar.V0[i11];
                    if (A1 || constraintWidget5.Z() != 8) {
                        DependencyNode dependencyNode4 = constraintWidget5.f8178f.f8235i;
                        dependencyNode4.k.add(this.f8234h);
                        this.f8234h.f8226l.add(dependencyNode4);
                    }
                    i11++;
                }
                q(this.f8228b.f8178f.f8234h);
                q(this.f8228b.f8178f.f8235i);
            }
        }
    }

    public void e() {
        ConstraintWidget constraintWidget = this.f8228b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            int B1 = ((androidx.constraintlayout.core.widgets.a) constraintWidget).B1();
            if (B1 == 0 || B1 == 1) {
                this.f8228b.s1(this.f8234h.f8223g);
            } else {
                this.f8228b.t1(this.f8234h.f8223g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f8229c = null;
        this.f8234h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
