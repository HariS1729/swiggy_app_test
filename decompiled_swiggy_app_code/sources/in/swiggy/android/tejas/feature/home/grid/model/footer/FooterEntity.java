package in.swiggy.android.tejas.feature.home.grid.model.footer;

import in.swiggy.android.tejas.feature.listing.label.model.LabelEntity;
import kotlin.jvm.internal.p;

/* compiled from: FooterEntity.kt */
public final class FooterEntity {
    private final LabelEntity label;

    public FooterEntity(LabelEntity labelEntity) {
        p.j(labelEntity, "label");
        this.label = labelEntity;
    }

    public static /* synthetic */ FooterEntity copy$default(FooterEntity footerEntity, LabelEntity labelEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            labelEntity = footerEntity.label;
        }
        return footerEntity.copy(labelEntity);
    }

    public final LabelEntity component1() {
        return this.label;
    }

    public final FooterEntity copy(LabelEntity labelEntity) {
        p.j(labelEntity, "label");
        return new FooterEntity(labelEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FooterEntity) && p.e(this.label, ((FooterEntity) obj).label);
    }

    public final LabelEntity getLabel() {
        return this.label;
    }

    public int hashCode() {
        return this.label.hashCode();
    }

    public String toString() {
        return "FooterEntity(label=" + this.label + ')';
    }
}
