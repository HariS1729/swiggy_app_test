package in.swiggy.android.mvvm.view.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import rb0.d;

public class CustomBottomSheetBehaviour<V extends View> extends BottomSheetBehavior<V> {
    private boolean R;
    private int S = -1;
    private boolean T = false;

    public CustomBottomSheetBehaviour() {
    }

    private void D0(V v) {
        boolean z11;
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        int measuredHeight = v.getMeasuredHeight();
        int i11 = this.S;
        boolean z12 = true;
        if (measuredHeight <= i11 || i11 == -1) {
            z11 = false;
        } else {
            layoutParams.height = i11;
            z11 = true;
        }
        if (this.T) {
            layoutParams.height = measuredHeight;
            this.T = false;
        } else {
            z12 = z11;
        }
        if (z12) {
            v.post(new d(v, layoutParams));
        }
    }

    public static <V extends View> CustomBottomSheetBehaviour<V> E0(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c f11 = ((CoordinatorLayout.f) layoutParams).f();
            if (f11 instanceof CustomBottomSheetBehaviour) {
                return (CustomBottomSheetBehaviour) f11;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public void G0(int i11) {
        this.S = i11;
    }

    public void H0(boolean z11) {
        this.T = z11;
    }

    public void I0(boolean z11) {
        this.R = z11;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        return super.k(coordinatorLayout, v, motionEvent) && this.R;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i11) {
        super.l(coordinatorLayout, v, i11);
        D0(v);
        return true;
    }

    public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f11, float f12) {
        return super.o(coordinatorLayout, v, view, f11, f12) && this.R;
    }

    public boolean z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i11) {
        return super.z(coordinatorLayout, v, view, view2, i11) && this.R;
    }

    public CustomBottomSheetBehaviour(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
