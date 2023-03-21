package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.core.util.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AdapterHelper */
final class a implements p.a {

    /* renamed from: a  reason: collision with root package name */
    private e<b> f11285a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f11286b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<b> f11287c;

    /* renamed from: d  reason: collision with root package name */
    final C0076a f11288d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f11289e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f11290f;

    /* renamed from: g  reason: collision with root package name */
    final p f11291g;

    /* renamed from: h  reason: collision with root package name */
    private int f11292h;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AdapterHelper */
    interface C0076a {
        void a(int i11, int i12);

        void b(b bVar);

        void c(b bVar);

        RecyclerView.d0 d(int i11);

        void e(int i11, int i12);

        void f(int i11, int i12);

        void g(int i11, int i12);

        void h(int i11, int i12, Object obj);
    }

    /* compiled from: AdapterHelper */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        int f11293a;

        /* renamed from: b  reason: collision with root package name */
        int f11294b;

        /* renamed from: c  reason: collision with root package name */
        Object f11295c;

        /* renamed from: d  reason: collision with root package name */
        int f11296d;

        b(int i11, int i12, int i13, Object obj) {
            this.f11293a = i11;
            this.f11294b = i12;
            this.f11296d = i13;
            this.f11295c = obj;
        }

        /* access modifiers changed from: package-private */
        public String a() {
            int i11 = this.f11293a;
            return i11 != 1 ? i11 != 2 ? i11 != 4 ? i11 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i11 = this.f11293a;
            if (i11 != bVar.f11293a) {
                return false;
            }
            if (i11 == 8 && Math.abs(this.f11296d - this.f11294b) == 1 && this.f11296d == bVar.f11294b && this.f11294b == bVar.f11296d) {
                return true;
            }
            if (this.f11296d != bVar.f11296d || this.f11294b != bVar.f11294b) {
                return false;
            }
            Object obj2 = this.f11295c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f11295c)) {
                    return false;
                }
            } else if (bVar.f11295c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f11293a * 31) + this.f11294b) * 31) + this.f11296d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f11294b + "c:" + this.f11296d + ",p:" + this.f11295c + "]";
        }
    }

    a(C0076a aVar) {
        this(aVar, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        char c11;
        boolean z11;
        boolean z12;
        int i11 = bVar.f11294b;
        int i12 = bVar.f11296d + i11;
        char c12 = 65535;
        int i13 = i11;
        int i14 = 0;
        while (i13 < i12) {
            if (this.f11288d.d(i13) != null || h(i13)) {
                if (c12 == 0) {
                    k(a(2, i11, i14, (Object) null));
                    z12 = true;
                } else {
                    z12 = false;
                }
                c11 = 1;
            } else {
                if (c12 == 1) {
                    v(a(2, i11, i14, (Object) null));
                    z11 = true;
                } else {
                    z11 = false;
                }
                c11 = 0;
            }
            if (z11) {
                i13 -= i14;
                i12 -= i14;
                i14 = 1;
            } else {
                i14++;
            }
            i13++;
            c12 = c11;
        }
        if (i14 != bVar.f11296d) {
            b(bVar);
            bVar = a(2, i11, i14, (Object) null);
        }
        if (c12 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i11 = bVar.f11294b;
        int i12 = bVar.f11296d + i11;
        int i13 = i11;
        char c11 = 65535;
        int i14 = 0;
        while (i11 < i12) {
            if (this.f11288d.d(i11) != null || h(i11)) {
                if (c11 == 0) {
                    k(a(4, i13, i14, bVar.f11295c));
                    i13 = i11;
                    i14 = 0;
                }
                c11 = 1;
            } else {
                if (c11 == 1) {
                    v(a(4, i13, i14, bVar.f11295c));
                    i13 = i11;
                    i14 = 0;
                }
                c11 = 0;
            }
            i14++;
            i11++;
        }
        if (i14 != bVar.f11296d) {
            Object obj = bVar.f11295c;
            b(bVar);
            bVar = a(4, i13, i14, obj);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i11) {
        int size = this.f11287c.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = this.f11287c.get(i12);
            int i13 = bVar.f11293a;
            if (i13 == 8) {
                if (n(bVar.f11296d, i12 + 1) == i11) {
                    return true;
                }
            } else if (i13 == 1) {
                int i14 = bVar.f11294b;
                int i15 = bVar.f11296d + i14;
                while (i14 < i15) {
                    if (n(i14, i12 + 1) == i11) {
                        return true;
                    }
                    i14++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i11;
        int i12 = bVar.f11293a;
        if (i12 == 1 || i12 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int z11 = z(bVar.f11294b, i12);
        int i13 = bVar.f11294b;
        int i14 = bVar.f11293a;
        if (i14 == 2) {
            i11 = 0;
        } else if (i14 == 4) {
            i11 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i15 = 1;
        for (int i16 = 1; i16 < bVar.f11296d; i16++) {
            int z12 = z(bVar.f11294b + (i11 * i16), bVar.f11293a);
            int i17 = bVar.f11293a;
            if (i17 == 2 ? z12 == z11 : i17 == 4 && z12 == z11 + 1) {
                i15++;
            } else {
                b a11 = a(i17, z11, i15, bVar.f11295c);
                l(a11, i13);
                b(a11);
                if (bVar.f11293a == 4) {
                    i13 += i15;
                }
                z11 = z12;
                i15 = 1;
            }
        }
        Object obj = bVar.f11295c;
        b(bVar);
        if (i15 > 0) {
            b a12 = a(bVar.f11293a, z11, i15, obj);
            l(a12, i13);
            b(a12);
        }
    }

    private void v(b bVar) {
        this.f11287c.add(bVar);
        int i11 = bVar.f11293a;
        if (i11 == 1) {
            this.f11288d.e(bVar.f11294b, bVar.f11296d);
        } else if (i11 == 2) {
            this.f11288d.g(bVar.f11294b, bVar.f11296d);
        } else if (i11 == 4) {
            this.f11288d.h(bVar.f11294b, bVar.f11296d, bVar.f11295c);
        } else if (i11 == 8) {
            this.f11288d.a(bVar.f11294b, bVar.f11296d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i11, int i12) {
        int i13;
        int i14;
        for (int size = this.f11287c.size() - 1; size >= 0; size--) {
            b bVar = this.f11287c.get(size);
            int i15 = bVar.f11293a;
            if (i15 == 8) {
                int i16 = bVar.f11294b;
                int i17 = bVar.f11296d;
                if (i16 < i17) {
                    i14 = i16;
                    i13 = i17;
                } else {
                    i13 = i16;
                    i14 = i17;
                }
                if (i11 < i14 || i11 > i13) {
                    if (i11 < i16) {
                        if (i12 == 1) {
                            bVar.f11294b = i16 + 1;
                            bVar.f11296d = i17 + 1;
                        } else if (i12 == 2) {
                            bVar.f11294b = i16 - 1;
                            bVar.f11296d = i17 - 1;
                        }
                    }
                } else if (i14 == i16) {
                    if (i12 == 1) {
                        bVar.f11296d = i17 + 1;
                    } else if (i12 == 2) {
                        bVar.f11296d = i17 - 1;
                    }
                    i11++;
                } else {
                    if (i12 == 1) {
                        bVar.f11294b = i16 + 1;
                    } else if (i12 == 2) {
                        bVar.f11294b = i16 - 1;
                    }
                    i11--;
                }
            } else {
                int i18 = bVar.f11294b;
                if (i18 <= i11) {
                    if (i15 == 1) {
                        i11 -= bVar.f11296d;
                    } else if (i15 == 2) {
                        i11 += bVar.f11296d;
                    }
                } else if (i12 == 1) {
                    bVar.f11294b = i18 + 1;
                } else if (i12 == 2) {
                    bVar.f11294b = i18 - 1;
                }
            }
        }
        for (int size2 = this.f11287c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f11287c.get(size2);
            if (bVar2.f11293a == 8) {
                int i19 = bVar2.f11296d;
                if (i19 == bVar2.f11294b || i19 < 0) {
                    this.f11287c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f11296d <= 0) {
                this.f11287c.remove(size2);
                b(bVar2);
            }
        }
        return i11;
    }

    public b a(int i11, int i12, int i13, Object obj) {
        b b11 = this.f11285a.b();
        if (b11 == null) {
            return new b(i11, i12, i13, obj);
        }
        b11.f11293a = i11;
        b11.f11294b = i12;
        b11.f11296d = i13;
        b11.f11295c = obj;
        return b11;
    }

    public void b(b bVar) {
        if (!this.f11290f) {
            bVar.f11295c = null;
            this.f11285a.a(bVar);
        }
    }

    public int e(int i11) {
        int size = this.f11286b.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = this.f11286b.get(i12);
            int i13 = bVar.f11293a;
            if (i13 != 1) {
                if (i13 == 2) {
                    int i14 = bVar.f11294b;
                    if (i14 <= i11) {
                        int i15 = bVar.f11296d;
                        if (i14 + i15 > i11) {
                            return -1;
                        }
                        i11 -= i15;
                    } else {
                        continue;
                    }
                } else if (i13 == 8) {
                    int i16 = bVar.f11294b;
                    if (i16 == i11) {
                        i11 = bVar.f11296d;
                    } else {
                        if (i16 < i11) {
                            i11--;
                        }
                        if (bVar.f11296d <= i11) {
                            i11++;
                        }
                    }
                }
            } else if (bVar.f11294b <= i11) {
                i11 += bVar.f11296d;
            }
        }
        return i11;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        int size = this.f11287c.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f11288d.c(this.f11287c.get(i11));
        }
        x(this.f11287c);
        this.f11292h = 0;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.f11286b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f11286b.get(i11);
            int i12 = bVar.f11293a;
            if (i12 == 1) {
                this.f11288d.c(bVar);
                this.f11288d.e(bVar.f11294b, bVar.f11296d);
            } else if (i12 == 2) {
                this.f11288d.c(bVar);
                this.f11288d.f(bVar.f11294b, bVar.f11296d);
            } else if (i12 == 4) {
                this.f11288d.c(bVar);
                this.f11288d.h(bVar.f11294b, bVar.f11296d, bVar.f11295c);
            } else if (i12 == 8) {
                this.f11288d.c(bVar);
                this.f11288d.a(bVar.f11294b, bVar.f11296d);
            }
            Runnable runnable = this.f11289e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f11286b);
        this.f11292h = 0;
    }

    /* access modifiers changed from: package-private */
    public void l(b bVar, int i11) {
        this.f11288d.b(bVar);
        int i12 = bVar.f11293a;
        if (i12 == 2) {
            this.f11288d.f(i11, bVar.f11296d);
        } else if (i12 == 4) {
            this.f11288d.h(i11, bVar.f11296d, bVar.f11295c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    public int m(int i11) {
        return n(i11, 0);
    }

    /* access modifiers changed from: package-private */
    public int n(int i11, int i12) {
        int size = this.f11287c.size();
        while (i12 < size) {
            b bVar = this.f11287c.get(i12);
            int i13 = bVar.f11293a;
            if (i13 == 8) {
                int i14 = bVar.f11294b;
                if (i14 == i11) {
                    i11 = bVar.f11296d;
                } else {
                    if (i14 < i11) {
                        i11--;
                    }
                    if (bVar.f11296d <= i11) {
                        i11++;
                    }
                }
            } else {
                int i15 = bVar.f11294b;
                if (i15 > i11) {
                    continue;
                } else if (i13 == 2) {
                    int i16 = bVar.f11296d;
                    if (i11 < i15 + i16) {
                        return -1;
                    }
                    i11 -= i16;
                } else if (i13 == 1) {
                    i11 += bVar.f11296d;
                }
            }
            i12++;
        }
        return i11;
    }

    /* access modifiers changed from: package-private */
    public boolean o(int i11) {
        return (i11 & this.f11292h) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f11286b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return !this.f11287c.isEmpty() && !this.f11286b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public boolean r(int i11, int i12, Object obj) {
        if (i12 < 1) {
            return false;
        }
        this.f11286b.add(a(4, i11, i12, obj));
        this.f11292h |= 4;
        if (this.f11286b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean s(int i11, int i12) {
        if (i12 < 1) {
            return false;
        }
        this.f11286b.add(a(1, i11, i12, (Object) null));
        this.f11292h |= 1;
        if (this.f11286b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean t(int i11, int i12, int i13) {
        if (i11 == i12) {
            return false;
        }
        if (i13 == 1) {
            this.f11286b.add(a(8, i11, i12, (Object) null));
            this.f11292h |= 8;
            if (this.f11286b.size() == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* access modifiers changed from: package-private */
    public boolean u(int i11, int i12) {
        if (i12 < 1) {
            return false;
        }
        this.f11286b.add(a(2, i11, i12, (Object) null));
        this.f11292h |= 2;
        if (this.f11286b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.f11291g.b(this.f11286b);
        int size = this.f11286b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f11286b.get(i11);
            int i12 = bVar.f11293a;
            if (i12 == 1) {
                c(bVar);
            } else if (i12 == 2) {
                f(bVar);
            } else if (i12 == 4) {
                g(bVar);
            } else if (i12 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f11289e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f11286b.clear();
    }

    /* access modifiers changed from: package-private */
    public void x(List<b> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            b(list.get(i11));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    public void y() {
        x(this.f11286b);
        x(this.f11287c);
        this.f11292h = 0;
    }

    a(C0076a aVar, boolean z11) {
        this.f11285a = new Pools$SimplePool(30);
        this.f11286b = new ArrayList<>();
        this.f11287c = new ArrayList<>();
        this.f11292h = 0;
        this.f11288d = aVar;
        this.f11290f = z11;
        this.f11291g = new p(this);
    }
}
