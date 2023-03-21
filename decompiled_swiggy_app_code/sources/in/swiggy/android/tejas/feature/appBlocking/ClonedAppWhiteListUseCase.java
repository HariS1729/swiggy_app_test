package in.swiggy.android.tejas.feature.appBlocking;

import com.swiggy.tns.duplix.v1.WhitelistClonedUserApiProto;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.coroutineUtils.FlowUseCase;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.d;

/* compiled from: ClonedAppWhiteListUseCase.kt */
public final class ClonedAppWhiteListUseCase extends FlowUseCase<WhitelistClonedUserApiProto.WhitelistClonedUserRequest, WhitelistClonedUserApiProto.WhitelistClonedUserResponse> {
    private final AppBlockingRepository repository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClonedAppWhiteListUseCase(AppBlockingRepository appBlockingRepository) {
        super((CoroutineDispatcher) null, 1, (i) null);
        p.j(appBlockingRepository, "repository");
        this.repository = appBlockingRepository;
    }

    /* access modifiers changed from: protected */
    public d<Response<WhitelistClonedUserApiProto.WhitelistClonedUserResponse>> execute(WhitelistClonedUserApiProto.WhitelistClonedUserRequest whitelistClonedUserRequest) {
        p.j(whitelistClonedUserRequest, "parameters");
        return this.repository.requestForWhiteList(whitelistClonedUserRequest);
    }
}
