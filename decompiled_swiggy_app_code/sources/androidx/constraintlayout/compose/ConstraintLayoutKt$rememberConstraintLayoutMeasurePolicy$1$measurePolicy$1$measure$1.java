package androidx.constraintlayout.compose;

import bp0.k;
import i1.e0;
import i1.r;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ConstraintLayout.kt */
final class ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Measurer f7941a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<r> f7942b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1$measure$1(Measurer measurer, List<? extends r> list) {
        super(1);
        this.f7941a = measurer;
        this.f7942b = list;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        this.f7941a.u(aVar, this.f7942b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
