package ih0;

import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.feature.search.models.network.response.suggestions.SearchSuggestionResponseItem;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: OrderSubscriptionData.kt */
public final class a {
    @SerializedName("plan_details")

    /* renamed from: a  reason: collision with root package name */
    private final C0226a f18422a;

    public a() {
        this((C0226a) null, 1, (i) null);
    }

    public a(C0226a aVar) {
        this.f18422a = aVar;
    }

    public final C0226a a() {
        return this.f18422a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(C0226a aVar, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : aVar);
    }

    /* renamed from: ih0.a$a  reason: collision with other inner class name */
    /* compiled from: OrderSubscriptionData.kt */
    public static final class C0226a {
        @SerializedName("cta")

        /* renamed from: a  reason: collision with root package name */
        private final SearchSuggestionResponseItem.Cta f18423a;
        @SerializedName("id")

        /* renamed from: b  reason: collision with root package name */
        private final Long f18424b;
        @SerializedName("plan_confirmation_cta")

        /* renamed from: c  reason: collision with root package name */
        private final SearchSuggestionResponseItem.Cta f18425c;

        public C0226a() {
            this((SearchSuggestionResponseItem.Cta) null, (Long) null, (SearchSuggestionResponseItem.Cta) null, 7, (i) null);
        }

        public C0226a(SearchSuggestionResponseItem.Cta cta, Long l11, SearchSuggestionResponseItem.Cta cta2) {
            this.f18423a = cta;
            this.f18424b = l11;
            this.f18425c = cta2;
        }

        public final SearchSuggestionResponseItem.Cta a() {
            return this.f18423a;
        }

        public final SearchSuggestionResponseItem.Cta b() {
            return this.f18425c;
        }

        public final Long c() {
            return this.f18424b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0226a)) {
                return false;
            }
            C0226a aVar = (C0226a) obj;
            return p.e(this.f18423a, aVar.f18423a) && p.e(this.f18424b, aVar.f18424b) && p.e(this.f18425c, aVar.f18425c);
        }

        public int hashCode() {
            SearchSuggestionResponseItem.Cta cta = this.f18423a;
            int i11 = 0;
            int hashCode = (cta == null ? 0 : cta.hashCode()) * 31;
            Long l11 = this.f18424b;
            int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            SearchSuggestionResponseItem.Cta cta2 = this.f18425c;
            if (cta2 != null) {
                i11 = cta2.hashCode();
            }
            return hashCode2 + i11;
        }

        public String toString() {
            return "PlanDetails(cta=" + this.f18423a + ", planId=" + this.f18424b + ", planConfirmationCta=" + this.f18425c + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0226a(SearchSuggestionResponseItem.Cta cta, Long l11, SearchSuggestionResponseItem.Cta cta2, int i11, i iVar) {
            this((i11 & 1) != 0 ? null : cta, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : cta2);
        }
    }
}
