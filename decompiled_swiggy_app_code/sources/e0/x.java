package e0;

import kotlin.jvm.internal.p;

/* compiled from: JoinedKey.kt */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private final Object f14247a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f14248b;

    public x(Object obj, Object obj2) {
        this.f14247a = obj;
        this.f14248b = obj2;
    }

    private final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return p.e(this.f14247a, xVar.f14247a) && p.e(this.f14248b, xVar.f14248b);
    }

    public int hashCode() {
        return (a(this.f14247a) * 31) + a(this.f14248b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f14247a + ", right=" + this.f14248b + ')';
    }
}
