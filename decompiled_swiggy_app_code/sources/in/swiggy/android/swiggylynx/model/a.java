package in.swiggy.android.swiggylynx.model;

import kotlin.jvm.internal.p;

/* compiled from: HeaderModel.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f18966a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18967b;

    public a(String str, String str2) {
        p.j(str, "locationAnnotation");
        p.j(str2, "locationDisplayableName");
        this.f18966a = str;
        this.f18967b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p.e(this.f18966a, aVar.f18966a) && p.e(this.f18967b, aVar.f18967b);
    }

    public int hashCode() {
        return (this.f18966a.hashCode() * 31) + this.f18967b.hashCode();
    }

    public String toString() {
        return "HeaderModel(locationAnnotation=" + this.f18966a + ", locationDisplayableName=" + this.f18967b + ')';
    }
}
