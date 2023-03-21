package androidx.compose.runtime;

import bp0.k;
import e0.o;
import f0.c;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: Recomposer.kt */
final class Recomposer$performRecompose$1$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c<Object> f6062a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o f6063b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$performRecompose$1$1(c<Object> cVar, o oVar) {
        super(0);
        this.f6062a = cVar;
        this.f6063b = oVar;
    }

    public final void invoke() {
        c<Object> cVar = this.f6062a;
        o oVar = this.f6063b;
        for (Object q : cVar) {
            oVar.q(q);
        }
    }
}
