package androidx.compose.foundation.relocation;

import bp0.g;
import bp0.k;
import fp0.c;
import i1.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineStart;
import lp0.p;
import t0.h;
import wp0.j0;
import wp0.k1;
import y.b;
import y.e;

@d(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2", f = "BringIntoViewResponder.kt", l = {272}, m = "invokeSuspend")
/* compiled from: BringIntoViewResponder.kt */
final class BringIntoViewResponderModifier$dispatchRequest$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4166a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f4167b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BringIntoViewResponderModifier f4168c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ h f4169d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ m f4170e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ h f4171f;

    @d(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2$1", f = "BringIntoViewResponder.kt", l = {267}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2$1  reason: invalid class name */
    /* compiled from: BringIntoViewResponder.kt */
    static final class AnonymousClass1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f4172a;

        public final c<k> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(bringIntoViewResponderModifier, hVar, cVar);
        }

        public final Object invoke(j0 j0Var, c<? super k> cVar) {
            return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d11 = b.d();
            int i11 = this.f4172a;
            if (i11 == 0) {
                g.b(obj);
                e k = bringIntoViewResponderModifier.k();
                h hVar = hVar;
                this.f4172a = 1;
                if (k.c(hVar, this) == d11) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BringIntoViewResponderModifier$dispatchRequest$2(BringIntoViewResponderModifier bringIntoViewResponderModifier, h hVar, m mVar, h hVar2, c<? super BringIntoViewResponderModifier$dispatchRequest$2> cVar) {
        super(2, cVar);
        this.f4168c = bringIntoViewResponderModifier;
        this.f4169d = hVar;
        this.f4170e = mVar;
        this.f4171f = hVar2;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        BringIntoViewResponderModifier$dispatchRequest$2 bringIntoViewResponderModifier$dispatchRequest$2 = new BringIntoViewResponderModifier$dispatchRequest$2(this.f4168c, this.f4169d, this.f4170e, this.f4171f, cVar);
        bringIntoViewResponderModifier$dispatchRequest$2.f4167b = obj;
        return bringIntoViewResponderModifier$dispatchRequest$2;
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((BringIntoViewResponderModifier$dispatchRequest$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4166a;
        if (i11 == 0) {
            g.b(obj);
            final BringIntoViewResponderModifier bringIntoViewResponderModifier = this.f4168c;
            final h hVar = this.f4171f;
            k1 unused = j.d((j0) this.f4167b, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 3, (Object) null);
            b d12 = this.f4168c.d();
            h hVar2 = this.f4169d;
            m mVar = this.f4170e;
            this.f4166a = 1;
            if (d12.a(hVar2, mVar, this) == d11) {
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
