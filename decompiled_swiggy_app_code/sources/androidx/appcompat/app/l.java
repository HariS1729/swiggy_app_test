package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.p0;
import androidx.appcompat.widget.w;
import androidx.core.view.a0;
import defpackage.p1;
import java.util.ArrayList;

/* compiled from: ToolbarActionBar */
class l extends a {

    /* renamed from: a  reason: collision with root package name */
    w f1603a;

    /* renamed from: b  reason: collision with root package name */
    boolean f1604b;

    /* renamed from: c  reason: collision with root package name */
    Window.Callback f1605c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1606d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1607e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<a.b> f1608f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f1609g = new a();

    /* renamed from: h  reason: collision with root package name */
    private final Toolbar.f f1610h;

    /* compiled from: ToolbarActionBar */
    class a implements Runnable {
        a() {
        }

        public void run() {
            l.this.A();
        }
    }

    /* compiled from: ToolbarActionBar */
    class b implements Toolbar.f {
        b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return l.this.f1605c.onMenuItemSelected(0, menuItem);
        }
    }

    /* compiled from: ToolbarActionBar */
    private final class c implements j.a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1613a;

        c() {
        }

        public void c(androidx.appcompat.view.menu.e eVar, boolean z11) {
            if (!this.f1613a) {
                this.f1613a = true;
                l.this.f1603a.m();
                Window.Callback callback = l.this.f1605c;
                if (callback != null) {
                    callback.onPanelClosed(108, eVar);
                }
                this.f1613a = false;
            }
        }

        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callback = l.this.f1605c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar */
    private final class d implements e.a {
        d() {
        }

        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        public void b(androidx.appcompat.view.menu.e eVar) {
            l lVar = l.this;
            if (lVar.f1605c == null) {
                return;
            }
            if (lVar.f1603a.c()) {
                l.this.f1605c.onPanelClosed(108, eVar);
            } else if (l.this.f1605c.onPreparePanel(0, (View) null, eVar)) {
                l.this.f1605c.onMenuOpened(108, eVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar */
    private class e extends p1.j {
        public e(Window.Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i11) {
            if (i11 == 0) {
                return new View(l.this.f1603a.getContext());
            }
            return super.onCreatePanelView(i11);
        }

        public boolean onPreparePanel(int i11, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i11, view, menu);
            if (onPreparePanel) {
                l lVar = l.this;
                if (!lVar.f1604b) {
                    lVar.f1603a.f();
                    l.this.f1604b = true;
                }
            }
            return onPreparePanel;
        }
    }

    l(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f1610h = bVar;
        this.f1603a = new p0(toolbar, false);
        e eVar = new e(callback);
        this.f1605c = eVar;
        this.f1603a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.f1603a.setWindowTitle(charSequence);
    }

    private Menu y() {
        if (!this.f1606d) {
            this.f1603a.w(new c(), new d());
            this.f1606d = true;
        }
        return this.f1603a.q();
    }

    /* access modifiers changed from: package-private */
    public void A() {
        Menu y11 = y();
        androidx.appcompat.view.menu.e eVar = y11 instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) y11 : null;
        if (eVar != null) {
            eVar.h0();
        }
        try {
            y11.clear();
            if (!this.f1605c.onCreatePanelMenu(0, y11) || !this.f1605c.onPreparePanel(0, (View) null, y11)) {
                y11.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.g0();
            }
        }
    }

    public void B(int i11, int i12) {
        this.f1603a.i((i11 & i12) | ((~i12) & this.f1603a.n()));
    }

    public boolean g() {
        return this.f1603a.d();
    }

    public boolean h() {
        if (!this.f1603a.h()) {
            return false;
        }
        this.f1603a.collapseActionView();
        return true;
    }

    public void i(boolean z11) {
        if (z11 != this.f1607e) {
            this.f1607e = z11;
            int size = this.f1608f.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f1608f.get(i11).a(z11);
            }
        }
    }

    public int j() {
        return this.f1603a.n();
    }

    public Context k() {
        return this.f1603a.getContext();
    }

    public boolean l() {
        this.f1603a.s().removeCallbacks(this.f1609g);
        a0.o0(this.f1603a.s(), this.f1609g);
        return true;
    }

    public void m(Configuration configuration) {
        super.m(configuration);
    }

    /* access modifiers changed from: package-private */
    public void n() {
        this.f1603a.s().removeCallbacks(this.f1609g);
    }

    public boolean o(int i11, KeyEvent keyEvent) {
        Menu y11 = y();
        if (y11 == null) {
            return false;
        }
        boolean z11 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z11 = false;
        }
        y11.setQwertyMode(z11);
        return y11.performShortcut(i11, keyEvent, 0);
    }

    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    public boolean q() {
        return this.f1603a.b();
    }

    public void r(boolean z11) {
    }

    public void s(boolean z11) {
        B(z11 ? 4 : 0, 4);
    }

    public void t(Drawable drawable) {
        this.f1603a.p(drawable);
    }

    public void u(boolean z11) {
    }

    public void v(CharSequence charSequence) {
        this.f1603a.setTitle(charSequence);
    }

    public void w(CharSequence charSequence) {
        this.f1603a.setWindowTitle(charSequence);
    }

    public Window.Callback z() {
        return this.f1605c;
    }
}
