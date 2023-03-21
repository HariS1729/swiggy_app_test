package in.swiggy.android.tejas.feature.discovery.pageskeleton.model;

import com.swiggy.gandalf.widgets.v2.BottomBar;
import com.swiggy.gandalf.widgets.v2.SkeletonAPISuccessResponse;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.feature.listing.cta.model.CtaMetaInfo;
import in.swiggy.android.tejas.feature.listing.searchbar.model.SearchBarEntity;
import in.swiggy.android.tejas.feature.listing.searchbar.model.SearchBarItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: SkeletonJsonResponse.kt */
public final class SkeletonJsonResponseKt {

    /* compiled from: SkeletonJsonResponse.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SkeletonAPISuccessResponse.UXVersion.values().length];
            iArr[SkeletonAPISuccessResponse.UXVersion.UX_VERSION_UX3.ordinal()] = 1;
            iArr[SkeletonAPISuccessResponse.UXVersion.UX_VERSION_UX4.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BottomBar.Options.Type.values().length];
            iArr2[BottomBar.Options.Type.TYPE_EXPANDABLE.ordinal()] = 1;
            iArr2[BottomBar.Options.Type.TYPE_INLINE.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final BottomBarInfo toInfo(SkeletonJsonResponse skeletonJsonResponse, Option option) {
        BottomBarType bottomBarType;
        SkeletonJsonResponse skeletonJsonResponse2 = skeletonJsonResponse;
        p.j(skeletonJsonResponse2, "<this>");
        p.j(option, "option");
        int i11 = WhenMappings.$EnumSwitchMapping$1[option.getType().ordinal()];
        if (i11 == 1) {
            bottomBarType = BottomBarType.TYPE_EXPANDABLE;
        } else if (i11 != 2) {
            bottomBarType = BottomBarType.TYPE_INVALID;
        } else {
            bottomBarType = BottomBarType.TYPE_INLINE;
        }
        BottomBarType bottomBarType2 = bottomBarType;
        ArrayList arrayList = new ArrayList();
        List<Option> options = option.getOptions();
        if (options != null) {
            for (Option info : options) {
                arrayList.add(toInfo(skeletonJsonResponse2, info));
            }
        }
        return new BottomBarInfo(bottomBarType2, option.getTitle(), option.getSubtitle(), option.getSelectedTextColor(), option.getUnselectedTextColor(), option.getSelectedImageId(), option.getUnSelectedImageId(), new CTA(option.getCta().getLink(), "", option.getCta().getType(), (CtaMetaInfo) null, 8, (i) null), arrayList, option.getUnselectedBackgroundColor(), option.getSelectedBackgroundColor(), option.getSelectedImageTint(), option.getAccessibilityData());
    }

    public static final PageSkeletonResponse toModel(SkeletonJsonResponse skeletonJsonResponse) {
        UxVersion uxVersion;
        p.j(skeletonJsonResponse, "<this>");
        ArrayList arrayList = new ArrayList();
        List<CardInfo> cardInfoList = skeletonJsonResponse.getCardInfoList();
        if (cardInfoList != null) {
            for (CardInfo card : cardInfoList) {
                CardData card2 = card.getCard().getCard();
                String type = card2.getType();
                if (p.e(type, CardType.TYPE_BOTTOM_BAR.getType())) {
                    List<Option> options = card2.getOptions();
                    if (options != null) {
                        for (Option info : options) {
                            arrayList.add(new BottomBarEntity(toInfo(skeletonJsonResponse, info)));
                        }
                    }
                } else if (p.e(type, CardType.TYPE_SEARCH_BAR.getType())) {
                    String placeholder = card2.getPlaceholder();
                    String str = placeholder == null ? "" : placeholder;
                    String category = card2.getCategory();
                    if (category == null) {
                        category = "";
                    }
                    arrayList.add(new SearchBarEntity(new SearchBarItem(str, category, (CTA) null, 4, (i) null)));
                }
            }
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[skeletonJsonResponse.getVersion().ordinal()];
        if (i11 == 1) {
            uxVersion = UxVersion.UX_VERSION_UX3;
        } else if (i11 != 2) {
            uxVersion = UxVersion.UX_VERSION_INVALID;
        } else {
            uxVersion = UxVersion.UX_VERSION_UX4;
        }
        Boolean enableFoodPrefetch = skeletonJsonResponse.getEnableFoodPrefetch();
        return new PageSkeletonResponse(arrayList, uxVersion, enableFoodPrefetch == null ? false : enableFoodPrefetch.booleanValue());
    }
}
