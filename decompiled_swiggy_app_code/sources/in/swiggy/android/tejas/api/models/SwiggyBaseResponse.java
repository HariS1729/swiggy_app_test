package in.swiggy.android.tejas.api.models;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;

/* compiled from: SwiggyBaseResponse.kt */
public class SwiggyBaseResponse {
    public static final Companion Companion = new Companion((i) null);
    public static final int NOT_OK_STATUS_CODE = 1;
    public static final int OK_STATUS_CODE = 0;
    public static final int SESSION_INVALID_STATUS_CODE = 999;
    @SerializedName("errorCode")
    private final Integer errorCode;
    @SerializedName("requestId")
    private String requestId;
    @SerializedName("timeStamp")
    private String serverTimeStamp;
    @SerializedName("sid")
    private final String sid;
    @SerializedName("statusCode")
    private final Integer statusCode;
    @SerializedName("statusMessage")
    private final String statusMessage;
    @SerializedName("statusTitle")
    private final String statusTitle;
    @SerializedName("tid")
    private final String tid;

    /* compiled from: SwiggyBaseResponse.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public SwiggyBaseResponse(Integer num, Integer num2, String str, String str2, String str3, String str4) {
        this.errorCode = num;
        this.statusCode = num2;
        this.statusTitle = str;
        this.statusMessage = str2;
        this.tid = str3;
        this.sid = str4;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getServerTimeStamp() {
        return this.serverTimeStamp;
    }

    public final String getSid() {
        return this.sid;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final String getStatusTitle() {
        return this.statusTitle;
    }

    public final String getTid() {
        return this.tid;
    }

    public boolean isResponseOk() {
        Integer num = this.statusCode;
        return num != null && num.intValue() == 0;
    }

    public boolean isResponseOkForBoth() {
        Integer num = this.statusCode;
        if (num != null && num.intValue() == 0) {
            return true;
        }
        Integer num2 = this.statusCode;
        return num2 != null && num2.intValue() == 1;
    }

    public final boolean isSessionInValid() {
        Integer num = this.statusCode;
        return num != null && num.intValue() == 999;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setServerTimeStamp(String str) {
        this.serverTimeStamp = str;
    }

    public SwiggyBaseResponse(Integer num, String str) {
        this.statusCode = num;
        this.statusMessage = str;
        this.errorCode = null;
        this.statusTitle = null;
        this.tid = null;
        this.sid = null;
    }

    public SwiggyBaseResponse() {
        this.errorCode = null;
        this.statusCode = null;
        this.statusTitle = null;
        this.statusMessage = null;
        this.tid = null;
        this.sid = null;
    }
}
