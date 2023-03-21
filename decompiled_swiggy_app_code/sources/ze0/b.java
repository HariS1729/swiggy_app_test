package ze0;

import af0.e;
import bp0.k;
import in.swiggy.android.repositories.cart.interfaces.ICartValidator$CartValidationFailType;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.GetIMCartData;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartMetaData;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartSuperData;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.MetaDataValues;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension;
import in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuItem;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuVariation;
import io.reactivex.processors.PublishProcessor;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.p;
import lp0.l;
import xe0.j;
import ye0.c;

/* compiled from: InstamartCart.kt */
public final class b implements bf0.b, e {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, LocalInstamartItem> f20053a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private double f20054b;

    /* renamed from: c  reason: collision with root package name */
    private int f20055c;

    /* renamed from: d  reason: collision with root package name */
    private String f20056d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f20057e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f20058f;

    /* renamed from: g  reason: collision with root package name */
    private String f20059g;

    /* renamed from: h  reason: collision with root package name */
    private Boolean f20060h;

    /* renamed from: i  reason: collision with root package name */
    private String f20061i;
    private String j;
    private String k;

    /* renamed from: l  reason: collision with root package name */
    private transient PublishProcessor<LocalInstamartItem> f20062l;

    /* renamed from: m  reason: collision with root package name */
    private final transient PublishProcessor<k> f20063m;

    public b() {
        PublishProcessor<LocalInstamartItem> z02 = PublishProcessor.z0();
        p.i(z02, "create()");
        this.f20062l = z02;
        PublishProcessor<k> z03 = PublishProcessor.z0();
        p.i(z03, "create<Unit>()");
        this.f20063m = z03;
    }

    private final LocalInstamartItem A(MartMenuVariation martMenuVariation) {
        if (this.f20053a.containsKey(martMenuVariation.getId())) {
            return (LocalInstamartItem) x.g(this.f20053a, martMenuVariation.getId());
        }
        return null;
    }

    private final int C(LocalInstamartItem localInstamartItem) {
        int i11;
        Integer volumeInCc;
        InstamartItemDimension dimensions = localInstamartItem.getVariation().getDimensions();
        int i12 = 0;
        if (dimensions == null) {
            i11 = 0;
        } else {
            Integer widthInCm = dimensions.getWidthInCm();
            int intValue = widthInCm == null ? 0 : widthInCm.intValue();
            Integer heightInCm = dimensions.getHeightInCm();
            int intValue2 = intValue * (heightInCm == null ? 0 : heightInCm.intValue());
            Integer lengthInCm = dimensions.getLengthInCm();
            i11 = intValue2 * (lengthInCm == null ? 0 : lengthInCm.intValue());
        }
        InstamartItemDimension dimensions2 = localInstamartItem.getVariation().getDimensions();
        int intValue3 = (dimensions2 == null || (volumeInCc = dimensions2.getVolumeInCc()) == null) ? 0 : volumeInCc.intValue();
        int quantity = localInstamartItem.getQuantity();
        if (i11 == 0) {
            if (intValue3 != 0) {
                i11 = intValue3;
            } else {
                Integer weightInGrams = localInstamartItem.getVariation().getWeightInGrams();
                if (weightInGrams != null) {
                    i12 = weightInGrams.intValue();
                }
                i11 = i12 * 2;
            }
        }
        return quantity * i11;
    }

    private final void D() {
        this.f20063m.onNext(k.f22762a);
    }

    private final void E(LocalInstamartItem localInstamartItem) {
        this.f20062l.onNext(localInstamartItem);
    }

    private final void F(LocalInstamartItem localInstamartItem) {
        this.f20053a.remove(localInstamartItem.getItemId());
    }

