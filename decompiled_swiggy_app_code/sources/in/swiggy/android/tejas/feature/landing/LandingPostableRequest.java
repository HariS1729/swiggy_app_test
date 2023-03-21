package in.swiggy.android.tejas.feature.landing;

import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.feature.listing.facets.model.Facet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LandingPostableRequest.kt */
public final class LandingPostableRequest {
    @SerializedName("collection_id")
    private String collectionId;
    @SerializedName("facets")
    private Map<String, ? extends List<Facet>> facets;
    @SerializedName("query_id")
    private String queryId;

    public LandingPostableRequest() {
        this((String) null, (Map) null, (String) null, 7, (i) null);
    }

    public LandingPostableRequest(String str, Map<String, ? extends List<Facet>> map, String str2) {
        p.j(map, "facets");
        this.collectionId = str;
        this.facets = map;
        this.queryId = str2;
    }

    public static /* synthetic */ LandingPostableRequest copy$default(LandingPostableRequest landingPostableRequest, String str, Map<String, ? extends List<Facet>> map, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = landingPostableRequest.collectionId;
        }
        if ((i11 & 2) != 0) {
            map = landingPostableRequest.facets;
        }
        if ((i11 & 4) != 0) {
            str2 = landingPostableRequest.queryId;
        }
        return landingPostableRequest.copy(str, map, str2);
    }

    public final String component1() {
        return this.collectionId;
    }

    public final Map<String, List<Facet>> component2() {
        return this.facets;
    }

    public final String component3() {
        return this.queryId;
    }

    public final LandingPostableRequest copy(String str, Map<String, ? extends List<Facet>> map, String str2) {
        p.j(map, "facets");
        return new LandingPostableRequest(str, map, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingPostableRequest)) {
            return false;
        }
        LandingPostableRequest landingPostableRequest = (LandingPostableRequest) obj;
        return p.e(this.collectionId, landingPostableRequest.collectionId) && p.e(this.facets, landingPostableRequest.facets) && p.e(this.queryId, landingPostableRequest.queryId);
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final Map<String, List<Facet>> getFacets() {
        return this.facets;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public int hashCode() {
        String str = this.collectionId;
        int i11 = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.facets.hashCode()) * 31;
        String str2 = this.queryId;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode + i11;
    }

    public final void setCollectionId(String str) {
        this.collectionId = str;
    }

    public final void setFacets(Map<String, ? extends List<Facet>> map) {
        p.j(map, "<set-?>");
        this.facets = map;
    }

    public final void setQueryId(String str) {
        this.queryId = str;
    }

    public String toString() {
        return "LandingPostableRequest(collectionId=" + this.collectionId + ", facets=" + this.facets + ", queryId=" + this.queryId + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LandingPostableRequest(String str, Map map, String str2, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? new HashMap() : map, (i11 & 4) != 0 ? null : str2);
    }
}
