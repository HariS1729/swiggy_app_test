package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.k;
import androidx.core.view.a0;

/* compiled from: Fade */
public class j extends w0 {

    /* compiled from: Fade */
    class a extends d0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f11942a;

        a(View view) {
            this.f11942a = view;
        }

        public void d(b0 b0Var) {
            p0.h(this.f11942a, 1.0f);
            p0.a(this.f11942a);
            b0Var.d0(this);
        }
    }

    /* compiled from: Fade */
    private static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f11944a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f11945b = false;

        b(View view) {
            this.f11944a = view;
        }

        public void onAnimationEnd(Animator animator) {
            p0.h(this.f11944a, 1.0f);
            if (this.f11945b) {
                this.f11944a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (a0.W(this.f11944a) && this.f11944a.getLayerType() == 0) {
                this.f11945b = true;
                this.f11944a.setLayerType(2, (Paint) null);
            }
        }
    }

    public j(int i11) {
        A0(i11);
    }

    private Animator B0(View view, float f11, float f12) {
        if (f11 == f12) {
            return null;
        }
        p0.h(view, f11);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, p0.f11996b, new float[]{f12});
        ofFloat.addListener(new b(view));
        b(new a(view));
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f11935a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float C0(androidx.transition.h0 r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f11935a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.j.C0(androidx.transition.h0, float):float");
    }

    public void n(h0 h0Var) {
        super.n(h0Var);
        h0Var.f11935a.put("android:fade:transitionAlpha", Float.valueOf(p0.c(h0Var.f11936b)));
    }

    public Animator w0(ViewGroup viewGroup, View view, h0 h0Var, h0 h0Var2) {
        float f11 = 0.0f;
        float C0 = C0(h0Var, 0.0f);
        if (C0 != 1.0f) {
            f11 = C0;
        }
        return B0(view, f11, 1.0f);
    }

    public Animator y0(ViewGroup viewGroup, View view, h0 h0Var, h0 h0Var2) {
        p0.e(view);
        return B0(view, C0(h0Var, 1.0f), 0.0f);
    }

    public j() {
    }

    @SuppressLint({"RestrictedApi"})
    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f11822f);
        A0(k.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, u0()));
        obtainStyledAttributes.recycle();
    }
}
