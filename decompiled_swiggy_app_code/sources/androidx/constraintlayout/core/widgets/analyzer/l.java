package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* compiled from: VerticalWidgetRun */
public class l extends WidgetRun {
    public DependencyNode k;

    /* renamed from: l  reason: collision with root package name */
    e f8274l = null;

    /* compiled from: VerticalWidgetRun */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8275a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8275a = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8275a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8275a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.l.a.<clinit>():void");
        }
    }

    public l(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.k = dependencyNode;
        this.f8234h.f8221e = DependencyNode.Type.TOP;
        this.f8235i.f8221e = DependencyNode.Type.BOTTOM;
        dependencyNode.f8221e = DependencyNode.Type.BASELINE;
        this.f8232f = 1;
    }

    public void a(n2.a aVar) {
        int i11;
        float f11;
        float f12;
        float f13;
        int i12 = a.f8275a[this.j.ordinal()];
        if (i12 == 1) {
            p(aVar);
        } else if (i12 == 2) {
            o(aVar);
        } else if (i12 == 3) {
            ConstraintWidget constraintWidget = this.f8228b;
            n(aVar, constraintWidget.R, constraintWidget.T, 1);
            return;
        }
        e eVar = this.f8231e;
        if (eVar.f8219c && !eVar.j && this.f8230d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f8228b;
            int i13 = constraintWidget2.f8208x;
            if (i13 == 2) {
                ConstraintWidget N = constraintWidget2.N();
                if (N != null) {
                    e eVar2 = N.f8178f.f8231e;
                    if (eVar2.j) {
                        float f14 = this.f8228b.E;
                        this.f8231e.d((int) ((((float) eVar2.f8223g) * f14) + 0.5f));
                    }
                }
            } else if (i13 == 3 && constraintWidget2.f8176e.f8231e.j) {
                int y11 = constraintWidget2.y();
                if (y11 == -1) {
                    ConstraintWidget constraintWidget3 = this.f8228b;
                    f13 = (float) constraintWidget3.f8176e.f8231e.f8223g;
                    f12 = constraintWidget3.x();
                } else if (y11 == 0) {
                    ConstraintWidget constraintWidget4 = this.f8228b;
                    f11 = ((float) constraintWidget4.f8176e.f8231e.f8223g) * constraintWidget4.x();
                    i11 = (int) (f11 + 0.5f);
                    this.f8231e.d(i11);
                } else if (y11 != 1) {
                    i11 = 0;
                    this.f8231e.d(i11);
                } else {
                    ConstraintWidget constraintWidget5 = this.f8228b;
                    f13 = (float) constraintWidget5.f8176e.f8231e.f8223g;
                    f12 = constraintWidget5.x();
                }
                f11 = f13 / f12;
                i11 = (int) (f11 + 0.5f);
                this.f8231e.d(i11);
            }
        }
        DependencyNode dependencyNode = this.f8234h;
        if (dependencyNode.f8219c) {
            DependencyNode dependencyNode2 = this.f8235i;
            if (dependencyNode2.f8219c) {
                if (!dependencyNode.j || !dependencyNode2.j || !this.f8231e.j) {
                    if (!this.f8231e.j && this.f8230d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        ConstraintWidget constraintWidget6 = this.f8228b;
                        if (constraintWidget6.f8206w == 0 && !constraintWidget6.o0()) {
                            int i14 = this.f8234h.f8226l.get(0).f8223g;
                            DependencyNode dependencyNode3 = this.f8234h;
                            int i15 = i14 + dependencyNode3.f8222f;
                            int i16 = this.f8235i.f8226l.get(0).f8223g + this.f8235i.f8222f;
                            dependencyNode3.d(i15);
                            this.f8235i.d(i16);
                            this.f8231e.d(i16 - i15);
                            return;
                        }
                    }
                    if (!this.f8231e.j && this.f8230d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f8227a == 1 && this.f8234h.f8226l.size() > 0 && this.f8235i.f8226l.size() > 0) {
                        int i17 = (this.f8235i.f8226l.get(0).f8223g + this.f8235i.f8222f) - (this.f8234h.f8226l.get(0).f8223g + this.f8234h.f8222f);
                        e eVar3 = this.f8231e;
                        int i18 = eVar3.f8261m;
                        if (i17 < i18) {
                            eVar3.d(i17);
                        } else {
                            eVar3.d(i18);
                        }
                    }
                    if (this.f8231e.j && this.f8234h.f8226l.size() > 0 && this.f8235i.f8226l.size() > 0) {
                        DependencyNode dependencyNode4 = this.f8234h.f8226l.get(0);
                        DependencyNode dependencyNode5 = this.f8235i.f8226l.get(0);
                        int i19 = dependencyNode4.f8223g + this.f8234h.f8222f;
                        int i21 = dependencyNode5.f8223g + this.f8235i.f8222f;
                        float V = this.f8228b.V();
                        if (dependencyNode4 == dependencyNode5) {
                            i19 = dependencyNode4.f8223g;
                            i21 = dependencyNode5.f8223g;
                            V = 0.5f;
                        }
                        this.f8234h.d((int) (((float) i19) + 0.5f + (((float) ((i21 - i19) - this.f8231e.f8223g)) * V)));
                        this.f8235i.d(this.f8234h.f8223g + this.f8231e.f8223g);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        ConstraintWidget N;
        ConstraintWidget N2;
        ConstraintWidget constraintWidget = this.f8228b;
        if (constraintWidget.f8168a) {
            this.f8231e.d(constraintWidget.z());
        }
        if (!this.f8231e.j) {
            this.f8230d = this.f8228b.X();
            if (this.f8228b.d0()) {
                this.f8274l = new a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f8230d;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (N2 = this.f8228b.N()) != null && N2.X() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int z11 = (N2.z() - this.f8228b.R.f()) - this.f8228b.T.f();
                    b(this.f8234h, N2.f8178f.f8234h, this.f8228b.R.f());
                    b(this.f8235i, N2.f8178f.f8235i, -this.f8228b.T.f());
                    this.f8231e.d(z11);
                    return;
                } else if (this.f8230d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f8231e.d(this.f8228b.z());
                }
            }
        } else if (this.f8230d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (N = this.f8228b.N()) != null && N.X() == ConstraintWidget.DimensionBehaviour.FIXED) {
            b(this.f8234h, N.f8178f.f8234h, this.f8228b.R.f());
            b(this.f8235i, N.f8178f.f8235i, -this.f8228b.T.f());
            return;
        }
        e eVar = this.f8231e;
        boolean z12 = eVar.j;
        if (z12) {
            ConstraintWidget constraintWidget2 = this.f8228b;
            if (constraintWidget2.f8168a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.Y;
                if (constraintAnchorArr[2].f8163f != null && constraintAnchorArr[3].f8163f != null) {
                    if (constraintWidget2.o0()) {
                        this.f8234h.f8222f = this.f8228b.Y[2].f();
                        this.f8235i.f8222f = -this.f8228b.Y[3].f();
                    } else {
                        DependencyNode h11 = h(this.f8228b.Y[2]);
                        if (h11 != null) {
                            b(this.f8234h, h11, this.f8228b.Y[2].f());
                        }
                        DependencyNode h12 = h(this.f8228b.Y[3]);
                        if (h12 != null) {
                            b(this.f8235i, h12, -this.f8228b.Y[3].f());
                        }
                        this.f8234h.f8218b = true;
                        this.f8235i.f8218b = true;
                    }
                    if (this.f8228b.d0()) {
                        b(this.k, this.f8234h, this.f8228b.r());
                        return;
                    }
                    return;
                } else if (constraintAnchorArr[2].f8163f != null) {
                    DependencyNode h13 = h(constraintAnchorArr[2]);
                    if (h13 != null) {
                        b(this.f8234h, h13, this.f8228b.Y[2].f());
                        b(this.f8235i, this.f8234h, this.f8231e.f8223g);
                        if (this.f8228b.d0()) {
                            b(this.k, this.f8234h, this.f8228b.r());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (constraintAnchorArr[3].f8163f != null) {
                    DependencyNode h14 = h(constraintAnchorArr[3]);
                    if (h14 != null) {
                        b(this.f8235i, h14, -this.f8228b.Y[3].f());
                        b(this.f8234h, this.f8235i, -this.f8231e.f8223g);
                    }
                    if (this.f8228b.d0()) {
                        b(this.k, this.f8234h, this.f8228b.r());
                        return;
                    }
                    return;
                } else if (constraintAnchorArr[4].f8163f != null) {
                    DependencyNode h15 = h(constraintAnchorArr[4]);
                    if (h15 != null) {
                        b(this.k, h15, 0);
                        b(this.f8234h, this.k, -this.f8228b.r());
                        b(this.f8235i, this.f8234h, this.f8231e.f8223g);
                        return;
                    }
                    return;
                } else if (!(constraintWidget2 instanceof m2.a) && constraintWidget2.N() != null && this.f8228b.q(ConstraintAnchor.Type.CENTER).f8163f == null) {
                    b(this.f8234h, this.f8228b.N().f8178f.f8234h, this.f8228b.c0());
                    b(this.f8235i, this.f8234h, this.f8231e.f8223g);
                    if (this.f8228b.d0()) {
                        b(this.k, this.f8234h, this.f8228b.r());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        if (z12 || this.f8230d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            eVar.b(this);
        } else {
            ConstraintWidget constraintWidget3 = this.f8228b;
            int i11 = constraintWidget3.f8208x;
            if (i11 == 2) {
                ConstraintWidget N3 = constraintWidget3.N();
                if (N3 != null) {
                    e eVar2 = N3.f8178f.f8231e;
                    this.f8231e.f8226l.add(eVar2);
                    eVar2.k.add(this.f8231e);
                    e eVar3 = this.f8231e;
                    eVar3.f8218b = true;
                    eVar3.k.add(this.f8234h);
                    this.f8231e.k.add(this.f8235i);
                }
            } else if (i11 == 3 && !constraintWidget3.o0()) {
                ConstraintWidget constraintWidget4 = this.f8228b;
                if (constraintWidget4.f8206w != 3) {
                    e eVar4 = constraintWidget4.f8176e.f8231e;
                    this.f8231e.f8226l.add(eVar4);
                    eVar4.k.add(this.f8231e);
                    e eVar5 = this.f8231e;
                    eVar5.f8218b = true;
                    eVar5.k.add(this.f8234h);
                    this.f8231e.k.add(this.f8235i);
                }
            }
        }
        ConstraintWidget constraintWidget5 = this.f8228b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget5.Y;
        if (constraintAnchorArr2[2].f8163f != null && constraintAnchorArr2[3].f8163f != null) {
            if (constraintWidget5.o0()) {
                this.f8234h.f8222f = this.f8228b.Y[2].f();
                this.f8235i.f8222f = -this.f8228b.Y[3].f();
            } else {
                DependencyNode h16 = h(this.f8228b.Y[2]);
                DependencyNode h17 = h(this.f8228b.Y[3]);
                if (h16 != null) {
                    h16.b(this);
                }
                if (h17 != null) {
                    h17.b(this);
                }
                this.j = WidgetRun.RunType.CENTER;
            }
            if (this.f8228b.d0()) {
                c(this.k, this.f8234h, 1, this.f8274l);
            }
        } else if (constraintAnchorArr2[2].f8163f != null) {
            DependencyNode h18 = h(constraintAnchorArr2[2]);
            if (h18 != null) {
                b(this.f8234h, h18, this.f8228b.Y[2].f());
                c(this.f8235i, this.f8234h, 1, this.f8231e);
                if (this.f8228b.d0()) {
                    c(this.k, this.f8234h, 1, this.f8274l);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f8230d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3 && this.f8228b.x() > 0.0f) {
                    j jVar = this.f8228b.f8176e;
                    if (jVar.f8230d == dimensionBehaviour3) {
                        jVar.f8231e.k.add(this.f8231e);
                        this.f8231e.f8226l.add(this.f8228b.f8176e.f8231e);
                        this.f8231e.f8217a = this;
                    }
                }
            }
        } else if (constraintAnchorArr2[3].f8163f != null) {
            DependencyNode h19 = h(constraintAnchorArr2[3]);
            if (h19 != null) {
                b(this.f8235i, h19, -this.f8228b.Y[3].f());
                c(this.f8234h, this.f8235i, -1, this.f8231e);
                if (this.f8228b.d0()) {
                    c(this.k, this.f8234h, 1, this.f8274l);
                }
            }
        } else if (constraintAnchorArr2[4].f8163f != null) {
            DependencyNode h21 = h(constraintAnchorArr2[4]);
            if (h21 != null) {
                b(this.k, h21, 0);
                c(this.f8234h, this.k, -1, this.f8274l);
                c(this.f8235i, this.f8234h, 1, this.f8231e);
            }
        } else if (!(constraintWidget5 instanceof m2.a) && constraintWidget5.N() != null) {
            b(this.f8234h, this.f8228b.N().f8178f.f8234h, this.f8228b.c0());
            c(this.f8235i, this.f8234h, 1, this.f8231e);
            if (this.f8228b.d0()) {
                c(this.k, this.f8234h, 1, this.f8274l);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f8230d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour4 == dimensionBehaviour5 && this.f8228b.x() > 0.0f) {
                j jVar2 = this.f8228b.f8176e;
                if (jVar2.f8230d == dimensionBehaviour5) {
                    jVar2.f8231e.k.add(this.f8231e);
                    this.f8231e.f8226l.add(this.f8228b.f8176e.f8231e);
                    this.f8231e.f8217a = this;
                }
            }
        }
        if (this.f8231e.f8226l.size() == 0) {
            this.f8231e.f8219c = true;
        }
    }

    public void e() {
        DependencyNode dependencyNode = this.f8234h;
        if (dependencyNode.j) {
            this.f8228b.t1(dependencyNode.f8223g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f8229c = null;
        this.f8234h.c();
        this.f8235i.c();
        this.k.c();
        this.f8231e.c();
        this.f8233g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        if (this.f8230d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f8228b.f8208x == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.f8233g = false;
        this.f8234h.c();
        this.f8234h.j = false;
        this.f8235i.c();
        this.f8235i.j = false;
        this.k.c();
        this.k.j = false;
        this.f8231e.j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f8228b.v();
    }
}
