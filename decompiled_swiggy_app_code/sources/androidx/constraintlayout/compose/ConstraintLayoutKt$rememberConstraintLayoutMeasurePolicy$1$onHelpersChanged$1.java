package androidx.constraintlayout.compose;

import bp0.k;
import e0.h0;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: ConstraintLayout.kt */
final class ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h0<Boolean> f7943a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ConstraintSetForInlineDsl f7944b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1(h0<Boolean> h0Var, ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(0);
        this.f7943a = h0Var;
        this.f7944b = constraintSetForInlineDsl;
    }

    public final void invoke() {
        h0<Boolean> h0Var = this.f7943a;
        h0Var.setValue(Boolean.valueOf(!h0Var.getValue().booleanValue()));
        this.f7944b.k(true);
    }
}
