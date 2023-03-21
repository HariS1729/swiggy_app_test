package in.swiggy.android.tejas.deliveryInstructions;

import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.agentdata.HexAttribute;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: EditOrderModels.kt */
public final class EditOrderResponse {
    public static final Companion Companion = new Companion((i) null);
    public static final int STATUS_ADDRESS_UPDATE_ERROR = 3;
    public static final int STATUS_SUCCESS = 0;
    @SerializedName("statusCode")
    private final int code;
    @SerializedName("data")
    private final EditOrderResponseData data;
    @SerializedName("statusMessage")
    private final String message;

    /* compiled from: EditOrderModels.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public EditOrderResponse(int i11, String str, EditOrderResponseData editOrderResponseData) {
        p.j(str, HexAttribute.HEX_ATTR_MESSAGE);
        p.j(editOrderResponseData, CardTypeAdapterFactory.DATA);
        this.code = i11;
        this.message = str;
        this.data = editOrderResponseData;
    }

    public static /* synthetic */ EditOrderResponse copy$default(EditOrderResponse editOrderResponse, int i11, String str, EditOrderResponseData editOrderResponseData, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = editOrderResponse.code;
        }
        if ((i12 & 2) != 0) {
            str = editOrderResponse.message;
        }
        if ((i12 & 4) != 0) {
            editOrderResponseData = editOrderResponse.data;
        }
        return editOrderResponse.copy(i11, str, editOrderResponseData);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final EditOrderResponseData component3() {
        return this.data;
    }

    public final EditOrderResponse copy(int i11, String str, EditOrderResponseData editOrderResponseData) {
        p.j(str, HexAttribute.HEX_ATTR_MESSAGE);
        p.j(editOrderResponseData, CardTypeAdapterFactory.DATA);
        return new EditOrderResponse(i11, str, editOrderResponseData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditOrderResponse)) {
            return false;
        }
        EditOrderResponse editOrderResponse = (EditOrderResponse) obj;
        return this.code == editOrderResponse.code && p.e(this.message, editOrderResponse.message) && p.e(this.data, editOrderResponse.data);
    }

    public final int getCode() {
        return this.code;
    }

    public final EditOrderResponseData getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (((this.code * 31) + this.message.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "EditOrderResponse(code=" + this.code + ", message=" + this.message + ", data=" + this.data + ')';
    }
}
