package androidx.lifecycle;

import android.annotation.SuppressLint;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.p;
import wp0.t1;
import wp0.u0;

/* compiled from: DispatchQueue.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private boolean f10729a = true;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10730b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10731c;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<Runnable> f10732d = new ArrayDeque();

    /* access modifiers changed from: private */
    public static final void d(f fVar, Runnable runnable) {
        p.j(fVar, "this$0");
        p.j(runnable, "$runnable");
        fVar.f(runnable);
    }

    private final void f(Runnable runnable) {
        if (this.f10732d.offer(runnable)) {
            e();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }

    public final boolean b() {
        return this.f10730b || !this.f10729a;
    }

    @SuppressLint({"WrongThread"})
    public final void c(CoroutineContext coroutineContext, Runnable runnable) {
        p.j(coroutineContext, LogCategory.CONTEXT);
        p.j(runnable, "runnable");
        t1 N0 = u0.c().N0();
        if (N0.I0(coroutineContext) || b()) {
            N0.D(coroutineContext, new e(this, runnable));
        } else {
            f(runnable);
        }
    }

    public final void e() {
        if (!this.f10731c) {
            boolean z11 = false;
            z11 = true;
            try {
                while (true) {
                    if (!(this.f10732d.isEmpty() ^ z11)) {
                        break;
                    } else if (!b()) {
                        break;
                    } else {
                        Runnable poll = this.f10732d.poll();
                        if (poll != null) {
                            poll.run();
                        }
                    }
                }
                this.f10731c = z11;
            } finally {
                this.f10731c = z11;
            }
        }
    }

    public final void g() {
        this.f10730b = true;
        e();
    }

    public final void h() {
        this.f10729a = true;
    }

    public final void i() {
        if (this.f10729a) {
            if (!this.f10730b) {
                this.f10729a = false;
                e();
                return;
            }
            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
        }
    }
}
