package x;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import bp0.k;
import e0.r0;
import f0.e;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import okhttp3.internal.http2.Http2Connection;
import x.g;

/* compiled from: LazyLayoutPrefetcher.android.kt */
public final class h implements r0, g.b, Runnable, Choreographer.FrameCallback {
    public static final a k = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static long f17636l;

    /* renamed from: a  reason: collision with root package name */
    private final g f17637a;

    /* renamed from: b  reason: collision with root package name */
    private final SubcomposeLayoutState f17638b;

    /* renamed from: c  reason: collision with root package name */
    private final LazyLayoutItemContentFactory f17639c;

    /* renamed from: d  reason: collision with root package name */
    private final View f17640d;

    /* renamed from: e  reason: collision with root package name */
    private final e<b> f17641e = new e<>(new b[16], 0);

    /* renamed from: f  reason: collision with root package name */
    private long f17642f;

    /* renamed from: g  reason: collision with root package name */
    private long f17643g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f17644h;

    /* renamed from: i  reason: collision with root package name */
    private final Choreographer f17645i = Choreographer.getInstance();
    private boolean j;

    /* compiled from: LazyLayoutPrefetcher.android.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final void b(View view) {
            if (h.f17636l == 0) {
                Display display = view.getDisplay();
                float f11 = 60.0f;
                if (!view.isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f11 = refreshRate;
                    }
                }
                h.f17636l = (long) (((float) Http2Connection.DEGRADED_PONG_TIMEOUT_NS) / f11);
            }
        }
    }

    /* compiled from: LazyLayoutPrefetcher.android.kt */
    private static final class b implements g.a {

        /* renamed from: a  reason: collision with root package name */
        private final int f17646a;

        /* renamed from: b  reason: collision with root package name */
        private final long f17647b;

        /* renamed from: c  reason: collision with root package name */
        private SubcomposeLayoutState.a f17648c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f17649d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f17650e;

        private b(int i11, long j) {
            this.f17646a = i11;
            this.f17647b = j;
        }

        public /* synthetic */ b(int i11, long j, i iVar) {
            this(i11, j);
        }

        public final boolean a() {
            return this.f17649d;
        }

        public final long b() {
            return this.f17647b;
        }

        public final int c() {
            return this.f17646a;
        }

        public void cancel() {
            if (!this.f17649d) {
                this.f17649d = true;
                SubcomposeLayoutState.a aVar = this.f17648c;
                if (aVar != null) {
                    aVar.dispose();
                }
                this.f17648c = null;
            }
        }

        public final boolean d() {
            return this.f17650e;
        }

        public final SubcomposeLayoutState.a e() {
            return this.f17648c;
        }

        public final void f(SubcomposeLayoutState.a aVar) {
            this.f17648c = aVar;
        }
    }

    public h(g gVar, SubcomposeLayoutState subcomposeLayoutState, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, View view) {
        p.j(gVar, "prefetchState");
        p.j(subcomposeLayoutState, "subcomposeLayoutState");
        p.j(lazyLayoutItemContentFactory, "itemContentFactory");
        p.j(view, "view");
        this.f17637a = gVar;
        this.f17638b = subcomposeLayoutState;
        this.f17639c = lazyLayoutItemContentFactory;
        this.f17640d = view;
        k.b(view);
    }

    private final long e(long j11, long j12) {
        if (j12 == 0) {
            return j11;
        }
        long j13 = (long) 4;
        return (j11 / j13) + ((j12 / j13) * ((long) 3));
    }

    private final boolean h(long j11, long j12, long j13) {
        return j11 > j12 || j11 + j13 < j12;
    }

    public g.a a(int i11, long j11) {
        b bVar = new b(i11, j11, (i) null);
        this.f17641e.b(bVar);
        if (!this.f17644h) {
            this.f17644h = true;
            this.f17640d.post(this);
        }
        return bVar;
    }

    public void b() {
        this.f17637a.c(this);
        this.j = true;
    }

    public void doFrame(long j11) {
        if (this.j) {
            this.f17640d.post(this);
        }
    }

    public void f() {
    }

    public void g() {
        this.j = false;
        this.f17637a.c((g.b) null);
        this.f17640d.removeCallbacks(this);
        this.f17645i.removeFrameCallback(this);
    }

    public void run() {
        if (this.f17641e.o() || !this.f17644h || !this.j || this.f17640d.getWindowVisibility() != 0) {
            this.f17644h = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.f17640d.getDrawingTime()) + f17636l;
        boolean z11 = false;
        while (this.f17641e.p() && !z11) {
            b bVar = (b) this.f17641e.l()[0];
            d invoke = this.f17639c.d().invoke();
            if (!bVar.a()) {
                int itemCount = invoke.getItemCount();
                int c11 = bVar.c();
                if (c11 >= 0 && c11 < itemCount) {
                    if (bVar.e() == null) {
                        Trace.beginSection("compose:lazylist:prefetch:compose");
                        try {
                            long nanoTime = System.nanoTime();
                            if (h(nanoTime, nanos, this.f17642f)) {
                                Object c12 = invoke.c(bVar.c());
                                bVar.f(this.f17638b.j(c12, this.f17639c.b(bVar.c(), c12)));
                                this.f17642f = e(System.nanoTime() - nanoTime, this.f17642f);
                            } else {
                                z11 = true;
                            }
                            k kVar = k.f22762a;
                        } finally {
                            Trace.endSection();
                        }
                    } else if (!bVar.d()) {
                        Trace.beginSection("compose:lazylist:prefetch:measure");
                        try {
                            long nanoTime2 = System.nanoTime();
                            if (h(nanoTime2, nanos, this.f17643g)) {
                                SubcomposeLayoutState.a e11 = bVar.e();
                                p.g(e11);
                                int a11 = e11.a();
                                for (int i11 = 0; i11 < a11; i11++) {
                                    e11.b(i11, bVar.b());
                                }
                                this.f17643g = e(System.nanoTime() - nanoTime2, this.f17643g);
                                this.f17641e.u(0);
                            } else {
                                k kVar2 = k.f22762a;
                                z11 = true;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            this.f17641e.u(0);
        }
        if (z11) {
            this.f17645i.postFrameCallback(this);
        } else {
            this.f17644h = false;
        }
    }
}
