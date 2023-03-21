package a90;

import go0.h;
import in.swiggy.android.feature.search.suggestions.SearchSuggestionsViewModel;
import in.swiggy.android.tejas.feature.search.models.network.response.suggestions.SearchSuggestionResponse;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchSuggestionsViewModel f1003a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f1004b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f1005c;

    public /* synthetic */ f(SearchSuggestionsViewModel searchSuggestionsViewModel, String str, String str2) {
        this.f1003a = searchSuggestionsViewModel;
        this.f1004b = str;
        this.f1005c = str2;
    }

    public final Object apply(Object obj) {
        return SearchSuggestionsViewModel.V2(this.f1003a, this.f1004b, this.f1005c, (SearchSuggestionResponse) obj);
    }
}
