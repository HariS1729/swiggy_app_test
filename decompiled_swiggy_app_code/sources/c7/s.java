package c7;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import bp0.k;
import coil.RealImageLoader;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import w6.b;
import w6.c;
import w6.d;

/* compiled from: SystemCallbacks.kt */
public final class s implements ComponentCallbacks2, c.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f12877f = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f12878a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<RealImageLoader> f12879b;

    /* renamed from: c  reason: collision with root package name */
    private final c f12880c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f12881d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f12882e;

    /* compiled from: SystemCallbacks.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public s(RealImageLoader realImageLoader, Context context, boolean z11) {
        c cVar;
        this.f12878a = context;
        this.f12879b = new WeakReference<>(realImageLoader);
        if (z11) {
            cVar = d.a(context, this, realImageLoader.i());
        } else {
            cVar = new b();
        }
        this.f12880c = cVar;
        this.f12881d = cVar.a();
        this.f12882e = new AtomicBoolean(false);
        context.registerComponentCallbacks(this);
    }

    public void a(boolean z11) {
        RealImageLoader realImageLoader = (RealImageLoader) b().get();
        k kVar = null;
        if (realImageLoader != null) {
            q i11 = realImageLoader.i();
            if (i11 != null && i11.getLevel() <= 4) {
                i11.a("NetworkObserver", 4, z11 ? "ONLINE" : "OFFLINE", (Throwable) null);
            }
            this.f12881d = z11;
            kVar = k.f22762a;
        }
        if (kVar == null) {
            d();
        }
    }

    public final WeakReference<RealImageLoader> b() {
        return this.f12879b;
    }

    public final boolean c() {
        return this.f12881d;
    }

    public final void d() {
        if (!this.f12882e.getAndSet(true)) {
            this.f12878a.unregisterComponentCallbacks(this);
            this.f12880c.shutdown();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (((RealImageLoader) this.f12879b.get()) == null) {
            d();
            k kVar = k.f22762a;
        }
    }

    public void onLowMemory() {
        onTrimMemory(80);
    }

    public void onTrimMemory(int i11) {
        RealImageLoader realImageLoader = (RealImageLoader) b().get();
        k kVar = null;
        if (realImageLoader != null) {
            q i12 = realImageLoader.i();
            if (i12 != null && i12.getLevel() <= 2) {
                i12.a("NetworkObserver", 2, p.s("trimMemory, level=", Integer.valueOf(i11)), (Throwable) null);
            }
            realImageLoader.m(i11);
            kVar = k.f22762a;
        }
        if (kVar == null) {
            d();
        }
    }
}
