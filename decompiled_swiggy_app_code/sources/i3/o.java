package i3;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: JankStatsApi31Impl.kt */
public final class o extends n {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(i iVar, View view, Window window) {
        super(iVar, view, window);
        p.j(iVar, "jankStats");
        p.j(view, "view");
        p.j(window, "window");
    }

    public long n(FrameMetrics frameMetrics) {
        p.j(frameMetrics, "metrics");
        return frameMetrics.getMetric(13);
    }

    /* renamed from: u */
    public g o(long j, long j11, FrameMetrics frameMetrics) {
        long j12 = j;
        FrameMetrics frameMetrics2 = frameMetrics;
        p.j(frameMetrics2, "frameMetrics");
        long metric = frameMetrics2.getMetric(0) + frameMetrics2.getMetric(1) + frameMetrics2.getMetric(2) + frameMetrics2.getMetric(3) + frameMetrics2.getMetric(4) + frameMetrics2.getMetric(5);
        r a11 = i().a();
        List<s> c11 = a11 == null ? null : a11.c(j12, j12 + metric);
        if (c11 == null) {
            c11 = k.j();
        }
        return new g(j, metric, frameMetrics2.getMetric(6) + metric + frameMetrics2.getMetric(7), frameMetrics2.getMetric(8) - frameMetrics2.getMetric(13), metric > j11, c11);
    }
}
