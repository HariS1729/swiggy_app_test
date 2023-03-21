package in.swiggy.android.tejas.feature.home.transformers.config.crouton;

import com.google.protobuf.Message;
import com.swiggy.gandalf.home.protobuf.SuccessReponseDto;
import com.swiggy.gandalf.widgets.v2.Card;
import com.swiggy.gandalf.widgets.v2.Crouton;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeCrouton;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeCroutonData;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: CroutonConfigTransformer.kt */
public final class CroutonConfigTransformer implements ITransformer<SuccessReponseDto.PageConfigs, List<? extends HomeCrouton>> {
    private final ITransformer<Crouton, HomeCroutonData> croutonConfigTransformer;

    public CroutonConfigTransformer(ITransformer<Crouton, HomeCroutonData> iTransformer) {
        p.j(iTransformer, "croutonConfigTransformer");
        this.croutonConfigTransformer = iTransformer;
    }

    public List<HomeCrouton> transform(SuccessReponseDto.PageConfigs pageConfigs) {
        p.j(pageConfigs, t.V);
        List<Card> configInfoList = pageConfigs.getConfigInfoList();
        ArrayList arrayList = new ArrayList();
        p.i(configInfoList, "list");
        for (Card card : configInfoList) {
            if (card.getCard().is(Crouton.class)) {
                ITransformer<Crouton, HomeCroutonData> iTransformer = this.croutonConfigTransformer;
                Message unpack = card.getCard().unpack(Crouton.class);
                p.i(unpack, "it.card.unpack(Crouton::class.java)");
                HomeCroutonData transform = iTransformer.transform(unpack);
                if (transform != null) {
                    arrayList.add(transform);
                }
            }
        }
        return arrayList;
    }
}