    private final void H(GetIMCartData getIMCartData) {
        MetaDataValues values;
        InstamartSuperData superData = getIMCartData.getSuperData();
        Boolean bool = null;
        this.f20059g = superData == null ? null : superData.getSubscriptionPlanId();
        InstamartMetaData metaData = getIMCartData.getMetaData();
        if (!(metaData == null || (values = metaData.getValues()) == null)) {
            bool = values.getContactlessDelivery();
        }
        this.f20060h = bool;
        this.f20061i = getIMCartData.getAddressId();
        this.j = getIMCartData.getDeliveryType();
        this.k = getIMCartData.getSlotId();
        G(c.f20013a.g(getIMCartData));
    }

    private final void I(LocalInstamartItem localInstamartItem) {
        this.f20053a.put(localInstamartItem.getItemId(), localInstamartItem);
    }

    private final void J() {
        Collection<LocalInstamartItem> values = this.f20053a.values();
        p.i(values, "instamartItems.values");
        int i11 = 0;
        for (LocalInstamartItem quantity : values) {
            i11 += quantity.getQuantity();
        }
        this.f20055c = i11;
        Collection<LocalInstamartItem> values2 = this.f20053a.values();
        p.i(values2, "instamartItems.values");
        double d11 = 0.0d;
        for (LocalInstamartItem localInstamartItem : values2) {
            d11 += localInstamartItem.getPrice() * ((double) localInstamartItem.getQuantity());
        }
        this.f20054b = d11;
    }

    private final void a(String str) {
        if (o.A(this.f20057e)) {
            j.f19986a.a(str, this.f20053a.isEmpty());
        }
    }

    private final void u() {
        this.f20053a = new HashMap<>();
        this.f20054b = 0.0d;
        this.f20055c = 0;
        this.f20056d = "";
        this.f20058f = null;
        this.f20059g = null;
        this.f20060h = null;
        this.f20061i = null;
        this.j = null;
        this.k = null;
    }

    public final int B() {
        return this.f20055c;
    }

    public final void G(String str) {
        p.j(str, "<set-?>");
        this.f20057e = str;
    }

    public void b() {
        u();
        D();
    }

    public double c(MartMenuItem martMenuItem) {
        p.j(martMenuItem, "item");
        double d11 = 0.0d;
        for (MartMenuVariation next : martMenuItem.getVariations()) {
            Collection<LocalInstamartItem> values = this.f20053a.values();
            p.i(values, "instamartItems.values");
            double d12 = 0.0d;
            for (LocalInstamartItem localInstamartItem : values) {
                d12 += p.e(next.getId(), localInstamartItem.getItemId()) ? ((double) localInstamartItem.getQuantity()) * localInstamartItem.getPrice() : 0.0d;
            }
            d11 += d12;
        }
        return d11;
    }

    public List<LocalInstamartItem> d() {
        Collection<LocalInstamartItem> values = this.f20053a.values();
        p.i(values, "instamartItems.values");
        return s.E0(values);
    }

    public int e(MartMenuVariation martMenuVariation) {
        p.j(martMenuVariation, "variation");
        if (this.f20053a.containsKey(martMenuVariation.getId())) {
            return ((LocalInstamartItem) x.g(this.f20053a, martMenuVariation.getId())).getQuantity();
        }
        return 0;
    }

    public int f(MartMenuItem martMenuItem) {
        p.j(martMenuItem, "item");
        int i11 = 0;
        for (MartMenuVariation next : martMenuItem.getVariations()) {
            Collection<LocalInstamartItem> values = this.f20053a.values();
            p.i(values, "instamartItems.values");
            int i12 = 0;
            for (LocalInstamartItem localInstamartItem : values) {
                i12 += p.e(next.getId(), localInstamartItem.getItemId()) ? localInstamartItem.getQuantity() : 0;
            }
            i11 += i12;
        }
        return i11;
    }

    public boolean g() {
        return this.f20055c == 0;
    }

    public String getCouponCode() {
        return this.f20058f;
    }

    public void h(GetIMCartData getIMCartData) {
        if (getIMCartData != null) {
            c cVar = c.f20013a;
            this.f20056d = cVar.h(getIMCartData);
            this.f20058f = cVar.a(getIMCartData);
            this.f20053a = cVar.d(getIMCartData);
            H(getIMCartData);
            a("setInstamartCartData");
            J();
            D();
        }
    }

