package androidx.compose.foundation.text;

import a0.o;
import bp0.g;
import bp0.k;
import f1.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.foundation.text.TextController$update$2", f = "CoreText.kt", l = {191}, m = "invokeSuspend")
/* compiled from: CoreText.kt */
final class TextController$update$2 extends SuspendLambda implements p<d0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4519a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f4520b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextController f4521c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextController$update$2(TextController textController, c<? super TextController$update$2> cVar) {
        super(2, cVar);
        this.f4521c = textController;
    }

    /* renamed from: a */
    public final Object invoke(d0 d0Var, c<? super k> cVar) {
        return ((TextController$update$2) create(d0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        TextController$update$2 textController$update$2 = new TextController$update$2(this.f4521c, cVar);
        textController$update$2.f4520b = obj;
        return textController$update$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4519a;
        if (i11 == 0) {
            g.b(obj);
            o h11 = this.f4521c.h();
            this.f4519a = 1;
            if (LongPressTextDragObserverKt.d((d0) this.f4520b, h11, this) == d11) {
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
