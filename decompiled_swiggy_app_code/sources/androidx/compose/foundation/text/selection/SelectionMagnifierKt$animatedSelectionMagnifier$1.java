package androidx.compose.foundation.text.selection;

import e0.d1;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;
import lp0.q;
import p0.d;
import t0.f;

/* compiled from: SelectionMagnifier.kt */
final class SelectionMagnifierKt$animatedSelectionMagnifier$1 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a<f> f4716a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<a<f>, d> f4717b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectionMagnifierKt$animatedSelectionMagnifier$1(a<f> aVar, l<? super a<f>, ? extends d> lVar) {
        super(3);
        this.f4716a = aVar;
        this.f4717b = lVar;
    }

    /* access modifiers changed from: private */
    public static final long c(d1<f> d1Var) {
        return d1Var.getValue().u();
    }

    public final d b(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(759876635);
        final d1 c11 = SelectionMagnifierKt.f(this.f4716a, gVar, 0);
        d invoke = this.f4717b.invoke(new a<f>() {
            public final long a() {
                return SelectionMagnifierKt$animatedSelectionMagnifier$1.c(c11);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return f.d(a());
            }
        });
        gVar.P();
        return invoke;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
