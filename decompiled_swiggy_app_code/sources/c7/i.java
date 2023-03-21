package c7;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.vectordrawable.graphics.drawable.h;
import coil.decode.DataSource;
import coil.intercept.RealInterceptorChain;
import coil.size.Scale;
import java.io.Closeable;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;
import m6.c;
import okhttp3.Headers;
import p6.a;
import s6.a;
import x6.l;
import x6.o;
import y6.c;

/* compiled from: Utils.kt */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Bitmap.Config[] f12854a;

    /* renamed from: b  reason: collision with root package name */
    private static final Bitmap.Config f12855b;

    /* renamed from: c  reason: collision with root package name */
    private static final Headers f12856c = new Headers.Builder().build();

    /* compiled from: Utils.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12857a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f12858b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f12859c;

        static {
            int[] iArr = new int[DataSource.values().length];
            iArr[DataSource.MEMORY_CACHE.ordinal()] = 1;
            iArr[DataSource.MEMORY.ordinal()] = 2;
            iArr[DataSource.DISK.ordinal()] = 3;
            iArr[DataSource.NETWORK.ordinal()] = 4;
            f12857a = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            f12858b = iArr2;
            int[] iArr3 = new int[Scale.values().length];
            iArr3[Scale.FILL.ordinal()] = 1;
            iArr3[Scale.FIT.ordinal()] = 2;
            f12859c = iArr3;
        }
    }

    static {
        Bitmap.Config config;
        int i11 = Build.VERSION.SDK_INT;
        f12854a = i11 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        if (i11 >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        f12855b = config;
    }

    public static final void a(a.b bVar) {
        try {
            bVar.abort();
        } catch (Exception unused) {
        }
    }

    public static final int b(Context context, double d11) {
        int i11;
        try {
            Object j = androidx.core.content.a.j(context, ActivityManager.class);
            p.g(j);
            ActivityManager activityManager = (ActivityManager) j;
            i11 = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            i11 = 256;
        }
        double d12 = (double) 1024;
        return (int) (d11 * ((double) i11) * d12 * d12);
    }

    public static final void c(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }

    public static final double d(Context context) {
        try {
            Object j = androidx.core.content.a.j(context, ActivityManager.class);
            p.g(j);
            if (((ActivityManager) j).isLowRamDevice()) {
                return 0.15d;
            }
            return 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final Bitmap.Config e() {
        return f12855b;
    }

    public static final String f(DataSource dataSource) {
        int i11 = a.f12857a[dataSource.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return "🧠";
        }
        if (i11 == 3) {
            return "💾";
        }
        if (i11 == 4) {
            return "☁️ ";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final c g(a.C0186a aVar) {
        return aVar instanceof RealInterceptorChain ? ((RealInterceptorChain) aVar).f() : c.f15725b;
    }

    public static final String h(Uri uri) {
        return (String) s.Y(uri.getPathSegments());
    }

    public static final int i(Drawable drawable) {
        Bitmap bitmap;
        Integer num = null;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (!(bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null)) {
            num = Integer.valueOf(bitmap.getHeight());
        }
        return num == null ? drawable.getIntrinsicHeight() : num.intValue();
    }

    public static final String j(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || o.A(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt__StringsKt.V0(StringsKt__StringsKt.X0(StringsKt__StringsKt.f1(StringsKt__StringsKt.f1(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }

    public static final int k(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: coil.request.ViewTargetRequestManager} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final coil.request.ViewTargetRequestManager l(android.view.View r4) {
        /*
            int r0 = coil.base.R.id.coil_request_manager
            java.lang.Object r1 = r4.getTag(r0)
            boolean r2 = r1 instanceof coil.request.ViewTargetRequestManager
            r3 = 0
            if (r2 == 0) goto L_0x000e
            coil.request.ViewTargetRequestManager r1 = (coil.request.ViewTargetRequestManager) r1
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            if (r1 != 0) goto L_0x0031
            monitor-enter(r4)
            java.lang.Object r1 = r4.getTag(r0)     // Catch:{ all -> 0x002e }
            boolean r2 = r1 instanceof coil.request.ViewTargetRequestManager     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x001d
            r3 = r1
            coil.request.ViewTargetRequestManager r3 = (coil.request.ViewTargetRequestManager) r3     // Catch:{ all -> 0x002e }
        L_0x001d:
            if (r3 != 0) goto L_0x002b
            coil.request.ViewTargetRequestManager r1 = new coil.request.ViewTargetRequestManager     // Catch:{ all -> 0x002e }
            r1.<init>(r4)     // Catch:{ all -> 0x002e }
            r4.addOnAttachStateChangeListener(r1)     // Catch:{ all -> 0x002e }
            r4.setTag(r0, r1)     // Catch:{ all -> 0x002e }
            goto L_0x002c
        L_0x002b:
            r1 = r3
        L_0x002c:
            monitor-exit(r4)
            goto L_0x0031
        L_0x002e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.i.l(android.view.View):coil.request.ViewTargetRequestManager");
    }

    public static final File m(Context context) {
        File cacheDir = context.getCacheDir();
        cacheDir.mkdirs();
        return cacheDir;
    }

    public static final Scale n(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i11 = scaleType == null ? -1 : a.f12858b[scaleType.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
            return Scale.FIT;
        }
        return Scale.FILL;
    }

    public static final Bitmap.Config[] o() {
        return f12854a;
    }

    public static final int p(Drawable drawable) {
        Bitmap bitmap;
        Integer num = null;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (!(bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null)) {
            num = Integer.valueOf(bitmap.getWidth());
        }
        return num == null ? drawable.getIntrinsicWidth() : num.intValue();
    }

    public static final boolean q(Uri uri) {
        return p.e(uri.getScheme(), "file") && p.e(h(uri), "android_asset");
    }

    public static final boolean r() {
        return p.e(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean s(int i11) {
        return i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE;
    }

    public static final boolean t(a.C0186a aVar) {
        return (aVar instanceof RealInterceptorChain) && ((RealInterceptorChain) aVar).i();
    }

    public static final boolean u(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof h);
    }

    public static final Headers v(Headers headers) {
        return headers == null ? f12856c : headers;
    }

    public static final l w(l lVar) {
        return lVar == null ? l.f17829c : lVar;
    }

    public static final o x(o oVar) {
        return oVar == null ? o.f17845c : oVar;
    }

    public static final int y(String str, int i11) {
        Long n = n.n(str);
        if (n == null) {
            return i11;
        }
        long longValue = n.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final int z(y6.c cVar, Scale scale) {
        if (cVar instanceof c.a) {
            return ((c.a) cVar).f18024a;
        }
        int i11 = a.f12859c[scale.ordinal()];
        if (i11 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i11 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
