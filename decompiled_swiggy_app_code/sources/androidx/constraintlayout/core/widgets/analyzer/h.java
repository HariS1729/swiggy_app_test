package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.f;
import n2.a;

/* compiled from: GuidelineReference */
class h extends WidgetRun {
    public h(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f8176e.f();
        constraintWidget.f8178f.f();
        this.f8232f = ((f) constraintWidget).y1();
    }

    private void q(DependencyNode dependencyNode) {
        this.f8234h.k.add(dependencyNode);
        dependencyNode.f8226l.add(this.f8234h);
    }

    public void a(a aVar) {
        DependencyNode dependencyNode = this.f8234h;
        if (dependencyNode.f8219c && !dependencyNode.j) {
            this.f8234h.d((int) ((((float) dependencyNode.f8226l.get(0).f8223g) * ((f) this.f8228b).B1()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        f fVar = (f) this.f8228b;
        int z12 = fVar.z1();
        int A1 = fVar.A1();
        fVar.B1();
        if (fVar.y1() == 1) {
            if (z12 != -1) {
                this.f8234h.f8226l.add(this.f8228b.f8173c0.f8176e.f8234h);
                this.f8228b.f8173c0.f8176e.f8234h.k.add(this.f8234h);
                this.f8234h.f8222f = z12;
            } else if (A1 != -1) {
                this.f8234h.f8226l.add(this.f8228b.f8173c0.f8176e.f8235i);
                this.f8228b.f8173c0.f8176e.f8235i.k.add(this.f8234h);
                this.f8234h.f8222f = -A1;
            } else {
                DependencyNode dependencyNode = this.f8234h;
                dependencyNode.f8218b = true;
                dependencyNode.f8226l.add(this.f8228b.f8173c0.f8176e.f8235i);
                this.f8228b.f8173c0.f8176e.f8235i.k.add(this.f8234h);
            }
            q(this.f8228b.f8176e.f8234h);
            q(this.f8228b.f8176e.f8235i);
            return;
        }
        if (z12 != -1) {
            this.f8234h.f8226l.add(this.f8228b.f8173c0.f8178f.f8234h);
            this.f8228b.f8173c0.f8178f.f8234h.k.add(this.f8234h);
            this.f8234h.f8222f = z12;
        } else if (A1 != -1) {
            this.f8234h.f8226l.add(this.f8228b.f8173c0.f8178f.f8235i);
            this.f8228b.f8173c0.f8178f.f8235i.k.add(this.f8234h);
            this.f8234h.f8222f = -A1;
        } else {
            DependencyNode dependencyNode2 = this.f8234h;
            dependencyNode2.f8218b = true;
            dependencyNode2.f8226l.add(this.f8228b.f8173c0.f8178f.f8235i);
            this.f8228b.f8173c0.f8178f.f8235i.k.add(this.f8234h);
        }
        q(this.f8228b.f8178f.f8234h);
        q(this.f8228b.f8178f.f8235i);
    }

    public void e() {
        if (((f) this.f8228b).y1() == 1) {
            this.f8228b.s1(this.f8234h.f8223g);
        } else {
            this.f8228b.t1(this.f8234h.f8223g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f8234h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
