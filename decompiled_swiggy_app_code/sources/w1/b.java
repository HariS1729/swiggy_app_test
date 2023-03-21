package w1;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.p;

/* compiled from: AndroidLocaleDelegate.android.kt */
public final class b implements h {
    public List<g> a() {
        Locale locale = Locale.getDefault();
        p.i(locale, "getDefault()");
        return j.d(new a(locale));
    }

    public g b(String str) {
        p.j(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        p.i(forLanguageTag, "forLanguageTag(languageTag)");
        return new a(forLanguageTag);
    }
}
