package in.swiggy.android.tejas.feature.home.transformers.config.video;

import i20.t;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;
import qs.a;

/* compiled from: VideoIdTransformer.kt */
public final class VideoIdTransformer implements ITransformer<String, String> {
    public String transform(String str) {
        p.j(str, t.V);
        return o.H(str, p.s(a.f53167a.a().toString(), "/"), "", false, 4, (Object) null);
    }
}
