package androidx.compose.foundation.lazy.layout;

import bp0.k;
import d2.b;
import e0.g;
import i1.u;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import x.d;
import x.e;

/* compiled from: LazyLayout.kt */
final class LazyLayoutKt$LazyLayout$3 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f4123a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p0.d f4124b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ x.g f4125c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<e, b, u> f4126d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f4127e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f4128f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyLayoutKt$LazyLayout$3(d dVar, p0.d dVar2, x.g gVar, p<? super e, ? super b, ? extends u> pVar, int i11, int i12) {
        super(2);
        this.f4123a = dVar;
        this.f4124b = dVar2;
        this.f4125c = gVar;
        this.f4126d = pVar;
        this.f4127e = i11;
        this.f4128f = i12;
    }

    public final void a(g gVar, int i11) {
        LazyLayoutKt.a(this.f4123a, this.f4124b, this.f4125c, this.f4126d, gVar, this.f4127e | 1, this.f4128f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
