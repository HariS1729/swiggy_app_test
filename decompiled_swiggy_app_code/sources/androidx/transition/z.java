package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.content.res.k;
import androidx.core.view.a0;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: Slide */
public class z extends w0 {
    private static final TimeInterpolator P = new DecelerateInterpolator();
    private static final TimeInterpolator Q = new AccelerateInterpolator();
    private static final g R = new a();
    private static final g S = new b();
    private static final g T = new c();
    private static final g U = new d();
    private static final g V = new e();
    private static final g W = new f();
    private g N = W;
    private int O = 80;

    /* compiled from: Slide */
    static class a extends h {
        a() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* compiled from: Slide */
    static class b extends h {
        b() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            boolean z11 = true;
            if (a0.F(viewGroup) != 1) {
                z11 = false;
            }
            if (z11) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* compiled from: Slide */
    static class c extends i {
        c() {
            super((a) null);
        }

        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* compiled from: Slide */
    static class d extends h {
        d() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* compiled from: Slide */
    static class e extends h {
        e() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            boolean z11 = true;
            if (a0.F(viewGroup) != 1) {
                z11 = false;
            }
            if (z11) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* compiled from: Slide */
    static class f extends i {
        f() {
            super((a) null);
        }

        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* compiled from: Slide */
    private interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* compiled from: Slide */
    private static abstract class h implements g {
        private h() {
        }

        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* compiled from: Slide */
    private static abstract class i implements g {
        private i() {
        }

        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    @SuppressLint({"RestrictedApi"})
    public z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f11824h);
        int k = k.k(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        B0(k);
    }

    private void t0(h0 h0Var) {
        int[] iArr = new int[2];
        h0Var.f11936b.getLocationOnScreen(iArr);
        h0Var.f11935a.put("android:slide:screenPosition", iArr);
    }

    public void B0(int i11) {
        if (i11 == 3) {
            this.N = R;
        } else if (i11 == 5) {
            this.N = U;
        } else if (i11 == 48) {
            this.N = T;
        } else if (i11 == 80) {
            this.N = W;
        } else if (i11 == 8388611) {
            this.N = S;
        } else if (i11 == 8388613) {
            this.N = V;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.O = i11;
        y3.d dVar = new y3.d();
        dVar.j(i11);
        o0(dVar);
    }

    public void k(h0 h0Var) {
        super.k(h0Var);
        t0(h0Var);
    }

    public void n(h0 h0Var) {
        super.n(h0Var);
        t0(h0Var);
    }

    public Animator w0(ViewGroup viewGroup, View view, h0 h0Var, h0 h0Var2) {
        if (h0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) h0Var2.f11935a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return j0.a(view, h0Var2, iArr[0], iArr[1], this.N.b(viewGroup, view), this.N.a(viewGroup, view), translationX, translationY, P, this);
    }

    public Animator y0(ViewGroup viewGroup, View view, h0 h0Var, h0 h0Var2) {
        if (h0Var == null) {
            return null;
        }
        int[] iArr = (int[]) h0Var.f11935a.get("android:slide:screenPosition");
        return j0.a(view, h0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.N.b(viewGroup, view), this.N.a(viewGroup, view), Q, this);
    }
}
