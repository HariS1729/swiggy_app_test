package a20;

import in.swiggy.android.feature.cafe.corporatelisting.CorporateListingControllerViewModel;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.oldapi.SwiggyDataHandler;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements SwiggyDataHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CorporateListingControllerViewModel f982a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f983b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f984c;

    public /* synthetic */ j(CorporateListingControllerViewModel corporateListingControllerViewModel, String str, String str2) {
        this.f982a = corporateListingControllerViewModel;
        this.f983b = str;
        this.f984c = str2;
    }

    public final void handle(Object obj) {
        CorporateListingControllerViewModel.q3(this.f982a, this.f983b, this.f984c, (SwiggyApiResponse) obj);
    }
}
