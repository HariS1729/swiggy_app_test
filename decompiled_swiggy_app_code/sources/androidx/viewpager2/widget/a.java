package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: AnimateLayoutChangeDetector */
final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f12246b;

    /* renamed from: a  reason: collision with root package name */
    private LinearLayoutManager f12247a;

    /* renamed from: androidx.viewpager2.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AnimateLayoutChangeDetector */
    class C0091a implements Comparator<int[]> {
        C0091a() {
        }

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f12246b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    a(LinearLayoutManager linearLayoutManager) {
        this.f12247a = linearLayoutManager;
    }

    private boolean a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i11;
        int i12;
        int i13;
        int i14;
        int U = this.f12247a.U();
        if (U == 0) {
            return true;
        }
        boolean z11 = this.f12247a.w2() == 0;
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = U;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int i15 = 0;
        while (i15 < U) {
            View T = this.f12247a.T(i15);
            if (T != null) {
                ViewGroup.LayoutParams layoutParams = T.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f12246b;
                }
                int[] iArr3 = iArr2[i15];
                if (z11) {
                    i12 = T.getLeft();
                    i11 = marginLayoutParams.leftMargin;
                } else {
                    i12 = T.getTop();
                    i11 = marginLayoutParams.topMargin;
                }
                iArr3[0] = i12 - i11;
                int[] iArr4 = iArr2[i15];
                if (z11) {
                    i14 = T.getRight();
                    i13 = marginLayoutParams.rightMargin;
                } else {
                    i14 = T.getBottom();
                    i13 = marginLayoutParams.bottomMargin;
                }
                iArr4[1] = i14 + i13;
                i15++;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr2, new C0091a());
        for (int i16 = 1; i16 < U; i16++) {
            if (iArr2[i16 - 1][1] != iArr2[i16][0]) {
                return false;
            }
        }
        int i17 = iArr2[0][1] - iArr2[0][0];
        if (iArr2[0][0] > 0 || iArr2[U - 1][1] < i17) {
            return false;
        }
        return true;
    }

    private boolean b() {
        int U = this.f12247a.U();
        for (int i11 = 0; i11 < U; i11++) {
            if (c(this.f12247a.T(i11))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (c(viewGroup.getChildAt(i11))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        if ((!a() || this.f12247a.U() <= 1) && b()) {
            return true;
        }
        return false;
    }
}
