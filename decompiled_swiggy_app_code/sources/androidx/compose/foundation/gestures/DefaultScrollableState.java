package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import bp0.k;
import defpackage.y1;
import e0.a1;
import e0.h0;
import fp0.c;
import kotlin.jvm.internal.p;
import lp0.l;
import wp0.k0;

/* compiled from: ScrollableState.kt */
final class DefaultScrollableState implements y1.r {

    /* renamed from: a  reason: collision with root package name */
    private final l<Float, Float> f3223a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final y1.p f3224b = new a(this);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final MutatorMutex f3225c = new MutatorMutex();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final h0<Boolean> f3226d = j.e(Boolean.FALSE, (a1) null, 2, (Object) null);

    /* compiled from: ScrollableState.kt */
    public static final class a implements y1.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DefaultScrollableState f3227a;

        a(DefaultScrollableState defaultScrollableState) {
            this.f3227a = defaultScrollableState;
        }

        public float a(float f11) {
            return this.f3227a.g().invoke(Float.valueOf(f11)).floatValue();
        }
    }

    public DefaultScrollableState(l<? super Float, Float> lVar) {
        p.j(lVar, "onDelta");
        this.f3223a = lVar;
    }

    public boolean a() {
        return this.f3226d.getValue().booleanValue();
    }

    public float b(float f11) {
        return this.f3223a.invoke(Float.valueOf(f11)).floatValue();
    }

    public Object c(MutatePriority mutatePriority, lp0.p<? super y1.p, ? super c<? super k>, ? extends Object> pVar, c<? super k> cVar) {
        Object e11 = k0.e(new DefaultScrollableState$scroll$2(this, mutatePriority, pVar, (c<? super DefaultScrollableState$scroll$2>) null), cVar);
        return e11 == b.d() ? e11 : k.f22762a;
    }

    public final l<Float, Float> g() {
        return this.f3223a;
    }
}
