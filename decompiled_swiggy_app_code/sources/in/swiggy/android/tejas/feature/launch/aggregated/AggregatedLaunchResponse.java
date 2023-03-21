package in.swiggy.android.tejas.feature.launch.aggregated;

import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.launch.model.network.LaunchResponse;
import in.swiggy.android.tejas.oldapi.network.responses.LaunchData;
import in.swiggy.android.tejas.oldapi.network.responses.UserLaunchData;
import kotlin.jvm.internal.p;

/* compiled from: AggregatedLaunchResponse.kt */
public final class AggregatedLaunchResponse {
    @SerializedName("dash")
    private final SwiggyApiResponse<LaunchResponse> dashLaunchData;
    @SerializedName("food")
    private final SwiggyApiResponse<LaunchData> foodLaunchData;
    @SerializedName("statusCode")
    private final Integer statusCode;
    @SerializedName("statusMessage")
    private final String statusMessage;
    @SerializedName("abuse")
    private final SwiggyApiResponse<UserLaunchData> userLaunchData;

    public AggregatedLaunchResponse(Integer num, String str, SwiggyApiResponse<LaunchData> swiggyApiResponse, SwiggyApiResponse<LaunchResponse> swiggyApiResponse2, SwiggyApiResponse<UserLaunchData> swiggyApiResponse3) {
        this.statusCode = num;
        this.statusMessage = str;
        this.foodLaunchData = swiggyApiResponse;
        this.dashLaunchData = swiggyApiResponse2;
        this.userLaunchData = swiggyApiResponse3;
    }

    public static /* synthetic */ AggregatedLaunchResponse copy$default(AggregatedLaunchResponse aggregatedLaunchResponse, Integer num, String str, SwiggyApiResponse<LaunchData> swiggyApiResponse, SwiggyApiResponse<LaunchResponse> swiggyApiResponse2, SwiggyApiResponse<UserLaunchData> swiggyApiResponse3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = aggregatedLaunchResponse.statusCode;
        }
        if ((i11 & 2) != 0) {
            str = aggregatedLaunchResponse.statusMessage;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            swiggyApiResponse = aggregatedLaunchResponse.foodLaunchData;
        }
        SwiggyApiResponse<LaunchData> swiggyApiResponse4 = swiggyApiResponse;
        if ((i11 & 8) != 0) {
            swiggyApiResponse2 = aggregatedLaunchResponse.dashLaunchData;
        }
        SwiggyApiResponse<LaunchResponse> swiggyApiResponse5 = swiggyApiResponse2;
        if ((i11 & 16) != 0) {
            swiggyApiResponse3 = aggregatedLaunchResponse.userLaunchData;
        }
        return aggregatedLaunchResponse.copy(num, str2, swiggyApiResponse4, swiggyApiResponse5, swiggyApiResponse3);
    }

    public final Integer component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusMessage;
    }

    public final SwiggyApiResponse<LaunchData> component3() {
        return this.foodLaunchData;
    }

    public final SwiggyApiResponse<LaunchResponse> component4() {
        return this.dashLaunchData;
    }

    public final SwiggyApiResponse<UserLaunchData> component5() {
        return this.userLaunchData;
    }

    public final AggregatedLaunchResponse copy(Integer num, String str, SwiggyApiResponse<LaunchData> swiggyApiResponse, SwiggyApiResponse<LaunchResponse> swiggyApiResponse2, SwiggyApiResponse<UserLaunchData> swiggyApiResponse3) {
        return new AggregatedLaunchResponse(num, str, swiggyApiResponse, swiggyApiResponse2, swiggyApiResponse3);
    }

    public final SwiggyApiResponse<LaunchResponse> copyDashWithModifiedStatusCode() {
        Integer num = this.statusCode;
        String str = this.statusMessage;
        SwiggyApiResponse<LaunchResponse> swiggyApiResponse = this.dashLaunchData;
        return new SwiggyApiResponse<>(num, str, swiggyApiResponse == null ? null : swiggyApiResponse.getData());
    }

    public final SwiggyApiResponse<LaunchData> copyFoodWithModifiedStatusCode() {
        SwiggyApiResponse<LaunchData> swiggyApiResponse = this.foodLaunchData;
        Integer errorCode = swiggyApiResponse == null ? null : swiggyApiResponse.getErrorCode();
        Integer num = this.statusCode;
        SwiggyApiResponse<LaunchData> swiggyApiResponse2 = this.foodLaunchData;
        String statusTitle = swiggyApiResponse2 == null ? null : swiggyApiResponse2.getStatusTitle();
        String str = this.statusMessage;
        SwiggyApiResponse<LaunchData> swiggyApiResponse3 = this.foodLaunchData;
        String tid = swiggyApiResponse3 == null ? null : swiggyApiResponse3.getTid();
        SwiggyApiResponse<LaunchData> swiggyApiResponse4 = this.foodLaunchData;
        String sid = swiggyApiResponse4 == null ? null : swiggyApiResponse4.getSid();
        SwiggyApiResponse<LaunchData> swiggyApiResponse5 = this.foodLaunchData;
        return new SwiggyApiResponse(errorCode, num, statusTitle, str, tid, sid, swiggyApiResponse5 == null ? null : swiggyApiResponse5.getData());
    }

    public final SwiggyApiResponse<UserLaunchData> copyUserDataWithStatusCode() {
        Integer num = this.statusCode;
        String str = this.statusMessage;
        SwiggyApiResponse<UserLaunchData> swiggyApiResponse = this.userLaunchData;
        return new SwiggyApiResponse<>(num, str, swiggyApiResponse == null ? null : swiggyApiResponse.getData());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AggregatedLaunchResponse)) {
            return false;
        }
        AggregatedLaunchResponse aggregatedLaunchResponse = (AggregatedLaunchResponse) obj;
        return p.e(this.statusCode, aggregatedLaunchResponse.statusCode) && p.e(this.statusMessage, aggregatedLaunchResponse.statusMessage) && p.e(this.foodLaunchData, aggregatedLaunchResponse.foodLaunchData) && p.e(this.dashLaunchData, aggregatedLaunchResponse.dashLaunchData) && p.e(this.userLaunchData, aggregatedLaunchResponse.userLaunchData);
    }

    public final SwiggyApiResponse<LaunchResponse> getDashLaunchData() {
        return this.dashLaunchData;
    }

    public final SwiggyApiResponse<LaunchData> getFoodLaunchData() {
        return this.foodLaunchData;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final SwiggyApiResponse<UserLaunchData> getUserLaunchData() {
        return this.userLaunchData;
    }

    public int hashCode() {
        Integer num = this.statusCode;
        int i11 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SwiggyApiResponse<LaunchData> swiggyApiResponse = this.foodLaunchData;
        int hashCode3 = (hashCode2 + (swiggyApiResponse == null ? 0 : swiggyApiResponse.hashCode())) * 31;
        SwiggyApiResponse<LaunchResponse> swiggyApiResponse2 = this.dashLaunchData;
        int hashCode4 = (hashCode3 + (swiggyApiResponse2 == null ? 0 : swiggyApiResponse2.hashCode())) * 31;
        SwiggyApiResponse<UserLaunchData> swiggyApiResponse3 = this.userLaunchData;
        if (swiggyApiResponse3 != null) {
            i11 = swiggyApiResponse3.hashCode();
        }
        return hashCode4 + i11;
    }

    public String toString() {
        return super.toString();
    }
}
