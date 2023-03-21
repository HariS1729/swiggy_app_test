package l;

import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor */
public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f15420c;

    /* renamed from: d  reason: collision with root package name */
    private static final Executor f15421d = new C0144a();

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f15422e = new b();

    /* renamed from: a  reason: collision with root package name */
    private c f15423a;

    /* renamed from: b  reason: collision with root package name */
    private c f15424b;

    /* renamed from: l.a$a  reason: collision with other inner class name */
    /* compiled from: ArchTaskExecutor */
    static class C0144a implements Executor {
        C0144a() {
        }

        public void execute(Runnable runnable) {
            a.e().c(runnable);
        }
    }

    /* compiled from: ArchTaskExecutor */
    static class b implements Executor {
        b() {
        }

        public void execute(Runnable runnable) {
            a.e().a(runnable);
        }
    }

    private a() {
        b bVar = new b();
        this.f15424b = bVar;
        this.f15423a = bVar;
    }

    public static Executor d() {
        return f15422e;
    }

    public static a e() {
        if (f15420c != null) {
            return f15420c;
        }
        synchronized (a.class) {
            if (f15420c == null) {
                f15420c = new a();
            }
        }
        return f15420c;
    }

    public void a(Runnable runnable) {
        this.f15423a.a(runnable);
    }

    public boolean b() {
        return this.f15423a.b();
    }

    public void c(Runnable runnable) {
        this.f15423a.c(runnable);
    }
}
