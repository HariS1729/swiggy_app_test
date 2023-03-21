package r6;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import c7.i;
import coil.ImageLoader;
import coil.decode.DataSource;
import fp0.c;
import kotlin.jvm.internal.p;
import lp0.l;
import okio.e;
import okio.u;
import r6.h;
import x6.k;

/* compiled from: AssetUriFetcher.kt */
public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f16482a;

    /* renamed from: b  reason: collision with root package name */
    private final k f16483b;

    /* renamed from: r6.a$a  reason: collision with other inner class name */
    /* compiled from: AssetUriFetcher.kt */
    public static final class C0180a implements h.a<Uri> {
        /* renamed from: b */
        public h a(Uri uri, k kVar, ImageLoader imageLoader) {
            if (!i.q(uri)) {
                return null;
            }
            return new a(uri, kVar);
        }
    }

    public a(Uri uri, k kVar) {
        this.f16482a = uri;
        this.f16483b = kVar;
    }

    public Object a(c<? super g> cVar) {
        String f02 = s.f0(s.R(this.f16482a.getPathSegments(), 1), "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
        e d11 = u.d(u.l(this.f16483b.g().getAssets().open(f02)));
        Context g11 = this.f16483b.g();
        String lastPathSegment = this.f16482a.getLastPathSegment();
        p.g(lastPathSegment);
        return new k(o6.l.b(d11, g11, new o6.a(lastPathSegment)), i.j(MimeTypeMap.getSingleton(), f02), DataSource.DISK);
    }
}
