package m4;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import d4.i;
import e4.d;
import l4.q;

/* compiled from: StopWorkRunnable */
public class j implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private static final String f15655d = i.f("StopWorkRunnable");

    /* renamed from: a  reason: collision with root package name */
    private final e4.i f15656a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15657b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15658c;

    public j(e4.i iVar, String str, boolean z11) {
        this.f15656a = iVar;
        this.f15657b = str;
        this.f15658c = z11;
    }

    public void run() {
        boolean z11;
        WorkDatabase w11 = this.f15656a.w();
        d u11 = this.f15656a.u();
        q N = w11.N();
        w11.e();
        try {
            boolean h11 = u11.h(this.f15657b);
            if (this.f15658c) {
                z11 = this.f15656a.u().n(this.f15657b);
            } else {
                if (!h11 && N.d(this.f15657b) == WorkInfo.State.RUNNING) {
                    N.b(WorkInfo.State.ENQUEUED, this.f15657b);
                }
                z11 = this.f15656a.u().o(this.f15657b);
            }
            i.c().a(f15655d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f15657b, Boolean.valueOf(z11)}), new Throwable[0]);
            w11.C();
        } finally {
            w11.i();
        }
    }
}
