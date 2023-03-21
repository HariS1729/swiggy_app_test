package in.swiggy.android.tejas.feature.chathead.models;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Aggregation.kt */
public final class Aggregation {
    @SerializedName("conversations")
    private final List<Conversations> conversations;
    @SerializedName("meta")
    private final Meta meta;

    public Aggregation() {
        this((Meta) null, (List) null, 3, (i) null);
    }

    public Aggregation(Meta meta2, List<Conversations> list) {
        this.meta = meta2;
        this.conversations = list;
    }

    public static /* synthetic */ Aggregation copy$default(Aggregation aggregation, Meta meta2, List<Conversations> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            meta2 = aggregation.meta;
        }
        if ((i11 & 2) != 0) {
            list = aggregation.conversations;
        }
        return aggregation.copy(meta2, list);
    }

    public final Meta component1() {
        return this.meta;
    }

    public final List<Conversations> component2() {
        return this.conversations;
    }

    public final Aggregation copy(Meta meta2, List<Conversations> list) {
        return new Aggregation(meta2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Aggregation)) {
            return false;
        }
        Aggregation aggregation = (Aggregation) obj;
        return p.e(this.meta, aggregation.meta) && p.e(this.conversations, aggregation.conversations);
    }

    public final List<Conversations> getConversations() {
        return this.conversations;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public int hashCode() {
        Meta meta2 = this.meta;
        int i11 = 0;
        int hashCode = (meta2 == null ? 0 : meta2.hashCode()) * 31;
        List<Conversations> list = this.conversations;
        if (list != null) {
            i11 = list.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "Aggregation(meta=" + this.meta + ", conversations=" + this.conversations + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Aggregation(Meta meta2, List list, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : meta2, (i11 & 2) != 0 ? new ArrayList() : list);
    }
}
