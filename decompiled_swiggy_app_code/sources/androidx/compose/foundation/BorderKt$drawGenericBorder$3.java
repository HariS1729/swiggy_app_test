package androidx.compose.foundation;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.p;
import lp0.l;
import t0.h;
import u0.e0;
import u0.l0;
import w0.c;
import w0.e;
import w0.g;

/* compiled from: Border.kt */
final class BorderKt$drawGenericBorder$3 extends Lambda implements l<c, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f2864a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<l0> f2865b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f2866c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ e0 f2867d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BorderKt$drawGenericBorder$3(h hVar, Ref$ObjectRef<l0> ref$ObjectRef, long j, e0 e0Var) {
        super(1);
        this.f2864a = hVar;
        this.f2865b = ref$ObjectRef;
        this.f2866c = j;
        this.f2867d = e0Var;
    }

    public final void a(c cVar) {
        p.j(cVar, "$this$onDrawWithContent");
        cVar.V();
        float i11 = this.f2864a.i();
        float l11 = this.f2864a.l();
        Ref$ObjectRef<l0> ref$ObjectRef = this.f2865b;
        long j = this.f2866c;
        e0 e0Var = this.f2867d;
        cVar.O().c().c(i11, l11);
        e.g(cVar, (l0) ref$ObjectRef.f25666a, 0, j, 0, 0, 0.0f, (g) null, e0Var, 0, 0, 890, (Object) null);
        cVar.O().c().c(-i11, -l11);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((c) obj);
        return k.f22762a;
    }
}
