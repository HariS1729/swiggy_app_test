package androidx.compose.foundation.lazy;

import bp0.g;
import bp0.k;
import e0.h0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;
import rp0.f;
import wp0.j0;

@d(c = "androidx.compose.foundation.lazy.LazyListItemProviderImplKt$rememberItemProvider$1", f = "LazyListItemProviderImpl.kt", l = {54}, m = "invokeSuspend")
/* compiled from: LazyListItemProviderImpl.kt */
final class LazyListItemProviderImplKt$rememberItemProvider$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3976a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LazyListState f3977b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h0<f> f3978c;

    /* compiled from: LazyListItemProviderImpl.kt */
    static final class a implements e<f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0<f> f3980a;

        a(h0<f> h0Var) {
            this.f3980a = h0Var;
        }

        /* renamed from: a */
        public final Object emit(f fVar, c<? super k> cVar) {
            this.f3980a.setValue(fVar);
            return k.f22762a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListItemProviderImplKt$rememberItemProvider$1(LazyListState lazyListState, h0<f> h0Var, c<? super LazyListItemProviderImplKt$rememberItemProvider$1> cVar) {
        super(2, cVar);
        this.f3977b = lazyListState;
        this.f3978c = h0Var;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new LazyListItemProviderImplKt$rememberItemProvider$1(this.f3977b, this.f3978c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((LazyListItemProviderImplKt$rememberItemProvider$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f3976a;
        if (i11 == 0) {
            g.b(obj);
            final LazyListState lazyListState = this.f3977b;
            kotlinx.coroutines.flow.d n = androidx.compose.runtime.g.n(new lp0.a<f>() {
                /* renamed from: a */
                public final f invoke() {
                    return LazyListItemProviderImplKt.b(lazyListState.i());
                }
            });
            a aVar = new a(this.f3978c);
            this.f3976a = 1;
            if (n.collect(aVar, this) == d11) {
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
