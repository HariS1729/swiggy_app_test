package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import y3.b;

/* compiled from: Explode */
public class i extends w0 {
    private static final TimeInterpolator O = new DecelerateInterpolator();
    private static final TimeInterpolator P = new AccelerateInterpolator();
    private int[] N = new int[2];

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o0(new b());
    }

    private static float B0(float f11, float f12) {
        return (float) Math.sqrt((double) ((f11 * f11) + (f12 * f12)));
    }

    private static float C0(View view, int i11, int i12) {
        return B0((float) Math.max(i11, view.getWidth() - i11), (float) Math.max(i12, view.getHeight() - i12));
    }

    private void D0(View view, Rect rect, int[] iArr) {
        int i11;
        int i12;
        View view2 = view;
        view2.getLocationOnScreen(this.N);
        int[] iArr2 = this.N;
        int i13 = iArr2[0];
        int i14 = iArr2[1];
        Rect C = C();
        if (C == null) {
            i12 = (view.getWidth() / 2) + i13 + Math.round(view.getTranslationX());
            i11 = (view.getHeight() / 2) + i14 + Math.round(view.getTranslationY());
        } else {
            int centerX = C.centerX();
            i11 = C.centerY();
            i12 = centerX;
        }
        float centerX2 = (float) (rect.centerX() - i12);
        float centerY = (float) (rect.centerY() - i11);
        if (centerX2 == 0.0f && centerY == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float B0 = B0(centerX2, centerY);
        float C0 = C0(view2, i12 - i13, i11 - i14);
        iArr[0] = Math.round((centerX2 / B0) * C0);
        iArr[1] = Math.round(C0 * (centerY / B0));
    }

    private void t0(h0 h0Var) {
        View view = h0Var.f11936b;
        view.getLocationOnScreen(this.N);
        int[] iArr = this.N;
        int i11 = iArr[0];
        int i12 = iArr[1];
        h0Var.f11935a.put("android:explode:screenBounds", new Rect(i11, i12, view.getWidth() + i11, view.getHeight() + i12));
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
        Rect rect = (Rect) h0Var2.f11935a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        D0(viewGroup, rect, this.N);
        int[] iArr = this.N;
        return j0.a(view, h0Var2, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, O, this);
    }

    public Animator y0(ViewGroup viewGroup, View view, h0 h0Var, h0 h0Var2) {
        float f11;
        float f12;
        if (h0Var == null) {
            return null;
        }
        Rect rect = (Rect) h0Var.f11935a.get("android:explode:screenBounds");
        int i11 = rect.left;
        int i12 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) h0Var.f11936b.getTag(R.id.transition_position);
        if (iArr != null) {
            f12 = ((float) (iArr[0] - rect.left)) + translationX;
            f11 = ((float) (iArr[1] - rect.top)) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f12 = translationX;
            f11 = translationY;
        }
        D0(viewGroup, rect, this.N);
        int[] iArr2 = this.N;
        return j0.a(view, h0Var, i11, i12, translationX, translationY, f12 + ((float) iArr2[0]), f11 + ((float) iArr2[1]), P, this);
    }
}
