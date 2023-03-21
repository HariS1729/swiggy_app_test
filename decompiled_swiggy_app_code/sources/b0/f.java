package b0;

import java.util.Objects;
import kotlin.jvm.internal.p;

/* compiled from: Selection.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12557a;

    /* compiled from: Selection.kt */
    public static final class a {
    }

    public final a a() {
        return null;
    }

    public final boolean b() {
        return this.f12557a;
    }

    public final a c() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        Objects.requireNonNull(fVar);
        return p.e((Object) null, (Object) null) && p.e((Object) null, (Object) null) && this.f12557a == fVar.f12557a;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return "Selection(start=" + null + ", end=" + null + ", handlesCrossed=" + this.f12557a + ')';
    }
}
