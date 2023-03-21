package androidx.constraintlayout.compose;

import bp0.k;
import k2.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.j0;
import u0.r1;

/* compiled from: ConstraintLayout.kt */
final class Measurer$performLayout$1$layerBlock$1 extends Lambda implements l<j0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f7997a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Measurer$performLayout$1$layerBlock$1(b bVar) {
        super(1);
        this.f7997a = bVar;
    }

    public final void a(j0 j0Var) {
        p.j(j0Var, "$this$null");
        if (!Float.isNaN(this.f7997a.f15392f) || !Float.isNaN(this.f7997a.f15393g)) {
            float f11 = 0.5f;
            float f12 = Float.isNaN(this.f7997a.f15392f) ? 0.5f : this.f7997a.f15392f;
            if (!Float.isNaN(this.f7997a.f15393g)) {
                f11 = this.f7997a.f15393g;
            }
            j0Var.z(r1.a(f12, f11));
        }
        if (!Float.isNaN(this.f7997a.f15394h)) {
            j0Var.g(this.f7997a.f15394h);
        }
        if (!Float.isNaN(this.f7997a.f15395i)) {
            j0Var.h(this.f7997a.f15395i);
        }
        if (!Float.isNaN(this.f7997a.j)) {
            j0Var.i(this.f7997a.j);
        }
        if (!Float.isNaN(this.f7997a.k)) {
            j0Var.n(this.f7997a.k);
        }
        if (!Float.isNaN(this.f7997a.f15396l)) {
            j0Var.e(this.f7997a.f15396l);
        }
        if (!Float.isNaN(this.f7997a.f15397m)) {
            j0Var.F(this.f7997a.f15397m);
        }
        if (!Float.isNaN(this.f7997a.n) || !Float.isNaN(this.f7997a.f15398o)) {
            float f13 = 1.0f;
            j0Var.l(Float.isNaN(this.f7997a.n) ? 1.0f : this.f7997a.n);
            if (!Float.isNaN(this.f7997a.f15398o)) {
                f13 = this.f7997a.f15398o;
            }
            j0Var.m(f13);
        }
        if (!Float.isNaN(this.f7997a.f15399p)) {
            j0Var.c(this.f7997a.f15399p);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((j0) obj);
        return k.f22762a;
    }
}
