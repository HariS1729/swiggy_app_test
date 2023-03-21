package a3;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: PreferencesMapCompat.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f985a = new a((i) null);

    /* compiled from: PreferencesMapCompat.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final androidx.datastore.preferences.b a(InputStream inputStream) {
            p.j(inputStream, "input");
            try {
                androidx.datastore.preferences.b J = androidx.datastore.preferences.b.J(inputStream);
                p.i(J, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return J;
            } catch (InvalidProtocolBufferException e11) {
                throw new CorruptionException("Unable to parse preferences proto.", e11);
            }
        }
    }
}
