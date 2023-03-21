package x6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import b7.a;
import b7.c;
import c7.d;
import coil.memory.MemoryCache;
import coil.request.CachePolicy;
import coil.size.Precision;
import coil.size.Scale;
import coil.size.ViewSizeResolver;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import o6.e;
import okhttp3.Headers;
import r6.h;
import x6.l;
import y6.h;
import y6.j;

/* compiled from: ImageRequest.kt */
public final class g {
    private final Lifecycle A;
    private final h B;
    private final Scale C;
    private final l D;
    private final MemoryCache.Key E;
    /* access modifiers changed from: private */
    public final Integer F;
    /* access modifiers changed from: private */
    public final Drawable G;
    /* access modifiers changed from: private */
    public final Integer H;
    /* access modifiers changed from: private */
    public final Drawable I;
    /* access modifiers changed from: private */
    public final Integer J;
    /* access modifiers changed from: private */
    public final Drawable K;
    private final b L;
    private final a M;

    /* renamed from: a  reason: collision with root package name */
    private final Context f17774a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f17775b;

    /* renamed from: c  reason: collision with root package name */
    private final z6.a f17776c;

    /* renamed from: d  reason: collision with root package name */
    private final b f17777d;

    /* renamed from: e  reason: collision with root package name */
    private final MemoryCache.Key f17778e;

    /* renamed from: f  reason: collision with root package name */
    private final String f17779f;

    /* renamed from: g  reason: collision with root package name */
    private final Bitmap.Config f17780g;

    /* renamed from: h  reason: collision with root package name */
    private final ColorSpace f17781h;

    /* renamed from: i  reason: collision with root package name */
    private final Precision f17782i;
    private final Pair<h.a<?>, Class<?>> j;
    private final e.a k;

    /* renamed from: l  reason: collision with root package name */
    private final List<a7.a> f17783l;

    /* renamed from: m  reason: collision with root package name */
    private final c.a f17784m;
    private final Headers n;

    /* renamed from: o  reason: collision with root package name */
    private final o f17785o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f17786p;
    private final boolean q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f17787r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f17788s;
    private final CachePolicy t;

    /* renamed from: u  reason: collision with root package name */
    private final CachePolicy f17789u;
    private final CachePolicy v;

    /* renamed from: w  reason: collision with root package name */
    private final CoroutineDispatcher f17790w;

    /* renamed from: x  reason: collision with root package name */
    private final CoroutineDispatcher f17791x;

    /* renamed from: y  reason: collision with root package name */
    private final CoroutineDispatcher f17792y;

    /* renamed from: z  reason: collision with root package name */
    private final CoroutineDispatcher f17793z;

    /* compiled from: ImageRequest.kt */
    public interface b {
        void a(g gVar);

        void b(g gVar, n nVar);

        void c(g gVar, d dVar);

        void d(g gVar);
    }

    private g(Context context, Object obj, z6.a aVar, b bVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair<? extends h.a<?>, ? extends Class<?>> pair, e.a aVar2, List<? extends a7.a> list, c.a aVar3, Headers headers, o oVar, boolean z11, boolean z12, boolean z13, boolean z14, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, y6.h hVar, Scale scale, l lVar, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, b bVar2, a aVar4) {
        this.f17774a = context;
        this.f17775b = obj;
        this.f17776c = aVar;
        this.f17777d = bVar;
        this.f17778e = key;
        this.f17779f = str;
        this.f17780g = config;
        this.f17781h = colorSpace;
        this.f17782i = precision;
        this.j = pair;
        this.k = aVar2;
        this.f17783l = list;
        this.f17784m = aVar3;
        this.n = headers;
        this.f17785o = oVar;
        this.f17786p = z11;
        this.q = z12;
        this.f17787r = z13;
        this.f17788s = z14;
        this.t = cachePolicy;
        this.f17789u = cachePolicy2;
        this.v = cachePolicy3;
        this.f17790w = coroutineDispatcher;
        this.f17791x = coroutineDispatcher2;
        this.f17792y = coroutineDispatcher3;
        this.f17793z = coroutineDispatcher4;
        this.A = lifecycle;
        this.B = hVar;
        this.C = scale;
        this.D = lVar;
        this.E = key2;
        this.F = num;
        this.G = drawable;
        this.H = num2;
        this.I = drawable2;
        this.J = num3;
        this.K = drawable3;
        this.L = bVar2;
        this.M = aVar4;
    }

