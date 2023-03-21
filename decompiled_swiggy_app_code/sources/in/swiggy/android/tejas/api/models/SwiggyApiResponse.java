package in.swiggy.android.tejas.api.models;

import com.google.gson.annotations.SerializedName;

/* compiled from: SwiggyApiResponse.kt */
public final class SwiggyApiResponse<T> extends SwiggyBaseResponse {
    @SerializedName("data")
    private final T data;

    public SwiggyApiResponse(Integer num, Integer num2, String str, String str2, String str3, String str4, T t) {
        super(num, num2, str, str2, str3, str4);
        this.data = t;
    }

    public final T getData() {
        return this.data;
    }

    public SwiggyApiResponse(Integer num, String str, T t) {
        super(num, str);
        this.data = t;
    }

    public SwiggyApiResponse(T t) {
        this.data = t;
    }

    public SwiggyApiResponse() {
        this.data = null;
    }
}
