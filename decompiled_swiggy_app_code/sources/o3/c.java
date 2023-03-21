package o3;

import android.content.Context;
import android.net.Uri;
import androidx.slice.SliceSpec;
import java.util.List;
import java.util.Set;

/* compiled from: SliceManagerCompat */
class c extends b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f15924a;

    c(Context context) {
        this.f15924a = context;
    }

    public List<Uri> b() {
        return r3.c.f(this.f15924a);
    }

    public Set<SliceSpec> c(Uri uri) {
        return r3.c.g(this.f15924a, uri);
    }
}
