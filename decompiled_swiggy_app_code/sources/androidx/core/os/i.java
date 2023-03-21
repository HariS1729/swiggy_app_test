package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper */
final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final LocaleList f9311a;

    i(Object obj) {
        this.f9311a = (LocaleList) obj;
    }

    public Object a() {
        return this.f9311a;
    }

    public boolean equals(Object obj) {
        return this.f9311a.equals(((h) obj).a());
    }

    public Locale get(int i11) {
        return this.f9311a.get(i11);
    }

    public int hashCode() {
        return this.f9311a.hashCode();
    }

    public int size() {
        return this.f9311a.size();
    }

    public String toString() {
        return this.f9311a.toString();
    }
}
