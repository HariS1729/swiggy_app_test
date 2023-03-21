package mg0;

import android.util.SparseIntArray;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import in.swiggy.android.swiggylynx.R;

/* compiled from: OverlayCustomDialogLayoutBindingImpl */
public class h extends g {
    private static final ViewDataBinding.i M = null;
    private static final SparseIntArray N;
    private final CardView K;
    private long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.dialog_container, 1);
        sparseIntArray.put(R.id.dialog_header_image, 2);
        sparseIntArray.put(R.id.title, 3);
        sparseIntArray.put(R.id.description, 4);
        sparseIntArray.put(R.id.divider1, 5);
        sparseIntArray.put(R.id.button_later, 6);
        sparseIntArray.put(R.id.divider2, 7);
        sparseIntArray.put(R.id.button_settings, 8);
    }

    public h(f fVar, View view) {
        this(fVar, view, ViewDataBinding.R(fVar, view, 9, M, N));
    }

    public boolean J() {
        synchronized (this) {
            if (this.L != 0) {
                return true;
            }
            return false;
        }
    }

    public void M() {
        synchronized (this) {
            this.L = 1;
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
            this.L = 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private h(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, objArr[6], objArr[8], objArr[4], objArr[1], objArr[2], objArr[5], objArr[7], objArr[3]);
        this.L = -1;
        CardView cardView = objArr[0];
        this.K = cardView;
        cardView.setTag((Object) null);
        View view2 = view;
        k0(view);
        M();
    }
}
