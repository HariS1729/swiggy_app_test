package in.swiggy.android.tejas.feature.chathead.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ChatHeadResponse.kt */
public final class ChatHeadResponse {
    @SerializedName("aggregation")
    private final List<Aggregation> aggregation;
    @SerializedName("meta")
    private final MetaParent meta;

    public ChatHeadResponse() {
        this((MetaParent) null, (List) null, 3, (i) null);
    }

    public ChatHeadResponse(MetaParent metaParent, List<Aggregation> list) {
        this.meta = metaParent;
        this.aggregation = list;
    }

    public static /* synthetic */ ChatHeadResponse copy$default(ChatHeadResponse chatHeadResponse, MetaParent metaParent, List<Aggregation> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            metaParent = chatHeadResponse.meta;
        }
        if ((i11 & 2) != 0) {
            list = chatHeadResponse.aggregation;
        }
        return chatHeadResponse.copy(metaParent, list);
    }

    public final MetaParent component1() {
        return this.meta;
    }

    public final List<Aggregation> component2() {
        return this.aggregation;
    }

    public final ChatHeadResponse copy(MetaParent metaParent, List<Aggregation> list) {
        return new ChatHeadResponse(metaParent, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatHeadResponse)) {
            return false;
        }
        ChatHeadResponse chatHeadResponse = (ChatHeadResponse) obj;
        return p.e(this.meta, chatHeadResponse.meta) && p.e(this.aggregation, chatHeadResponse.aggregation);
    }

    public final List<Aggregation> getAggregation() {
        return this.aggregation;
    }

    public final MetaParent getMeta() {
        return this.meta;
    }

    public int hashCode() {
        MetaParent metaParent = this.meta;
        int i11 = 0;
        int hashCode = (metaParent == null ? 0 : metaParent.hashCode()) * 31;
        List<Aggregation> list = this.aggregation;
        if (list != null) {
            i11 = list.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "ChatHeadResponse(meta=" + this.meta + ", aggregation=" + this.aggregation + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChatHeadResponse(MetaParent metaParent, List list, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : metaParent, (i11 & 2) != 0 ? null : list);
    }
}
