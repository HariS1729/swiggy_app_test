package coil.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.d;
import androidx.lifecycle.r;
import kotlin.jvm.internal.i;

/* compiled from: RequestDelegate.kt */
public abstract class RequestDelegate implements DefaultLifecycleObserver {
    private RequestDelegate() {
    }

    public /* synthetic */ RequestDelegate(i iVar) {
        this();
    }

    public void a() {
    }

    public void c() {
    }

    public void e() {
    }

    public /* synthetic */ void onCreate(r rVar) {
        d.a(this, rVar);
    }

    public /* synthetic */ void onDestroy(r rVar) {
        d.b(this, rVar);
    }

    public /* synthetic */ void onPause(r rVar) {
        d.c(this, rVar);
    }

    public /* synthetic */ void onResume(r rVar) {
        d.d(this, rVar);
    }

    public /* synthetic */ void onStart(r rVar) {
        d.e(this, rVar);
    }

    public /* synthetic */ void onStop(r rVar) {
        d.f(this, rVar);
    }
}
