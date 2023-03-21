package in.swiggy.android.tejas.feature.instamart.model.cartdata;

import com.google.gson.annotations.SerializedName;
import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import fq0.d;
import gq0.x0;
import in.swiggy.android.tejas.feature.menu.MenuConstants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: InstamartCallouts.kt */
public final class InstamartCallouts {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("body")
    private final String body;
    @SerializedName("enabled")
    private final boolean enabled;
    @SerializedName("forward")
    private final boolean forward;
    @SerializedName("icon")
    private final String icon;
    @SerializedName("placement")
    private final String placement;
    @SerializedName("reason")
    private final String reason;
    @SerializedName("title")
    private final String title;
    @SerializedName("type")
    private final String type;

    /* compiled from: InstamartCallouts.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartCallouts> serializer() {
            return InstamartCallouts$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InstamartCallouts(int i11, String str, String str2, String str3, String str4, String str5, String str6, boolean z11, boolean z12, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.type = str;
            if ((i11 & 2) != 0) {
                this.icon = str2;
                if ((i11 & 4) != 0) {
                    this.placement = str3;
                    if ((i11 & 8) != 0) {
                        this.title = str4;
                        if ((i11 & 16) != 0) {
                            this.body = str5;
                            if ((i11 & 32) != 0) {
                                this.reason = str6;
                                if ((i11 & 64) != 0) {
                                    this.enabled = z11;
                                    if ((i11 & 128) != 0) {
                                        this.forward = z12;
                                        return;
                                    }
                                    throw new MissingFieldException("forward");
                                }
                                throw new MissingFieldException("enabled");
                            }
                            throw new MissingFieldException(ECommerceParamNames.REASON);
                        }
                        throw new MissingFieldException("body");
                    }
                    throw new MissingFieldException("title");
                }
                throw new MissingFieldException("placement");
            }
            throw new MissingFieldException(MenuConstants.MENU_OFFER_ICON);
        }
        throw new MissingFieldException("type");
    }

    public static /* synthetic */ InstamartCallouts copy$default(InstamartCallouts instamartCallouts, String str, String str2, String str3, String str4, String str5, String str6, boolean z11, boolean z12, int i11, Object obj) {
        InstamartCallouts instamartCallouts2 = instamartCallouts;
        int i12 = i11;
        return instamartCallouts.copy((i12 & 1) != 0 ? instamartCallouts2.type : str, (i12 & 2) != 0 ? instamartCallouts2.icon : str2, (i12 & 4) != 0 ? instamartCallouts2.placement : str3, (i12 & 8) != 0 ? instamartCallouts2.title : str4, (i12 & 16) != 0 ? instamartCallouts2.body : str5, (i12 & 32) != 0 ? instamartCallouts2.reason : str6, (i12 & 64) != 0 ? instamartCallouts2.enabled : z11, (i12 & 128) != 0 ? instamartCallouts2.forward : z12);
    }

    public static /* synthetic */ void getBody$annotations() {
    }

    public static /* synthetic */ void getEnabled$annotations() {
    }

    public static /* synthetic */ void getForward$annotations() {
    }

    public static /* synthetic */ void getIcon$annotations() {
    }

    public static /* synthetic */ void getPlacement$annotations() {
    }

    public static /* synthetic */ void getReason$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final void write$Self(InstamartCallouts instamartCallouts, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartCallouts, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, instamartCallouts.type);
        dVar.n(serialDescriptor, 1, instamartCallouts.icon);
        dVar.n(serialDescriptor, 2, instamartCallouts.placement);
        dVar.n(serialDescriptor, 3, instamartCallouts.title);
        dVar.n(serialDescriptor, 4, instamartCallouts.body);
        dVar.n(serialDescriptor, 5, instamartCallouts.reason);
        dVar.m(serialDescriptor, 6, instamartCallouts.enabled);
        dVar.m(serialDescriptor, 7, instamartCallouts.forward);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.icon;
    }

    public final String component3() {
        return this.placement;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.body;
    }

    public final String component6() {
        return this.reason;
    }

    public final boolean component7() {
        return this.enabled;
    }

    public final boolean component8() {
        return this.forward;
    }

    public final InstamartCallouts copy(String str, String str2, String str3, String str4, String str5, String str6, boolean z11, boolean z12) {
        p.j(str, "type");
        p.j(str2, MenuConstants.MENU_OFFER_ICON);
        p.j(str3, "placement");
        p.j(str4, "title");
        p.j(str5, "body");
        String str7 = str6;
        p.j(str7, ECommerceParamNames.REASON);
        return new InstamartCallouts(str, str2, str3, str4, str5, str7, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstamartCallouts)) {
            return false;
        }
        InstamartCallouts instamartCallouts = (InstamartCallouts) obj;
        return p.e(this.type, instamartCallouts.type) && p.e(this.icon, instamartCallouts.icon) && p.e(this.placement, instamartCallouts.placement) && p.e(this.title, instamartCallouts.title) && p.e(this.body, instamartCallouts.body) && p.e(this.reason, instamartCallouts.reason) && this.enabled == instamartCallouts.enabled && this.forward == instamartCallouts.forward;
    }

    public final String getBody() {
        return this.body;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getForward() {
        return this.forward;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.type.hashCode() * 31) + this.icon.hashCode()) * 31) + this.placement.hashCode()) * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31) + this.reason.hashCode()) * 31;
        boolean z11 = this.enabled;
        boolean z12 = true;
        if (z11) {
            z11 = true;
        }
        int i11 = (hashCode + (z11 ? 1 : 0)) * 31;
        boolean z13 = this.forward;
        if (!z13) {
            z12 = z13;
        }
        return i11 + (z12 ? 1 : 0);
    }

    public String toString() {
        return "InstamartCallouts(type=" + this.type + ", icon=" + this.icon + ", placement=" + this.placement + ", title=" + this.title + ", body=" + this.body + ", reason=" + this.reason + ", enabled=" + this.enabled + ", forward=" + this.forward + ')';
    }

    public InstamartCallouts(String str, String str2, String str3, String str4, String str5, String str6, boolean z11, boolean z12) {
        p.j(str, "type");
        p.j(str2, MenuConstants.MENU_OFFER_ICON);
        p.j(str3, "placement");
        p.j(str4, "title");
        p.j(str5, "body");
        p.j(str6, ECommerceParamNames.REASON);
        this.type = str;
        this.icon = str2;
        this.placement = str3;
        this.title = str4;
        this.body = str5;
        this.reason = str6;
        this.enabled = z11;
        this.forward = z12;
    }
}
