package h4;

import android.content.Context;
import d4.i;
import i4.b;
import i4.c;
import i4.e;
import i4.f;
import i4.g;
import i4.h;
import java.util.ArrayList;
import java.util.List;
import l4.p;
import n4.a;

/* compiled from: WorkConstraintsTracker */
public class d implements c.a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f14795d = i.f("WorkConstraintsTracker");

    /* renamed from: a  reason: collision with root package name */
    private final c f14796a;

    /* renamed from: b  reason: collision with root package name */
    private final c<?>[] f14797b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f14798c = new Object();

    public d(Context context, a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f14796a = cVar;
        this.f14797b = new c[]{new i4.a(applicationContext, aVar), new b(applicationContext, aVar), new h(applicationContext, aVar), new i4.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
    }

    public void a(List<String> list) {
        synchronized (this.f14798c) {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                if (c(next)) {
                    i.c().a(f14795d, String.format("Constraints met for %s", new Object[]{next}), new Throwable[0]);
                    arrayList.add(next);
                }
            }
            c cVar = this.f14796a;
            if (cVar != null) {
                cVar.f(arrayList);
            }
        }
    }

    public void b(List<String> list) {
        synchronized (this.f14798c) {
            c cVar = this.f14796a;
            if (cVar != null) {
                cVar.a(list);
            }
        }
    }

    public boolean c(String str) {
        synchronized (this.f14798c) {
            for (c<?> cVar : this.f14797b) {
                if (cVar.d(str)) {
                    i.c().a(f14795d, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(Iterable<p> iterable) {
        synchronized (this.f14798c) {
            for (c<?> g11 : this.f14797b) {
                g11.g((c.a) null);
            }
            for (c<?> e11 : this.f14797b) {
                e11.e(iterable);
            }
            for (c<?> g12 : this.f14797b) {
                g12.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.f14798c) {
            for (c<?> f11 : this.f14797b) {
                f11.f();
            }
        }
    }
}
