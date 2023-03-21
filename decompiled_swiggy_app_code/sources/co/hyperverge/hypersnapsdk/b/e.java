package co.hyperverge.hypersnapsdk.b;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: RemoteConfig */
public class e implements Serializable {
    @SerializedName("use_branding")

    /* renamed from: a  reason: collision with root package name */
    private boolean f13330a = true;
    @SerializedName("mixpanelConfig")

    /* renamed from: b  reason: collision with root package name */
    private c f13331b = new c();
    @SerializedName("useIpToGeo")

    /* renamed from: c  reason: collision with root package name */
    private boolean f13332c = false;

    public c a() {
        return this.f13331b;
    }

    public void b(c cVar) {
        this.f13331b = cVar;
    }

    public void c(boolean z11) {
        this.f13330a = z11;
    }

    /* access modifiers changed from: protected */
    public boolean d(Object obj) {
        return obj instanceof e;
    }

    public boolean e() {
        return this.f13330a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!eVar.d(this) || e() != eVar.e() || g() != eVar.g()) {
            return false;
        }
        c a11 = a();
        c a12 = eVar.a();
        return a11 != null ? a11.equals(a12) : a12 == null;
    }

    public boolean g() {
        return this.f13332c;
    }

    public int hashCode() {
        int i11 = 79;
        int i12 = ((e() ? 79 : 97) + 59) * 59;
        if (!g()) {
            i11 = 97;
        }
        int i13 = i12 + i11;
        c a11 = a();
        return (i13 * 59) + (a11 == null ? 43 : a11.hashCode());
    }

    public String toString() {
        return "RemoteConfig(useBranding=" + e() + ", mixpanelConfig=" + a() + ", useIpToGeo=" + g() + ")";
    }
}
