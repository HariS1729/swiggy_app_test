package in.swiggy.android.tejas.feature.listing;

import com.swiggy.gandalf.widgets.v2.Card;
import com.swiggy.gandalf.widgets.v2.CardInfo;
import com.swiggy.gandalf.widgets.v2.GroupedCard;
import com.swiggy.gandalf.widgets.v2.PageOffset;
import com.swiggy.gandalf.widgets.v2.Response;
import in.swiggy.android.tejas.feature.home.transformers.discovery.configs.HomeListingConfigFactory;
import in.swiggy.android.tejas.feature.listing.metadata.model.RequestContextMetadata;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ListingTransformer.kt */
public final class ListingTransformer implements ITransformer<Response, ListingResponse> {
    public static final Companion Companion = new Companion((i) null);
    public static final String TAG = "ListingTransformer";
    private final ITransformer<GroupedCard, List<ListingCardEntity<?>>> groupedResultTransformer;
    private final HomeListingConfigFactory homeListingConfigFactory;
    private final ITransformer<PageOffset, in.swiggy.android.tejas.feature.listing.pagination.model.PageOffset> pageOffsetTransformer;
    private final ITransformer<Response, RequestContextMetadata> requestMetadataTransformer;
    private final ITransformer<Card, List<ListingCardEntity<?>>> resultEntityFactory;

