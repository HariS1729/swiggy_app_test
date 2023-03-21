package f1;

import android.view.PointerIcon;
import java.util.Objects;
import kotlin.jvm.internal.p;

/* compiled from: PointerIcon.android.kt */
public final class a implements r {

    /* renamed from: a  reason: collision with root package name */
    private final PointerIcon f14478a;

    public final PointerIcon a() {
        return this.f14478a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.e(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return p.e(this.f14478a, ((a) obj).f14478a);
    }

    public int hashCode() {
        return this.f14478a.hashCode();
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.f14478a + ')';
    }
}
