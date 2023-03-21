package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.Map;

public abstract class LiveData<T> {
    static final Object k = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Object f10634a;

    /* renamed from: b  reason: collision with root package name */
    private m.b<z<? super T>, LiveData<T>.defpackage.c> f10635b;

    /* renamed from: c  reason: collision with root package name */
    int f10636c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10637d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f10638e;

    /* renamed from: f  reason: collision with root package name */
    volatile Object f10639f;

    /* renamed from: g  reason: collision with root package name */
    private int f10640g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10641h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10642i;
    private final Runnable j;

    class LifecycleBoundObserver extends LiveData<T>.defpackage.c implements o {

        /* renamed from: e  reason: collision with root package name */
        final r f10643e;

        LifecycleBoundObserver(r rVar, z<? super T> zVar) {
            super(zVar);
            this.f10643e = rVar;
        }

        public void b(r rVar, Lifecycle.Event event) {
            Lifecycle.State b11 = this.f10643e.getLifecycle().b();
            if (b11 == Lifecycle.State.DESTROYED) {
                LiveData.this.o(this.f10647a);
                return;
            }
            Lifecycle.State state = null;
            while (state != b11) {
                a(f());
                state = b11;
                b11 = this.f10643e.getLifecycle().b();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f10643e.getLifecycle().c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean e(r rVar) {
            return this.f10643e == rVar;
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.f10643e.getLifecycle().b().isAtLeast(Lifecycle.State.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f10634a) {
                obj = LiveData.this.f10639f;
                LiveData.this.f10639f = LiveData.k;
            }
            LiveData.this.q(obj);
        }
    }

    private class b extends LiveData<T>.defpackage.c {
        b(z<? super T> zVar) {
            super(zVar);
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return true;
        }
    }

    private abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f10647a;

        /* renamed from: b  reason: collision with root package name */
        boolean f10648b;

        /* renamed from: c  reason: collision with root package name */
        int f10649c = -1;

        c(z<? super T> zVar) {
            this.f10647a = zVar;
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z11) {
            if (z11 != this.f10648b) {
                this.f10648b = z11;
                LiveData.this.c(z11 ? 1 : -1);
                if (this.f10648b) {
                    LiveData.this.e(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
        }

        /* access modifiers changed from: package-private */
        public boolean e(r rVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean f();
    }

    public LiveData(T t) {
        this.f10634a = new Object();
        this.f10635b = new m.b<>();
        this.f10636c = 0;
        this.f10639f = k;
        this.j = new a();
        this.f10638e = t;
        this.f10640g = 0;
    }

    static void b(String str) {
        if (!l.a.e().b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void d(LiveData<T>.defpackage.c cVar) {
        if (cVar.f10648b) {
            if (!cVar.f()) {
                cVar.a(false);
                return;
            }
            int i11 = cVar.f10649c;
            int i12 = this.f10640g;
            if (i11 < i12) {
                cVar.f10649c = i12;
                cVar.f10647a.a(this.f10638e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(int i11) {
        int i12 = this.f10636c;
        this.f10636c = i11 + i12;
        if (!this.f10637d) {
            this.f10637d = true;
            while (true) {
                try {
                    int i13 = this.f10636c;
                    if (i12 != i13) {
                        boolean z11 = i12 == 0 && i13 > 0;
                        boolean z12 = i12 > 0 && i13 == 0;
                        if (z11) {
                            l();
                        } else if (z12) {
                            m();
                        }
                        i12 = i13;
                    } else {
                        return;
                    }
                } finally {
                    this.f10637d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(LiveData<T>.defpackage.c cVar) {
        if (this.f10641h) {
            this.f10642i = true;
            return;
        }
        this.f10641h = true;
        do {
            this.f10642i = false;
            if (cVar == null) {
                m.b<K, V>.d f11 = this.f10635b.f();
                while (f11.hasNext()) {
                    d((c) ((Map.Entry) f11.next()).getValue());
                    if (this.f10642i) {
                        break;
                    }
                }
            } else {
                d(cVar);
                cVar = null;
            }
        } while (this.f10642i);
        this.f10641h = false;
    }

    public T f() {
        T t = this.f10638e;
        if (t != k) {
            return t;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f10640g;
    }

    public boolean h() {
        return this.f10636c > 0;
    }

    public boolean i() {
        return this.f10635b.size() > 0;
    }

    public void j(r rVar, z<? super T> zVar) {
        b("observe");
        if (rVar.getLifecycle().b() != Lifecycle.State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(rVar, zVar);
            c i11 = this.f10635b.i(zVar, lifecycleBoundObserver);
            if (i11 != null && !i11.e(rVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (i11 == null) {
                rVar.getLifecycle().a(lifecycleBoundObserver);
            }
        }
    }

    public void k(z<? super T> zVar) {
        b("observeForever");
        b bVar = new b(zVar);
        c i11 = this.f10635b.i(zVar, bVar);
        if (i11 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (i11 == null) {
            bVar.a(true);
        }
    }

    /* access modifiers changed from: protected */
    public void l() {
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    /* access modifiers changed from: protected */
    public void n(T t) {
        boolean z11;
        synchronized (this.f10634a) {
            z11 = this.f10639f == k;
            this.f10639f = t;
        }
        if (z11) {
            l.a.e().c(this.j);
        }
    }

    public void o(z<? super T> zVar) {
        b("removeObserver");
        c k11 = this.f10635b.k(zVar);
        if (k11 != null) {
            k11.c();
            k11.a(false);
        }
    }

    public void p(r rVar) {
        b("removeObservers");
        Iterator<Map.Entry<z<? super T>, LiveData<T>.defpackage.c>> it2 = this.f10635b.iterator();
        while (it2.hasNext()) {
            Map.Entry next = it2.next();
            if (((c) next.getValue()).e(rVar)) {
                o((z) next.getKey());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void q(T t) {
        b("setValue");
        this.f10640g++;
        this.f10638e = t;
        e((LiveData<T>.defpackage.c) null);
    }

    public LiveData() {
        this.f10634a = new Object();
        this.f10635b = new m.b<>();
        this.f10636c = 0;
        Object obj = k;
        this.f10639f = obj;
        this.j = new a();
        this.f10638e = obj;
        this.f10640g = -1;
    }
}
