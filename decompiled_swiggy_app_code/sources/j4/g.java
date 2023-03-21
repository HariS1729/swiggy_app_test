package j4;

import android.content.Context;
import n4.a;

/* compiled from: Trackers */
public class g {

    /* renamed from: e  reason: collision with root package name */
    private static g f15288e;

    /* renamed from: a  reason: collision with root package name */
    private a f15289a;

    /* renamed from: b  reason: collision with root package name */
    private b f15290b;

    /* renamed from: c  reason: collision with root package name */
    private e f15291c;

    /* renamed from: d  reason: collision with root package name */
    private f f15292d;

    private g(Context context, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f15289a = new a(applicationContext, aVar);
        this.f15290b = new b(applicationContext, aVar);
        this.f15291c = new e(applicationContext, aVar);
        this.f15292d = new f(applicationContext, aVar);
    }

    public static synchronized g c(Context context, a aVar) {
        g gVar;
        synchronized (g.class) {
            if (f15288e == null) {
                f15288e = new g(context, aVar);
            }
            gVar = f15288e;
        }
        return gVar;
    }

    public a a() {
        return this.f15289a;
    }

    public b b() {
        return this.f15290b;
    }

    public e d() {
        return this.f15291c;
    }

    public f e() {
        return this.f15292d;
    }
}
