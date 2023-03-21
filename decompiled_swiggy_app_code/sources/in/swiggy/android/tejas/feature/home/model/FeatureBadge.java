package in.swiggy.android.tejas.feature.home.model;

import kotlin.jvm.internal.p;

/* compiled from: FeatureBadge.kt */
public final class FeatureBadge {
    private final String imageId;
    private final String text;

    public FeatureBadge(String str, String str2) {
        p.j(str, "imageId");
        p.j(str2, "text");
        this.imageId = str;
        this.text = str2;
    }

    public static /* synthetic */ FeatureBadge copy$default(FeatureBadge featureBadge, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = featureBadge.imageId;
        }
        if ((i11 & 2) != 0) {
            str2 = featureBadge.text;
        }
        return featureBadge.copy(str, str2);
    }

    public final String component1() {
        return this.imageId;
    }

    public final String component2() {
        return this.text;
    }

    public final FeatureBadge copy(String str, String str2) {
        p.j(str, "imageId");
        p.j(str2, "text");
        return new FeatureBadge(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureBadge)) {
            return false;
        }
        FeatureBadge featureBadge = (FeatureBadge) obj;
        return p.e(this.imageId, featureBadge.imageId) && p.e(this.text, featureBadge.text);
    }

    public final String getImageId() {
        return this.imageId;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.imageId.hashCode() * 31) + this.text.hashCode();
    }

    public String toString() {
        return "FeatureBadge(imageId=" + this.imageId + ", text=" + this.text + ')';
    }
}
