package mg0;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import in.swiggy.android.commonsui.view.errorview.ErrorView;
import in.swiggy.android.commonsui.view.toolbar.AdvancedToolbar;
import in.swiggy.android.swiggylynx.ui.fragment.viewmodel.LynxFragmentViewModel;
import xh0.a;

/* compiled from: FragmentLynxBinding */
public abstract class e extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final ProgressBar D;
    public final ErrorView E;
    public final ConstraintLayout F;
    public final ConstraintLayout G;
    public final FrameLayout H;
    public final View I;
    public final AdvancedToolbar K;
    public final FrameLayout L;
    protected a M;
    protected LynxFragmentViewModel N;

    protected e(Object obj, View view, int i11, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ProgressBar progressBar, ErrorView errorView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, View view2, AdvancedToolbar advancedToolbar, FrameLayout frameLayout2) {
        super(obj, view, i11);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = progressBar;
        this.E = errorView;
        this.F = constraintLayout;
        this.G = constraintLayout2;
        this.H = frameLayout;
        this.I = view2;
        this.K = advancedToolbar;
        this.L = frameLayout2;
    }

    public abstract void x0(a aVar);

    public abstract void z0(LynxFragmentViewModel lynxFragmentViewModel);
}
