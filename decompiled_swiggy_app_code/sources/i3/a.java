package i3;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import i3.r;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: JankStatsApi24Impl.kt */
final class a implements Window.OnFrameMetricsAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    private final List<Window.OnFrameMetricsAvailableListener> f15007a;

    public a(List<Window.OnFrameMetricsAvailableListener> list) {
        p.j(list, "delegates");
        this.f15007a = list;
    }

    public final List<Window.OnFrameMetricsAvailableListener> a() {
        return this.f15007a;
    }

    public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i11) {
        View view;
        for (Window.OnFrameMetricsAvailableListener onFrameMetricsAvailable : this.f15007a) {
            onFrameMetricsAvailable.onFrameMetricsAvailable(window, frameMetrics, i11);
        }
        if (window == null) {
            view = null;
        } else {
            view = window.getDecorView();
        }
        if (view != null) {
            r.a aVar = r.f15040c;
            View decorView = window.getDecorView();
            p.i(decorView, "window.decorView");
            r a11 = aVar.b(decorView).a();
            if (a11 != null) {
                a11.b();
            }
        }
    }
}
