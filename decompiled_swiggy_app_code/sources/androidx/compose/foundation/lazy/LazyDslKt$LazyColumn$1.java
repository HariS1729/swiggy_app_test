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
final class LazyDslKt$LazyColumn$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f3916a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LazyListState f3917b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a2.p f3918c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f3919d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Arrangement.l f3920e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ a.b f3921f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ y1.k f3922g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ boolean f3923h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ l<c, k> f3924i;
    final /* synthetic */ int j;
    final /* synthetic */ int k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyDslKt$LazyColumn$1(d dVar, LazyListState lazyListState, a2.p pVar, boolean z11, Arrangement.l lVar, a.b bVar, y1.k kVar, boolean z12, l<? super c, k> lVar2, int i11, int i12) {
        super(2);
        this.f3916a = dVar;
        this.f3917b = lazyListState;
        this.f3918c = pVar;
        this.f3919d = z11;
        this.f3920e = lVar;
        this.f3921f = bVar;
        this.f3922g = kVar;
        this.f3923h = z12;
        this.f3924i = lVar2;
        this.j = i11;
        this.k = i12;
    }

    public final void a(g gVar, int i11) {
        LazyDslKt.b(this.f3916a, this.f3917b, this.f3918c, this.f3919d, this.f3920e, this.f3921f, this.f3922g, this.f3923h, this.f3924i, gVar, this.j | 1, this.k);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
