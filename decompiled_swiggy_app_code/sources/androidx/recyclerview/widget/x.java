package androidx.recyclerview.widget;

import androidx.collection.e;
import androidx.collection.g;
import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewInfoStore */
class x {

    /* renamed from: a  reason: collision with root package name */
    final g<RecyclerView.d0, a> f11478a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    final e<RecyclerView.d0> f11479b = new e<>();

    /* compiled from: ViewInfoStore */
    static class a {

        /* renamed from: d  reason: collision with root package name */
        static androidx.core.util.e<a> f11480d = new Pools$SimplePool(20);

        /* renamed from: a  reason: collision with root package name */
        int f11481a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.l.c f11482b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.l.c f11483c;

        private a() {
        }

        static void a() {
            do {
            } while (f11480d.b() != null);
        }

        static a b() {
            a b11 = f11480d.b();
            return b11 == null ? new a() : b11;
        }

        static void c(a aVar) {
            aVar.f11481a = 0;
            aVar.f11482b = null;
            aVar.f11483c = null;
            f11480d.a(aVar);
        }
    }

    /* compiled from: ViewInfoStore */
    interface b {
        void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void b(RecyclerView.d0 d0Var);

        void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    x() {
    }

    private RecyclerView.l.c l(RecyclerView.d0 d0Var, int i11) {
        a q;
        RecyclerView.l.c cVar;
        int h11 = this.f11478a.h(d0Var);
        if (h11 >= 0 && (q = this.f11478a.q(h11)) != null) {
            int i12 = q.f11481a;
            if ((i12 & i11) != 0) {
                int i13 = (~i11) & i12;
                q.f11481a = i13;
                if (i11 == 4) {
                    cVar = q.f11482b;
                } else if (i11 == 8) {
                    cVar = q.f11483c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i13 & 12) == 0) {
                    this.f11478a.o(h11);
                    a.c(q);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f11478a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f11478a.put(d0Var, aVar);
        }
        aVar.f11481a |= 2;
        aVar.f11482b = cVar;
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.d0 d0Var) {
        a aVar = this.f11478a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f11478a.put(d0Var, aVar);
        }
        aVar.f11481a |= 1;
    }

    /* access modifiers changed from: package-private */
    public void c(long j, RecyclerView.d0 d0Var) {
        this.f11479b.n(j, d0Var);
    }

    /* access modifiers changed from: package-private */
    public void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f11478a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f11478a.put(d0Var, aVar);
        }
        aVar.f11483c = cVar;
        aVar.f11481a |= 8;
    }

    /* access modifiers changed from: package-private */
    public void e(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f11478a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f11478a.put(d0Var, aVar);
        }
        aVar.f11482b = cVar;
        aVar.f11481a |= 4;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f11478a.clear();
        this.f11479b.e();
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.d0 g(long j) {
        return this.f11479b.i(j);
    }

    /* access modifiers changed from: package-private */
    public boolean h(RecyclerView.d0 d0Var) {
        a aVar = this.f11478a.get(d0Var);
        if (aVar == null || (aVar.f11481a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean i(RecyclerView.d0 d0Var) {
        a aVar = this.f11478a.get(d0Var);
        return (aVar == null || (aVar.f11481a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        a.a();
    }

    public void k(RecyclerView.d0 d0Var) {
        p(d0Var);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.l.c m(RecyclerView.d0 d0Var) {
        return l(d0Var, 8);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.l.c n(RecyclerView.d0 d0Var) {
        return l(d0Var, 4);
    }

    /* access modifiers changed from: package-private */
    public void o(b bVar) {
        for (int size = this.f11478a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 m11 = this.f11478a.m(size);
            a o11 = this.f11478a.o(size);
            int i11 = o11.f11481a;
            if ((i11 & 3) == 3) {
                bVar.b(m11);
            } else if ((i11 & 1) != 0) {
                RecyclerView.l.c cVar = o11.f11482b;
                if (cVar == null) {
                    bVar.b(m11);
                } else {
                    bVar.c(m11, cVar, o11.f11483c);
                }
            } else if ((i11 & 14) == 14) {
                bVar.a(m11, o11.f11482b, o11.f11483c);
            } else if ((i11 & 12) == 12) {
                bVar.d(m11, o11.f11482b, o11.f11483c);
            } else if ((i11 & 4) != 0) {
                bVar.c(m11, o11.f11482b, (RecyclerView.l.c) null);
            } else if ((i11 & 8) != 0) {
                bVar.a(m11, o11.f11482b, o11.f11483c);
            }
            a.c(o11);
        }
    }

    /* access modifiers changed from: package-private */
    public void p(RecyclerView.d0 d0Var) {
        a aVar = this.f11478a.get(d0Var);
        if (aVar != null) {
            aVar.f11481a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public void q(RecyclerView.d0 d0Var) {
        int q = this.f11479b.q() - 1;
        while (true) {
            if (q < 0) {
                break;
            } else if (d0Var == this.f11479b.r(q)) {
                this.f11479b.p(q);
                break;
            } else {
                q--;
            }
        }
        a remove = this.f11478a.remove(d0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
