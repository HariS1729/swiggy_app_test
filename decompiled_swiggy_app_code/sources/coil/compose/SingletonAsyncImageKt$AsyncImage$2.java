package coil.compose;

import bp0.k;
import coil.compose.AsyncImagePainter;
import e0.g;
import i1.c;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;
import p0.a;
import p0.d;
import u0.e0;

/* compiled from: SingletonAsyncImage.kt */
final class SingletonAsyncImageKt$AsyncImage$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object f13479a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f13480b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d f13481c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l<AsyncImagePainter.b, AsyncImagePainter.b> f13482d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ l<AsyncImagePainter.b, k> f13483e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ a f13484f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ c f13485g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ float f13486h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ e0 f13487i;
    final /* synthetic */ int j;
    final /* synthetic */ int k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ int f13488l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingletonAsyncImageKt$AsyncImage$2(Object obj, String str, d dVar, l<? super AsyncImagePainter.b, ? extends AsyncImagePainter.b> lVar, l<? super AsyncImagePainter.b, k> lVar2, a aVar, c cVar, float f11, e0 e0Var, int i11, int i12, int i13) {
        super(2);
        this.f13479a = obj;
        this.f13480b = str;
        this.f13481c = dVar;
        this.f13482d = lVar;
        this.f13483e = lVar2;
        this.f13484f = aVar;
        this.f13485g = cVar;
        this.f13486h = f11;
        this.f13487i = e0Var;
        this.j = i11;
        this.k = i12;
        this.f13488l = i13;
    }

    public final void a(g gVar, int i11) {
        SingletonAsyncImageKt.a(this.f13479a, this.f13480b, this.f13481c, this.f13482d, this.f13483e, this.f13484f, this.f13485g, this.f13486h, this.f13487i, this.j, gVar, this.k | 1, this.f13488l);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
