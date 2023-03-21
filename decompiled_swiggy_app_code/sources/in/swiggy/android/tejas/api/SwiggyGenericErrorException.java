package in.swiggy.android.tejas.api;

import androidx.core.util.d;
import in.swiggy.android.tejas.api.models.ResponseFetchingError;

public class SwiggyGenericErrorException extends BaseException {
    public SwiggyGenericErrorException(d<String, String> dVar) {
        super(dVar);
    }

    public String getErrorTitle() {
        String str = this.errorTitle;
        return str == null ? ResponseFetchingError.UNKNOWN : str;
    }
}
