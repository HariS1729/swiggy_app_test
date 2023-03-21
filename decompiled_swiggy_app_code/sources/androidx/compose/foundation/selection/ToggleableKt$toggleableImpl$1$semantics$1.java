package androidx.compose.foundation.selection;

import androidx.compose.ui.state.ToggleableState;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;
import n1.g;
import n1.o;
import n1.q;

/* compiled from: Toggleable.kt */
final class ToggleableKt$toggleableImpl$1$semantics$1 extends Lambda implements l<q, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f4211a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ToggleableState f4212b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f4213c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a<k> f4214d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ToggleableKt$toggleableImpl$1$semantics$1(g gVar, ToggleableState toggleableState, boolean z11, a<k> aVar) {
        super(1);
        this.f4211a = gVar;
        this.f4212b = toggleableState;
        this.f4213c = z11;
        this.f4214d = aVar;
    }

    public final void a(q qVar) {
        p.j(qVar, "$this$semantics");
        g gVar = this.f4211a;
        if (gVar != null) {
            o.K(qVar, gVar.m());
        }
        o.S(qVar, this.f4212b);
        final a<k> aVar = this.f4214d;
        o.o(qVar, (String) null, new a<Boolean>() {
            /* renamed from: a */
            public final Boolean invoke() {
                aVar.invoke();
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
        if (!this.f4213c) {
            o.f(qVar);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((q) obj);
        return k.f22762a;
    }
}
