package a3;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.p;

/* compiled from: PreferenceDataStoreFile.kt */
public final class a {
    public static final File a(Context context, String str) {
        p.j(context, "<this>");
        p.j(str, "name");
        return x2.a.a(context, p.s(str, ".preferences_pb"));
    }
}
