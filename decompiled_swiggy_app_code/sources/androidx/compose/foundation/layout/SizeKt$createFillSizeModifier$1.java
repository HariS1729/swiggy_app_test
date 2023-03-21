package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Size.kt */
final class SizeKt$createFillSizeModifier$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f3838a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SizeKt$createFillSizeModifier$1(float f11) {
        super(1);
        this.f3838a = f11;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$$receiver");
        n0Var.b("fillMaxSize");
        n0Var.a().b("fraction", Float.valueOf(this.f3838a));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
