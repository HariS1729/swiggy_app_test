package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class FrameMetricsAggregator {

    /* renamed from: a  reason: collision with root package name */
    private final b f8953a;

    private static class a extends b {

        /* renamed from: e  reason: collision with root package name */
        private static HandlerThread f8954e;

        /* renamed from: f  reason: collision with root package name */
        private static Handler f8955f;

        /* renamed from: a  reason: collision with root package name */
        int f8956a;

        /* renamed from: b  reason: collision with root package name */
        SparseIntArray[] f8957b = new SparseIntArray[9];

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList<WeakReference<Activity>> f8958c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f8959d = new C0031a();

        /* renamed from: androidx.core.app.FrameMetricsAggregator$a$a  reason: collision with other inner class name */
        class C0031a implements Window.OnFrameMetricsAvailableListener {
            C0031a() {
            }

            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i11) {
                a aVar = a.this;
                if ((aVar.f8956a & 1) != 0) {
                    aVar.f(aVar.f8957b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f8956a & 2) != 0) {
                    aVar2.f(aVar2.f8957b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f8956a & 4) != 0) {
                    aVar3.f(aVar3.f8957b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f8956a & 8) != 0) {
                    aVar4.f(aVar4.f8957b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f8956a & 16) != 0) {
                    aVar5.f(aVar5.f8957b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f8956a & 64) != 0) {
                    aVar6.f(aVar6.f8957b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f8956a & 32) != 0) {
                    aVar7.f(aVar7.f8957b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f8956a & 128) != 0) {
                    aVar8.f(aVar8.f8957b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f8956a & 256) != 0) {
                    aVar9.f(aVar9.f8957b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i11) {
            this.f8956a = i11;
        }

        public void a(Activity activity) {
            if (f8954e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f8954e = handlerThread;
                handlerThread.start();
                f8955f = new Handler(f8954e.getLooper());
            }
            for (int i11 = 0; i11 <= 8; i11++) {
                SparseIntArray[] sparseIntArrayArr = this.f8957b;
                if (sparseIntArrayArr[i11] == null && (this.f8956a & (1 << i11)) != 0) {
                    sparseIntArrayArr[i11] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f8959d, f8955f);
            this.f8958c.add(new WeakReference(activity));
        }

        public SparseIntArray[] b() {
            return this.f8957b;
        }

        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it2 = this.f8958c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                WeakReference next = it2.next();
                if (next.get() == activity) {
                    this.f8958c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f8959d);
            return this.f8957b;
        }

        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f8957b;
            this.f8957b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        public SparseIntArray[] e() {
            for (int size = this.f8958c.size() - 1; size >= 0; size--) {
                WeakReference weakReference = this.f8958c.get(size);
                Activity activity = (Activity) weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f8959d);
                    this.f8958c.remove(size);
                }
            }
            return this.f8957b;
        }

        /* access modifiers changed from: package-private */
        public void f(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i11 = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i11, sparseIntArray.get(i11) + 1);
                }
            }
        }
    }

    private static class b {
        b() {
        }

        public void a(Activity activity) {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public SparseIntArray[] e() {
            return null;
        }
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public void a(Activity activity) {
        this.f8953a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f8953a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f8953a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f8953a.d();
    }

    public SparseIntArray[] e() {
        return this.f8953a.e();
    }

    public FrameMetricsAggregator(int i11) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f8953a = new a(i11);
        } else {
            this.f8953a = new b();
        }
    }
}
