package r6;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c7.i;
import coil.ImageLoader;
import coil.decode.DataSource;
import fp0.c;
import r6.h;
import x6.k;

/* compiled from: DrawableFetcher.kt */
public final class e implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f16490a;

    /* renamed from: b  reason: collision with root package name */
    private final k f16491b;

    /* compiled from: DrawableFetcher.kt */
    public static final class a implements h.a<Drawable> {
        /* renamed from: b */
        public h a(Drawable drawable, k kVar, ImageLoader imageLoader) {
            return new e(drawable, kVar);
        }
    }

    public e(Drawable drawable, k kVar) {
        this.f16490a = drawable;
        this.f16491b = kVar;
    }

    public Object a(c<? super g> cVar) {
        Drawable drawable;
        boolean u11 = i.u(this.f16490a);
        if (u11) {
            drawable = new BitmapDrawable(this.f16491b.g().getResources(), c7.k.f12862a.a(this.f16490a, this.f16491b.f(), this.f16491b.n(), this.f16491b.m(), this.f16491b.c()));
        } else {
            drawable = this.f16490a;
        }
        return new f(drawable, u11, DataSource.MEMORY);
    }
}
