package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.h;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: AsyncListDiffer */
public class d<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final Executor f11306h = new c();

    /* renamed from: a  reason: collision with root package name */
    private final o f11307a;

    /* renamed from: b  reason: collision with root package name */
    final c<T> f11308b;

    /* renamed from: c  reason: collision with root package name */
    Executor f11309c;

    /* renamed from: d  reason: collision with root package name */
    private final List<b<T>> f11310d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    private List<T> f11311e;

    /* renamed from: f  reason: collision with root package name */
    private List<T> f11312f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    int f11313g;

    /* compiled from: AsyncListDiffer */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f11314a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f11315b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11316c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Runnable f11317d;

        /* renamed from: androidx.recyclerview.widget.d$a$a  reason: collision with other inner class name */
        /* compiled from: AsyncListDiffer */
        class C0077a extends h.b {
            C0077a() {
            }

            public boolean a(int i11, int i12) {
                Object obj = a.this.f11314a.get(i11);
                Object obj2 = a.this.f11315b.get(i12);
                if (obj != null && obj2 != null) {
                    return d.this.f11308b.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            public boolean b(int i11, int i12) {
                Object obj = a.this.f11314a.get(i11);
                Object obj2 = a.this.f11315b.get(i12);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return d.this.f11308b.b().b(obj, obj2);
            }

            public Object c(int i11, int i12) {
                Object obj = a.this.f11314a.get(i11);
                Object obj2 = a.this.f11315b.get(i12);
                if (obj != null && obj2 != null) {
                    return d.this.f11308b.b().c(obj, obj2);
                }
                throw new AssertionError();
            }

            public int d() {
                return a.this.f11315b.size();
            }

            public int e() {
                return a.this.f11314a.size();
            }
        }

        /* compiled from: AsyncListDiffer */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.e f11320a;

            b(h.e eVar) {
                this.f11320a = eVar;
            }

            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f11313g == aVar.f11316c) {
                    dVar.c(aVar.f11315b, this.f11320a, aVar.f11317d);
                }
            }
        }

        a(List list, List list2, int i11, Runnable runnable) {
            this.f11314a = list;
            this.f11315b = list2;
            this.f11316c = i11;
            this.f11317d = runnable;
        }

        public void run() {
            d.this.f11309c.execute(new b(h.b(new C0077a())));
        }
    }

    /* compiled from: AsyncListDiffer */
    public interface b<T> {
        void a(List<T> list, List<T> list2);
    }

    /* compiled from: AsyncListDiffer */
    private static class c implements Executor {

        /* renamed from: a  reason: collision with root package name */
        final Handler f11322a = new Handler(Looper.getMainLooper());

        c() {
        }

        public void execute(Runnable runnable) {
            this.f11322a.post(runnable);
        }
    }

    public d(o oVar, c<T> cVar) {
        this.f11307a = oVar;
        this.f11308b = cVar;
        if (cVar.c() != null) {
            this.f11309c = cVar.c();
        } else {
            this.f11309c = f11306h;
        }
    }

    private void d(List<T> list, Runnable runnable) {
        for (b<T> a11 : this.f11310d) {
            a11.a(list, this.f11312f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(b<T> bVar) {
        this.f11310d.add(bVar);
    }

    public List<T> b() {
        return this.f11312f;
    }

    /* access modifiers changed from: package-private */
    public void c(List<T> list, h.e eVar, Runnable runnable) {
        List<T> list2 = this.f11312f;
        this.f11311e = list;
        this.f11312f = Collections.unmodifiableList(list);
        eVar.b(this.f11307a);
        d(list2, runnable);
    }

    public void e(List<T> list) {
        f(list, (Runnable) null);
    }

    public void f(List<T> list, Runnable runnable) {
        int i11 = this.f11313g + 1;
        this.f11313g = i11;
        List<T> list2 = this.f11311e;
        if (list != list2) {
            List<T> list3 = this.f11312f;
            if (list == null) {
                int size = list2.size();
                this.f11311e = null;
                this.f11312f = Collections.emptyList();
                this.f11307a.c(0, size);
                d(list3, runnable);
            } else if (list2 == null) {
                this.f11311e = list;
                this.f11312f = Collections.unmodifiableList(list);
                this.f11307a.b(0, list.size());
                d(list3, runnable);
            } else {
                this.f11308b.a().execute(new a(list2, list, i11, runnable));
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
