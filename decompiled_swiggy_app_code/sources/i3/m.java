package i3;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import androidx.metrics.performance.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: JankStatsApi24Impl.kt */
public class m extends k {

    /* renamed from: l  reason: collision with root package name */
    public static final a f15033l = new a((i) null);

    /* renamed from: m  reason: collision with root package name */
    private static Handler f15034m;

    /* renamed from: h  reason: collision with root package name */
    private final Window f15035h;

    /* renamed from: i  reason: collision with root package name */
    private long f15036i;
    private long j;
    private final Window.OnFrameMetricsAvailableListener k;

    /* compiled from: JankStatsApi24Impl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(i iVar, View view, Window window) {
        super(iVar, view);
        p.j(iVar, "jankStats");
        p.j(view, "view");
        p.j(window, "window");
        this.f15035h = window;
        this.k = new l(this, iVar);
    }

    /* access modifiers changed from: private */
    public static final void m(m mVar, i iVar, Window window, FrameMetrics frameMetrics, int i11) {
        p.j(mVar, "this$0");
        p.j(iVar, "$jankStats");
        p.i(frameMetrics, "frameMetrics");
        long p11 = mVar.p(frameMetrics);
        if (p11 >= mVar.j && p11 != mVar.f15036i) {
            iVar.d(mVar.o(p11, (long) (((float) mVar.n(frameMetrics)) * iVar.b()), frameMetrics));
            mVar.f15036i = p11;
        }
    }

    private final List<Window.OnFrameMetricsAvailableListener> r(Window window) {
        View decorView = window.getDecorView();
        int i11 = R.id.metricsDelegator;
        a aVar = (a) decorView.getTag(i11);
        if (aVar == null) {
            a aVar2 = new a(new ArrayList());
            if (f15034m == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                handlerThread.start();
                f15034m = new Handler(handlerThread.getLooper());
            }
            window.addOnFrameMetricsAvailableListener(aVar2, f15034m);
            window.getDecorView().setTag(i11, aVar2);
            aVar = aVar2;
        }
        return aVar.a();
    }

    private final void s(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        List<Window.OnFrameMetricsAvailableListener> list;
        View decorView = window.getDecorView();
        int i11 = R.id.metricsDelegator;
        a aVar = (a) decorView.getTag(i11);
        if (aVar == null) {
            list = null;
        } else {
            list = aVar.a();
        }
        if (list != null) {
            list.remove(onFrameMetricsAvailableListener);
        }
        boolean z11 = false;
        if (list != null && list.size() == 0) {
            z11 = true;
        }
        if (z11) {
            window.removeOnFrameMetricsAvailableListener(aVar);
            window.getDecorView().setTag(i11, (Object) null);
        }
    }

    public void c(boolean z11) {
        Window window = this.f15035h;
        if (!z11) {
            s(window, this.k);
            t(0);
        } else if (q() == 0) {
            r(this.f15035h).add(this.k);
            t(System.nanoTime());
        }
    }

    public long n(FrameMetrics frameMetrics) {
        p.j(frameMetrics, "metrics");
        return f((View) e().get());
    }

    public f o(long j11, long j12, FrameMetrics frameMetrics) {
        long j13 = j11;
        FrameMetrics frameMetrics2 = frameMetrics;
        p.j(frameMetrics2, "frameMetrics");
        long metric = frameMetrics2.getMetric(0) + frameMetrics2.getMetric(1) + frameMetrics2.getMetric(2) + frameMetrics2.getMetric(3) + frameMetrics2.getMetric(4) + frameMetrics2.getMetric(5);
        r a11 = i().a();
        List<s> c11 = a11 == null ? null : a11.c(j11, j13 + metric);
        if (c11 == null) {
            c11 = k.j();
        }
        return new f(j11, metric, frameMetrics2.getMetric(6) + metric + frameMetrics2.getMetric(7), metric > j12, c11);
    }

    public long p(FrameMetrics frameMetrics) {
        p.j(frameMetrics, "frameMetrics");
        return h();
    }

    public final long q() {
        return this.j;
    }

    public final void t(long j11) {
        this.j = j11;
    }
}
