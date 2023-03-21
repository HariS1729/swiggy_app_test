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
final class LazyDslKt$LazyRow$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f3934a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LazyListState f3935b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a2.p f3936c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f3937d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Arrangement.d f3938e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ a.c f3939f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ y1.k f3940g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ boolean f3941h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ l<c, k> f3942i;
    final /* synthetic */ int j;
    final /* synthetic */ int k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyDslKt$LazyRow$1(d dVar, LazyListState lazyListState, a2.p pVar, boolean z11, Arrangement.d dVar2, a.c cVar, y1.k kVar, boolean z12, l<? super c, k> lVar, int i11, int i12) {
        super(2);
        this.f3934a = dVar;
        this.f3935b = lazyListState;
        this.f3936c = pVar;
        this.f3937d = z11;
        this.f3938e = dVar2;
        this.f3939f = cVar;
        this.f3940g = kVar;
        this.f3941h = z12;
        this.f3942i = lVar;
        this.j = i11;
        this.k = i12;
    }

    public final void a(g gVar, int i11) {
        LazyDslKt.d(this.f3934a, this.f3935b, this.f3936c, this.f3937d, this.f3938e, this.f3939f, this.f3940g, this.f3941h, this.f3942i, gVar, this.j | 1, this.k);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
