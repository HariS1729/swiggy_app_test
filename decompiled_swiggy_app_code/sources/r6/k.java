package r6;

import coil.decode.DataSource;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: FetchResult.kt */
public final class k extends g {

    /* renamed from: a  reason: collision with root package name */
    private final o6.k f16499a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16500b;

    /* renamed from: c  reason: collision with root package name */
    private final DataSource f16501c;

    public k(o6.k kVar, String str, DataSource dataSource) {
        super((i) null);
        this.f16499a = kVar;
        this.f16500b = str;
        this.f16501c = dataSource;
    }

    public final DataSource a() {
        return this.f16501c;
    }

    public final o6.k b() {
        return this.f16499a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (!p.e(this.f16499a, kVar.f16499a) || !p.e(this.f16500b, kVar.f16500b) || this.f16501c != kVar.f16501c) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f16499a.hashCode() * 31;
        String str = this.f16500b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f16501c.hashCode();
    }
}
