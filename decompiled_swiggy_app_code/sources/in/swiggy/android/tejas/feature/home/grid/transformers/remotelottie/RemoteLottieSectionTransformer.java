package in.swiggy.android.tejas.feature.home.grid.transformers.remotelottie;

import com.swiggy.gandalf.widgets.v2.LotteInfoLayoutCard;
import i20.t;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.GridRemoteLottieSection;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieEntity;
import in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: RemoteLottieSectionTransformer.kt */
public final class RemoteLottieSectionTransformer implements ITransformer<LotteInfoLayoutCard, GridRemoteLottieSection> {
    private final ITransformer<LotteInfoLayoutCard.ItemStyle, ItemStyle> itemStyleTransformer;
    private final ITransformer<LotteInfoLayoutCard.LotteCardInfo, RemoteLottieEntity> remoteLottieEntityTransformer;

    public RemoteLottieSectionTransformer(ITransformer<LotteInfoLayoutCard.LotteCardInfo, RemoteLottieEntity> iTransformer, ITransformer<LotteInfoLayoutCard.ItemStyle, ItemStyle> iTransformer2) {
        p.j(iTransformer, "remoteLottieEntityTransformer");
        p.j(iTransformer2, "itemStyleTransformer");
        this.remoteLottieEntityTransformer = iTransformer;
        this.itemStyleTransformer = iTransformer2;
    }

    public final ITransformer<LotteInfoLayoutCard.ItemStyle, ItemStyle> getItemStyleTransformer() {
        return this.itemStyleTransformer;
    }

    public final ITransformer<LotteInfoLayoutCard.LotteCardInfo, RemoteLottieEntity> getRemoteLottieEntityTransformer() {
        return this.remoteLottieEntityTransformer;
    }

    public GridRemoteLottieSection transform(LotteInfoLayoutCard lotteInfoLayoutCard) {
        p.j(lotteInfoLayoutCard, t.V);
        if (p.e(lotteInfoLayoutCard, LotteInfoLayoutCard.getDefaultInstance())) {
            return null;
        }
        ITransformer<LotteInfoLayoutCard.ItemStyle, ItemStyle> iTransformer = this.itemStyleTransformer;
        LotteInfoLayoutCard.ItemStyle style = lotteInfoLayoutCard.getStyle();
        p.i(style, "t.style");
        ItemStyle transform = iTransformer.transform(style);
        if (transform == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<LotteInfoLayoutCard.LotteCardInfo> infoList = lotteInfoLayoutCard.getInfoList();
        p.i(infoList, "t.infoList");
        for (LotteInfoLayoutCard.LotteCardInfo lotteCardInfo : infoList) {
            ITransformer<LotteInfoLayoutCard.LotteCardInfo, RemoteLottieEntity> remoteLottieEntityTransformer2 = getRemoteLottieEntityTransformer();
            p.i(lotteCardInfo, "it");
            RemoteLottieEntity transform2 = remoteLottieEntityTransformer2.transform(lotteCardInfo);
            if (transform2 != null) {
                arrayList.add(transform2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new GridRemoteLottieSection(arrayList, transform);
    }
}
