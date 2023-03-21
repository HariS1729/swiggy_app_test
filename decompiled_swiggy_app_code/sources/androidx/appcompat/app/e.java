package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.b;
import defpackage.p1;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: AppCompatDelegate */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static int f1516a = -100;

    /* renamed from: b  reason: collision with root package name */
    private static final b<WeakReference<e>> f1517b = new b<>();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1518c = new Object();

    e() {
    }

    static void A(e eVar) {
        synchronized (f1518c) {
            B(eVar);
        }
    }

    private static void B(e eVar) {
        synchronized (f1518c) {
            Iterator<WeakReference<e>> it2 = f1517b.iterator();
            while (it2.hasNext()) {
                e eVar2 = (e) it2.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it2.remove();
                }
            }
        }
    }

    public static void G(int i11) {
        if (i11 != -1 && i11 != 0 && i11 != 1 && i11 != 2 && i11 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f1516a != i11) {
            f1516a = i11;
            f();
        }
    }

    static void c(e eVar) {
        synchronized (f1518c) {
            B(eVar);
            f1517b.add(new WeakReference(eVar));
        }
    }

    private static void f() {
        synchronized (f1518c) {
            Iterator<WeakReference<e>> it2 = f1517b.iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next().get();
                if (eVar != null) {
                    eVar.e();
                }
            }
        }
    }

    public static e i(Activity activity, d dVar) {
        return new f(activity, dVar);
    }

    public static e j(Dialog dialog, d dVar) {
        return new f(dialog, dVar);
    }

    public static int l() {
        return f1516a;
    }

    public abstract boolean C(int i11);

    public abstract void D(int i11);

    public abstract void E(View view);

    public abstract void F(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void H(Toolbar toolbar);

    public void I(int i11) {
    }

    public abstract void J(CharSequence charSequence);

    public abstract p1.c K(p1.c.a aVar);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean e();

    @Deprecated
    public void g(Context context) {
    }

    public Context h(Context context) {
        g(context);
        return context;
    }

    public abstract <T extends View> T k(int i11);

    public abstract b m();

    public int n() {
        return -100;
    }

    public abstract MenuInflater o();

    public abstract a p();

    public abstract void q();

    public abstract void r();

    public abstract void s(Configuration configuration);

    public abstract void t(Bundle bundle);

    public abstract void u();

    public abstract void v(Bundle bundle);

    public abstract void w();

    public abstract void x(Bundle bundle);

    public abstract void y();

    public abstract void z();
}
