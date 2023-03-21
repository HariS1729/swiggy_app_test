package a20;

import in.swiggy.android.feature.cafe.corporatelisting.CorporateListingControllerViewModel;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.oldapi.SwiggyDataHandler;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements SwiggyDataHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CorporateListingControllerViewModel f981a;

    public /* synthetic */ i(CorporateListingControllerViewModel corporateListingControllerViewModel) {
        this.f981a = corporateListingControllerViewModel;
    }

    public final void handle(Object obj) {
        CorporateListingControllerViewModel.r3(this.f981a, (SwiggyApiResponse) obj);
    }
}
