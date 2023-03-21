package u5;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* compiled from: FeatureConfigResponse */
public class b {
    @SerializedName("features")

    /* renamed from: a  reason: collision with root package name */
    private List<a> f17007a;

    public List<a> a() {
        return this.f17007a;
    }

    /* access modifiers changed from: protected */
    public boolean b(Object obj) {
        return obj instanceof b;
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
        List<a> a11 = a();
        List<a> a12 = bVar.a();
        return a11 != null ? a11.equals(a12) : a12 == null;
    }

    public int hashCode() {
        List<a> a11 = a();
        return (a11 == null ? 43 : a11.hashCode()) + 59;
    }

    public String toString() {
        return "FeatureConfigResponse(features=" + a() + ")";
    }
}
