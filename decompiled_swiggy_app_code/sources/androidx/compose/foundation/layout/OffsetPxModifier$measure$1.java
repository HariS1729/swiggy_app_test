package androidx.compose.foundation.layout;

import bp0.k;
import i1.e0;
import i1.w;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Offset.kt */
final class OffsetPxModifier$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ OffsetPxModifier f3766a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ w f3767b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e0 f3768c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OffsetPxModifier$measure$1(OffsetPxModifier offsetPxModifier, w wVar, e0 e0Var) {
        super(1);
        this.f3766a = offsetPxModifier;
        this.f3767b = wVar;
        this.f3768c = e0Var;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        long n = this.f3766a.c().invoke(this.f3767b).n();
        if (this.f3766a.d()) {
            e0.a.r(aVar, this.f3768c, d2.l.j(n), d2.l.k(n), 0.0f, (l) null, 12, (Object) null);
            return;
        }
        e0.a.v(aVar, this.f3768c, d2.l.j(n), d2.l.k(n), 0.0f, (l) null, 12, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
