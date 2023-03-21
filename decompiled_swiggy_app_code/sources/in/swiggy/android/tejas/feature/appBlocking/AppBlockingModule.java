package in.swiggy.android.tejas.feature.appBlocking;

import in.swiggy.android.tejas.feature.appBlocking.api.IClonedAppWhiteListApi;
import in.swiggy.android.tejas.feature.appBlocking.api.IClonedAppWhitelistJsonApi;
import kotlin.jvm.internal.p;
import retrofit2.Retrofit;

/* compiled from: AppBlockingModule.kt */
public interface AppBlockingModule {
    public static final Apis Apis = Apis.$$INSTANCE;

    /* compiled from: AppBlockingModule.kt */
    public static final class Apis {
        static final /* synthetic */ Apis $$INSTANCE = new Apis();

        private Apis() {
        }

        public final IClonedAppWhitelistJsonApi providesClonedAppWhiteListJsonApi(@ClonedAppWhiteListApi Retrofit retrofit) {
            p.j(retrofit, "retrofit");
            return (IClonedAppWhitelistJsonApi) retrofit.create(IClonedAppWhitelistJsonApi.class);
        }

        public final IClonedAppWhiteListApi providesClonedAppWhiteListProtoApi(@ClonedAppWhiteListApi Retrofit retrofit) {
            p.j(retrofit, "retrofit");
            return (IClonedAppWhiteListApi) retrofit.create(IClonedAppWhiteListApi.class);
        }
    }
}
