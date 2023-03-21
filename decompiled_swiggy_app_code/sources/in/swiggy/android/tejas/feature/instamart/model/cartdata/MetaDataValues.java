package in.swiggy.android.tejas.feature.instamart.model.cartdata;

import com.google.gson.annotations.SerializedName;
import fq0.d;
import gq0.h;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: MetaDataValues.kt */
public final class MetaDataValues {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("contactless_delivery")
    private final Boolean contactlessDelivery;

    /* compiled from: MetaDataValues.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<MetaDataValues> serializer() {
            return MetaDataValues$$serializer.INSTANCE;
        }
    }

    public MetaDataValues() {
        this((Boolean) null, 1, (i) null);
    }

    public /* synthetic */ MetaDataValues(int i11, Boolean bool, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.contactlessDelivery = null;
        } else {
            this.contactlessDelivery = bool;
        }
    }

    public static /* synthetic */ MetaDataValues copy$default(MetaDataValues metaDataValues, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = metaDataValues.contactlessDelivery;
        }
        return metaDataValues.copy(bool);
    }

    public static /* synthetic */ void getContactlessDelivery$annotations() {
    }

    public static final void write$Self(MetaDataValues metaDataValues, d dVar, SerialDescriptor serialDescriptor) {
        p.j(metaDataValues, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = true;
        if (!dVar.o(serialDescriptor, 0) && metaDataValues.contactlessDelivery == null) {
            z11 = false;
        }
        if (z11) {
            dVar.E(serialDescriptor, 0, h.f23089b, metaDataValues.contactlessDelivery);
        }
    }

    public final Boolean component1() {
        return this.contactlessDelivery;
    }

    public final MetaDataValues copy(Boolean bool) {
        return new MetaDataValues(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MetaDataValues) && p.e(this.contactlessDelivery, ((MetaDataValues) obj).contactlessDelivery);
    }

    public final Boolean getContactlessDelivery() {
        return this.contactlessDelivery;
    }

    public int hashCode() {
        Boolean bool = this.contactlessDelivery;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "MetaDataValues(contactlessDelivery=" + this.contactlessDelivery + ')';
    }

    public MetaDataValues(Boolean bool) {
        this.contactlessDelivery = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MetaDataValues(Boolean bool, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : bool);
    }
}
