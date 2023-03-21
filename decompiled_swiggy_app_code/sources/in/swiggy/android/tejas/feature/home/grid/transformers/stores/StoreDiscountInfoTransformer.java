package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.presentation.stores.v1.Discount;
import com.swiggy.presentation.stores.v1.DiscountInfo;
import i20.t;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: StoreDiscountInfoTransformer.kt */
public final class StoreDiscountInfoTransformer implements ITransformer<DiscountInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.DiscountInfo> {
    public in.swiggy.android.tejas.feature.home.grid.model.stores.DiscountInfo transform(DiscountInfo discountInfo) {
        p.j(discountInfo, t.V);
        ArrayList arrayList = new ArrayList();
        List<Discount> discountsList = discountInfo.getDiscountsList();
        p.i(discountsList, "t.discountsList");
        int i11 = 0;
        for (T next : discountsList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                k.t();
            }
            Discount discount = (Discount) next;
            String description = discount.getDescription();
            p.i(description, "discount.description");
            String shortDescription = discount.getShortDescription();
            p.i(shortDescription, "discount.shortDescription");
            String discountType = discount.getDiscountType();
            p.i(discountType, "discount.discountType");
            arrayList.add(new in.swiggy.android.tejas.feature.home.grid.model.stores.Discount(description, shortDescription, discountType));
            i11 = i12;
        }
        String header = discountInfo.getHeader();
        p.i(header, "t.header");
        return new in.swiggy.android.tejas.feature.home.grid.model.stores.DiscountInfo(header, arrayList);
    }
}
