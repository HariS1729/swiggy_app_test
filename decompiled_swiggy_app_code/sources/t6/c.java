package t6;

import android.net.Uri;
import c7.i;
import kotlin.jvm.internal.p;
import x6.k;

/* compiled from: UriKeyer.kt */
public final class c implements b<Uri> {
    /* renamed from: b */
    public String a(Uri uri, k kVar) {
        if (!p.e(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri);
        sb2.append('-');
        sb2.append(i.k(kVar.g().getResources().getConfiguration()));
        return sb2.toString();
    }
}
