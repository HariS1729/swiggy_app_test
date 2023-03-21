package in.swiggy.android.tejas.feature.chathead.models;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: MetaParent.kt */
public final class MetaParent {
    @SerializedName("count")
    private final int count;
    @SerializedName("offset")
    private final String offset;

    public MetaParent(String str, int i11) {
        p.j(str, "offset");
        this.offset = str;
        this.count = i11;
    }

    public static /* synthetic */ MetaParent copy$default(MetaParent metaParent, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = metaParent.offset;
        }
        if ((i12 & 2) != 0) {
            i11 = metaParent.count;
        }
        return metaParent.copy(str, i11);
    }

    public final String component1() {
        return this.offset;
    }

    public final int component2() {
        return this.count;
    }

    public final MetaParent copy(String str, int i11) {
        p.j(str, "offset");
        return new MetaParent(str, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetaParent)) {
            return false;
        }
        MetaParent metaParent = (MetaParent) obj;
        return p.e(this.offset, metaParent.offset) && this.count == metaParent.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getOffset() {
        return this.offset;
    }

    public int hashCode() {
        return (this.offset.hashCode() * 31) + this.count;
    }

    public String toString() {
        return "MetaParent(offset=" + this.offset + ", count=" + this.count + ')';
    }
}
