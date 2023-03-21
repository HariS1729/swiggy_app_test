package in.swiggy.android.tejas.feature.feedback;

import in.swiggy.android.tejas.IDashAPI;
import javax.inject.Provider;
import qq.e;

public final class FeedbackManager_Factory implements e<FeedbackManager> {
    private final Provider<IDashAPI> dashAPIProvider;

    public FeedbackManager_Factory(Provider<IDashAPI> provider) {
        this.dashAPIProvider = provider;
    }

    public static FeedbackManager_Factory create(Provider<IDashAPI> provider) {
        return new FeedbackManager_Factory(provider);
    }

    public static FeedbackManager newInstance(IDashAPI iDashAPI) {
        return new FeedbackManager(iDashAPI);
    }

    public FeedbackManager get() {
        return newInstance(this.dashAPIProvider.get());
    }
}
