package mg0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import in.swiggy.android.commonsui.view.CommonTextView;
import in.swiggy.android.swiggylynx.R;

/* compiled from: OverlayCustomDialogLayoutBinding */
public abstract class g extends ViewDataBinding {
    public final ConstraintLayout B;
    public final ConstraintLayout C;
    public final CommonTextView D;
    public final ConstraintLayout E;
    public final ImageView F;
    public final View G;
    public final View H;
    public final CommonTextView I;

    protected g(Object obj, View view, int i11, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, CommonTextView commonTextView, ConstraintLayout constraintLayout3, ImageView imageView, View view2, View view3, CommonTextView commonTextView2) {
        super(obj, view, i11);
        this.B = constraintLayout;
        this.C = constraintLayout2;
        this.D = commonTextView;
        this.E = constraintLayout3;
        this.F = imageView;
        this.G = view2;
        this.H = view3;
        this.I = commonTextView2;
    }

    public static g x0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        return z0(layoutInflater, viewGroup, z11, androidx.databinding.g.h());
    }

    @Deprecated
    public static g z0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11, Object obj) {
        return (g) ViewDataBinding.K(layoutInflater, R.layout.overlay_custom_dialog_layout, viewGroup, z11, obj);
    }
}
