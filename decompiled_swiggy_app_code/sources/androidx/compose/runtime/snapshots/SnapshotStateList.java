package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.b;
import bp0.k;
import g0.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import lp0.l;
import mp0.d;
import n0.m;
import n0.t;
import n0.u;
import n0.v;

/* compiled from: SnapshotStateList.kt */
public final class SnapshotStateList<T> implements List<T>, u, d {

    /* renamed from: a  reason: collision with root package name */
    private v f6262a = new a(g0.a.b());

    /* compiled from: SnapshotStateList.kt */
    public static final class a<T> extends v {

        /* renamed from: c  reason: collision with root package name */
        private f<? extends T> f6263c;

        /* renamed from: d  reason: collision with root package name */
        private int f6264d;

        public a(f<? extends T> fVar) {
            p.j(fVar, "list");
            this.f6263c = fVar;
        }

        public void a(v vVar) {
            p.j(vVar, "value");
            synchronized (m.a()) {
                this.f6263c = ((a) vVar).f6263c;
                this.f6264d = ((a) vVar).f6264d;
                k kVar = k.f22762a;
            }
        }

        public v b() {
            return new a(this.f6263c);
        }

        public final f<T> g() {
            return this.f6263c;
        }

        public final int h() {
            return this.f6264d;
        }

        public final void i(f<? extends T> fVar) {
            p.j(fVar, "<set-?>");
            this.f6263c = fVar;
        }

        public final void j(int i11) {
            this.f6264d = i11;
        }
    }

