package coil.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import wp0.k1;

/* compiled from: RequestDelegate.kt */
public final class BaseRequestDelegate extends RequestDelegate {

    /* renamed from: a  reason: collision with root package name */
    private final Lifecycle f13663a;

    /* renamed from: b  reason: collision with root package name */
    private final k1 f13664b;

    public BaseRequestDelegate(Lifecycle lifecycle, k1 k1Var) {
        super((i) null);
        this.f13663a = lifecycle;
        this.f13664b = k1Var;
    }

    public void c() {
        this.f13663a.c(this);
    }

    public void e() {
        this.f13663a.a(this);
    }

    public void f() {
        k1.a.a(this.f13664b, (CancellationException) null, 1, (Object) null);
    }

    public void onDestroy(r rVar) {
        f();
    }
}
