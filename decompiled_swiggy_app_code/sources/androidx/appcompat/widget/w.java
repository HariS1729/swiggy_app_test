package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.core.view.h0;

/* compiled from: DecorToolbar */
public interface w {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    boolean d();

    void e(Menu menu, j.a aVar);

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i11);

    int j();

    void k();

    void l(boolean z11);

    void m();

    int n();

    void o();

    void p(Drawable drawable);

    Menu q();

    h0 r(int i11, long j);

    ViewGroup s();

    void setIcon(int i11);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i11);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(boolean z11);

    void u(h0 h0Var);

    void v(int i11);

    void w(j.a aVar, e.a aVar2);
}
