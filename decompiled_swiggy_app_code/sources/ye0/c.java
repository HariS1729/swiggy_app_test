package ye0;

import in.swiggy.android.tejas.feature.instamart.model.cartdata.GetIMCartData;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartStoresInfo;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItem;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemVariation;
import in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem;
import in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartPrice;
import in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartVariation;
import in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuItem;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuPrice;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuVariation;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.p;
import os.u;

/* compiled from: InstamartCartUtils.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f20013a = new c();

    private c() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r3 = r3.get(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final double b(in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItem r10) {
        /*
            r9 = this;
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata r0 = r10.getMetadata()
            r1 = 0
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.List r3 = r0.getVariations()
            r4 = 0
            if (r3 != 0) goto L_0x0012
        L_0x0010:
            r3 = r4
            goto L_0x0020
        L_0x0012:
            r5 = 0
            java.lang.Object r3 = r3.get(r5)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemVariation r3 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemVariation) r3
            if (r3 != 0) goto L_0x001c
            goto L_0x0010
        L_0x001c:
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice r3 = r3.getPrice()
        L_0x0020:
            if (r3 != 0) goto L_0x0024
            r5 = r4
            goto L_0x0028
        L_0x0024:
            java.lang.Double r5 = r3.getOfferPrice()
        L_0x0028:
            if (r5 != 0) goto L_0x0034
            if (r3 != 0) goto L_0x002d
            goto L_0x003a
        L_0x002d:
            java.lang.Double r3 = r3.getStorePrice()
            if (r3 != 0) goto L_0x003c
            goto L_0x003a
        L_0x0034:
            java.lang.Double r3 = r3.getOfferPrice()
            if (r3 != 0) goto L_0x003c
        L_0x003a:
            r5 = r1
            goto L_0x0040
        L_0x003c:
            double r5 = r3.doubleValue()
        L_0x0040:
            java.util.List r0 = r0.getVariations()
            if (r0 != 0) goto L_0x004a
            java.util.List r0 = kotlin.collections.k.j()
        L_0x004a:
            java.util.Iterator r0 = r0.iterator()
        L_0x004e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0098
            java.lang.Object r3 = r0.next()
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemVariation r3 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemVariation) r3
            java.lang.String r7 = r3.getId()
            java.lang.String r8 = r10.getItemId()
            boolean r7 = kotlin.jvm.internal.p.e(r7, r8)
            if (r7 == 0) goto L_0x004e
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice r5 = r3.getPrice()
            if (r5 != 0) goto L_0x0070
            r5 = r4
            goto L_0x0074
        L_0x0070:
            java.lang.Double r5 = r5.getOfferPrice()
        L_0x0074:
            if (r5 != 0) goto L_0x0084
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice r3 = r3.getPrice()
            if (r3 != 0) goto L_0x007d
            goto L_0x008a
        L_0x007d:
            java.lang.Double r3 = r3.getStorePrice()
            if (r3 != 0) goto L_0x0093
            goto L_0x008a
        L_0x0084:
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice r3 = r3.getPrice()
            if (r3 != 0) goto L_0x008c
        L_0x008a:
            r5 = r1
            goto L_0x004e
        L_0x008c:
            java.lang.Double r3 = r3.getOfferPrice()
            if (r3 != 0) goto L_0x0093
            goto L_0x008a
        L_0x0093:
            double r5 = r3.doubleValue()
            goto L_0x004e
        L_0x0098:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ye0.c.b(in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItem):double");
    }

    private final double e(MartMenuVariation martMenuVariation) {
        MartMenuPrice price = martMenuVariation.getPrice();
        return (price.getOfferPrice() > 0.0d ? 1 : (price.getOfferPrice() == 0.0d ? 0 : -1)) == 0 ? price.getStorePrice() : price.getOfferPrice();
    }

    private final InstamartItemVariation f(InstamartItem instamartItem) {
        List<InstamartItemVariation> variations;
        InstamartItemMetadata metadata = instamartItem.getMetadata();
        T t = null;
        if (metadata == null || (variations = metadata.getVariations()) == null) {
            return null;
        }
        Iterator<T> it2 = variations.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            if (p.e(((InstamartItemVariation) next).getId(), instamartItem.getItemId())) {
                t = next;
                break;
            }
        }
        return (InstamartItemVariation) t;
    }

    public final String a(GetIMCartData getIMCartData) {
        p.j(getIMCartData, CardTypeAdapterFactory.DATA);
        InstamartCoupon coupon = getIMCartData.getCoupon();
        if (coupon == null) {
            return null;
        }
        return coupon.getCoupon();
    }

    public final LocalInstamartItem c(MartMenuItem martMenuItem, MartMenuVariation martMenuVariation, int i11) {
        MartMenuVariation martMenuVariation2 = martMenuVariation;
        p.j(martMenuItem, "item");
        p.j(martMenuVariation2, "variation");
        LocalInstamartPrice localInstamartPrice = new LocalInstamartPrice(martMenuVariation.getPrice());
        InstamartItemMeta instamartItemMeta = new InstamartItemMeta(martMenuVariation.getMeta());
        InstamartItemInventory instamartItemInventory = new InstamartItemInventory(martMenuVariation.getInventory());
        InstamartItemCartAllowedQty instamartItemCartAllowedQty = new InstamartItemCartAllowedQty(martMenuVariation.getCartAllowedQuantity());
        InstamartItemDimension instamartItemDimension = new InstamartItemDimension(martMenuVariation.getDimensions());
        SkuSlotInfo skuSlotInfo = new SkuSlotInfo(martMenuVariation.getSkuSlotInfo());
        SkuSlotInfo skuSlotInfo2 = skuSlotInfo;
        LocalInstamartVariation localInstamartVariation = new LocalInstamartVariation(false, martMenuVariation.getId(), martMenuVariation.getDisplayName(), martMenuVariation.getSpin(), localInstamartPrice, martMenuVariation.getQuantity(), instamartItemInventory, instamartItemCartAllowedQty, Integer.valueOf(martMenuVariation.getMaxAllowedQuantity()), Integer.valueOf(martMenuVariation.getWeightInGrams()), martMenuVariation.getSubCategoryType(), instamartItemDimension, instamartItemMeta, martMenuVariation.getImages(), skuSlotInfo2);
        return new LocalInstamartItem("structure", i11, martMenuVariation.getId(), martMenuItem.getProductId(), martMenuVariation.getSpin(), e(martMenuVariation2), localInstamartVariation, false);
    }

    public final HashMap<String, LocalInstamartItem> d(GetIMCartData getIMCartData) {
        String str;
        String str2;
        String str3;
        String str4;
        p.j(getIMCartData, CardTypeAdapterFactory.DATA);
        HashMap<String, LocalInstamartItem> hashMap = new HashMap<>();
        for (InstamartItem next : getIMCartData.getItems()) {
            InstamartItemMetadata metadata = next.getMetadata();
            if (metadata != null) {
                c cVar = f20013a;
                double b11 = cVar.b(next);
                InstamartItemVariation f11 = cVar.f(next);
                if (f11 != null) {
                    LocalInstamartPrice localInstamartPrice = new LocalInstamartPrice(f11.getPrice());
                    Boolean bool = f11.getDefault();
                    boolean booleanValue = bool == null ? false : bool.booleanValue();
                    String id2 = f11.getId();
                    String str5 = id2 == null ? "" : id2;
                    String displayName = f11.getDisplayName();
                    if (displayName == null) {
                        str = "";
                    } else {
                        str = displayName;
                    }
                    String spin = f11.getSpin();
                    if (spin == null) {
                        str2 = "";
                    } else {
                        str2 = spin;
                    }
                    LocalInstamartVariation localInstamartVariation = new LocalInstamartVariation(booleanValue, str5, str, str2, localInstamartPrice, f11.getQuantity(), f11.getInventory(), f11.getCartAllowedQuantity(), f11.getMaxAllowedQuantity(), f11.getWeightInGrams(), f11.getSubCategoryType(), f11.getDimensions(), f11.getMeta(), f11.getImages(), f11.getSkuSlotInfo());
                    Integer quantity = next.getQuantity();
                    int intValue = quantity == null ? 0 : quantity.intValue();
                    String itemId = next.getItemId();
                    if (itemId == null) {
                        str3 = "";
                    } else {
                        str3 = itemId;
                    }
                    String productId = metadata.getProductId();
                    if (productId == null) {
                        productId = "";
                    }
                    String spin2 = localInstamartVariation.getSpin();
                    if (spin2 == null) {
                        str4 = "";
                    } else {
                        str4 = spin2;
                    }
                    Boolean freebie = next.getFreebie();
                    LocalInstamartItem localInstamartItem = new LocalInstamartItem("structure", intValue, str3, productId, str4, b11, localInstamartVariation, freebie == null ? false : freebie.booleanValue());
                    LocalInstamartItem put = hashMap.put(localInstamartItem.getItemId(), localInstamartItem);
                }
            }
        }
        return hashMap;
    }

    public final String g(GetIMCartData getIMCartData) {
        p.j(getIMCartData, CardTypeAdapterFactory.DATA);
        try {
            return String.valueOf(((InstamartStoresInfo) s.W(getIMCartData.getStoresInfo())).getId());
        } catch (Exception e11) {
            u.h("InstamartCartUtils", e11);
            return "";
        }
    }

    public final String h(GetIMCartData getIMCartData) {
        p.j(getIMCartData, CardTypeAdapterFactory.DATA);
        try {
            String imageId = ((InstamartStoresInfo) s.W(getIMCartData.getStoresInfo())).getImageId();
            return imageId == null ? "" : imageId;
        } catch (Exception e11) {
            u.h("InstamartCartUtils", e11);
            return "";
        }
    }
}
