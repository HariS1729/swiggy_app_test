package d4;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ContentUriTriggers */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Set<a> f14123a = new HashSet();

    /* compiled from: ContentUriTriggers */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f14124a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f14125b;

        a(Uri uri, boolean z11) {
            this.f14124a = uri;
            this.f14125b = z11;
        }

        public Uri a() {
            return this.f14124a;
        }

        public boolean b() {
            return this.f14125b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f14125b != aVar.f14125b || !this.f14124a.equals(aVar.f14124a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f14124a.hashCode() * 31) + (this.f14125b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z11) {
        this.f14123a.add(new a(uri, z11));
    }

    public Set<a> b() {
        return this.f14123a;
    }

    public int c() {
        return this.f14123a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f14123a.equals(((b) obj).f14123a);
    }

    public int hashCode() {
        return this.f14123a.hashCode();
    }
}
