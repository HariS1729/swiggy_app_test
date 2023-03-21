package in.swiggy.android.tejas.feature.appBlocking;

import com.swiggy.tns.duplix.v1.WhitelistClonedUserApiProto;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.ResponseTransformerManager;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.coroutineUtils.FlowErrorTransformer;
import in.swiggy.android.tejas.coroutineUtils.FlowExceptionTransformer;
import in.swiggy.android.tejas.coroutineUtils.FlowModelTransformer;
import in.swiggy.android.tejas.feature.appBlocking.api.IClonedAppWhiteListApi;
import in.swiggy.android.tejas.feature.appBlocking.api.IClonedAppWhitelistJsonApi;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import os.a;

/* compiled from: AppBlockingRepository.kt */
public final class AppBlockingRepository {
    private final IClonedAppWhitelistJsonApi api;

    public AppBlockingRepository(a aVar, IClonedAppWhiteListApi iClonedAppWhiteListApi, IClonedAppWhitelistJsonApi iClonedAppWhitelistJsonApi) {
        p.j(aVar, "appBuildDetails");
        p.j(iClonedAppWhiteListApi, "protoApi");
        p.j(iClonedAppWhitelistJsonApi, "jsonApi");
        this.api = iClonedAppWhitelistJsonApi;
    }

    public final d<Response<WhitelistClonedUserApiProto.WhitelistClonedUserResponse>> requestForWhiteList(WhitelistClonedUserApiProto.WhitelistClonedUserRequest whitelistClonedUserRequest) {
        p.j(whitelistClonedUserRequest, "requestBody");
        return ResponseTransformerManager.buildResponse$default(ResponseTransformerManager.INSTANCE, this.api.requestForWhiteList(whitelistClonedUserRequest), false, (IErrorChecker) null, (FlowModelTransformer) null, (FlowErrorTransformer) null, (FlowExceptionTransformer) null, 62, (Object) null);
    }
}
