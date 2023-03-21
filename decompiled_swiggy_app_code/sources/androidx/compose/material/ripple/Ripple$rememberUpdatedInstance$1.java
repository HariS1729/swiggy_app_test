package androidx.compose.material.ripple;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;
import u.h;
import u.i;
import u.m;
import u.n;
import u.o;
import wp0.j0;

@d(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", l = {356}, m = "invokeSuspend")
/* compiled from: Ripple.kt */
final class Ripple$rememberUpdatedInstance$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f5812a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f5813b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ i f5814c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b f5815d;

    /* compiled from: Collect.kt */
    public static final class a implements e<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f5816a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j0 f5817b;

        public a(b bVar, j0 j0Var) {
            this.f5816a = bVar;
            this.f5817b = j0Var;
        }

        public Object emit(h hVar, c<? super k> cVar) {
            h hVar2 = hVar;
            if (hVar2 instanceof n) {
                this.f5816a.c((n) hVar2, this.f5817b);
            } else if (hVar2 instanceof o) {
                this.f5816a.e(((o) hVar2).a());
            } else if (hVar2 instanceof m) {
                this.f5816a.e(((m) hVar2).a());
            } else {
                this.f5816a.h(hVar2, this.f5817b);
            }
            return k.f22762a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Ripple$rememberUpdatedInstance$1(i iVar, b bVar, c<? super Ripple$rememberUpdatedInstance$1> cVar) {
        super(2, cVar);
        this.f5814c = iVar;
        this.f5815d = bVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        Ripple$rememberUpdatedInstance$1 ripple$rememberUpdatedInstance$1 = new Ripple$rememberUpdatedInstance$1(this.f5814c, this.f5815d, cVar);
        ripple$rememberUpdatedInstance$1.f5813b = obj;
        return ripple$rememberUpdatedInstance$1;
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((Ripple$rememberUpdatedInstance$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f5812a;
        if (i11 == 0) {
            g.b(obj);
            kotlinx.coroutines.flow.d<h> b11 = this.f5814c.b();
            a aVar = new a(this.f5815d, (j0) this.f5813b);
            this.f5812a = 1;
            if (b11.collect(aVar, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
