package androidx.compose.foundation.lazy;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import lp0.l;
import lp0.p;
import wp0.j0;
import wp0.k1;

/* compiled from: LazySemantics.kt */
final class LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1 extends Lambda implements l<Integer, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LazyListState f4086a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j0 f4087b;

    @d(c = "androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1$2", f = "LazySemantics.kt", l = {111}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1$2  reason: invalid class name */
    /* compiled from: LazySemantics.kt */
    static final class AnonymousClass2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f4088a;

        public final c<k> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(lazyListState, i11, cVar);
        }

        public final Object invoke(j0 j0Var, c<? super k> cVar) {
            return ((AnonymousClass2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d11 = b.d();
            int i11 = this.f4088a;
            if (i11 == 0) {
                g.b(obj);
                LazyListState lazyListState = lazyListState;
                int i12 = i11;
                this.f4088a = 1;
                if (LazyListState.v(lazyListState, i12, 0, this, 2, (Object) null) == d11) {
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
    LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1(LazyListState lazyListState, j0 j0Var) {
        super(1);
        this.f4086a = lazyListState;
        this.f4087b = j0Var;
    }

    public final Boolean a(final int i11) {
        boolean z11 = i11 >= 0 && i11 < this.f4086a.l().b();
        final LazyListState lazyListState = this.f4086a;
        if (z11) {
            k1 unused = j.d(this.f4087b, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2((c<? super AnonymousClass2>) null), 3, (Object) null);
            return Boolean.TRUE;
        }
        throw new IllegalArgumentException(("Can't scroll to index " + i11 + ", it is out of bounds [0, " + lazyListState.l().b() + ')').toString());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).intValue());
    }
}
