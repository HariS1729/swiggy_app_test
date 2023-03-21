package b3;

import androidx.datastore.preferences.core.MutablePreferences;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: Preferences.kt */
public abstract class a {

    /* renamed from: b3.a$a  reason: collision with other inner class name */
    /* compiled from: Preferences.kt */
    public static final class C0100a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f12574a;

        public C0100a(String str) {
            p.j(str, "name");
            this.f12574a = str;
        }

        public final String a() {
            return this.f12574a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0100a) {
                return p.e(this.f12574a, ((C0100a) obj).f12574a);
            }
            return false;
        }

        public int hashCode() {
            return this.f12574a.hashCode();
        }

        public String toString() {
            return this.f12574a;
        }
    }

    /* compiled from: Preferences.kt */
    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final C0100a<T> f12575a;

        /* renamed from: b  reason: collision with root package name */
        private final T f12576b;

        public final C0100a<T> a() {
            return this.f12575a;
        }

        public final T b() {
            return this.f12576b;
        }
    }

    public abstract Map<C0100a<?>, Object> a();

    public abstract <T> T b(C0100a<T> aVar);

    public final MutablePreferences c() {
        return new MutablePreferences(x.t(a()), false);
    }

    public final a d() {
        return new MutablePreferences(x.t(a()), true);
    }
}
