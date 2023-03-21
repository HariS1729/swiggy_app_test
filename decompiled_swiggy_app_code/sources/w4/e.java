package w4;

import bolts.ExecutorException;
import bolts.UnobservedTaskException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: Task */
public class e<TResult> {

    /* renamed from: i  reason: collision with root package name */
    public static final ExecutorService f17474i = b.a();
    private static final Executor j = b.b();
    public static final Executor k = a.c();

    /* renamed from: l  reason: collision with root package name */
    private static volatile d f17475l;

    /* renamed from: m  reason: collision with root package name */
    private static e<?> f17476m = new e<>((Object) null);
    private static e<Boolean> n = new e<>(Boolean.TRUE);

    /* renamed from: o  reason: collision with root package name */
    private static e<Boolean> f17477o = new e<>(Boolean.FALSE);

    /* renamed from: p  reason: collision with root package name */
    private static e<?> f17478p = new e<>(true);

    /* renamed from: a  reason: collision with root package name */
    private final Object f17479a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f17480b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17481c;

    /* renamed from: d  reason: collision with root package name */
    private TResult f17482d;

    /* renamed from: e  reason: collision with root package name */
    private Exception f17483e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17484f;

    /* renamed from: g  reason: collision with root package name */
    private g f17485g;

    /* renamed from: h  reason: collision with root package name */
    private List<d<TResult, Void>> f17486h = new ArrayList();

    /* compiled from: Task */
    class a implements d<TResult, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f17487a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f17488b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Executor f17489c;

        a(f fVar, d dVar, Executor executor, c cVar) {
            this.f17487a = fVar;
            this.f17488b = dVar;
            this.f17489c = executor;
        }

