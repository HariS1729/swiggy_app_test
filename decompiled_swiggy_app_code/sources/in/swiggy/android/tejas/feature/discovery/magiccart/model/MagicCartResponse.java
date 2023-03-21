package in.swiggy.android.tejas.feature.discovery.magiccart.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: MagicCartResponse.kt */
public final class MagicCartResponse {
    private final String collectionId;
    private final List<MagicCartModel> magicCarts;

    public MagicCartResponse(List<MagicCartModel> list, String str) {
        p.j(list, "magicCarts");
        p.j(str, "collectionId");
        this.magicCarts = list;
        this.collectionId = str;
    }

    public static /* synthetic */ MagicCartResponse copy$default(MagicCartResponse magicCartResponse, List<MagicCartModel> list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = magicCartResponse.magicCarts;
        }
        if ((i11 & 2) != 0) {
            str = magicCartResponse.collectionId;
        }
        return magicCartResponse.copy(list, str);
    }

    public final List<MagicCartModel> component1() {
        return this.magicCarts;
    }

    public final String component2() {
        return this.collectionId;
    }

    public final MagicCartResponse copy(List<MagicCartModel> list, String str) {
        p.j(list, "magicCarts");
        p.j(str, "collectionId");
        return new MagicCartResponse(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagicCartResponse)) {
            return false;
        }
        MagicCartResponse magicCartResponse = (MagicCartResponse) obj;
        return p.e(this.magicCarts, magicCartResponse.magicCarts) && p.e(this.collectionId, magicCartResponse.collectionId);
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final List<MagicCartModel> getMagicCarts() {
        return this.magicCarts;
    }

    public int hashCode() {
        return (this.magicCarts.hashCode() * 31) + this.collectionId.hashCode();
    }

    public String toString() {
        return "MagicCartResponse(magicCarts=" + this.magicCarts + ", collectionId=" + this.collectionId + ')';
    }
}
