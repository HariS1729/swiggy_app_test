package in.swiggy.android.tejas.feature.home.model;

import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.agentdata.HexAttribute;
import in.swiggy.android.tejas.feature.listing.relevance.model.Relevance;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: CardFYISmall.kt */
public final class CardFYISmall extends ListingCard {
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f20238id;
    @SerializedName("imageId")
    private final String imageId;
    @SerializedName("message")
    private final String message;
    @SerializedName("widgetId")
    private String widgetId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardFYISmall(String str, String str2, String str3, String str4, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, str3, (i11 & 8) != 0 ? null : str4);
    }

    public final String getId() {
        return this.f20238id;
    }

    public final String getImageId() {
        return this.imageId;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public final void setWidgetId(String str) {
        this.widgetId = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardFYISmall(String str, String str2, String str3, String str4) {
        super((Relevance) null, 1, (i) null);
        p.j(str3, HexAttribute.HEX_ATTR_MESSAGE);
        this.f20238id = str;
        this.imageId = str2;
        this.message = str3;
        this.widgetId = str4;
    }
}
