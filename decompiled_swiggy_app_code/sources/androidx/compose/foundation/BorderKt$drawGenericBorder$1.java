package androidx.compose.foundation;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.e0;
import u0.r0;
import u0.u;
import w0.c;
import w0.e;
import w0.g;

/* compiled from: Border.kt */
final class BorderKt$drawGenericBorder$1 extends Lambda implements l<c, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r0.a f2862a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u f2863b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BorderKt$drawGenericBorder$1(r0.a aVar, u uVar) {
        super(1);
        this.f2862a = aVar;
        this.f2863b = uVar;
    }

    public final void a(c cVar) {
        p.j(cVar, "$this$onDrawWithContent");
        cVar.V();
        e.k(cVar, this.f2862a.a(), this.f2863b, 0.0f, (g) null, (e0) null, 0, 60, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((c) obj);
        return k.f22762a;
    }
}
