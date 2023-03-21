package v2;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.h;
import androidx.core.view.a0;
import androidx.core.view.accessibility.d;
import androidx.core.view.accessibility.e;
import java.util.ArrayList;
import java.util.List;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;
import v2.b;

/* compiled from: ExploreByTouchHelper */
public abstract class a extends androidx.core.view.a {
    private static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    private static final b.a<androidx.core.view.accessibility.c> f17259o = new C0198a();

    /* renamed from: p  reason: collision with root package name */
    private static final b.C0199b<h<androidx.core.view.accessibility.c>, androidx.core.view.accessibility.c> f17260p = new b();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f17261d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f17262e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final Rect f17263f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    private final int[] f17264g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    private final AccessibilityManager f17265h;

    /* renamed from: i  reason: collision with root package name */
    private final View f17266i;
    private c j;
    int k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    int f17267l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    private int f17268m = Integer.MIN_VALUE;

    /* renamed from: v2.a$a  reason: collision with other inner class name */
    /* compiled from: ExploreByTouchHelper */
    class C0198a implements b.a<androidx.core.view.accessibility.c> {
        C0198a() {
        }

        /* renamed from: b */
        public void a(androidx.core.view.accessibility.c cVar, Rect rect) {
            cVar.m(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper */
    class b implements b.C0199b<h<androidx.core.view.accessibility.c>, androidx.core.view.accessibility.c> {
        b() {
        }

        /* renamed from: c */
        public androidx.core.view.accessibility.c a(h<androidx.core.view.accessibility.c> hVar, int i11) {
            return hVar.q(i11);
        }

        /* renamed from: d */
        public int b(h<androidx.core.view.accessibility.c> hVar) {
            return hVar.p();
        }
    }

    /* compiled from: ExploreByTouchHelper */
    private class c extends d {
        c() {
        }

        public androidx.core.view.accessibility.c b(int i11) {
            return androidx.core.view.accessibility.c.R(a.this.H(i11));
        }

        public androidx.core.view.accessibility.c d(int i11) {
            int i12 = i11 == 2 ? a.this.k : a.this.f17267l;
            if (i12 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i12);
        }

        public boolean f(int i11, int i12, Bundle bundle) {
            return a.this.P(i11, i12, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f17266i = view;
            this.f17265h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (a0.D(view) == 0) {
                a0.H0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect D(View view, int i11, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i11 == 17) {
            rect.set(width, 0, width, height);
        } else if (i11 == 33) {
            rect.set(0, height, width, height);
        } else if (i11 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i11 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f17266i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f17266i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    private static int F(int i11) {
        if (i11 == 19) {
            return 33;
        }
        if (i11 != 21) {
            return i11 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i11, Rect rect) {
        androidx.core.view.accessibility.c cVar;
        androidx.core.view.accessibility.c cVar2;
        h<androidx.core.view.accessibility.c> y11 = y();
        int i12 = this.f17267l;
        int i13 = Integer.MIN_VALUE;
        if (i12 == Integer.MIN_VALUE) {
            cVar = null;
        } else {
            cVar = y11.i(i12);
        }
        androidx.core.view.accessibility.c cVar3 = cVar;
        if (i11 == 1 || i11 == 2) {
            cVar2 = (androidx.core.view.accessibility.c) b.d(y11, f17260p, f17259o, cVar3, i11, a0.F(this.f17266i) == 1, false);
        } else if (i11 == 17 || i11 == 33 || i11 == 66 || i11 == 130) {
            Rect rect2 = new Rect();
            int i14 = this.f17267l;
            if (i14 != Integer.MIN_VALUE) {
                z(i14, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f17266i, i11, rect2);
            }
            cVar2 = (androidx.core.view.accessibility.c) b.c(y11, f17260p, f17259o, cVar3, rect2, i11);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (cVar2 != null) {
            i13 = y11.m(y11.l(cVar2));
        }
        return T(i13);
    }

    private boolean Q(int i11, int i12, Bundle bundle) {
        if (i12 == 1) {
            return T(i11);
        }
        if (i12 == 2) {
            return o(i11);
        }
        if (i12 == 64) {
            return S(i11);
        }
        if (i12 != 128) {
            return J(i11, i12, bundle);
        }
        return n(i11);
    }

    private boolean R(int i11, Bundle bundle) {
        return a0.l0(this.f17266i, i11, bundle);
    }

    private boolean S(int i11) {
        int i12;
        if (!this.f17265h.isEnabled() || !this.f17265h.isTouchExplorationEnabled() || (i12 = this.k) == i11) {
            return false;
        }
        if (i12 != Integer.MIN_VALUE) {
            n(i12);
        }
        this.k = i11;
        this.f17266i.invalidate();
        U(i11, 32768);
        return true;
    }

    private void V(int i11) {
        int i12 = this.f17268m;
        if (i12 != i11) {
            this.f17268m = i11;
            U(i11, 128);
            U(i12, 256);
        }
    }

    private boolean n(int i11) {
        if (this.k != i11) {
            return false;
        }
        this.k = Integer.MIN_VALUE;
        this.f17266i.invalidate();
        U(i11, PDButton.FLAG_PUSHBUTTON);
        return true;
    }

    private boolean p() {
        int i11 = this.f17267l;
        return i11 != Integer.MIN_VALUE && J(i11, 16, (Bundle) null);
    }

    private AccessibilityEvent q(int i11, int i12) {
        if (i11 != -1) {
            return r(i11, i12);
        }
        return s(i12);
    }

    private AccessibilityEvent r(int i11, int i12) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i12);
        androidx.core.view.accessibility.c H = H(i11);
        obtain.getText().add(H.y());
        obtain.setContentDescription(H.r());
        obtain.setScrollable(H.L());
        obtain.setPassword(H.K());
        obtain.setEnabled(H.G());
        obtain.setChecked(H.E());
        L(i11, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(H.p());
            e.c(obtain, this.f17266i, i11);
            obtain.setPackageName(this.f17266i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private AccessibilityEvent s(int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        this.f17266i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private androidx.core.view.accessibility.c t(int i11) {
        androidx.core.view.accessibility.c P = androidx.core.view.accessibility.c.P();
        P.k0(true);
        P.m0(true);
        P.c0("android.view.View");
        Rect rect = n;
        P.Y(rect);
        P.Z(rect);
        P.w0(this.f17266i);
        N(i11, P);
        if (P.y() == null && P.r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        P.m(this.f17262e);
        if (!this.f17262e.equals(rect)) {
            int k11 = P.k();
            if ((k11 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((k11 & 128) == 0) {
                P.u0(this.f17266i.getContext().getPackageName());
                P.G0(this.f17266i, i11);
                if (this.k == i11) {
                    P.W(true);
                    P.a(128);
                } else {
                    P.W(false);
                    P.a(64);
                }
                boolean z11 = this.f17267l == i11;
                if (z11) {
                    P.a(2);
                } else if (P.H()) {
                    P.a(1);
                }
                P.n0(z11);
                this.f17266i.getLocationOnScreen(this.f17264g);
                P.n(this.f17261d);
                if (this.f17261d.equals(rect)) {
                    P.m(this.f17261d);
                    if (P.f9454b != -1) {
                        androidx.core.view.accessibility.c P2 = androidx.core.view.accessibility.c.P();
                        for (int i12 = P.f9454b; i12 != -1; i12 = P2.f9454b) {
                            P2.x0(this.f17266i, -1);
                            P2.Y(n);
                            N(i12, P2);
                            P2.m(this.f17262e);
                            Rect rect2 = this.f17261d;
                            Rect rect3 = this.f17262e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        P2.T();
                    }
                    this.f17261d.offset(this.f17264g[0] - this.f17266i.getScrollX(), this.f17264g[1] - this.f17266i.getScrollY());
                }
                if (this.f17266i.getLocalVisibleRect(this.f17263f)) {
                    this.f17263f.offset(this.f17264g[0] - this.f17266i.getScrollX(), this.f17264g[1] - this.f17266i.getScrollY());
                    if (this.f17261d.intersect(this.f17263f)) {
                        P.Z(this.f17261d);
                        if (E(this.f17261d)) {
                            P.M0(true);
                        }
                    }
                }
                return P;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    private androidx.core.view.accessibility.c u() {
        androidx.core.view.accessibility.c Q = androidx.core.view.accessibility.c.Q(this.f17266i);
        a0.j0(this.f17266i, Q);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (Q.o() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Q.d(this.f17266i, ((Integer) arrayList.get(i11)).intValue());
            }
            return Q;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private h<androidx.core.view.accessibility.c> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        h<androidx.core.view.accessibility.c> hVar = new h<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            hVar.n(((Integer) arrayList.get(i11)).intValue(), t(((Integer) arrayList.get(i11)).intValue()));
        }
        return hVar;
    }

    private void z(int i11, Rect rect) {
        H(i11).m(rect);
    }

    public final int A() {
        return this.f17267l;
    }

    /* access modifiers changed from: protected */
    public abstract int B(float f11, float f12);

    /* access modifiers changed from: protected */
    public abstract void C(List<Integer> list);

    /* access modifiers changed from: package-private */
    public androidx.core.view.accessibility.c H(int i11) {
        if (i11 == -1) {
            return u();
        }
        return t(i11);
    }

    public final void I(boolean z11, int i11, Rect rect) {
        int i12 = this.f17267l;
        if (i12 != Integer.MIN_VALUE) {
            o(i12);
        }
        if (z11) {
            G(i11, rect);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean J(int i11, int i12, Bundle bundle);

    /* access modifiers changed from: protected */
    public void K(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void L(int i11, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void M(androidx.core.view.accessibility.c cVar) {
    }

    /* access modifiers changed from: protected */
    public abstract void N(int i11, androidx.core.view.accessibility.c cVar);

    /* access modifiers changed from: protected */
    public void O(int i11, boolean z11) {
    }

    /* access modifiers changed from: package-private */
    public boolean P(int i11, int i12, Bundle bundle) {
        if (i11 != -1) {
            return Q(i11, i12, bundle);
        }
        return R(i12, bundle);
    }

    public final boolean T(int i11) {
        int i12;
        if ((!this.f17266i.isFocused() && !this.f17266i.requestFocus()) || (i12 = this.f17267l) == i11) {
            return false;
        }
        if (i12 != Integer.MIN_VALUE) {
            o(i12);
        }
        if (i11 == Integer.MIN_VALUE) {
            return false;
        }
        this.f17267l = i11;
        O(i11, true);
        U(i11, 8);
        return true;
    }

    public final boolean U(int i11, int i12) {
        ViewParent parent;
        if (i11 == Integer.MIN_VALUE || !this.f17265h.isEnabled() || (parent = this.f17266i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f17266i, q(i11, i12));
    }

    public d b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    public void g(View view, androidx.core.view.accessibility.c cVar) {
        super.g(view, cVar);
        M(cVar);
    }

    public final boolean o(int i11) {
        if (this.f17267l != i11) {
            return false;
        }
        this.f17267l = Integer.MIN_VALUE;
        O(i11, false);
        U(i11, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f17265h.isEnabled() || !this.f17265h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B = B(motionEvent.getX(), motionEvent.getY());
            V(B);
            if (B != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.f17268m == Integer.MIN_VALUE) {
            return false;
        } else {
            V(Integer.MIN_VALUE);
            return true;
        }
    }

    public final boolean w(KeyEvent keyEvent) {
        int i11 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int F = F(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z11 = false;
                        while (i11 < repeatCount && G(F, (Rect) null)) {
                            i11++;
                            z11 = true;
                        }
                        return z11;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return G(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return G(1, (Rect) null);
            }
            return false;
        }
    }

    public final int x() {
        return this.k;
    }
}
