package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* compiled from: ExtensionRegistryLite */
public class n {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f10069b = true;

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f10070c = c();

    /* renamed from: d  reason: collision with root package name */
    private static volatile n f10071d;

    /* renamed from: e  reason: collision with root package name */
    static final n f10072e = new n(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, GeneratedMessageLite.e<?, ?>> f10073a;

    /* compiled from: ExtensionRegistryLite */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f10074a;

        /* renamed from: b  reason: collision with root package name */
        private final int f10075b;

        a(Object obj, int i11) {
            this.f10074a = obj;
            this.f10075b = i11;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f10074a == aVar.f10074a && this.f10075b == aVar.f10075b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f10074a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f10075b;
        }
    }

    n() {
        this.f10073a = new HashMap();
    }

    public static n b() {
        n nVar = f10071d;
        if (nVar == null) {
            synchronized (n.class) {
                nVar = f10071d;
                if (nVar == null) {
                    nVar = f10069b ? m.a() : f10072e;
                    f10071d = nVar;
                }
            }
        }
        return nVar;
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public <ContainingType extends k0> GeneratedMessageLite.e<ContainingType, ?> a(ContainingType containingtype, int i11) {
        return this.f10073a.get(new a(containingtype, i11));
    }

    n(boolean z11) {
        this.f10073a = Collections.emptyMap();
    }
}
