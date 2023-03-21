package in.swiggy.android.tejas.feature.home.grid.transformers.fliptext;

import com.swiggy.gandalf.widgets.v2.ItemStyle;
import com.swiggy.gandalf.widgets.v2.MxNFlipTextCardInfo;
import i20.t;
import in.swiggy.android.tejas.feature.home.grid.model.fliptext.DynamicFlipTextEntity;
import in.swiggy.android.tejas.feature.home.grid.model.fliptext.DynamicFlipTextSection;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import kotlin.jvm.internal.p;

/* compiled from: DynamicFlipTextSectionTransformer.kt */
public final class DynamicFlipTextSectionTransformer implements ITransformer<MxNFlipTextCardInfo, DynamicFlipTextSection> {
    private final ITransformer<MxNFlipTextCardInfo.FlipTextCardInfo, DynamicFlipTextEntity> dynamicFlipTextItemTransformer;
    private final ITransformer<ItemStyle, in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle> itemStyleTransformer;

    public DynamicFlipTextSectionTransformer(ITransformer<MxNFlipTextCardInfo.FlipTextCardInfo, DynamicFlipTextEntity> iTransformer, ITransformer<ItemStyle, in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle> iTransformer2) {
        p.j(iTransformer, "dynamicFlipTextItemTransformer");
        p.j(iTransformer2, "itemStyleTransformer");
        this.dynamicFlipTextItemTransformer = iTransformer;
        this.itemStyleTransformer = iTransformer2;
    }

    public final ITransformer<MxNFlipTextCardInfo.FlipTextCardInfo, DynamicFlipTextEntity> getDynamicFlipTextItemTransformer() {
        return this.dynamicFlipTextItemTransformer;
    }

    public final ITransformer<ItemStyle, in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle> getItemStyleTransformer() {
        return this.itemStyleTransformer;
    }

    public DynamicFlipTextSection transform(MxNFlipTextCardInfo mxNFlipTextCardInfo) {
        DynamicFlipTextEntity transform;
        p.j(mxNFlipTextCardInfo, t.V);
        if (p.e(mxNFlipTextCardInfo, MxNFlipTextCardInfo.getDefaultInstance())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ITransformer<ItemStyle, in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle> iTransformer = this.itemStyleTransformer;
        ItemStyle style = mxNFlipTextCardInfo.getStyle();
        p.i(style, "t.style");
        in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle transform2 = iTransformer.transform(style);
        if (transform2 == null) {
            return null;
        }
        MxNFlipTextCardInfo.FlipTextCardInfo info = mxNFlipTextCardInfo.getInfo();
        if (!(info == null || (transform = getDynamicFlipTextItemTransformer().transform(info)) == null)) {
            arrayList.add(transform);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DynamicFlipTextSection(arrayList, transform2);
    }
}
