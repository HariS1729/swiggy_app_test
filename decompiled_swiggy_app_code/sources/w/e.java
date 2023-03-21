package w;

import kotlin.jvm.internal.p;

/* compiled from: LazyListBeyondBoundsInfo.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final f0.e<a> f17351a = new f0.e<>(new a[16], 0);

    /* compiled from: LazyListBeyondBoundsInfo.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f17352a;

        /* renamed from: b  reason: collision with root package name */
        private final int f17353b;

        public a(int i11, int i12) {
            this.f17352a = i11;
            this.f17353b = i12;
            boolean z11 = true;
            if (i11 >= 0) {
                if (!(i12 < i11 ? false : z11)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final int a() {
            return this.f17353b;
        }

        public final int b() {
            return this.f17352a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f17352a == aVar.f17352a && this.f17353b == aVar.f17353b;
        }

        public int hashCode() {
            return (this.f17352a * 31) + this.f17353b;
        }

        public String toString() {
            return "Interval(start=" + this.f17352a + ", end=" + this.f17353b + ')';
        }
    }

    public final a a(int i11, int i12) {
        a aVar = new a(i11, i12);
        this.f17351a.b(aVar);
        return aVar;
    }

    public final int b() {
        int a11 = this.f17351a.k().a();
        f0.e<a> eVar = this.f17351a;
        int m11 = eVar.m();
        if (m11 > 0) {
            int i11 = 0;
            Object[] l11 = eVar.l();
            do {
                a aVar = (a) l11[i11];
                if (aVar.a() > a11) {
                    a11 = aVar.a();
                }
                i11++;
            } while (i11 < m11);
        }
        return a11;
    }

    public final int c() {
        int b11 = this.f17351a.k().b();
        f0.e<a> eVar = this.f17351a;
        int m11 = eVar.m();
        boolean z11 = false;
        if (m11 > 0) {
            Object[] l11 = eVar.l();
            int i11 = 0;
            do {
                a aVar = (a) l11[i11];
                if (aVar.b() < b11) {
                    b11 = aVar.b();
                }
                i11++;
            } while (i11 < m11);
        }
        if (b11 >= 0) {
            z11 = true;
        }
        if (z11) {
            return b11;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final boolean d() {
        return this.f17351a.p();
    }

    public final void e(a aVar) {
        p.j(aVar, "interval");
        this.f17351a.r(aVar);
    }
}
