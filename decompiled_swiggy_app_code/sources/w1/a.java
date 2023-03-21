package w1;

import java.util.Locale;
import kotlin.jvm.internal.p;

/* compiled from: AndroidLocaleDelegate.android.kt */
public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Locale f17445a;

    public a(Locale locale) {
        p.j(locale, "javaLocale");
        this.f17445a = locale;
    }

    public String a() {
        String languageTag = this.f17445a.toLanguageTag();
        p.i(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }

    public final Locale b() {
        return this.f17445a;
    }
}
