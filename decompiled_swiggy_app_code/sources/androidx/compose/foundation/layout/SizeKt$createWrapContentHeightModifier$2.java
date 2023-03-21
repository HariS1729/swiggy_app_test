package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.a;

/* compiled from: Size.kt */
final class SizeKt$createWrapContentHeightModifier$2 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a.c f3841a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f3842b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SizeKt$createWrapContentHeightModifier$2(a.c cVar, boolean z11) {
        super(1);
        this.f3841a = cVar;
        this.f3842b = z11;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$$receiver");
        n0Var.b("wrapContentHeight");
        n0Var.a().b("align", this.f3841a);
        n0Var.a().b("unbounded", Boolean.valueOf(this.f3842b));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
