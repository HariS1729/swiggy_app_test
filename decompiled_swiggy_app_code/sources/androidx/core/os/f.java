package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListCompat */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    private static final f f9303b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    private final h f9304a;

    /* compiled from: LocaleListCompat */
    static class a {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private f(h hVar) {
        this.f9304a = hVar;
    }

    public static f a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e(a.a(localeArr));
        }
        return new f(new g(localeArr));
    }

    static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static f e(LocaleList localeList) {
        return new f(new i(localeList));
    }

    public Locale c(int i11) {
        return this.f9304a.get(i11);
    }

    public int d() {
        return this.f9304a.size();
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.f9304a.equals(((f) obj).f9304a);
    }

    public int hashCode() {
        return this.f9304a.hashCode();
    }

    public String toString() {
        return this.f9304a.toString();
    }
}
