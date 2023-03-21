package ef0;

import ff0.a;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import in.swiggy.android.tejas.oldapi.models.listing.FilterGroup;
import in.swiggy.android.tejas.oldapi.models.listing.SortOption;
import in.swiggy.android.tejas.oldapi.network.responses.RestaurantListResponseDataV2;
import io.reactivex.processors.PublishProcessor;
import java.util.List;

/* compiled from: ISortFilterContext */
public interface d {
    List<FilterGroup> a();

    void b(List<FilterGroup> list);

    void c(List<SortOption> list);

    boolean d();

    List<SortOption> e();

    ListingResponse f();

    boolean g();

    PublishProcessor<a.C0221a> h();

    void i(ListingResponse listingResponse);

    void j(RestaurantListResponseDataV2 restaurantListResponseDataV2);

    PublishProcessor<Boolean> k();

    void l();

    RestaurantListResponseDataV2 m();

    void n();
}
