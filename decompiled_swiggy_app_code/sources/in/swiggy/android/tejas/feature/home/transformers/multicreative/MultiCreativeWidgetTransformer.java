package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.ImageInfoLayoutCard;
import com.swiggy.gandalf.widgets.v2.Layout;
import com.swiggy.gandalf.widgets.v2.MultiTypeCreativeInfoWithStyle;
import com.swiggy.gandalf.widgets.v2.Tab;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.AutoscrollConfig;
import in.swiggy.android.tejas.feature.home.model.multicreative.MultiCreativeCard;
import in.swiggy.android.tejas.feature.home.model.multicreative.MulticreativeInfo;
import in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle;
import in.swiggy.android.tejas.feature.listing.grid.transformer.v2.GridPaddingTransformer;
import in.swiggy.android.tejas.feature.listing.navigation.model.TabEntity;
import in.swiggy.android.tejas.feature.listing.navigation.transformers.TabEntityTransformer;
import in.swiggy.android.tejas.payment.model.payment.models.PaymentType;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: MultiCreativeWidgetTransformer.kt */
public final class MultiCreativeWidgetTransformer implements ITransformer<MultiTypeCreativeInfoWithStyle, MulticreativeInfo> {
    private final ITransformer<Layout.AutoScrollConfig, AutoscrollConfig> autoscrollTransformer;
    private MultiCreativeCardFactory factory;
    private final GridPaddingTransformer gridPaddingTransformer;
    private final ITransformer<ImageInfoLayoutCard.ItemStyle, ItemStyle> itemStyleTransformer;
    private final TabEntityTransformer tabEntityTransformer;

    public MultiCreativeWidgetTransformer(ITransformer<ImageInfoLayoutCard.ItemStyle, ItemStyle> iTransformer, MultiCreativeCardFactory multiCreativeCardFactory, TabEntityTransformer tabEntityTransformer2, ITransformer<Layout.AutoScrollConfig, AutoscrollConfig> iTransformer2, GridPaddingTransformer gridPaddingTransformer2) {
        p.j(iTransformer, "itemStyleTransformer");
        p.j(multiCreativeCardFactory, "factory");
        p.j(tabEntityTransformer2, "tabEntityTransformer");
        p.j(iTransformer2, "autoscrollTransformer");
        p.j(gridPaddingTransformer2, "gridPaddingTransformer");
        this.itemStyleTransformer = iTransformer;
        this.factory = multiCreativeCardFactory;
        this.tabEntityTransformer = tabEntityTransformer2;
        this.autoscrollTransformer = iTransformer2;
        this.gridPaddingTransformer = gridPaddingTransformer2;
    }

    public MulticreativeInfo transform(MultiTypeCreativeInfoWithStyle multiTypeCreativeInfoWithStyle) {
        p.j(multiTypeCreativeInfoWithStyle, t.V);
        ITransformer<ImageInfoLayoutCard.ItemStyle, ItemStyle> iTransformer = this.itemStyleTransformer;
        ImageInfoLayoutCard.ItemStyle style = multiTypeCreativeInfoWithStyle.getStyle();
        p.i(style, "t.style");
        ItemStyle transform = iTransformer.transform(style);
        ArrayList arrayList = new ArrayList();
        List<MultiTypeCreativeInfoWithStyle.MultiTypeCreative> infoList = multiTypeCreativeInfoWithStyle.getInfoList();
        p.i(infoList, "t.infoList");
        for (MultiTypeCreativeInfoWithStyle.MultiTypeCreative multiTypeCreative : infoList) {
            MultiCreativeCardFactory multiCreativeCardFactory = this.factory;
            p.i(multiTypeCreative, PaymentType.CARD_GROUP);
            MultiCreativeCard card = multiCreativeCardFactory.getCard(multiTypeCreative);
            if (card != null) {
                arrayList.add(card);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        List<Tab> tabsList = multiTypeCreativeInfoWithStyle.getTabsList();
        p.i(tabsList, "t.tabsList");
        for (Tab tab : tabsList) {
            TabEntityTransformer tabEntityTransformer2 = this.tabEntityTransformer;
            p.i(tab, "tab");
            TabEntity transform2 = tabEntityTransformer2.transform(tab);
            if (transform2 != null) {
                arrayList2.add(transform2);
            }
        }
        ITransformer<Layout.AutoScrollConfig, AutoscrollConfig> iTransformer2 = this.autoscrollTransformer;
        Layout.AutoScrollConfig imageScrollConfig = multiTypeCreativeInfoWithStyle.getCreativeScrollConfig().getImageScrollConfig();
        p.i(imageScrollConfig, "t.creativeScrollConfig.imageScrollConfig");
        AutoscrollConfig transform3 = iTransformer2.transform(imageScrollConfig);
        if (!arrayList.isEmpty()) {
            return new MulticreativeInfo(arrayList, arrayList2, transform, transform3, this.gridPaddingTransformer.transform(multiTypeCreativeInfoWithStyle.getLayout().getWidgetPadding()));
        }
        return null;
    }
}
