package co.hyperverge.crashguard.data.repo;

import android.util.Log;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKt;
import b3.a;
import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "co.hyperverge.crashguard.data.repo.PrefsRepo$set$1", f = "PrefsRepo.kt", l = {63}, m = "invokeSuspend")
/* compiled from: PrefsRepo.kt */
final class PrefsRepo$set$1 extends SuspendLambda implements p<j0, c<? super a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f13137a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PrefsRepo f13138b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a.C0100a<T> f13139c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ T f13140d;

    @d(c = "co.hyperverge.crashguard.data.repo.PrefsRepo$set$1$1", f = "PrefsRepo.kt", l = {}, m = "invokeSuspend")
    /* renamed from: co.hyperverge.crashguard.data.repo.PrefsRepo$set$1$1  reason: invalid class name */
    /* compiled from: PrefsRepo.kt */
    static final class AnonymousClass1 extends SuspendLambda implements p<MutablePreferences, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f13141a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f13142b;

        /* renamed from: a */
        public final Object invoke(MutablePreferences mutablePreferences, c<? super k> cVar) {
            return ((AnonymousClass1) create(mutablePreferences, cVar)).invokeSuspend(k.f22762a);
        }

        public final c<k> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(aVar, t, cVar);
            r02.f13142b = obj;
            return r02;
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = b.d();
            if (this.f13141a == 0) {
                g.b(obj);
                ((MutablePreferences) this.f13142b).i(aVar, t);
                return k.f22762a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PrefsRepo$set$1(PrefsRepo prefsRepo, a.C0100a<T> aVar, T t, c<? super PrefsRepo$set$1> cVar) {
        super(2, cVar);
        this.f13138b = prefsRepo;
        this.f13139c = aVar;
        this.f13140d = t;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new PrefsRepo$set$1(this.f13138b, this.f13139c, this.f13140d, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super a> cVar) {
        return ((PrefsRepo$set$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f13137a;
        if (i11 == 0) {
            g.b(obj);
            String c11 = this.f13138b.f13123b;
            Log.i(c11, "set: key: " + this.f13139c.a() + ", value: " + this.f13140d);
            y2.c a11 = this.f13138b.f13122a;
            final a.C0100a<T> aVar = this.f13139c;
            final T t = this.f13140d;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.f13137a = 1;
            obj = PreferencesKt.a(a11, r12, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
