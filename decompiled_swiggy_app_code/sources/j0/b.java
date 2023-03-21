package j0;

import cp0.f;
import g0.h;
import i0.d;
import java.util.Iterator;
import k0.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: PersistentOrderedSet.kt */
public final class b<E> extends f<E> implements h<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f15259e = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final b f15260f;

    /* renamed from: b  reason: collision with root package name */
    private final Object f15261b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f15262c;

    /* renamed from: d  reason: collision with root package name */
    private final d<E, a> f15263d;

    /* compiled from: PersistentOrderedSet.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final <E> h<E> a() {
            return b.f15260f;
        }
    }

    static {
        c cVar = c.f15321a;
        f15260f = new b(cVar, cVar, d.f14819d.a());
    }

    public b(Object obj, Object obj2, d<E, a> dVar) {
        p.j(dVar, "hashMap");
        this.f15261b = obj;
        this.f15262c = obj2;
        this.f15263d = dVar;
    }

    public h<E> add(E e11) {
        if (this.f15263d.containsKey(e11)) {
            return this;
        }
        if (isEmpty()) {
            return new b(e11, e11, this.f15263d.s(e11, new a()));
        }
        Object obj = this.f15262c;
        a aVar = this.f15263d.get(obj);
        p.g(aVar);
        return new b(this.f15261b, e11, this.f15263d.s(obj, aVar.e(e11)).s(e11, new a(obj)));
    }

    public int c() {
        return this.f15263d.size();
    }

    public boolean contains(Object obj) {
        return this.f15263d.containsKey(obj);
    }

    public Iterator<E> iterator() {
        return new c(this.f15261b, this.f15263d);
    }

    public h<E> remove(E e11) {
        a aVar = this.f15263d.get(e11);
        if (aVar == null) {
            return this;
        }
        d<E, a> t = this.f15263d.t(e11);
        if (aVar.b()) {
            a aVar2 = t.get(aVar.d());
            p.g(aVar2);
            t = t.s(aVar.d(), aVar2.e(aVar.c()));
        }
        if (aVar.a()) {
            a aVar3 = t.get(aVar.c());
            p.g(aVar3);
            t = t.s(aVar.c(), aVar3.f(aVar.d()));
        }
        return new b(!aVar.b() ? aVar.c() : this.f15261b, !aVar.a() ? aVar.d() : this.f15262c, t);
    }
}
