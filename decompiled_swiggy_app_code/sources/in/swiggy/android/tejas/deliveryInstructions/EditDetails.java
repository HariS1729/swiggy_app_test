package in.swiggy.android.tejas.deliveryInstructions;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: EditOrderModels.kt */
public final class EditDetails {
    @SerializedName("is_address_updated")
    private final Boolean isDirectionsToReachUpdated;
    @SerializedName("selected_instruction_ids")
    private final List<String> selectedIds;
    @SerializedName("new_address_id")
    private final String updatedAddressId;

    public EditDetails(List<String> list, Boolean bool, String str) {
        this.selectedIds = list;
        this.isDirectionsToReachUpdated = bool;
        this.updatedAddressId = str;
    }

    public static /* synthetic */ EditDetails copy$default(EditDetails editDetails, List<String> list, Boolean bool, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = editDetails.selectedIds;
        }
        if ((i11 & 2) != 0) {
            bool = editDetails.isDirectionsToReachUpdated;
        }
        if ((i11 & 4) != 0) {
            str = editDetails.updatedAddressId;
        }
        return editDetails.copy(list, bool, str);
    }

    public final List<String> component1() {
        return this.selectedIds;
    }

    public final Boolean component2() {
        return this.isDirectionsToReachUpdated;
    }

    public final String component3() {
        return this.updatedAddressId;
    }

    public final EditDetails copy(List<String> list, Boolean bool, String str) {
        return new EditDetails(list, bool, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditDetails)) {
            return false;
        }
        EditDetails editDetails = (EditDetails) obj;
        return p.e(this.selectedIds, editDetails.selectedIds) && p.e(this.isDirectionsToReachUpdated, editDetails.isDirectionsToReachUpdated) && p.e(this.updatedAddressId, editDetails.updatedAddressId);
    }

    public final List<String> getSelectedIds() {
        return this.selectedIds;
    }

    public final String getUpdatedAddressId() {
        return this.updatedAddressId;
    }

    public int hashCode() {
        List<String> list = this.selectedIds;
        int i11 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.isDirectionsToReachUpdated;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.updatedAddressId;
        if (str != null) {
            i11 = str.hashCode();
        }
        return hashCode2 + i11;
    }

    public final Boolean isDirectionsToReachUpdated() {
        return this.isDirectionsToReachUpdated;
    }

    public String toString() {
        return "EditDetails(selectedIds=" + this.selectedIds + ", isDirectionsToReachUpdated=" + this.isDirectionsToReachUpdated + ", updatedAddressId=" + this.updatedAddressId + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditDetails(List list, Boolean bool, String str, int i11, i iVar) {
        this(list, bool, (i11 & 4) != 0 ? null : str);
    }
}
