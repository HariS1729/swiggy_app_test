package in.swiggy.android.tejas.api;

import in.swiggy.android.tejas.api.models.SwiggyBaseResponse;

public class SwiggyLegacyApiErrorChecker implements IErrorChecker<SwiggyBaseResponse> {
    public boolean shouldCheckForErrors(SwiggyBaseResponse swiggyBaseResponse) {
        return swiggyBaseResponse.getStatusCode().intValue() != 0;
    }
}
