package androidx.compose.animation;

import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p.q;

/* compiled from: EnterExitTransition.kt */
final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    private final q f2604c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(q qVar) {
        super((i) null);
        p.j(qVar, CardTypeAdapterFactory.DATA);
        this.f2604c = qVar;
    }

    public q a() {
        return this.f2604c;
    }
}
