package in.swiggy.android.tejas.feature.home.transformers;

import com.swiggy.gandalf.home.protobuf.PopCardDto;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.Availability;
import in.swiggy.android.tejas.feature.home.model.ItemPop;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: ItemPopTransformer.kt */
public final class ItemPopTransformer implements ITransformer<PopCardDto.Card, ItemPop> {
    public ItemPop transform(PopCardDto.Card card) {
        String str;
        p.j(card, t.V);
        String skuId = card.getSkuId();
        p.i(skuId, "t.skuId");
        String name = card.getName();
        p.i(name, "t.name");
        String description = card.getDescription();
        p.i(description, "t.description");
        String cloudinaryId = card.getCloudinaryId();
        p.i(cloudinaryId, "t.cloudinaryId");
        boolean showOutOfStock = card.getShowOutOfStock();
        String maxQuantityMessage = card.getMaxQuantityMessage();
        p.i(maxQuantityMessage, "t.maxQuantityMessage");
        String id2 = card.getDetails().getId();
        p.i(id2, "t.details.id");
        String name2 = card.getDetails().getName();
        p.i(name2, "t.details.name");
        float price = card.getPrice();
        float basePrice = card.getBasePrice();
        int maxQuantityAllowed = card.getMaxQuantityAllowed();
        int veg = card.getVeg();
        int i11 = veg != 0 ? veg != 1 ? veg != 2 ? 4 : 3 : 1 : 2;
        String serviceability = card.getDetails().getServiceability();
        p.i(serviceability, "t.details.serviceability");
        String upperCase = serviceability.toUpperCase();
        p.i(upperCase, "this as java.lang.String).toUpperCase()");
        boolean e11 = p.e(upperCase, "SERVICEABLE");
        String str2 = ItemPop.UNSERVICEABLE;
        if (e11) {
            str = "SERVICEABLE";
        } else {
            if (!p.e(upperCase, str2)) {
                str2 = ItemPop.OTHER;
            }
            str = str2;
        }
        boolean opened = card.getAvailability().getOpened();
        String nextOpenTime = card.getAvailability().getNextOpenTime();
        p.i(nextOpenTime, "t.availability.nextOpenTime");
        String nextCloseTime = card.getAvailability().getNextCloseTime();
        String str3 = str;
        p.i(nextCloseTime, "t.availability.nextCloseTime");
        String nextOpenMessage = card.getAvailability().getNextOpenMessage();
        p.i(nextOpenMessage, "t.availability.nextOpenMessage");
        return new ItemPop(skuId, name, description, cloudinaryId, showOutOfStock, maxQuantityMessage, id2, name2, price, basePrice, maxQuantityAllowed, i11, str3, new Availability(opened, nextOpenTime, nextCloseTime, nextOpenMessage, card.getAvailability().getInSlot()));
    }
}
