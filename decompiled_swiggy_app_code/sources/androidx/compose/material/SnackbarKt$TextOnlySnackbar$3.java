package androidx.compose.material;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: Snackbar.kt */
final class SnackbarKt$TextOnlySnackbar$3 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5415a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f5416b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarKt$TextOnlySnackbar$3(p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f5415a = pVar;
        this.f5416b = i11;
    }

    public final void a(g gVar, int i11) {
        SnackbarKt.e(this.f5415a, gVar, this.f5416b | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
