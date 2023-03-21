package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* compiled from: ChainHead */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected ConstraintWidget f8291a;

    /* renamed from: b  reason: collision with root package name */
    protected ConstraintWidget f8292b;

    /* renamed from: c  reason: collision with root package name */
    protected ConstraintWidget f8293c;

    /* renamed from: d  reason: collision with root package name */
    protected ConstraintWidget f8294d;

    /* renamed from: e  reason: collision with root package name */
    protected ConstraintWidget f8295e;

    /* renamed from: f  reason: collision with root package name */
    protected ConstraintWidget f8296f;

    /* renamed from: g  reason: collision with root package name */
    protected ConstraintWidget f8297g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList<ConstraintWidget> f8298h;

    /* renamed from: i  reason: collision with root package name */
    protected int f8299i;
    protected int j;
    protected float k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    int f8300l;

    /* renamed from: m  reason: collision with root package name */
    int f8301m;
    int n;

    /* renamed from: o  reason: collision with root package name */
    boolean f8302o;

    /* renamed from: p  reason: collision with root package name */
    private int f8303p;
    private boolean q;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f8304r;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f8305s;
    protected boolean t;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f8306u;
    private boolean v;

    public c(ConstraintWidget constraintWidget, int i11, boolean z11) {
        this.f8291a = constraintWidget;
        this.f8303p = i11;
        this.q = z11;
    }

    private void b() {
        int i11 = this.f8303p * 2;
        ConstraintWidget constraintWidget = this.f8291a;
        boolean z11 = true;
        this.f8302o = true;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z12 = false;
        while (!z12) {
            this.f8299i++;
            ConstraintWidget[] constraintWidgetArr = constraintWidget.P0;
            int i12 = this.f8303p;
            ConstraintWidget constraintWidget3 = null;
            constraintWidgetArr[i12] = null;
            constraintWidget.O0[i12] = null;
            if (constraintWidget.Z() != 8) {
                this.f8300l++;
                ConstraintWidget.DimensionBehaviour w11 = constraintWidget.w(this.f8303p);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (w11 != dimensionBehaviour) {
                    this.f8301m += constraintWidget.H(this.f8303p);
                }
                int f11 = this.f8301m + constraintWidget.Y[i11].f();
                this.f8301m = f11;
                int i13 = i11 + 1;
                this.f8301m = f11 + constraintWidget.Y[i13].f();
                int f12 = this.n + constraintWidget.Y[i11].f();
                this.n = f12;
                this.n = f12 + constraintWidget.Y[i13].f();
                if (this.f8292b == null) {
                    this.f8292b = constraintWidget;
                }
                this.f8294d = constraintWidget;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f8171b0;
                int i14 = this.f8303p;
                if (dimensionBehaviourArr[i14] == dimensionBehaviour) {
                    int[] iArr = constraintWidget.f8210y;
                    if (iArr[i14] == 0 || iArr[i14] == 3 || iArr[i14] == 2) {
                        this.j++;
                        float[] fArr = constraintWidget.N0;
                        float f13 = fArr[i14];
                        if (f13 > 0.0f) {
                            this.k += fArr[i14];
                        }
                        if (c(constraintWidget, i14)) {
                            if (f13 < 0.0f) {
                                this.f8304r = true;
                            } else {
                                this.f8305s = true;
                            }
                            if (this.f8298h == null) {
                                this.f8298h = new ArrayList<>();
                            }
                            this.f8298h.add(constraintWidget);
                        }
                        if (this.f8296f == null) {
                            this.f8296f = constraintWidget;
                        }
                        ConstraintWidget constraintWidget4 = this.f8297g;
                        if (constraintWidget4 != null) {
                            constraintWidget4.O0[this.f8303p] = constraintWidget;
                        }
                        this.f8297g = constraintWidget;
                    }
                    if (this.f8303p == 0) {
                        if (constraintWidget.f8206w != 0) {
                            this.f8302o = false;
                        } else if (!(constraintWidget.f8212z == 0 && constraintWidget.A == 0)) {
                            this.f8302o = false;
                        }
                    } else if (constraintWidget.f8208x != 0) {
                        this.f8302o = false;
                    } else if (!(constraintWidget.C == 0 && constraintWidget.D == 0)) {
                        this.f8302o = false;
                    }
                    if (constraintWidget.f8179f0 != 0.0f) {
                        this.f8302o = false;
                        this.f8306u = true;
                    }
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.P0[this.f8303p] = constraintWidget;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.Y[i11 + 1].f8163f;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget5 = constraintAnchor.f8161d;
                ConstraintAnchor[] constraintAnchorArr = constraintWidget5.Y;
                if (constraintAnchorArr[i11].f8163f != null && constraintAnchorArr[i11].f8163f.f8161d == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 == null) {
                constraintWidget3 = constraintWidget;
                z12 = true;
            }
            constraintWidget2 = constraintWidget;
            constraintWidget = constraintWidget3;
        }
        ConstraintWidget constraintWidget6 = this.f8292b;
        if (constraintWidget6 != null) {
            this.f8301m -= constraintWidget6.Y[i11].f();
        }
        ConstraintWidget constraintWidget7 = this.f8294d;
        if (constraintWidget7 != null) {
            this.f8301m -= constraintWidget7.Y[i11 + 1].f();
        }
        this.f8293c = constraintWidget;
        if (this.f8303p != 0 || !this.q) {
            this.f8295e = this.f8291a;
        } else {
            this.f8295e = constraintWidget;
        }
        if (!this.f8305s || !this.f8304r) {
            z11 = false;
        }
        this.t = z11;
    }

    private static boolean c(ConstraintWidget constraintWidget, int i11) {
        if (constraintWidget.Z() != 8 && constraintWidget.f8171b0[i11] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int[] iArr = constraintWidget.f8210y;
            if (iArr[i11] == 0 || iArr[i11] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.v) {
            b();
        }
        this.v = true;
    }
}
