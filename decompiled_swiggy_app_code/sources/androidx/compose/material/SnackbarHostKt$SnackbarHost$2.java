package androidx.compose.material;

import bp0.k;
import c0.v;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;
import p0.d;

/* compiled from: SnackbarHost.kt */
final class SnackbarHostKt$SnackbarHost$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SnackbarHostState f5322a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f5323b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ q<v, g, Integer, k> f5324c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f5325d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f5326e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$SnackbarHost$2(SnackbarHostState snackbarHostState, d dVar, q<? super v, ? super g, ? super Integer, k> qVar, int i11, int i12) {
        super(2);
        this.f5322a = snackbarHostState;
        this.f5323b = dVar;
        this.f5324c = qVar;
        this.f5325d = i11;
        this.f5326e = i12;
    }

    public final void a(g gVar, int i11) {
        SnackbarHostKt.b(this.f5322a, this.f5323b, this.f5324c, gVar, this.f5325d | 1, this.f5326e);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
