package n1;

import kotlin.jvm.internal.p;
import lp0.a;

/* compiled from: SemanticsProperties.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f15767a;

    /* renamed from: b  reason: collision with root package name */
    private final a<Boolean> f15768b;

    public final a<Boolean> a() {
        return this.f15768b;
    }

    public final String b() {
        return this.f15767a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p.e(this.f15767a, dVar.f15767a) && p.e(this.f15768b, dVar.f15768b);
    }

    public int hashCode() {
        return (this.f15767a.hashCode() * 31) + this.f15768b.hashCode();
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.f15767a + ", action=" + this.f15768b + ')';
    }
}
