package y6;

import fp0.c;
import kotlin.jvm.internal.p;

/* compiled from: RealSizeResolver.kt */
public final class e implements h {

    /* renamed from: a  reason: collision with root package name */
    private final g f18027a;

    public e(g gVar) {
        this.f18027a = gVar;
    }

    public Object a(c<? super g> cVar) {
        return this.f18027a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && p.e(this.f18027a, ((e) obj).f18027a);
    }

    public int hashCode() {
        return this.f18027a.hashCode();
    }
}
