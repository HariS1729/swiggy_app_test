package f1;

import java.util.Objects;
import kotlin.jvm.internal.p;

/* compiled from: PointerIcon.android.kt */
public final class b implements r {

    /* renamed from: a  reason: collision with root package name */
    private final int f14479a;

    public b(int i11) {
        this.f14479a = i11;
    }

    public final int a() {
        return this.f14479a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.e(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f14479a == ((b) obj).f14479a;
    }

    public int hashCode() {
        return this.f14479a;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f14479a + ')';
    }
}
