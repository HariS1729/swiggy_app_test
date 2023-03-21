package in.swiggy.android.tejas.api.models;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ResponseFetchingError.kt */
public final class ResponseFetchingError {
    public static final ResponseFetchingError INSTANCE = new ResponseFetchingError();
    public static final String UNKNOWN = "UNKNOWN";

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: ResponseFetchingError.kt */
    public @interface MODE {
    }

    private ResponseFetchingError() {
    }
}
