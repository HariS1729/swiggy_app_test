package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.collection.g;

/* compiled from: WindowInsetsControllerCompat */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    private final e f9593a;

    /* compiled from: WindowInsetsControllerCompat */
    private static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        protected final Window f9594a;

        /* renamed from: b  reason: collision with root package name */
        private final View f9595b;

        a(Window window, View view) {
            this.f9594a = window;
            this.f9595b = view;
        }

        private void h(int i11) {
            if (i11 == 1) {
                j(4);
            } else if (i11 == 2) {
                j(2);
            } else if (i11 == 8) {
                ((InputMethodManager) this.f9594a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f9594a.getDecorView().getWindowToken(), 0);
            }
        }

        private void l(int i11) {
            if (i11 == 1) {
                m(4);
                n(1024);
            } else if (i11 == 2) {
                m(2);
            } else if (i11 == 8) {
                View view = this.f9595b;
                if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                    view.requestFocus();
                } else {
                    view = this.f9594a.getCurrentFocus();
                }
                if (view == null) {
                    view = this.f9594a.findViewById(16908290);
                }
                if (view != null && view.hasWindowFocus()) {
                    view.post(new o0(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i11) {
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    h(i12);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e(int i11) {
            if (i11 == 0) {
                m(6144);
            } else if (i11 == 1) {
                m(4096);
                j(2048);
            } else if (i11 == 2) {
                m(2048);
                j(4096);
            }
        }

        /* access modifiers changed from: package-private */
        public void f(int i11) {
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    l(i12);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void j(int i11) {
            View decorView = this.f9594a.getDecorView();
            decorView.setSystemUiVisibility(i11 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void k(int i11) {
            this.f9594a.addFlags(i11);
        }

        /* access modifiers changed from: protected */
        public void m(int i11) {
            View decorView = this.f9594a.getDecorView();
            decorView.setSystemUiVisibility((~i11) & decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void n(int i11) {
            this.f9594a.clearFlags(i11);
        }
    }

    /* compiled from: WindowInsetsControllerCompat */
    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        public boolean b() {
            return (this.f9594a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        public void d(boolean z11) {
            if (z11) {
                n(67108864);
                k(Integer.MIN_VALUE);
                j(8192);
                return;
            }
            m(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat */
    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        public void c(boolean z11) {
            if (z11) {
                n(134217728);
                k(Integer.MIN_VALUE);
                j(16);
                return;
            }
            m(16);
        }
    }

    /* compiled from: WindowInsetsControllerCompat */
    private static class e {
        e() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i11) {
            throw null;
        }

        public boolean b() {
            return false;
        }

        public void c(boolean z11) {
        }

        public void d(boolean z11) {
        }

        /* access modifiers changed from: package-private */
        public void e(int i11) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void f(int i11) {
            throw null;
        }
    }

    public p0(Window window, View view) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            this.f9593a = new d(window, this);
        } else if (i11 >= 26) {
            this.f9593a = new c(window, view);
        } else if (i11 >= 23) {
            this.f9593a = new b(window, view);
        } else {
            this.f9593a = new a(window, view);
        }
    }

    public void a(int i11) {
        this.f9593a.a(i11);
    }

    public boolean b() {
        return this.f9593a.b();
    }

    public void c(boolean z11) {
        this.f9593a.c(z11);
    }

    public void d(boolean z11) {
        this.f9593a.d(z11);
    }

    public void e(int i11) {
        this.f9593a.e(i11);
    }

    public void f(int i11) {
        this.f9593a.f(i11);
    }

    /* compiled from: WindowInsetsControllerCompat */
    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final p0 f9596a;

        /* renamed from: b  reason: collision with root package name */
        final WindowInsetsController f9597b;

        /* renamed from: c  reason: collision with root package name */
        private final g<Object, WindowInsetsController.OnControllableInsetsChangedListener> f9598c;

        /* renamed from: d  reason: collision with root package name */
        protected Window f9599d;

        d(Window window, p0 p0Var) {
            this(window.getInsetsController(), p0Var);
            this.f9599d = window;
        }

        /* access modifiers changed from: package-private */
        public void a(int i11) {
            this.f9597b.hide(i11);
        }

        public boolean b() {
            return (this.f9597b.getSystemBarsAppearance() & 8) != 0;
        }

        public void c(boolean z11) {
            if (z11) {
                if (this.f9599d != null) {
                    g(16);
                }
                this.f9597b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f9599d != null) {
                h(16);
            }
            this.f9597b.setSystemBarsAppearance(0, 16);
        }

        public void d(boolean z11) {
            if (z11) {
                if (this.f9599d != null) {
                    g(8192);
                }
                this.f9597b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f9599d != null) {
                h(8192);
            }
            this.f9597b.setSystemBarsAppearance(0, 8);
        }

        /* access modifiers changed from: package-private */
        public void e(int i11) {
            this.f9597b.setSystemBarsBehavior(i11);
        }

        /* access modifiers changed from: package-private */
        public void f(int i11) {
            Window window = this.f9599d;
            if (!(window == null || (i11 & 8) == 0 || Build.VERSION.SDK_INT >= 32)) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f9597b.show(i11);
        }

        /* access modifiers changed from: protected */
        public void g(int i11) {
            View decorView = this.f9599d.getDecorView();
            decorView.setSystemUiVisibility(i11 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void h(int i11) {
            View decorView = this.f9599d.getDecorView();
            decorView.setSystemUiVisibility((~i11) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, p0 p0Var) {
            this.f9598c = new g<>();
            this.f9597b = windowInsetsController;
            this.f9596a = p0Var;
        }
    }
}
