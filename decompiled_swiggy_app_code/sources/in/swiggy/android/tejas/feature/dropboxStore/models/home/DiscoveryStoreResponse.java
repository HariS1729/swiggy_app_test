package in.swiggy.android.tejas.feature.dropboxStore.models.home;

import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import kotlin.jvm.internal.p;

/* compiled from: DiscoveryStoreResponse.kt */
public final class DiscoveryStoreResponse {
    private final ListingResponse discoveryResponse;
    private final Error error;
    private final StoreTTL storeTTL;

    public DiscoveryStoreResponse(ListingResponse listingResponse, Error error2, StoreTTL storeTTL2) {
        p.j(storeTTL2, "storeTTL");
        this.discoveryResponse = listingResponse;
        this.error = error2;
        this.storeTTL = storeTTL2;
    }

    public static /* synthetic */ DiscoveryStoreResponse copy$default(DiscoveryStoreResponse discoveryStoreResponse, ListingResponse listingResponse, Error error2, StoreTTL storeTTL2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            listingResponse = discoveryStoreResponse.discoveryResponse;
        }
        if ((i11 & 2) != 0) {
            error2 = discoveryStoreResponse.error;
        }
        if ((i11 & 4) != 0) {
            storeTTL2 = discoveryStoreResponse.storeTTL;
        }
        return discoveryStoreResponse.copy(listingResponse, error2, storeTTL2);
    }

    public final ListingResponse component1() {
        return this.discoveryResponse;
    }

    public final Error component2() {
        return this.error;
    }

    public final StoreTTL component3() {
        return this.storeTTL;
    }

    public final DiscoveryStoreResponse copy(ListingResponse listingResponse, Error error2, StoreTTL storeTTL2) {
        p.j(storeTTL2, "storeTTL");
        return new DiscoveryStoreResponse(listingResponse, error2, storeTTL2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveryStoreResponse)) {
            return false;
        }
        DiscoveryStoreResponse discoveryStoreResponse = (DiscoveryStoreResponse) obj;
        return p.e(this.discoveryResponse, discoveryStoreResponse.discoveryResponse) && p.e(this.error, discoveryStoreResponse.error) && p.e(this.storeTTL, discoveryStoreResponse.storeTTL);
    }

    public final ListingResponse getDiscoveryResponse() {
        return this.discoveryResponse;
    }

    public final Error getError() {
        return this.error;
    }

    public final StoreTTL getStoreTTL() {
        return this.storeTTL;
    }

    public int hashCode() {
        ListingResponse listingResponse = this.discoveryResponse;
        int i11 = 0;
        int hashCode = (listingResponse == null ? 0 : listingResponse.hashCode()) * 31;
        Error error2 = this.error;
        if (error2 != null) {
            i11 = error2.hashCode();
        }
        return ((hashCode + i11) * 31) + this.storeTTL.hashCode();
    }

    public String toString() {
        return "DiscoveryStoreResponse(discoveryResponse=" + this.discoveryResponse + ", error=" + this.error + ", storeTTL=" + this.storeTTL + ')';
    }
}
