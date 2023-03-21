package coil.compose;

import bp0.k;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import e0.g;
import i1.c;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;
import p0.a;
import p0.d;
import u0.e0;

/* compiled from: AsyncImage.kt */
final class AsyncImageKt$AsyncImage$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object f13406a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f13407b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ImageLoader f13408c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ d f13409d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ l<AsyncImagePainter.b, AsyncImagePainter.b> f13410e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ l<AsyncImagePainter.b, k> f13411f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ a f13412g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ c f13413h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ float f13414i;
    final /* synthetic */ e0 j;
    final /* synthetic */ int k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ int f13415l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ int f13416m;
    final /* synthetic */ int n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AsyncImageKt$AsyncImage$2(Object obj, String str, ImageLoader imageLoader, d dVar, l<? super AsyncImagePainter.b, ? extends AsyncImagePainter.b> lVar, l<? super AsyncImagePainter.b, k> lVar2, a aVar, c cVar, float f11, e0 e0Var, int i11, int i12, int i13, int i14) {
        super(2);
        this.f13406a = obj;
        this.f13407b = str;
        this.f13408c = imageLoader;
        this.f13409d = dVar;
        this.f13410e = lVar;
        this.f13411f = lVar2;
        this.f13412g = aVar;
        this.f13413h = cVar;
        this.f13414i = f11;
        this.j = e0Var;
        this.k = i11;
        this.f13415l = i12;
        this.f13416m = i13;
        this.n = i14;
    }

    public final void a(g gVar, int i11) {
        AsyncImageKt.a(this.f13406a, this.f13407b, this.f13408c, this.f13409d, this.f13410e, this.f13411f, this.f13412g, this.f13413h, this.f13414i, this.j, this.k, gVar, this.f13415l | 1, this.f13416m, this.n);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
