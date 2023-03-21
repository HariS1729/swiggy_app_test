package in.swiggy.android.tejas.feature.google.googlereversegeocode.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import in.swiggy.android.tejas.oldapi.models.googleplace.GoogleDirectionResponse;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Instrumented
/* compiled from: GooglePlaceDetail.kt */
public final class GooglePlaceDetail {
    public static final Companion Companion = new Companion((i) null);
    /* access modifiers changed from: private */
    public static final String ERROR = "ERROR";
    /* access modifiers changed from: private */
    public static final String OK = GoogleDirectionResponse.OK_RESPONSE;
    @SerializedName("result")
    private GooglePlace googlePlace;
    @SerializedName("status")
    private String status;

    /* compiled from: GooglePlaceDetail.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final String getERROR() {
            return GooglePlaceDetail.ERROR;
        }

        public final String getOK() {
            return GooglePlaceDetail.OK;
        }
    }

    public final GooglePlace getGooglePlace() {
        return this.googlePlace;
    }

    public final String getStatus() {
        return this.status;
    }

    public final boolean isOkStatus() {
        return o.x(OK, this.status, true);
    }

    public final void setGooglePlace(GooglePlace googlePlace2) {
        this.googlePlace = googlePlace2;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        String json = GsonInstrumentation.toJson(new Gson(), (Object) this);
        p.i(json, "Gson().toJson(this)");
        return json;
    }
}
