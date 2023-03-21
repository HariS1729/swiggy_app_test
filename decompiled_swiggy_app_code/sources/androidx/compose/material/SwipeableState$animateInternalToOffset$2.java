package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import bp0.g;
import bp0.k;
import defpackage.v1;
import defpackage.y1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Ref$FloatRef;
import lp0.l;
import lp0.p;

@d(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", l = {223}, m = "invokeSuspend")
/* compiled from: Swipeable.kt */
final class SwipeableState$animateInternalToOffset$2 extends SuspendLambda implements p<y1.h, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f5520a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f5521b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f5522c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f5523d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ v1.g<Float> f5524e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableState$animateInternalToOffset$2(SwipeableState<T> swipeableState, float f11, v1.g<Float> gVar, c<? super SwipeableState$animateInternalToOffset$2> cVar) {
        super(2, cVar);
        this.f5522c = swipeableState;
        this.f5523d = f11;
        this.f5524e = gVar;
    }

    /* renamed from: a */
    public final Object invoke(y1.h hVar, c<? super k> cVar) {
        return ((SwipeableState$animateInternalToOffset$2) create(hVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$2 = new SwipeableState$animateInternalToOffset$2(this.f5522c, this.f5523d, this.f5524e, cVar);
        swipeableState$animateInternalToOffset$2.f5521b = obj;
        return swipeableState$animateInternalToOffset$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f5520a;
        if (i11 == 0) {
            g.b(obj);
            final y1.h hVar = (y1.h) this.f5521b;
            final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            ref$FloatRef.f25663a = ((Number) this.f5522c.f5500g.getValue()).floatValue();
            this.f5522c.f5501h.setValue(a.c(this.f5523d));
            this.f5522c.A(true);
            Animatable b11 = v1.b.b(ref$FloatRef.f25663a, 0.0f, 2, (Object) null);
            Float c11 = a.c(this.f5523d);
            v1.g<Float> gVar = this.f5524e;
            AnonymousClass1 r82 = new l<Animatable<Float, v1.k>, k>() {
                public final void a(Animatable<Float, v1.k> animatable) {
                    kotlin.jvm.internal.p.j(animatable, "$this$animateTo");
                    hVar.a(animatable.o().floatValue() - ref$FloatRef.f25663a);
                    ref$FloatRef.f25663a = animatable.o().floatValue();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((Animatable) obj);
                    return k.f22762a;
                }
            };
            this.f5520a = 1;
            if (Animatable.f(b11, c11, gVar, (Object) null, r82, this, 4, (Object) null) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            try {
                g.b(obj);
            } catch (Throwable th2) {
                this.f5522c.f5501h.setValue(null);
                this.f5522c.A(false);
                throw th2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f5522c.f5501h.setValue(null);
        this.f5522c.A(false);
        return k.f22762a;
    }
}
