package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper */
public class l0 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f2206c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<WeakReference<l0>> f2207d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f2208a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f2209b;

    private l0(Context context) {
        super(context);
        if (t0.c()) {
            t0 t0Var = new t0(this, context.getResources());
            this.f2208a = t0Var;
            Resources.Theme newTheme = t0Var.newTheme();
            this.f2209b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f2208a = new n0(this, context.getResources());
        this.f2209b = null;
    }

    private static boolean a(Context context) {
        if ((context instanceof l0) || (context.getResources() instanceof n0) || (context.getResources() instanceof t0) || !t0.c()) {
            return false;
        }
        return true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f2206c) {
            ArrayList<WeakReference<l0>> arrayList = f2207d;
            if (arrayList == null) {
                f2207d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f2207d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f2207d.remove(size);
                    }
                }
                for (int size2 = f2207d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f2207d.get(size2);
                    l0 l0Var = weakReference2 != null ? (l0) weakReference2.get() : null;
                    if (l0Var != null && l0Var.getBaseContext() == context) {
                        return l0Var;
                    }
                }
            }
            l0 l0Var2 = new l0(context);
            f2207d.add(new WeakReference(l0Var2));
            return l0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f2208a.getAssets();
    }

    public Resources getResources() {
        return this.f2208a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2209b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i11) {
        Resources.Theme theme = this.f2209b;
        if (theme == null) {
            super.setTheme(i11);
        } else {
            theme.applyStyle(i11, true);
        }
    }
}
