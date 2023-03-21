package in.swiggy.android.tejas.feature.auth;

import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowUseCase;
import in.swiggy.android.tejas.feature.auth.models.OtpVerifyData;
import in.swiggy.android.tejas.feature.auth.repository.LoginRepository;
import in.swiggy.android.tejas.oldapi.network.responses.UserResponseData;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.d;

/* compiled from: OtpVerifyUseCase.kt */
public final class OtpVerifyUseCase extends FlowUseCase<OtpVerifyData, SwiggyApiResponse<UserResponseData>> {
    private final LoginRepository loginRepo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpVerifyUseCase(LoginRepository loginRepository) {
        super((CoroutineDispatcher) null, 1, (i) null);
        p.j(loginRepository, "loginRepo");
        this.loginRepo = loginRepository;
    }

    /* access modifiers changed from: protected */
    public d<Response<SwiggyApiResponse<UserResponseData>>> execute(OtpVerifyData otpVerifyData) {
        p.j(otpVerifyData, "parameters");
        return this.loginRepo.verifyOtp(otpVerifyData);
    }
}
