package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import bp0.f;
import c7.g;
import c7.n;
import c7.q;
import c7.s;
import coil.decode.BitmapFactoryDecoder;
import coil.fetch.HttpUriFetcher;
import coil.intercept.EngineInterceptor;
import coil.memory.MemoryCache;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineStart;
import m6.c;
import okhttp3.Call;
import okhttp3.HttpUrl;
import r6.a;
import r6.b;
import r6.c;
import r6.d;
import r6.e;
import r6.i;
import r6.j;
import u6.d;
import u6.e;
import wp0.e2;
import wp0.g0;
import wp0.j0;
import wp0.k0;
import wp0.k1;
import wp0.n0;
import wp0.u0;
import x6.g;
import x6.h;
import x6.m;

/* compiled from: RealImageLoader.kt */
public final class RealImageLoader implements ImageLoader {

    /* renamed from: r  reason: collision with root package name */
    public static final a f13366r = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f13367a;

    /* renamed from: b  reason: collision with root package name */
    private final x6.a f13368b;

    /* renamed from: c  reason: collision with root package name */
    private final f<MemoryCache> f13369c;

    /* renamed from: d  reason: collision with root package name */
    private final f<p6.a> f13370d;

    /* renamed from: e  reason: collision with root package name */
    private final f<Call.Factory> f13371e;

    /* renamed from: f  reason: collision with root package name */
    private final c.d f13372f;

    /* renamed from: g  reason: collision with root package name */
    private final m6.b f13373g;

    /* renamed from: h  reason: collision with root package name */
    private final n f13374h;

    /* renamed from: i  reason: collision with root package name */
    private final q f13375i;
    private final j0 j = k0.a(e2.b((k1) null, 1, (Object) null).plus(u0.c().N0()).plus(new b(g0.f29464k0, this)));
    private final s k;

    /* renamed from: l  reason: collision with root package name */
    private final m f13376l;

    /* renamed from: m  reason: collision with root package name */
    private final f f13377m;
    private final f n;

    /* renamed from: o  reason: collision with root package name */
    private final m6.b f13378o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final List<s6.a> f13379p;
    private final AtomicBoolean q;

