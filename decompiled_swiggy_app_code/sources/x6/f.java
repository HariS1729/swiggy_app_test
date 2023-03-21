package x6;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import androidx.lifecycle.r;

/* compiled from: GlobalLifecycle.kt */
public final class f extends Lifecycle {

    /* renamed from: b  reason: collision with root package name */
    public static final f f17772b = new f();

    /* renamed from: c  reason: collision with root package name */
    private static final r f17773c = e.f29599a;

    private f() {
    }

    /* access modifiers changed from: private */
    public static final Lifecycle e() {
        return f17772b;
    }

    public void a(q qVar) {
        if (qVar instanceof DefaultLifecycleObserver) {
            DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) qVar;
            r rVar = f17773c;
            defaultLifecycleObserver.onCreate(rVar);
            defaultLifecycleObserver.onStart(rVar);
            defaultLifecycleObserver.onResume(rVar);
            return;
        }
        throw new IllegalArgumentException((qVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    public Lifecycle.State b() {
        return Lifecycle.State.RESUMED;
    }

    public void c(q qVar) {
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
