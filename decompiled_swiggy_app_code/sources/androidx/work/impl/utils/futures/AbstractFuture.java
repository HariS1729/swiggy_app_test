package androidx.work.impl.utils.futures;

import com.xiaomi.mipush.sdk.Constants;
import in.swiggy.android.tejas.feature.order.model.network.DashPaymentStatusTypes;
import in.swiggy.android.tejas.feature.order.model.network.DashStatusTypes;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractFuture<V> implements com.google.common.util.concurrent.b<V> {

    /* renamed from: d  reason: collision with root package name */
    static final boolean f12448d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f12449e = Logger.getLogger(AbstractFuture.class.getName());

    /* renamed from: f  reason: collision with root package name */
    static final b f12450f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f12451g = new Object();

    /* renamed from: a  reason: collision with root package name */
    volatile Object f12452a;

    /* renamed from: b  reason: collision with root package name */
    volatile d f12453b;

    /* renamed from: c  reason: collision with root package name */
    volatile h f12454c;

    private static final class Failure {

        /* renamed from: b  reason: collision with root package name */
        static final Failure f12455b = new Failure(new Throwable("Failure occurred while trying to finish a future.") {
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a  reason: collision with root package name */
        final Throwable f12456a;

        Failure(Throwable th2) {
            this.f12456a = (Throwable) AbstractFuture.d(th2);
        }
    }

    private static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2);

        /* access modifiers changed from: package-private */
        public abstract void d(h hVar, h hVar2);

        /* access modifiers changed from: package-private */
        public abstract void e(h hVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f12457c;

        /* renamed from: d  reason: collision with root package name */
        static final c f12458d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f12459a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f12460b;

        static {
            if (AbstractFuture.f12448d) {
                f12458d = null;
                f12457c = null;
                return;
            }
            f12458d = new c(false, (Throwable) null);
            f12457c = new c(true, (Throwable) null);
        }

        c(boolean z11, Throwable th2) {
            this.f12459a = z11;
            this.f12460b = th2;
        }
    }

    private static final class d {

        /* renamed from: d  reason: collision with root package name */
        static final d f12461d = new d((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f12462a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f12463b;

        /* renamed from: c  reason: collision with root package name */
        d f12464c;

        d(Runnable runnable, Executor executor) {
            this.f12462a = runnable;
            this.f12463b = executor;
        }
    }

    private static final class e extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<h, Thread> f12465a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<h, h> f12466b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractFuture, h> f12467c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractFuture, d> f12468d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractFuture, Object> f12469e;

        e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f12465a = atomicReferenceFieldUpdater;
            this.f12466b = atomicReferenceFieldUpdater2;
            this.f12467c = atomicReferenceFieldUpdater3;
            this.f12468d = atomicReferenceFieldUpdater4;
            this.f12469e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2) {
            return a.a(this.f12468d, abstractFuture, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return a.a(this.f12469e, abstractFuture, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2) {
            return a.a(this.f12467c, abstractFuture, hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(h hVar, h hVar2) {
            this.f12466b.lazySet(hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(h hVar, Thread thread) {
            this.f12465a.lazySet(hVar, thread);
        }
    }

    private static final class f<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final AbstractFuture<V> f12470a;

        /* renamed from: b  reason: collision with root package name */
        final com.google.common.util.concurrent.b<? extends V> f12471b;

        f(AbstractFuture<V> abstractFuture, com.google.common.util.concurrent.b<? extends V> bVar) {
            this.f12470a = abstractFuture;
            this.f12471b = bVar;
        }

        public void run() {
            if (this.f12470a.f12452a == this) {
                if (AbstractFuture.f12450f.b(this.f12470a, this, AbstractFuture.j(this.f12471b))) {
                    AbstractFuture.g(this.f12470a);
                }
            }
        }
    }

    private static final class g extends b {
        g() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f12453b != dVar) {
                    return false;
                }
                abstractFuture.f12453b = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f12452a != obj) {
                    return false;
                }
                abstractFuture.f12452a = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f12454c != hVar) {
                    return false;
                }
                abstractFuture.f12454c = hVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void d(h hVar, h hVar2) {
            hVar.f12474b = hVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(h hVar, Thread thread) {
            hVar.f12473a = thread;
        }
    }

    private static final class h {

        /* renamed from: c  reason: collision with root package name */
        static final h f12472c = new h(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f12473a;

        /* renamed from: b  reason: collision with root package name */
        volatile h f12474b;

        h(boolean z11) {
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar) {
            AbstractFuture.f12450f.d(this, hVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.f12473a;
            if (thread != null) {
                this.f12473a = null;
                LockSupport.unpark(thread);
            }
        }

        h() {
            AbstractFuture.f12450f.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.work.impl.utils.futures.AbstractFuture$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.work.impl.utils.futures.AbstractFuture$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.work.impl.utils.futures.AbstractFuture$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.work.impl.utils.futures.AbstractFuture$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture$h> r0 = androidx.work.impl.utils.futures.AbstractFuture.h.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f12448d = r1
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r1 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f12449e = r1
            androidx.work.impl.utils.futures.AbstractFuture$e r1 = new androidx.work.impl.utils.futures.AbstractFuture$e     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r2 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r0 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture$d> r2 = androidx.work.impl.utils.futures.AbstractFuture.d.class
            java.lang.String r6 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r0 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.work.impl.utils.futures.AbstractFuture$g r1 = new androidx.work.impl.utils.futures.AbstractFuture$g
            r1.<init>()
        L_0x0054:
            f12450f = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f12449e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f12451g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.<clinit>():void");
    }

    protected AbstractFuture() {
    }

    private void a(StringBuilder sb2) {
        try {
            Object k = k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(s(k));
            sb2.append("]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append(DashStatusTypes.TYPE_CANCELLED);
        } catch (RuntimeException e12) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e12.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private static CancellationException c(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    static <T> T d(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    private d f(d dVar) {
        d dVar2;
        do {
            dVar2 = this.f12453b;
        } while (!f12450f.a(this, dVar2, d.f12461d));
        d dVar3 = dVar2;
        d dVar4 = dVar;
        d dVar5 = dVar3;
        while (dVar5 != null) {
            d dVar6 = dVar5.f12464c;
            dVar5.f12464c = dVar4;
            dVar4 = dVar5;
            dVar5 = dVar6;
        }
        return dVar4;
    }

    static void g(AbstractFuture<?> abstractFuture) {
        d dVar = null;
        AbstractFuture<V> abstractFuture2 = abstractFuture;
        while (true) {
            abstractFuture2.n();
            abstractFuture2.b();
            d f11 = abstractFuture2.f(dVar);
            while (true) {
                if (f11 != null) {
                    dVar = f11.f12464c;
                    Runnable runnable = f11.f12462a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        AbstractFuture<V> abstractFuture3 = fVar.f12470a;
                        if (abstractFuture3.f12452a == fVar) {
                            if (f12450f.b(abstractFuture3, fVar, j(fVar.f12471b))) {
                                abstractFuture2 = abstractFuture3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        h(runnable, f11.f12463b);
                    }
                    f11 = dVar;
                } else {
                    return;
                }
            }
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e11) {
            Logger logger = f12449e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e11);
        }
    }

    private V i(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f12460b);
        } else if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f12456a);
        } else if (obj == f12451g) {
            return null;
        } else {
            return obj;
        }
    }

    static Object j(com.google.common.util.concurrent.b<?> bVar) {
        if (bVar instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) bVar).f12452a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (!cVar.f12459a) {
                return obj;
            }
            if (cVar.f12460b != null) {
                return new c(false, cVar.f12460b);
            }
            return c.f12458d;
        }
        boolean isCancelled = bVar.isCancelled();
        if ((!f12448d) && isCancelled) {
            return c.f12458d;
        }
        try {
            Object k = k(bVar);
            return k == null ? f12451g : k;
        } catch (ExecutionException e11) {
            return new Failure(e11.getCause());
        } catch (CancellationException e12) {
            if (isCancelled) {
                return new c(false, e12);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bVar, e12));
        } catch (Throwable th2) {
            return new Failure(th2);
        }
    }

    private static <V> V k(Future<V> future) throws ExecutionException {
        V v;
        boolean z11 = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private void n() {
        h hVar;
        do {
            hVar = this.f12454c;
        } while (!f12450f.c(this, hVar, h.f12472c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f12474b;
        }
    }

    private void o(h hVar) {
        hVar.f12473a = null;
        while (true) {
            h hVar2 = this.f12454c;
            if (hVar2 != h.f12472c) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.f12474b;
                    if (hVar2.f12473a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f12474b = hVar4;
                        if (hVar3.f12473a == null) {
                        }
                    } else if (!f12450f.c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.common.util.concurrent.b<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f12452a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.f
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f12448d
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = new androidx.work.impl.utils.futures.AbstractFuture$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = androidx.work.impl.utils.futures.AbstractFuture.c.f12457c
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = androidx.work.impl.utils.futures.AbstractFuture.c.f12458d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            androidx.work.impl.utils.futures.AbstractFuture$b r6 = f12450f
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.l()
        L_0x0035:
            g(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.f
            if (r4 == 0) goto L_0x0062
            androidx.work.impl.utils.futures.AbstractFuture$f r0 = (androidx.work.impl.utils.futures.AbstractFuture.f) r0
            com.google.common.util.concurrent.b<? extends V> r0 = r0.f12471b
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.work.impl.utils.futures.AbstractFuture r4 = (androidx.work.impl.utils.futures.AbstractFuture) r4
            java.lang.Object r0 = r4.f12452a
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.f
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f12452a
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.f
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.cancel(boolean):boolean");
    }

    public final void e(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        d dVar = this.f12453b;
        if (dVar != d.f12461d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f12464c = dVar;
                if (!f12450f.a(this, dVar, dVar2)) {
                    dVar = this.f12453b;
                } else {
                    return;
                }
            } while (dVar != d.f12461d);
        }
        h(runnable, executor);
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j11 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f12452a;
            if ((obj != null) && (!(obj instanceof f))) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                h hVar = this.f12454c;
                if (hVar != h.f12472c) {
                    h hVar2 = new h();
                    do {
                        hVar2.a(hVar);
                        if (f12450f.c(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f12452a;
                                    if ((obj2 != null) && (!(obj2 instanceof f))) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    o(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(hVar2);
                        } else {
                            hVar = this.f12454c;
                        }
                    } while (hVar != h.f12472c);
                }
                return i(this.f12452a);
            }
            while (nanos > 0) {
                Object obj3 = this.f12452a;
                if ((obj3 != null) && (!(obj3 instanceof f))) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractFuture = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String str = "Waited " + j11 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j12 = -nanos;
                long convert = timeUnit2.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit2.toNanos(convert);
                int i11 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z11 = i11 == 0 || nanos2 > 1000;
                if (i11 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z11) {
                        str3 = str3 + Constants.ACCEPT_TIME_SEPARATOR_SP;
                    }
                    str2 = str3 + " ";
                }
                if (z11) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + abstractFuture);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f12452a instanceof c;
    }

    public final boolean isDone() {
        Object obj = this.f12452a;
        return (!(obj instanceof f)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    public void l() {
    }

    /* access modifiers changed from: protected */
    public String m() {
        Object obj = this.f12452a;
        if (obj instanceof f) {
            return "setFuture=[" + s(((f) obj).f12471b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    public boolean p(V v) {
        if (v == null) {
            v = f12451g;
        }
        if (!f12450f.b(this, (Object) null, v)) {
            return false;
        }
        g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean q(Throwable th2) {
        if (!f12450f.b(this, (Object) null, new Failure((Throwable) d(th2)))) {
            return false;
        }
        g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean r(com.google.common.util.concurrent.b<? extends V> bVar) {
        f fVar;
        Failure failure;
        d(bVar);
        Object obj = this.f12452a;
        if (obj == null) {
            if (bVar.isDone()) {
                if (!f12450f.b(this, (Object) null, j(bVar))) {
                    return false;
                }
                g(this);
                return true;
            }
            fVar = new f(this, bVar);
            if (f12450f.b(this, (Object) null, fVar)) {
                try {
                    bVar.e(fVar, DirectExecutor.INSTANCE);
                } catch (Throwable unused) {
                    failure = Failure.f12455b;
                }
                return true;
            }
            obj = this.f12452a;
        }
        if (obj instanceof c) {
            bVar.cancel(((c) obj).f12459a);
        }
        return false;
        f12450f.b(this, fVar, failure);
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append(DashStatusTypes.TYPE_CANCELLED);
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                str = m();
            } catch (RuntimeException e11) {
                str = "Exception thrown from implementation: " + e11.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append(DashPaymentStatusTypes.STATE_PENDING);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f12452a;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return i(obj2);
            }
            h hVar = this.f12454c;
            if (hVar != h.f12472c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f12450f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f12452a;
                            } else {
                                o(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return i(obj);
                    }
                    hVar = this.f12454c;
                } while (hVar != h.f12472c);
            }
            return i(this.f12452a);
        }
        throw new InterruptedException();
    }
}
