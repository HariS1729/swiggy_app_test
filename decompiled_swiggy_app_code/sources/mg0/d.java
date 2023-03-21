package mg0;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import lg0.a;
import ph0.g;
import w2.c;
import w2.e;

/* compiled from: CustomIntentItemBindingImpl */
public class d extends c {
    private static final ViewDataBinding.i H = null;
    private static final SparseIntArray I = null;
    private final LinearLayout F;
    private long G;

    public d(f fVar, View view) {
        this(fVar, view, ViewDataBinding.R(fVar, view, 4, H, I));
    }

    public boolean J() {
        synchronized (this) {
            if (this.G != 0) {
                return true;
            }
            return false;
        }
    }

    public void M() {
        synchronized (this) {
            this.G = 2;
        }
        a0();
    }

    /* access modifiers changed from: protected */
    public boolean U(int i11, Object obj, int i12) {
        return false;
    }

    public boolean m0(int i11, Object obj) {
        if (a.f19663c != i11) {
            return false;
        }
        x0((g) obj);
        return true;
    }

    /* access modifiers changed from: protected */
    public void r() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.G;
            this.G = 0;
        }
        g gVar = this.E;
        Drawable drawable = null;
        int i11 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i11 == 0 || gVar == null) {
            str2 = null;
            str = null;
        } else {
            String d11 = gVar.d();
            Drawable a11 = gVar.a();
            str = gVar.c();
            String str3 = d11;
            drawable = a11;
            str2 = str3;
        }
        if (i11 != 0) {
            c.a(this.B, drawable);
            e.e(this.C, str2);
            e.e(this.D, str);
        }
    }

    public void x0(g gVar) {
        this.E = gVar;
        synchronized (this) {
            this.G |= 1;
        }
        e(a.f19663c);
        super.a0();
    }

    private d(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, objArr[1], objArr[2], objArr[3]);
        this.G = -1;
        this.B.setTag((Object) null);
        this.C.setTag((Object) null);
        LinearLayout linearLayout = objArr[0];
        this.F = linearLayout;
        linearLayout.setTag((Object) null);
        this.D.setTag((Object) null);
        k0(view);
        M();
    }
}
