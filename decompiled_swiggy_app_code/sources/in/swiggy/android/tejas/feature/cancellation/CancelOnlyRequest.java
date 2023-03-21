package in.swiggy.android.tejas.feature.cancellation;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: CancelOnlyRequest.kt */
public final class CancelOnlyRequest {
    @SerializedName("source")
    private final String source;

    public CancelOnlyRequest() {
        this((String) null, 1, (i) null);
    }

    public CancelOnlyRequest(String str) {
        p.j(str, "source");
        this.source = str;
    }

    public static /* synthetic */ CancelOnlyRequest copy$default(CancelOnlyRequest cancelOnlyRequest, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cancelOnlyRequest.source;
        }
        return cancelOnlyRequest.copy(str);
    }

    public final String component1() {
        return this.source;
    }

    public final CancelOnlyRequest copy(String str) {
        p.j(str, "source");
        return new CancelOnlyRequest(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CancelOnlyRequest) && p.e(this.source, ((CancelOnlyRequest) obj).source);
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.source.hashCode();
    }

    public String toString() {
        return "CancelOnlyRequest(source=" + this.source + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CancelOnlyRequest(String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? "APPS" : str);
    }
}
