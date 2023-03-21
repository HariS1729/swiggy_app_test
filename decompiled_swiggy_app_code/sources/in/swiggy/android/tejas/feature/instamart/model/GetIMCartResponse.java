package in.swiggy.android.tejas.feature.instamart.model;

import com.google.gson.annotations.SerializedName;
import fq0.d;
import gq0.x0;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.GetIMCartData;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.GetIMCartData$$serializer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: GetIMCartResponse.kt */
public final class GetIMCartResponse {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("data")
    private final GetIMCartData data;

    /* compiled from: GetIMCartResponse.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<GetIMCartResponse> serializer() {
            return GetIMCartResponse$$serializer.INSTANCE;
        }
    }

    public GetIMCartResponse() {
        this((GetIMCartData) null, 1, (i) null);
    }

    public /* synthetic */ GetIMCartResponse(int i11, GetIMCartData getIMCartData, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.data = null;
        } else {
            this.data = getIMCartData;
        }
    }

    public static /* synthetic */ GetIMCartResponse copy$default(GetIMCartResponse getIMCartResponse, GetIMCartData getIMCartData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            getIMCartData = getIMCartResponse.data;
        }
        return getIMCartResponse.copy(getIMCartData);
    }

    public static final void write$Self(GetIMCartResponse getIMCartResponse, d dVar, SerialDescriptor serialDescriptor) {
        p.j(getIMCartResponse, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = true;
        if (!dVar.o(serialDescriptor, 0) && getIMCartResponse.data == null) {
            z11 = false;
        }
        if (z11) {
            dVar.E(serialDescriptor, 0, GetIMCartData$$serializer.INSTANCE, getIMCartResponse.data);
        }
    }

    public final GetIMCartData component1() {
        return this.data;
    }

    public final GetIMCartResponse copy(GetIMCartData getIMCartData) {
        return new GetIMCartResponse(getIMCartData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetIMCartResponse) && p.e(this.data, ((GetIMCartResponse) obj).data);
    }

    public final GetIMCartData getData() {
        return this.data;
    }

    public int hashCode() {
        GetIMCartData getIMCartData = this.data;
        if (getIMCartData == null) {
            return 0;
        }
        return getIMCartData.hashCode();
    }

    public String toString() {
        return "GetIMCartResponse(data=" + this.data + ')';
    }

    public GetIMCartResponse(GetIMCartData getIMCartData) {
        this.data = getIMCartData;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetIMCartResponse(GetIMCartData getIMCartData, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : getIMCartData);
    }
}
