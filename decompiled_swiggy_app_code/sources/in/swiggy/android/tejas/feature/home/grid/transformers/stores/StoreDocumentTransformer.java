package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.presentation.stores.v1.StoreDocument;
import i20.t;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: StoreDocumentTransformer.kt */
public final class StoreDocumentTransformer implements ITransformer<StoreDocument, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreDocument> {
    public in.swiggy.android.tejas.feature.home.grid.model.stores.StoreDocument transform(StoreDocument storeDocument) {
        p.j(storeDocument, t.V);
        if (p.e(storeDocument, StoreDocument.getDefaultInstance())) {
            return null;
        }
        String fssaiLicenseNumber = storeDocument.getFssaiLicenseNumber();
        p.i(fssaiLicenseNumber, "t.fssaiLicenseNumber");
        String drugLicenseNumber = storeDocument.getDrugLicenseNumber();
        p.i(drugLicenseNumber, "t.drugLicenseNumber");
        String gstin = storeDocument.getGstin();
        p.i(gstin, "t.gstin");
        return new in.swiggy.android.tejas.feature.home.grid.model.stores.StoreDocument(fssaiLicenseNumber, drugLicenseNumber, gstin);
    }
}
