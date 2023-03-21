package in.swiggy.android.tejas.feature.discovery.pageskeleton.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: SkeletonJsonResponse.kt */
public final class Cta {
    @SerializedName("link")
    private final String link;
    @SerializedName("type")
    private final String type;

    public Cta(String str, String str2) {
        p.j(str, "link");
        p.j(str2, "type");
        this.link = str;
        this.type = str2;
    }

    public static /* synthetic */ Cta copy$default(Cta cta, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cta.link;
        }
        if ((i11 & 2) != 0) {
            str2 = cta.type;
        }
        return cta.copy(str, str2);
    }

    public final String component1() {
        return this.link;
    }

    public final String component2() {
        return this.type;
    }

    public final Cta copy(String str, String str2) {
        p.j(str, "link");
        p.j(str2, "type");
        return new Cta(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cta)) {
            return false;
        }
        Cta cta = (Cta) obj;
        return p.e(this.link, cta.link) && p.e(this.type, cta.type);
    }

    public final String getLink() {
        return this.link;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.link.hashCode() * 31) + this.type.hashCode();
    }

    public String toString() {
        return "Cta(link=" + this.link + ", type=" + this.type + ')';
    }
}
