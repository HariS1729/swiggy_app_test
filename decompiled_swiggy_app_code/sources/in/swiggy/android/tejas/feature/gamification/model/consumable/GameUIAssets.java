package in.swiggy.android.tejas.feature.gamification.model.consumable;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: GameUIAssets.kt */
public final class GameUIAssets {
    @SerializedName("cloudinaryId")
    private String cloudinaryId;
    @SerializedName("text")
    private String title;

    public GameUIAssets() {
        this((String) null, (String) null, 3, (i) null);
    }

    public GameUIAssets(String str, String str2) {
        this.title = str;
        this.cloudinaryId = str2;
    }

    public static /* synthetic */ GameUIAssets copy$default(GameUIAssets gameUIAssets, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = gameUIAssets.title;
        }
        if ((i11 & 2) != 0) {
            str2 = gameUIAssets.cloudinaryId;
        }
        return gameUIAssets.copy(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.cloudinaryId;
    }

    public final GameUIAssets copy(String str, String str2) {
        return new GameUIAssets(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameUIAssets)) {
            return false;
        }
        GameUIAssets gameUIAssets = (GameUIAssets) obj;
        return p.e(this.title, gameUIAssets.title) && p.e(this.cloudinaryId, gameUIAssets.cloudinaryId);
    }

    public final String getCloudinaryId() {
        return this.cloudinaryId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cloudinaryId;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode + i11;
    }

    public final void setCloudinaryId(String str) {
        this.cloudinaryId = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "GameUIAssets(title=" + this.title + ", cloudinaryId=" + this.cloudinaryId + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GameUIAssets(String str, String str2, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
