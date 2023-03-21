package in.swiggy.android.tejas.feature.dropboxStore.models.home;

import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.home.model.HomeResponse;
import kotlin.jvm.internal.p;

/* compiled from: HomeStoreResponse.kt */
public final class HomeStoreResponse {
    private final Error error;
    private final HomeResponse homeResponse;
    private final StoreTTL storeTTL;

    public HomeStoreResponse(HomeResponse homeResponse2, Error error2, StoreTTL storeTTL2) {
        p.j(storeTTL2, "storeTTL");
        this.homeResponse = homeResponse2;
        this.error = error2;
        this.storeTTL = storeTTL2;
    }

    public static /* synthetic */ HomeStoreResponse copy$default(HomeStoreResponse homeStoreResponse, HomeResponse homeResponse2, Error error2, StoreTTL storeTTL2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            homeResponse2 = homeStoreResponse.homeResponse;
        }
        if ((i11 & 2) != 0) {
            error2 = homeStoreResponse.error;
        }
        if ((i11 & 4) != 0) {
            storeTTL2 = homeStoreResponse.storeTTL;
        }
        return homeStoreResponse.copy(homeResponse2, error2, storeTTL2);
    }

    public final HomeResponse component1() {
        return this.homeResponse;
    }

    public final Error component2() {
        return this.error;
    }

    public final StoreTTL component3() {
        return this.storeTTL;
    }

    public final HomeStoreResponse copy(HomeResponse homeResponse2, Error error2, StoreTTL storeTTL2) {
        p.j(storeTTL2, "storeTTL");
        return new HomeStoreResponse(homeResponse2, error2, storeTTL2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeStoreResponse)) {
            return false;
        }
        HomeStoreResponse homeStoreResponse = (HomeStoreResponse) obj;
        return p.e(this.homeResponse, homeStoreResponse.homeResponse) && p.e(this.error, homeStoreResponse.error) && p.e(this.storeTTL, homeStoreResponse.storeTTL);
    }

    public final Error getError() {
        return this.error;
    }

    public final HomeResponse getHomeResponse() {
        return this.homeResponse;
    }

    public final StoreTTL getStoreTTL() {
        return this.storeTTL;
    }

    public int hashCode() {
        HomeResponse homeResponse2 = this.homeResponse;
        int i11 = 0;
        int hashCode = (homeResponse2 == null ? 0 : homeResponse2.hashCode()) * 31;
        Error error2 = this.error;
        if (error2 != null) {
            i11 = error2.hashCode();
        }
        return ((hashCode + i11) * 31) + this.storeTTL.hashCode();
    }

    public String toString() {
        return "HomeStoreResponse(homeResponse=" + this.homeResponse + ", error=" + this.error + ", storeTTL=" + this.storeTTL + ')';
    }
}
