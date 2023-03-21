package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import bp0.g;
import bp0.k;
import defpackage.v1;
import defpackage.y1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Ref$FloatRef;
import lp0.p;

@d(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend")
/* compiled from: ScrollExtensions.kt */
final class ScrollExtensionsKt$animateScrollBy$2 extends SuspendLambda implements p<y1.p, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3464a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f3465b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f3466c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ v1.g<Float> f3467d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Ref$FloatRef f3468e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollExtensionsKt$animateScrollBy$2(float f11, v1.g<Float> gVar, Ref$FloatRef ref$FloatRef, c<? super ScrollExtensionsKt$animateScrollBy$2> cVar) {
        super(2, cVar);
        this.f3466c = f11;
        this.f3467d = gVar;
        this.f3468e = ref$FloatRef;
    }

    /* renamed from: a */
    public final Object invoke(y1.p pVar, c<? super k> cVar) {
        return ((ScrollExtensionsKt$animateScrollBy$2) create(pVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.f3466c, this.f3467d, this.f3468e, cVar);
        scrollExtensionsKt$animateScrollBy$2.f3465b = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f3464a;
        if (i11 == 0) {
            g.b(obj);
            final y1.p pVar = (y1.p) this.f3465b;
            float f11 = this.f3466c;
            v1.g<Float> gVar = this.f3467d;
            final Ref$FloatRef ref$FloatRef = this.f3468e;
            AnonymousClass1 r72 = new p<Float, Float, k>() {
                public final void a(float f11, float f12) {
                    Ref$FloatRef ref$FloatRef = ref$FloatRef;
                    float f13 = ref$FloatRef.f25663a;
                    ref$FloatRef.f25663a = f13 + pVar.a(f11 - f13);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    return k.f22762a;
                }
            };
            this.f3464a = 1;
            if (SuspendAnimationKt.e(0.0f, f11, 0.0f, gVar, r72, this, 4, (Object) null) == d11) {
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
