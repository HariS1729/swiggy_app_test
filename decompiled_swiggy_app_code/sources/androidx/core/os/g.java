package androidx.core.os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: LocaleListCompatWrapper */
final class g implements h {

    /* renamed from: c  reason: collision with root package name */
    private static final Locale[] f9305c = new Locale[0];

    /* renamed from: d  reason: collision with root package name */
    private static final Locale f9306d = new Locale("en", "XA");

    /* renamed from: e  reason: collision with root package name */
    private static final Locale f9307e = new Locale("ar", "XB");

    /* renamed from: f  reason: collision with root package name */
    private static final Locale f9308f = f.b("en-Latn");

    /* renamed from: a  reason: collision with root package name */
    private final Locale[] f9309a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9310b;

    g(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f9309a = f9305c;
            this.f9310b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (i11 < localeArr.length) {
            Locale locale = localeArr[i11];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    b(sb2, locale2);
                    if (i11 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
                i11++;
            } else {
                throw new NullPointerException("list[" + i11 + "] is null");
            }
        }
        this.f9309a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f9310b = sb2.toString();
    }

    static void b(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb2.append('-');
            sb2.append(locale.getCountry());
        }
    }

    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        Locale[] localeArr = ((g) obj).f9309a;
        if (this.f9309a.length != localeArr.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            Locale[] localeArr2 = this.f9309a;
            if (i11 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i11].equals(localeArr[i11])) {
                return false;
            }
            i11++;
        }
    }

    public Locale get(int i11) {
        if (i11 >= 0) {
            Locale[] localeArr = this.f9309a;
            if (i11 < localeArr.length) {
                return localeArr[i11];
            }
        }
        return null;
    }

    public int hashCode() {
        int i11 = 1;
        for (Locale hashCode : this.f9309a) {
            i11 = (i11 * 31) + hashCode.hashCode();
        }
        return i11;
    }

    public int size() {
        return this.f9309a.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i11 = 0;
        while (true) {
            Locale[] localeArr = this.f9309a;
            if (i11 < localeArr.length) {
                sb2.append(localeArr[i11]);
                if (i11 < this.f9309a.length - 1) {
                    sb2.append(',');
                }
                i11++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
