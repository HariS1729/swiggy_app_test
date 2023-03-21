package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChildHelper */
class f {

    /* renamed from: a  reason: collision with root package name */
    final b f11328a;

    /* renamed from: b  reason: collision with root package name */
    final a f11329b = new a();

    /* renamed from: c  reason: collision with root package name */
    final List<View> f11330c = new ArrayList();

    /* compiled from: ChildHelper */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        long f11331a = 0;

        /* renamed from: b  reason: collision with root package name */
        a f11332b;

        a() {
        }

        private void c() {
            if (this.f11332b == null) {
                this.f11332b = new a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i11) {
            if (i11 >= 64) {
                a aVar = this.f11332b;
                if (aVar != null) {
                    aVar.a(i11 - 64);
                    return;
                }
                return;
            }
            this.f11331a &= ~(1 << i11);
        }

        /* access modifiers changed from: package-private */
        public int b(int i11) {
            a aVar = this.f11332b;
            if (aVar == null) {
                if (i11 >= 64) {
                    return Long.bitCount(this.f11331a);
                }
                return Long.bitCount(this.f11331a & ((1 << i11) - 1));
            } else if (i11 < 64) {
                return Long.bitCount(this.f11331a & ((1 << i11) - 1));
            } else {
                return aVar.b(i11 - 64) + Long.bitCount(this.f11331a);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i11) {
            if (i11 < 64) {
                return (this.f11331a & (1 << i11)) != 0;
            }
            c();
            return this.f11332b.d(i11 - 64);
        }

        /* access modifiers changed from: package-private */
        public void e(int i11, boolean z11) {
            if (i11 >= 64) {
                c();
                this.f11332b.e(i11 - 64, z11);
                return;
            }
            long j = this.f11331a;
            boolean z12 = (Long.MIN_VALUE & j) != 0;
            long j11 = (1 << i11) - 1;
            this.f11331a = ((j & (~j11)) << 1) | (j & j11);
            if (z11) {
                h(i11);
            } else {
                a(i11);
            }
            if (z12 || this.f11332b != null) {
                c();
                this.f11332b.e(0, z12);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean f(int i11) {
            if (i11 >= 64) {
                c();
                return this.f11332b.f(i11 - 64);
            }
            long j = 1 << i11;
            long j11 = this.f11331a;
            boolean z11 = (j11 & j) != 0;
            long j12 = j11 & (~j);
            this.f11331a = j12;
            long j13 = j - 1;
            this.f11331a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f11332b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f11332b.f(0);
            }
            return z11;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            this.f11331a = 0;
            a aVar = this.f11332b;
            if (aVar != null) {
                aVar.g();
            }
        }

        /* access modifiers changed from: package-private */
        public void h(int i11) {
            if (i11 >= 64) {
                c();
                this.f11332b.h(i11 - 64);
                return;
            }
            this.f11331a |= 1 << i11;
        }

        public String toString() {
            if (this.f11332b == null) {
                return Long.toBinaryString(this.f11331a);
            }
            return this.f11332b.toString() + "xx" + Long.toBinaryString(this.f11331a);
        }
    }

    /* compiled from: ChildHelper */
    interface b {
        View a(int i11);

        int b();

        void c(View view);

        RecyclerView.d0 d(View view);

        void e(View view, int i11);

        void f();

        void g(View view, int i11, ViewGroup.LayoutParams layoutParams);

        void h(int i11);

        int i(View view);

        void j(View view);

        void k(int i11);
    }

    f(b bVar) {
        this.f11328a = bVar;
    }

    private int h(int i11) {
        if (i11 < 0) {
            return -1;
        }
        int b11 = this.f11328a.b();
        int i12 = i11;
        while (i12 < b11) {
            int b12 = i11 - (i12 - this.f11329b.b(i12));
            if (b12 == 0) {
                while (this.f11329b.d(i12)) {
                    i12++;
                }
                return i12;
            }
            i12 += b12;
        }
        return -1;
    }

    private void l(View view) {
        this.f11330c.add(view);
        this.f11328a.c(view);
    }

    private boolean t(View view) {
        if (!this.f11330c.remove(view)) {
            return false;
        }
        this.f11328a.j(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i11, boolean z11) {
        int i12;
        if (i11 < 0) {
            i12 = this.f11328a.b();
        } else {
            i12 = h(i11);
        }
        this.f11329b.e(i12, z11);
        if (z11) {
            l(view);
        }
        this.f11328a.e(view, i12);
    }

    /* access modifiers changed from: package-private */
    public void b(View view, boolean z11) {
        a(view, -1, z11);
    }

    /* access modifiers changed from: package-private */
    public void c(View view, int i11, ViewGroup.LayoutParams layoutParams, boolean z11) {
        int i12;
        if (i11 < 0) {
            i12 = this.f11328a.b();
        } else {
            i12 = h(i11);
        }
        this.f11329b.e(i12, z11);
        if (z11) {
            l(view);
        }
        this.f11328a.g(view, i12, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void d(int i11) {
        int h11 = h(i11);
        this.f11329b.f(h11);
        this.f11328a.h(h11);
    }

    /* access modifiers changed from: package-private */
    public View e(int i11) {
        int size = this.f11330c.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = this.f11330c.get(i12);
            RecyclerView.d0 d11 = this.f11328a.d(view);
            if (d11.getLayoutPosition() == i11 && !d11.isInvalid() && !d11.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View f(int i11) {
        return this.f11328a.a(h(i11));
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f11328a.b() - this.f11330c.size();
    }

    /* access modifiers changed from: package-private */
    public View i(int i11) {
        return this.f11328a.a(i11);
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f11328a.b();
    }

    /* access modifiers changed from: package-private */
    public void k(View view) {
        int i11 = this.f11328a.i(view);
        if (i11 >= 0) {
            this.f11329b.h(i11);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    public int m(View view) {
        int i11 = this.f11328a.i(view);
        if (i11 != -1 && !this.f11329b.d(i11)) {
            return i11 - this.f11329b.b(i11);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean n(View view) {
        return this.f11330c.contains(view);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.f11329b.g();
        for (int size = this.f11330c.size() - 1; size >= 0; size--) {
            this.f11328a.j(this.f11330c.get(size));
            this.f11330c.remove(size);
        }
        this.f11328a.f();
    }

    /* access modifiers changed from: package-private */
    public void p(View view) {
        int i11 = this.f11328a.i(view);
        if (i11 >= 0) {
            if (this.f11329b.f(i11)) {
                t(view);
            }
            this.f11328a.k(i11);
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i11) {
        int h11 = h(i11);
        View a11 = this.f11328a.a(h11);
        if (a11 != null) {
            if (this.f11329b.f(h11)) {
                t(a11);
            }
            this.f11328a.k(h11);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r(View view) {
        int i11 = this.f11328a.i(view);
        if (i11 == -1) {
            t(view);
            return true;
        } else if (!this.f11329b.d(i11)) {
            return false;
        } else {
            this.f11329b.f(i11);
            t(view);
            this.f11328a.k(i11);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void s(View view) {
        int i11 = this.f11328a.i(view);
        if (i11 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f11329b.d(i11)) {
            this.f11329b.a(i11);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f11329b.toString() + ", hidden list:" + this.f11330c.size();
    }
}
