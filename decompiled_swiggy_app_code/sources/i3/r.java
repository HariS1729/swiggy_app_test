package i3;

import android.view.View;
import android.view.ViewParent;
import androidx.metrics.performance.R;
import bp0.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: PerformanceMetricsState.kt */
public final class r {

    /* renamed from: c  reason: collision with root package name */
    public static final a f15040c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private List<c> f15041a;

    /* renamed from: b  reason: collision with root package name */
    private List<c> f15042b;

    /* compiled from: PerformanceMetricsState.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final b a(View view) {
            p.j(view, "view");
            b b11 = b(view);
            if (b11.a() == null) {
                b11.b(new r((i) null));
            }
            return b11;
        }

        public final b b(View view) {
            p.j(view, "view");
            View c11 = c(view);
            int i11 = R.id.metricsStateHolder;
            Object tag = c11.getTag(i11);
            if (tag == null) {
                tag = new b();
                c11.setTag(i11, tag);
            }
            return (b) tag;
        }

        public final View c(View view) {
            p.j(view, "view");
            ViewParent viewParent = view.getParent();
            while (viewParent instanceof View) {
                view = (View) viewParent;
                viewParent = view.getParent();
            }
            return view;
        }
    }

    /* compiled from: PerformanceMetricsState.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private r f15043a;

        public final r a() {
            return this.f15043a;
        }

        public final void b(r rVar) {
            this.f15043a = rVar;
        }
    }

    /* compiled from: PerformanceMetricsState.kt */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private long f15044a;

        /* renamed from: b  reason: collision with root package name */
        private long f15045b;

        public final s a() {
            return null;
        }

        public final long b() {
            return this.f15044a;
        }

        public final long c() {
            return this.f15045b;
        }
    }

    private r() {
        this.f15041a = new ArrayList();
        this.f15042b = new ArrayList();
    }

    public /* synthetic */ r(i iVar) {
        this();
    }

    private final void a(long j, long j11, List<s> list, List<c> list2) {
        int size = list2.size() - 1;
        if (size >= 0) {
            while (true) {
                int i11 = size - 1;
                c cVar = list2.get(size);
                if (cVar.c() > 0 && cVar.c() < j) {
                    list2.remove(size);
                } else if (cVar.b() < j11) {
                    cVar.a();
                    if (!list.contains((Object) null)) {
                        cVar.a();
                        list.add((Object) null);
                    }
                }
                if (i11 >= 0) {
                    size = i11;
                } else {
                    return;
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f15042b) {
            this.f15042b.clear();
            k kVar = k.f22762a;
        }
    }

    public final List<s> c(long j, long j11) {
        ArrayList arrayList;
        synchronized (this.f15042b) {
            arrayList = new ArrayList(this.f15041a.size() + this.f15042b.size());
            a(j, j11, arrayList, this.f15041a);
            a(j, j11, arrayList, this.f15042b);
            k kVar = k.f22762a;
        }
        return arrayList;
    }
}
