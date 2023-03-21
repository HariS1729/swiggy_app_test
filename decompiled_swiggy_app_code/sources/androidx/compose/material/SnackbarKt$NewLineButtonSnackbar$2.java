package androidx.compose.material;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: Snackbar.kt */
final class SnackbarKt$NewLineButtonSnackbar$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5362a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5363b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f5364c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarKt$NewLineButtonSnackbar$2(p<? super g, ? super Integer, k> pVar, p<? super g, ? super Integer, k> pVar2, int i11) {
        super(2);
        this.f5362a = pVar;
        this.f5363b = pVar2;
        this.f5364c = i11;
    }

    public final void a(g gVar, int i11) {
        SnackbarKt.a(this.f5362a, this.f5363b, gVar, this.f5364c | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
