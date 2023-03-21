package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import defpackage.s1;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import t3.g;
import t3.h;

/* compiled from: AutoCloser */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private h f11528a = null;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f11529b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    Runnable f11530c = null;

    /* renamed from: d  reason: collision with root package name */
    final Object f11531d = new Object();

    /* renamed from: e  reason: collision with root package name */
    final long f11532e;

    /* renamed from: f  reason: collision with root package name */
    final Executor f11533f;

    /* renamed from: g  reason: collision with root package name */
    int f11534g = 0;

    /* renamed from: h  reason: collision with root package name */
    long f11535h = SystemClock.uptimeMillis();

    /* renamed from: i  reason: collision with root package name */
    g f11536i;
    private boolean j = false;
    private final Runnable k = new C0080a();

    /* renamed from: l  reason: collision with root package name */
    final Runnable f11537l = new b();

    /* renamed from: androidx.room.a$a  reason: collision with other inner class name */
    /* compiled from: AutoCloser */
    class C0080a implements Runnable {
        C0080a() {
        }

        public void run() {
            a aVar = a.this;
            aVar.f11533f.execute(aVar.f11537l);
        }
    }

    /* compiled from: AutoCloser */
    class b implements Runnable {
        b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                androidx.room.a r0 = androidx.room.a.this
                java.lang.Object r0 = r0.f11531d
                monitor-enter(r0)
                long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x004a }
                androidx.room.a r3 = androidx.room.a.this     // Catch:{ all -> 0x004a }
                long r4 = r3.f11535h     // Catch:{ all -> 0x004a }
                long r1 = r1 - r4
                long r4 = r3.f11532e     // Catch:{ all -> 0x004a }
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 >= 0) goto L_0x0016
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return
            L_0x0016:
                int r1 = r3.f11534g     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x001c
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return
            L_0x001c:
                java.lang.Runnable r1 = r3.f11530c     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0042
                r1.run()     // Catch:{ all -> 0x004a }
                androidx.room.a r1 = androidx.room.a.this     // Catch:{ all -> 0x004a }
                t3.g r1 = r1.f11536i     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0040
                boolean r1 = r1.isOpen()     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0040
                androidx.room.a r1 = androidx.room.a.this     // Catch:{ IOException -> 0x0037 }
                t3.g r1 = r1.f11536i     // Catch:{ IOException -> 0x0037 }
                r1.close()     // Catch:{ IOException -> 0x0037 }
                goto L_0x003b
            L_0x0037:
                r1 = move-exception
                m3.e.a(r1)     // Catch:{ all -> 0x004a }
            L_0x003b:
                androidx.room.a r1 = androidx.room.a.this     // Catch:{ all -> 0x004a }
                r2 = 0
                r1.f11536i = r2     // Catch:{ all -> 0x004a }
            L_0x0040:
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return
            L_0x0042:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004a }
                java.lang.String r2 = "mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568"
                r1.<init>(r2)     // Catch:{ all -> 0x004a }
                throw r1     // Catch:{ all -> 0x004a }
            L_0x004a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.a.b.run():void");
        }
    }

    a(long j11, TimeUnit timeUnit, Executor executor) {
        this.f11532e = timeUnit.toMillis(j11);
        this.f11533f = executor;
    }

    public void a() throws IOException {
        synchronized (this.f11531d) {
            this.j = true;
            g gVar = this.f11536i;
            if (gVar != null) {
                gVar.close();
            }
            this.f11536i = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f11531d
            monitor-enter(r0)
            int r1 = r5.f11534g     // Catch:{ all -> 0x0026 }
            if (r1 <= 0) goto L_0x001e
            int r1 = r1 + -1
            r5.f11534g = r1     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x001c
            t3.g r1 = r5.f11536i     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0013:
            android.os.Handler r1 = r5.f11529b     // Catch:{ all -> 0x0026 }
            java.lang.Runnable r2 = r5.k     // Catch:{ all -> 0x0026 }
            long r3 = r5.f11532e     // Catch:{ all -> 0x0026 }
            r1.postDelayed(r2, r3)     // Catch:{ all -> 0x0026 }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = "ref count is 0 or lower but we're supposed to decrement"
            r1.<init>(r2)     // Catch:{ all -> 0x0026 }
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.a.b():void");
    }

    public <V> V c(s1.b<g, V> bVar) {
        try {
            return bVar.apply(e());
        } finally {
            b();
        }
    }

    public g d() {
        g gVar;
        synchronized (this.f11531d) {
            gVar = this.f11536i;
        }
        return gVar;
    }

    public g e() {
        synchronized (this.f11531d) {
            this.f11529b.removeCallbacks(this.k);
            this.f11534g++;
            if (!this.j) {
                g gVar = this.f11536i;
                if (gVar == null || !gVar.isOpen()) {
                    h hVar = this.f11528a;
                    if (hVar != null) {
                        g i11 = hVar.i();
                        this.f11536i = i11;
                        return i11;
                    }
                    throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                g gVar2 = this.f11536i;
                return gVar2;
            }
            throw new IllegalStateException("Attempting to open already closed database.");
        }
    }

    public void f(h hVar) {
        if (this.f11528a != null) {
            Log.e("ROOM", "AutoCloser initialized multiple times. Please file a bug against room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        } else {
            this.f11528a = hVar;
        }
    }

    public boolean g() {
        return !this.j;
    }

    public void h(Runnable runnable) {
        this.f11530c = runnable;
    }
}
