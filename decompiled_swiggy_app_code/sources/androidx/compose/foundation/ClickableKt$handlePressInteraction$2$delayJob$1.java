package androidx.compose.foundation;

import bp0.g;
import bp0.k;
import e0.d1;
import e0.h0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.i;
import lp0.a;
import lp0.p;
import u.n;
import wp0.j0;
import wp0.q0;

@d(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", l = {406, 409}, m = "invokeSuspend")
/* compiled from: Clickable.kt */
final class ClickableKt$handlePressInteraction$2$delayJob$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f2949a;

    /* renamed from: b  reason: collision with root package name */
    int f2950b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d1<a<Boolean>> f2951c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f2952d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ u.k f2953e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ h0<n> f2954f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$handlePressInteraction$2$delayJob$1(d1<? extends a<Boolean>> d1Var, long j, u.k kVar, h0<n> h0Var, c<? super ClickableKt$handlePressInteraction$2$delayJob$1> cVar) {
        super(2, cVar);
        this.f2951c = d1Var;
        this.f2952d = j;
        this.f2953e = kVar;
        this.f2954f = h0Var;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new ClickableKt$handlePressInteraction$2$delayJob$1(this.f2951c, this.f2952d, this.f2953e, this.f2954f, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((ClickableKt$handlePressInteraction$2$delayJob$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        n nVar;
        Object d11 = b.d();
        int i11 = this.f2950b;
        if (i11 == 0) {
            g.b(obj);
            if (((Boolean) this.f2951c.getValue().invoke()).booleanValue()) {
                long b11 = Clickable_androidKt.b();
                this.f2950b = 1;
                if (q0.a(b11, this) == d11) {
                    return d11;
                }
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else if (i11 == 2) {
            nVar = (n) this.f2949a;
            g.b(obj);
            this.f2954f.setValue(nVar);
            return k.f22762a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        n nVar2 = new n(this.f2952d, (i) null);
        u.k kVar = this.f2953e;
        this.f2949a = nVar2;
        this.f2950b = 2;
        if (kVar.c(nVar2, this) == d11) {
            return d11;
        }
        nVar = nVar2;
        this.f2954f.setValue(nVar);
        return k.f22762a;
    }
}
