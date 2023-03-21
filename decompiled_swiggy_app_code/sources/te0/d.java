package te0;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;

/* compiled from: DinersOneSplashScreenWithBottomBarBindingImpl */
public class d extends c {
    private static final ViewDataBinding.i D = null;
    private static final SparseIntArray E = null;
    private long C;

    public d(f fVar, View view) {
        this(fVar, view, ViewDataBinding.R(fVar, view, 1, D, E));
    }

    public boolean J() {
        synchronized (this) {
            if (this.C != 0) {
                return true;
            }
            return false;
        }
    }

    public void M() {
        synchronized (this) {
            this.C = 1;
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
            this.C = 0;
        }
    }

    private d(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, objArr[0]);
        this.C = -1;
        this.B.setTag((Object) null);
        k0(view);
        M();
    }
}
