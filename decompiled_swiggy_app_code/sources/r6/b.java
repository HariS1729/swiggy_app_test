package r6;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.ImageLoader;
import coil.decode.DataSource;
import fp0.c;
import r6.h;
import x6.k;

/* compiled from: BitmapFetcher.kt */
public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f16484a;

    /* renamed from: b  reason: collision with root package name */
    private final k f16485b;

    /* compiled from: BitmapFetcher.kt */
    public static final class a implements h.a<Bitmap> {
        /* renamed from: b */
        public h a(Bitmap bitmap, k kVar, ImageLoader imageLoader) {
            return new b(bitmap, kVar);
        }
    }

    public b(Bitmap bitmap, k kVar) {
        this.f16484a = bitmap;
        this.f16485b = kVar;
    }

    public Object a(c<? super g> cVar) {
        return new f(new BitmapDrawable(this.f16485b.g().getResources(), this.f16484a), false, DataSource.MEMORY);
    }
}
