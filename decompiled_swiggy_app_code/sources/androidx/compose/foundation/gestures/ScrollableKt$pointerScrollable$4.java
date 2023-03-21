package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import bp0.g;
import bp0.k;
import e0.d1;
import e0.h0;
import fp0.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineStart;
import lp0.p;
import lp0.q;
import wp0.j0;
import wp0.k1;

@d(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$4", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
/* compiled from: Scrollable.kt */
final class ScrollableKt$pointerScrollable$4 extends SuspendLambda implements q<j0, Float, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3495a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ float f3496b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h0<NestedScrollDispatcher> f3497c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ d1<ScrollingLogic> f3498d;

    @d(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$4$1", f = "Scrollable.kt", l = {258}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$4$1  reason: invalid class name */
    /* compiled from: Scrollable.kt */
    static final class AnonymousClass1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f3499a;

        public final c<k> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(d1Var, f11, cVar);
        }

        public final Object invoke(j0 j0Var, c<? super k> cVar) {
            return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d11 = b.d();
            int i11 = this.f3499a;
            if (i11 == 0) {
                g.b(obj);
                float f11 = f11;
                this.f3499a = 1;
                if (d1Var.getValue().e(f11, this) == d11) {
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
    ScrollableKt$pointerScrollable$4(h0<NestedScrollDispatcher> h0Var, d1<ScrollingLogic> d1Var, c<? super ScrollableKt$pointerScrollable$4> cVar) {
        super(3, cVar);
        this.f3497c = h0Var;
        this.f3498d = d1Var;
    }

    public final Object a(j0 j0Var, float f11, c<? super k> cVar) {
        ScrollableKt$pointerScrollable$4 scrollableKt$pointerScrollable$4 = new ScrollableKt$pointerScrollable$4(this.f3497c, this.f3498d, cVar);
        scrollableKt$pointerScrollable$4.f3496b = f11;
        return scrollableKt$pointerScrollable$4.invokeSuspend(k.f22762a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((j0) obj, ((Number) obj2).floatValue(), (c) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f3495a == 0) {
            g.b(obj);
            final float f11 = this.f3496b;
            j0 e11 = this.f3497c.getValue().e();
            final d1<ScrollingLogic> d1Var = this.f3498d;
            k1 unused2 = j.d(e11, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 3, (Object) null);
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
