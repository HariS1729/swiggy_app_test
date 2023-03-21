package mg0;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import in.swiggy.android.swiggylynx.R;
import jb0.c;
import lg0.a;

/* compiled from: ViewHandpickedLoaderBindingImpl */
public class j extends i {
    private static final ViewDataBinding.i G = null;
    private static final SparseIntArray H;
    private final ConstraintLayout E;
    private long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.watch_animation, 1);
        sparseIntArray.put(R.id.handpicked_imageview, 2);
    }

    public j(f fVar, View view) {
        this(fVar, view, ViewDataBinding.R(fVar, view, 3, G, H));
    }

    private boolean z0(ObservableBoolean observableBoolean, int i11) {
        if (i11 != a.f19661a) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
        }
        return true;
    }

    public boolean J() {
        synchronized (this) {
            if (this.F != 0) {
                return true;
            }
            return false;
        }
    }

    public void M() {
        synchronized (this) {
            this.F = 4;
        }
        a0();
    }

    /* access modifiers changed from: protected */
    public boolean U(int i11, Object obj, int i12) {
        if (i11 != 0) {
            return false;
        }
        return z0((ObservableBoolean) obj, i12);
    }

    public boolean m0(int i11, Object obj) {
        if (a.f19663c != i11) {
            return false;
        }
        x0((qg0.a) obj);
        return true;
    }

    /* access modifiers changed from: protected */
    public void r() {
        long j;
        synchronized (this) {
            j = this.F;
            this.F = 0;
        }
        qg0.a aVar = this.D;
        ObservableBoolean observableBoolean = null;
        boolean z11 = false;
        int i11 = ((j & 7) > 0 ? 1 : ((j & 7) == 0 ? 0 : -1));
        if (i11 != 0) {
            if (aVar != null) {
                observableBoolean = aVar.a();
            }
            r0(0, observableBoolean);
            if (observableBoolean != null) {
                z11 = observableBoolean.g();
            }
        }
        if (i11 != 0) {
            c.e(this.E, Boolean.valueOf(z11));
        }
    }

    public void x0(qg0.a aVar) {
        this.D = aVar;
        synchronized (this) {
            this.F |= 2;
        }
        e(a.f19663c);
        super.a0();
    }

    private j(f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, objArr[2], objArr[1]);
        this.F = -1;
        ConstraintLayout constraintLayout = objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag((Object) null);
        k0(view);
        M();
    }
}
