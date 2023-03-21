package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.a0;
import java.util.Map;

/* compiled from: ChangeBounds */
public class d extends b0 {
    private static final String[] O = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> P = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> Q = new c(PointF.class, "topLeft");
    private static final Property<k, PointF> R = new C0087d(PointF.class, "bottomRight");
    private static final Property<View, PointF> S = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> T = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> U = new g(PointF.class, "position");
    private static x V = new x();
    private int[] L = new int[2];
    private boolean M = false;
    private boolean N = false;

    /* compiled from: ChangeBounds */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f11867a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f11868b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f11869c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f11870d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f11) {
            this.f11867a = viewGroup;
            this.f11868b = bitmapDrawable;
            this.f11869c = view;
            this.f11870d = f11;
        }

        public void onAnimationEnd(Animator animator) {
            p0.b(this.f11867a).a(this.f11868b);
            p0.h(this.f11869c, this.f11870d);
        }
    }

    /* compiled from: ChangeBounds */
    static class b extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f11872a = new Rect();

        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f11872a);
            Rect rect = this.f11872a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f11872a);
            this.f11872a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f11872a);
        }
    }

    /* compiled from: ChangeBounds */
    static class c extends Property<k, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* renamed from: androidx.transition.d$d  reason: collision with other inner class name */
    /* compiled from: ChangeBounds */
    static class C0087d extends Property<k, PointF> {
        C0087d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* compiled from: ChangeBounds */
    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            p0.g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds */
    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            p0.g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds */
    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            p0.g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f11873a;
        private k mViewBounds;

        h(k kVar) {
            this.f11873a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* compiled from: ChangeBounds */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f11875a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f11876b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f11877c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f11878d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f11879e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f11880f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f11881g;

        i(View view, Rect rect, int i11, int i12, int i13, int i14) {
            this.f11876b = view;
            this.f11877c = rect;
            this.f11878d = i11;
            this.f11879e = i12;
            this.f11880f = i13;
            this.f11881g = i14;
        }

        public void onAnimationCancel(Animator animator) {
            this.f11875a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f11875a) {
                a0.D0(this.f11876b, this.f11877c);
                p0.g(this.f11876b, this.f11878d, this.f11879e, this.f11880f, this.f11881g);
            }
        }
    }

    /* compiled from: ChangeBounds */
    class j extends d0 {

        /* renamed from: a  reason: collision with root package name */
        boolean f11883a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f11884b;

        j(ViewGroup viewGroup) {
            this.f11884b = viewGroup;
        }

        public void a(b0 b0Var) {
            m0.d(this.f11884b, true);
        }

        public void c(b0 b0Var) {
            m0.d(this.f11884b, false);
        }

        public void d(b0 b0Var) {
            if (!this.f11883a) {
                m0.d(this.f11884b, false);
            }
            b0Var.d0(this);
        }

        public void e(b0 b0Var) {
            m0.d(this.f11884b, false);
            this.f11883a = true;
        }
    }

    /* compiled from: ChangeBounds */
    private static class k {

        /* renamed from: a  reason: collision with root package name */
        private int f11886a;

        /* renamed from: b  reason: collision with root package name */
        private int f11887b;

        /* renamed from: c  reason: collision with root package name */
        private int f11888c;

        /* renamed from: d  reason: collision with root package name */
        private int f11889d;

        /* renamed from: e  reason: collision with root package name */
        private View f11890e;

        /* renamed from: f  reason: collision with root package name */
        private int f11891f;

        /* renamed from: g  reason: collision with root package name */
        private int f11892g;

        k(View view) {
            this.f11890e = view;
        }

        private void b() {
            p0.g(this.f11890e, this.f11886a, this.f11887b, this.f11888c, this.f11889d);
            this.f11891f = 0;
            this.f11892g = 0;
        }

        /* access modifiers changed from: package-private */
        public void a(PointF pointF) {
            this.f11888c = Math.round(pointF.x);
            this.f11889d = Math.round(pointF.y);
            int i11 = this.f11892g + 1;
            this.f11892g = i11;
            if (this.f11891f == i11) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(PointF pointF) {
            this.f11886a = Math.round(pointF.x);
            this.f11887b = Math.round(pointF.y);
            int i11 = this.f11891f + 1;
            this.f11891f = i11;
            if (i11 == this.f11892g) {
                b();
            }
        }
    }

    public d() {
    }

    private void t0(h0 h0Var) {
        View view = h0Var.f11936b;
        if (a0.a0(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            h0Var.f11935a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            h0Var.f11935a.put("android:changeBounds:parent", h0Var.f11936b.getParent());
            if (this.N) {
                h0Var.f11936b.getLocationInWindow(this.L);
                h0Var.f11935a.put("android:changeBounds:windowX", Integer.valueOf(this.L[0]));
                h0Var.f11935a.put("android:changeBounds:windowY", Integer.valueOf(this.L[1]));
            }
            if (this.M) {
                h0Var.f11935a.put("android:changeBounds:clip", a0.x(view));
            }
        }
    }

    private boolean u0(View view, View view2) {
        if (!this.N) {
            return true;
        }
        h0 F = F(view, true);
        if (F == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == F.f11936b) {
            return true;
        }
        return false;
    }

    public String[] P() {
        return O;
    }

    public void k(h0 h0Var) {
        t0(h0Var);
    }

    public void n(h0 h0Var) {
        t0(h0Var);
    }

    public Animator r(ViewGroup viewGroup, h0 h0Var, h0 h0Var2) {
        int i11;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i12;
        Rect rect;
        ObjectAnimator objectAnimator2;
        h0 h0Var3 = h0Var;
        h0 h0Var4 = h0Var2;
        if (h0Var3 == null || h0Var4 == null) {
            return null;
        }
        Map<String, Object> map = h0Var3.f11935a;
        Map<String, Object> map2 = h0Var4.f11935a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = h0Var4.f11936b;
        if (u0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) h0Var3.f11935a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) h0Var4.f11935a.get("android:changeBounds:bounds");
            int i13 = rect2.left;
            int i14 = rect3.left;
            int i15 = rect2.top;
            int i16 = rect3.top;
            int i17 = rect2.right;
            int i18 = rect3.right;
            int i19 = rect2.bottom;
            int i21 = rect3.bottom;
            int i22 = i17 - i13;
            int i23 = i19 - i15;
            int i24 = i18 - i14;
            int i25 = i21 - i16;
            View view3 = view2;
            Rect rect4 = (Rect) h0Var3.f11935a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) h0Var4.f11935a.get("android:changeBounds:clip");
            if ((i22 == 0 || i23 == 0) && (i24 == 0 || i25 == 0)) {
                i11 = 0;
            } else {
                i11 = (i13 == i14 && i15 == i16) ? 0 : 1;
                if (!(i17 == i18 && i19 == i21)) {
                    i11++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i11++;
            }
            if (i11 <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.M) {
                view = view3;
                p0.g(view, i13, i15, i17, i19);
                if (i11 == 2) {
                    if (i22 == i24 && i23 == i25) {
                        animator = u.a(view, U, H().a((float) i13, (float) i15, (float) i14, (float) i16));
                    } else {
                        k kVar = new k(view);
                        ObjectAnimator a11 = u.a(kVar, Q, H().a((float) i13, (float) i15, (float) i14, (float) i16));
                        ObjectAnimator a12 = u.a(kVar, R, H().a((float) i17, (float) i19, (float) i18, (float) i21));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a11, a12});
                        animatorSet.addListener(new h(kVar));
                        animator = animatorSet;
                    }
                } else if (i13 == i14 && i15 == i16) {
                    animator = u.a(view, S, H().a((float) i17, (float) i19, (float) i18, (float) i21));
                } else {
                    animator = u.a(view, T, H().a((float) i13, (float) i15, (float) i14, (float) i16));
                }
            } else {
                view = view3;
                p0.g(view, i13, i15, Math.max(i22, i24) + i13, Math.max(i23, i25) + i15);
                if (i13 == i14 && i15 == i16) {
                    objectAnimator = null;
                } else {
                    objectAnimator = u.a(view, U, H().a((float) i13, (float) i15, (float) i14, (float) i16));
                }
                if (rect7 == null) {
                    i12 = 0;
                    rect = new Rect(0, 0, i22, i23);
                } else {
                    i12 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i12, i12, i24, i25) : rect6;
                if (!rect.equals(rect8)) {
                    a0.D0(view, rect);
                    x xVar = V;
                    Object[] objArr = new Object[2];
                    objArr[i12] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", xVar, objArr);
                    ofObject.addListener(new i(view, rect6, i14, i16, i18, i21));
                    objectAnimator2 = ofObject;
                } else {
                    objectAnimator2 = null;
                }
                animator = g0.c(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                m0.d(viewGroup4, true);
                b(new j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) h0Var3.f11935a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) h0Var3.f11935a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) h0Var4.f11935a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) h0Var4.f11935a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.L);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c11 = p0.c(view2);
        p0.h(view2, 0.0f);
        p0.b(viewGroup).b(bitmapDrawable);
        y3.c H = H();
        int[] iArr = this.L;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{w.a(P, H.a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c11));
        return ofPropertyValuesHolder;
    }

    public void v0(boolean z11) {
        this.M = z11;
    }

    @SuppressLint({"RestrictedApi"})
    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f11820d);
        boolean e11 = androidx.core.content.res.k.e(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        v0(e11);
    }
}
