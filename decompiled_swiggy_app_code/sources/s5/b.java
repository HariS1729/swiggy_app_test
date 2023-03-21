package s5;

import com.google.gson.annotations.SerializedName;

/* compiled from: MixPanelErrorResponse */
public class b {
    @SerializedName("error")

    /* renamed from: a  reason: collision with root package name */
    private String f16654a;
    @SerializedName("status")

    /* renamed from: b  reason: collision with root package name */
    private String f16655b;

    public String a() {
        return this.f16654a;
    }

    /* access modifiers changed from: protected */
    public boolean b(Object obj) {
        return obj instanceof b;
    }

    public String c() {
        return this.f16655b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!bVar.b(this)) {
            return false;
        }
        String a11 = a();
        String a12 = bVar.a();
        if (a11 != null ? !a11.equals(a12) : a12 != null) {
            return false;
        }
        String c11 = c();
        String c12 = bVar.c();
        return c11 != null ? c11.equals(c12) : c12 == null;
    }

    public int hashCode() {
        String a11 = a();
        int i11 = 43;
        int hashCode = a11 == null ? 43 : a11.hashCode();
        String c11 = c();
        int i12 = (hashCode + 59) * 59;
        if (c11 != null) {
            i11 = c11.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        return "MixPanelErrorResponse(error=" + a() + ", status=" + c() + ")";
    }
}
