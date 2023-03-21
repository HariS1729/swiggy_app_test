package i3;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.p;

/* compiled from: JankStatsApi26Impl.kt */
public class n extends m {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(i iVar, View view, Window window) {
        super(iVar, view, window);
        p.j(iVar, "jankStats");
        p.j(view, "view");
        p.j(window, "window");
    }

    public long p(FrameMetrics frameMetrics) {
        p.j(frameMetrics, "frameMetrics");
        return frameMetrics.getMetric(11);
    }
}
