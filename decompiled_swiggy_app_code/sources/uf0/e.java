package uf0;

import android.content.Context;
import bp0.h;
import in.juspay.hyper.constants.LogCategory;
import java.io.File;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.u;
import vf0.c;

/* compiled from: LottieHandler.kt */
public final class e extends tf0.a<c.C0248c, String> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19904b = new a((i) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f19905c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final jr.a f19906a;

    /* compiled from: LottieHandler.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public e(jr.a aVar) {
        p.j(aVar, "newrelicPerformanceUtils");
        this.f19906a = aVar;
    }

    /* access modifiers changed from: private */
    public static final void g(Throwable th2) {
        u.h("AssetPreCacheWorker", th2);
    }

    /* access modifiers changed from: protected */
    public boolean c(c cVar) {
        p.j(cVar, "asset");
        return cVar instanceof c.C0248c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void b(Context context, String str) {
        p.j(context, LogCategory.CONTEXT);
        p.j(str, "asset");
        i60.a aVar = i60.a.f60670a;
        File cacheDir = context.getCacheDir();
        p.i(cacheDir, "context.cacheDir");
        this.f19906a.a("metric_lottie_cache", x.j(h.a("lottie_url", str), h.a("lottie_cache_exist", Boolean.valueOf(aVar.a(cacheDir, "lottie_network_cache", str)))));
        try {
            r7.e.s(context, str).e(d.f29044a);
        } catch (Exception e11) {
            u.h("AssetPreCacheWorker", e11);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String d(c.C0248c cVar) {
        p.j(cVar, "asset");
        return cVar.a();
    }
}
