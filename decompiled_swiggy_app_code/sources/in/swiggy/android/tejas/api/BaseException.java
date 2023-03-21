package in.swiggy.android.tejas.api;

import androidx.core.util.d;

public abstract class BaseException extends Exception {
    public int errorCode;
    private final String errorMessage;
    protected final String errorTitle;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    protected BaseException(d<String, String> dVar) {
        this(dVar == null ? null : (String) dVar.f9416a, dVar != null ? (String) dVar.f9417b : null);
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public abstract String getErrorTitle();

    public void setErrorCode(int i11) {
        this.errorCode = i11;
    }

    private BaseException(String str, String str2) {
        this.errorTitle = str;
        this.errorMessage = str2;
    }
}
