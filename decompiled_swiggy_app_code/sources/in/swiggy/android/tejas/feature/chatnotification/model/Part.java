package in.swiggy.android.tejas.feature.chatnotification.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: ChatNotificationRequestBody.kt */
public final class Part {
    @SerializedName("body")
    private final Body body;
    @SerializedName("type")
    private final String type;

    public Part(String str, Body body2) {
        p.j(body2, "body");
        this.type = str;
        this.body = body2;
    }

    public static /* synthetic */ Part copy$default(Part part, String str, Body body2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = part.type;
        }
        if ((i11 & 2) != 0) {
            body2 = part.body;
        }
        return part.copy(str, body2);
    }

    public final String component1() {
        return this.type;
    }

    public final Body component2() {
        return this.body;
    }

    public final Part copy(String str, Body body2) {
        p.j(body2, "body");
        return new Part(str, body2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Part)) {
            return false;
        }
        Part part = (Part) obj;
        return p.e(this.type, part.type) && p.e(this.body, part.body);
    }

    public final Body getBody() {
        return this.body;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.body.hashCode();
    }

    public String toString() {
        return "Part(type=" + this.type + ", body=" + this.body + ')';
    }
}
