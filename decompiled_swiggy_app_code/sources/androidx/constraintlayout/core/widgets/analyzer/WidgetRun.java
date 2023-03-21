package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public abstract class WidgetRun implements n2.a {

    /* renamed from: a  reason: collision with root package name */
    public int f8227a;

    /* renamed from: b  reason: collision with root package name */
    ConstraintWidget f8228b;

    /* renamed from: c  reason: collision with root package name */
    k f8229c;

    /* renamed from: d  reason: collision with root package name */
    protected ConstraintWidget.DimensionBehaviour f8230d;

    /* renamed from: e  reason: collision with root package name */
    e f8231e = new e(this);

    /* renamed from: f  reason: collision with root package name */
    public int f8232f = 0;

    /* renamed from: g  reason: collision with root package name */
    boolean f8233g = false;

    /* renamed from: h  reason: collision with root package name */
    public DependencyNode f8234h = new DependencyNode(this);

    /* renamed from: i  reason: collision with root package name */
    public DependencyNode f8235i = new DependencyNode(this);
    protected RunType j = RunType.NONE;

    enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8236a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8236a = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8236a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8236a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8236a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8236a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.WidgetRun.a.<clinit>():void");
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f8228b = constraintWidget;
    }

    private void l(int i11, int i12) {
        int i13;
        int i14 = this.f8227a;
        if (i14 == 0) {
            this.f8231e.d(g(i12, i11));
        } else if (i14 == 1) {
            this.f8231e.d(Math.min(g(this.f8231e.f8261m, i11), i12));
        } else if (i14 == 2) {
            ConstraintWidget N = this.f8228b.N();
            if (N != null) {
                e eVar = (i11 == 0 ? N.f8176e : N.f8178f).f8231e;
                if (eVar.j) {
                    ConstraintWidget constraintWidget = this.f8228b;
                    this.f8231e.d(g((int) ((((float) eVar.f8223g) * (i11 == 0 ? constraintWidget.B : constraintWidget.E)) + 0.5f), i11));
                }
            }
        } else if (i14 == 3) {
            ConstraintWidget constraintWidget2 = this.f8228b;
            WidgetRun widgetRun = constraintWidget2.f8176e;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = widgetRun.f8230d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 && widgetRun.f8227a == 3) {
                l lVar = constraintWidget2.f8178f;
                if (lVar.f8230d == dimensionBehaviour2 && lVar.f8227a == 3) {
                    return;
                }
            }
            if (i11 == 0) {
                widgetRun = constraintWidget2.f8178f;
            }
            if (widgetRun.f8231e.j) {
                float x11 = constraintWidget2.x();
                if (i11 == 1) {
                    i13 = (int) ((((float) widgetRun.f8231e.f8223g) / x11) + 0.5f);
                } else {
                    i13 = (int) ((x11 * ((float) widgetRun.f8231e.f8223g)) + 0.5f);
                }
                this.f8231e.d(i13);
            }
        }
    }

    public void a(n2.a aVar) {
    }

    /* access modifiers changed from: protected */
    public final void b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i11) {
        dependencyNode.f8226l.add(dependencyNode2);
        dependencyNode.f8222f = i11;
        dependencyNode2.k.add(dependencyNode);
    }

    /* access modifiers changed from: protected */
    public final void c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i11, e eVar) {
        dependencyNode.f8226l.add(dependencyNode2);
        dependencyNode.f8226l.add(this.f8231e);
        dependencyNode.f8224h = i11;
        dependencyNode.f8225i = eVar;
        dependencyNode2.k.add(dependencyNode);
        eVar.k.add(dependencyNode);
    }

    /* access modifiers changed from: package-private */
    public abstract void d();

    /* access modifiers changed from: package-private */
    public abstract void e();

    /* access modifiers changed from: package-private */
    public abstract void f();

    /* access modifiers changed from: protected */
    public final int g(int i11, int i12) {
        int i13;
        if (i12 == 0) {
            ConstraintWidget constraintWidget = this.f8228b;
            int i14 = constraintWidget.A;
            i13 = Math.max(constraintWidget.f8212z, i11);
            if (i14 > 0) {
                i13 = Math.min(i14, i11);
            }
            if (i13 == i11) {
                return i11;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f8228b;
            int i15 = constraintWidget2.D;
            int max = Math.max(constraintWidget2.C, i11);
            if (i15 > 0) {
                max = Math.min(i15, i11);
            }
            if (i13 == i11) {
                return i11;
            }
        }
        return i13;
    }

    /* access modifiers changed from: protected */
    public final DependencyNode h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f8163f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f8161d;
        int i11 = a.f8236a[constraintAnchor2.f8162e.ordinal()];
        if (i11 == 1) {
            return constraintWidget.f8176e.f8234h;
        }
        if (i11 == 2) {
            return constraintWidget.f8176e.f8235i;
        }
        if (i11 == 3) {
            return constraintWidget.f8178f.f8234h;
        }
        if (i11 == 4) {
            return constraintWidget.f8178f.k;
        }
        if (i11 != 5) {
            return null;
        }
        return constraintWidget.f8178f.f8235i;
    }

    /* access modifiers changed from: protected */
    public final DependencyNode i(ConstraintAnchor constraintAnchor, int i11) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f8163f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f8161d;
        WidgetRun widgetRun = i11 == 0 ? constraintWidget.f8176e : constraintWidget.f8178f;
        int i12 = a.f8236a[constraintAnchor2.f8162e.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.f8235i;
        }
        return widgetRun.f8234h;
    }

    public long j() {
        e eVar = this.f8231e;
        if (eVar.j) {
            return (long) eVar.f8223g;
        }
        return 0;
    }

    public boolean k() {
        return this.f8233g;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean m();

    /* access modifiers changed from: protected */
    public void n(n2.a aVar, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i11) {
        float f11;
        DependencyNode h11 = h(constraintAnchor);
        DependencyNode h12 = h(constraintAnchor2);
        if (h11.j && h12.j) {
            int f12 = h11.f8223g + constraintAnchor.f();
            int f13 = h12.f8223g - constraintAnchor2.f();
            int i12 = f13 - f12;
            if (!this.f8231e.j && this.f8230d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                l(i11, i12);
            }
            e eVar = this.f8231e;
            if (eVar.j) {
                if (eVar.f8223g == i12) {
                    this.f8234h.d(f12);
                    this.f8235i.d(f13);
                    return;
                }
                ConstraintWidget constraintWidget = this.f8228b;
                if (i11 == 0) {
                    f11 = constraintWidget.A();
                } else {
                    f11 = constraintWidget.V();
                }
                if (h11 == h12) {
                    f12 = h11.f8223g;
                    f13 = h12.f8223g;
                    f11 = 0.5f;
                }
                this.f8234h.d((int) (((float) f12) + 0.5f + (((float) ((f13 - f12) - this.f8231e.f8223g)) * f11)));
                this.f8235i.d(this.f8234h.f8223g + this.f8231e.f8223g);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void o(n2.a aVar) {
    }

    /* access modifiers changed from: protected */
    public void p(n2.a aVar) {
    }
}
