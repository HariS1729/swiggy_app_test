package in.swiggy.android.tejas.feature.home.transformers;

import com.swiggy.gandalf.home.protobuf.LaunchCardGroupDto;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.ItemLaunch;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.feature.listing.cta.model.CtaMetaInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ItemLaunchTransformer.kt */
public final class ItemLaunchTransformer implements ITransformer<LaunchCardGroupDto.LaunchCardItemData, ItemLaunch> {
    public ItemLaunch transform(LaunchCardGroupDto.LaunchCardItemData launchCardItemData) {
        p.j(launchCardItemData, t.V);
        String id2 = launchCardItemData.getId();
        String title = launchCardItemData.getData().getTitle();
        p.i(title, "it.data.title");
        String subtitle = launchCardItemData.getData().getSubtitle();
        p.i(subtitle, "it.data.subtitle");
        String imageId = launchCardItemData.getData().getImageId();
        p.i(imageId, "it.data.imageId");
        String link = launchCardItemData.getAction().getLink();
        String text = launchCardItemData.getAction().getText();
        String type = launchCardItemData.getAction().getType();
        p.i(type, "t.action.type");
        return new ItemLaunch(id2, title, subtitle, imageId, new CTA(link, text, type, (CtaMetaInfo) null, 8, (i) null));
    }
}
