package androidx.compose.material;

import c0.c0;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import u.k;
import u0.d0;

/* compiled from: TextFieldImpl.kt */
final class TextFieldImplKt$TextFieldImpl$labelColor$1 extends Lambda implements q<InputPhase, g, Integer, d0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c0 f5612a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f5613b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f5614c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k f5615d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f5616e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f5617f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldImplKt$TextFieldImpl$labelColor$1(c0 c0Var, boolean z11, boolean z12, k kVar, int i11, int i12) {
        super(3);
        this.f5612a = c0Var;
        this.f5613b = z11;
        this.f5614c = z12;
        this.f5615d = kVar;
        this.f5616e = i11;
        this.f5617f = i12;
    }

    public final long a(InputPhase inputPhase, g gVar, int i11) {
        p.j(inputPhase, "it");
        gVar.E(-1061048422);
        c0 c0Var = this.f5612a;
        boolean z11 = this.f5613b;
        boolean z12 = inputPhase == InputPhase.UnfocusedEmpty ? false : this.f5614c;
        k kVar = this.f5615d;
        int i12 = this.f5617f;
        long v = c0Var.j(z11, z12, kVar, gVar, ((this.f5616e >> 3) & 14) | ((i12 >> 15) & 896) | ((i12 >> 18) & 7168)).getValue().v();
        gVar.P();
        return v;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return d0.h(a((InputPhase) obj, (g) obj2, ((Number) obj3).intValue()));
    }
}
