package o6;

import android.content.Context;
import c7.i;
import java.io.Closeable;
import o6.k;
import okio.e;
import okio.z;

/* compiled from: ImageSource.kt */
public final class l {
    public static final k a(e eVar, Context context) {
        return new n(eVar, i.m(context), (k.a) null);
    }

    public static final k b(e eVar, Context context, k.a aVar) {
        return new n(eVar, i.m(context), aVar);
    }

    public static final k c(z zVar, okio.i iVar, String str, Closeable closeable) {
        return new j(zVar, iVar, str, closeable, (k.a) null);
    }

    public static /* synthetic */ k d(z zVar, okio.i iVar, String str, Closeable closeable, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            iVar = okio.i.f27240b;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            closeable = null;
        }
        return c(zVar, iVar, str, closeable);
    }
}
