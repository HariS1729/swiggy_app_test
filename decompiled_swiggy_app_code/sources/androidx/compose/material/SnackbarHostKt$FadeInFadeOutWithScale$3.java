package androidx.compose.material;

import bp0.k;
import c0.v;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;
import p0.d;

/* compiled from: SnackbarHost.kt */
final class SnackbarHostKt$FadeInFadeOutWithScale$3 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v f5314a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f5315b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ q<v, g, Integer, k> f5316c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f5317d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f5318e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$FadeInFadeOutWithScale$3(v vVar, d dVar, q<? super v, ? super g, ? super Integer, k> qVar, int i11, int i12) {
        super(2);
        this.f5314a = vVar;
        this.f5315b = dVar;
        this.f5316c = qVar;
        this.f5317d = i11;
        this.f5318e = i12;
    }

    public final void a(g gVar, int i11) {
        SnackbarHostKt.a(this.f5314a, this.f5315b, this.f5316c, gVar, this.f5317d | 1, this.f5318e);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
