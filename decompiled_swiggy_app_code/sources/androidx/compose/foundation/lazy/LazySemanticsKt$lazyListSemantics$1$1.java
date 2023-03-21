package androidx.compose.foundation.lazy;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;
import n1.b;
import n1.h;
import n1.o;
import n1.q;

/* compiled from: LazySemantics.kt */
final class LazySemanticsKt$lazyListSemantics$1$1 extends Lambda implements l<q, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<Object, Integer> f4070a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f4071b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h f4072c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<Float, Float, Boolean> f4073d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ l<Integer, Boolean> f4074e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ b f4075f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazySemanticsKt$lazyListSemantics$1$1(l<Object, Integer> lVar, boolean z11, h hVar, p<? super Float, ? super Float, Boolean> pVar, l<? super Integer, Boolean> lVar2, b bVar) {
        super(1);
        this.f4070a = lVar;
        this.f4071b = z11;
        this.f4072c = hVar;
        this.f4073d = pVar;
        this.f4074e = lVar2;
        this.f4075f = bVar;
    }

    public final void a(q qVar) {
        kotlin.jvm.internal.p.j(qVar, "$this$semantics");
        o.l(qVar, this.f4070a);
        if (this.f4071b) {
            o.T(qVar, this.f4072c);
        } else {
            o.F(qVar, this.f4072c);
        }
        p<Float, Float, Boolean> pVar = this.f4073d;
        if (pVar != null) {
            o.y(qVar, (String) null, pVar, 1, (Object) null);
        }
        l<Integer, Boolean> lVar = this.f4074e;
        if (lVar != null) {
            o.A(qVar, (String) null, lVar, 1, (Object) null);
        }
        o.B(qVar, this.f4075f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((q) obj);
        return k.f22762a;
    }
}
