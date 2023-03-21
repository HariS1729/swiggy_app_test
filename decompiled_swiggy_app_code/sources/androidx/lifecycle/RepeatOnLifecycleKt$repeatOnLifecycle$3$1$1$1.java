package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import bp0.g;
import bp0.k;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.sync.c;
import lp0.p;
import wp0.j0;
import wp0.k0;
import wp0.k1;
import wp0.n;

/* compiled from: RepeatOnLifecycle.kt */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements o {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Lifecycle.Event f10669a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<k1> f10670b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j0 f10671c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Lifecycle.Event f10672d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ n<k> f10673e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ c f10674f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ p<j0, fp0.c<? super k>, Object> f10675g;

    @d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, 110}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1  reason: invalid class name */
    /* compiled from: RepeatOnLifecycle.kt */
    static final class AnonymousClass1 extends SuspendLambda implements p<j0, fp0.c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f10676a;

        /* renamed from: b  reason: collision with root package name */
        Object f10677b;

        /* renamed from: c  reason: collision with root package name */
        int f10678c;

        public final fp0.c<k> create(Object obj, fp0.c<?> cVar) {
            return new AnonymousClass1(cVar, pVar, cVar);
        }

        public final Object invoke(j0 j0Var, fp0.c<? super k> cVar) {
            return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
        }

        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            c cVar;
            c cVar2;
            p<j0, fp0.c<? super k>, Object> pVar;
            Object d11 = b.d();
            int i11 = this.f10678c;
            if (i11 == 0) {
                g.b(obj);
                cVar2 = cVar;
                pVar = pVar;
                this.f10676a = cVar2;
                this.f10677b = pVar;
                this.f10678c = 1;
                if (cVar2.a((Object) null, this) == d11) {
                    return d11;
                }
            } else if (i11 == 1) {
                pVar = (p) this.f10677b;
                g.b(obj);
                cVar2 = (c) this.f10676a;
            } else if (i11 == 2) {
                cVar = (c) this.f10676a;
                try {
                    g.b(obj);
                    k kVar = k.f22762a;
                    cVar.c((Object) null);
                    return kVar;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(pVar, (fp0.c<? super RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1>) null);
                this.f10676a = cVar2;
                this.f10677b = null;
                this.f10678c = 2;
                if (k0.e(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) == d11) {
                    return d11;
                }
                cVar = cVar2;
                k kVar2 = k.f22762a;
                cVar.c((Object) null);
                return kVar2;
            } catch (Throwable th4) {
                Throwable th5 = th4;
                cVar = cVar2;
                th2 = th5;
                cVar.c((Object) null);
                throw th2;
            }
        }
    }

    public final void b(r rVar, Lifecycle.Event event) {
        kotlin.jvm.internal.p.j(rVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.p.j(event, "event");
        if (event == this.f10669a) {
            Ref$ObjectRef<k1> ref$ObjectRef = this.f10670b;
            j0 j0Var = this.f10671c;
            final c cVar = this.f10674f;
            final p<j0, fp0.c<? super k>, Object> pVar = this.f10675g;
            ref$ObjectRef.f25666a = j.d(j0Var, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((fp0.c<? super AnonymousClass1>) null), 3, (Object) null);
            return;
        }
        if (event == this.f10672d) {
            k1 k1Var = (k1) this.f10670b.f25666a;
            if (k1Var != null) {
                k1.a.a(k1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f10670b.f25666a = null;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            n<k> nVar = this.f10673e;
            Result.a aVar = Result.f25582b;
            nVar.resumeWith(Result.b(k.f22762a));
        }
    }
}
