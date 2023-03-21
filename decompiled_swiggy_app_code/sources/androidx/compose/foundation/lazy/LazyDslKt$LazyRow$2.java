package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.Arrangement;
import bp0.k;
import defpackage.a2;
import defpackage.y1;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;
import p0.a;
import p0.d;

/* compiled from: LazyDsl.kt */
final class LazyDslKt$LazyRow$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f3943a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LazyListState f3944b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a2.p f3945c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f3946d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Arrangement.d f3947e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ a.c f3948f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ y1.k f3949g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ l<c, k> f3950h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f3951i;
    final /* synthetic */ int j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyDslKt$LazyRow$2(d dVar, LazyListState lazyListState, a2.p pVar, boolean z11, Arrangement.d dVar2, a.c cVar, y1.k kVar, l<? super c, k> lVar, int i11, int i12) {
        super(2);
        this.f3943a = dVar;
        this.f3944b = lazyListState;
        this.f3945c = pVar;
        this.f3946d = z11;
        this.f3947e = dVar2;
        this.f3948f = cVar;
        this.f3949g = kVar;
        this.f3950h = lVar;
        this.f3951i = i11;
        this.j = i12;
    }

    public final void a(g gVar, int i11) {
        LazyDslKt.c(this.f3943a, this.f3944b, this.f3945c, this.f3946d, this.f3947e, this.f3948f, this.f3949g, this.f3950h, gVar, this.f3951i | 1, this.j);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
