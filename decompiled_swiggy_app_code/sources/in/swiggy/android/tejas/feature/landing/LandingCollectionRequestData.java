package in.swiggy.android.tejas.feature.landing;

import android.os.Parcelable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LandingCollectionRequestData.kt */
public final class LandingCollectionRequestData {
    private final String collectionId;
    private final String headerTitle;
    private final Parcelable requestBody;
    private final String showLocation;

    public LandingCollectionRequestData(String str, String str2, String str3, Parcelable parcelable) {
        p.j(str, "showLocation");
        p.j(str2, "headerTitle");
        p.j(str3, "collectionId");
        this.showLocation = str;
        this.headerTitle = str2;
        this.collectionId = str3;
        this.requestBody = parcelable;
    }

    public static /* synthetic */ LandingCollectionRequestData copy$default(LandingCollectionRequestData landingCollectionRequestData, String str, String str2, String str3, Parcelable parcelable, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = landingCollectionRequestData.showLocation;
        }
        if ((i11 & 2) != 0) {
            str2 = landingCollectionRequestData.headerTitle;
        }
        if ((i11 & 4) != 0) {
            str3 = landingCollectionRequestData.collectionId;
        }
        if ((i11 & 8) != 0) {
            parcelable = landingCollectionRequestData.requestBody;
        }
        return landingCollectionRequestData.copy(str, str2, str3, parcelable);
    }

    public final String component1() {
        return this.showLocation;
    }

    public final String component2() {
        return this.headerTitle;
    }

    public final String component3() {
        return this.collectionId;
    }

    public final Parcelable component4() {
        return this.requestBody;
    }

    public final LandingCollectionRequestData copy(String str, String str2, String str3, Parcelable parcelable) {
        p.j(str, "showLocation");
        p.j(str2, "headerTitle");
        p.j(str3, "collectionId");
        return new LandingCollectionRequestData(str, str2, str3, parcelable);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingCollectionRequestData)) {
            return false;
        }
        LandingCollectionRequestData landingCollectionRequestData = (LandingCollectionRequestData) obj;
        return p.e(this.showLocation, landingCollectionRequestData.showLocation) && p.e(this.headerTitle, landingCollectionRequestData.headerTitle) && p.e(this.collectionId, landingCollectionRequestData.collectionId) && p.e(this.requestBody, landingCollectionRequestData.requestBody);
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final Parcelable getRequestBody() {
        return this.requestBody;
    }

    public final String getShowLocation() {
        return this.showLocation;
    }

    public int hashCode() {
        int hashCode = ((((this.showLocation.hashCode() * 31) + this.headerTitle.hashCode()) * 31) + this.collectionId.hashCode()) * 31;
        Parcelable parcelable = this.requestBody;
        return hashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    public String toString() {
        return "LandingCollectionRequestData(showLocation=" + this.showLocation + ", headerTitle=" + this.headerTitle + ", collectionId=" + this.collectionId + ", requestBody=" + this.requestBody + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LandingCollectionRequestData(String str, String str2, String str3, Parcelable parcelable, int i11, i iVar) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : parcelable);
    }
}
