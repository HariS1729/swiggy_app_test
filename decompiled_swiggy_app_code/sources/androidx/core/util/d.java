package androidx.core.util;

/* compiled from: Pair */
public class d<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f9416a;

    /* renamed from: b  reason: collision with root package name */
    public final S f9417b;

    public d(F f11, S s11) {
        this.f9416a = f11;
        this.f9417b = s11;
    }

    public static <A, B> d<A, B> a(A a11, B b11) {
        return new d<>(a11, b11);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!c.a(dVar.f9416a, this.f9416a) || !c.a(dVar.f9417b, this.f9417b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f11 = this.f9416a;
        int i11 = 0;
        int hashCode = f11 == null ? 0 : f11.hashCode();
        S s11 = this.f9417b;
        if (s11 != null) {
            i11 = s11.hashCode();
        }
        return hashCode ^ i11;
    }

    public String toString() {
        return "Pair{" + this.f9416a + " " + this.f9417b + "}";
    }
}
