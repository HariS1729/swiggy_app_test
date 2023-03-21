package in.swiggy.android.tejas.apiinterface;

import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.swiggypop.SwiggyPopListingResponseData;
import in.swiggy.android.tejas.oldapi.models.cafe.cafelisting.CafeListingResponseData;
import in.swiggy.android.tejas.oldapi.models.cafe.corporatelisting.AuthenticateCorporateResponseData;
import in.swiggy.android.tejas.oldapi.models.cafe.corporatelisting.CorporateListingResponseData;
import in.swiggy.android.tejas.oldapi.models.cafe.corporatelisting.PostableAuthenticateCorporate;
import in.swiggy.android.tejas.oldapi.models.locationfeatures.LocationBasedFeaturesResponseData;
import in.swiggy.android.tejas.oldapi.models.meals.Meals;
import in.swiggy.android.tejas.oldapi.models.offers.CouponListResponseData;
import in.swiggy.android.tejas.oldapi.models.offers.restaurantOffers.RestaurantOfferResponseData;
import in.swiggy.android.tejas.oldapi.models.reorder.ReorderCartTopData;
import in.swiggy.android.tejas.oldapi.models.restaurant.Restaurant;
import in.swiggy.android.tejas.oldapi.models.restaurant.RestaurantOutlets;
import in.swiggy.android.tejas.oldapi.models.superplans.SuperPlanResponseData;
import in.swiggy.android.tejas.oldapi.network.responses.PopType;
import in.swiggy.android.tejas.oldapi.network.responses.RestaurantListResponseDataV2;
import in.swiggy.android.tejas.superV2.collection.FacetPostRequest;
import java.util.List;
import retrofit2.http.Body;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Deprecated
public interface IDiscoveryApi {
    SwiggyApiResponse<AuthenticateCorporateResponseData> authenticateCorporate(@Body PostableAuthenticateCorporate postableAuthenticateCorporate);

    SwiggyApiResponse<CafeListingResponseData> getCafeListing(@Query("corporateId") String str, @Query("cafeId") String str2, @Query("corporatePasscode") String str3);

    SwiggyApiResponse<RestaurantListResponseDataV2> getCollectionListV4(@Query("lat") double d11, @Query("lng") double d12, @Query("collection") String str, @Query("favorite") boolean z11, @Query("offset") int i11, @Query("filter") List<String> list, @Query("sort") String str2, @Query("address_id") String str3, @Query("third_party_vendor") int i12, @Query("assured") int i13, @Query("long_distance") int i14);

    SwiggyApiResponse<RestaurantListResponseDataV2> getCollectionV2(@Path("id") String str, @Query("lat") double d11, @Query("lng") double d12, @Query("offset") int i11, @Query("filter") List<String> list, @Query("sort") String str2, @Query("restaurantId") String str3, @Body FacetPostRequest facetPostRequest);

    SwiggyApiResponse<CorporateListingResponseData> getCorporateListing(@Query("lat") double d11, @Query("lng") double d12);

    SwiggyApiResponse<CouponListResponseData> getCouponList(@Query("lat") double d11, @Query("lng") double d12, @Query("source_page") String str, @Query("restaurant_id") String str2, @Query("cart_value") double d13);

    SwiggyApiResponse<LocationBasedFeaturesResponseData> getLocationBasedFeatures(@Query("lat") double d11, @Query("lng") double d12, @Query("features") List<String> list);

    SwiggyApiResponse<Meals> getMealsData(@Path("meal_id") String str, @Query("itemData") boolean z11, @Query("restId") String str2);

    SwiggyApiResponse<ReorderCartTopData> getReordeData(@Query("lat") double d11, @Query("lng") double d12, @Query("start_time") Long l11, @Query("end_time") Long l12);

    SwiggyApiResponse<Restaurant> getRestaurant(@Path("restaurantId") String str, @Query("uuid") String str2, @Query("popup_banner_id") List<Integer> list, @Query("lat") double d11, @Query("lng") double d12, @Query("start_time") Long l11, @Query("end_time") Long l12, @Query("date") Long l13, @Query("corporatePasscode") String str3, @Query("takeaway") boolean z11, @Query("sld") boolean z12, @Query("tab") String str4, @Query("source") String str5, @Query("sourceRequestId") String str6, @Query("sourceSessionId") String str7);

    SwiggyApiResponse<Restaurant> getRestaurantBySlug(@Query("slug") String str, @Query("popup_banner_id") List<Integer> list);

    SwiggyApiResponse<RestaurantListResponseDataV2> getRestaurantListV4FromOffset(@Query("lat") double d11, @Query("lng") double d12, @Query("carousel") boolean z11, @Query("address_id") String str, @Query("popup_banner_id") List<Integer> list, @Query("offset") int i11, @Query("filter") List<String> list2, @Query("sort") String str2, @Query("third_party_vendor") int i12, @Query("assured") int i13, @Query("long_distance") int i14, @Query("card_seen_count") String str3, @Query("is_plan_added") boolean z12);

    SwiggyApiResponse<RestaurantOfferResponseData> getRestaurantOfferList(@Query("lat") double d11, @Query("lng") double d12, @Query("source_page") String str, @Query("offset") int i11, @Query("start_time") Long l11, @Query("end_time") Long l12);

    SwiggyApiResponse<RestaurantOutlets> getRestaurantOutlets(@Path("restaurantId") String str, @Query("lat") double d11, @Query("lng") double d12, @Query("slug") String str2, @Query("date") Long l11, @Query("start_time") Long l12, @Query("end_time") Long l13, @Query("sld") boolean z11);

    SwiggyApiResponse<RestaurantListResponseDataV2> getSimilarRestaurants(@Query("lat") double d11, @Query("lng") double d12, @Query("restaurantId") String str, @Query("requestPage") String str2);

    SwiggyApiResponse<SuperPlanResponseData> getSuperPlans();

    SwiggyApiResponse<SwiggyPopListingResponseData> getSwiggyPopItemsList(@Query("lat") double d11, @Query("lng") double d12, @PopType @Query("pop_type") String str);
}
