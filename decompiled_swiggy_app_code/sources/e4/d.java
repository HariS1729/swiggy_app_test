package e4;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.b;
import d4.c;
import d4.i;
import e4.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import m4.l;

/* compiled from: Processor */
public class d implements b, k4.a {

    /* renamed from: l  reason: collision with root package name */
    private static final String f14287l = i.f("Processor");

    /* renamed from: a  reason: collision with root package name */
    private PowerManager.WakeLock f14288a;

    /* renamed from: b  reason: collision with root package name */
    private Context f14289b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.work.a f14290c;

    /* renamed from: d  reason: collision with root package name */
    private n4.a f14291d;

    /* renamed from: e  reason: collision with root package name */
    private WorkDatabase f14292e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, j> f14293f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private Map<String, j> f14294g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private List<e> f14295h;

    /* renamed from: i  reason: collision with root package name */
    private Set<String> f14296i;
    private final List<b> j;
    private final Object k;

    /* compiled from: Processor */
    private static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private b f14297a;

        /* renamed from: b  reason: collision with root package name */
        private String f14298b;

        /* renamed from: c  reason: collision with root package name */
        private b<Boolean> f14299c;

        a(b bVar, String str, b<Boolean> bVar2) {
            this.f14297a = bVar;
            this.f14298b = str;
            this.f14299c = bVar2;
        }

        public void run() {
            boolean z11;
            try {
                z11 = this.f14299c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z11 = true;
            }
            this.f14297a.c(this.f14298b, z11);
        }
    }

    public d(Context context, androidx.work.a aVar, n4.a aVar2, WorkDatabase workDatabase, List<e> list) {
        this.f14289b = context;
        this.f14290c = aVar;
        this.f14291d = aVar2;
        this.f14292e = workDatabase;
        this.f14295h = list;
        this.f14296i = new HashSet();
        this.j = new ArrayList();
        this.f14288a = null;
        this.k = new Object();
    }

    private static boolean e(String str, j jVar) {
        if (jVar != null) {
            jVar.d();
            i.c().a(f14287l, String.format("WorkerWrapper interrupted for %s", new Object[]{str}), new Throwable[0]);
            return true;
        }
        i.c().a(f14287l, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
        return false;
    }

    private void m() {
        synchronized (this.k) {
            if (!(!this.f14293f.isEmpty())) {
                try {
                    this.f14289b.startService(androidx.work.impl.foreground.a.e(this.f14289b));
                } catch (Throwable th2) {
                    i.c().b(f14287l, "Unable to stop foreground service", th2);
                }
                PowerManager.WakeLock wakeLock = this.f14288a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f14288a = null;
                }
            }
        }
    }

    public void a(String str, c cVar) {
        synchronized (this.k) {
            i.c().d(f14287l, String.format("Moving WorkSpec (%s) to the foreground", new Object[]{str}), new Throwable[0]);
            j remove = this.f14294g.remove(str);
            if (remove != null) {
                if (this.f14288a == null) {
                    PowerManager.WakeLock b11 = l.b(this.f14289b, "ProcessorForegroundLck");
                    this.f14288a = b11;
                    b11.acquire();
                }
                this.f14293f.put(str, remove);
                androidx.core.content.a.n(this.f14289b, androidx.work.impl.foreground.a.d(this.f14289b, str, cVar));
            }
        }
    }

    public void b(String str) {
        synchronized (this.k) {
            this.f14293f.remove(str);
            m();
        }
    }

    public void c(String str, boolean z11) {
        synchronized (this.k) {
            this.f14294g.remove(str);
            i.c().a(f14287l, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z11)}), new Throwable[0]);
            for (b c11 : this.j) {
                c11.c(str, z11);
            }
        }
    }

    public void d(b bVar) {
        synchronized (this.k) {
            this.j.add(bVar);
        }
    }

    public boolean f(String str) {
        boolean contains;
        synchronized (this.k) {
            contains = this.f14296i.contains(str);
        }
        return contains;
    }

    public boolean g(String str) {
        boolean z11;
        synchronized (this.k) {
            if (!this.f14294g.containsKey(str)) {
                if (!this.f14293f.containsKey(str)) {
                    z11 = false;
                }
            }
            z11 = true;
        }
        return z11;
    }

    public boolean h(String str) {
        boolean containsKey;
        synchronized (this.k) {
            containsKey = this.f14293f.containsKey(str);
        }
        return containsKey;
    }

    public void i(b bVar) {
        synchronized (this.k) {
            this.j.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, (WorkerParameters.a) null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        synchronized (this.k) {
            if (g(str)) {
                i.c().a(f14287l, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            j a11 = new j.c(this.f14289b, this.f14290c, this.f14291d, this, this.f14292e, str).c(this.f14295h).b(aVar).a();
            b<Boolean> b11 = a11.b();
            b11.e(new a(this, str, b11), this.f14291d.b());
            this.f14294g.put(str, a11);
            this.f14291d.a().execute(a11);
            i.c().a(f14287l, String.format("%s: processing %s", new Object[]{getClass().getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    public boolean l(String str) {
        boolean e11;
        synchronized (this.k) {
            boolean z11 = true;
            i.c().a(f14287l, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.f14296i.add(str);
            j remove = this.f14293f.remove(str);
            if (remove == null) {
                z11 = false;
            }
            if (remove == null) {
                remove = this.f14294g.remove(str);
            }
            e11 = e(str, remove);
            if (z11) {
                m();
            }
        }
        return e11;
    }

    public boolean n(String str) {
        boolean e11;
        synchronized (this.k) {
            i.c().a(f14287l, String.format("Processor stopping foreground work %s", new Object[]{str}), new Throwable[0]);
            e11 = e(str, this.f14293f.remove(str));
        }
        return e11;
    }

    public boolean o(String str) {
        boolean e11;
        synchronized (this.k) {
            i.c().a(f14287l, String.format("Processor stopping background work %s", new Object[]{str}), new Throwable[0]);
            e11 = e(str, this.f14294g.remove(str));
        }
        return e11;
    }
}
