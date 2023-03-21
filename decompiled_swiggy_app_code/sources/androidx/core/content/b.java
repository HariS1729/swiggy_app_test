package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import androidx.core.util.g;

/* compiled from: LocusIdCompat */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f9177a;

    /* renamed from: b  reason: collision with root package name */
    private final LocusId f9178b;

    /* compiled from: LocusIdCompat */
    private static class a {
        static LocusId a(String str) {
            return new LocusId(str);
        }

        static String b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public b(String str) {
        this.f9177a = (String) g.j(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f9178b = a.a(str);
        } else {
            this.f9178b = null;
        }
    }

    private String a() {
        int length = this.f9177a.length();
        return length + "_chars";
    }

    public static b c(LocusId locusId) {
        g.h(locusId, "locusId cannot be null");
        return new b((String) g.j(a.b(locusId), "id cannot be empty"));
    }

    public LocusId b() {
        return this.f9178b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f9177a;
        if (str != null) {
            return str.equals(bVar.f9177a);
        }
        if (bVar.f9177a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9177a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + a() + "]";
    }
}
