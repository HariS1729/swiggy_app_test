package r6;

import android.webkit.MimeTypeMap;
import coil.ImageLoader;
import coil.decode.DataSource;
import fp0.c;
import java.io.Closeable;
import java.io.File;
import o6.l;
import okio.z;
import r6.h;
import x6.k;

/* compiled from: FileFetcher.kt */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final File f16495a;

    /* compiled from: FileFetcher.kt */
    public static final class a implements h.a<File> {
        /* renamed from: b */
        public h a(File file, k kVar, ImageLoader imageLoader) {
            return new i(file);
        }
    }

    public i(File file) {
        this.f16495a = file;
    }

    public Object a(c<? super g> cVar) {
        return new k(l.d(z.a.d(z.f27295b, this.f16495a, false, 1, (Object) null), (okio.i) null, (String) null, (Closeable) null, 14, (Object) null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(i.f(this.f16495a)), DataSource.DISK);
    }
}
