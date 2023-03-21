package g6;

import android.content.Context;
import f6.b;
import f6.c;

/* compiled from: SentryService */
public class a implements b {

    /* renamed from: b  reason: collision with root package name */
    private static a f14743b;

    /* renamed from: a  reason: collision with root package name */
    private final c f14744a;

    private a(Context context, c cVar) {
        this.f14744a = cVar;
        d(cVar.a());
        c();
    }

    public static a b(Context context, c cVar) {
        if (f14743b == null) {
            f14743b = new a(context, cVar);
        }
        return f14743b;
    }

    private void c() {
    }

    private void d(String str) {
    }

    public void a(Throwable th2) {
    }
}
