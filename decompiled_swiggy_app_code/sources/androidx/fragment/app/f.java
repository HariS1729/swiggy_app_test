package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.g;
import androidx.lifecycle.p0;

/* compiled from: FragmentController */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final h<?> f10478a;

    private f(h<?> hVar) {
        this.f10478a = hVar;
    }

    public static f b(h<?> hVar) {
        return new f((h) g.h(hVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        h<?> hVar = this.f10478a;
        hVar.f10484e.l(hVar, hVar, fragment);
    }

    public void c() {
        this.f10478a.f10484e.A();
    }

    public void d(Configuration configuration) {
        this.f10478a.f10484e.C(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f10478a.f10484e.D(menuItem);
    }

    public void f() {
        this.f10478a.f10484e.E();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f10478a.f10484e.F(menu, menuInflater);
    }

    public void h() {
        this.f10478a.f10484e.G();
    }

    public void i() {
        this.f10478a.f10484e.I();
    }

    public void j(boolean z11) {
        this.f10478a.f10484e.J(z11);
    }

    public boolean k(MenuItem menuItem) {
        return this.f10478a.f10484e.L(menuItem);
    }

    public void l(Menu menu) {
        this.f10478a.f10484e.M(menu);
    }

    public void m() {
        this.f10478a.f10484e.O();
    }

    public void n(boolean z11) {
        this.f10478a.f10484e.P(z11);
    }

    public boolean o(Menu menu) {
        return this.f10478a.f10484e.Q(menu);
    }

    public void p() {
        this.f10478a.f10484e.S();
    }

    public void q() {
        this.f10478a.f10484e.T();
    }

    public void r() {
        this.f10478a.f10484e.V();
    }

    public boolean s() {
        return this.f10478a.f10484e.c0(true);
    }

    public FragmentManager t() {
        return this.f10478a.f10484e;
    }

    public void u() {
        this.f10478a.f10484e.X0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f10478a.f10484e.y0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        h<?> hVar = this.f10478a;
        if (hVar instanceof p0) {
            hVar.f10484e.o1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public Parcelable x() {
        return this.f10478a.f10484e.q1();
    }
}
