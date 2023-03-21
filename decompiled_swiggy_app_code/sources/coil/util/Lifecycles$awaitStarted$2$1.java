package coil.util;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.d;
import androidx.lifecycle.r;
import bp0.k;
import kotlin.Result;
import wp0.n;

/* renamed from: coil.util.-Lifecycles$awaitStarted$2$1  reason: invalid class name */
/* compiled from: Lifecycles.kt */
public final class Lifecycles$awaitStarted$2$1 implements DefaultLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n<k> f13690a;

    Lifecycles$awaitStarted$2$1(n<? super k> nVar) {
        this.f13690a = nVar;
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

    public void onStart(r rVar) {
        n<k> nVar = this.f13690a;
        Result.a aVar = Result.f25582b;
        nVar.resumeWith(Result.b(k.f22762a));
    }

    public /* synthetic */ void onStop(r rVar) {
        d.f(this, rVar);
    }
}
