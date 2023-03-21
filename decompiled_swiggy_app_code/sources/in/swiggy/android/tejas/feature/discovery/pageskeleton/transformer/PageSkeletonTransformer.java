package in.swiggy.android.tejas.feature.discovery.pageskeleton.transformer;

import com.swiggy.gandalf.widgets.v2.Card;
import com.swiggy.gandalf.widgets.v2.CardInfo;
import com.swiggy.gandalf.widgets.v2.GroupedCard;
import com.swiggy.gandalf.widgets.v2.Response;
import com.swiggy.gandalf.widgets.v2.SkeletonAPISuccessResponse;
import fp0.c;
import in.swiggy.android.tejas.coroutineUtils.FlowModelTransformer;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.model.PageSkeletonResponse;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.model.UxVersion;
import in.swiggy.android.tejas.feature.listing.ListingCardEntity;
import in.swiggy.android.tejas.feature.listing.metadata.model.RequestContextMetadata;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: PageSkeletonTransformer.kt */
public final class PageSkeletonTransformer extends FlowModelTransformer<Response, PageSkeletonResponse> {
    private final ITransformer<GroupedCard, List<ListingCardEntity<?>>> groupedResultTransformer;
    private final ITransformer<Response, RequestContextMetadata> requestMetadataTransformer;
    private final ITransformer<Card, List<ListingCardEntity<?>>> resultEntityFactory;

    /* compiled from: PageSkeletonTransformer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CardInfo.InfoCase.values().length];
            iArr[CardInfo.InfoCase.CARD.ordinal()] = 1;
            iArr[CardInfo.InfoCase.GROUPED_CARD.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SkeletonAPISuccessResponse.UXVersion.values().length];
            iArr2[SkeletonAPISuccessResponse.UXVersion.UX_VERSION_UX3.ordinal()] = 1;
            iArr2[SkeletonAPISuccessResponse.UXVersion.UX_VERSION_UX4.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public PageSkeletonTransformer(ITransformer<Card, List<ListingCardEntity<?>>> iTransformer, ITransformer<GroupedCard, List<ListingCardEntity<?>>> iTransformer2, ITransformer<Response, RequestContextMetadata> iTransformer3) {
        p.j(iTransformer, "resultEntityFactory");
        p.j(iTransformer2, "groupedResultTransformer");
        p.j(iTransformer3, "requestMetadataTransformer");
        this.resultEntityFactory = iTransformer;
        this.groupedResultTransformer = iTransformer2;
        this.requestMetadataTransformer = iTransformer3;
    }

    /* access modifiers changed from: private */
    public final PageSkeletonResponse transform(Response response) {
        int i11;
        UxVersion uxVersion;
        ArrayList arrayList = new ArrayList();
        UxVersion uxVersion2 = UxVersion.UX_VERSION_INVALID;
        SkeletonAPISuccessResponse skeleton = response.getSkeleton();
        List<CardInfo> cardsList = skeleton.getCardsList();
        p.i(cardsList, "skeleton.cardsList");
        Iterator<T> it2 = cardsList.iterator();
        while (true) {
            i11 = -1;
            if (!it2.hasNext()) {
                break;
            }
            CardInfo cardInfo = (CardInfo) it2.next();
            CardInfo.InfoCase infoCase = cardInfo.getInfoCase();
            if (infoCase != null) {
                i11 = WhenMappings.$EnumSwitchMapping$0[infoCase.ordinal()];
            }
            if (i11 == 1) {
                ITransformer<Card, List<ListingCardEntity<?>>> iTransformer = this.resultEntityFactory;
                Card card = cardInfo.getCard();
                p.i(card, "it.card");
                List transform = iTransformer.transform(card);
                if (transform != null) {
                    populateRequestMetadata(response, transform, arrayList);
                }
            } else if (i11 == 2) {
                ITransformer<GroupedCard, List<ListingCardEntity<?>>> iTransformer2 = this.groupedResultTransformer;
                GroupedCard groupedCard = cardInfo.getGroupedCard();
                p.i(groupedCard, "it.groupedCard");
                List transform2 = iTransformer2.transform(groupedCard);
                if (transform2 != null) {
                    populateRequestMetadata(response, transform2, arrayList);
                }
            }
        }
        SkeletonAPISuccessResponse.UXVersion version = skeleton.getVersion();
        if (version != null) {
            i11 = WhenMappings.$EnumSwitchMapping$1[version.ordinal()];
        }
        if (i11 == 1) {
            uxVersion = UxVersion.UX_VERSION_UX3;
        } else if (i11 != 2) {
            uxVersion = UxVersion.UX_VERSION_UX3;
        } else {
            uxVersion = UxVersion.UX_VERSION_UX4;
        }
        return new PageSkeletonResponse(arrayList, uxVersion, skeleton.getEnableFoodPrefetch());
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

    /* access modifiers changed from: protected */
    public d<in.swiggy.android.tejas.Response<PageSkeletonResponse>> execute(Response response) {
        p.j(response, "parameters");
        return f.x(new PageSkeletonTransformer$execute$1(response, this, (c<? super PageSkeletonTransformer$execute$1>) null));
    }
}
