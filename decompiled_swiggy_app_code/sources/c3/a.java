package c3;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.g;
import java.util.ArrayList;

/* compiled from: AnimationHandler */
class a {

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadLocal<a> f12769g = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private final g<b, Long> f12770a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f12771b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final C0105a f12772c = new C0105a();

    /* renamed from: d  reason: collision with root package name */
    private c f12773d;

    /* renamed from: e  reason: collision with root package name */
    long f12774e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12775f = false;

    /* renamed from: c3.a$a  reason: collision with other inner class name */
    /* compiled from: AnimationHandler */
    class C0105a {
        C0105a() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            a.this.f12774e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f12774e);
            if (a.this.f12771b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    /* compiled from: AnimationHandler */
    interface b {
        boolean a(long j);
    }

    /* compiled from: AnimationHandler */
    static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final C0105a f12777a;

        c(C0105a aVar) {
            this.f12777a = aVar;
        }

        /* access modifiers changed from: package-private */
        public abstract void a();
    }

    /* compiled from: AnimationHandler */
    private static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        private final Choreographer f12778b = Choreographer.getInstance();

        /* renamed from: c  reason: collision with root package name */
        private final Choreographer.FrameCallback f12779c = new C0106a();

        /* renamed from: c3.a$d$a  reason: collision with other inner class name */
        /* compiled from: AnimationHandler */
        class C0106a implements Choreographer.FrameCallback {
            C0106a() {
            }

            public void doFrame(long j) {
                d.this.f12777a.a();
            }
        }

        d(C0105a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f12778b.postFrameCallback(this.f12779c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f12775f) {
            for (int size = this.f12771b.size() - 1; size >= 0; size--) {
                if (this.f12771b.get(size) == null) {
                    this.f12771b.remove(size);
                }
            }
            this.f12775f = false;
        }
    }

    public static a d() {
        ThreadLocal<a> threadLocal = f12769g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    private boolean f(b bVar, long j) {
        Long l11 = this.f12770a.get(bVar);
        if (l11 == null) {
            return true;
        }
        if (l11.longValue() >= j) {
            return false;
        }
        this.f12770a.remove(bVar);
        return true;
    }

    public void a(b bVar, long j) {
        if (this.f12771b.size() == 0) {
            e().a();
        }
        if (!this.f12771b.contains(bVar)) {
            this.f12771b.add(bVar);
        }
        if (j > 0) {
            this.f12770a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* access modifiers changed from: package-private */
    public void c(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i11 = 0; i11 < this.f12771b.size(); i11++) {
            b bVar = this.f12771b.get(i11);
            if (bVar != null && f(bVar, uptimeMillis)) {
                bVar.a(j);
            }
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public c e() {
        if (this.f12773d == null) {
            this.f12773d = new d(this.f12772c);
        }
        return this.f12773d;
    }

    public void g(b bVar) {
        this.f12770a.remove(bVar);
        int indexOf = this.f12771b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f12771b.set(indexOf, (Object) null);
            this.f12775f = true;
        }
    }
}