        /* renamed from: b */
        public Void a(e<TResult> eVar) {
            e.d(this.f17487a, this.f17488b, eVar, this.f17489c, (c) null);
            return null;
        }
    }

    /* compiled from: Task */
    static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f17491a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f17492b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f17493c;

        b(c cVar, f fVar, d dVar, e eVar) {
            this.f17491a = fVar;
            this.f17492b = dVar;
            this.f17493c = eVar;
        }

        public void run() {
            try {
                this.f17491a.d(this.f17492b.a(this.f17493c));
            } catch (CancellationException unused) {
                this.f17491a.b();
            } catch (Exception e11) {
                this.f17491a.c(e11);
            }
        }
    }

    /* compiled from: Task */
    static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f17494a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Callable f17495b;

        c(c cVar, f fVar, Callable callable) {
            this.f17494a = fVar;
            this.f17495b = callable;
        }

        public void run() {
            try {
                this.f17494a.d(this.f17495b.call());
            } catch (CancellationException unused) {
                this.f17494a.b();
            } catch (Exception e11) {
                this.f17494a.c(e11);
            }
        }
    }

    /* compiled from: Task */
    public interface d {
        void a(e<?> eVar, UnobservedTaskException unobservedTaskException);
    }

    e() {
    }

    public static <TResult> e<TResult> b(Callable<TResult> callable, Executor executor) {
        return c(callable, executor, (c) null);
    }

    public static <TResult> e<TResult> c(Callable<TResult> callable, Executor executor, c cVar) {
        f fVar = new f();
        try {
            executor.execute(new c(cVar, fVar, callable));
        } catch (Exception e11) {
            fVar.c(new ExecutorException(e11));
        }
        return fVar.a();
    }

    /* access modifiers changed from: private */
    public static <TContinuationResult, TResult> void d(f<TContinuationResult> fVar, d<TResult, TContinuationResult> dVar, e<TResult> eVar, Executor executor, c cVar) {
        try {
            executor.execute(new b(cVar, fVar, dVar, eVar));
        } catch (Exception e11) {
            fVar.c(new ExecutorException(e11));
        }
    }

    public static <TResult> e<TResult> g(Exception exc) {
        f fVar = new f();
        fVar.c(exc);
        return fVar.a();
    }

    public static <TResult> e<TResult> h(TResult tresult) {
        if (tresult == null) {
            return f17476m;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? n : f17477o;
        }
        f fVar = new f();
        fVar.d(tresult);
        return fVar.a();
    }

    public static d k() {
        return f17475l;
    }

    private void o() {
        synchronized (this.f17479a) {
            for (d a11 : this.f17486h) {
                try {
                    a11.a(this);
                } catch (RuntimeException e11) {
                    throw e11;
                } catch (Exception e12) {
                    throw new RuntimeException(e12);
                }
            }
            this.f17486h = null;
        }
    }

    public <TContinuationResult> e<TContinuationResult> e(d<TResult, TContinuationResult> dVar) {
        return f(dVar, j, (c) null);
    }

    public <TContinuationResult> e<TContinuationResult> f(d<TResult, TContinuationResult> dVar, Executor executor, c cVar) {
        boolean m11;
        f fVar = new f();
        synchronized (this.f17479a) {
            m11 = m();
            if (!m11) {
                this.f17486h.add(new a(fVar, dVar, executor, cVar));
            }
        }
        if (m11) {
            d(fVar, dVar, this, executor, cVar);
        }
        return fVar.a();
    }

    public Exception i() {
        Exception exc;
        synchronized (this.f17479a) {
            if (this.f17483e != null) {
                this.f17484f = true;
                g gVar = this.f17485g;
                if (gVar != null) {
                    gVar.a();
                    this.f17485g = null;
                }
            }
            exc = this.f17483e;
        }
        return exc;
    }

    public TResult j() {
        TResult tresult;
        synchronized (this.f17479a) {
            tresult = this.f17482d;
        }
        return tresult;
    }

    public boolean l() {
        boolean z11;
        synchronized (this.f17479a) {
            z11 = this.f17481c;
        }
        return z11;
    }

    public boolean m() {
        boolean z11;
        synchronized (this.f17479a) {
            z11 = this.f17480b;
        }
        return z11;
    }

    public boolean n() {
        boolean z11;
        synchronized (this.f17479a) {
            z11 = i() != null;
        }
        return z11;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        synchronized (this.f17479a) {
            if (this.f17480b) {
                return false;
            }
            this.f17480b = true;
            this.f17481c = true;
            this.f17479a.notifyAll();
            o();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean q(java.lang.Exception r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f17479a
            monitor-enter(r0)
            boolean r1 = r3.f17480b     // Catch:{ all -> 0x002c }
            r2 = 0
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r2
        L_0x000a:
            r1 = 1
            r3.f17480b = r1     // Catch:{ all -> 0x002c }
            r3.f17483e = r4     // Catch:{ all -> 0x002c }
            r3.f17484f = r2     // Catch:{ all -> 0x002c }
            java.lang.Object r4 = r3.f17479a     // Catch:{ all -> 0x002c }
            r4.notifyAll()     // Catch:{ all -> 0x002c }
            r3.o()     // Catch:{ all -> 0x002c }
            boolean r4 = r3.f17484f     // Catch:{ all -> 0x002c }
            if (r4 != 0) goto L_0x002a
            w4.e$d r4 = k()     // Catch:{ all -> 0x002c }
            if (r4 == 0) goto L_0x002a
            w4.g r4 = new w4.g     // Catch:{ all -> 0x002c }
            r4.<init>(r3)     // Catch:{ all -> 0x002c }
            r3.f17485g = r4     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r1
        L_0x002c:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.e.q(java.lang.Exception):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean r(TResult tresult) {
        synchronized (this.f17479a) {
            if (this.f17480b) {
                return false;
            }
            this.f17480b = true;
            this.f17482d = tresult;
            this.f17479a.notifyAll();
            o();
            return true;
        }
    }

    private e(TResult tresult) {
        r(tresult);
    }

    private e(boolean z11) {
        if (z11) {
            p();
        } else {
            r((Object) null);
        }
    }
}
