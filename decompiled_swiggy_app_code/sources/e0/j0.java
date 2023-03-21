package e0;

import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.jvm.internal.p;

/* compiled from: OpaqueKey.kt */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f14207a;

    public j0(String str) {
        p.j(str, HttpRequest.HEADER_KEY);
        this.f14207a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && p.e(this.f14207a, ((j0) obj).f14207a);
    }

    public int hashCode() {
        return this.f14207a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f14207a + ')';
    }
}
