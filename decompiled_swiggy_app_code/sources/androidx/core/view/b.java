package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionProvider */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9482a;

    /* renamed from: b  reason: collision with root package name */
    private a f9483b;

    /* renamed from: c  reason: collision with root package name */
    private C0050b f9484c;

    /* compiled from: ActionProvider */
    public interface a {
    }

    /* renamed from: androidx.core.view.b$b  reason: collision with other inner class name */
    /* compiled from: ActionProvider */
    public interface C0050b {
        void onActionProviderVisibilityChanged(boolean z11);
    }

    public b(Context context) {
        this.f9482a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f9484c = null;
        this.f9483b = null;
    }

    public void i(a aVar) {
        this.f9483b = aVar;
    }

    public void j(C0050b bVar) {
        if (!(this.f9484c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f9484c = bVar;
    }
}
