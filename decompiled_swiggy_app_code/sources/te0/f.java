package te0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import in.swiggy.android.reactnative.R;

/* compiled from: MinisSplashScreenBindingImpl */
public class f extends e {
    private static final ViewDataBinding.i F = null;
    private static final SparseIntArray G;
    private final FrameLayout D;
    private long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.background_container, 1);
        sparseIntArray.put(R.id.minis_imageview, 2);
    }

    public f(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.R(fVar, view, 3, F, G));
    }

    public boolean J() {
        synchronized (this) {
            if (this.E != 0) {
                return true;
            }
            return false;
        }
    }

    public void M() {
        synchronized (this) {
            this.E = 1;
        }
        a0();
    }

    /* access modifiers changed from: protected */
    public boolean U(int i11, Object obj, int i12) {
        return false;
    }

    public boolean m0(int i11, Object obj) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void r() {
        synchronized (this) {
            this.E = 0;
        }
    }

    private f(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, objArr[1], objArr[2]);
        this.E = -1;
        FrameLayout frameLayout = objArr[0];
        this.D = frameLayout;
        frameLayout.setTag((Object) null);
        k0(view);
        M();
    }
}
