package c7;

import android.content.Context;
import p6.a;

/* compiled from: Utils.kt */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f12875a = new r();

    /* renamed from: b  reason: collision with root package name */
    private static a f12876b;

    private r() {
    }

    public final synchronized a a(Context context) {
        a aVar;
        aVar = f12876b;
        if (aVar == null) {
            aVar = new a.C0169a().b(i.h(i.m(context), "image_cache")).a();
            f12876b = aVar;
        }
        return aVar;
    }
}
