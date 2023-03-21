package androidx.compose.material;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: AlertDialog.kt */
final class AlertDialogKt$AlertDialogFlowRow$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f4844a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f4845b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4846c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f4847d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlertDialogKt$AlertDialogFlowRow$2(float f11, float f12, p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f4844a = f11;
        this.f4845b = f12;
        this.f4846c = pVar;
        this.f4847d = i11;
    }

    public final void a(g gVar, int i11) {
        AlertDialogKt.c(this.f4844a, this.f4845b, this.f4846c, gVar, this.f4847d | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
