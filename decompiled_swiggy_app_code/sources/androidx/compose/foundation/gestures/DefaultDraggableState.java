package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import bp0.k;
import defpackage.y1;
import fp0.c;
import kotlin.jvm.internal.p;
import lp0.l;
import wp0.k0;

/* compiled from: Draggable.kt */
final class DefaultDraggableState implements y1.j {

    /* renamed from: a  reason: collision with root package name */
    private final l<Float, k> f3207a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final y1.h f3208b = new a(this);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final MutatorMutex f3209c = new MutatorMutex();

    /* compiled from: Draggable.kt */
    public static final class a implements y1.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DefaultDraggableState f3210a;

        a(DefaultDraggableState defaultDraggableState) {
            this.f3210a = defaultDraggableState;
        }

        public void a(float f11) {
            this.f3210a.d().invoke(Float.valueOf(f11));
        }
    }

    public DefaultDraggableState(l<? super Float, k> lVar) {
        p.j(lVar, "onDelta");
        this.f3207a = lVar;
    }

    public Object a(MutatePriority mutatePriority, lp0.p<? super y1.h, ? super c<? super k>, ? extends Object> pVar, c<? super k> cVar) {
        Object e11 = k0.e(new DefaultDraggableState$drag$2(this, mutatePriority, pVar, (c<? super DefaultDraggableState$drag$2>) null), cVar);
        return e11 == b.d() ? e11 : k.f22762a;
    }

    public final l<Float, k> d() {
        return this.f3207a;
    }
}
