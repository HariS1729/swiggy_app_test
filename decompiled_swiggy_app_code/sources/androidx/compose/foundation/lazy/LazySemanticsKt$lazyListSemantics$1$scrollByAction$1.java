package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import bp0.g;
import bp0.k;
import defpackage.v1;
import fp0.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import lp0.p;
import wp0.j0;
import wp0.k1;

/* compiled from: LazySemantics.kt */
final class LazySemanticsKt$lazyListSemantics$1$scrollByAction$1 extends Lambda implements p<Float, Float, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f4080a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j0 f4081b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LazyListState f4082c;

    @d(c = "androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollByAction$1$1", f = "LazySemantics.kt", l = {95}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollByAction$1$1  reason: invalid class name */
    /* compiled from: LazySemantics.kt */
    static final class AnonymousClass1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f4083a;

        public final c<k> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(lazyListState, f11, cVar);
        }

        public final Object invoke(j0 j0Var, c<? super k> cVar) {
            return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d11 = b.d();
            int i11 = this.f4083a;
            if (i11 == 0) {
                g.b(obj);
                LazyListState lazyListState = lazyListState;
                float f11 = f11;
                this.f4083a = 1;
                if (ScrollExtensionsKt.b(lazyListState, f11, (v1.g) null, this, 2, (Object) null) == d11) {
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
    LazySemanticsKt$lazyListSemantics$1$scrollByAction$1(boolean z11, j0 j0Var, LazyListState lazyListState) {
        super(2);
        this.f4080a = z11;
        this.f4081b = j0Var;
        this.f4082c = lazyListState;
    }

    public final Boolean a(final float f11, float f12) {
        if (this.f4080a) {
            f11 = f12;
        }
        j0 j0Var = this.f4081b;
        final LazyListState lazyListState = this.f4082c;
        k1 unused = j.d(j0Var, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 3, (Object) null);
        return Boolean.TRUE;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
    }
}
