package androidx.compose.material;

import bp0.k;
import e0.h0;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import t0.m;

/* compiled from: OutlinedTextField.kt */
final class OutlinedTextFieldKt$OutlinedTextFieldLayout$1$1$1 extends Lambda implements l<t0.l, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f5163a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h0<t0.l> f5164b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OutlinedTextFieldKt$OutlinedTextFieldLayout$1$1$1(float f11, h0<t0.l> h0Var) {
        super(1);
        this.f5163a = f11;
        this.f5164b = h0Var;
    }

    public final void a(long j) {
        float i11 = t0.l.i(j) * this.f5163a;
        float g11 = t0.l.g(j) * this.f5163a;
        boolean z11 = true;
        if (t0.l.i(this.f5164b.getValue().m()) == i11) {
            if (t0.l.g(this.f5164b.getValue().m()) != g11) {
                z11 = false;
            }
            if (z11) {
                return;
            }
        }
        this.f5164b.setValue(t0.l.c(m.a(i11, g11)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a(((t0.l) obj).m());
        return k.f22762a;
    }
}
