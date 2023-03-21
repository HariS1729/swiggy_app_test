package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ChangeScroll */
public class g extends b0 {
    private static final String[] L = {"android:changeScroll:x", "android:changeScroll:y"};

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void t0(h0 h0Var) {
        h0Var.f11935a.put("android:changeScroll:x", Integer.valueOf(h0Var.f11936b.getScrollX()));
        h0Var.f11935a.put("android:changeScroll:y", Integer.valueOf(h0Var.f11936b.getScrollY()));
    }

    public String[] P() {
        return L;
    }

    public void k(h0 h0Var) {
        t0(h0Var);
    }

    public void n(h0 h0Var) {
        t0(h0Var);
    }

    public Animator r(ViewGroup viewGroup, h0 h0Var, h0 h0Var2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (h0Var == null || h0Var2 == null) {
            return null;
        }
        View view = h0Var2.f11936b;
        int intValue = ((Integer) h0Var.f11935a.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) h0Var2.f11935a.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) h0Var.f11935a.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) h0Var2.f11935a.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", new int[]{intValue3, intValue4});
        }
        return g0.c(objectAnimator, objectAnimator2);
    }
}
