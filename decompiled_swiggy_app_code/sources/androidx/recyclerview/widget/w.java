package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck */
class w {

    /* renamed from: a  reason: collision with root package name */
    final b f11471a;

    /* renamed from: b  reason: collision with root package name */
    a f11472b = new a();

    /* compiled from: ViewBoundsCheck */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f11473a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f11474b;

        /* renamed from: c  reason: collision with root package name */
        int f11475c;

        /* renamed from: d  reason: collision with root package name */
        int f11476d;

        /* renamed from: e  reason: collision with root package name */
        int f11477e;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i11) {
            this.f11473a = i11 | this.f11473a;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            int i11 = this.f11473a;
            if ((i11 & 7) != 0 && (i11 & (c(this.f11476d, this.f11474b) << 0)) == 0) {
                return false;
            }
            int i12 = this.f11473a;
            if ((i12 & 112) != 0 && (i12 & (c(this.f11476d, this.f11475c) << 4)) == 0) {
                return false;
            }
            int i13 = this.f11473a;
            if ((i13 & 1792) != 0 && (i13 & (c(this.f11477e, this.f11474b) << 8)) == 0) {
                return false;
            }
            int i14 = this.f11473a;
            if ((i14 & 28672) == 0 || (i14 & (c(this.f11477e, this.f11475c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public int c(int i11, int i12) {
            if (i11 > i12) {
                return 1;
            }
            return i11 == i12 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f11473a = 0;
        }

        /* access modifiers changed from: package-private */
        public void e(int i11, int i12, int i13, int i14) {
            this.f11474b = i11;
            this.f11475c = i12;
            this.f11476d = i13;
            this.f11477e = i14;
        }
    }

    /* compiled from: ViewBoundsCheck */
    interface b {
        View a(int i11);

        int b();

        int c();

        int d(View view);

        int e(View view);
    }

    w(b bVar) {
        this.f11471a = bVar;
    }

    /* access modifiers changed from: package-private */
    public View a(int i11, int i12, int i13, int i14) {
        int b11 = this.f11471a.b();
        int c11 = this.f11471a.c();
        int i15 = i12 > i11 ? 1 : -1;
        View view = null;
        while (i11 != i12) {
            View a11 = this.f11471a.a(i11);
            this.f11472b.e(b11, c11, this.f11471a.d(a11), this.f11471a.e(a11));
            if (i13 != 0) {
                this.f11472b.d();
                this.f11472b.a(i13);
                if (this.f11472b.b()) {
                    return a11;
                }
            }
            if (i14 != 0) {
                this.f11472b.d();
                this.f11472b.a(i14);
                if (this.f11472b.b()) {
                    view = a11;
                }
            }
            i11 += i15;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view, int i11) {
        this.f11472b.e(this.f11471a.b(), this.f11471a.c(), this.f11471a.d(view), this.f11471a.e(view));
        if (i11 == 0) {
            return false;
        }
        this.f11472b.d();
        this.f11472b.a(i11);
        return this.f11472b.b();
    }
}
