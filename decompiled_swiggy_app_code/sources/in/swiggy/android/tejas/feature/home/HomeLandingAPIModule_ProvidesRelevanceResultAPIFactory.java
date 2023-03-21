package in.swiggy.android.tejas.feature.home;

import in.swiggy.android.tejas.feature.relevance.IRelevanceResultsAPI;
import in.swiggy.android.tejas.feature.relevance.RelevanceResultsAPI;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class HomeLandingAPIModule_ProvidesRelevanceResultAPIFactory implements e<IRelevanceResultsAPI> {
    private final Provider<RelevanceResultsAPI> relevanceResultsAPIProvider;

    public HomeLandingAPIModule_ProvidesRelevanceResultAPIFactory(Provider<RelevanceResultsAPI> provider) {
        this.relevanceResultsAPIProvider = provider;
    }

    public static HomeLandingAPIModule_ProvidesRelevanceResultAPIFactory create(Provider<RelevanceResultsAPI> provider) {
        return new HomeLandingAPIModule_ProvidesRelevanceResultAPIFactory(provider);
    }

    public static IRelevanceResultsAPI providesRelevanceResultAPI(RelevanceResultsAPI relevanceResultsAPI) {
        return (IRelevanceResultsAPI) i.e(HomeLandingAPIModule.providesRelevanceResultAPI(relevanceResultsAPI));
    }

    public IRelevanceResultsAPI get() {
        return providesRelevanceResultAPI(this.relevanceResultsAPIProvider.get());
    }
}
