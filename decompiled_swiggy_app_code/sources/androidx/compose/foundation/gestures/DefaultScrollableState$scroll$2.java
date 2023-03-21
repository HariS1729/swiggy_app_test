package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import bp0.g;
import bp0.k;
import defpackage.y1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {147}, m = "invokeSuspend")
/* compiled from: ScrollableState.kt */
final class DefaultScrollableState$scroll$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3228a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DefaultScrollableState f3229b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MutatePriority f3230c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<y1.p, c<? super k>, Object> f3231d;

    @d(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {150}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1  reason: invalid class name */
    /* compiled from: ScrollableState.kt */
    static final class AnonymousClass1 extends SuspendLambda implements p<y1.p, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f3232a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f3233b;

        /* renamed from: a */
        public final Object invoke(y1.p pVar, c<? super k> cVar) {
            return ((AnonymousClass1) create(pVar, cVar)).invokeSuspend(k.f22762a);
        }

        public final c<k> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(defaultScrollableState, pVar, cVar);
            r02.f3233b = obj;
            return r02;
        }

        public final Object invokeSuspend(Object obj) {
            Object d11 = b.d();
            int i11 = this.f3232a;
            if (i11 == 0) {
                g.b(obj);
                y1.p pVar = (y1.p) this.f3233b;
                defaultScrollableState.f3226d.setValue(a.a(true));
                p<y1.p, c<? super k>, Object> pVar2 = pVar;
                this.f3232a = 1;
                if (pVar2.invoke(pVar, this) == d11) {
                    return d11;
                }
            } else if (i11 == 1) {
                try {
                    g.b(obj);
                } catch (Throwable th2) {
                    defaultScrollableState.f3226d.setValue(a.a(false));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultScrollableState.f3226d.setValue(a.a(false));
            return k.f22762a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultScrollableState$scroll$2(DefaultScrollableState defaultScrollableState, MutatePriority mutatePriority, p<? super y1.p, ? super c<? super k>, ? extends Object> pVar, c<? super DefaultScrollableState$scroll$2> cVar) {
        super(2, cVar);
        this.f3229b = defaultScrollableState;
        this.f3230c = mutatePriority;
        this.f3231d = pVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new DefaultScrollableState$scroll$2(this.f3229b, this.f3230c, this.f3231d, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((DefaultScrollableState$scroll$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f3228a;
        if (i11 == 0) {
            g.b(obj);
            MutatorMutex d12 = this.f3229b.f3225c;
            y1.p e11 = this.f3229b.f3224b;
            MutatePriority mutatePriority = this.f3230c;
            final DefaultScrollableState defaultScrollableState = this.f3229b;
            final p<y1.p, c<? super k>, Object> pVar = this.f3231d;
            AnonymousClass1 r42 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.f3228a = 1;
            if (d12.f(e11, mutatePriority, r42, this) == d11) {
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
