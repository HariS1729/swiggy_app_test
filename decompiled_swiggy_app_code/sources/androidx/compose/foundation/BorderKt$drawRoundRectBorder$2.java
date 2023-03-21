package androidx.compose.foundation;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.e0;
import u0.u;
import u0.w0;
import w0.c;
import w0.e;
import w0.g;

/* compiled from: Border.kt */
final class BorderKt$drawRoundRectBorder$2 extends Lambda implements l<c, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w0 f2880a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u f2881b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BorderKt$drawRoundRectBorder$2(w0 w0Var, u uVar) {
        super(1);
        this.f2880a = w0Var;
        this.f2881b = uVar;
    }

    public final void a(c cVar) {
        p.j(cVar, "$this$onDrawWithContent");
        cVar.V();
        e.k(cVar, this.f2880a, this.f2881b, 0.0f, (g) null, (e0) null, 0, 60, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((c) obj);
        return k.f22762a;
    }
}
