package x2;

import android.content.Context;
import com.newrelic.agent.android.agentdata.HexAttribute;
import java.io.File;
import kotlin.jvm.internal.p;

/* compiled from: DataStoreFile.kt */
public final class a {
    public static final File a(Context context, String str) {
        p.j(context, "<this>");
        p.j(str, HexAttribute.HEX_ATTR_FILENAME);
        return new File(context.getApplicationContext().getFilesDir(), p.s("datastore/", str));
    }
}