    /* compiled from: ListingTransformer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* compiled from: ListingTransformer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardInfo.InfoCase.values().length];
            iArr[CardInfo.InfoCase.CARD.ordinal()] = 1;
            iArr[CardInfo.InfoCase.GROUPED_CARD.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ListingTransformer(ITransformer<Card, List<ListingCardEntity<?>>> iTransformer, ITransformer<GroupedCard, List<ListingCardEntity<?>>> iTransformer2, ITransformer<PageOffset, in.swiggy.android.tejas.feature.listing.pagination.model.PageOffset> iTransformer3, ITransformer<Response, RequestContextMetadata> iTransformer4, HomeListingConfigFactory homeListingConfigFactory2) {
        p.j(iTransformer, "resultEntityFactory");
        p.j(iTransformer2, "groupedResultTransformer");
        p.j(iTransformer3, "pageOffsetTransformer");
        p.j(iTransformer4, "requestMetadataTransformer");
        p.j(homeListingConfigFactory2, "homeListingConfigFactory");
        this.resultEntityFactory = iTransformer;
        this.groupedResultTransformer = iTransformer2;
        this.pageOffsetTransformer = iTransformer3;
        this.requestMetadataTransformer = iTransformer4;
        this.homeListingConfigFactory = homeListingConfigFactory2;
    }

    public final void populateRequestMetadata(Response response, List<? extends ListingCardEntity<?>> list, ArrayList<ListingCardEntity<?>> arrayList) {
        p.j(response, "response");
        p.j(list, "cards");
        p.j(arrayList, "transformedCards");
        RequestContextMetadata transform = this.requestMetadataTransformer.transform(response);
        for (ListingCardEntity listingCardEntity : list) {
            if (transform != null) {
                listingCardEntity.setContextMetadata(transform);
            }
            arrayList.add(listingCardEntity);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.feature.listing.ListingResponse transform(com.swiggy.gandalf.widgets.v2.Response r12) {
        /*
            r11 = this;
            java.lang.String r0 = "t"
            kotlin.jvm.internal.p.j(r12, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.swiggy.gandalf.widgets.v2.SuccessResponse r0 = r12.getSuccess()
            java.util.List r0 = r0.getCardsList()
            java.lang.String r1 = "t.success.cardsList"
            kotlin.jvm.internal.p.i(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r1 = r0.hasNext()
            r3 = 1
            if (r1 == 0) goto L_0x006e
            java.lang.Object r1 = r0.next()
            com.swiggy.gandalf.widgets.v2.CardInfo r1 = (com.swiggy.gandalf.widgets.v2.CardInfo) r1
            com.swiggy.gandalf.widgets.v2.CardInfo$InfoCase r4 = r1.getInfoCase()
            if (r4 != 0) goto L_0x0030
            r4 = -1
            goto L_0x0038
        L_0x0030:
            int[] r5 = in.swiggy.android.tejas.feature.listing.ListingTransformer.WhenMappings.$EnumSwitchMapping$0
            int r4 = r4.ordinal()
            r4 = r5[r4]
        L_0x0038:
            if (r4 == r3) goto L_0x0056
            r3 = 2
            if (r4 == r3) goto L_0x003e
            goto L_0x001b
        L_0x003e:
            in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.GroupedCard, java.util.List<in.swiggy.android.tejas.feature.listing.ListingCardEntity<?>>> r3 = r11.groupedResultTransformer
            com.swiggy.gandalf.widgets.v2.GroupedCard r1 = r1.getGroupedCard()
            java.lang.String r4 = "it.groupedCard"
            kotlin.jvm.internal.p.i(r1, r4)
            java.lang.Object r1 = r3.transform(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x0052
            goto L_0x001b
        L_0x0052:
            r11.populateRequestMetadata(r12, r1, r2)
            goto L_0x001b
        L_0x0056:
            in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.Card, java.util.List<in.swiggy.android.tejas.feature.listing.ListingCardEntity<?>>> r3 = r11.resultEntityFactory
            com.swiggy.gandalf.widgets.v2.Card r1 = r1.getCard()
            java.lang.String r4 = "it.card"
            kotlin.jvm.internal.p.i(r1, r4)
            java.lang.Object r1 = r3.transform(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x006a
            goto L_0x001b
        L_0x006a:
            r11.populateRequestMetadata(r12, r1, r2)
            goto L_0x001b
        L_0x006e:
            in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.PageOffset, in.swiggy.android.tejas.feature.listing.pagination.model.PageOffset> r0 = r11.pageOffsetTransformer
            com.swiggy.gandalf.widgets.v2.SuccessResponse r1 = r12.getSuccess()
            com.swiggy.gandalf.widgets.v2.PageOffset r1 = r1.getPageOffset()
            java.lang.String r4 = "t.success.pageOffset"
            kotlin.jvm.internal.p.i(r1, r4)
            java.lang.Object r0 = r0.transform(r1)
            in.swiggy.android.tejas.feature.listing.pagination.model.PageOffset r0 = (in.swiggy.android.tejas.feature.listing.pagination.model.PageOffset) r0
            in.swiggy.android.tejas.feature.home.model.PaginationResponse r4 = new in.swiggy.android.tejas.feature.home.model.PaginationResponse
            r1 = 0
            if (r0 == 0) goto L_0x008a
            r5 = 1
            goto L_0x008b
        L_0x008a:
            r5 = 0
        L_0x008b:
            r6 = 0
            if (r0 != 0) goto L_0x0090
            r7 = r6
            goto L_0x0094
        L_0x0090:
            java.lang.String r7 = r0.getNextOffset()
        L_0x0094:
            com.swiggy.gandalf.widgets.v2.SuccessResponse r8 = r12.getSuccess()
            int r8 = r8.getNextFetch()
            r4.<init>(r5, r7, r8, r0)
            com.swiggy.gandalf.widgets.v2.SuccessResponse r0 = r12.getSuccess()
            java.util.Map r0 = r0.getConfigsMap()
            if (r0 != 0) goto L_0x00aa
            goto L_0x00cd
        L_0x00aa:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00b7:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00cd
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            in.swiggy.android.tejas.feature.home.transformers.discovery.configs.HomeListingConfigFactory r7 = r11.homeListingConfigFactory
            java.util.List r5 = r7.getConfigs(r5)
            boolean unused = kotlin.collections.p.z(r6, r5)
            goto L_0x00b7
        L_0x00cd:
            if (r6 != 0) goto L_0x00d4
            java.util.List r0 = kotlin.collections.k.j()
            goto L_0x00d5
        L_0x00d4:
            r0 = r6
        L_0x00d5:
            com.swiggy.gandalf.widgets.v2.SuccessResponse r5 = r12.getSuccess()
            com.swiggy.gandalf.widgets.v2.Communication r5 = r5.getCommunication()
            com.swiggy.gandalf.widgets.v2.SwiggyNotPresent r5 = r5.getSwiggyNotPresent()
            boolean r5 = r5.getSwiggyNotPresent()
            if (r5 != 0) goto L_0x010a
            com.swiggy.gandalf.widgets.v2.SuccessResponse r5 = r12.getSuccess()
            com.swiggy.gandalf.widgets.v2.Communication r5 = r5.getCommunication()
            com.swiggy.gandalf.widgets.v2.BlackZone r5 = r5.getBlackZone()
            java.lang.String r5 = r5.getMessage()
            java.lang.String r6 = "t.success.communication.blackZone.message"
            kotlin.jvm.internal.p.i(r5, r6)
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x0104
            r5 = 1
            goto L_0x0105
        L_0x0104:
            r5 = 0
        L_0x0105:
            if (r5 == 0) goto L_0x0108
            goto L_0x010a
        L_0x0108:
            r9 = 0
            goto L_0x010b
        L_0x010a:
            r9 = 1
        L_0x010b:
            in.swiggy.android.tejas.feature.listing.ListingResponse r10 = new in.swiggy.android.tejas.feature.listing.ListingResponse
            com.swiggy.gandalf.widgets.v2.SuccessResponse r3 = r12.getSuccess()
            int r3 = r3.getCacheExpiryTime()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r6 = r12.getRequestId()
            com.google.protobuf.Timestamp r3 = r12.getApiTime()
            long r7 = r3.getSeconds()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            com.swiggy.gandalf.widgets.v2.SuccessResponse r12 = r12.getSuccess()
            if (r12 != 0) goto L_0x0131
            r8 = 0
            goto L_0x0136
        L_0x0131:
            boolean r12 = r12.getFirstOffsetRequest()
            r8 = r12
        L_0x0136:
            r1 = r10
            r3 = r4
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.listing.ListingTransformer.transform(com.swiggy.gandalf.widgets.v2.Response):in.swiggy.android.tejas.feature.listing.ListingResponse");
    }
}
