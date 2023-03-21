package in.swiggy.android.tejas.feature.home.transformers.config.video;

import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.gandalf.widgets.v2.FrequencyCapping;
import com.swiggy.gandalf.widgets.v2.Videos;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeVideoPopup;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: VideoTransformer.kt */
public final class VideoTransformer implements ITransformer<Videos, HomeVideoPopup.Videos> {
    private final ITransformer<Cta, CTA> ctaTransformer;
    private final ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> frequencyCappingTransformer;
    private final ITransformer<String, String> videoIdTransformer;

    public VideoTransformer(ITransformer<Cta, CTA> iTransformer, ITransformer<String, String> iTransformer2, ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> iTransformer3) {
        p.j(iTransformer, "ctaTransformer");
        p.j(iTransformer2, "videoIdTransformer");
        p.j(iTransformer3, "frequencyCappingTransformer");
        this.ctaTransformer = iTransformer;
        this.videoIdTransformer = iTransformer2;
        this.frequencyCappingTransformer = iTransformer3;
    }

    public final ITransformer<Cta, CTA> getCtaTransformer() {
        return this.ctaTransformer;
    }

    public HomeVideoPopup.Videos transform(Videos videos) {
        p.j(videos, t.V);
        ITransformer<String, String> iTransformer = this.videoIdTransformer;
        String url = videos.getUrl();
        p.i(url, "t.url");
        String transform = iTransformer.transform(url);
        if (transform == null) {
            return null;
        }
        String id2 = videos.getId();
        p.i(id2, "t.id");
        String entityType = videos.getEntityType();
        p.i(entityType, "t.entityType");
        int maxCount = videos.getMaxCount();
        ITransformer<Cta, CTA> ctaTransformer2 = getCtaTransformer();
        Cta cta = videos.getCta();
        p.i(cta, "t.cta");
        Map<String, String> metaInfoMap = videos.getMetaInfoMap();
        ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> iTransformer2 = this.frequencyCappingTransformer;
        FrequencyCapping frequencyCapping = videos.getFrequencyCapping();
        p.i(frequencyCapping, "t.frequencyCapping");
        return new HomeVideoPopup.Videos(id2, transform, entityType, maxCount, ctaTransformer2.transform(cta), metaInfoMap, iTransformer2.transform(frequencyCapping));
    }
}
