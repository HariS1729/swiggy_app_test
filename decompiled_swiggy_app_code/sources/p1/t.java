package p1;

import kotlin.jvm.internal.p;

/* compiled from: AndroidTextStyle.android.kt */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final r f16170a;

    /* renamed from: b  reason: collision with root package name */
    private final q f16171b;

    public t(r rVar, q qVar) {
        this.f16170a = rVar;
        this.f16171b = qVar;
    }

    public final q a() {
        return this.f16171b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p.e(this.f16171b, tVar.f16171b) && p.e(this.f16170a, tVar.f16170a);
    }

    public int hashCode() {
        r rVar = this.f16170a;
        int i11 = 0;
        int hashCode = (rVar != null ? rVar.hashCode() : 0) * 31;
        q qVar = this.f16171b;
        if (qVar != null) {
            i11 = qVar.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f16170a + ", paragraphSyle=" + this.f16171b + ')';
    }
}
