package u6;

import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.p;
import x6.k;

/* compiled from: ResourceUriMapper.kt */
public final class e implements c<Uri, Uri> {
    private final boolean b(Uri uri) {
        if (p.e(uri.getScheme(), "android.resource")) {
            String authority = uri.getAuthority();
            if ((authority == null || o.A(authority)) || uri.getPathSegments().size() != 2) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public Uri a(Uri uri, k kVar) {
        if (!b(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = kVar.g().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = uri.getPathSegments();
        boolean z11 = false;
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier != 0) {
            z11 = true;
        }
        if (z11) {
            Uri parse = Uri.parse("android.resource://" + authority + '/' + identifier);
            p.i(parse, "parse(this)");
            return parse;
        }
        throw new IllegalStateException(p.s("Invalid android.resource URI: ", uri).toString());
    }
}
