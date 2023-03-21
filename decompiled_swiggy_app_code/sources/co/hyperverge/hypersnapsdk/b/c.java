package co.hyperverge.hypersnapsdk.b;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: MixpanelConfig */
public class c implements Serializable {
    @SerializedName("events")

    /* renamed from: a  reason: collision with root package name */
    private d f13319a = new d();
    @SerializedName("token")

    /* renamed from: b  reason: collision with root package name */
    private String f13320b = "1860963185fe7a53c60d5c534d3b9fb6";

    public d a() {
        return this.f13319a;
    }

    public void b(d dVar) {
        this.f13319a = dVar;
    }

    public void c(String str) {
        this.f13320b = str;
    }

    /* access modifiers changed from: protected */
    public boolean d(Object obj) {
        return obj instanceof c;
    }

    public String e() {
        return this.f13320b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!cVar.d(this)) {
            return false;
        }
        d a11 = a();
        d a12 = cVar.a();
        if (a11 != null ? !a11.equals(a12) : a12 != null) {
            return false;
        }
        String e11 = e();
        String e12 = cVar.e();
        return e11 != null ? e11.equals(e12) : e12 == null;
    }

    public int hashCode() {
        d a11 = a();
        int i11 = 43;
        int hashCode = a11 == null ? 43 : a11.hashCode();
        String e11 = e();
        int i12 = (hashCode + 59) * 59;
        if (e11 != null) {
            i11 = e11.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        return "MixpanelConfig(mixpanelEvents=" + a() + ", mixpanelToken=" + e() + ")";
    }
}
