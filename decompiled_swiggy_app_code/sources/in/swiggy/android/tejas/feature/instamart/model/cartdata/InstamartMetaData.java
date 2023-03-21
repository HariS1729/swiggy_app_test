package in.swiggy.android.tejas.feature.instamart.model.cartdata;

import com.google.gson.annotations.SerializedName;
import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: InstamartMetaData.kt */
public final class InstamartMetaData {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("values")
    private final MetaDataValues values;

    /* compiled from: InstamartMetaData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartMetaData> serializer() {
            return InstamartMetaData$$serializer.INSTANCE;
        }
    }

    public InstamartMetaData() {
        this((MetaDataValues) null, 1, (i) null);
    }

    public /* synthetic */ InstamartMetaData(int i11, MetaDataValues metaDataValues, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.values = null;
        } else {
            this.values = metaDataValues;
        }
    }

    public static /* synthetic */ InstamartMetaData copy$default(InstamartMetaData instamartMetaData, MetaDataValues metaDataValues, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            metaDataValues = instamartMetaData.values;
        }
        return instamartMetaData.copy(metaDataValues);
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public static final void write$Self(InstamartMetaData instamartMetaData, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartMetaData, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = true;
        if (!dVar.o(serialDescriptor, 0) && instamartMetaData.values == null) {
            z11 = false;
        }
        if (z11) {
            dVar.E(serialDescriptor, 0, MetaDataValues$$serializer.INSTANCE, instamartMetaData.values);
        }
    }

    public final MetaDataValues component1() {
        return this.values;
    }

    public final InstamartMetaData copy(MetaDataValues metaDataValues) {
        return new InstamartMetaData(metaDataValues);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstamartMetaData) && p.e(this.values, ((InstamartMetaData) obj).values);
    }

    public final MetaDataValues getValues() {
        return this.values;
    }

    public int hashCode() {
        MetaDataValues metaDataValues = this.values;
        if (metaDataValues == null) {
            return 0;
        }
        return metaDataValues.hashCode();
    }

    public String toString() {
        return "InstamartMetaData(values=" + this.values + ')';
    }

    public InstamartMetaData(MetaDataValues metaDataValues) {
        this.values = metaDataValues;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstamartMetaData(MetaDataValues metaDataValues, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : metaDataValues);
    }
}
