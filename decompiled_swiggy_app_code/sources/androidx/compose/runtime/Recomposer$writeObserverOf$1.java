package androidx.compose.runtime;

import bp0.k;
import e0.o;
import f0.c;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Recomposer.kt */
final class Recomposer$writeObserverOf$1 extends Lambda implements l<Object, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o f6090a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c<Object> f6091b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$writeObserverOf$1(o oVar, c<Object> cVar) {
        super(1);
        this.f6090a = oVar;
        this.f6091b = cVar;
    }

    public final void invoke(Object obj) {
        p.j(obj, "value");
        this.f6090a.q(obj);
        c<Object> cVar = this.f6091b;
        if (cVar != null) {
            cVar.add(obj);
        }
    }
}
