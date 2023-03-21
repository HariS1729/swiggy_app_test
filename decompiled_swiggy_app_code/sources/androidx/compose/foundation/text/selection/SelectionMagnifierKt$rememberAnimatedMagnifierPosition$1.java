package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import bp0.g;
import bp0.k;
import defpackage.v1;
import e0.d1;
import fp0.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.e;
import lp0.a;
import lp0.p;
import t0.f;
import wp0.j0;
import wp0.k1;

@d(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", l = {88}, m = "invokeSuspend")
/* compiled from: SelectionMagnifier.kt */
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4719a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f4720b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d1<f> f4721c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Animatable<f, v1.l> f4722d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(d1<f> d1Var, Animatable<f, v1.l> animatable, c<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1> cVar) {
        super(2, cVar);
        this.f4721c = d1Var;
        this.f4722d = animatable;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(this.f4721c, this.f4722d, cVar);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1.f4720b = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1;
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4719a;
        if (i11 == 0) {
            g.b(obj);
            final j0 j0Var = (j0) this.f4720b;
            final d1<f> d1Var = this.f4721c;
            kotlinx.coroutines.flow.d n = androidx.compose.runtime.g.n(new a<f>() {
                public final long a() {
                    return SelectionMagnifierKt.g(d1Var);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    return f.d(a());
                }
            });
            final Animatable<f, v1.l> animatable = this.f4722d;
            AnonymousClass2 r32 = new e<f>() {
                public final Object a(long j, c<? super k> cVar) {
                    if (t0.g.c(animatable.o().u()) && t0.g.c(j)) {
                        if (!(f.n(animatable.o().u()) == f.n(j))) {
                            k1 d11 = j.d(j0Var, (CoroutineContext) null, (CoroutineStart) null, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2(animatable, j, (c<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2>) null), 3, (Object) null);
                            if (d11 == b.d()) {
                                return d11;
                            }
                            return k.f22762a;
                        }
                    }
                    Object v = animatable.v(f.d(j), cVar);
                    return v == b.d() ? v : k.f22762a;
                }

                public /* bridge */ /* synthetic */ Object emit(Object obj, c cVar) {
                    return a(((f) obj).u(), cVar);
                }
            };
            this.f4719a = 1;
            if (n.collect(r32, this) == d11) {
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
