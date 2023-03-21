package in.swiggy.android.tejas.api;

import in.swiggy.android.tejas.coroutineUtils.ModelTransformer;
import java.util.Map;
import kotlin.jvm.internal.p;
import org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary;

/* compiled from: ResponseUtils.kt */
public final class ResponseUtilsKt {
    public static final String json = "/json";

    public static final /* synthetic */ <T extends ModelTransformer> T getTransformer(Map<Class<? extends ModelTransformer>, ModelTransformer> map) {
        p.j(map, "<this>");
        p.p(4, PDNumberFormatDictionary.FRACTIONAL_DISPLAY_TRUNCATE);
        T t = map.get(ModelTransformer.class);
        p.p(1, PDNumberFormatDictionary.FRACTIONAL_DISPLAY_TRUNCATE);
        return (ModelTransformer) t;
    }
}
