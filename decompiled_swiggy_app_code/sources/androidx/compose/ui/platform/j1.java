package androidx.compose.ui.platform;

import kotlin.jvm.internal.p;

/* compiled from: InspectableValue.kt */
public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f7314a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f7315b;

    public j1(String str, Object obj) {
        p.j(str, "name");
        this.f7314a = str;
        this.f7315b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return p.e(this.f7314a, j1Var.f7314a) && p.e(this.f7315b, j1Var.f7315b);
    }

    public int hashCode() {
        int hashCode = this.f7314a.hashCode() * 31;
        Object obj = this.f7315b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ValueElement(name=" + this.f7314a + ", value=" + this.f7315b + ')';
    }
}
