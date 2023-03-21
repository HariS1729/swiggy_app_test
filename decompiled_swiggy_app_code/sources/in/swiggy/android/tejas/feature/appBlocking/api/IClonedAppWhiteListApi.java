package in.swiggy.android.tejas.feature.appBlocking.api;

import com.swiggy.tns.duplix.v1.WhitelistClonedUserApiProto;
import in.swiggy.android.tejas.network.utils.ProtoApi;
import kotlinx.coroutines.flow.d;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: IClonedAppWhiteListApi.kt */
public interface IClonedAppWhiteListApi {
    @POST("/api/v1/cloned-user/whitelist")
    @ProtoApi
    d<Response<WhitelistClonedUserApiProto.WhitelistClonedUserResponse>> requestForWhiteList(@Body WhitelistClonedUserApiProto.WhitelistClonedUserRequest whitelistClonedUserRequest);
}
