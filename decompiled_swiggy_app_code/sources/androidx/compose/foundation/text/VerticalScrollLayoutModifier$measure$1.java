package androidx.compose.foundation.text;

import a0.s;
import androidx.compose.foundation.gestures.Orientation;
import bp0.k;
import i1.e0;
import i1.w;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import v1.d0;

/* compiled from: TextFieldScroll.kt */
final class VerticalScrollLayoutModifier$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w f4656a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalScrollLayoutModifier f4657b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e0 f4658c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f4659d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VerticalScrollLayoutModifier$measure$1(w wVar, VerticalScrollLayoutModifier verticalScrollLayoutModifier, e0 e0Var, int i11) {
        super(1);
        this.f4656a = wVar;
        this.f4657b = verticalScrollLayoutModifier;
        this.f4658c = e0Var;
        this.f4659d = i11;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        w wVar = this.f4656a;
        int a11 = this.f4657b.a();
        d0 e11 = this.f4657b.e();
        s invoke = this.f4657b.d().invoke();
        this.f4657b.c().j(Orientation.Vertical, TextFieldScrollKt.b(wVar, a11, e11, invoke != null ? invoke.i() : null, false, this.f4658c.A0()), this.f4659d, this.f4658c.e0());
        e0.a.n(aVar, this.f4658c, 0, c.c(-this.f4657b.c().d()), 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
