package u6;

import android.net.Uri;
import kotlin.jvm.internal.p;
import x6.k;

/* compiled from: StringMapper.kt */
public final class f implements c<String, Uri> {
    /* renamed from: b */
    public Uri a(String str, k kVar) {
        Uri parse = Uri.parse(str);
        p.i(parse, "parse(this)");
        return parse;
    }
}
