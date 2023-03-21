package in.swiggy.android.tejas.feature.google.googlereversegeocode.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

@Instrumented
/* compiled from: GeocoderAddressList.kt */
public final class GeocoderAddressList {
    @SerializedName("addressList")
    private List<GeocodedAddress> addressList = new ArrayList(1);

    public final List<GeocodedAddress> getAddressList() {
        return this.addressList;
    }

    public final GeocodedAddress getBestAddress() {
        return this.addressList.get(0);
    }

    public final boolean hasAddress() {
        return !this.addressList.isEmpty();
    }

    public final void setAddressList(List<GeocodedAddress> list) {
        p.j(list, "<set-?>");
        this.addressList = list;
    }

    public String toString() {
        String json = GsonInstrumentation.toJson(new Gson(), (Object) this);
        p.i(json, "Gson().toJson(this)");
        return json;
    }
}
