package androidx.compose.foundation.text;

import bp0.k;
import e0.h0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import p1.y;

/* compiled from: ClickableText.kt */
final class ClickableTextKt$ClickableText$2$1 extends Lambda implements l<y, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h0<y> f4296a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<y, k> f4297b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableTextKt$ClickableText$2$1(h0<y> h0Var, l<? super y, k> lVar) {
        super(1);
        this.f4296a = h0Var;
        this.f4297b = lVar;
    }

    public final void a(y yVar) {
        p.j(yVar, "it");
        this.f4296a.setValue(yVar);
        this.f4297b.invoke(yVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((y) obj);
        return k.f22762a;
    }
}
