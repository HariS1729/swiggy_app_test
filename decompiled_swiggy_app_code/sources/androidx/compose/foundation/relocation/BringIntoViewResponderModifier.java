package androidx.compose.foundation.relocation;

import bp0.k;
import fp0.c;
import i1.m;
import j1.d;
import j1.f;
import kotlin.Pair;
import kotlin.jvm.internal.p;
import t0.h;
import wp0.k0;
import wp0.k1;
import y.b;
import y.e;

/* compiled from: BringIntoViewResponder.kt */
final class BringIntoViewResponderModifier extends a implements d<b>, b {

    /* renamed from: d  reason: collision with root package name */
    public e f4156d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Pair<h, ? extends k1> f4157e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Pair<h, ? extends k1> f4158f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderModifier(b bVar) {
        super(bVar);
        p.j(bVar, "defaultParent");
    }

    /* access modifiers changed from: private */
    public final Object j(Pair<h, ? extends k1> pair, m mVar, c<? super k> cVar) {
        this.f4158f = pair;
        h c11 = pair.c();
        Object e11 = k0.e(new BringIntoViewResponderModifier$dispatchRequest$2(this, k().a(c11), mVar, c11, (c<? super BringIntoViewResponderModifier$dispatchRequest$2>) null), cVar);
        return e11 == b.d() ? e11 : k.f22762a;
    }

    public Object a(h hVar, m mVar, c<? super k> cVar) {
        Object e11 = k0.e(new BringIntoViewResponderModifier$bringChildIntoView$2(this, mVar, hVar, (c<? super BringIntoViewResponderModifier$bringChildIntoView$2>) null), cVar);
        return e11 == b.d() ? e11 : k.f22762a;
    }

    public f<b> getKey() {
        return BringIntoViewKt.a();
    }

    public final e k() {
        e eVar = this.f4156d;
        if (eVar != null) {
            return eVar;
        }
        p.B("responder");
        return null;
    }

    /* renamed from: l */
    public b getValue() {
        return this;
    }

    public final void m(e eVar) {
        p.j(eVar, "<set-?>");
        this.f4156d = eVar;
    }
}
