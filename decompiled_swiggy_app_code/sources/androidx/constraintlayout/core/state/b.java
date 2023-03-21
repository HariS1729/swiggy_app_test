package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* compiled from: Dimension */
public class b {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f8143i = new Object();
    public static final Object j = new Object();
    public static final Object k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static final Object f8144l = new Object();

    /* renamed from: m  reason: collision with root package name */
    public static final Object f8145m = new Object();
    public static final Object n = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final int f8146a;

    /* renamed from: b  reason: collision with root package name */
    int f8147b;

    /* renamed from: c  reason: collision with root package name */
    int f8148c;

    /* renamed from: d  reason: collision with root package name */
    float f8149d;

    /* renamed from: e  reason: collision with root package name */
    int f8150e;

    /* renamed from: f  reason: collision with root package name */
    String f8151f;

    /* renamed from: g  reason: collision with root package name */
    Object f8152g;

    /* renamed from: h  reason: collision with root package name */
    boolean f8153h;

    private b() {
        this.f8146a = -2;
        this.f8147b = 0;
        this.f8148c = Integer.MAX_VALUE;
        this.f8149d = 1.0f;
        this.f8150e = 0;
        this.f8151f = null;
        this.f8152g = j;
        this.f8153h = false;
    }

    public static b a(int i11) {
        b bVar = new b(f8143i);
        bVar.i(i11);
        return bVar;
    }

    public static b b(Object obj) {
        b bVar = new b(f8143i);
        bVar.j(obj);
        return bVar;
    }

    public static b c() {
        return new b(f8144l);
    }

    public static b d(Object obj, float f11) {
        b bVar = new b(f8145m);
        bVar.p(obj, f11);
        return bVar;
    }

    public static b e(String str) {
        b bVar = new b(n);
        bVar.q(str);
        return bVar;
    }

    public static b f(Object obj) {
        b bVar = new b();
        bVar.s(obj);
        return bVar;
    }

    public static b g() {
        return new b(j);
    }

    public void h(State state, ConstraintWidget constraintWidget, int i11) {
        String str = this.f8151f;
        if (str != null) {
            constraintWidget.J0(str);
        }
        int i12 = 2;
        if (i11 == 0) {
            if (this.f8153h) {
                constraintWidget.V0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                Object obj = this.f8152g;
                if (obj == j) {
                    i12 = 1;
                } else if (obj != f8145m) {
                    i12 = 0;
                }
                constraintWidget.W0(i12, this.f8147b, this.f8148c, this.f8149d);
                return;
            }
            int i13 = this.f8147b;
            if (i13 > 0) {
                constraintWidget.g1(i13);
            }
            int i14 = this.f8148c;
            if (i14 < Integer.MAX_VALUE) {
                constraintWidget.d1(i14);
            }
            Object obj2 = this.f8152g;
            if (obj2 == j) {
                constraintWidget.V0(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            } else if (obj2 == f8144l) {
                constraintWidget.V0(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            } else if (obj2 == null) {
                constraintWidget.V0(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget.q1(this.f8150e);
            }
        } else if (this.f8153h) {
            constraintWidget.m1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            Object obj3 = this.f8152g;
            if (obj3 == j) {
                i12 = 1;
            } else if (obj3 != f8145m) {
                i12 = 0;
            }
            constraintWidget.n1(i12, this.f8147b, this.f8148c, this.f8149d);
        } else {
            int i15 = this.f8147b;
            if (i15 > 0) {
                constraintWidget.f1(i15);
            }
            int i16 = this.f8148c;
            if (i16 < Integer.MAX_VALUE) {
                constraintWidget.c1(i16);
            }
            Object obj4 = this.f8152g;
            if (obj4 == j) {
                constraintWidget.m1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            } else if (obj4 == f8144l) {
                constraintWidget.m1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            } else if (obj4 == null) {
                constraintWidget.m1(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget.R0(this.f8150e);
            }
        }
    }

    public b i(int i11) {
        this.f8152g = null;
        this.f8150e = i11;
        return this;
    }

    public b j(Object obj) {
        this.f8152g = obj;
        if (obj instanceof Integer) {
            this.f8150e = ((Integer) obj).intValue();
            this.f8152g = null;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f8150e;
    }

    public b l(int i11) {
        if (this.f8148c >= 0) {
            this.f8148c = i11;
        }
        return this;
    }

    public b m(Object obj) {
        Object obj2 = j;
        if (obj == obj2 && this.f8153h) {
            this.f8152g = obj2;
            this.f8148c = Integer.MAX_VALUE;
        }
        return this;
    }

    public b n(int i11) {
        if (i11 >= 0) {
            this.f8147b = i11;
        }
        return this;
    }

    public b o(Object obj) {
        if (obj == j) {
            this.f8147b = -2;
        }
        return this;
    }

    public b p(Object obj, float f11) {
        this.f8149d = f11;
        return this;
    }

    public b q(String str) {
        this.f8151f = str;
        return this;
    }

    public b r(int i11) {
        this.f8153h = true;
        if (i11 >= 0) {
            this.f8148c = i11;
        }
        return this;
    }

    public b s(Object obj) {
        this.f8152g = obj;
        this.f8153h = true;
        return this;
    }

    private b(Object obj) {
        this.f8146a = -2;
        this.f8147b = 0;
        this.f8148c = Integer.MAX_VALUE;
        this.f8149d = 1.0f;
        this.f8150e = 0;
        this.f8151f = null;
        this.f8153h = false;
        this.f8152g = obj;
    }
}
