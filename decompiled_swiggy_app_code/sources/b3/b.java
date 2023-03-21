package b3;

import androidx.datastore.preferences.core.MutablePreferences;
import b3.a;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: PreferencesFactory.kt */
public final class b {
    public static final a a() {
        return new MutablePreferences((Map) null, true, 1, (i) null);
    }

    public static final MutablePreferences b(a.b<?>... bVarArr) {
        p.j(bVarArr, "pairs");
        MutablePreferences mutablePreferences = new MutablePreferences((Map) null, false, 1, (i) null);
        mutablePreferences.g((a.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return mutablePreferences;
    }
}
