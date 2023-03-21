package in.swiggy.android.tejas.feature.genericImage;

import i20.t;
import in.swiggy.android.tejas.oldapi.models.restaurant.PopUpData;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ImageDialogTransformer.kt */
public final class ImageDialogTransformer implements ITransformer<PopUpData, GenericImageDialogData> {
    public GenericImageDialogData transform(PopUpData popUpData) {
        p.j(popUpData, t.V);
        return new GenericImageDialogData(popUpData.getImageId(), true, popUpData.getAspectRatio(), popUpData.getWidthRatio(), popUpData.getMinimumHorizontalMargin(), popUpData.getMinimumVerticalMargin(), popUpData.getId(), popUpData.getCount(), popUpData.getBgColor(), popUpData.getCtaData(), (Integer) null, (GenericImageDialogInfoData) null, 3072, (i) null);
    }
}
