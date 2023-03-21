package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import com.google.gson.annotations.SerializedName;
import fq0.d;
import gq0.w;
import gq0.x0;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuDimensions;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: InstamartItemDimension.kt */
public final class InstamartItemDimension {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("height_in_cm")
    private final Integer heightInCm;
    @SerializedName("length_in_cm")
    private final Integer lengthInCm;
    @SerializedName("volume_in_cc")
    private final Integer volumeInCc;
    @SerializedName("width_in_cm")
    private final Integer widthInCm;

    /* compiled from: InstamartItemDimension.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartItemDimension> serializer() {
            return InstamartItemDimension$$serializer.INSTANCE;
        }
    }

    public InstamartItemDimension() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, 15, (i) null);
    }

    public /* synthetic */ InstamartItemDimension(int i11, Integer num, Integer num2, Integer num3, Integer num4, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.lengthInCm = null;
        } else {
            this.lengthInCm = num;
        }
        if ((i11 & 2) == 0) {
            this.widthInCm = null;
        } else {
            this.widthInCm = num2;
        }
        if ((i11 & 4) == 0) {
            this.heightInCm = null;
        } else {
            this.heightInCm = num3;
        }
        if ((i11 & 8) == 0) {
            this.volumeInCc = null;
        } else {
            this.volumeInCc = num4;
        }
    }

    public static /* synthetic */ InstamartItemDimension copy$default(InstamartItemDimension instamartItemDimension, Integer num, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = instamartItemDimension.lengthInCm;
        }
        if ((i11 & 2) != 0) {
            num2 = instamartItemDimension.widthInCm;
        }
        if ((i11 & 4) != 0) {
            num3 = instamartItemDimension.heightInCm;
        }
        if ((i11 & 8) != 0) {
            num4 = instamartItemDimension.volumeInCc;
        }
        return instamartItemDimension.copy(num, num2, num3, num4);
    }

    public static /* synthetic */ void getHeightInCm$annotations() {
    }

    public static /* synthetic */ void getLengthInCm$annotations() {
    }

    public static /* synthetic */ void getVolumeInCc$annotations() {
    }

    public static /* synthetic */ void getWidthInCm$annotations() {
    }

    public static final void write$Self(InstamartItemDimension instamartItemDimension, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartItemDimension, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || instamartItemDimension.lengthInCm != null) {
            dVar.E(serialDescriptor, 0, w.f23130b, instamartItemDimension.lengthInCm);
        }
        if (dVar.o(serialDescriptor, 1) || instamartItemDimension.widthInCm != null) {
            dVar.E(serialDescriptor, 1, w.f23130b, instamartItemDimension.widthInCm);
        }
        if (dVar.o(serialDescriptor, 2) || instamartItemDimension.heightInCm != null) {
            dVar.E(serialDescriptor, 2, w.f23130b, instamartItemDimension.heightInCm);
        }
        if (dVar.o(serialDescriptor, 3) || instamartItemDimension.volumeInCc != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 3, w.f23130b, instamartItemDimension.volumeInCc);
        }
    }

    public final Integer component1() {
        return this.lengthInCm;
    }

    public final Integer component2() {
        return this.widthInCm;
    }

    public final Integer component3() {
        return this.heightInCm;
    }

    public final Integer component4() {
        return this.volumeInCc;
    }

    public final InstamartItemDimension copy(Integer num, Integer num2, Integer num3, Integer num4) {
        return new InstamartItemDimension(num, num2, num3, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstamartItemDimension)) {
            return false;
        }
        InstamartItemDimension instamartItemDimension = (InstamartItemDimension) obj;
        return p.e(this.lengthInCm, instamartItemDimension.lengthInCm) && p.e(this.widthInCm, instamartItemDimension.widthInCm) && p.e(this.heightInCm, instamartItemDimension.heightInCm) && p.e(this.volumeInCc, instamartItemDimension.volumeInCc);
    }

    public final Integer getHeightInCm() {
        return this.heightInCm;
    }

    public final Integer getLengthInCm() {
        return this.lengthInCm;
    }

    public final Integer getVolumeInCc() {
        return this.volumeInCc;
    }

    public final Integer getWidthInCm() {
        return this.widthInCm;
    }

    public int hashCode() {
        Integer num = this.lengthInCm;
        int i11 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.widthInCm;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.heightInCm;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.volumeInCc;
        if (num4 != null) {
            i11 = num4.hashCode();
        }
        return hashCode3 + i11;
    }

    public String toString() {
        return "InstamartItemDimension(lengthInCm=" + this.lengthInCm + ", widthInCm=" + this.widthInCm + ", heightInCm=" + this.heightInCm + ", volumeInCc=" + this.volumeInCc + ')';
    }

    public InstamartItemDimension(Integer num, Integer num2, Integer num3, Integer num4) {
        this.lengthInCm = num;
        this.widthInCm = num2;
        this.heightInCm = num3;
        this.volumeInCc = num4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstamartItemDimension(Integer num, Integer num2, Integer num3, Integer num4, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : num3, (i11 & 8) != 0 ? null : num4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InstamartItemDimension(MartMenuDimensions martMenuDimensions) {
        this(Integer.valueOf(martMenuDimensions.getLengthInCm()), Integer.valueOf(martMenuDimensions.getWidthInCm()), Integer.valueOf(martMenuDimensions.getHeightInCm()), Integer.valueOf(martMenuDimensions.getVolumeInCc()));
        p.j(martMenuDimensions, "dimensions");
    }
}
