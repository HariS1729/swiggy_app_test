package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.presentation.stores.v1.DiscountInfo;
import com.swiggy.presentation.stores.v1.StoreDocument;
import com.swiggy.presentation.stores.v1.StoreInfo;
import com.swiggy.presentation.stores.v1.StoreOrderability;
import i20.t;
import in.swiggy.android.tejas.feature.home.grid.model.stores.Stores;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: StoreInfoTransformer.kt */
public final class StoreInfoTransformer implements ITransformer<StoreInfo, Stores> {
    private final ITransformer<DiscountInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.DiscountInfo> discountInfoTransformer;
    private final ITransformer<StoreDocument, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreDocument> documentTransformer;
    private final ITransformer<StoreOrderability, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreOrderability> orderabilityTransformer;

    public StoreInfoTransformer(ITransformer<StoreDocument, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreDocument> iTransformer, ITransformer<StoreOrderability, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreOrderability> iTransformer2, ITransformer<DiscountInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.DiscountInfo> iTransformer3) {
        p.j(iTransformer, "documentTransformer");
        p.j(iTransformer2, "orderabilityTransformer");
        p.j(iTransformer3, "discountInfoTransformer");
        this.documentTransformer = iTransformer;
        this.orderabilityTransformer = iTransformer2;
        this.discountInfoTransformer = iTransformer3;
    }

    public final ITransformer<DiscountInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.DiscountInfo> getDiscountInfoTransformer() {
        return this.discountInfoTransformer;
    }

    public final ITransformer<StoreDocument, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreDocument> getDocumentTransformer() {
        return this.documentTransformer;
    }

    public final ITransformer<StoreOrderability, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreOrderability> getOrderabilityTransformer() {
        return this.orderabilityTransformer;
    }

    public Stores transform(StoreInfo storeInfo) {
        StoreInfo storeInfo2 = storeInfo;
        p.j(storeInfo2, t.V);
        if (p.e(storeInfo2, StoreInfo.getDefaultInstance())) {
            return null;
        }
        ITransformer<StoreDocument, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreDocument> iTransformer = this.documentTransformer;
        StoreDocument storeDocument = storeInfo.getStoreDocument();
        p.i(storeDocument, "t.storeDocument");
        ITransformer<StoreOrderability, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreOrderability> iTransformer2 = this.orderabilityTransformer;
        StoreOrderability orderability = storeInfo.getOrderability();
        p.i(orderability, "t.orderability");
        ITransformer<DiscountInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.DiscountInfo> iTransformer3 = this.discountInfoTransformer;
        DiscountInfo discountInfo = storeInfo.getDiscountInfo();
        p.i(discountInfo, "t.discountInfo");
        String id2 = storeInfo.getId();
        String str = id2;
        p.i(id2, "t.id");
        long storeId = storeInfo.getStoreId();
        String name = storeInfo.getName();
        String str2 = name;
        p.i(name, "t.name");
        String address = storeInfo.getAddress();
        String str3 = address;
        p.i(address, "t.address");
        String phoneNumbers = storeInfo.getPhoneNumbers();
        String str4 = phoneNumbers;
        p.i(phoneNumbers, "t.phoneNumbers");
        String locality = storeInfo.getLocality();
        String str5 = locality;
        p.i(locality, "t.locality");
        String latLong = storeInfo.getLatLong();
        String str6 = latLong;
        p.i(latLong, "t.latLong");
        String description = storeInfo.getDescription();
        String str7 = description;
        p.i(description, "t.description");
        String imageId = storeInfo.getImageId();
        String str8 = imageId;
        p.i(imageId, "t.imageId");
        return new Stores(str, storeId, str2, str3, str4, str5, str6, str7, str8, storeInfo.getIsPartner(), storeInfo.getActive(), storeInfo.getIsVerified(), iTransformer.transform(storeDocument), iTransformer2.transform(orderability), iTransformer3.transform(discountInfo));
    }
}
