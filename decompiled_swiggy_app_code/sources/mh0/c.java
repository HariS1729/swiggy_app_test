package mh0;

import kotlin.jvm.internal.p;

/* compiled from: LaunchMenuFromRestIdPayload.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f19774a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f19775b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19776c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19777d;

    public c(String str, boolean z11, String str2, String str3) {
        p.j(str, "restId");
        this.f19774a = str;
        this.f19775b = z11;
        this.f19776c = str2;
        this.f19777d = str3;
    }

    public final String a() {
        return this.f19776c;
    }

    public final boolean b() {
        return this.f19775b;
    }

    public final String c() {
        return this.f19774a;
    }

    public final String d() {
        return this.f19777d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p.e(this.f19774a, cVar.f19774a) && this.f19775b == cVar.f19775b && p.e(this.f19776c, cVar.f19776c) && p.e(this.f19777d, cVar.f19777d);
    }

    public int hashCode() {
        int hashCode = this.f19774a.hashCode() * 31;
        boolean z11 = this.f19775b;
        if (z11) {
            z11 = true;
        }
        int i11 = (hashCode + (z11 ? 1 : 0)) * 31;
        String str = this.f19776c;
        int i12 = 0;
        int hashCode2 = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19777d;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return hashCode2 + i12;
    }

    public String toString() {
        return "LaunchMenuFromRestIdPayload(restId=" + this.f19774a + ", refreshPage=" + this.f19775b + ", query=" + this.f19776c + ", source=" + this.f19777d + ')';
    }
}
