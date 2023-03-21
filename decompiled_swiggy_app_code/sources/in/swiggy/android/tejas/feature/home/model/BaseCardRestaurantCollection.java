package in.swiggy.android.tejas.feature.home.model;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.feature.listing.relevance.model.Relevance;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: BaseCardRestaurantCollection.kt */
public abstract class BaseCardRestaurantCollection extends ListingCard {
    private final CTA action;
    private final CardHeader header;

    /* renamed from: id  reason: collision with root package name */
    private final String f20236id;
    private final String theme;
    private String widgetId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseCardRestaurantCollection(String str, CardHeader cardHeader, CTA cta, String str2, String str3, Relevance relevance, int i11, i iVar) {
        this(str, cardHeader, cta, str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : relevance);
    }

    public final CTA getAction() {
        return this.action;
    }

    public final CardHeader getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.f20236id;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public final void setWidgetId(String str) {
        this.widgetId = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseCardRestaurantCollection(String str, CardHeader cardHeader, CTA cta, String str2, String str3, Relevance relevance) {
        super(relevance);
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "theme");
        this.f20236id = str;
        this.header = cardHeader;
        this.action = cta;
        this.theme = str2;
        this.widgetId = str3;
    }
}
