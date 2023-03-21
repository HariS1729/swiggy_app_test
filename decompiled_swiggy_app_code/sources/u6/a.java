package u6;

import android.net.Uri;
import c7.i;
import java.io.File;
import kotlin.jvm.internal.p;
import x6.k;

/* compiled from: FileUriMapper.kt */
public final class a implements c<Uri, File> {
    private final boolean b(Uri uri) {
        if (!i.q(uri)) {
            String scheme = uri.getScheme();
            if (scheme == null || p.e(scheme, "file")) {
                String path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                if (!StringsKt__StringsKt.N0(path, '/', false, 2, (Object) null) || i.h(uri) == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public File a(Uri uri, k kVar) {
        if (!b(uri)) {
            return null;
        }
        String path = uri.getPath();
        p.g(path);
        return new File(path);
    }
}
