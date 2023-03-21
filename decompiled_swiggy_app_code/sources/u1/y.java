package u1;

import kotlin.jvm.internal.p;

/* compiled from: FontFamily.kt */
public final class y extends i {

    /* renamed from: h  reason: collision with root package name */
    private final j0 f16967h;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && p.e(this.f16967h, ((y) obj).f16967h);
    }

    public final j0 f() {
        return this.f16967h;
    }

    public int hashCode() {
        return this.f16967h.hashCode();
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.f16967h + ')';
    }
}
