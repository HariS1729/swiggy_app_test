package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.a;

/* compiled from: Size.kt */
final class SizeKt$createWrapContentSizeModifier$2 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f3844a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f3845b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SizeKt$createWrapContentSizeModifier$2(a aVar, boolean z11) {
        super(1);
        this.f3844a = aVar;
        this.f3845b = z11;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$$receiver");
        n0Var.b("wrapContentSize");
        n0Var.a().b("align", this.f3844a);
        n0Var.a().b("unbounded", Boolean.valueOf(this.f3845b));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
