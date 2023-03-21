package co.hyperverge.crashguard.data.repo;

import b3.a;
import b3.b;
import bp0.g;
import bp0.k;
import fp0.c;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import lp0.p;
import lp0.q;
import wp0.j0;

@d(c = "co.hyperverge.crashguard.data.repo.PrefsRepo$get$1", f = "PrefsRepo.kt", l = {57}, m = "invokeSuspend")
/* compiled from: PrefsRepo.kt */
final class PrefsRepo$get$1 extends SuspendLambda implements p<j0, c<? super T>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f13131a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PrefsRepo f13132b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a.C0100a<T> f13133c;

    @d(c = "co.hyperverge.crashguard.data.repo.PrefsRepo$get$1$1", f = "PrefsRepo.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: co.hyperverge.crashguard.data.repo.PrefsRepo$get$1$1  reason: invalid class name */
    /* compiled from: PrefsRepo.kt */
    static final class AnonymousClass1 extends SuspendLambda implements q<e<? super a>, Throwable, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f13134a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f13135b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f13136c;

        public final Object invoke(e<? super a> eVar, Throwable th2, c<? super k> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(cVar);
            r02.f13135b = eVar;
            r02.f13136c = th2;
            return r02.invokeSuspend(k.f22762a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d11 = b.d();
            int i11 = this.f13134a;
            if (i11 == 0) {
                g.b(obj);
                e eVar = (e) this.f13135b;
                Throwable th2 = (Throwable) this.f13136c;
                if (th2 instanceof IOException) {
                    a a11 = b.a();
                    this.f13135b = null;
                    this.f13134a = 1;
                    if (eVar.emit(a11, this) == d11) {
                        return d11;
                    }
                } else {
                    throw th2;
                }
            } else if (i11 == 1) {
                g.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return k.f22762a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PrefsRepo$get$1(PrefsRepo prefsRepo, a.C0100a<T> aVar, c<? super PrefsRepo$get$1> cVar) {
        super(2, cVar);
        this.f13132b = prefsRepo;
        this.f13133c = aVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new PrefsRepo$get$1(this.f13132b, this.f13133c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super T> cVar) {
        return ((PrefsRepo$get$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f13131a;
        if (i11 == 0) {
            g.b(obj);
            kotlinx.coroutines.flow.d f11 = f.f(this.f13132b.f13122a.getData(), new AnonymousClass1((c<? super AnonymousClass1>) null));
            this.f13131a = 1;
            obj = f.u(f11, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a aVar = (a) obj;
        if (aVar == null) {
            return null;
        }
        return aVar.b(this.f13133c);
    }
}
