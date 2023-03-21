package p1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: AnnotatedString.kt */
public final class b implements CharSequence {

    /* renamed from: a  reason: collision with root package name */
    private final String f16045a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C0163b<u>> f16046b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C0163b<m>> f16047c;

    /* renamed from: d  reason: collision with root package name */
    private final List<C0163b<? extends Object>> f16048d;

    public b(String str, List<C0163b<u>> list, List<C0163b<m>> list2, List<? extends C0163b<? extends Object>> list3) {
        p.j(str, "text");
        p.j(list, "spanStyles");
        p.j(list2, "paragraphStyles");
        p.j(list3, "annotations");
        this.f16045a = str;
        this.f16046b = list;
        this.f16047c = list2;
        this.f16048d = list3;
        int size = list2.size();
        int i11 = -1;
        int i12 = 0;
        while (i12 < size) {
            C0163b bVar = list2.get(i12);
            boolean z11 = true;
            if (bVar.f() >= i11) {
                if (bVar.d() > this.f16045a.length() ? false : z11) {
                    i11 = bVar.d();
                    i12++;
                } else {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + bVar.f() + ", " + bVar.d() + ") is out of boundary").toString());
                }
            } else {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
        }
    }

    public char a(int i11) {
        return this.f16045a.charAt(i11);
    }

    public final List<C0163b<? extends Object>> b() {
        return this.f16048d;
    }

    public int c() {
        return this.f16045a.length();
    }

    public final /* bridge */ char charAt(int i11) {
        return a(i11);
    }

    public final List<C0163b<m>> d() {
        return this.f16047c;
    }

    public final List<C0163b<u>> e() {
        return this.f16046b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p.e(this.f16045a, bVar.f16045a) && p.e(this.f16046b, bVar.f16046b) && p.e(this.f16047c, bVar.f16047c) && p.e(this.f16048d, bVar.f16048d);
    }

    public final List<C0163b<String>> f(String str, int i11, int i12) {
        p.j(str, "tag");
        List<C0163b<? extends Object>> list = this.f16048d;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            C0163b<? extends Object> bVar = list.get(i13);
            C0163b bVar2 = bVar;
            if ((bVar2.e() instanceof String) && p.e(str, bVar2.g()) && c.i(i11, i12, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final String g() {
        return this.f16045a;
    }

    public final List<C0163b<e0>> h(int i11, int i12) {
        List<C0163b<? extends Object>> list = this.f16048d;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            C0163b<? extends Object> bVar = list.get(i13);
            C0163b bVar2 = bVar;
            if ((bVar2.e() instanceof e0) && c.i(i11, i12, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        return (((((this.f16045a.hashCode() * 31) + this.f16046b.hashCode()) * 31) + this.f16047c.hashCode()) * 31) + this.f16048d.hashCode();
    }

    public final b i(b bVar) {
        p.j(bVar, "other");
        a aVar = new a(this);
        aVar.d(bVar);
        return aVar.h();
    }

    /* renamed from: j */
    public b subSequence(int i11, int i12) {
        if (!(i11 <= i12)) {
            throw new IllegalArgumentException(("start (" + i11 + ") should be less or equal to end (" + i12 + ')').toString());
        } else if (i11 == 0 && i12 == this.f16045a.length()) {
            return this;
        } else {
            String substring = this.f16045a.substring(i11, i12);
            p.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new b(substring, c.g(this.f16046b, i11, i12), c.g(this.f16047c, i11, i12), c.g(this.f16048d, i11, i12));
        }
    }

    public final b k(long j) {
        return subSequence(a0.l(j), a0.k(j));
    }

    public final /* bridge */ int length() {
        return c();
    }

    public String toString() {
        return this.f16045a;
    }

    /* renamed from: p1.b$b  reason: collision with other inner class name */
    /* compiled from: AnnotatedString.kt */
    public static final class C0163b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f16058a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16059b;

        /* renamed from: c  reason: collision with root package name */
        private final int f16060c;

        /* renamed from: d  reason: collision with root package name */
        private final String f16061d;

        public C0163b(T t, int i11, int i12, String str) {
            p.j(str, "tag");
            this.f16058a = t;
            this.f16059b = i11;
            this.f16060c = i12;
            this.f16061d = str;
            if (!(i11 <= i12)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public final T a() {
            return this.f16058a;
        }

        public final int b() {
            return this.f16059b;
        }

        public final int c() {
            return this.f16060c;
        }

        public final int d() {
            return this.f16060c;
        }

        public final T e() {
            return this.f16058a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0163b)) {
                return false;
            }
            C0163b bVar = (C0163b) obj;
            return p.e(this.f16058a, bVar.f16058a) && this.f16059b == bVar.f16059b && this.f16060c == bVar.f16060c && p.e(this.f16061d, bVar.f16061d);
        }

        public final int f() {
            return this.f16059b;
        }

        public final String g() {
            return this.f16061d;
        }

        public int hashCode() {
            T t = this.f16058a;
            return ((((((t == null ? 0 : t.hashCode()) * 31) + this.f16059b) * 31) + this.f16060c) * 31) + this.f16061d.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.f16058a + ", start=" + this.f16059b + ", end=" + this.f16060c + ", tag=" + this.f16061d + ')';
        }

        public C0163b(T t, int i11, int i12) {
            this(t, i11, i12, "");
        }
    }

    /* compiled from: AnnotatedString.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final StringBuilder f16049a;

        /* renamed from: b  reason: collision with root package name */
        private final List<C0162a<u>> f16050b;

        /* renamed from: c  reason: collision with root package name */
        private final List<C0162a<m>> f16051c;

        /* renamed from: d  reason: collision with root package name */
        private final List<C0162a<? extends Object>> f16052d;

        /* renamed from: e  reason: collision with root package name */
        private final List<C0162a<? extends Object>> f16053e;

        public a(int i11) {
            this.f16049a = new StringBuilder(i11);
            this.f16050b = new ArrayList();
            this.f16051c = new ArrayList();
            this.f16052d = new ArrayList();
            this.f16053e = new ArrayList();
        }

        public final void a(m mVar, int i11, int i12) {
            p.j(mVar, "style");
            this.f16051c.add(new C0162a(mVar, i11, i12, (String) null, 8, (i) null));
        }

        public final void b(u uVar, int i11, int i12) {
            p.j(uVar, "style");
            this.f16050b.add(new C0162a(uVar, i11, i12, (String) null, 8, (i) null));
        }

        public final void c(String str) {
            p.j(str, "text");
            this.f16049a.append(str);
        }

        public final void d(b bVar) {
            p.j(bVar, "text");
            int length = this.f16049a.length();
            this.f16049a.append(bVar.g());
            List<C0163b<u>> e11 = bVar.e();
            int size = e11.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0163b bVar2 = e11.get(i11);
                b((u) bVar2.e(), bVar2.f() + length, bVar2.d() + length);
            }
            List<C0163b<m>> d11 = bVar.d();
            int size2 = d11.size();
            for (int i12 = 0; i12 < size2; i12++) {
                C0163b bVar3 = d11.get(i12);
                a((m) bVar3.e(), bVar3.f() + length, bVar3.d() + length);
            }
            List<C0163b<? extends Object>> b11 = bVar.b();
            int size3 = b11.size();
            for (int i13 = 0; i13 < size3; i13++) {
                C0163b bVar4 = b11.get(i13);
                this.f16052d.add(new C0162a(bVar4.e(), bVar4.f() + length, bVar4.d() + length, bVar4.g()));
            }
        }

        public final void e() {
            if (!this.f16053e.isEmpty()) {
                List<C0162a<? extends Object>> list = this.f16053e;
                list.remove(list.size() - 1).a(this.f16049a.length());
                return;
            }
            throw new IllegalStateException("Nothing to pop.".toString());
        }

        public final void f(int i11) {
            if (i11 < this.f16053e.size()) {
                while (this.f16053e.size() - 1 >= i11) {
                    e();
                }
                return;
            }
            throw new IllegalStateException((i11 + " should be less than " + this.f16053e.size()).toString());
        }

        public final int g(u uVar) {
            p.j(uVar, "style");
            C0162a aVar = new C0162a(uVar, this.f16049a.length(), 0, (String) null, 12, (i) null);
            this.f16053e.add(aVar);
            this.f16050b.add(aVar);
            return this.f16053e.size() - 1;
        }

        public final b h() {
            String sb2 = this.f16049a.toString();
            p.i(sb2, "text.toString()");
            List<C0162a<u>> list = this.f16050b;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(list.get(i11).b(this.f16049a.length()));
            }
            List<C0162a<m>> list2 = this.f16051c;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(list2.get(i12).b(this.f16049a.length()));
            }
            List<C0162a<? extends Object>> list3 = this.f16052d;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                arrayList3.add(list3.get(i13).b(this.f16049a.length()));
            }
            return new b(sb2, arrayList, arrayList2, arrayList3);
        }

        /* renamed from: p1.b$a$a  reason: collision with other inner class name */
        /* compiled from: AnnotatedString.kt */
        private static final class C0162a<T> {

            /* renamed from: a  reason: collision with root package name */
            private final T f16054a;

            /* renamed from: b  reason: collision with root package name */
            private final int f16055b;

            /* renamed from: c  reason: collision with root package name */
            private int f16056c;

            /* renamed from: d  reason: collision with root package name */
            private final String f16057d;

            public C0162a(T t, int i11, int i12, String str) {
                p.j(str, "tag");
                this.f16054a = t;
                this.f16055b = i11;
                this.f16056c = i12;
                this.f16057d = str;
            }

            public final void a(int i11) {
                this.f16056c = i11;
            }

            public final C0163b<T> b(int i11) {
                int i12 = this.f16056c;
                if (i12 != Integer.MIN_VALUE) {
                    i11 = i12;
                }
                if (i11 != Integer.MIN_VALUE) {
                    return new C0163b<>(this.f16054a, this.f16055b, i11, this.f16057d);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0162a)) {
                    return false;
                }
                C0162a aVar = (C0162a) obj;
                return p.e(this.f16054a, aVar.f16054a) && this.f16055b == aVar.f16055b && this.f16056c == aVar.f16056c && p.e(this.f16057d, aVar.f16057d);
            }

            public int hashCode() {
                T t = this.f16054a;
                return ((((((t == null ? 0 : t.hashCode()) * 31) + this.f16055b) * 31) + this.f16056c) * 31) + this.f16057d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.f16054a + ", start=" + this.f16055b + ", end=" + this.f16056c + ", tag=" + this.f16057d + ')';
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C0162a(Object obj, int i11, int i12, String str, int i13, i iVar) {
                this(obj, i11, (i13 & 4) != 0 ? Integer.MIN_VALUE : i12, (i13 & 8) != 0 ? "" : str);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i11, int i12, i iVar) {
            this((i12 & 1) != 0 ? 16 : i11);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(b bVar) {
            this(0, 1, (i) null);
            p.j(bVar, "text");
            d(bVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, List list, List list2, int i11, i iVar) {
        this(str, (i11 & 2) != 0 ? k.j() : list, (i11 & 4) != 0 ? k.j() : list2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(String str, List<C0163b<u>> list, List<C0163b<m>> list2) {
        this(str, list, list2, k.j());
        p.j(str, "text");
        p.j(list, "spanStyles");
        p.j(list2, "paragraphStyles");
    }
}
