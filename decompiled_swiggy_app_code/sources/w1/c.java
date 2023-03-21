package w1;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.p;

/* compiled from: AndroidLocaleDelegate.android.kt */
public final class c implements h {
    public List<g> a() {
        LocaleList localeList = LocaleList.getDefault();
        p.i(localeList, "getDefault()");
        ArrayList arrayList = new ArrayList();
        int size = localeList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Locale locale = localeList.get(i11);
            p.i(locale, "localeList[i]");
            arrayList.add(new a(locale));
        }
        return arrayList;
    }

    public g b(String str) {
        p.j(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        p.i(forLanguageTag, "forLanguageTag(languageTag)");
        return new a(forLanguageTag);
    }
}
