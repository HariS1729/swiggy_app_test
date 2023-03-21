package androidx.compose.foundation.lazy;

import bp0.g;
import bp0.k;
import defpackage.y1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
/* compiled from: LazyListState.kt */
final class LazyListState$scrollToItem$2 extends SuspendLambda implements p<y1.p, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4063a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LazyListState f4064b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f4065c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f4066d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListState$scrollToItem$2(LazyListState lazyListState, int i11, int i12, c<? super LazyListState$scrollToItem$2> cVar) {
        super(2, cVar);
        this.f4064b = lazyListState;
        this.f4065c = i11;
        this.f4066d = i12;
    }

    /* renamed from: a */
    public final Object invoke(y1.p pVar, c<? super k> cVar) {
        return ((LazyListState$scrollToItem$2) create(pVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new LazyListState$scrollToItem$2(this.f4064b, this.f4065c, this.f4066d, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f4063a == 0) {
            g.b(obj);
            this.f4064b.A(this.f4065c, this.f4066d);
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
