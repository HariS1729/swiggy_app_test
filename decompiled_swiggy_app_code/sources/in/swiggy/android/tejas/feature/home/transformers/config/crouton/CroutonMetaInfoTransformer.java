package in.swiggy.android.tejas.feature.home.transformers.config.crouton;

import com.swiggy.gandalf.widgets.v2.Crouton;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeCroutonData;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: CroutonMetaInfoTransformer.kt */
public final class CroutonMetaInfoTransformer implements ITransformer<Crouton, HomeCroutonData> {
    public HomeCroutonData transform(Crouton crouton) {
        p.j(crouton, t.V);
        String title = crouton.getTitle();
        p.i(title, "t.title");
        String text = crouton.getText();
        p.i(text, "t.text");
        String imageId = crouton.getImageId();
        p.i(imageId, "t.imageId");
        Map<String, String> metaInfoMap = crouton.getMetaInfoMap();
        p.i(metaInfoMap, "t.metaInfoMap");
        return new HomeCroutonData(title, text, imageId, metaInfoMap);
    }
}
