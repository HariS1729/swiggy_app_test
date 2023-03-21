package mg0;

import android.net.Uri;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.recyclerview.widget.RecyclerView;
import hb0.d;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.socialshare.custom.CustomIntentViewMapper;
import java.util.HashMap;
import lb0.c;
import lg0.a;
import ph0.g;
import w2.e;

/* compiled from: CustomIntentBottomsheetBindingImpl */
public class b extends a {
    private static final ViewDataBinding.i H = null;
    private static final SparseIntArray I = null;
    private final LinearLayout C;
    private final TextView D;
    private final ImageView E;
    private final RecyclerView F;
    private long G;

    public b(f fVar, View view) {
        this(fVar, view, ViewDataBinding.R(fVar, view, 4, H, I));
    }

    private boolean z0(ObservableArrayList<d> observableArrayList, int i11) {
        if (i11 != a.f19661a) {
            return false;
        }
        synchronized (this) {
            this.G |= 1;
        }
        return true;
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
            this.G = 4;
        }
        a0();
    }

    /* access modifiers changed from: protected */
    public boolean U(int i11, Object obj, int i12) {
        if (i11 != 0) {
            return false;
        }
        return z0((ObservableArrayList) obj, i12);
    }

    public boolean m0(int i11, Object obj) {
        if (a.f19663c != i11) {
            return false;
        }
        x0((ph0.f) obj);
        return true;
    }

    /* access modifiers changed from: protected */
    public void r() {
        long j;
        c<g> cVar;
        Uri uri;
        String str;
        ObservableArrayList<d> observableArrayList;
        synchronized (this) {
            j = this.G;
            this.G = 0;
        }
        ph0.f fVar = this.B;
        HashMap<Class<?>, lb0.a> hashMap = null;
        int i11 = ((7 & j) > 0 ? 1 : ((7 & j) == 0 ? 0 : -1));
        if (i11 != 0) {
            if ((j & 6) == 0 || fVar == null) {
                str = null;
                uri = null;
                cVar = null;
            } else {
                str = fVar.f();
                uri = fVar.g();
                cVar = fVar.c();
            }
            observableArrayList = fVar != null ? fVar.d() : null;
            s0(0, observableArrayList);
        } else {
            observableArrayList = null;
            str = null;
            uri = null;
            cVar = null;
        }
        int i12 = ((4 & j) > 0 ? 1 : ((4 & j) == 0 ? 0 : -1));
        if (i12 != 0) {
            hashMap = CustomIntentViewMapper.a();
        }
        if ((j & 6) != 0) {
            e.e(this.D, str);
            ph0.b.b(this.E, uri);
            jb0.c.s(this.F, cVar);
        }
        if (i11 != 0) {
            jb0.c.u(this.F, observableArrayList);
        }
        if (i12 != 0) {
            ph0.b.a(this.F, hashMap, 4);
        }
    }

    public void x0(ph0.f fVar) {
        this.B = fVar;
        synchronized (this) {
            this.G |= 2;
        }
        e(a.f19663c);
        super.a0();
    }

    private b(f fVar, View view, Object[] objArr) {
        super(fVar, view, 1);
        this.G = -1;
        LinearLayout linearLayout = objArr[0];
        this.C = linearLayout;
        linearLayout.setTag((Object) null);
        TextView textView = objArr[1];
        this.D = textView;
        textView.setTag((Object) null);
        ImageView imageView = objArr[2];
        this.E = imageView;
        imageView.setTag((Object) null);
        RecyclerView recyclerView = objArr[3];
        this.F = recyclerView;
        recyclerView.setTag((Object) null);
        k0(view);
        M();
    }
}
