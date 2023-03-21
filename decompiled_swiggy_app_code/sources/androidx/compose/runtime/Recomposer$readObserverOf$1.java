package androidx.compose.runtime;

import bp0.k;
import e0.o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Recomposer.kt */
final class Recomposer$readObserverOf$1 extends Lambda implements l<Object, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o f6064a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$readObserverOf$1(o oVar) {
        super(1);
        this.f6064a = oVar;
    }

    public final void invoke(Object obj) {
        p.j(obj, "value");
        this.f6064a.l(obj);
    }
}
