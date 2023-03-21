package androidx.compose.foundation.text;

import a0.s;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import i1.e0;
import i1.w;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import v1.d0;

/* compiled from: TextFieldScroll.kt */
final class HorizontalScrollLayoutModifier$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w f4459a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HorizontalScrollLayoutModifier f4460b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e0 f4461c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f4462d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HorizontalScrollLayoutModifier$measure$1(w wVar, HorizontalScrollLayoutModifier horizontalScrollLayoutModifier, e0 e0Var, int i11) {
        super(1);
        this.f4459a = wVar;
        this.f4460b = horizontalScrollLayoutModifier;
        this.f4461c = e0Var;
        this.f4462d = i11;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        w wVar = this.f4459a;
        int a11 = this.f4460b.a();
        d0 e11 = this.f4460b.e();
        s invoke = this.f4460b.d().invoke();
        this.f4460b.c().j(Orientation.Horizontal, TextFieldScrollKt.b(wVar, a11, e11, invoke != null ? invoke.i() : null, this.f4459a.getLayoutDirection() == LayoutDirection.Rtl, this.f4461c.A0()), this.f4462d, this.f4461c.A0());
        e0.a.n(aVar, this.f4461c, c.c(-this.f4460b.c().d()), 0, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
