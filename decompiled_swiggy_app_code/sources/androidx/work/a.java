package androidx.work;

import android.os.Build;
import d4.e;
import d4.g;
import d4.l;
import d4.o;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Configuration */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    final Executor f12316a;

    /* renamed from: b  reason: collision with root package name */
    final Executor f12317b;

    /* renamed from: c  reason: collision with root package name */
    final o f12318c;

    /* renamed from: d  reason: collision with root package name */
    final g f12319d;

    /* renamed from: e  reason: collision with root package name */
    final l f12320e;

    /* renamed from: f  reason: collision with root package name */
    final e f12321f;

    /* renamed from: g  reason: collision with root package name */
    final String f12322g;

    /* renamed from: h  reason: collision with root package name */
    final int f12323h;

    /* renamed from: i  reason: collision with root package name */
    final int f12324i;
    final int j;
    final int k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f12325l;

    /* renamed from: androidx.work.a$a  reason: collision with other inner class name */
    /* compiled from: Configuration */
    class C0093a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f12326a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f12327b;

        C0093a(boolean z11) {
            this.f12327b = z11;
        }

        public Thread newThread(Runnable runnable) {
            String str = this.f12327b ? "WM.task-" : "androidx.work-";
            return new Thread(runnable, str + this.f12326a.incrementAndGet());
        }
    }

    /* compiled from: Configuration */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        Executor f12329a;

        /* renamed from: b  reason: collision with root package name */
        o f12330b;

        /* renamed from: c  reason: collision with root package name */
        g f12331c;

        /* renamed from: d  reason: collision with root package name */
        Executor f12332d;

        /* renamed from: e  reason: collision with root package name */
        l f12333e;

        /* renamed from: f  reason: collision with root package name */
        e f12334f;

        /* renamed from: g  reason: collision with root package name */
        String f12335g;

        /* renamed from: h  reason: collision with root package name */
        int f12336h = 4;

        /* renamed from: i  reason: collision with root package name */
        int f12337i = 0;
        int j = Integer.MAX_VALUE;
        int k = 20;

        public a a() {
            return new a(this);
        }

        public b b(o oVar) {
            this.f12330b = oVar;
            return this;
        }
    }

    /* compiled from: Configuration */
    public interface c {
        a i();
    }

    a(b bVar) {
        Executor executor = bVar.f12329a;
        if (executor == null) {
            this.f12316a = a(false);
        } else {
            this.f12316a = executor;
        }
        Executor executor2 = bVar.f12332d;
        if (executor2 == null) {
            this.f12325l = true;
            this.f12317b = a(true);
        } else {
            this.f12325l = false;
            this.f12317b = executor2;
        }
        o oVar = bVar.f12330b;
        if (oVar == null) {
            this.f12318c = o.c();
        } else {
            this.f12318c = oVar;
        }
        g gVar = bVar.f12331c;
        if (gVar == null) {
            this.f12319d = g.c();
        } else {
            this.f12319d = gVar;
        }
        l lVar = bVar.f12333e;
        if (lVar == null) {
            this.f12320e = new e4.a();
        } else {
            this.f12320e = lVar;
        }
        this.f12323h = bVar.f12336h;
        this.f12324i = bVar.f12337i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.f12321f = bVar.f12334f;
        this.f12322g = bVar.f12335g;
    }

    private Executor a(boolean z11) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z11));
    }

    private ThreadFactory b(boolean z11) {
        return new C0093a(z11);
    }

    public String c() {
        return this.f12322g;
    }

    public e d() {
        return this.f12321f;
    }

    public Executor e() {
        return this.f12316a;
    }

    public g f() {
        return this.f12319d;
    }

    public int g() {
        return this.j;
    }

    public int h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.k / 2;
        }
        return this.k;
    }

    public int i() {
        return this.f12324i;
    }

    public int j() {
        return this.f12323h;
    }

    public l k() {
        return this.f12320e;
    }

    public Executor l() {
        return this.f12317b;
    }

    public o m() {
        return this.f12318c;
    }
}
