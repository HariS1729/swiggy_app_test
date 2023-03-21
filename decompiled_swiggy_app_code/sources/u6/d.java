package u6;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import kotlin.jvm.internal.p;
import x6.k;

/* compiled from: ResourceIntMapper.kt */
public final class d implements c<Integer, Uri> {
    private final boolean b(int i11, Context context) {
        try {
            return context.getResources().getResourceEntryName(i11) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public /* bridge */ /* synthetic */ Object a(Object obj, k kVar) {
        return c(((Number) obj).intValue(), kVar);
    }

    public Uri c(int i11, k kVar) {
        if (!b(i11, kVar.g())) {
            return null;
        }
        Uri parse = Uri.parse("android.resource://" + kVar.g().getPackageName() + '/' + i11);
        p.i(parse, "parse(this)");
        return parse;
    }
}
