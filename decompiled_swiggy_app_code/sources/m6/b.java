package m6;

import coil.ImageLoader;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import o6.e;
import r6.h;
import u6.c;
import x6.k;

/* compiled from: ComponentRegistry.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final List<s6.a> f15714a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Pair<c<? extends Object, ? extends Object>, Class<? extends Object>>> f15715b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Pair<t6.b<? extends Object>, Class<? extends Object>>> f15716c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Pair<h.a<? extends Object>, Class<? extends Object>>> f15717d;

    /* renamed from: e  reason: collision with root package name */
    private final List<e.a> f15718e;

    /* compiled from: ComponentRegistry.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<s6.a> f15719a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Pair<c<? extends Object, ?>, Class<? extends Object>>> f15720b;

        /* renamed from: c  reason: collision with root package name */
        private final List<Pair<t6.b<? extends Object>, Class<? extends Object>>> f15721c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Pair<h.a<? extends Object>, Class<? extends Object>>> f15722d;

        /* renamed from: e  reason: collision with root package name */
        private final List<e.a> f15723e;

        public a(b bVar) {
            this.f15719a = s.G0(bVar.c());
            this.f15720b = s.G0(bVar.e());
            this.f15721c = s.G0(bVar.d());
            this.f15722d = s.G0(bVar.b());
            this.f15723e = s.G0(bVar.a());
        }

        public final a a(e.a aVar) {
            f().add(aVar);
            return this;
        }

        public final <T> a b(h.a<T> aVar, Class<T> cls) {
            g().add(bp0.h.a(aVar, cls));
            return this;
        }

        public final <T> a c(t6.b<T> bVar, Class<T> cls) {
            h().add(bp0.h.a(bVar, cls));
            return this;
        }

        public final <T> a d(c<T, ?> cVar, Class<T> cls) {
            i().add(bp0.h.a(cVar, cls));
            return this;
        }

        public final b e() {
            return new b(c7.c.a(this.f15719a), c7.c.a(this.f15720b), c7.c.a(this.f15721c), c7.c.a(this.f15722d), c7.c.a(this.f15723e), (i) null);
        }

        public final List<e.a> f() {
            return this.f15723e;
        }

        public final List<Pair<h.a<? extends Object>, Class<? extends Object>>> g() {
            return this.f15722d;
        }

        public final List<Pair<t6.b<? extends Object>, Class<? extends Object>>> h() {
            return this.f15721c;
        }

        public final List<Pair<c<? extends Object, ?>, Class<? extends Object>>> i() {
            return this.f15720b;
        }
    }

    private b(List<? extends s6.a> list, List<? extends Pair<? extends c<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends Pair<? extends t6.b<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends Pair<? extends h.a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends e.a> list5) {
        this.f15714a = list;
        this.f15715b = list2;
        this.f15716c = list3;
        this.f15717d = list4;
        this.f15718e = list5;
    }

    public /* synthetic */ b(List list, List list2, List list3, List list4, List list5, i iVar) {
        this(list, list2, list3, list4, list5);
    }

    public final List<e.a> a() {
        return this.f15718e;
    }

    public final List<Pair<h.a<? extends Object>, Class<? extends Object>>> b() {
        return this.f15717d;
    }

    public final List<s6.a> c() {
        return this.f15714a;
    }

    public final List<Pair<t6.b<? extends Object>, Class<? extends Object>>> d() {
        return this.f15716c;
    }

    public final List<Pair<c<? extends Object, ? extends Object>, Class<? extends Object>>> e() {
        return this.f15715b;
    }

    public final String f(Object obj, k kVar) {
        String a11;
        List<Pair<t6.b<? extends Object>, Class<? extends Object>>> list = this.f15716c;
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            Pair pair = list.get(i11);
            t6.b bVar = (t6.b) pair.a();
            if (((Class) pair.b()).isAssignableFrom(obj.getClass()) && (a11 = bVar.a(obj, kVar)) != null) {
                return a11;
            }
            i11 = i12;
        }
        return null;
    }

    public final Object g(Object obj, k kVar) {
        Object a11;
        List<Pair<c<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.f15715b;
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            Pair pair = list.get(i11);
            c cVar = (c) pair.a();
            if (((Class) pair.b()).isAssignableFrom(obj.getClass()) && (a11 = cVar.a(obj, kVar)) != null) {
                obj = a11;
            }
            i11 = i12;
        }
        return obj;
    }

    public final a h() {
        return new a(this);
    }

    public final Pair<e, Integer> i(r6.k kVar, k kVar2, ImageLoader imageLoader, int i11) {
        int size = this.f15718e.size();
        while (i11 < size) {
            int i12 = i11 + 1;
            e a11 = this.f15718e.get(i11).a(kVar, kVar2, imageLoader);
            if (a11 != null) {
                return bp0.h.a(a11, Integer.valueOf(i11));
            }
            i11 = i12;
        }
        return null;
    }

    public final Pair<h, Integer> j(Object obj, k kVar, ImageLoader imageLoader, int i11) {
        h a11;
        int size = this.f15717d.size();
        while (i11 < size) {
            int i12 = i11 + 1;
            Pair pair = this.f15717d.get(i11);
            h.a aVar = (h.a) pair.a();
            if (((Class) pair.b()).isAssignableFrom(obj.getClass()) && (a11 = aVar.a(obj, kVar, imageLoader)) != null) {
                return bp0.h.a(a11, Integer.valueOf(i11));
            }
            i11 = i12;
        }
        return null;
    }

    public b() {
        this(k.j(), k.j(), k.j(), k.j(), k.j());
    }
}
