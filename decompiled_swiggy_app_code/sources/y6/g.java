package y6;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import y6.c;

/* compiled from: Size.kt */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f18030c = new a((i) null);

    /* renamed from: d  reason: collision with root package name */
    public static final g f18031d;

    /* renamed from: a  reason: collision with root package name */
    private final c f18032a;

    /* renamed from: b  reason: collision with root package name */
    private final c f18033b;

    /* compiled from: Size.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    static {
        c.b bVar = c.b.f18025a;
        f18031d = new g(bVar, bVar);
    }

    public g(c cVar, c cVar2) {
        this.f18032a = cVar;
        this.f18033b = cVar2;
    }

    public final c a() {
        return this.f18033b;
    }

    public final c b() {
        return this.f18032a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p.e(this.f18032a, gVar.f18032a) && p.e(this.f18033b, gVar.f18033b);
    }

    public int hashCode() {
        return (this.f18032a.hashCode() * 31) + this.f18033b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f18032a + ", height=" + this.f18033b + ')';
    }
}
