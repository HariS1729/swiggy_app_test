package in.swiggy.android.tejas.feature.auth.repository;

import com.swiggy.tns.duplix.v1.CloningSignalsProto;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.ResponseTransformerManager;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowErrorTransformer;
import in.swiggy.android.tejas.coroutineUtils.FlowExceptionTransformer;
import in.swiggy.android.tejas.coroutineUtils.FlowModelTransformer;
import in.swiggy.android.tejas.feature.auth.api.IOtpVerifyApi;
import in.swiggy.android.tejas.feature.auth.models.OtpVerifyCloningSignals;
import in.swiggy.android.tejas.feature.auth.models.OtpVerifyData;
import in.swiggy.android.tejas.feature.auth.models.OtpVerifyRequest;
import in.swiggy.android.tejas.oldapi.network.responses.UserResponseData;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;

/* compiled from: LoginRepoImpl.kt */
public final class LoginRepoImpl implements LoginRepository {
    private final IOtpVerifyApi otpVerifyApi;

    public LoginRepoImpl(IOtpVerifyApi iOtpVerifyApi) {
        p.j(iOtpVerifyApi, "otpVerifyApi");
        this.otpVerifyApi = iOtpVerifyApi;
    }

    private final OtpVerifyRequest getRequestBody(OtpVerifyData otpVerifyData) {
        CloningSignalsProto.CloningSignals cloningSignals = otpVerifyData.getCloningSignals();
        boolean appFilesDirPathInvalid = cloningSignals.getAppFilesDirPathInvalid();
        boolean workProfileEnabled = cloningSignals.getWorkProfileEnabled();
        boolean deviceModelVmos = cloningSignals.getDeviceModelVmos();
        boolean developerModeEnabled = cloningSignals.getDeveloperModeEnabled();
        String packageName = cloningSignals.getPackageName();
        p.i(packageName, "appCloningSignals.packageName");
        return new OtpVerifyRequest(otpVerifyData.getOtp(), new OtpVerifyCloningSignals(appFilesDirPathInvalid, workProfileEnabled, deviceModelVmos, developerModeEnabled, packageName, cloningSignals.getEmulatorStatus()));
    }

    public d<Response<SwiggyApiResponse<UserResponseData>>> verifyOtp(OtpVerifyData otpVerifyData) {
        p.j(otpVerifyData, "otpVerifyData");
        return ResponseTransformerManager.buildResponse$default(ResponseTransformerManager.INSTANCE, this.otpVerifyApi.verifyOtp(otpVerifyData.getDeviceManufacturer(), otpVerifyData.getDeviceModelName(), getRequestBody(otpVerifyData), otpVerifyData.getOtpSource()), false, (IErrorChecker) null, (FlowModelTransformer) null, (FlowErrorTransformer) null, (FlowExceptionTransformer) null, 62, (Object) null);
    }

    public d<Response<SwiggyApiResponse<UserResponseData>>> verifyOtpV3(OtpVerifyData otpVerifyData) {
        p.j(otpVerifyData, "otpVerifyData");
        return ResponseTransformerManager.buildResponse$default(ResponseTransformerManager.INSTANCE, this.otpVerifyApi.verifyOtpV3(otpVerifyData.getDeviceManufacturer(), otpVerifyData.getDeviceModelName(), getRequestBody(otpVerifyData), otpVerifyData.getOtpSource()), false, (IErrorChecker) null, (FlowModelTransformer) null, (FlowErrorTransformer) null, (FlowExceptionTransformer) null, 62, (Object) null);
    }
}