    private final boolean i(l<? super List<T>, Boolean> lVar) {
        b.a aVar;
        int h11;
        f g11;
        Boolean invoke;
        b b11;
        boolean z11;
        do {
            synchronized (m.a()) {
                aVar = b.f6287e;
                a aVar2 = (a) SnapshotKt.A((a) k(), aVar.b());
                h11 = aVar2.h();
                g11 = aVar2.g();
                k kVar = k.f22762a;
            }
            p.g(g11);
            f.a j = g11.j();
            invoke = lVar.invoke(j);
            f build = j.build();
            if (p.e(build, g11)) {
                break;
            }
            synchronized (m.a()) {
                a aVar3 = (a) k();
                SnapshotKt.D();
                synchronized (SnapshotKt.C()) {
                    b11 = aVar.b();
                    a aVar4 = (a) SnapshotKt.Z(aVar3, this, b11);
                    z11 = true;
                    if (aVar4.h() == h11) {
                        aVar4.i(build);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                SnapshotKt.J(b11, this);
            }
        } while (!z11);
        return invoke.booleanValue();
    }

    public boolean add(T t) {
        b.a aVar;
        int h11;
        f g11;
        boolean z11;
        b b11;
        do {
            synchronized (m.a()) {
                aVar = b.f6287e;
                a aVar2 = (a) SnapshotKt.A((a) k(), aVar.b());
                h11 = aVar2.h();
                g11 = aVar2.g();
                k kVar = k.f22762a;
            }
            p.g(g11);
            f add = g11.add(t);
            z11 = false;
            if (p.e(add, g11)) {
                return false;
            }
            synchronized (m.a()) {
                a aVar3 = (a) k();
                SnapshotKt.D();
                synchronized (SnapshotKt.C()) {
                    b11 = aVar.b();
                    a aVar4 = (a) SnapshotKt.Z(aVar3, this, b11);
                    if (aVar4.h() == h11) {
                        aVar4.i(add);
                        aVar4.j(aVar4.h() + 1);
                        z11 = true;
                    }
                }
                SnapshotKt.J(b11, this);
            }
        } while (!z11);
        return true;
    }

    public boolean addAll(int i11, Collection<? extends T> collection) {
        p.j(collection, "elements");
        return i(new SnapshotStateList$addAll$1(i11, collection));
    }

    public final int c() {
        return ((a) SnapshotKt.A((a) k(), b.f6287e.b())).h();
    }

    public void clear() {
        b b11;
        synchronized (m.a()) {
            a aVar = (a) k();
            SnapshotKt.D();
            synchronized (SnapshotKt.C()) {
                b11 = b.f6287e.b();
                a aVar2 = (a) SnapshotKt.Z(aVar, this, b11);
                aVar2.i(g0.a.b());
                aVar2.j(aVar2.h() + 1);
            }
            SnapshotKt.J(b11, this);
        }
    }

    public boolean contains(Object obj) {
        return g().g().contains(obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        p.j(collection, "elements");
        return g().g().containsAll(collection);
    }

    public /* synthetic */ v d(v vVar, v vVar2, v vVar3) {
        return t.a(this, vVar, vVar2, vVar3);
    }

    public void f(v vVar) {
        p.j(vVar, "value");
        vVar.e(k());
        this.f6262a = (a) vVar;
    }

    public final a<T> g() {
        return (a) SnapshotKt.O((a) k(), this);
    }

    public T get(int i11) {
        return g().g().get(i11);
    }

    public int h() {
        return g().g().size();
    }

    public int indexOf(Object obj) {
        return g().g().indexOf(obj);
    }

    public boolean isEmpty() {
        return g().g().isEmpty();
    }

    public Iterator<T> iterator() {
        return listIterator();
    }

    public v k() {
        return this.f6262a;
    }

    public T l(int i11) {
        b.a aVar;
        int h11;
        f g11;
        b b11;
        boolean z11;
        T t = get(i11);
        do {
            synchronized (m.a()) {
                aVar = b.f6287e;
                a aVar2 = (a) SnapshotKt.A((a) k(), aVar.b());
                h11 = aVar2.h();
                g11 = aVar2.g();
                k kVar = k.f22762a;
            }
            p.g(g11);
            f C = g11.C(i11);
            if (p.e(C, g11)) {
                break;
            }
            synchronized (m.a()) {
                a aVar3 = (a) k();
                SnapshotKt.D();
                synchronized (SnapshotKt.C()) {
                    b11 = aVar.b();
                    a aVar4 = (a) SnapshotKt.Z(aVar3, this, b11);
                    z11 = true;
                    if (aVar4.h() == h11) {
                        aVar4.i(C);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                SnapshotKt.J(b11, this);
            }
        } while (!z11);
        return t;
    }

    public int lastIndexOf(Object obj) {
        return g().g().lastIndexOf(obj);
    }

    public ListIterator<T> listIterator() {
        return new c(this, 0);
    }

    public final void m(int i11, int i12) {
        b.a aVar;
        int h11;
        f g11;
        b b11;
        boolean z11;
        do {
            synchronized (m.a()) {
                aVar = b.f6287e;
                a aVar2 = (a) SnapshotKt.A((a) k(), aVar.b());
                h11 = aVar2.h();
                g11 = aVar2.g();
                k kVar = k.f22762a;
            }
            p.g(g11);
            f.a j = g11.j();
            j.subList(i11, i12).clear();
            f build = j.build();
            if (!p.e(build, g11)) {
                synchronized (m.a()) {
                    a aVar3 = (a) k();
                    SnapshotKt.D();
                    synchronized (SnapshotKt.C()) {
                        b11 = aVar.b();
                        a aVar4 = (a) SnapshotKt.Z(aVar3, this, b11);
                        z11 = true;
                        if (aVar4.h() == h11) {
                            aVar4.i(build);
                            aVar4.j(aVar4.h() + 1);
                        } else {
                            z11 = false;
                        }
                    }
                    SnapshotKt.J(b11, this);
                }
            } else {
                return;
            }
        } while (!z11);
    }

    public final int n(Collection<? extends T> collection, int i11, int i12) {
        b.a aVar;
        int h11;
        f g11;
        b b11;
        boolean z11;
        p.j(collection, "elements");
        int size = size();
        do {
            synchronized (m.a()) {
                aVar = b.f6287e;
                a aVar2 = (a) SnapshotKt.A((a) k(), aVar.b());
                h11 = aVar2.h();
                g11 = aVar2.g();
                k kVar = k.f22762a;
            }
            p.g(g11);
            f.a j = g11.j();
            j.subList(i11, i12).retainAll(collection);
            f build = j.build();
            if (p.e(build, g11)) {
                break;
            }
            synchronized (m.a()) {
                a aVar3 = (a) k();
                SnapshotKt.D();
                synchronized (SnapshotKt.C()) {
                    b11 = aVar.b();
                    a aVar4 = (a) SnapshotKt.Z(aVar3, this, b11);
                    z11 = true;
                    if (aVar4.h() == h11) {
                        aVar4.i(build);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                SnapshotKt.J(b11, this);
            }
        } while (!z11);
        return size - size();
    }

    public final /* bridge */ T remove(int i11) {
        return l(i11);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        b.a aVar;
        int h11;
        f g11;
        boolean z11;
        b b11;
        p.j(collection, "elements");
        do {
            synchronized (m.f15741a) {
                aVar = b.f6287e;
                a aVar2 = (a) SnapshotKt.A((a) k(), aVar.b());
                h11 = aVar2.h();
                g11 = aVar2.g();
                k kVar = k.f22762a;
            }
            p.g(g11);
            f<? extends Object> removeAll = g11.removeAll(collection);
            z11 = false;
            if (p.e(removeAll, g11)) {
                return false;
            }
            synchronized (m.f15741a) {
                a aVar3 = (a) k();
                SnapshotKt.D();
                synchronized (SnapshotKt.C()) {
                    b11 = aVar.b();
                    a aVar4 = (a) SnapshotKt.Z(aVar3, this, b11);
                    if (aVar4.h() == h11) {
                        aVar4.i(removeAll);
                        aVar4.j(aVar4.h() + 1);
                        z11 = true;
                    }
                }
                SnapshotKt.J(b11, this);
            }
        } while (!z11);
        return true;
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        p.j(collection, "elements");
        return i(new SnapshotStateList$retainAll$1(collection));
    }

    public T set(int i11, T t) {
        b.a aVar;
        int h11;
        f g11;
        b b11;
        boolean z11;
        T t11 = get(i11);
        do {
            synchronized (m.f15741a) {
                aVar = b.f6287e;
                a aVar2 = (a) SnapshotKt.A((a) k(), aVar.b());
                h11 = aVar2.h();
                g11 = aVar2.g();
                k kVar = k.f22762a;
            }
            p.g(g11);
            f fVar = g11.set(i11, t);
            if (p.e(fVar, g11)) {
                break;
            }
            synchronized (m.f15741a) {
                a aVar3 = (a) k();
                SnapshotKt.D();
                synchronized (SnapshotKt.C()) {
                    b11 = aVar.b();
                    a aVar4 = (a) SnapshotKt.Z(aVar3, this, b11);
                    z11 = true;
                    if (aVar4.h() == h11) {
                        aVar4.i(fVar);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                SnapshotKt.J(b11, this);
            }
        } while (!z11);
        return t11;
    }

    public final /* bridge */ int size() {
        return h();
    }

    public List<T> subList(int i11, int i12) {
        boolean z11 = true;
        if (!(i11 >= 0 && i11 <= i12) || i12 > size()) {
            z11 = false;
        }
        if (z11) {
            return new d(this, i11, i12);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public Object[] toArray() {
        return h.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        p.j(tArr, "array");
        return h.b(this, tArr);
    }

    public boolean addAll(Collection<? extends T> collection) {
        b.a aVar;
        int h11;
        f g11;
        boolean z11;
        b b11;
        p.j(collection, "elements");
        do {
            synchronized (m.f15741a) {
                aVar = b.f6287e;
                a aVar2 = (a) SnapshotKt.A((a) k(), aVar.b());
                h11 = aVar2.h();
                g11 = aVar2.g();
                k kVar = k.f22762a;
            }
            p.g(g11);
            f<? extends T> addAll = g11.addAll(collection);
            z11 = false;
            if (p.e(addAll, g11)) {
                return false;
            }
            synchronized (m.f15741a) {
                a aVar3 = (a) k();
                SnapshotKt.D();
                synchronized (SnapshotKt.C()) {
                    b11 = aVar.b();
                    a aVar4 = (a) SnapshotKt.Z(aVar3, this, b11);
                    if (aVar4.h() == h11) {
                        aVar4.i(addAll);
                        aVar4.j(aVar4.h() + 1);
                        z11 = true;
                    }
                }
                SnapshotKt.J(b11, this);
            }
        } while (!z11);
        return true;
    }

    public ListIterator<T> listIterator(int i11) {
        return new c(this, i11);
    }

    public boolean remove(Object obj) {
        b.a aVar;
        int h11;
        f g11;
        boolean z11;
        b b11;
        do {
            synchronized (m.f15741a) {
                aVar = b.f6287e;
                a aVar2 = (a) SnapshotKt.A((a) k(), aVar.b());
                h11 = aVar2.h();
                g11 = aVar2.g();
                k kVar = k.f22762a;
            }
            p.g(g11);
            f remove = g11.remove(obj);
            z11 = false;
            if (p.e(remove, g11)) {
                return false;
            }
            synchronized (m.f15741a) {
                a aVar3 = (a) k();
                SnapshotKt.D();
                synchronized (SnapshotKt.C()) {
                    b11 = aVar.b();
                    a aVar4 = (a) SnapshotKt.Z(aVar3, this, b11);
                    if (aVar4.h() == h11) {
                        aVar4.i(remove);
                        aVar4.j(aVar4.h() + 1);
                        z11 = true;
                    }
                }
                SnapshotKt.J(b11, this);
            }
        } while (!z11);
        return true;
    }

    public void add(int i11, T t) {
        b.a aVar;
        int h11;
        f g11;
        b b11;
        boolean z11;
        do {
            synchronized (m.f15741a) {
                aVar = b.f6287e;
                a aVar2 = (a) SnapshotKt.A((a) k(), aVar.b());
                h11 = aVar2.h();
                g11 = aVar2.g();
                k kVar = k.f22762a;
            }
            p.g(g11);
            f add = g11.add(i11, t);
            if (!p.e(add, g11)) {
                synchronized (m.f15741a) {
                    a aVar3 = (a) k();
                    SnapshotKt.D();
                    synchronized (SnapshotKt.C()) {
                        b11 = aVar.b();
                        a aVar4 = (a) SnapshotKt.Z(aVar3, this, b11);
                        z11 = true;
                        if (aVar4.h() == h11) {
                            aVar4.i(add);
                            aVar4.j(aVar4.h() + 1);
                        } else {
                            z11 = false;
                        }
                    }
                    SnapshotKt.J(b11, this);
                }
            } else {
                return;
            }
        } while (!z11);
    }
}
