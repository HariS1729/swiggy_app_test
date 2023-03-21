package n1;

import bp0.c;
import kotlin.jvm.internal.p;

/* compiled from: SemanticsProperties.kt */
public final class a<T extends c<? extends Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    private final String f15759a;

    /* renamed from: b  reason: collision with root package name */
    private final T f15760b;

    public a(String str, T t) {
        this.f15759a = str;
        this.f15760b = t;
    }

    public final T a() {
        return this.f15760b;
    }

    public final String b() {
        return this.f15759a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p.e(this.f15759a, aVar.f15759a) && p.e(this.f15760b, aVar.f15760b);
    }

    public int hashCode() {
        String str = this.f15759a;
        int i11 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        T t = this.f15760b;
        if (t != null) {
            i11 = t.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f15759a + ", action=" + this.f15760b + ')';
    }
}
