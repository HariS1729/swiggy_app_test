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
final class LazyDslKt$LazyColumn$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f3925a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LazyListState f3926b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a2.p f3927c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f3928d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Arrangement.l f3929e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ a.b f3930f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ y1.k f3931g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ l<c, k> f3932h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f3933i;
    final /* synthetic */ int j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyDslKt$LazyColumn$2(d dVar, LazyListState lazyListState, a2.p pVar, boolean z11, Arrangement.l lVar, a.b bVar, y1.k kVar, l<? super c, k> lVar2, int i11, int i12) {
        super(2);
        this.f3925a = dVar;
        this.f3926b = lazyListState;
        this.f3927c = pVar;
        this.f3928d = z11;
        this.f3929e = lVar;
        this.f3930f = bVar;
        this.f3931g = kVar;
        this.f3932h = lVar2;
        this.f3933i = i11;
        this.j = i12;
    }

    public final void a(g gVar, int i11) {
        LazyDslKt.a(this.f3925a, this.f3926b, this.f3927c, this.f3928d, this.f3929e, this.f3930f, this.f3931g, this.f3932h, gVar, this.f3933i | 1, this.j);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
