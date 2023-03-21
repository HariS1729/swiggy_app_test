package in.swiggy.android.tejas.api;

import androidx.core.util.d;
import retrofit2.Response;

public class Errors {
    private static final String KEY_EMPTY_RESPONSE_VALUE = "KEY_EMPTY_RESPONSE_VALUE";
    private static final String KEY_ERROR_RE_AUTH = "KEY_ERROR_RE_AUTH";
    private static final String KEY_NO_CONTENT = "KEY_NO_CONTENT";
    private static final d<String, String> sNullPair = d.a(null, null);

    public static d<String, String> findFirstErrorCodeAndParam(Response<?> response) {
        if (response.code() == 204) {
            return d.a(KEY_EMPTY_RESPONSE_VALUE, null);
        }
        if (response.code() == 401) {
            return d.a(KEY_ERROR_RE_AUTH, null);
        }
        return sNullPair;
    }

    public static d<String, String> handleNoContent() {
        return d.a(KEY_NO_CONTENT, null);
    }
}
