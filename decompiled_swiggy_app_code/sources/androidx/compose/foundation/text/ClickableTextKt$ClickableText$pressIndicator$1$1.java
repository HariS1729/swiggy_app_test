package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import bp0.g;
import bp0.k;
import e0.h0;
import f1.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;
import lp0.p;
import lp0.q;
import p1.y;
import t0.f;

@d(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1", f = "ClickableText.kt", l = {76}, m = "invokeSuspend")
/* compiled from: ClickableText.kt */
final class ClickableTextKt$ClickableText$pressIndicator$1$1 extends SuspendLambda implements p<d0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4307a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f4308b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h0<y> f4309c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l<Integer, k> f4310d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableTextKt$ClickableText$pressIndicator$1$1(h0<y> h0Var, l<? super Integer, k> lVar, c<? super ClickableTextKt$ClickableText$pressIndicator$1$1> cVar) {
        super(2, cVar);
        this.f4309c = h0Var;
        this.f4310d = lVar;
    }

    /* renamed from: a */
    public final Object invoke(d0 d0Var, c<? super k> cVar) {
        return ((ClickableTextKt$ClickableText$pressIndicator$1$1) create(d0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        ClickableTextKt$ClickableText$pressIndicator$1$1 clickableTextKt$ClickableText$pressIndicator$1$1 = new ClickableTextKt$ClickableText$pressIndicator$1$1(this.f4309c, this.f4310d, cVar);
        clickableTextKt$ClickableText$pressIndicator$1$1.f4308b = obj;
        return clickableTextKt$ClickableText$pressIndicator$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4307a;
        if (i11 == 0) {
            g.b(obj);
            final h0<y> h0Var = this.f4309c;
            final l<Integer, k> lVar = this.f4310d;
            AnonymousClass1 r72 = new l<f, k>() {
                public final void a(long j) {
                    y value = h0Var.getValue();
                    if (value != null) {
                        lVar.invoke(Integer.valueOf(value.w(j)));
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((f) obj).u());
                    return k.f22762a;
                }
            };
            this.f4307a = 1;
            if (TapGestureDetectorKt.k((d0) this.f4308b, (l) null, (l) null, (q) null, r72, this, 7, (Object) null) == d11) {
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
