package androidx.compose.material;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: Snackbar.kt */
final class SnackbarKt$OneRowSnackbar$3 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5372a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5373b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f5374c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarKt$OneRowSnackbar$3(p<? super g, ? super Integer, k> pVar, p<? super g, ? super Integer, k> pVar2, int i11) {
        super(2);
        this.f5372a = pVar;
        this.f5373b = pVar2;
        this.f5374c = i11;
    }

    public final void a(g gVar, int i11) {
        SnackbarKt.b(this.f5372a, this.f5373b, gVar, this.f5374c | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
