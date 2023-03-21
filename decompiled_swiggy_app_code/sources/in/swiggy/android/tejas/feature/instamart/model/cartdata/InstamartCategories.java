package in.swiggy.android.tejas.feature.instamart.model.cartdata;

import com.google.gson.annotations.SerializedName;
import fq0.d;
import gq0.a1;
import gq0.h;
import gq0.w;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: InstamartCategories.kt */
public final class InstamartCategories {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private final Integer f20252id;
    @SerializedName("is_category_popular")
    private final Boolean isCategoryPopular;
    @SerializedName("name")
    private final String name;

    /* compiled from: InstamartCategories.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartCategories> serializer() {
            return InstamartCategories$$serializer.INSTANCE;
        }
    }

    public InstamartCategories() {
        this((Integer) null, (String) null, (Boolean) null, 7, (i) null);
    }

    public /* synthetic */ InstamartCategories(int i11, Integer num, String str, Boolean bool, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.f20252id = null;
        } else {
            this.f20252id = num;
        }
        if ((i11 & 2) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i11 & 4) == 0) {
            this.isCategoryPopular = null;
        } else {
            this.isCategoryPopular = bool;
        }
    }

    public static /* synthetic */ InstamartCategories copy$default(InstamartCategories instamartCategories, Integer num, String str, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = instamartCategories.f20252id;
        }
        if ((i11 & 2) != 0) {
            str = instamartCategories.name;
        }
        if ((i11 & 4) != 0) {
            bool = instamartCategories.isCategoryPopular;
        }
        return instamartCategories.copy(num, str, bool);
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void isCategoryPopular$annotations() {
    }

    public static final void write$Self(InstamartCategories instamartCategories, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartCategories, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || instamartCategories.f20252id != null) {
            dVar.E(serialDescriptor, 0, w.f23130b, instamartCategories.f20252id);
        }
        if (dVar.o(serialDescriptor, 1) || instamartCategories.name != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, instamartCategories.name);
        }
        if (dVar.o(serialDescriptor, 2) || instamartCategories.isCategoryPopular != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 2, h.f23089b, instamartCategories.isCategoryPopular);
        }
    }

    public final Integer component1() {
        return this.f20252id;
    }

    public final String component2() {
        return this.name;
    }

    public final Boolean component3() {
        return this.isCategoryPopular;
    }

    public final InstamartCategories copy(Integer num, String str, Boolean bool) {
        return new InstamartCategories(num, str, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstamartCategories)) {
            return false;
        }
        InstamartCategories instamartCategories = (InstamartCategories) obj;
        return p.e(this.f20252id, instamartCategories.f20252id) && p.e(this.name, instamartCategories.name) && p.e(this.isCategoryPopular, instamartCategories.isCategoryPopular);
    }

    public final Integer getId() {
        return this.f20252id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        Integer num = this.f20252id;
        int i11 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isCategoryPopular;
        if (bool != null) {
            i11 = bool.hashCode();
        }
        return hashCode2 + i11;
    }

    public final Boolean isCategoryPopular() {
        return this.isCategoryPopular;
    }

    public String toString() {
        return "InstamartCategories(id=" + this.f20252id + ", name=" + this.name + ", isCategoryPopular=" + this.isCategoryPopular + ')';
    }

    public InstamartCategories(Integer num, String str, Boolean bool) {
        this.f20252id = num;
        this.name = str;
        this.isCategoryPopular = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstamartCategories(Integer num, String str, Boolean bool, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : bool);
    }
}
