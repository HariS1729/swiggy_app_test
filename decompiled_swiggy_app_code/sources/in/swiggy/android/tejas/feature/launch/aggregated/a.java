package in.swiggy.android.tejas.feature.launch.aggregated;

import go0.g;
import in.swiggy.android.tejas.oldapi.SwiggyBaseResponseHandler;
import in.swiggy.android.tejas.oldapi.network.responses.handlers.LaunchResponseHandler;
import in.swiggy.android.tejas.oldapi.network.responses.handlers.UserResponseHandler;
import retrofit2.Response;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LaunchResponseHandler f20256a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SwiggyBaseResponseHandler f20257b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ UserResponseHandler f20258c;

    public /* synthetic */ a(LaunchResponseHandler launchResponseHandler, SwiggyBaseResponseHandler swiggyBaseResponseHandler, UserResponseHandler userResponseHandler) {
        this.f20256a = launchResponseHandler;
        this.f20257b = swiggyBaseResponseHandler;
        this.f20258c = userResponseHandler;
    }

    public final void accept(Object obj) {
        AggregatedLaunchManager.m27fireAggregatedLaunchApi$lambda1(this.f20256a, this.f20257b, this.f20258c, (Response) obj);
    }
}
