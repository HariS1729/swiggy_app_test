package b7;

import b7.c;
import x6.d;
import x6.h;
import x6.n;

/* compiled from: NoneTransition.kt */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final d f12589a;

    /* renamed from: b  reason: collision with root package name */
    private final h f12590b;

    /* compiled from: NoneTransition.kt */
    public static final class a implements c.a {
        public c a(d dVar, h hVar) {
            return new b(dVar, hVar);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    public b(d dVar, h hVar) {
        this.f12589a = dVar;
        this.f12590b = hVar;
    }

    public void a() {
        h hVar = this.f12590b;
        if (hVar instanceof n) {
            this.f12589a.e(((n) hVar).a());
        } else if (hVar instanceof d) {
            this.f12589a.g(hVar.a());
        }
    }
}
