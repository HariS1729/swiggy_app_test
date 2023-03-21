package r6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import c7.d;
import coil.ImageLoader;
import coil.decode.DataSource;
import fp0.c;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import o6.l;
import o6.m;
import okio.u;
import r6.h;
import x6.k;

/* compiled from: ResourceUriFetcher.kt */
public final class j implements h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f16496c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Uri f16497a;

    /* renamed from: b  reason: collision with root package name */
    private final k f16498b;

    /* compiled from: ResourceUriFetcher.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: ResourceUriFetcher.kt */
    public static final class b implements h.a<Uri> {
        private final boolean c(Uri uri) {
            return p.e(uri.getScheme(), "android.resource");
        }

        /* renamed from: b */
        public h a(Uri uri, k kVar, ImageLoader imageLoader) {
            if (!c(uri)) {
                return null;
            }
            return new j(uri, kVar);
        }
    }

    public j(Uri uri, k kVar) {
        this.f16497a = uri;
        this.f16498b = kVar;
    }

    private final Void b(Uri uri) {
        throw new IllegalStateException(p.s("Invalid android.resource URI: ", uri));
    }

    public Object a(c<? super g> cVar) {
        Resources resources;
        Drawable drawable;
        String authority = this.f16497a.getAuthority();
        Integer num = null;
        if (authority == null || !(!o.A(authority))) {
            authority = null;
        }
        if (authority != null) {
            String str = (String) s.i0(this.f16497a.getPathSegments());
            if (str != null) {
                num = n.l(str);
            }
            if (num != null) {
                int intValue = num.intValue();
                Context g11 = this.f16498b.g();
                if (p.e(authority, g11.getPackageName())) {
                    resources = g11.getResources();
                } else {
                    resources = g11.getPackageManager().getResourcesForApplication(authority);
                }
                TypedValue typedValue = new TypedValue();
                resources.getValue(intValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String j = c7.i.j(MimeTypeMap.getSingleton(), charSequence.subSequence(StringsKt__StringsKt.l0(charSequence, '/', 0, false, 6, (Object) null), charSequence.length()).toString());
                if (p.e(j, "text/xml")) {
                    if (p.e(authority, g11.getPackageName())) {
                        drawable = d.a(g11, intValue);
                    } else {
                        drawable = d.d(g11, resources, intValue);
                    }
                    Drawable drawable2 = drawable;
                    boolean u11 = c7.i.u(drawable2);
                    if (u11) {
                        drawable2 = new BitmapDrawable(g11.getResources(), c7.k.f12862a.a(drawable2, this.f16498b.f(), this.f16498b.n(), this.f16498b.m(), this.f16498b.c()));
                    }
                    return new f(drawable2, u11, DataSource.DISK);
                }
                TypedValue typedValue2 = new TypedValue();
                return new k(l.b(u.d(u.l(resources.openRawResource(intValue, typedValue2))), g11, new m(authority, intValue, typedValue2.density)), j, DataSource.DISK);
            }
            b(this.f16497a);
            throw new KotlinNothingValueException();
        }
        b(this.f16497a);
        throw new KotlinNothingValueException();
    }
}
