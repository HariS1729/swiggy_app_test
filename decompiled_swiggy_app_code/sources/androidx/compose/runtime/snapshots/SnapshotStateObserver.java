package androidx.compose.runtime.snapshots;

import bp0.k;
import f0.d;
import f0.e;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import lp0.l;
import lp0.p;
import n0.c;

/* compiled from: SnapshotStateObserver.kt */
public final class SnapshotStateObserver {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final l<lp0.a<k>, k> f6268a;

    /* renamed from: b  reason: collision with root package name */
    private final p<Set<? extends Object>, b, k> f6269b = new SnapshotStateObserver$applyObserver$1(this);

    /* renamed from: c  reason: collision with root package name */
    private final l<Object, k> f6270c = new SnapshotStateObserver$readObserver$1(this);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final e<a<?>> f6271d = new e<>(new a[16], 0);

    /* renamed from: e  reason: collision with root package name */
    private c f6272e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f6273f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public a<?> f6274g;

    /* compiled from: SnapshotStateObserver.kt */
    private static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final l<T, k> f6275a;

        /* renamed from: b  reason: collision with root package name */
        private final d<T> f6276b = new d<>();

        /* renamed from: c  reason: collision with root package name */
        private final HashSet<Object> f6277c = new HashSet<>();

        /* renamed from: d  reason: collision with root package name */
        private T f6278d;

        public a(l<? super T, k> lVar) {
            kotlin.jvm.internal.p.j(lVar, "onChanged");
            this.f6275a = lVar;
        }

        public final void a(Object obj) {
            kotlin.jvm.internal.p.j(obj, "value");
            d<T> dVar = this.f6276b;
            T t = this.f6278d;
            kotlin.jvm.internal.p.g(t);
            dVar.c(obj, t);
        }

        public final void b(Collection<? extends Object> collection) {
            kotlin.jvm.internal.p.j(collection, "scopes");
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                this.f6275a.invoke(it2.next());
            }
        }

        public final T c() {
            return this.f6278d;
        }

        public final HashSet<Object> d() {
            return this.f6277c;
        }

        public final d<T> e() {
            return this.f6276b;
        }

        public final l<T, k> f() {
            return this.f6275a;
        }

        public final void g(T t) {
            this.f6278d = t;
        }
    }

    public SnapshotStateObserver(l<? super lp0.a<k>, k> lVar) {
        kotlin.jvm.internal.p.j(lVar, "onChangedExecutor");
        this.f6268a = lVar;
    }

    /* access modifiers changed from: private */
    public final void f() {
        e<a<?>> eVar = this.f6271d;
        int m11 = eVar.m();
        if (m11 > 0) {
            int i11 = 0;
            Object[] l11 = eVar.l();
            do {
                a aVar = (a) l11[i11];
                HashSet<Object> d11 = aVar.d();
                if (!d11.isEmpty()) {
                    aVar.b(d11);
                    d11.clear();
                }
                i11++;
            } while (i11 < m11);
        }
    }

    private final <T> a<T> i(l<? super T, k> lVar) {
        int i11;
        e<a<?>> eVar = this.f6271d;
        int m11 = eVar.m();
        if (m11 > 0) {
            Object[] l11 = eVar.l();
            i11 = 0;
            while (true) {
                if (((a) l11[i11]).f() == lVar) {
                    break;
                }
                i11++;
                if (i11 >= m11) {
                    break;
                }
            }
        } else {
            i11 = -1;
        }
        if (i11 != -1) {
            return (a) this.f6271d.l()[i11];
        }
        a<T> aVar = new a<>(lVar);
        this.f6271d.b(aVar);
        return aVar;
    }

    public final void g() {
        synchronized (this.f6271d) {
            e<a<?>> eVar = this.f6271d;
            int m11 = eVar.m();
            if (m11 > 0) {
                int i11 = 0;
                Object[] l11 = eVar.l();
                do {
                    ((a) l11[i11]).e().d();
                    i11++;
                } while (i11 < m11);
            }
            k kVar = k.f22762a;
        }
    }

    public final void h(l<Object, Boolean> lVar) {
        l<Object, Boolean> lVar2 = lVar;
        kotlin.jvm.internal.p.j(lVar2, "predicate");
        synchronized (this.f6271d) {
            e<a<?>> eVar = this.f6271d;
            int m11 = eVar.m();
            if (m11 > 0) {
                Object[] l11 = eVar.l();
                int i11 = 0;
                do {
                    d e11 = ((a) l11[i11]).e();
                    int j = e11.j();
                    int i12 = 0;
                    for (int i13 = 0; i13 < j; i13++) {
                        int i14 = e11.k()[i13];
                        f0.c cVar = e11.i()[i14];
                        kotlin.jvm.internal.p.g(cVar);
                        int size = cVar.size();
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj = cVar.f()[i16];
                            if (obj != null) {
                                if (!lVar2.invoke(obj).booleanValue()) {
                                    if (i15 != i16) {
                                        cVar.f()[i15] = obj;
                                    }
                                    i15++;
                                }
                                i16++;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            }
                        }
                        int size2 = cVar.size();
                        for (int i17 = i15; i17 < size2; i17++) {
                            cVar.f()[i17] = null;
                        }
                        cVar.h(i15);
                        if (cVar.size() > 0) {
                            if (i12 != i13) {
                                int i18 = e11.k()[i12];
                                e11.k()[i12] = i14;
                                e11.k()[i13] = i18;
                            }
                            i12++;
                        }
                    }
                    int j11 = e11.j();
                    for (int i19 = i12; i19 < j11; i19++) {
                        e11.l()[e11.k()[i19]] = null;
                    }
                    e11.p(i12);
                    i11++;
                } while (i11 < m11);
            }
            k kVar = k.f22762a;
        }
    }

    public final <T> void j(T t, l<? super T, k> lVar, lp0.a<k> aVar) {
        a<T> i11;
        kotlin.jvm.internal.p.j(t, "scope");
        kotlin.jvm.internal.p.j(lVar, "onValueChangedForScope");
        kotlin.jvm.internal.p.j(aVar, RenderingDetails.TYPE_BLOCK);
        a<?> aVar2 = this.f6274g;
        boolean z11 = this.f6273f;
        synchronized (this.f6271d) {
            i11 = i(lVar);
            i11.e().n(t);
        }
        T c11 = i11.c();
        i11.g(t);
        this.f6274g = i11;
        this.f6273f = false;
        b.f6287e.d(this.f6270c, (l<Object, k>) null, aVar);
        this.f6274g = aVar2;
        i11.g(c11);
        this.f6273f = z11;
    }

    public final void k() {
        this.f6272e = b.f6287e.e(this.f6269b);
    }

    public final void l() {
        c cVar = this.f6272e;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
