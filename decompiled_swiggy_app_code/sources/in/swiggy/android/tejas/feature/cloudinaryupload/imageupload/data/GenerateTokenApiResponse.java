package in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: GenerateTokenApiResponse.kt */
public final class GenerateTokenApiResponse {
    @SerializedName("data")
    private final String token;

    public GenerateTokenApiResponse(String str) {
        p.j(str, "token");
        this.token = str;
    }

    public static /* synthetic */ GenerateTokenApiResponse copy$default(GenerateTokenApiResponse generateTokenApiResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = generateTokenApiResponse.token;
        }
        return generateTokenApiResponse.copy(str);
    }

    public final String component1() {
        return this.token;
    }

    public final GenerateTokenApiResponse copy(String str) {
        p.j(str, "token");
        return new GenerateTokenApiResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenerateTokenApiResponse) && p.e(this.token, ((GenerateTokenApiResponse) obj).token);
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    public String toString() {
        return "GenerateTokenApiResponse(token=" + this.token + ')';
    }
}
