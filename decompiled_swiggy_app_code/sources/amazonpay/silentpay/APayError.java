package amazonpay.silentpay;

import amazonpay.silentpay.i;
import android.content.Intent;
import com.amazon.identity.auth.device.AuthError;

public class APayError extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private ErrorType f1118a;

    /* renamed from: b  reason: collision with root package name */
    private AuthError f1119b;

    public enum ErrorType {
        AUTH_ERROR,
        APAY_ERROR,
        APAY_SERVICE_ERROR,
        NETWORK_ERROR,
        INVALID_RESPONSE,
        LOW_MEMORY
    }

    APayError(ErrorType errorType, String str) {
        super(str);
        this.f1118a = errorType;
    }

    private static AuthError a(Intent intent) {
        if (intent.getExtras().containsKey("ERROR_CAUSE")) {
            return new AuthError(intent.getExtras().getString("ERROR_MESSAGE"), (Throwable) intent.getExtras().getSerializable("ERROR_CAUSE"), (AuthError.ERROR_TYPE) intent.getExtras().getSerializable("AUTH_ERROR_TYPE"));
        }
        return new AuthError(intent.getExtras().getString("ERROR_MESSAGE"), (AuthError.ERROR_TYPE) intent.getExtras().getSerializable("AUTH_ERROR_TYPE"));
    }

    public static APayError b(Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            if (intent.getExtras() == null) {
                return null;
            }
            for (ErrorType errorType : ErrorType.values()) {
                if (intent.getExtras().containsKey(errorType.name())) {
                    ErrorType errorType2 = ErrorType.AUTH_ERROR;
                    if (errorType == errorType2 && intent.getExtras().containsKey("AUTH_ERROR_TYPE")) {
                        return new APayError(errorType2, a(intent));
                    }
                    if (intent.getExtras().containsKey("ERROR_MESSAGE") && intent.getExtras().containsKey("ERROR_CAUSE")) {
                        return new APayError(errorType, intent.getExtras().getString("ERROR_MESSAGE"), (Throwable) intent.getExtras().getSerializable("ERROR_CAUSE"));
                    }
                    if (intent.getExtras().containsKey("ERROR_MESSAGE")) {
                        return new APayError(errorType, intent.getExtras().getString("ERROR_MESSAGE"));
                    }
                }
            }
            return null;
        } catch (Exception e11) {
            j.g("APayError", "Error parsing Apay Error", e11);
            n.d(i.a.AUTHORIZE_RESPONSE_PARSING_FAILED);
            return new APayError(ErrorType.APAY_ERROR, "Error parsing Apay Error", e11);
        }
    }

    public ErrorType c() {
        return this.f1118a;
    }

    APayError(ErrorType errorType, String str, Throwable th2) {
        super(str, th2);
        this.f1118a = errorType;
    }

    APayError(ErrorType errorType, AuthError authError) {
        this.f1118a = errorType;
        this.f1119b = authError;
    }
}
