package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import n2.a;

/* compiled from: DimensionDependency */
class e extends DependencyNode {

    /* renamed from: m  reason: collision with root package name */
    public int f8261m;

    public e(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof j) {
            this.f8221e = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.f8221e = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    public void d(int i11) {
        if (!this.j) {
            this.j = true;
            this.f8223g = i11;
            for (a next : this.k) {
                next.a(next);
            }
        }
    }
}
