package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.e;
import bp0.f;
import bp0.k;
import e0.c0;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: AndroidUiDispatcher.android.kt */
public final class AndroidUiDispatcher extends CoroutineDispatcher {

    /* renamed from: l  reason: collision with root package name */
    public static final b f7075l = new b((i) null);

    /* renamed from: m  reason: collision with root package name */
    public static final int f7076m = 8;
    /* access modifiers changed from: private */
    public static final f<CoroutineContext> n = b.b(AndroidUiDispatcher$Companion$Main$2.f7086a);
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final ThreadLocal<CoroutineContext> f7077o = new a();

    /* renamed from: b  reason: collision with root package name */
    private final Choreographer f7078b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Handler f7079c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Object f7080d;

    /* renamed from: e  reason: collision with root package name */
    private final kotlin.collections.c<Runnable> f7081e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public List<Choreographer.FrameCallback> f7082f;

    /* renamed from: g  reason: collision with root package name */
    private List<Choreographer.FrameCallback> f7083g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7084h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f7085i;
    private final c j;
    private final c0 k;

    /* compiled from: AndroidUiDispatcher.android.kt */
    public static final class a extends ThreadLocal<CoroutineContext> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public CoroutineContext initialValue() {
            Choreographer instance = Choreographer.getInstance();
            p.i(instance, "getInstance()");
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                Handler a11 = e.a(myLooper);
                p.i(a11, "createAsync(\n           …d\")\n                    )");
                AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(instance, a11, (i) null);
                return androidUiDispatcher.plus(androidUiDispatcher.c1());
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }

        public final CoroutineContext a() {
            if (w.b()) {
                return b();
            }
            CoroutineContext coroutineContext = (CoroutineContext) AndroidUiDispatcher.f7077o.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        public final CoroutineContext b() {
            return (CoroutineContext) AndroidUiDispatcher.n.getValue();
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    public static final class c implements Choreographer.FrameCallback, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AndroidUiDispatcher f7088a;

        c(AndroidUiDispatcher androidUiDispatcher) {
            this.f7088a = androidUiDispatcher;
        }

        public void doFrame(long j) {
            this.f7088a.f7079c.removeCallbacks(this);
            this.f7088a.l1();
            this.f7088a.h1(j);
        }

        public void run() {
            this.f7088a.l1();
            Object Q0 = this.f7088a.f7080d;
            AndroidUiDispatcher androidUiDispatcher = this.f7088a;
            synchronized (Q0) {
                if (androidUiDispatcher.f7082f.isEmpty()) {
                    androidUiDispatcher.Z0().removeFrameCallback(this);
                    androidUiDispatcher.f7085i = false;
                }
                k kVar = k.f22762a;
            }
        }
    }

    private AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.f7078b = choreographer;
        this.f7079c = handler;
        this.f7080d = new Object();
        this.f7081e = new kotlin.collections.c<>();
        this.f7082f = new ArrayList();
        this.f7083g = new ArrayList();
        this.j = new c(this);
        this.k = new AndroidUiFrameClock(choreographer);
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, i iVar) {
        this(choreographer, handler);
    }

    private final Runnable e1() {
        Runnable r11;
        synchronized (this.f7080d) {
            r11 = this.f7081e.r();
        }
        return r11;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r0 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r1 >= r0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        r2.get(r1).doFrame(r5);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r2.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h1(long r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f7080d
            monitor-enter(r0)
            boolean r1 = r4.f7085i     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            r1 = 0
            r4.f7085i = r1     // Catch:{ all -> 0x002b }
            java.util.List<android.view.Choreographer$FrameCallback> r2 = r4.f7082f     // Catch:{ all -> 0x002b }
            java.util.List<android.view.Choreographer$FrameCallback> r3 = r4.f7083g     // Catch:{ all -> 0x002b }
            r4.f7082f = r3     // Catch:{ all -> 0x002b }
            r4.f7083g = r2     // Catch:{ all -> 0x002b }
            monitor-exit(r0)
            int r0 = r2.size()
        L_0x0019:
            if (r1 >= r0) goto L_0x0027
            java.lang.Object r3 = r2.get(r1)
            android.view.Choreographer$FrameCallback r3 = (android.view.Choreographer.FrameCallback) r3
            r3.doFrame(r5)
            int r1 = r1 + 1
            goto L_0x0019
        L_0x0027:
            r2.clear()
            return
        L_0x002b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidUiDispatcher.h1(long):void");
    }

    /* access modifiers changed from: private */
    public final void l1() {
        boolean z11;
        do {
            Runnable e12 = e1();
            while (e12 != null) {
                e12.run();
                e12 = e1();
            }
            synchronized (this.f7080d) {
                z11 = false;
                if (this.f7081e.isEmpty()) {
                    this.f7084h = false;
                } else {
                    z11 = true;
                }
            }
        } while (z11);
    }

    public void D(CoroutineContext coroutineContext, Runnable runnable) {
        p.j(coroutineContext, LogCategory.CONTEXT);
        p.j(runnable, RenderingDetails.TYPE_BLOCK);
        synchronized (this.f7080d) {
            this.f7081e.h(runnable);
            if (!this.f7084h) {
                this.f7084h = true;
                this.f7079c.post(this.j);
                if (!this.f7085i) {
                    this.f7085i = true;
                    this.f7078b.postFrameCallback(this.j);
                }
            }
            k kVar = k.f22762a;
        }
    }

    public final Choreographer Z0() {
        return this.f7078b;
    }

    public final c0 c1() {
        return this.k;
    }

    public final void m1(Choreographer.FrameCallback frameCallback) {
        p.j(frameCallback, "callback");
        synchronized (this.f7080d) {
            this.f7082f.add(frameCallback);
            if (!this.f7085i) {
                this.f7085i = true;
                this.f7078b.postFrameCallback(this.j);
            }
            k kVar = k.f22762a;
        }
    }

    public final void n1(Choreographer.FrameCallback frameCallback) {
        p.j(frameCallback, "callback");
        synchronized (this.f7080d) {
            this.f7082f.remove(frameCallback);
        }
    }
}
