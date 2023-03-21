package androidx.compose.foundation.text;

import androidx.compose.foundation.text.TextController;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import bp0.g;
import bp0.k;
import f1.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.foundation.text.TextController$update$3", f = "CoreText.kt", l = {282}, m = "invokeSuspend")
/* compiled from: CoreText.kt */
final class TextController$update$3 extends SuspendLambda implements p<d0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4522a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f4523b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextController.b f4524c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextController$update$3(TextController.b bVar, c<? super TextController$update$3> cVar) {
        super(2, cVar);
        this.f4524c = bVar;
    }

    /* renamed from: a */
    public final Object invoke(d0 d0Var, c<? super k> cVar) {
        return ((TextController$update$3) create(d0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        TextController$update$3 textController$update$3 = new TextController$update$3(this.f4524c, cVar);
        textController$update$3.f4523b = obj;
        return textController$update$3;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4522a;
        if (i11 == 0) {
            g.b(obj);
            TextController.b bVar = this.f4524c;
            this.f4522a = 1;
            if (TextSelectionMouseDetectorKt.c((d0) this.f4523b, bVar, this) == d11) {
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
