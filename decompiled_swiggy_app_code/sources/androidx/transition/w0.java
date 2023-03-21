package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.k;
import androidx.transition.b0;

/* compiled from: Visibility */
public abstract class w0 extends b0 {
    private static final String[] M = {"android:visibility:visibility", "android:visibility:parent"};
    private int L = 3;

    /* compiled from: Visibility */
    class a extends d0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f12012a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f12013b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f12014c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f12012a = viewGroup;
            this.f12013b = view;
            this.f12014c = view2;
        }

        public void a(b0 b0Var) {
            if (this.f12013b.getParent() == null) {
                m0.b(this.f12012a).c(this.f12013b);
            } else {
                w0.this.cancel();
            }
        }

        public void c(b0 b0Var) {
            m0.b(this.f12012a).d(this.f12013b);
        }

        public void d(b0 b0Var) {
            this.f12014c.setTag(R.id.save_overlay_view, (Object) null);
            m0.b(this.f12012a).d(this.f12013b);
            b0Var.d0(this);
        }
    }

    /* compiled from: Visibility */
    private static class b extends AnimatorListenerAdapter implements b0.g {

        /* renamed from: a  reason: collision with root package name */
        private final View f12016a;

        /* renamed from: b  reason: collision with root package name */
        private final int f12017b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f12018c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f12019d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f12020e;

        /* renamed from: f  reason: collision with root package name */
        boolean f12021f = false;

        b(View view, int i11, boolean z11) {
            this.f12016a = view;
            this.f12017b = i11;
            this.f12018c = (ViewGroup) view.getParent();
            this.f12019d = z11;
            g(true);
        }

        private void f() {
            if (!this.f12021f) {
                p0.i(this.f12016a, this.f12017b);
                ViewGroup viewGroup = this.f12018c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z11) {
            ViewGroup viewGroup;
            if (this.f12019d && this.f12020e != z11 && (viewGroup = this.f12018c) != null) {
                this.f12020e = z11;
                m0.d(viewGroup, z11);
            }
        }

        public void a(b0 b0Var) {
            g(true);
        }

        public void b(b0 b0Var) {
        }

        public void c(b0 b0Var) {
            g(false);
        }

        public void d(b0 b0Var) {
            f();
            b0Var.d0(this);
        }

        public void e(b0 b0Var) {
        }

        public void onAnimationCancel(Animator animator) {
            this.f12021f = true;
        }

        public void onAnimationEnd(Animator animator) {
            f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f12021f) {
                p0.i(this.f12016a, this.f12017b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f12021f) {
                p0.i(this.f12016a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: Visibility */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f12022a;

        /* renamed from: b  reason: collision with root package name */
        boolean f12023b;

        /* renamed from: c  reason: collision with root package name */
        int f12024c;

        /* renamed from: d  reason: collision with root package name */
        int f12025d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f12026e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f12027f;

        c() {
        }
    }

    public w0() {
    }

    private void t0(h0 h0Var) {
        h0Var.f11935a.put("android:visibility:visibility", Integer.valueOf(h0Var.f11936b.getVisibility()));
        h0Var.f11935a.put("android:visibility:parent", h0Var.f11936b.getParent());
        int[] iArr = new int[2];
        h0Var.f11936b.getLocationOnScreen(iArr);
        h0Var.f11935a.put("android:visibility:screenLocation", iArr);
    }

    private c v0(h0 h0Var, h0 h0Var2) {
        c cVar = new c();
        cVar.f12022a = false;
        cVar.f12023b = false;
        if (h0Var == null || !h0Var.f11935a.containsKey("android:visibility:visibility")) {
            cVar.f12024c = -1;
            cVar.f12026e = null;
        } else {
            cVar.f12024c = ((Integer) h0Var.f11935a.get("android:visibility:visibility")).intValue();
            cVar.f12026e = (ViewGroup) h0Var.f11935a.get("android:visibility:parent");
        }
        if (h0Var2 == null || !h0Var2.f11935a.containsKey("android:visibility:visibility")) {
            cVar.f12025d = -1;
            cVar.f12027f = null;
        } else {
            cVar.f12025d = ((Integer) h0Var2.f11935a.get("android:visibility:visibility")).intValue();
            cVar.f12027f = (ViewGroup) h0Var2.f11935a.get("android:visibility:parent");
        }
        if (h0Var != null && h0Var2 != null) {
            int i11 = cVar.f12024c;
            int i12 = cVar.f12025d;
            if (i11 == i12 && cVar.f12026e == cVar.f12027f) {
                return cVar;
            }
            if (i11 != i12) {
                if (i11 == 0) {
                    cVar.f12023b = false;
                    cVar.f12022a = true;
                } else if (i12 == 0) {
                    cVar.f12023b = true;
                    cVar.f12022a = true;
                }
            } else if (cVar.f12027f == null) {
                cVar.f12023b = false;
                cVar.f12022a = true;
            } else if (cVar.f12026e == null) {
                cVar.f12023b = true;
                cVar.f12022a = true;
            }
        } else if (h0Var == null && cVar.f12025d == 0) {
            cVar.f12023b = true;
            cVar.f12022a = true;
        } else if (h0Var2 == null && cVar.f12024c == 0) {
            cVar.f12023b = false;
            cVar.f12022a = true;
        }
        return cVar;
    }

    public void A0(int i11) {
        if ((i11 & -4) == 0) {
            this.L = i11;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public String[] P() {
        return M;
    }

    public boolean R(h0 h0Var, h0 h0Var2) {
        if (h0Var == null && h0Var2 == null) {
            return false;
        }
        if (h0Var != null && h0Var2 != null && h0Var2.f11935a.containsKey("android:visibility:visibility") != h0Var.f11935a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c v02 = v0(h0Var, h0Var2);
        if (!v02.f12022a) {
            return false;
        }
        if (v02.f12024c == 0 || v02.f12025d == 0) {
            return true;
        }
        return false;
    }

    public void k(h0 h0Var) {
        t0(h0Var);
    }

    public void n(h0 h0Var) {
        t0(h0Var);
    }

    public Animator r(ViewGroup viewGroup, h0 h0Var, h0 h0Var2) {
        c v02 = v0(h0Var, h0Var2);
        if (!v02.f12022a) {
            return null;
        }
        if (v02.f12026e == null && v02.f12027f == null) {
            return null;
        }
        if (v02.f12023b) {
            return x0(viewGroup, h0Var, v02.f12024c, h0Var2, v02.f12025d);
        }
        return z0(viewGroup, h0Var, v02.f12024c, h0Var2, v02.f12025d);
    }

    public int u0() {
        return this.L;
    }

    public abstract Animator w0(ViewGroup viewGroup, View view, h0 h0Var, h0 h0Var2);

    public Animator x0(ViewGroup viewGroup, h0 h0Var, int i11, h0 h0Var2, int i12) {
        if ((this.L & 1) != 1 || h0Var2 == null) {
            return null;
        }
        if (h0Var == null) {
            View view = (View) h0Var2.f11936b.getParent();
            if (v0(F(view, false), Q(view, false)).f12022a) {
                return null;
            }
        }
        return w0(viewGroup, h0Var2.f11936b, h0Var, h0Var2);
    }

    public abstract Animator y0(ViewGroup viewGroup, View view, h0 h0Var, h0 h0Var2);

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r0.f11849w != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator z0(android.view.ViewGroup r18, androidx.transition.h0 r19, int r20, androidx.transition.h0 r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.L
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.f11936b
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.f11936b
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = androidx.transition.R.id.save_overlay_view
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = 1
            goto L_0x0095
        L_0x002d:
            if (r8 == 0) goto L_0x0040
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0045
        L_0x003c:
            r10 = r8
            r13 = 0
            r8 = r7
            goto L_0x0048
        L_0x0040:
            if (r8 == 0) goto L_0x0045
            r10 = r7
            r13 = 0
            goto L_0x0048
        L_0x0045:
            r8 = r7
            r10 = r8
            r13 = 1
        L_0x0048:
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x008b
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            androidx.transition.h0 r14 = r0.Q(r13, r12)
            androidx.transition.h0 r15 = r0.F(r13, r12)
            androidx.transition.w0$c r14 = r0.v0(r14, r15)
            boolean r14 = r14.f12022a
            if (r14 != 0) goto L_0x0074
            android.view.View r8 = androidx.transition.g0.a(r1, r5, r13)
            goto L_0x008f
        L_0x0074:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x008f
            r13 = -1
            if (r14 == r13) goto L_0x008f
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x008f
            boolean r13 = r0.f11849w
            if (r13 == 0) goto L_0x008f
        L_0x008b:
            r8 = r10
            r13 = 0
            r10 = r5
            goto L_0x0095
        L_0x008f:
            r13 = 0
            r16 = r10
            r10 = r8
            r8 = r16
        L_0x0095:
            if (r10 == 0) goto L_0x00e5
            if (r13 != 0) goto L_0x00c9
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f11935a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            androidx.transition.l0 r4 = androidx.transition.m0.b(r18)
            r4.c(r10)
        L_0x00c9:
            android.animation.Animator r2 = r0.y0(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d9
            androidx.transition.l0 r1 = androidx.transition.m0.b(r18)
            r1.d(r10)
            goto L_0x00e4
        L_0x00d9:
            r5.setTag(r9, r10)
            androidx.transition.w0$a r3 = new androidx.transition.w0$a
            r3.<init>(r1, r10, r5)
            r0.b(r3)
        L_0x00e4:
            return r2
        L_0x00e5:
            if (r8 == 0) goto L_0x0107
            int r5 = r8.getVisibility()
            androidx.transition.p0.i(r8, r11)
            android.animation.Animator r1 = r0.y0(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0103
            androidx.transition.w0$b r2 = new androidx.transition.w0$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            androidx.transition.a.a(r1, r2)
            r0.b(r2)
            goto L_0x0106
        L_0x0103:
            androidx.transition.p0.i(r8, r5)
        L_0x0106:
            return r1
        L_0x0107:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.w0.z0(android.view.ViewGroup, androidx.transition.h0, int, androidx.transition.h0, int):android.animation.Animator");
    }

    @SuppressLint({"RestrictedApi"})
    public w0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f11821e);
        int k = k.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (k != 0) {
            A0(k);
        }
    }
}
