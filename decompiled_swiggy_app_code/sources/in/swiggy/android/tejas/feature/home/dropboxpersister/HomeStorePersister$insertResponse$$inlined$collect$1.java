package in.swiggy.android.tejas.feature.home.dropboxpersister;

import android.content.SharedPreferences;
import bp0.k;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.dropboxStore.DropboxGsonUtils;
import in.swiggy.android.tejas.feature.dropboxStore.models.home.HomeStoreResponse;
import in.swiggy.android.tejas.feature.dropboxStore.models.home.StoreTTL;
import in.swiggy.android.tejas.feature.home.model.HomeResponse;
import in.swiggy.android.tejas.feature.home.model.configs.HomeRequestParams;
import js.a;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.e;

@Instrumented
/* compiled from: Collect.kt */
public final class HomeStorePersister$insertResponse$$inlined$collect$1 implements e<Response<? extends HomeResponse>> {
    final /* synthetic */ HomeRequestParams $key$inlined;
    final /* synthetic */ HomeStorePersister this$0;

    public HomeStorePersister$insertResponse$$inlined$collect$1(HomeRequestParams homeRequestParams, HomeStorePersister homeStorePersister) {
        this.$key$inlined = homeRequestParams;
        this.this$0 = homeStorePersister;
    }

    public Object emit(Response<? extends HomeResponse> response, c<? super k> cVar) {
        HomeStoreResponse homeStoreResponse;
        Response response2 = response;
        if (response2 instanceof Response.Success) {
            homeStoreResponse = new HomeStoreResponse((HomeResponse) ((Response.Success) response2).getResponse(), (Error) null, new StoreTTL(System.currentTimeMillis(), this.$key$inlined.getTtl()));
        } else if (response2 instanceof Response.Failure) {
            homeStoreResponse = new HomeStoreResponse((HomeResponse) null, ((Response.Failure) response2).getError(), new StoreTTL(System.currentTimeMillis(), this.$key$inlined.getTtl()));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        SharedPreferences access$getSharedPreferences$p = this.this$0.sharedPreferences;
        String access$getFormattedKey = this.this$0.getFormattedKey(this.$key$inlined);
        Gson homeGson = DropboxGsonUtils.INSTANCE.getHomeGson();
        a.b(access$getSharedPreferences$p, access$getFormattedKey, !(homeGson instanceof Gson) ? homeGson.toJson((Object) homeStoreResponse) : GsonInstrumentation.toJson(homeGson, (Object) homeStoreResponse));
        return k.f22762a;
    }
}