    public /* synthetic */ g(Context context, Object obj, z6.a aVar, b bVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair pair, e.a aVar2, List list, c.a aVar3, Headers headers, o oVar, boolean z11, boolean z12, boolean z13, boolean z14, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, y6.h hVar, Scale scale, l lVar, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, b bVar2, a aVar4, i iVar) {
        this(context, obj, aVar, bVar, key, str, config, colorSpace, precision, pair, aVar2, list, aVar3, headers, oVar, z11, z12, z13, z14, cachePolicy, cachePolicy2, cachePolicy3, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, lifecycle, hVar, scale, lVar, key2, num, drawable, num2, drawable2, num3, drawable3, bVar2, aVar4);
    }

    public static /* synthetic */ a R(g gVar, Context context, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            context = gVar.f17774a;
        }
        return gVar.Q(context);
    }

    public final b A() {
        return this.f17777d;
    }

    public final MemoryCache.Key B() {
        return this.f17778e;
    }

    public final CachePolicy C() {
        return this.t;
    }

    public final CachePolicy D() {
        return this.v;
    }

    public final l E() {
        return this.D;
    }

    public final Drawable F() {
        return c7.h.c(this, this.G, this.F, this.M.l());
    }

    public final MemoryCache.Key G() {
        return this.E;
    }

    public final Precision H() {
        return this.f17782i;
    }

    public final boolean I() {
        return this.f17788s;
    }

    public final Scale J() {
        return this.C;
    }

    public final y6.h K() {
        return this.B;
    }

    public final o L() {
        return this.f17785o;
    }

    public final z6.a M() {
        return this.f17776c;
    }

    public final CoroutineDispatcher N() {
        return this.f17793z;
    }

    public final List<a7.a> O() {
        return this.f17783l;
    }

    public final c.a P() {
        return this.f17784m;
    }

    public final a Q(Context context) {
        return new a(this, context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (!p.e(this.f17774a, gVar.f17774a) || !p.e(this.f17775b, gVar.f17775b) || !p.e(this.f17776c, gVar.f17776c) || !p.e(this.f17777d, gVar.f17777d) || !p.e(this.f17778e, gVar.f17778e) || !p.e(this.f17779f, gVar.f17779f) || this.f17780g != gVar.f17780g || ((Build.VERSION.SDK_INT >= 26 && !p.e(this.f17781h, gVar.f17781h)) || this.f17782i != gVar.f17782i || !p.e(this.j, gVar.j) || !p.e(this.k, gVar.k) || !p.e(this.f17783l, gVar.f17783l) || !p.e(this.f17784m, gVar.f17784m) || !p.e(this.n, gVar.n) || !p.e(this.f17785o, gVar.f17785o) || this.f17786p != gVar.f17786p || this.q != gVar.q || this.f17787r != gVar.f17787r || this.f17788s != gVar.f17788s || this.t != gVar.t || this.f17789u != gVar.f17789u || this.v != gVar.v || !p.e(this.f17790w, gVar.f17790w) || !p.e(this.f17791x, gVar.f17791x) || !p.e(this.f17792y, gVar.f17792y) || !p.e(this.f17793z, gVar.f17793z) || !p.e(this.E, gVar.E) || !p.e(this.F, gVar.F) || !p.e(this.G, gVar.G) || !p.e(this.H, gVar.H) || !p.e(this.I, gVar.I) || !p.e(this.J, gVar.J) || !p.e(this.K, gVar.K) || !p.e(this.A, gVar.A) || !p.e(this.B, gVar.B) || this.C != gVar.C || !p.e(this.D, gVar.D) || !p.e(this.L, gVar.L) || !p.e(this.M, gVar.M))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean g() {
        return this.f17786p;
    }

    public final boolean h() {
        return this.q;
    }

    public int hashCode() {
        int hashCode = ((this.f17774a.hashCode() * 31) + this.f17775b.hashCode()) * 31;
        z6.a aVar = this.f17776c;
        int i11 = 0;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f17777d;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        MemoryCache.Key key = this.f17778e;
        int hashCode4 = (hashCode3 + (key == null ? 0 : key.hashCode())) * 31;
        String str = this.f17779f;
        int hashCode5 = (((hashCode4 + (str == null ? 0 : str.hashCode())) * 31) + this.f17780g.hashCode()) * 31;
        ColorSpace colorSpace = this.f17781h;
        int hashCode6 = (((hashCode5 + (colorSpace == null ? 0 : colorSpace.hashCode())) * 31) + this.f17782i.hashCode()) * 31;
        Pair<h.a<?>, Class<?>> pair = this.j;
        int hashCode7 = (hashCode6 + (pair == null ? 0 : pair.hashCode())) * 31;
        e.a aVar2 = this.k;
        int hashCode8 = (((((((((((((((((((((((((((((((((((((((hashCode7 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31) + this.f17783l.hashCode()) * 31) + this.f17784m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.f17785o.hashCode()) * 31) + a0.h.a(this.f17786p)) * 31) + a0.h.a(this.q)) * 31) + a0.h.a(this.f17787r)) * 31) + a0.h.a(this.f17788s)) * 31) + this.t.hashCode()) * 31) + this.f17789u.hashCode()) * 31) + this.v.hashCode()) * 31) + this.f17790w.hashCode()) * 31) + this.f17791x.hashCode()) * 31) + this.f17792y.hashCode()) * 31) + this.f17793z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31;
        MemoryCache.Key key2 = this.E;
        int hashCode9 = (hashCode8 + (key2 == null ? 0 : key2.hashCode())) * 31;
        Integer num = this.F;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Drawable drawable = this.G;
        int hashCode11 = (hashCode10 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num2 = this.H;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Drawable drawable2 = this.I;
        int hashCode13 = (hashCode12 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Integer num3 = this.J;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Drawable drawable3 = this.K;
        if (drawable3 != null) {
            i11 = drawable3.hashCode();
        }
        return ((((hashCode14 + i11) * 31) + this.L.hashCode()) * 31) + this.M.hashCode();
    }

    public final boolean i() {
        return this.f17787r;
    }

    public final Bitmap.Config j() {
        return this.f17780g;
    }

    public final ColorSpace k() {
        return this.f17781h;
    }

    public final Context l() {
        return this.f17774a;
    }

    public final Object m() {
        return this.f17775b;
    }

    public final CoroutineDispatcher n() {
        return this.f17792y;
    }

    public final e.a o() {
        return this.k;
    }

    public final a p() {
        return this.M;
    }

    public final b q() {
        return this.L;
    }

    public final String r() {
        return this.f17779f;
    }

    public final CachePolicy s() {
        return this.f17789u;
    }

    public final Drawable t() {
        return c7.h.c(this, this.I, this.H, this.M.f());
    }

    public final Drawable u() {
        return c7.h.c(this, this.K, this.J, this.M.g());
    }

    public final CoroutineDispatcher v() {
        return this.f17791x;
    }

    public final Pair<h.a<?>, Class<?>> w() {
        return this.j;
    }

    public final Headers x() {
        return this.n;
    }

    public final CoroutineDispatcher y() {
        return this.f17790w;
    }

    public final Lifecycle z() {
        return this.A;
    }

    /* compiled from: ImageRequest.kt */
    public static final class a {
        private CoroutineDispatcher A;
        private l.a B;
        private MemoryCache.Key C;
        private Integer D;
        private Drawable E;
        private Integer F;
        private Drawable G;
        private Integer H;
        private Drawable I;
        private Lifecycle J;
        private y6.h K;
        private Scale L;
        private Lifecycle M;
        private y6.h N;
        private Scale O;

        /* renamed from: a  reason: collision with root package name */
        private final Context f17794a;

        /* renamed from: b  reason: collision with root package name */
        private a f17795b;

        /* renamed from: c  reason: collision with root package name */
        private Object f17796c;

        /* renamed from: d  reason: collision with root package name */
        private z6.a f17797d;

        /* renamed from: e  reason: collision with root package name */
        private b f17798e;

        /* renamed from: f  reason: collision with root package name */
        private MemoryCache.Key f17799f;

        /* renamed from: g  reason: collision with root package name */
        private String f17800g;

        /* renamed from: h  reason: collision with root package name */
        private Bitmap.Config f17801h;

        /* renamed from: i  reason: collision with root package name */
        private ColorSpace f17802i;
        private Precision j;
        private Pair<? extends h.a<?>, ? extends Class<?>> k;

        /* renamed from: l  reason: collision with root package name */
        private e.a f17803l;

        /* renamed from: m  reason: collision with root package name */
        private List<? extends a7.a> f17804m;
        private c.a n;

        /* renamed from: o  reason: collision with root package name */
        private Headers.Builder f17805o;

        /* renamed from: p  reason: collision with root package name */
        private Map<Class<?>, Object> f17806p;
        private boolean q;

        /* renamed from: r  reason: collision with root package name */
        private Boolean f17807r;

        /* renamed from: s  reason: collision with root package name */
        private Boolean f17808s;
        private boolean t;

        /* renamed from: u  reason: collision with root package name */
        private CachePolicy f17809u;
        private CachePolicy v;

        /* renamed from: w  reason: collision with root package name */
        private CachePolicy f17810w;

        /* renamed from: x  reason: collision with root package name */
        private CoroutineDispatcher f17811x;

        /* renamed from: y  reason: collision with root package name */
        private CoroutineDispatcher f17812y;

        /* renamed from: z  reason: collision with root package name */
        private CoroutineDispatcher f17813z;

        public a(Context context) {
            this.f17794a = context;
            this.f17795b = c7.h.b();
            this.f17796c = null;
            this.f17797d = null;
            this.f17798e = null;
            this.f17799f = null;
            this.f17800g = null;
            this.f17801h = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f17802i = null;
            }
            this.j = null;
            this.k = null;
            this.f17803l = null;
            this.f17804m = k.j();
            this.n = null;
            this.f17805o = null;
            this.f17806p = null;
            this.q = true;
            this.f17807r = null;
            this.f17808s = null;
            this.t = true;
            this.f17809u = null;
            this.v = null;
            this.f17810w = null;
            this.f17811x = null;
            this.f17812y = null;
            this.f17813z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.I = null;
            this.J = null;
            this.K = null;
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
        }

        private final void j() {
            this.O = null;
        }

        private final void k() {
            this.M = null;
            this.N = null;
            this.O = null;
        }

        private final Lifecycle l() {
            z6.a aVar = this.f17797d;
            Lifecycle c11 = d.c(aVar instanceof z6.b ? ((z6.b) aVar).c().getContext() : this.f17794a);
            return c11 == null ? f.f17772b : c11;
        }

        private final Scale m() {
            y6.h hVar = this.K;
            View view = null;
            ViewSizeResolver viewSizeResolver = hVar instanceof ViewSizeResolver ? (ViewSizeResolver) hVar : null;
            View c11 = viewSizeResolver == null ? null : viewSizeResolver.c();
            if (c11 == null) {
                z6.a aVar = this.f17797d;
                z6.b bVar = aVar instanceof z6.b ? (z6.b) aVar : null;
                if (bVar != null) {
                    view = bVar.c();
                }
            } else {
                view = c11;
            }
            if (view instanceof ImageView) {
                return c7.i.n((ImageView) view);
            }
            return Scale.FIT;
        }

        private final y6.h n() {
            z6.a aVar = this.f17797d;
            if (!(aVar instanceof z6.b)) {
                return new y6.d(this.f17794a);
            }
            View c11 = ((z6.b) aVar).c();
            if (c11 instanceof ImageView) {
                ImageView.ScaleType scaleType = ((ImageView) c11).getScaleType();
                if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                    return y6.i.a(y6.g.f18031d);
                }
            }
            return j.b(c11, false, 2, (Object) null);
        }

        public final g a() {
            Context context = this.f17794a;
            Object obj = this.f17796c;
            if (obj == null) {
                obj = i.f17814a;
            }
            Object obj2 = obj;
            z6.a aVar = this.f17797d;
            b bVar = this.f17798e;
            MemoryCache.Key key = this.f17799f;
            String str = this.f17800g;
            Bitmap.Config config = this.f17801h;
            if (config == null) {
                config = this.f17795b.c();
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.f17802i;
            Precision precision = this.j;
            if (precision == null) {
                precision = this.f17795b.m();
            }
            Precision precision2 = precision;
            Pair<? extends h.a<?>, ? extends Class<?>> pair = this.k;
            e.a aVar2 = this.f17803l;
            List<? extends a7.a> list = this.f17804m;
            c.a aVar3 = this.n;
            if (aVar3 == null) {
                aVar3 = this.f17795b.o();
            }
            c.a aVar4 = aVar3;
            Headers.Builder builder = this.f17805o;
            Headers v11 = c7.i.v(builder == null ? null : builder.build());
            Map<Class<?>, Object> map = this.f17806p;
            o x11 = c7.i.x(map == null ? null : o.f17844b.a(map));
            boolean z11 = this.q;
            Boolean bool = this.f17807r;
            boolean a11 = bool == null ? this.f17795b.a() : bool.booleanValue();
            Boolean bool2 = this.f17808s;
            boolean b11 = bool2 == null ? this.f17795b.b() : bool2.booleanValue();
            boolean z12 = this.t;
            CachePolicy cachePolicy = this.f17809u;
            if (cachePolicy == null) {
                cachePolicy = this.f17795b.j();
            }
            CachePolicy cachePolicy2 = cachePolicy;
            CachePolicy cachePolicy3 = this.v;
            if (cachePolicy3 == null) {
                cachePolicy3 = this.f17795b.e();
            }
            CachePolicy cachePolicy4 = cachePolicy3;
            CachePolicy cachePolicy5 = this.f17810w;
            if (cachePolicy5 == null) {
                cachePolicy5 = this.f17795b.k();
            }
            CachePolicy cachePolicy6 = cachePolicy5;
            CoroutineDispatcher coroutineDispatcher = this.f17811x;
            if (coroutineDispatcher == null) {
                coroutineDispatcher = this.f17795b.i();
            }
            CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
            CoroutineDispatcher coroutineDispatcher3 = this.f17812y;
            if (coroutineDispatcher3 == null) {
                coroutineDispatcher3 = this.f17795b.h();
            }
            CoroutineDispatcher coroutineDispatcher4 = coroutineDispatcher3;
            CoroutineDispatcher coroutineDispatcher5 = this.f17813z;
            if (coroutineDispatcher5 == null) {
                coroutineDispatcher5 = this.f17795b.d();
            }
            CoroutineDispatcher coroutineDispatcher6 = coroutineDispatcher5;
            CoroutineDispatcher coroutineDispatcher7 = this.A;
            if (coroutineDispatcher7 == null) {
                coroutineDispatcher7 = this.f17795b.n();
            }
            CoroutineDispatcher coroutineDispatcher8 = coroutineDispatcher7;
            Lifecycle lifecycle = this.J;
            if (lifecycle == null && (lifecycle = this.M) == null) {
                lifecycle = l();
            }
            Lifecycle lifecycle2 = lifecycle;
            y6.h hVar = this.K;
            if (hVar == null && (hVar = this.N) == null) {
                hVar = n();
            }
            y6.h hVar2 = hVar;
            Scale scale = this.L;
            if (scale == null && (scale = this.O) == null) {
                scale = m();
            }
            Scale scale2 = scale;
            l.a aVar5 = this.B;
            l w11 = c7.i.w(aVar5 == null ? null : aVar5.a());
            MemoryCache.Key key2 = this.C;
            Integer num = this.D;
            Drawable drawable = this.E;
            Integer num2 = this.F;
            Drawable drawable2 = this.G;
            Integer num3 = this.H;
            Drawable drawable3 = this.I;
            b bVar2 = r43;
            boolean z13 = z11;
            c.a aVar6 = aVar4;
            List<? extends a7.a> list2 = list;
            e.a aVar7 = aVar2;
            Pair<? extends h.a<?>, ? extends Class<?>> pair2 = pair;
            Precision precision3 = precision2;
            ColorSpace colorSpace2 = colorSpace;
            Bitmap.Config config3 = config2;
            String str2 = str;
            MemoryCache.Key key3 = key;
            b bVar3 = bVar;
            z6.a aVar8 = aVar;
            Object obj3 = obj2;
            b bVar4 = new b(this.J, this.K, this.L, this.f17811x, this.f17812y, this.f17813z, this.A, this.n, this.j, this.f17801h, this.f17807r, this.f17808s, this.f17809u, this.v, this.f17810w);
            return new g(context, obj3, aVar8, bVar3, key3, str2, config3, colorSpace2, precision3, pair2, aVar7, list2, aVar6, v11, x11, z13, a11, b11, z12, cachePolicy2, cachePolicy4, cachePolicy6, coroutineDispatcher2, coroutineDispatcher4, coroutineDispatcher6, coroutineDispatcher8, lifecycle2, hVar2, scale2, w11, key2, num, drawable, num2, drawable2, num3, drawable3, bVar2, this.f17795b, (i) null);
        }

        public final a b(int i11) {
            c.a aVar;
            if (i11 > 0) {
                aVar = new a.C0102a(i11, false, 2, (i) null);
            } else {
                aVar = c.a.f12592b;
            }
            r(aVar);
            return this;
        }

        public final a c(boolean z11) {
            return b(z11 ? 100 : 0);
        }

        public final a d(Object obj) {
            this.f17796c = obj;
            return this;
        }

        public final a e(a aVar) {
            this.f17795b = aVar;
            j();
            return this;
        }

        public final a f(int i11) {
            this.F = Integer.valueOf(i11);
            this.G = null;
            return this;
        }

        public final a g(CachePolicy cachePolicy) {
            this.f17809u = cachePolicy;
            return this;
        }

        public final a h(int i11) {
            this.D = Integer.valueOf(i11);
            this.E = null;
            return this;
        }

        public final a i(Precision precision) {
            this.j = precision;
            return this;
        }

        public final a o(Scale scale) {
            this.L = scale;
            return this;
        }

        public final a p(y6.h hVar) {
            this.K = hVar;
            k();
            return this;
        }

        public final a q(z6.a aVar) {
            this.f17797d = aVar;
            k();
            return this;
        }

        public final a r(c.a aVar) {
            this.n = aVar;
            return this;
        }

        public a(g gVar, Context context) {
            this.f17794a = context;
            this.f17795b = gVar.p();
            this.f17796c = gVar.m();
            this.f17797d = gVar.M();
            this.f17798e = gVar.A();
            this.f17799f = gVar.B();
            this.f17800g = gVar.r();
            this.f17801h = gVar.q().c();
            if (Build.VERSION.SDK_INT >= 26) {
                this.f17802i = gVar.k();
            }
            this.j = gVar.q().k();
            this.k = gVar.w();
            this.f17803l = gVar.o();
            this.f17804m = gVar.O();
            this.n = gVar.q().o();
            this.f17805o = gVar.x().newBuilder();
            this.f17806p = x.t(gVar.L().a());
            this.q = gVar.g();
            this.f17807r = gVar.q().a();
            this.f17808s = gVar.q().b();
            this.t = gVar.I();
            this.f17809u = gVar.q().i();
            this.v = gVar.q().e();
            this.f17810w = gVar.q().j();
            this.f17811x = gVar.q().g();
            this.f17812y = gVar.q().f();
            this.f17813z = gVar.q().d();
            this.A = gVar.q().n();
            this.B = gVar.E().f();
            this.C = gVar.G();
            this.D = gVar.F;
            this.E = gVar.G;
            this.F = gVar.H;
            this.G = gVar.I;
            this.H = gVar.J;
            this.I = gVar.K;
            this.J = gVar.q().h();
            this.K = gVar.q().m();
            this.L = gVar.q().l();
            if (gVar.l() == context) {
                this.M = gVar.z();
                this.N = gVar.K();
                this.O = gVar.J();
                return;
            }
            this.M = null;
            this.N = null;
            this.O = null;
        }
    }
}
