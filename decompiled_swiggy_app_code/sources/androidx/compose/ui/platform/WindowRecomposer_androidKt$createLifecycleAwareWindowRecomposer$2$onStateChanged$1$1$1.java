package androidx.compose.ui.platform;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {386}, m = "invokeSuspend")
/* compiled from: WindowRecomposer.android.kt */
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f7232a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r<Float> f7233b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ s0 f7234c;

    /* compiled from: WindowRecomposer.android.kt */
    static final class a implements e<Float> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s0 f7235a;

        a(s0 s0Var) {
            this.f7235a = s0Var;
        }

        public final Object a(float f11, c<? super k> cVar) {
            this.f7235a.c(f11);
            return k.f22762a;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, c cVar) {
            return a(((Number) obj).floatValue(), cVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(r<Float> rVar, s0 s0Var, c<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1> cVar) {
        super(2, cVar);
        this.f7233b = rVar;
        this.f7234c = s0Var;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(this.f7233b, this.f7234c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f7232a;
        if (i11 == 0) {
            g.b(obj);
            r<Float> rVar = this.f7233b;
            a aVar = new a(this.f7234c);
            this.f7232a = 1;
            if (rVar.collect(aVar, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            g.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
