package m6;

import android.content.Context;
import coil.ImageLoader;

/* compiled from: Coil.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f15711a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static ImageLoader f15712b;

    /* renamed from: c  reason: collision with root package name */
    private static e f15713c;

    private a() {
    }

    public static final ImageLoader a(Context context) {
        ImageLoader imageLoader = f15712b;
        return imageLoader == null ? f15711a.b(context) : imageLoader;
    }

    private final synchronized ImageLoader b(Context context) {
        ImageLoader imageLoader = f15712b;
        if (imageLoader != null) {
            return imageLoader;
        }
        e eVar = f15713c;
        ImageLoader a11 = eVar == null ? null : eVar.a();
        if (a11 == null) {
            Context applicationContext = context.getApplicationContext();
            e eVar2 = applicationContext instanceof e ? (e) applicationContext : null;
            a11 = eVar2 == null ? null : eVar2.a();
            if (a11 == null) {
                a11 = f.a(context);
            }
        }
        f15713c = null;
        f15712b = a11;
        return a11;
    }
}
