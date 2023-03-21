package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private ViewParent f9588a;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f9589b;

    /* renamed from: c  reason: collision with root package name */
    private final View f9590c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9591d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f9592e;

    public p(View view) {
        this.f9590c = view;
    }

    private boolean g(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        ViewParent h11;
        int i16;
        int i17;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!l() || (h11 = h(i15)) == null) {
            return false;
        }
        if (i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f9590c.getLocationInWindow(iArr4);
            i17 = iArr4[0];
            i16 = iArr4[1];
        } else {
            i17 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            int[] i18 = i();
            i18[0] = 0;
            i18[1] = 0;
            iArr3 = i18;
        } else {
            iArr3 = iArr2;
        }
        f0.d(h11, this.f9590c, i11, i12, i13, i14, i15, iArr3);
        if (iArr4 != null) {
            this.f9590c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i17;
            iArr4[1] = iArr4[1] - i16;
        }
        return true;
    }

    private ViewParent h(int i11) {
        if (i11 == 0) {
            return this.f9588a;
        }
        if (i11 != 1) {
            return null;
        }
        return this.f9589b;
    }

    private int[] i() {
        if (this.f9592e == null) {
            this.f9592e = new int[2];
        }
        return this.f9592e;
    }

    private void n(int i11, ViewParent viewParent) {
        if (i11 == 0) {
            this.f9588a = viewParent;
        } else if (i11 == 1) {
            this.f9589b = viewParent;
        }
    }

    public boolean a(float f11, float f12, boolean z11) {
        ViewParent h11;
        if (!l() || (h11 = h(0)) == null) {
            return false;
        }
        return f0.a(h11, this.f9590c, f11, f12, z11);
    }

    public boolean b(float f11, float f12) {
        ViewParent h11;
        if (!l() || (h11 = h(0)) == null) {
            return false;
        }
        return f0.b(h11, this.f9590c, f11, f12);
    }

    public boolean c(int i11, int i12, int[] iArr, int[] iArr2) {
        return d(i11, i12, iArr, iArr2, 0);
    }

    public boolean d(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        ViewParent h11;
        int i14;
        int i15;
        if (!l() || (h11 = h(i13)) == null) {
            return false;
        }
        if (i11 != 0 || i12 != 0) {
            if (iArr2 != null) {
                this.f9590c.getLocationInWindow(iArr2);
                i15 = iArr2[0];
                i14 = iArr2[1];
            } else {
                i15 = 0;
                i14 = 0;
            }
            if (iArr == null) {
                iArr = i();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            f0.c(h11, this.f9590c, i11, i12, iArr, i13);
            if (iArr2 != null) {
                this.f9590c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i15;
                iArr2[1] = iArr2[1] - i14;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public void e(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        g(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    public boolean f(int i11, int i12, int i13, int i14, int[] iArr) {
        return g(i11, i12, i13, i14, iArr, 0, (int[]) null);
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i11) {
        return h(i11) != null;
    }

    public boolean l() {
        return this.f9591d;
    }

    public void m(boolean z11) {
        if (this.f9591d) {
            a0.X0(this.f9590c);
        }
        this.f9591d = z11;
    }

    public boolean o(int i11) {
        return p(i11, 0);
    }

    public boolean p(int i11, int i12) {
        if (k(i12)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.f9590c;
        for (ViewParent parent = this.f9590c.getParent(); parent != null; parent = parent.getParent()) {
            if (f0.f(parent, view, this.f9590c, i11, i12)) {
                n(i12, parent);
                f0.e(parent, view, this.f9590c, i11, i12);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i11) {
        ViewParent h11 = h(i11);
        if (h11 != null) {
            f0.g(h11, this.f9590c, i11);
            n(i11, (ViewParent) null);
        }
    }
}
