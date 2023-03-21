package y3;

import android.view.View;
import androidx.transition.h0;

/* compiled from: VisibilityPropagation */
public abstract class f extends e {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f18020a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    private static int d(h0 h0Var, int i11) {
        int[] iArr;
        if (h0Var == null || (iArr = (int[]) h0Var.f11935a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i11];
    }

    public void a(h0 h0Var) {
        View view = h0Var.f11936b;
        Integer num = (Integer) h0Var.f11935a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        h0Var.f11935a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        h0Var.f11935a.put("android:visibilityPropagation:center", iArr);
    }

    public String[] b() {
        return f18020a;
    }

    public int e(h0 h0Var) {
        Integer num;
        if (h0Var == null || (num = (Integer) h0Var.f11935a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(h0 h0Var) {
        return d(h0Var, 0);
    }

    public int g(h0 h0Var) {
        return d(h0Var, 1);
    }
}
