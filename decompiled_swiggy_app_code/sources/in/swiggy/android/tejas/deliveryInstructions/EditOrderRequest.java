package in.swiggy.android.tejas.deliveryInstructions;

import kotlin.jvm.internal.p;

/* compiled from: EditOrderModels.kt */
public final class EditOrderRequest {
    private final String edit_context;
    private final EditDetails edit_details;
    private final String order_id;

    public EditOrderRequest(String str, EditDetails editDetails, String str2) {
        p.j(str, "order_id");
        p.j(editDetails, "edit_details");
        p.j(str2, "edit_context");
        this.order_id = str;
        this.edit_details = editDetails;
        this.edit_context = str2;
    }

    public static /* synthetic */ EditOrderRequest copy$default(EditOrderRequest editOrderRequest, String str, EditDetails editDetails, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = editOrderRequest.order_id;
        }
        if ((i11 & 2) != 0) {
            editDetails = editOrderRequest.edit_details;
        }
        if ((i11 & 4) != 0) {
            str2 = editOrderRequest.edit_context;
        }
        return editOrderRequest.copy(str, editDetails, str2);
    }

    public final String component1() {
        return this.order_id;
    }

    public final EditDetails component2() {
        return this.edit_details;
    }

    public final String component3() {
        return this.edit_context;
    }

    public final EditOrderRequest copy(String str, EditDetails editDetails, String str2) {
        p.j(str, "order_id");
        p.j(editDetails, "edit_details");
        p.j(str2, "edit_context");
        return new EditOrderRequest(str, editDetails, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditOrderRequest)) {
            return false;
        }
        EditOrderRequest editOrderRequest = (EditOrderRequest) obj;
        return p.e(this.order_id, editOrderRequest.order_id) && p.e(this.edit_details, editOrderRequest.edit_details) && p.e(this.edit_context, editOrderRequest.edit_context);
    }

    public final String getEdit_context() {
        return this.edit_context;
    }

    public final EditDetails getEdit_details() {
        return this.edit_details;
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public int hashCode() {
        return (((this.order_id.hashCode() * 31) + this.edit_details.hashCode()) * 31) + this.edit_context.hashCode();
    }

    public String toString() {
        return "EditOrderRequest(order_id=" + this.order_id + ", edit_details=" + this.edit_details + ", edit_context=" + this.edit_context + ')';
    }
}