    /* compiled from: RealImageLoader.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class b extends fp0.a implements g0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RealImageLoader f13380a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(g0.a aVar, RealImageLoader realImageLoader) {
            super(aVar);
            this.f13380a = realImageLoader;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            q i11 = this.f13380a.i();
            if (i11 != null) {
                g.a(i11, "RealImageLoader", th2);
            }
        }
    }

    public RealImageLoader(Context context, x6.a aVar, f<? extends MemoryCache> fVar, f<? extends p6.a> fVar2, f<? extends Call.Factory> fVar3, c.d dVar, m6.b bVar, n nVar, q qVar) {
        this.f13367a = context;
        this.f13368b = aVar;
        this.f13369c = fVar;
        this.f13370d = fVar2;
        this.f13371e = fVar3;
        this.f13372f = dVar;
        this.f13373g = bVar;
        this.f13374h = nVar;
        this.f13375i = qVar;
        s sVar = new s(this, context, nVar.c());
        this.k = sVar;
        m mVar = new m(this, sVar, qVar);
        this.f13376l = mVar;
        this.f13377m = fVar;
        this.n = fVar2;
        this.f13378o = bVar.h().d(new u6.b(), HttpUrl.class).d(new u6.f(), String.class).d(new u6.a(), Uri.class).d(new e(), Uri.class).d(new d(), Integer.class).c(new t6.c(), Uri.class).c(new t6.a(nVar.a()), File.class).b(new HttpUriFetcher.b(fVar3, fVar2, nVar.d()), Uri.class).b(new i.a(), File.class).b(new a.C0180a(), Uri.class).b(new d.a(), Uri.class).b(new j.b(), Uri.class).b(new e.a(), Drawable.class).b(new b.a(), Bitmap.class).b(new c.a(), ByteBuffer.class).a(new BitmapFactoryDecoder.c(nVar.b())).e();
        this.f13379p = s.n0(getComponents().c(), new EngineInterceptor(this, mVar, qVar));
        this.q = new AtomicBoolean(false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: m6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: x6.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: coil.request.RequestDelegate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: coil.RealImageLoader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: m6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: x6.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: coil.request.RequestDelegate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: coil.RealImageLoader} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fa A[Catch:{ all -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010f A[Catch:{ all -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0111 A[Catch:{ all -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0120 A[Catch:{ all -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012a A[Catch:{ all -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012b A[Catch:{ all -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0137 A[Catch:{ all -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0138 A[Catch:{ all -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0154 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0186 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0191 A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x019c A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01c2 A[Catch:{ all -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01d3 A[SYNTHETIC, Splitter:B:97:0x01d3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(x6.g r21, int r22, fp0.c<? super x6.h> r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r23
            boolean r3 = r2 instanceof coil.RealImageLoader$executeMain$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            coil.RealImageLoader$executeMain$1 r3 = (coil.RealImageLoader$executeMain$1) r3
            int r4 = r3.f13398h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f13398h = r4
            goto L_0x001e
        L_0x0019:
            coil.RealImageLoader$executeMain$1 r3 = new coil.RealImageLoader$executeMain$1
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f13396f
            java.lang.Object r4 = kotlin.coroutines.intrinsics.b.d()
            int r5 = r3.f13398h
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0097
            if (r5 == r8) goto L_0x0078
            if (r5 == r7) goto L_0x0056
            if (r5 != r6) goto L_0x004e
            java.lang.Object r0 = r3.f13394d
            r4 = r0
            m6.c r4 = (m6.c) r4
            java.lang.Object r0 = r3.f13393c
            r5 = r0
            x6.g r5 = (x6.g) r5
            java.lang.Object r0 = r3.f13392b
            r6 = r0
            coil.request.RequestDelegate r6 = (coil.request.RequestDelegate) r6
            java.lang.Object r0 = r3.f13391a
            r3 = r0
            coil.RealImageLoader r3 = (coil.RealImageLoader) r3
            bp0.g.b(r2)     // Catch:{ all -> 0x004b }
            goto L_0x018b
        L_0x004b:
            r0 = move-exception
            goto L_0x01be
        L_0x004e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0056:
            java.lang.Object r0 = r3.f13395e
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            java.lang.Object r5 = r3.f13394d
            m6.c r5 = (m6.c) r5
            java.lang.Object r7 = r3.f13393c
            x6.g r7 = (x6.g) r7
            java.lang.Object r8 = r3.f13392b
            coil.request.RequestDelegate r8 = (coil.request.RequestDelegate) r8
            java.lang.Object r10 = r3.f13391a
            coil.RealImageLoader r10 = (coil.RealImageLoader) r10
            bp0.g.b(r2)     // Catch:{ all -> 0x0071 }
            r17 = r0
            goto L_0x015e
        L_0x0071:
            r0 = move-exception
            r4 = r5
            r5 = r7
            r6 = r8
            r3 = r10
            goto L_0x01be
        L_0x0078:
            java.lang.Object r0 = r3.f13394d
            r5 = r0
            m6.c r5 = (m6.c) r5
            java.lang.Object r0 = r3.f13393c
            r8 = r0
            x6.g r8 = (x6.g) r8
            java.lang.Object r0 = r3.f13392b
            r10 = r0
            coil.request.RequestDelegate r10 = (coil.request.RequestDelegate) r10
            java.lang.Object r0 = r3.f13391a
            r11 = r0
            coil.RealImageLoader r11 = (coil.RealImageLoader) r11
            bp0.g.b(r2)     // Catch:{ all -> 0x0090 }
            goto L_0x00ed
        L_0x0090:
            r0 = move-exception
            r4 = r5
            r5 = r8
            r6 = r10
        L_0x0094:
            r3 = r11
            goto L_0x01be
        L_0x0097:
            bp0.g.b(r2)
            x6.m r2 = r1.f13376l
            kotlin.coroutines.CoroutineContext r5 = r3.getContext()
            wp0.k1 r5 = wp0.n1.l(r5)
            coil.request.RequestDelegate r2 = r2.g(r0, r5)
            r2.a()
            x6.g$a r0 = x6.g.R(r0, r9, r8, r9)
            x6.a r5 = r20.c()
            x6.g$a r0 = r0.e(r5)
            x6.g r5 = r0.a()
            m6.c$d r0 = r20.h()
            m6.c r10 = r0.a(r5)
            java.lang.Object r0 = r5.m()     // Catch:{ all -> 0x01ba }
            x6.i r11 = x6.i.f17814a     // Catch:{ all -> 0x01ba }
            boolean r0 = kotlin.jvm.internal.p.e(r0, r11)     // Catch:{ all -> 0x01ba }
            if (r0 != 0) goto L_0x01b4
            r2.e()     // Catch:{ all -> 0x01ba }
            if (r22 != 0) goto L_0x00ef
            androidx.lifecycle.Lifecycle r0 = r5.z()     // Catch:{ all -> 0x01ba }
            r3.f13391a = r1     // Catch:{ all -> 0x01ba }
            r3.f13392b = r2     // Catch:{ all -> 0x01ba }
            r3.f13393c = r5     // Catch:{ all -> 0x01ba }
            r3.f13394d = r10     // Catch:{ all -> 0x01ba }
            r3.f13398h = r8     // Catch:{ all -> 0x01ba }
            java.lang.Object r0 = coil.util.Lifecycles.a(r0, r3)     // Catch:{ all -> 0x01ba }
            if (r0 != r4) goto L_0x00e9
            return r4
        L_0x00e9:
            r11 = r1
            r8 = r5
            r5 = r10
            r10 = r2
        L_0x00ed:
            r2 = r10
            goto L_0x00f2
        L_0x00ef:
            r11 = r1
            r8 = r5
            r5 = r10
        L_0x00f2:
            coil.memory.MemoryCache r0 = r11.d()     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x00fa
        L_0x00f8:
            r0 = r9
            goto L_0x010d
        L_0x00fa:
            coil.memory.MemoryCache$Key r10 = r8.G()     // Catch:{ all -> 0x01ae }
            if (r10 != 0) goto L_0x0102
            r0 = r9
            goto L_0x0106
        L_0x0102:
            coil.memory.MemoryCache$b r0 = r0.b(r10)     // Catch:{ all -> 0x01ae }
        L_0x0106:
            if (r0 != 0) goto L_0x0109
            goto L_0x00f8
        L_0x0109:
            android.graphics.Bitmap r0 = r0.a()     // Catch:{ all -> 0x01ae }
        L_0x010d:
            if (r0 != 0) goto L_0x0111
            r12 = r9
            goto L_0x011e
        L_0x0111:
            android.content.Context r10 = r8.l()     // Catch:{ all -> 0x01ae }
            android.content.res.Resources r10 = r10.getResources()     // Catch:{ all -> 0x01ae }
            android.graphics.drawable.BitmapDrawable r12 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x01ae }
            r12.<init>(r10, r0)     // Catch:{ all -> 0x01ae }
        L_0x011e:
            if (r12 != 0) goto L_0x0124
            android.graphics.drawable.Drawable r12 = r8.F()     // Catch:{ all -> 0x01ae }
        L_0x0124:
            z6.a r10 = r8.M()     // Catch:{ all -> 0x01ae }
            if (r10 != 0) goto L_0x012b
            goto L_0x012e
        L_0x012b:
            r10.f(r12)     // Catch:{ all -> 0x01ae }
        L_0x012e:
            r5.a(r8)     // Catch:{ all -> 0x01ae }
            x6.g$b r10 = r8.A()     // Catch:{ all -> 0x01ae }
            if (r10 != 0) goto L_0x0138
            goto L_0x013b
        L_0x0138:
            r10.a(r8)     // Catch:{ all -> 0x01ae }
        L_0x013b:
            r5.g(r8)     // Catch:{ all -> 0x01ae }
            y6.h r10 = r8.K()     // Catch:{ all -> 0x01ae }
            r3.f13391a = r11     // Catch:{ all -> 0x01ae }
            r3.f13392b = r2     // Catch:{ all -> 0x01ae }
            r3.f13393c = r8     // Catch:{ all -> 0x01ae }
            r3.f13394d = r5     // Catch:{ all -> 0x01ae }
            r3.f13395e = r0     // Catch:{ all -> 0x01ae }
            r3.f13398h = r7     // Catch:{ all -> 0x01ae }
            java.lang.Object r7 = r10.a(r3)     // Catch:{ all -> 0x01ae }
            if (r7 != r4) goto L_0x0155
            return r4
        L_0x0155:
            r17 = r0
            r10 = r11
            r19 = r8
            r8 = r2
            r2 = r7
            r7 = r19
        L_0x015e:
            r15 = r2
            y6.g r15 = (y6.g) r15     // Catch:{ all -> 0x0071 }
            r5.f(r7, r15)     // Catch:{ all -> 0x0071 }
            kotlinx.coroutines.CoroutineDispatcher r0 = r7.y()     // Catch:{ all -> 0x0071 }
            coil.RealImageLoader$executeMain$result$1 r2 = new coil.RealImageLoader$executeMain$result$1     // Catch:{ all -> 0x0071 }
            r18 = 0
            r12 = r2
            r13 = r7
            r14 = r10
            r16 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0071 }
            r3.f13391a = r10     // Catch:{ all -> 0x0071 }
            r3.f13392b = r8     // Catch:{ all -> 0x0071 }
            r3.f13393c = r7     // Catch:{ all -> 0x0071 }
            r3.f13394d = r5     // Catch:{ all -> 0x0071 }
            r3.f13395e = r9     // Catch:{ all -> 0x0071 }
            r3.f13398h = r6     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = wp0.h.g(r0, r2, r3)     // Catch:{ all -> 0x0071 }
            if (r2 != r4) goto L_0x0187
            return r4
        L_0x0187:
            r4 = r5
            r5 = r7
            r6 = r8
            r3 = r10
        L_0x018b:
            x6.h r2 = (x6.h) r2     // Catch:{ all -> 0x004b }
            boolean r0 = r2 instanceof x6.n     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x019c
            r0 = r2
            x6.n r0 = (x6.n) r0     // Catch:{ all -> 0x004b }
            z6.a r7 = r5.M()     // Catch:{ all -> 0x004b }
            r3.l(r0, r7, r4)     // Catch:{ all -> 0x004b }
            goto L_0x01aa
        L_0x019c:
            boolean r0 = r2 instanceof x6.d     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x01aa
            r0 = r2
            x6.d r0 = (x6.d) r0     // Catch:{ all -> 0x004b }
            z6.a r7 = r5.M()     // Catch:{ all -> 0x004b }
            r3.k(r0, r7, r4)     // Catch:{ all -> 0x004b }
        L_0x01aa:
            r6.c()
            return r2
        L_0x01ae:
            r0 = move-exception
            r6 = r2
            r4 = r5
            r5 = r8
            goto L_0x0094
        L_0x01b4:
            coil.request.NullRequestDataException r0 = new coil.request.NullRequestDataException     // Catch:{ all -> 0x01ba }
            r0.<init>()     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x01ba:
            r0 = move-exception
            r3 = r1
            r6 = r2
            r4 = r10
        L_0x01be:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x01d7 }
            if (r2 != 0) goto L_0x01d3
            x6.m r2 = r3.f13376l     // Catch:{ all -> 0x01d7 }
            x6.d r0 = r2.b(r5, r0)     // Catch:{ all -> 0x01d7 }
            z6.a r2 = r5.M()     // Catch:{ all -> 0x01d7 }
            r3.k(r0, r2, r4)     // Catch:{ all -> 0x01d7 }
            r6.c()
            return r0
        L_0x01d3:
            r3.j(r5, r4)     // Catch:{ all -> 0x01d7 }
            throw r0     // Catch:{ all -> 0x01d7 }
        L_0x01d7:
            r0 = move-exception
            r6.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.RealImageLoader.g(x6.g, int, fp0.c):java.lang.Object");
    }

    private final void j(x6.g gVar, m6.c cVar) {
        q qVar = this.f13375i;
        if (qVar != null && qVar.getLevel() <= 4) {
            qVar.a("RealImageLoader", 4, p.s("🏗  Cancelled - ", gVar.m()), (Throwable) null);
        }
        cVar.d(gVar);
        g.b A = gVar.A();
        if (A != null) {
            A.d(gVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
        if (r8 == null) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void k(x6.d r7, z6.a r8, m6.c r9) {
        /*
            r6 = this;
            x6.g r0 = r7.b()
            c7.q r1 = r6.f13375i
            if (r1 != 0) goto L_0x0009
            goto L_0x0037
        L_0x0009:
            r2 = 4
            int r3 = r1.getLevel()
            if (r3 > r2) goto L_0x0037
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "🚨 Failed - "
            r3.append(r4)
            java.lang.Object r4 = r0.m()
            r3.append(r4)
            java.lang.String r4 = " - "
            r3.append(r4)
            java.lang.Throwable r4 = r7.c()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r1.a(r5, r2, r3, r4)
        L_0x0037:
            boolean r1 = r8 instanceof b7.d
            if (r1 != 0) goto L_0x003e
            if (r8 != 0) goto L_0x0051
            goto L_0x006a
        L_0x003e:
            x6.g r1 = r7.b()
            b7.c$a r1 = r1.P()
            r2 = r8
            b7.d r2 = (b7.d) r2
            b7.c r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof b7.b
            if (r2 == 0) goto L_0x0059
        L_0x0051:
            android.graphics.drawable.Drawable r1 = r7.a()
            r8.g(r1)
            goto L_0x006a
        L_0x0059:
            x6.g r8 = r7.b()
            r9.h(r8, r1)
            r1.a()
            x6.g r8 = r7.b()
            r9.j(r8, r1)
        L_0x006a:
            r9.c(r0, r7)
            x6.g$b r8 = r0.A()
            if (r8 != 0) goto L_0x0074
            goto L_0x0077
        L_0x0074:
            r8.c(r0, r7)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.RealImageLoader.k(x6.d, z6.a, m6.c):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
        if (r8 == null) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void l(x6.n r7, z6.a r8, m6.c r9) {
        /*
            r6 = this;
            x6.g r0 = r7.b()
            coil.decode.DataSource r1 = r7.c()
            c7.q r2 = r6.f13375i
            if (r2 != 0) goto L_0x000d
            goto L_0x0042
        L_0x000d:
            r3 = 4
            int r4 = r2.getLevel()
            if (r4 > r3) goto L_0x0042
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = c7.i.f(r1)
            r4.append(r5)
            java.lang.String r5 = " Successful ("
            r4.append(r5)
            java.lang.String r1 = r1.name()
            r4.append(r1)
            java.lang.String r1 = ") - "
            r4.append(r1)
            java.lang.Object r1 = r0.m()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r2.a(r5, r3, r1, r4)
        L_0x0042:
            boolean r1 = r8 instanceof b7.d
            if (r1 != 0) goto L_0x0049
            if (r8 != 0) goto L_0x005c
            goto L_0x0075
        L_0x0049:
            x6.g r1 = r7.b()
            b7.c$a r1 = r1.P()
            r2 = r8
            b7.d r2 = (b7.d) r2
            b7.c r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof b7.b
            if (r2 == 0) goto L_0x0064
        L_0x005c:
            android.graphics.drawable.Drawable r1 = r7.a()
            r8.e(r1)
            goto L_0x0075
        L_0x0064:
            x6.g r8 = r7.b()
            r9.h(r8, r1)
            r1.a()
            x6.g r8 = r7.b()
            r9.j(r8, r1)
        L_0x0075:
            r9.b(r0, r7)
            x6.g$b r8 = r0.A()
            if (r8 != 0) goto L_0x007f
            goto L_0x0082
        L_0x007f:
            r8.b(r0, r7)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.RealImageLoader.l(x6.n, z6.a, m6.c):void");
    }

    public x6.c a(x6.g gVar) {
        n0 b11 = j.b(this.j, (CoroutineContext) null, (CoroutineStart) null, new RealImageLoader$enqueue$job$1(this, gVar, (fp0.c<? super RealImageLoader$enqueue$job$1>) null), 3, (Object) null);
        if (gVar.M() instanceof z6.b) {
            return c7.i.l(((z6.b) gVar.M()).c()).b(b11);
        }
        return new x6.j(b11);
    }

    public Object b(x6.g gVar, fp0.c<? super h> cVar) {
        return k0.e(new RealImageLoader$execute$2(gVar, this, (fp0.c<? super RealImageLoader$execute$2>) null), cVar);
    }

    public x6.a c() {
        return this.f13368b;
    }

    public MemoryCache d() {
        return (MemoryCache) this.f13377m.getValue();
    }

    public m6.b getComponents() {
        return this.f13378o;
    }

    public final c.d h() {
        return this.f13372f;
    }

    public final q i() {
        return this.f13375i;
    }

    public final void m(int i11) {
        MemoryCache value;
        f<MemoryCache> fVar = this.f13369c;
        if (fVar != null && (value = fVar.getValue()) != null) {
            value.a(i11);
        }
    }
}
