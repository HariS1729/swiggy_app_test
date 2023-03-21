package in.swiggy.android.tejas.api.models;

import com.google.gson.annotations.SerializedName;

/* compiled from: SwiggyApiRawResponse.kt */
public final class SwiggyApiRawResponse<T> extends SwiggyBaseResponse {
    @SerializedName("rawResponse")
    private final T data;

    public final T getData() {
        return this.data;
    }
}
