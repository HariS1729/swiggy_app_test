package o3;

import android.app.slice.SliceManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import androidx.slice.SliceSpec;
import androidx.slice.b;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;

/* compiled from: SliceManagerWrapper */
class d extends b {

    /* renamed from: a  reason: collision with root package name */
    private final SliceManager f15925a;

    d(Context context) {
        this((SliceManager) context.getSystemService(SliceManager.class));
    }

    private int d() {
        UserHandle myUserHandle = Process.myUserHandle();
        try {
            return ((Integer) myUserHandle.getClass().getDeclaredMethod("getIdentifier", new Class[0]).invoke(myUserHandle, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    private Uri e(Uri uri) {
        if (uri == null || uri.getAuthority().contains("@")) {
            return uri;
        }
        String authority = uri.getAuthority();
        Uri.Builder buildUpon = uri.buildUpon();
        return buildUpon.encodedAuthority(d() + "@" + authority).build();
    }

    public List<Uri> b() {
        return this.f15925a.getPinnedSlices();
    }

    public Set<SliceSpec> c(Uri uri) {
        if (Build.VERSION.SDK_INT == 28) {
            uri = e(uri);
        }
        return b.d(this.f15925a.getPinnedSpecs(uri));
    }

    d(SliceManager sliceManager) {
        this.f15925a = sliceManager;
    }
}
