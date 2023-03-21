package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;

/* compiled from: ServiceLifecycleDispatcher */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final t f10740a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f10741b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    private a f10742c;

    /* compiled from: ServiceLifecycleDispatcher */
    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final t f10743a;

        /* renamed from: b  reason: collision with root package name */
        final Lifecycle.Event f10744b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f10745c = false;

        a(t tVar, Lifecycle.Event event) {
            this.f10743a = tVar;
            this.f10744b = event;
        }

        public void run() {
            if (!this.f10745c) {
                this.f10743a.h(this.f10744b);
                this.f10745c = true;
            }
        }
    }

    public h0(r rVar) {
        this.f10740a = new t(rVar);
    }

    private void f(Lifecycle.Event event) {
        a aVar = this.f10742c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f10740a, event);
        this.f10742c = aVar2;
        this.f10741b.postAtFrontOfQueue(aVar2);
    }

    public Lifecycle a() {
        return this.f10740a;
    }

    public void b() {
        f(Lifecycle.Event.ON_START);
    }

    public void c() {
        f(Lifecycle.Event.ON_CREATE);
    }

    public void d() {
        f(Lifecycle.Event.ON_STOP);
        f(Lifecycle.Event.ON_DESTROY);
    }

    public void e() {
        f(Lifecycle.Event.ON_START);
    }
}
