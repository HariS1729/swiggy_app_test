package f6;

import android.content.Context;
import z5.g;

/* compiled from: ErrorMonitor */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final g6.a f14645a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f14646b;

    public a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f14646b = applicationContext;
        this.f14645a = g6.a.b(context, b(applicationContext));
    }

    private c b(Context context) {
        c cVar = new c();
        cVar.b(g.f());
        cVar.c(p5.a.t().s().getAppId());
        cVar.d(context.getPackageName());
        cVar.d("3.6.23");
        return cVar;
    }

    private boolean c(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public void a(Throwable th2) {
        if (c(this.f14646b)) {
            this.f14645a.a(th2);
        }
    }
}
