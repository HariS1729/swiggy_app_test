package in.swiggy.android.swiggylynx.model;

import kotlin.jvm.internal.p;

/* compiled from: RequestWrapper.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f18968a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18969b;

    public b(String str, String str2) {
        p.j(str, "portalRequestId");
        p.j(str2, "jpRequestId");
        this.f18968a = str;
        this.f18969b = str2;
    }

    public final String a() {
        return this.f18969b;
    }

    public final String b() {
        return this.f18968a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p.e(this.f18968a, bVar.f18968a) && p.e(this.f18969b, bVar.f18969b);
    }

    public int hashCode() {
        return (this.f18968a.hashCode() * 31) + this.f18969b.hashCode();
    }

    public String toString() {
        return "RequestWrapper(portalRequestId=" + this.f18968a + ", jpRequestId=" + this.f18969b + ')';
    }
}
