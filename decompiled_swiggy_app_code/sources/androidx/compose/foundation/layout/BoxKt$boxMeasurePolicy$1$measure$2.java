package androidx.compose.foundation.layout;

import bp0.k;
import i1.e0;
import i1.r;
import i1.w;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.a;

/* compiled from: Box.kt */
final class BoxKt$boxMeasurePolicy$1$measure$2 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f3686a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r f3687b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ w f3688c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f3689d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f3690e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ a f3691f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BoxKt$boxMeasurePolicy$1$measure$2(e0 e0Var, r rVar, w wVar, int i11, int i12, a aVar) {
        super(1);
        this.f3686a = e0Var;
        this.f3687b = rVar;
        this.f3688c = wVar;
        this.f3689d = i11;
        this.f3690e = i12;
        this.f3691f = aVar;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        BoxKt.g(aVar, this.f3686a, this.f3687b, this.f3688c.getLayoutDirection(), this.f3689d, this.f3690e, this.f3691f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
