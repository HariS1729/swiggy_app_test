package o3;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.slice.SliceSpec;
import java.util.List;
import java.util.Set;

/* compiled from: SliceManager */
public abstract class b {
    b() {
    }

    public static b a(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new d(context);
        }
        return new c(context);
    }

    public abstract List<Uri> b();

    public abstract Set<SliceSpec> c(Uri uri);
}