    public String i() {
        return this.f20059g;
    }

    public String j() {
        return this.k;
    }

    public int k() {
        return this.f20055c;
    }

    public void l(MartMenuItem martMenuItem, MartMenuVariation martMenuVariation) {
        p.j(martMenuItem, "item");
        p.j(martMenuVariation, "variation");
        LocalInstamartItem A = A(martMenuVariation);
        int quantity = A == null ? 0 : A.getQuantity();
        LocalInstamartItem c11 = c.f20013a.c(martMenuItem, martMenuVariation, quantity - 1);
        if (quantity > 1) {
            I(c11);
        } else if (quantity == 1) {
            F(c11);
        }
        J();
        E(c11);
    }

    public void m(MartMenuItem martMenuItem, MartMenuVariation martMenuVariation, l<? super ICartValidator$CartValidationFailType, k> lVar) {
        p.j(martMenuItem, "item");
        p.j(martMenuVariation, "variation");
        this.f20056d = martMenuItem.getStoreInfo().getStoreDetails().getImageId();
        this.f20057e = martMenuItem.getStoreInfo().getStoreDetails().getId();
        LocalInstamartItem A = A(martMenuVariation);
        LocalInstamartItem c11 = c.f20013a.c(martMenuItem, martMenuVariation, (A == null ? 0 : A.getQuantity()) + 1);
        I(c11);
        a("incrementInstamartItemInCart");
        J();
        E(c11);
    }

    public String n() {
        return this.f20056d;
    }

    public void o(GetIMCartData getIMCartData) {
        if (getIMCartData != null) {
            c cVar = c.f20013a;
            this.f20056d = cVar.h(getIMCartData);
            this.f20058f = cVar.a(getIMCartData);
            H(getIMCartData);
            a("addInstamartCartData");
            Collection<LocalInstamartItem> values = cVar.d(getIMCartData).values();
            p.i(values, "newItems.values");
            for (LocalInstamartItem localInstamartItem : values) {
                HashMap<String, LocalInstamartItem> z11 = z();
                String itemId = localInstamartItem.getItemId();
                p.i(localInstamartItem, "it");
                z11.put(itemId, localInstamartItem);
            }
            D();
            Collection<LocalInstamartItem> values2 = this.f20053a.values();
            p.i(values2, "instamartItems.values");
            for (LocalInstamartItem localInstamartItem2 : values2) {
                p.i(localInstamartItem2, "it");
                E(localInstamartItem2);
            }
            J();
        }
    }

    public String p() {
        return this.f20057e;
    }

    public double q() {
        return this.f20054b;
    }

    public String r() {
        return this.j;
    }

    public Boolean s() {
        return this.f20060h;
    }

    public String t() {
        return this.f20061i;
    }

    public final PublishProcessor<LocalInstamartItem> v() {
        return this.f20062l;
    }

    public final PublishProcessor<k> w() {
        return this.f20063m;
    }

    public final int x() {
        Collection<LocalInstamartItem> values = this.f20053a.values();
        p.i(values, "instamartItems.values");
        int i11 = 0;
        for (LocalInstamartItem localInstamartItem : values) {
            p.i(localInstamartItem, "item");
            i11 += C(localInstamartItem);
        }
        return i11;
    }

    public final int y() {
        Collection<LocalInstamartItem> values = this.f20053a.values();
        p.i(values, "instamartItems.values");
        int i11 = 0;
        for (LocalInstamartItem localInstamartItem : values) {
            Integer weightInGrams = localInstamartItem.getVariation().getWeightInGrams();
            i11 += (weightInGrams == null ? 0 : weightInGrams.intValue()) * localInstamartItem.getQuantity();
        }
        return i11;
    }

    public final HashMap<String, LocalInstamartItem> z() {
        return this.f20053a;
    }
}
